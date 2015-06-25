import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;

public class DoZip {
	
	public static void doZip(ZipOutputStream zipout, File f, String base) {
		System.out.println("Begin Zip:" + f.getAbsolutePath());
		if (f.isDirectory()) {
			File[] fl = f.listFiles();
			if (base != null) {
				try {
					zipout.putNextEntry(new ZipEntry(base + "/"));
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			base = base == null ? "" : base + "/";
			for (int i = 0; i < fl.length; i++) {
				doZip(zipout, fl[i], base + fl[i].getName());
			}
		} else {
			try {
				zipout.putNextEntry(new ZipEntry(base));
				FileInputStream in = new FileInputStream(f);
				int b;
				while ((b = in.read()) != -1)
					zipout.write(b);
				in.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}	

	public static boolean unZip(String srcFile, String dest, boolean deleteFile) {
		try {
			File file = new File(srcFile);
			if (!file.exists()) {
				// throw new RuntimeException("解压文件不存在!");
				return false;
			}
			ZipFile zipFile = new ZipFile(file);
			Enumeration e = zipFile.entries();
			while (e.hasMoreElements()) {
				ZipEntry zipEntry = (ZipEntry) e.nextElement();
				if (zipEntry.isDirectory()) {
					String name = zipEntry.getName();
					name = name.substring(0, name.length() - 1);
					File f = new File(dest + name);
					f.mkdirs();
				} else {
					File f = new File(dest + zipEntry.getName());
					f.getParentFile().mkdirs();
					f.createNewFile();
					InputStream is = zipFile.getInputStream(zipEntry);
					FileOutputStream fos = new FileOutputStream(f);
					int length = 0;
					byte[] b = new byte[1024];
					while ((length = is.read(b, 0, 1024)) != -1) {
						fos.write(b, 0, length);
					}
					is.close();
					fos.close();
				}
			}

			if (zipFile != null) {
				zipFile.close();
			}

			if (deleteFile) {
				file.deleteOnExit();
			}

			return true;
		} catch (IOException ex) {
			return false;
		}
	}

}
