import java.io.*;
import java.util.ArrayList;

public class ScanFile {

	public ArrayList<String> flist = new ArrayList<String>();

	public ArrayList<String> listAll(String pathFile, int level, long sTime,
			long eTime) {
		File dir = new File(pathFile);
		File files[] = dir.listFiles();

		if (null == files) {
			return null;
		} else {
			for (File file : files) {
				//System.out.println(flist.size());
				if (file.isDirectory()) {
					listAll(file.getAbsolutePath(), ++level, sTime, eTime);
				} else {
					long getTime = file.lastModified();
					int n = isTimeRight(sTime, eTime);
					switch (n) {
					case 0:
						if (getTime >= 0) {
							if (file.exists()) {
								flist.add(file.getAbsolutePath());
							} else {
								System.out.println("The file is not exist!");
							}
						}
						break;
					case 1:
						if (getTime >= sTime) {
							if (file.exists()) {
								flist.add(file.getAbsolutePath());
							} else {
								System.out.println("The file is not exist!");
							}
						}
						break;
					case 2:
						if (getTime < eTime) {
							if (file.exists()) {
								flist.add(file.getAbsolutePath());
							} else {
								System.out.println("The file is not exist!");
							}
						}
						break;
					case 3:
						if (getTime >= sTime && getTime < eTime) {
							if (file.exists()) {
								flist.add(file.getAbsolutePath());
							} else {
								System.out.println("The file is not exist!");
							}
						}
						break;
					case 4:
						if (getTime >= sTime
								&& getTime <= ((int) ((sTime / 1000) * 1000) + 999)) {
							if (file.exists()) {
								flist.add(file.getAbsolutePath());
							} else {
								System.out.println("The file is not exist!");
							}
						}
						break;
					default:
						System.out.println("Time is wrong!");
						break;
					}
				}
			}
			return flist;
		}
	}

	/**
	 * 
	 * @param sTime
	 *            开始时间
	 * @param eTime
	 *            结束时间
	 * @return 0：没有时间限制 1：晚于开始时间 2：早于结束时间 3：晚于开始时间且早于结束时间
	 */
	public int isTimeRight(long sTime, long eTime) {

		if (sTime == 0 && eTime == 0)
			return 0;
		else if (sTime > 0 && eTime == 0)
			return 1;
		else if (sTime == 0 && eTime > 0)
			return 2;
		else if (sTime > 0 && eTime > 0 && eTime > sTime)
			return 3;
		else if (sTime == eTime)
			return 4;
		else
			return -1;
	}
}
