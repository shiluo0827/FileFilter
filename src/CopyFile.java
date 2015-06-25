import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;

public class CopyFile {
	public void copyFile(String oldPath, String newPath) {
		try {
			int bytesum = 0;
			int byteread = 0;
			File oldFile = new File(oldPath);
			File objFile = new File(newPath);
			if (oldFile.exists()) { // 文件存在时
				InputStream inStream = new FileInputStream(oldPath); // 读入原文件
				String objFilePath = objFile.toString().substring(0,objFile.toString().lastIndexOf("\\"));
				(new File(objFilePath)).mkdirs();
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[2048];
				while ((byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread; // 字节数 文件大小
					fs.write(buffer, 0, byteread);
				}
				System.out.println("复制的原始文件："+oldPath);
				System.out.println("复制的目标文件："+newPath);
				System.out.println("复制的字节数："+bytesum+"字节");
				inStream.close();
				fs.close();
				objFile.setLastModified(oldFile.lastModified());
			} else {
				System.out.println("原始文件不存在！");
			}
		} catch (Exception e) {
			System.out.println("复制单个文件操作出错");
			e.printStackTrace();
		}
	}

	public void copyFolder(String oldPath, String newPath) {
		try {
			(new File(newPath)).mkdirs(); // 如果文件夹不存在 则建立新文件夹
			File a = new File(oldPath);
			String[] file = a.list();
			File temp = null;
			for (int i = 0; i < file.length; i++) {
				if (oldPath.endsWith(File.separator)) {
					temp = new File(oldPath + file[i]);
				} else {
					temp = new File(oldPath + File.separator + file[i]);
				}
				if (temp.isFile()) {
					FileInputStream input = new FileInputStream(temp);
					FileOutputStream output = new FileOutputStream(newPath
							+ "/" + (temp.getName()).toString());
					byte[] b = new byte[1024 * 5];
					int len;
					while ((len = input.read(b)) != -1) {
						output.write(b, 0, len);
					}
					output.flush();
					output.close();
					input.close();
				}
				if (temp.isDirectory()) {// 如果是子文件夹
											// copyFolder(oldPath+"/"+file[i],newPath+"/"+file[i]);
											// } } } catch (Exception e) {
											// System.out.println("复制整个文件夹内容操作出错");
											// e.printStackTrace(); } }
				}
			}
		} catch (Exception e) {
			System.out.println("复制相同路径文件操作出错");
			e.printStackTrace();
		}
	}
}
