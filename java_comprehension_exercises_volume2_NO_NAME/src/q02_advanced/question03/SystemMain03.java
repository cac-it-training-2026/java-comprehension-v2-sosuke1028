package q02_advanced.question03;

import java.io.IOException;

public class SystemMain03 {
	public static void main(String[] args) {
		ConsoleReader cr = new ConsoleReader();
		MemberStorage storage = new MemberStorage();
		LoginService loginService = new LoginService(storage);
		Member loginUser = null;

		while (loginUser == null) {
			try {
				System.out.print("会員IDを入力してください >> ");
				int id = cr.inputNumber();

				System.out.print("パスワードを入力してください >> ");
				String password = cr.inputString();

				loginUser = loginService.doLogin(id, password);

				if (loginUser == null) {
					System.out.println("ID またはパスワードが違っています。再度入力してください。");
				} else {
					System.out.println("ログインに成功しました");
				}

			} catch (NumberFormatException e) {
				System.out.println("会員IDは数値で入力してください。");
			} catch (IOException e) {
				e.printStackTrace();
				return;
			}
		}

		System.out.println("\n--- ログインユーザー情報 ---");
		loginUser.showMember();
	}
}