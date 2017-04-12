import java.util.Arrays;


public class TestComparable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Child[] kinders = new Child[5];
		
		kinders[0] = new Child(140, 8, "John");
		kinders[1] = new Child(145, 9, "Maria");
		kinders[2] = new Child(150, 7, "Ivan");
		kinders[3] = new Child(147, 10, "Michael");
		kinders[4] = new Child(151, 8, "Nick");
		
		for (Child child : kinders) {
			System.out.println(child);
		}
		
		
		System.out.println("Sorted by height");
		Arrays.sort(kinders, new HeightComparator());
		
		for (Child child : kinders) {
			System.out.println(child);
		}
		
		System.out.println("Sorted by age");
		Arrays.sort(kinders, new AgeComparator());
		
		for (Child child : kinders) {
			System.out.println(child);
		}
		
		

	}

}
