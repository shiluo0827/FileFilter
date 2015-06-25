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
			if (oldFile.exists()) { // �ļ�����ʱ
				InputStream inStream = new FileInputStream(oldPath); // ����ԭ�ļ�
				String objFilePath = objFile.toString().substring(0,objFile.toString().lastIndexOf("\\"));
				(new File(objFilePath)).mkdirs();
				FileOutputStream fs = new FileOutputStream(newPath);
				byte[] buffer = new byte[2048];
				while ((byteread = inStream.read(buffer)) != -1) {
					bytesum += byteread; // �ֽ��� �ļ���С
					fs.write(buffer, 0, byteread);
				}
				System.out.println("���Ƶ�ԭʼ�ļ���"+oldPath);
				System.out.println("���Ƶ�Ŀ���ļ���"+newPath);
				System.out.println("���Ƶ��ֽ�����"+bytesum+"�ֽ�");
				inStream.close();
				fs.close();
				objFile.setLastModified(oldFile.lastModified());
			} else {
				System.out.println("ԭʼ�ļ������ڣ�");
			}
		} catch (Exception e) {
			System.out.println("���Ƶ����ļ���������");
			e.printStackTrace();
		}
	}

	public void copyFolder(String oldPath, String newPath) {
		try {
			(new File(newPath)).mkdirs(); // ����ļ��в����� �������ļ���
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
				if (temp.isDirectory()) {// ��������ļ���
											// copyFolder(oldPath+"/"+file[i],newPath+"/"+file[i]);
											// } } } catch (Exception e) {
											// System.out.println("���������ļ������ݲ�������");
											// e.printStackTrace(); } }
				}
			}
		} catch (Exception e) {
			System.out.println("������ͬ·���ļ���������");
			e.printStackTrace();
		}
	}
}
