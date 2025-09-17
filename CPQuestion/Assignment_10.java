public class Assignment_10 {
//        public static void main(String[] args) {
//            // 1. Book Example
//            Book b1 = new Book("Book of Kings" , "Divyansh Chaudhary",1000);
//            Book b2 = new Book("Java Programming", "James Gosling", 500.0);
//            b1.displayBook();
//            b2.displayBook();
//
//            System.out.println();
//
//
//            // 3. Person Copy Constructor
//            Person p1 = new Person("Dev", 20);
//            Person p2 = new Person(p1);
//            p1.displayPerson();
//            p2.displayPerson();
//
//            System.out.println();
//
//            // 4. Hotel Booking
//            HotelBooking h1 = new HotelBooking();
//            HotelBooking h2 = new HotelBooking("Divyansh", "Deluxe", 3);
//            HotelBooking h3 = new HotelBooking(h2);
//            h1.displayBooking();
//            h2.displayBooking();
//            h3.displayBooking();
//
//            System.out.println();
//
//            // 5. Library Book
//            LibraryBook lb = new LibraryBook("DSA", "Mark Allen", 399.99, true);
//            lb.displayBook();
//            lb.borrowBook();
//            lb.displayBook();
//
//            System.out.println();
//
//            // 6. Car Rental
//            CarRental cR1 = new CarRental();
//            CarRental cR2 = new CarRental("Dev", "Hyundai Creta", 5);
//            cR1.displayRental();
//            cR2.displayRental();
//        }
//    }
//
//// ================= Helper Classes =================
//
//    // 1. Book
//    class Book1 {
//        String title;
//        String author;
//        double price;
//
//        Book1() {
//            this.title = "Unknown";
//            this.author = "Unknown";
//            this.price = 0.0;
//        }
//
//        Book1(String title, String author, double price) {
//            this.title = title;
//            this.author = author;
//            this.price = price;
//        }
//
//        void displayBook() {
//            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price);
//        }
//    }
//
//    // 2. Circle
//    class Circle01 {
//        double radius;
//
//        Circle01() {
//            this(1.0);
//        }
//
//        Circle01(double radius) {
//            this.radius = radius;
//        }
//
//        void displayCircle() {
//            System.out.println("Radius: " + radius + ", Area: " + (Math.PI * radius * radius));
//        }
//    }
//
//    // 3. Person with Copy Constructor
//    class Person {
//        String name;
//        int age;
//
//        Person(String name, int age) {
//            this.name = name;
//            this.age = age;
//        }
//
//        Person(Person p) {
//            this.name = p.name;
//            this.age = p.age;
//        }
//
//        void displayPerson() {
//            System.out.println("Name: " + name + ", Age: " + age);
//        }
//    }
//
//    // 4. HotelBooking
//    class HotelBooking {
//        String guestName;
//        String roomType;
//        int nights;
//
//        HotelBooking() {
//            this.guestName = "Unknown";
//            this.roomType = "Standard";
//            this.nights = 1;
//        }
//
//        HotelBooking(String guestName, String roomType, int nights) {
//            this.guestName = guestName;
//            this.roomType = roomType;
//            this.nights = nights;
//        }
//
//        HotelBooking(HotelBooking hb) {
//            this.guestName = hb.guestName;
//            this.roomType = hb.roomType;
//            this.nights = hb.nights;
//        }
//
//        void displayBooking() {
//            System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
//        }
//    }
//
//    // 5. LibraryBook
//    class LibraryBook {
//        String title;
//        String author;
//        double price;
//        boolean available;
//
//        LibraryBook(String title, String author, double price, boolean available) {
//            this.title = title;
//            this.author = author;
//            this.price = price;
//            this.available = available;
//        }
//
//        void borrowBook() {
//            if (available) {
//                available = false;
//                System.out.println(title + " has been borrowed.");
//            } else {
//                System.out.println(title + " is not available.");
//            }
//        }
//
//        void displayBook() {
//            System.out.println("Title: " + title + ", Author: " + author + ", Price: " + price +
//                    ", Available: " + available);
//        }
//    }
//
//    // 6. CarRental
//    class CarRental {
//        String customerName;
//        String carModel;
//        int rentalDays;
//        double costPerDay = 1000.0;
//
//        CarRental() {
//            this.customerName = "Unknown";
//            this.carModel = "Standard";
//            this.rentalDays = 1;
//        }
//
//        CarRental(String customerName, String carModel, int rentalDays) {
//            this.customerName = customerName;
//            this.carModel = carModel;
//            this.rentalDays = rentalDays;
//        }
//
//        double calculateTotalCost() {
//            return rentalDays * costPerDay;
//        }
//
//        void displayRental() {
//            System.out.println("Customer: " + customerName + ", Car: " + carModel +
//                    ", Days: " + rentalDays + ", Total Cost: " + calculateTotalCost());
//        }



public static void main(String[] args) {
        // ================= Instance vs. Class Variables and Methods =================
        System.out.println("=== Product Inventory ===");
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Phone", 20000);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();

        System.out.println("\n=== Online Course Management ===");
        Course c1 = new Course("Java Programming", 3, 15000);
        Course c2 = new Course("Python Programming", 2, 12000);
        c1.displayCourseDetails();
        c2.displayCourseDetails();
        Course.updateInstituteName("OpenAI Institute");
        c1.displayCourseDetails();

        System.out.println("\n=== Vehicle Registration ===");
        Vehicle v1 = new Vehicle("Dev", "Car");
        Vehicle v2 = new Vehicle("Divyansh", "Bike");
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
        Vehicle.updateRegistrationFee(2500);
        v1.displayVehicleDetails();

        // ================= Access Modifiers =================
        System.out.println("\n=== University Management System ===");
        PostgraduateStudent pg = new PostgraduateStudent(101, "Amit", 8.7);
        pg.displayStudent();
        pg.displayStudent();

        System.out.println("\n=== Book Library System ===");
        EBook eb = new EBook("123-456", "Java Basics",9.8);
        eb.displayBook();

        System.out.println("\n=== Bank Account Management ===");
        SavingsAccount sa = new SavingsAccount(1001, "Dev", 5000);
        sa.displayAccount();
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.displayAccount();

        System.out.println("\n=== Employee Records ===");
        Manager m = new Manager(201, "IT", 60000);
        m.displayEmployee();
        m.displayEmployee();
    }
}

