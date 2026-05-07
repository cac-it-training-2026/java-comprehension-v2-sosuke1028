package q02_advanced.question03;

import java.util.List;

public class MemberManager {
	private MemberManager() {
	}

	public static void showAllMembers(List<Member> members) {
		for (Member m : members) {
			m.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String password) {
		for (Member m : members) {
			if (m.getId() == id) {
				m.setPassword(password);
				return;
			}
		}
	}
}
