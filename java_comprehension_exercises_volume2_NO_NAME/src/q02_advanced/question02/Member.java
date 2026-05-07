package q02_advanced.question02;

import java.util.ArrayList;
import java.util.List;

public class Member {
	private int id;
	private String password;
	private String name;
	private int age;
	private int rank;
	private List<Coupon> coupons;

	// テストケース2用：new Member() で coupons が null になるようにする
	public Member() {
	}

	// テストケース3用：引数5つで coupons が空の ArrayList になるようにする
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = new ArrayList<>();
	}

	// 内部用・getInstance用：引数6つ
	public Member(int id, String password, String name, int age, int rank, List<Coupon> coupons) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
		this.coupons = coupons;
	}

	// テストケース1用：getInstance
	public static Member getInstance(int id, String password, String name, int age, int rank) {
		List<Coupon> initialCoupons = new ArrayList<>();
		// テストコードの期待値と一文字一句合わせる
		initialCoupons.add(Coupon.getInstance(1, 0.5, "最初の特典"));
		initialCoupons.add(Coupon.getInstance(2, 0.25, "今月の特典"));

		return new Member(id, password, name, age, rank, initialCoupons);
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", name=" + name + ", age=" + age + ", rank=" + rank
				+ ", coupons=" + coupons + "]";
	}

	public void showMember() {
		System.out.println(this.toString());
	}

	// 全ての Getter / Setter (テストが値を読み取るために必須)
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getRank() {
		return rank;
	}

	public void setRank(int rank) {
		this.rank = rank;
	}

	public List<Coupon> getCoupons() {
		return coupons;
	}

	public void setCoupons(List<Coupon> coupons) {
		this.coupons = coupons;
	}
}