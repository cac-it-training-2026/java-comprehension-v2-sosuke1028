package q01_basic.question03;

class Member {
	String name;
	int age;
	int rank;

	public Member() {

	}

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
		System.out.println("***MEMBER DATA(" + getName() + ")***");
		System.out.println("name:" + getName());
		System.out.println("age:" + getAge());
		System.out.println("rank:" + getRank());
		System.out.println("*****************");
	}

	/**
	 * @param name
	 * @param age
	 * @param rank
	 */
	public Member(String name, int age, int rank) {
		this.name = name;
		this.age = age;
		this.rank = rank;
	}

}
