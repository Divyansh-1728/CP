 class Employee {
        String name;
        int id;
        double salary;

        Employee(String name, int id, double salary) {
            this.name = name;
            this.id = id;
            this.salary = salary;
        }

        void displayDetails() {
            System.out.println("Employee Name: " + name);
            System.out.println("Employee ID: " + id);
            System.out.println("Salary: " + salary);
        }

        public static void main(String[] args) {
            Employee emp = new Employee("John Doe", 101, 50000);
            emp.displayDetails();
        }
    }


    // 2. Program to Compute Area of a Circle
    class Circle {
        double radius;

        Circle(double radius) {
            this.radius = radius;
        }

        double calculateArea() {
            return Math.PI * radius * radius;
        }

        double calculateCircumference() {
            return 2 * Math.PI * radius;
        }

        void display() {
            System.out.println("Area: " + calculateArea());
            System.out.println("Circumference: " + calculateCircumference());
        }

        public static void main(String[] args) {
            Circle c = new Circle(7);
            c.display();
        }
    }


    // 3. Program to Handle Book Details
    class Book {
        String title, author;
        double price;

        Book(String title, String author, double price) {
            this.title = title;
            this.author = author;
            this.price = price;
        }

        void displayBook() {
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {
            Book b = new Book("Java Programming", "James Gosling", 499.99);
            b.displayBook();
        }
    }


    // 4. Program to Track Inventory of Items
    class Item {
        int itemCode;
        String itemName;
        double price;

        Item(int itemCode, String itemName, double price) {
            this.itemCode = itemCode;
            this.itemName = itemName;
            this.price = price;
        }

        void displayItem(int quantity) {
            System.out.println("Item Code: " + itemCode);
            System.out.println("Item Name: " + itemName);
            System.out.println("Price per Item: " + price);
            System.out.println("Total Cost: " + (price * quantity));
        }

        public static void main(String[] args) {
            Item it = new Item(101, "Laptop", 45000);
            it.displayItem(2);
        }
    }


    // 5. Program to Handle Mobile Phone Details
    class MobilePhone {
        String brand, model;
        double price;

        MobilePhone(String brand, String model, double price) {
            this.brand = brand;
            this.model = model;
            this.price = price;
        }

        void displayDetails() {
            System.out.println("Brand: " + brand);
            System.out.println("Model: " + model);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {
            MobilePhone m = new MobilePhone("Samsung", "Galaxy S24", 70000);
            m.displayDetails();
        }
    }



// ==================== Level 2 Practice Programs ====================

    // 1. Program to Simulate Student Report
    class Student {
        String name;
        int rollNumber;
        double marks;

        Student(String name, int rollNumber, double marks) {
            this.name = name;
            this.rollNumber = rollNumber;
            this.marks = marks;
        }

        char calculateGrade() {
            if (marks >= 90) return 'A';
            else if (marks >= 75) return 'B';
            else if (marks >= 50) return 'C';
            else return 'F';
        }

        void displayStudent() {
            System.out.println("Name: " + name);
            System.out.println("Roll No: " + rollNumber);
            System.out.println("Marks: " + marks);
            System.out.println("Grade: " + calculateGrade());
        }

        public static void main(String[] args) {
            Student s = new Student("Divyansh", 1728, 82.5);
            s.displayStudent();
        }
    }


    // 2. Program to Simulate an ATM
    class BankAccount {
        String accountHolder;
        int accountNumber;
        double balance;

        BankAccount(String accountHolder, int accountNumber, double balance) {
            this.accountHolder = accountHolder;
            this.accountNumber = accountNumber;
            this.balance = balance;
        }

        void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited. New Balance: " + balance);
        }

        void withdraw(double amount) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println(amount + " withdrawn. New Balance: " + balance);
            } else {
                System.out.println("Insufficient balance!");
            }
        }

        void displayBalance() {
            System.out.println("Account Holder: " + accountHolder);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: " + balance);
        }

        public static void main(String[] args) {
            BankAccount acc = new BankAccount("Dev", 12345, 1000);
            acc.deposit(500);
            acc.withdraw(300);
            acc.displayBalance();
        }
    }


    // 3. Program to Check Palindrome String
    class PalindromeChecker {
        String text;

        PalindromeChecker(String text) {
            this.text = text;
        }

        boolean isPalindrome() {
            String reversed = new StringBuilder(text).reverse().toString();
            return text.equalsIgnoreCase(reversed);
        }

        void displayResult() {
            if (isPalindrome())
                System.out.println(text + " is a Palindrome");
            else
                System.out.println(text + " is NOT a Palindrome");
        }

        public static void main(String[] args) {
            PalindromeChecker p = new PalindromeChecker("Madam");
            p.displayResult();
        }
    }


    // 4. Program to Model a Movie Ticket Booking System
    class MovieTicket {
        String movieName;
        int seatNumber;
        double price;

        MovieTicket(String movieName, int seatNumber, double price) {
            this.movieName = movieName;
            this.seatNumber = seatNumber;
            this.price = price;
        }

        void bookTicket() {
            System.out.println("Ticket Booked Successfully!");
        }

        void displayTicket() {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat Number: " + seatNumber);
            System.out.println("Price: " + price);
        }

        public static void main(String[] args) {
            MovieTicket t = new MovieTicket("Bramayugam", 12, 250);
            t.bookTicket();
            t.displayTicket();
        }
    }


    // 5. Program to Simulate a Shopping Cart
    class CartItem {
        String itemName;
        double price;
        int quantity;

        CartItem(String itemName, double price, int quantity) {
            this.itemName = itemName;
            this.price = price;
            this.quantity = quantity;
        }

        void addItem(int qty) {
            quantity += qty;
            System.out.println(qty + " items added. New Quantity: " + quantity);
        }

        void removeItem(int qty) {
            if (qty <= quantity) {
                quantity -= qty;
                System.out.println(qty + " items removed. Remaining Quantity: " + quantity);
            } else {
                System.out.println("Not enough items to remove!");
            }
        }

        void displayTotalCost() {
            System.out.println("Item: " + itemName);
            System.out.println("Price per Item: " + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Total Cost: " + (price * quantity));
        }

        public static void main(String[] args) {
            CartItem c = new CartItem("Shoes", 1500, 2);
            c.addItem(1);
            c.removeItem(1);
            c.displayTotalCost();
        }
    }
