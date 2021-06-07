

public class Employee {
	
	// instance variables:
    private String id; // stores id of Employee
    private String name; // stores name of Employee
    private double salary; // stores salary of Employee
    Address address; // stores address of Employee

    // Parameterized constructor
    
    public Employee(String id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    // getters and setters
    public String getId() {
        return id;
    } // end of getId() method

    public void setId(String id) {
        this.id = id;
    } // end of setId() method

    public String getName() {
        return name;
    } // end of getName() method

    public void setName(String name) {
        this.name = name;
    } // end of setName() method

    public double getSalary() {
        return salary;
    } // end of getSalary() method

    public void setSalary(double salary) {
        this.salary = salary;
    } // end of setSalary() method

    public Address getAddress() {
        return address;
    } // end of getAddress() method

    public void setAddress(Address address) {
        this.address = address;
    } // end of setAddress() method

    // @Override
    public String toString() {
        String result = "";
        result = result + "id: " + id + ", ";
        result = result + "name: " + name + ", ";
        result = result + "salary: " + salary + ", ";
        result = result + "address => " + address;
        return result;
    }


}
