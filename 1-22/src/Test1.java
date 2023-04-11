import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test1 {
	public static void main(String[] args) {
		String shinyaBirthday = "1998/03/19";
		String minamiBirthday = "2000/02/14";
		String furuyamaBirthday = "1998/09/12";
		//改行
		System.out.println("問１");
		//問題1:現在の時刻を出力してください

		Date date = new Date();
		System.out.println(date);

		//改行
		System.out.println("問２");
		//問題2:shinyaBirthdayとminamiBirthdayを日付型に変更し条件式で誕生日を比較し早い方の日付を文字列型で出力しなさい。
		try {
			SimpleDateFormat sdFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date shinyaDate = sdFormat.parse(shinyaBirthday);
			Date minamiDate = sdFormat.parse(minamiBirthday);

			if(shinyaDate.before(minamiDate)) {
				String shinyaString = new SimpleDateFormat("yyyy/MM/dd").format(shinyaDate);
				System.out.println(shinyaString);
			}else {
				String minamiString = new SimpleDateFormat("yyyy/MM/dd").format(minamiDate);
				System.out.println(minamiString);
			}

		} catch (ParseException e) {
			e.printStackTrace();
		}


		//改行
		System.out.println("問３");
		//問題3:furuyamaBirthdayに５年2ヶ月追加した値を文字列型で表示しなさい
		try {
			SimpleDateFormat fuFormat = new SimpleDateFormat("yyyy/MM/dd");
			Date furuyamaDate = fuFormat.parse(furuyamaBirthday);
			Calendar calendar = Calendar.getInstance();

			calendar.setTime(furuyamaDate);
			calendar.add(Calendar.YEAR, 5);
			calendar.add(Calendar.MONTH, 2);

			date = calendar.getTime();

			String uruyamaString = new SimpleDateFormat("yyyy/MM/dd").format(date);
			System.out.println(uruyamaString);


		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}