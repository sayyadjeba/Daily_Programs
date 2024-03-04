

// Superclass Employee
class employee {
    // Attributes
    private String name;
    private int age;
    private double salary;
    
    // Constructor
    public employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    
    // Method to display employee information
    public void display() {
        System.out.println("Employee Information");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Faculty extending Employee
class Faculty extends employee {
    // Attributes specific to Faculty
    private String department;

    // Constructor
    public Faculty(String name, int age, double salary, String department) {
        super(name, age, salary);
        this.department = department;
    }

    // Method overriding to display faculty information
    @Override
    public void display() {
        super.display(); // Call display method of superclass
        System.out.println("Faculty Information");
        System.out.println("Department: " + department);
    }
}

// Main class to demonstrate the program
public class Employee {
    public static void main(String[] args) {
        // Create Employee objects
        employee employee1 = new employee("Shaikh S R", 30, 50000);
        employee employee2 = new employee("Sayyad J A", 35, 60000);
        
        // Create Faculty objects for different departments
        Faculty scienceFaculty = new Faculty("Faruki M M", 40, 70000, "Science");
        Faculty commerceFaculty = new Faculty("Gaikwad G B", 45, 80000, "Commerce");
        Faculty artsFaculty = new Faculty("Walunj S P", 38, 65000, "Arts");
        
        // Display employee and faculty information
        System.out.println("--- Employee Information ---");
        employee1.display();
        System.out.println();
        employee2.display();
        System.out.println();
        
        System.out.println("--- Faculty Information ---");
        scienceFaculty.display();
        System.out.println();
        commerceFaculty.display();
        System.out.println();
        artsFaculty.display();
    }
}