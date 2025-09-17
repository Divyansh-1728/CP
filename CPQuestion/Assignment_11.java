//Bank Account System


//public class Assignment_11 {
//    // Static variable shared across all accounts
//    private static String bankName = "State Bank of India";
//    private static int totalAccounts = 0;
//
//    // Instance variables
//    private String accountHolderName;
//    private final int accountNumber; // final variable
//    private double balance;
//
//    // Constructor using 'this' to resolve ambiguity
//    public BankAccount(String accountHolderName, int accountNumber, double balance) {
//        this.accountHolderName = accountHolderName;
//        this.accountNumber = accountNumber;  // final, assigned once
//        this.balance = balance;
//        totalAccounts++; // increment when account is created
//    }
//
//    // Instance method to display account details
//    public void displayDetails() {
//        if (this instanceof BankAccount) { // instanceof check
//            System.out.println("Bank Name: " + bankName);
//            System.out.println("Account Holder: " + accountHolderName);
//            System.out.println("Account Number: " + accountNumber);
//            System.out.println("Balance: " + balance);
//            System.out.println("---------------------------");
//        }
//    }
//
//    // Static method to display total accounts
//    public static void getTotalAccounts() {
//        System.out.println("Total Accounts Created: " + totalAccounts);
//    }
//
//    // MAIN method
//    public static void main(String[] args) {
//        BankAccount acc1 = new BankAccount("Divyansh", 1001, 5000.0);
//        BankAccount acc2 = new BankAccount("Aarav", 1002, 7500.0);
//
//        acc1.displayDetails();
//        acc2.displayDetails();
//
//        // Calling static method
//        BankAccount.getTotalAccounts();
//    }
//}


//Library Management System
//public class Assignment_11 {
//    static class Book {
//        private static String libraryName = "City Central Library";
//
//        private String title;
//        private String author;
//        private final String isbn; // final ensures ISBN cannot change
//
//        public Book(String title, String author, String isbn) {
//            this.title = title;
//            this.author = author;
//            this.isbn = isbn;
//        }
//
//        public void displayDetails() {
//            if (this instanceof Book) { // instanceof check
//                System.out.println("Library: " + libraryName);
//                System.out.println("Title: " + title);
//                System.out.println("Author: " + author);
//                System.out.println("ISBN: " + isbn);
//                System.out.println("---------------------------");
//            }
//        }
//
//        public static void displayLibraryName() {
//            System.out.println("Library Name: " + libraryName);
//        }
//    }
//
//    public static void main(String[] args) {
//        Book.displayLibraryName();
//
//        Book b1 = new Book("The Alchemist", "Paulo Coelho", "ISBN001");
//        Book b2 = new Book("1984", "George Orwell", "ISBN002");
//        b1.displayDetails();
//        b2.displayDetails();
//    }
//}


//Employee Management System
//public class Assignment_11 {
//    static class Employee {
//        private static String companyName = "Tech Solutions Pvt. Ltd.";
//        private static int totalEmployees = 0;
//        private String name;
//        private final int id;  // final ensures ID cannot change
//        private String designation;
//
//        public Employee(String name, int id, String designation) {
//            this.name = name;
//            this.id = id;
//            this.designation = designation;
//            totalEmployees++;
//        }
//
//        public void displayEmployeeDetails() {
//            if (this instanceof Employee) { // instanceof check
//                System.out.println("Company: " + companyName);
//                System.out.println("Employee ID: " + id);
//                System.out.println("Name: " + name);
//                System.out.println("Designation: " + designation);
//                System.out.println("---------------------------");
//            }
//        }
//
//        public static void displayTotalEmployees() {
//            System.out.println("Total Employees: " + totalEmployees);
//        }
//    }
//
//    public static void main(String[] args) {
//        Employee e1 = new Employee("Alice", 101, "Software Engineer");
//        Employee e2 = new Employee("Bob", 102, "Project Manager");
//        Employee e3 = new Employee("Charlie", 103, "HR Manager");
//
//        e1.displayEmployeeDetails();
//        e2.displayEmployeeDetails();
//        e3.displayEmployeeDetails();
//
//        Employee.displayTotalEmployees();
//    }
//}


//Shopping Cart System
//public class Assignment_11 {
//
//    static class Product {
//
//        private static double discount = 10.0;
//
//        private final int productID;
//        private String productName;
//        private double price;
//        private int quantity;
//
//        public Product(int productID, String productName, double price, int quantity) {
//            this.productID = productID;
//            this.productName = productName;
//            this.price = price;
//            this.quantity = quantity;
//        }
//
//        public double getFinalPrice() {
//            double total = price * quantity;
//            return total - (total * discount / 100);
//        }
//
//        public void displayProductDetails() {
//            if (this instanceof Product) {
//                System.out.println("Product ID: " + productID);
//                System.out.println("Name: " + productName);
//                System.out.println("Price per unit: " + price);
//                System.out.println("Quantity: " + quantity);
//                System.out.println("Discount: " + discount + "%");
//                System.out.println("Final Price: " + getFinalPrice());
//                System.out.println("---------------------------");
//            }
//        }
//
//        public static void updateDiscount(double newDiscount) {
//            discount = newDiscount;
//            System.out.println("Discount updated to: " + discount + "%");
//        }
//    }
//
//
//    public static void main(String[] args) {
//
//        Product p1 = new Product(201, "Laptop", 50000, 1);
//        Product p2 = new Product(202, "Headphones", 2000, 2);
//        Product p3 = new Product(203, "Mouse", 800, 3);
//
//        p1.displayProductDetails();
//        p2.displayProductDetails();
//        p3.displayProductDetails();
//
//        Product.updateDiscount(20);
//
//        p1.displayProductDetails();
//        p2.displayProductDetails();
//        p3.displayProductDetails();
//    }
//}



