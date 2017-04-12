import java.util.Comparator;


public class AgeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		
		return ((Child)o1).getAge() - ((Child)o2).getAge();
	}

}
