import java.util.Arrays;

public class test1 {
	public static void main(String[] args) {
		//問１のメソッドを呼び出して出力してください（引数５と１０）
		int sumResult = sum(5, 10);
		System.out.println("問１: " + sumResult);

		//改行
		System.out.println("問２");
		//問２のメソッドを呼び出して出力してください（引数"しんぶんし"）
		boolean isPalindromeResult = isPalindrome("しんぶんし");
		System.out.println(isPalindromeResult);

		//改行
		System.out.println("問３");
		//問3のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		Integer[] arr1 = {5, 3, 1, 9, 4, 8};
		sortDescending(arr1);
		System.out.println(Arrays.toString(arr1));

		//改行
		System.out.println("問４");
		//問4のメソッドを呼び出して出力してください（引数,配列[5,3,1,9,4,8]）
		int[] arr2 = {5, 3, 1, 9, 4, 8};
		int minimumIndex = findMinimumIndex(arr2);
		System.out.println(minimumIndex);
	}

	public static int sum(int a, int b) {
		return a + b;
	}

	public static boolean isPalindrome(String str) {
		String reversedStr = new StringBuilder(str).reverse().toString();
		return str.equals(reversedStr);
	}

	public static void sortDescending(Integer[] arr) {
		Arrays.sort(arr, (a, b) -> b - a);
	}

	public static int findMinimumIndex(int[] arr) {
		int minIndex = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < arr[minIndex]) {
				minIndex = i;
			}
		}
		return minIndex;
	}
}
