package q02_advanced.question03;

import java.util.ArrayList;
import java.util.List;

public class MemberStorage {
	private List<Member> members = new ArrayList<>();

	public MemberStorage() {
		// テストケースが期待するデータに修正
		members.add(Member.getInstance(1, "Passw0rd", "Miura Manabu", 25, 1));
		members.add(Member.getInstance(2, "Passw02", "Sato Kensuke", 30, 2));
		members.add(Member.getInstance(3, "Passw03", "Goto Aya", 22, 3));
	}

	public List<Member> getMembers() {
		return members;
	}
}