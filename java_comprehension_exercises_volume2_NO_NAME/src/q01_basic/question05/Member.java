package q01_basic.question05;

public class Member extends AbstMember {

	private int id;
	private String password;
	private int age;
	private int rank;

	@Override
	public void buyItem() {
		System.out.println(this.name + " purchased the item at 50% off");
	}//親（抽象）を継承しているからこのnameにはthisをつける。
		//これによりnameが子であるクラスのものということがわｋる

	@Override
	public void showMember() {
		System.out.println("***MEMBERS DATA***");
		System.out.println("id:" + getId());
		System.out.println("password:" + getPassword());
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*****************");
	}

	public Member() {

	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id セットする id
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password セットする password
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
	@Override
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age セットする age
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @return rank
	 */
	public int getRank() {
		return rank;
	}

	/**
	 * @param rank セットする rank
	 */
	public void setRank(int rank) {
		this.rank = rank;
	}

	/**
	 * @param id
	 * @param password
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(int id, String password, String name, int age, int rank) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

	//public void showMember() {
	//	System.out.println("***MEMBERS DATA***");
	//	System.out.println("id:" + getId());
	//	System.out.println("password:" + getPassword());
	//	System.out.println("name:" + getName());
	//	System.out.println("age:" + getAge());
	//	System.out.println("rank:" + getRank());
	//	System.out.println("*****************");
	//}

}
