import java.util.Comparator;


public class FullSalaryComparator implements Comparator<Employer> {

	@Override
	public int compare(Employer o1, Employer o2) {
		return (int)(o2.getFullSalary() - o1.getFullSalary());
	}

}
