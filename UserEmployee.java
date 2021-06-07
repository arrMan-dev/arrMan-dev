

import java.util.Scanner;

public class UserEmployee {
	
	 private static Scanner sc = new Scanner(System.in);

	    public static int menu() {
	        int ch = 0;
	        do {
	            System.out.println("\nEnter 1 to print list of employees");
	            System.out.println("Enter 2 to calculate employee yearly salary");
	            System.out.println("Enter 3 to display specific find employee");
	            System.out.println("Enter 4 to modify employee");
	            System.out.println("Enter 5 to delete an employee");
	            System.out.println("Enter 0 to exit");
	            System.out.print("Enter your choice : ");
	            ch = sc.nextInt();
	            sc.nextLine();

	            if (ch < 0 || ch > 5) {
	                System.out.println("Invalid choice...please re enter ! ");
	            }

	        } while (ch < 0 || ch > 5);
	        return ch;
	    }


	public static void main(String[] args) {
		 int ch = 0;
	        String id = "";
	        double sal;

	        // creating employees
	        Manager mg = new Manager();
	        mg.addEmployee(new Employee("1", "John", 10000, new Address("San diego", "California")));
	        mg.addEmployee(new Employee("2", "Peter", 5000, new Address("Dallas", "Texas")));
	        mg.addEmployee(new Employee("3", "David", 2000, new Address("Chicago", "Illinois")));
	        mg.addEmployee(new Employee("4", "Ela", 15000, new Address("Minneapolis", "Minnesota")));
	        mg.addEmployee(new Employee("5", "Ryan", 10000, new Address("Louisville", "Kentucky")));
	        mg.addEmployee(new Employee("6", "Brandy", 5000, new Address("Cleveland", "Ohio")));
	        mg.addEmployee(new Employee("7", "Dilan", 2000, new Address("Pittsburg", "Pensylvania")));
	        mg.addEmployee(new Employee("8", "Timothy", 15000, new Address("Indianapolis", "Indiana")));

	        do {
	            ch = menu();

	            switch (ch) {
	                case 1:
	                    mg.printEmployee();
	                    break;

	                case 2:
	                    System.out.print("Employees ID: ");
	                    id = sc.nextLine();
	                    sal = mg.calculateSalary(id);
	                    if (sal > 0) {
	                    	double grossPay = sal*12;
	                        System.out.println("Salary of Employee with id: " + id + " salary per month is $ " + sal);
	                        System.out.println("The current employee id has yearly income of $" + grossPay);
	                    } else {
	                        System.out.println("Employee with id: " + id + " not found");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Employees ID: ");
	                    id = sc.nextLine();
	                    mg.findEmployeeById(id);
	                    break;

	                case 4:
	                    System.out.print("Employees ID: ");
	                    id = sc.nextLine();
	                    mg.updateEmployee(id);
	                    break;

	                case 5:
	                    System.out.print("Employees ID: ");
	                    id = sc.nextLine();
	                    mg.deleteEmployee(id);
	                    break;

	                case 0:
	                    System.out.println("Good Bye");
	                    break;
	                default:
	                    System.out.println("Invalid choice...please re enter ! ");
	                    break;
	            }
	        } while (ch != 0);
	    }


}
