package q01_basic.question05;

public class MemberManager {

	/**
	 * インスタンス化の禁止
	 */
	private MemberManager() {
	}

	//TODO showAllMembersメソッドを実装する

	public static void showAllMembers(AbstMember[] members) {
		for (AbstMember m : members) {
			m.showMember(); // 自動で Member用 か NonMember用 が選ばれる
		}
	}

}
