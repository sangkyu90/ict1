package conception;

public class Person1 {
	private String name;
	private int age;
	private String address; // person class 에는 접근은 가능 하지만

	// 직접접근이 불가능 하므로 메모리값을 바꾸려고//접근 가능한 method제공하려고
	public void setName(String name) {// Excutor p.setName("eunwoo");=(string name)을 받아서 밑에 name=>this.name=>private
										// String name
		this.name = name;
	}

	public void getAge(int age) {
		this.age = age;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getName1() {
		return this.name;
	}

	/*
	 * public String toString() { String str =
	 * "내이름은 :"+this.name+" age : "+this.age+" address : "+this.address; return str;
	 * //바뀐값으로 }
	 */

}
