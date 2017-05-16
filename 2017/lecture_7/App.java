import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class App {
	
	public static final String DATAFILE = "data.dat";

	/**
	 * @param args
	 */
	public static void main(String[] args) throws FileNotFoundException {
		
		
	Notebook notebook = new Notebook();
	notebook.add(new Contact("Манин", "Александр", "(863) 262-30-63"));
	notebook.add(new Contact("Жуковский", "Александр", "(863) 262-30-65"));
	
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
					
					try {
						save(notebook);
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					showMenu();
					break;
					
				case 5:
					
				try {
					notebook = load();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
					showMenu();
					break;
		
				case 6:
					System.out.println("Bye...");
					System.exit(0);
					break;
				default:
					showMenu();
					break;
			}
			
		} while (choice != 6);
	}

	private static void showMenu() {
		
		System.out.println("Options:");
		System.out.println("1 - Add contact");
		System.out.println("2 - Show contacts");
		System.out.println("3 - Find contact");
		System.out.println("4 - Save contacts");
		System.out.println("5 - Load contacts");
		System.out.println("6 - Exit program");
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
	
	private static void save(Notebook notebook) throws FileNotFoundException, IOException {
		DataOutputStream out =
			new DataOutputStream(
				new FileOutputStream(
					new File(DATAFILE)
				)
			);
		
		notebook.save(out);
		out.close();
	}
	
	private static Notebook load() throws FileNotFoundException, IOException, ClassNotFoundException {
		DataInputStream in = 
			new DataInputStream(
				new FileInputStream(
					new File(DATAFILE)
				)
			);
		
		return Notebook.load(in);
	}

}
