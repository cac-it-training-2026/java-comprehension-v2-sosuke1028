package q01_basic.question04;

public class SystemMain04 {

	public static void main(String[] args) {

		Member member1 = new Member(1, "ppppp", "Miura Manabu", 28, 2);
		Member member2 = new Member(2, "aajjjjj", "Sato Takeshi", 43, 1);

		Member[] members = { member1, member2 };

		MemberManager.showAllMembers(members);

	}

}
