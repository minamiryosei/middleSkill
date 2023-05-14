import java.util.Scanner;
import java.util.logging.Logger;
public class checkTest {
	//問7用
	private static final Logger LOGGER = Logger.getLogger(checkTest.class.getName());

	public static void main(String[] args) {
		//改行
		System.out.println("問１");
		//問1 リソースを開く(ファイル名)ショートカットキーは何ですか？
		//Ctrl + Shift + R

		//改行
		System.out.println("問２");
		//問2 リファクタリングをする時のショートカットキーは何ですか？
		//Shift + Alt + R

		//改行
		System.out.println("問３");
		//問3 デバッグを行う方法を簡潔に記載してください
		//eclipseでブレイクポイントを設置し、虫マークのデバックを押して起動させる

		//改行
		System.out.println("問４");
		//問4 Javaのバージョン8と11の違いを簡潔に答えてください

		//改行
		System.out.println("問５");
		//問5　Road博物館の入場料金は、一人1000円であるが、10人以上のチームなら一人820円、20人以上の団体なら一人700円である。人数を入力し、入場料の合計を計算するプログラムを作成せよ。(if文で上記文章を作ってください)
		int fee = 1000;
		int human = 20;

		if(human>=10) {
			fee = 820;

		}
		if(human>=20) {
			fee = 700;
		}
		int total = fee * human;
		System.out.println(total);


		//改行
		System.out.println("問６");
		//問6　コメントアウトされている箇所にどう言った処理が行われているか記載してください
		Scanner scn = new Scanner(System.in);
		int[] score = new int[5];
		int i, sum;
		double ave;

		//スキャナーで1回目〜5回目まで値を取得する処理
		for (i = 0; i < score.length; i++) {
			System.out.print("得点を入力してください = ");
			score[i] = scn.nextInt();
		}


		//score配列に入っている値をsum変数に加算している
		sum = 0;
		for (i = 0; i < score.length; i++) {
			sum += score[i];
		}

		//sumの値を配列の長さで割って小数点でaveに代入している
		ave = sum / (double)score.length;
		//平均を出力している
		System.out.println("平均値 = " + ave);

		//改行
		System.out.println("問７");
		//問7　ログ出力が行えるように下記コードを修正してください
//		String message = "Hello World!";
//		LOGGER.log(null, "The message is: " + message);

		//改行
		System.out.println("問８");
		//問8　問題：
		//入力された文字列を整数に変換し、その結果を出力するプログラムを作成してください。ただし、以下の場合には例外を発生させてください。(Scannerメソッドを使用すること)
		Scanner scanner = new Scanner(System.in);
		System.out.print("入力してください =");
		String input_text = scanner.nextLine();
		try {
			//1.入力された文字列がnullの場合（NullPointerExceptionが発生する）
			if (input_text == null) {
				throw new NullPointerException();

				//2.入力された文字列が空文字列の場合（Exceptionが発生する）
			}else if(input_text.isEmpty()) {
				throw new Exception();
			}
			//3.入力された文字列が整数に変換できない場合（NumberFormatExceptionが発生する）
			int number = Integer.parseInt(input_text);

		} catch (NullPointerException e) {
			System.out.println("NullPointerExceptionが発生しました: " + e.getMessage());
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatExceptionが発生しました: " + e.getMessage());
		} catch (Exception e) {
			System.out.println("Exceptionが発生しました: " + e.getMessage());
		}
		//改行
		System.out.println("問９");
		//問9 Java編終わった感想と改善点もしございましたらお願いします。
		//『ここに書いてね』
	}
}
