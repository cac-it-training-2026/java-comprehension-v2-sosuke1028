package q02_advanced.question02;

import java.util.List;

class MemberManager {

	private MemberManager() {

	}

	public static void showAllMembers(List<Member> members) {
		// 1件ずつ Member オブジェクトを取り出す
		for (Member member : members) {

			member.showMember();
		}
	}

	public static void updatePassword(List<Member> members, int id, String newPassword) {

		for (Member member : members) {
			if (member.getId() == id) {
				// 14.2 一致するデータが存在した場合、新しいパスワードを代入
				member.setPassword(newPassword);

				System.out.println("ID: " + id + " のパスワードを更新しました。");

				return;
			}
		}

		// ループが終わっても見つからなかった場合（任意）
		System.out.println("ID: " + id + " 該当者は見つかりませんでした。");
	}

}
