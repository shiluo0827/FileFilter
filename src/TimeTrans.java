import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

public class TimeTrans {

	private static Pattern p = Pattern
			.compile("^((\\d{2}(([02468][048])|([13579][26]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])))))|(\\d{2}(([02468][1235679])|([13579][01345789]))[\\-\\/\\s]?((((0?[13578])|(1[02]))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(3[01])))|(((0?[469])|(11))[\\-\\/\\s]?((0?[1-9])|([1-2][0-9])|(30)))|(0?2[\\-\\/\\s]?((0?[1-9])|(1[0-9])|(2[0-8]))))))(\\s(((0?[0-9])|([1-2][0-3]))\\:([0-5]?[0-9])((\\s)|(\\:([0-5]?[0-9])))))?$");

	public static boolean checkDateTime(String dt) {
		boolean t = p.matcher(dt).matches();
		return t;
	}

	public static String dateToString(Date data, String formatType) {
		return new SimpleDateFormat(formatType).format(data);
	}

	// long����ת��ΪString����
	// currentTimeҪת����long���͵�ʱ��
	// formatTypeҪת����string���͵�ʱ���ʽ
	public static String longToString(long currentTime, String formatType)
			throws ParseException {
		Date date = longToDate(currentTime, formatType); // long����ת��Date����
		String strTime = dateToString(date, formatType); // date����ת��String
		return strTime;
	}

	// string����ת��Ϊdate����
	// strTimeҪת����string���͵�ʱ�䣬formatTypeҪת���ĸ�ʽyyyy-MM-dd HH:mm:ss//yyyy��MM��dd��
	// HHʱmm��ss�룬
	// strTime��ʱ���ʽ����Ҫ��formatType��ʱ���ʽ��ͬ
	public static Date stringToDate(String strTime, String formatType)
			throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat(formatType);
		Date date = null;
		date = formatter.parse(strTime);
		return date;
	}

	// longת��ΪDate����
	// currentTimeҪת����long���͵�ʱ��
	// formatTypeҪת����ʱ���ʽyyyy-MM-dd HH:mm:ss//yyyy��MM��dd�� HHʱmm��ss��
	public static Date longToDate(long currentTime, String formatType)
			throws ParseException {
		Date dateOld = new Date(currentTime); // ����long���͵ĺ���������һ��date���͵�ʱ��
		String sDateTime = dateToString(dateOld, formatType); // ��date���͵�ʱ��ת��Ϊstring
		Date date = stringToDate(sDateTime, formatType); // ��String����ת��ΪDate����
		return date;
	}

	// string����ת��Ϊlong����
	// strTimeҪת����String���͵�ʱ��
	// formatTypeʱ���ʽ
	// strTime��ʱ���ʽ��formatType��ʱ���ʽ������ͬ
	public static long stringToLong(String strTime, String formatType)
			throws ParseException {
		Date date = stringToDate(strTime, formatType); // String����ת��date����
		if (date == null) {
			return 0;
		} else {
			long currentTime = dateToLong(date); // date����ת��long����
			return currentTime;
		}
	}

	// date����ת��Ϊlong����
	// dateҪת����date���͵�ʱ��
	public static long dateToLong(Date date) {
		return date.getTime();
	}

}
