import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class AppNotebook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Notebook notebook = new Notebook();
		
		notebook.add(new Contact("Манин", "Александр", "(863) 262-30-63"));
		notebook.add("Жуковский", "Александр", "(863) 262-30-65");
		
		Scanner scanner = new Scanner(System.in);
		showMenu();
		
		int choice;
		do {
			choice = scanner.nextInt();
			
			switch (choice) {
				case 1:
					Contact contact = makeContact(scanner);
					notebook.add(contact);
					System.out.println("\nContact is added.\n");
					showMenu();
					break;
				
				case 2:
					System.out.println("\n\n");
					notebook.show();
					System.out.println("\n\n");
					showMenu();
					break;
					
				case 3:
					
					showMenu();
					break;
		
				case 4:
					System.out.println("Bye...");
					System.exit(0);
					break;
				default:
					showMenu();
					break;
			}
			
		} while (choice != 4);
	}
	
	private static void showMenu() {
		
		System.out.println("Options:");
		System.out.println("1 - Add contact");
		System.out.println("2 - Show contacts");
		System.out.println("3 - Find contact");
		System.out.println("4 - Exit program");
		System.out.println("-----------------");
		System.out.print("Please, make your choice >>> ");
	}
	
	private static Contact makeContact(Scanner scanner) {
		scanner.nextLine();
		System.out.println("\nNew contact\nEnter the first name: ");
		String firstName = scanner.nextLine();
		System.out.println("\nEnter the last name: ");
		String lastName = scanner.nextLine();
		System.out.println("\nEnter the phone: ");
		String phone = scanner.nextLine();
		
		return new Contact(firstName, lastName, phone);
	}

}
