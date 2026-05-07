package q01_basic.question05;

public class SystemMain05 {

	public static void main(String[] args) {
		AbstMember[] members = new AbstMember[2];

		// 12.1 NonMember生成
		members[0] = new NonMember("Sato Kensuke");

		// 12.2 Member生成
		members[1] = new Member(1, "Passw0rd", "Miura Manabu", 28, 2);

		// 12.3 全員表示
		System.out.println("---SHOW MEMBERS---");
		MemberManager.showAllMembers(members);

		// 12.4 購入メソッド呼び出し
		System.out.println("---BUY ITEM---");
		for (AbstMember m : members) {
			m.buyItem();
		}
	}
}