package q01_basic.question05;

public class NonMember extends AbstMember {

	// 項目7: コンストラクタ
	public NonMember(String name) {
		this.name = name;
	}

	// 項目8: buyItem
	@Override
	public void buyItem() {
		System.out.println(this.name + "purchased the item at a fixed price");
	}

	// 項目9: showMember
	@Override
	public void showMember() {
		System.out.println("***NON MEMBER DATA***");
		System.out.println("name:" + name);
		System.out.println("*****************");
	}
}
