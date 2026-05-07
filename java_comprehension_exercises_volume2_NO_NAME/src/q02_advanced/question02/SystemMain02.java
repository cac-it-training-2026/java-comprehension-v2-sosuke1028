package q02_advanced.question02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SystemMain02 {
	public static void main(String[] args) {
		// 19.1 ConsoleReader オブジェクトを生成 (MemberManagerはnewしない)
		ConsoleReader cr = new ConsoleReader();

		// 19.2 会員を2つ生成
		Member m1 = Member.getInstance(1, "ss2222", "MiuraNamabu", 26, 2);
		Member m2 = Member.getInstance(2, "ddhhdhdh", "SatoKensuke", 43, 1);

		List<Member> memberList = new ArrayList<>();
		memberList.add(m1);
		memberList.add(m2);

		// 19.3 現在の会員情報を出力
		System.out.println("--- 現在の会員情報 ---");
		MemberManager.showAllMembers(memberList);

		int targetId = 0;
		String newPass = "";

		try {
			// 19.4 入力処理
			System.out.print("パスワードを変更する会員IDを入力してください >> ");
			targetId = cr.inputNumber();

			System.out.print("新しいパスワードを入力してください >> ");
			newPass = cr.inputString();

		} catch (IOException | NumberFormatException e) {
			// 19.4.2.1 例外処理
			e.printStackTrace();
			return; // 処理を止める
		}

		// 19.5 パスワード変更
		MemberManager.updatePassword(memberList, targetId, newPass);

		// 19.6 更新後の情報出力
		System.out.println("\n--- 更新後の会員情報 ---");
		MemberManager.showAllMembers(memberList);
	}
}