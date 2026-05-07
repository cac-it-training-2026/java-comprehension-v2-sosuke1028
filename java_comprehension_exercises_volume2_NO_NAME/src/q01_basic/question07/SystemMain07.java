package q01_basic.question07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain07 {

	public static void main(String[] args) throws IOException, NumberFormatException {

		try {
			NumberList numberList = new NumberList();
			System.out.println("1-任意の整数をListに代入します");
			System.out.print("input number>>");
			int limit = 0;
			//TODO ここから実装する
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String str = reader.readLine();
			limit = Integer.parseInt(str);
			numberList.addFromOneTo(limit);

			System.out.println("****************");
			System.out.println("Listの合計を計算します");
			int sum = numberList.calcSumOfList();
			//TODO ここから実装する

			numberList.calcSumOfList();
			System.out.println("1から" + limit + "までの合計は" + sum + "です。");

			System.out.println("****************");
			System.out.println("Listの各要素を2倍します");
			//TODO ここから実装する
			numberList.doubleListEachValue();

			System.out.println("****************");
			System.out.println("Listの前半分のインデックスの要素を削除します");
			//TODO ここから実装する
			numberList.removeIndexOfFirstHalf();
		} catch (NumberFormatException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

}
