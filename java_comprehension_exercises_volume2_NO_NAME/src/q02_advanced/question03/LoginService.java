package q02_advanced.question03;

/**
 * MemberStorageにアクセスし、ログイン処理を行う
 */

import java.util.List;

public class LoginService {
	private List<Member> memberStorage;

	public LoginService(MemberStorage storage) {
		this.memberStorage = storage.getMembers();
	}

	public Member doLogin(int id, String password) {
		// passwordがnullの場合は即座に不合格（null）を返す
		if (password == null) {
			return null;
		}

		for (Member m : memberStorage) {
			// IDとパスワードの両方が一致するかチェック
			if (m.getId() == id && password.equals(m.getPassword())) {
				return m;
			}
		}
		return null;
	}
}