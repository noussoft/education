
public class Child implements Comparable<Child>{
	
	public Child(int height, int age, String name) {
		super();
		this.height = height;
		this.age = age;
		this.name = name;
	}
	private int height;
	private int age;
	private String name;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Child [height=" + height + ", age=" + age + ", name=" + name
				+ "]";
	}
	@Override
	public int compareTo(Child o) {
		return o.age - this.age;
	}
	

}
