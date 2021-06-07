

import java.util.ArrayList;
import java.util.Scanner;

public class Manager implements EmployeeServices {
	
	// following variable stores all the employees
	
    private static ArrayList<Employee> employees = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    /**
     * following method prints list of all employees
     */
    public void printEmployee() {
        System.out.println("\nList of Employees => ");
        for (Employee e : employees) {
            System.out.println(e);
        }
    }

    /**
     * following method returns yearly salary of all employee
     */
    public double calculateSalary(String id) {
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                return e.getSalary();
            }
        }
        return 0;
    }

    /**
     * following method search for the specified id in employee list it returns
     * Employee object, if employee found, otherwise null
     * 
     * @param id
     * @return
     */
    public Employee findEmployeeById(String id) {
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                System.out.println("Employee with ID: " + id + " found =>");
                System.out.println(e);
                return e;
            }
        }
        System.out.println("Employee with ID: " + id + " NOT found =>");
        return null; // otherwise
    }

    public void updateEmployee(String id) {
        Employee e = findEmployeeById(id);
        if (e != null) {
            System.out.print("Enter updated name [press enter for no change] : ");
            String name = sc.nextLine();
            if (name.length() > 0) {
                e.setName(name);
            }

            System.out.print("Enter updated salary [enter 0 for no change] : ");
            double salary = sc.nextDouble();
            sc.nextLine();
            if (salary > 0) {
                e.setSalary(salary);
            }

            System.out.print("Enter updated city [press enter for no change] : ");
            String city = sc.nextLine();
            if (city.length() > 0) {
                e.address.setCity(city);
            }

            System.out.print("Enter updated state [press enter for no change] : ");
            String state = sc.nextLine();
            if (state.length() > 0) {
                e.address.setCity(state);
            }
            System.out.println("Emplyee updated successfully...");
        }
    }

    public void deleteEmployee(String id) {
        for (Employee e : employees) {
            if (id.equals(e.getId())) {
                employees.remove(e);
                System.out.println("Emplyee deleted successfully...");
                return;
            }
        }
        System.out.println("Emplyee not found...");
    }
	

}
