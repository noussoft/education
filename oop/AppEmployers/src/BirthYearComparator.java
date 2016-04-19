import java.util.Comparator;


public class BirthYearComparator implements Comparator<Employer> {

	@Override
	public int compare(Employer o1, Employer o2) {
		return o1.getBirthYear() - o2.getBirthYear();
	}

}
