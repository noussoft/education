import java.util.Comparator;


public class NameComparator implements Comparator<Employer> {

	@Override
	public int compare(Employer o1, Employer o2) {
		
		return o1.getFirstName().compareTo(o2.getFirstName());
	}

}
