import java.util.Comparator;


public class HeightComparator implements Comparator<Child>{

	@Override
	public int compare(Child o1, Child o2) {
		return o1.getHeight() - o2.getHeight();
	}

}