// ================= 1. Instance vs. Class Variables and Methods =================

    // Problem 1: Product Inventory
    class Product {
        String productName;
        double price;
        static int totalProducts = 0;

        Product(String productName, double price) {
            this.productName = productName;
            this.price = price;
            totalProducts++;
        }

        void displayProductDetails() {
            System.out.println("Product: " + productName + ", Price: " + price);
        }

        static void displayTotalProducts() {
            System.out.println("Total Products Created: " + totalProducts);
        }
    }

    // Problem 2: Online Course Management
    class Course {
        String courseName;
        int duration; // months
        double fee;
        static String instituteName = "ABC Institute";

        Course(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
        }

        void displayCourseDetails() {
            System.out.println("Course: " + courseName + ", Duration: " + duration + " months, Fee: " + fee + ", Institute: " + instituteName);
        }

        static void updateInstituteName(String newName) {
            instituteName = newName;
        }
    }

    // Problem 3: Vehicle Registration
    class Vehicle {
        String ownerName;
        String vehicleType;
        static double registrationFee = 2000;

        Vehicle(String ownerName, String vehicleType) {
            this.ownerName = ownerName;
            this.vehicleType = vehicleType;
        }

        void displayVehicleDetails() {
            System.out.println("Owner: " + ownerName + ", Vehicle: " + vehicleType + ", Registration Fee: " + registrationFee);
        }

        static void updateRegistrationFee(double newFee) {
            registrationFee = newFee;
        }
    }


    class Student1 {
        public int rollNumber;
        protected String name;
        private double CGPA;

        Student1(int rollNumber, String name, double CGPA) {
            this.rollNumber = rollNumber;
            this.name = name;
            this.CGPA = CGPA;
        }

        public void setCGPA(double CGPA) {
            this.CGPA = CGPA;
        }

        public double getCGPA() {
            return CGPA;
        }
    }

    class PostgraduateStudent extends Student {
        PostgraduateStudent(int rollNumber, String name, double CGPA) {
            super(rollNumber, name, CGPA);
        }

        void displayStudent() {
            System.out.println("Roll No: " + rollNumber + ", Name: " + name + ", CGPA: " );
        }
    }

    // Problem 2: Book Library System
    class Book2 {
        public String ISBN;
        protected String title;
        private String author;

        Book2(String ISBN, String title, String author) {
            this.ISBN = ISBN;
            this.title = title;
            this.author = author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }

        public String getAuthor() {
            return author;
        }
    }

    class EBook extends Book {
        EBook(String ISBN, String title, double author) {
            super(ISBN, title, author);
        }

        void displayBook() {
            System.out.println("ISBN: " + ISBN + ", Title: " + title + ", Author: " + getAuthor());
        }
    }

    // Problem 3: Bank Account Management
    class BankAccount1 {
        public int accountNumber;
        protected String accountHolder;
        private double balance;

        BankAccount1(int accountNumber, String accountHolder, double balance) {
            this.accountNumber = accountNumber;
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }

        public void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Withdrawn: " + amount);
            } else {
                System.out.println("Insufficient Balance!");
            }
        }

        public double getBalance() {
            return balance;
        }
    }

    class SavingsAccount extends BankAccount {
        SavingsAccount(int accountNumber, String accountHolder, double balance) {
            super(accountNumber, accountHolder, balance);
        }

        void displayAccount() {
            System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + getBalance());
        }
    }

    // Problem 4: Employee Records
    class Employee2 {
        public int employeeID;
        protected String department;
        private double salary;

        Employee2(int employeeID, String department, double salary) {
            this.employeeID = employeeID;
            this.department = department;
            this.salary = salary;
        }

        public void updateSalary(double salary) {
            this.salary = salary;
        }

        public double getSalary() {
            return salary;
        }
    }

    class Manager extends Employee {
        Manager(int employeeID, String department, double salary) {
            super(employeeID, department, salary);
        }

        void displayEmployee() {
            System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary());
        }
}