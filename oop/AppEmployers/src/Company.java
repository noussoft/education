import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;


public class Company {
	
	public static final int TEXT_WIDTH = 100;

	private ArrayList employers = new ArrayList();

	public static double getExtraSeniority(int seniorityAge) {
		if (
				(seniorityAge >= 5 )
				&& (seniorityAge < 10 )
		) {
			return 1.15;
		} else if (
				(seniorityAge >= 10 )
				&& (seniorityAge < 20 )
		) {
			return 1.25;
		} else if (seniorityAge >= 20 ) {
			return 1.4;
		} else {
			return 1;
		}
	}
	
	public Company add(Employer employer) {
		this.employers.add(employer);
		return this;
	}
	
	public void showByFirstName() {
		show(new NameComparator());
	}
	
	public void showByBirthYear() {
		show(new BirthYearComparator());
	}
	
	public void showByFullSalary() {
		show(new FullSalaryComparator());
	}
	
	private void show(Comparator comparator) {
		showHeader();
		showLine();
		Collections.sort(this.employers, comparator);
		Iterator<Employer> iter = this.employers.iterator();
		
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		showLine();
	}
	
	private void showHeader() {
		System.out.println("ID\tFirst name\tLast name\tBirth year\tSeniority\tSalary\t\tFull Salary");
	}
	
	private void showLine() {
		for (int i = 0; i < TEXT_WIDTH; i++) {
			System.out.print("-");
		}
		System.out.println();
	}
}