// University Student Management
//public class Assignment_11 {
//    static class Student {
//        // Static members
//        private static String universityName = "GLA University";
//        private static int totalStudents = 0;
//
//        // Final variable (cannot be changed once assigned)
//        private final int rollNumber;
//
//        // Instance variables
//        private String name;
//        private String grade;
//
//        // Constructor using 'this'
//        public Student(int rollNumber, String name, String grade) {
//            this.rollNumber = rollNumber;
//            this.name = name;
//            this.grade = grade;
//            totalStudents++; // increase student count whenever a new student is created
//        }
//
//        // Method to display student details
//        public void displayDetails() {
//            if (this instanceof Student) { // instanceof check
//                System.out.println("University: " + universityName);
//                System.out.println("Roll Number: " + rollNumber);
//                System.out.println("Name: " + name);
//                System.out.println("Grade: " + grade);
//                System.out.println("---------------------------");
//            }
//        }
//
//        // Method to update grade
//        public void updateGrade(String newGrade) {
//            if (this instanceof Student) {
//                this.grade = newGrade;
//                System.out.println(name + "'s grade updated to: " + newGrade);
//            }
//        }
//
//        // Static method to display total students
//        public static void displayTotalStudents() {
//            System.out.println("Total Students Enrolled: " + totalStudents);
//        }
//    }
//
//    // MAIN Method
//    public static void main(String[] args) {
//        // Create students
//        Student s1 = new Student(101, "Divyansh", "A");
//        Student s2 = new Student(102, "Anjali", "B");
//        Student s3 = new Student(103, "Rahul", "A");
//
//        // Display details
//        s1.displayDetails();
//        s2.displayDetails();
//        s3.displayDetails();
//
//        // Update grade
//        s2.updateGrade("A+");
//
//        // Display updated details
//        s2.displayDetails();
//
//        // Display total students
//        Student.displayTotalStudents();
//    }
//}



//Vehicle Registration System
//public class Assignment_11 {
//    static class Vehicle {
//        // Static members
//        private static double registrationFee = 5000.0; // common for all vehicles
//
//        // Final variable (unique for each vehicle, cannot be changed)
//        private final String registrationNumber;
//
//        // Instance variables
//        private String ownerName;
//        private String vehicleType;
//
//        // Constructor using 'this'
//        public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
//            this.registrationNumber = registrationNumber;
//            this.ownerName = ownerName;
//            this.vehicleType = vehicleType;
//        }
//
//        // Display vehicle details (with instanceof check)
//        public void displayDetails() {
//            if (this instanceof Vehicle) {
//                System.out.println("Registration Number: " + registrationNumber);
//                System.out.println("Owner Name: " + ownerName);
//                System.out.println("Vehicle Type: " + vehicleType);
//                System.out.println("Registration Fee: " + registrationFee);
//                System.out.println("--------------------------------");
//            }
//        }
//
//        // Static method to update registration fee
//        public static void updateRegistrationFee(double newFee) {
//            registrationFee = newFee;
//            System.out.println("Registration fee updated to: " + registrationFee);
//        }
//    }
//
//    // MAIN method
//    public static void main(String[] args) {
//        // Create vehicles
//        Vehicle v1 = new Vehicle("UP85-1234", "Divyansh", "Car");
//        Vehicle v2 = new Vehicle("UP85-5678", "Anjali", "Bike");
//
//        // Display details
//        v1.displayDetails();
//        v2.displayDetails();
//
//        // Update registration fee
//        Vehicle.updateRegistrationFee(6000.0);
//
//        // Display details again after fee update
//        v1.displayDetails();
//        v2.displayDetails();
//    }
//}

// Hospital Management System
public class Assignment_11 {

    static class Patient {
        // Static members
        private static String hospitalName = "City Care Hospital";
        private static int totalPatients = 0;

        // Final variable (unique ID per patient, cannot be changed)
        private final int patientID;

        // Instance variables
        private String name;
        private int age;
        private String ailment;

        // Constructor using 'this'
        public Patient(int patientID, String name, int age, String ailment) {
            this.patientID = patientID;
            this.name = name;
            this.age = age;
            this.ailment = ailment;
            totalPatients++;
        }

        // Instance method to display patient details
        public void displayDetails() {
            if (this instanceof Patient) {
                System.out.println("Hospital: " + hospitalName);
                System.out.println("Patient ID: " + patientID);
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("Ailment: " + ailment);
                System.out.println("----------------------------------");
            }
        }

        // Static method to show total patients
        public static void getTotalPatients() {
            System.out.println("Total Patients Admitted: " + totalPatients);
        }
    }

    // MAIN method
    public static void main(String[] args) {
        // Create patients
        Patient p1 = new Patient(101, "Divyansh", 22, "Fever");
        Patient p2 = new Patient(102, "Anjali", 30, "Fracture");
        Patient p3 = new Patient(103, "Rohan", 45, "Diabetes");

        // Display details
        p1.displayDetails();
        p2.displayDetails();
        p3.displayDetails();

        // Show total patients
        Patient.getTotalPatients();
    }
}
