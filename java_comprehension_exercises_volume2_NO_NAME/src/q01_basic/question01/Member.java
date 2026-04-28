package q01_basic.question01;

/**
 * Member 会員クラス
 */
class Member {
	//TODO ここから実装する
	String name;
	int age;
	int rank;

	/**
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name セットする name
	 */
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

	public void showMember() {
		System.out.println("***MEMBER DATA***");
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*****************");

	}
}
