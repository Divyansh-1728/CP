//public class InheritanceAssignment {
//    public static void main(String[] args) {
//        // Animal Hierarchy (polymorphism)
//        Animal a1 = new Dog("Buddy", 3);
//        Animal a2 = new Cat("Kitty", 2);
//        Animal a3 = new Bird("Tweety", 1);
//        a1.makeSound();
//        a2.makeSound();
//        a3.makeSound();
//
//        System.out.println();
//
//        // Employee System
//        Employee e1 = new Manager("Alice", 1, 80000, 5);
//        Employee e2 = new Developer("Bob", 2, 60000, "Java");
//        Employee e3 = new Intern("Charlie", 3, 20000, 6);
//        e1.displayDetails();
//        e2.displayDetails();
//        e3.displayDetails();
//
//        System.out.println();
//
//        // Vehicle System: demonstrate polymorphism by storing subclasses in Vehicle[] and calling displayInfo()
//        Vehicle[] vehicles = {
//                new Car(180, "Petrol", 5),
//                new Truck(120, "Diesel", 10.0),
//                new Motorcycle(100, "Petrol", true)
//        };
//        for (Vehicle v : vehicles) {
//            v.displayInfo();
//            System.out.println();
//        }
//
//        // Single Inheritance
//        Author author = new Author("Java Basics", 2021, "James", "Expert in Java");
//        author.displayInfo();
//
//        Thermostat t = new Thermostat("T100", true, 22);
//        t.displayStatus();
//
//        System.out.println();
//
//        // Multilevel Inheritance
//        DeliveredOrder order = new DeliveredOrder("O1", "2025-09-17", "TR123", "2025-09-20");
//        System.out.println(order.getOrderStatus());
//
//        System.out.println();
//
//        // Hierarchical Inheritance
//        SavingsAccount sa = new SavingsAccount("SA123", 5000.0, 5.5);
//        sa.displayAccountType();
//
//        CheckingAccount ca = new CheckingAccount("CA456", 2000.0, 1000.0);
//        ca.displayAccountType();
//
//        FixedDepositAccount fd = new FixedDepositAccount("FD789", 100000.0, 3);
//        fd.displayAccountType();
//
//        System.out.println();
//
//        Teacher teacher = new Teacher("Mr. Smith", 40, "Math");
//        teacher.displayRole();
//
//        Student student = new StudentPerson("Rita", 15, "9th");
//        student.displayRole();
//
//        Staff staff = new Staff("Mr. John", 35, "Lab Assistant");
//        staff.displayRole();
//
//        System.out.println();
//
//        // Hybrid Inheritance (Person implements Worker, Vehicle implements Refuelable)
//        Worker chef = new Chef("Gordon", 50);
//        chef.performDuties();
//
//        Worker waiter = new Waiter("James", 28);
//        waiter.performDuties();
//
//        PetrolVehicle pv = new PetrolVehicle(150, "Swift");
//        pv.refuel();
//
//        ElectricVehicle ev = new ElectricVehicle(160, "Tesla Model 3");
//        ev.charge();
//    }
//}
//
//// -----------------------------
//// 1. Animal Hierarchy (Basic Inheritance)
//// -----------------------------
//class Animal {
//    String name;
//    int age;
//    Animal(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//    void makeSound() {
//        System.out.println(name + " makes a sound.");
//    }
//}
//
//class Dog extends Animal {
//    Dog(String name, int age) { super(name, age); }
//    @Override
//    void makeSound() { System.out.println(name + " barks!"); }
//}
//
//class Cat extends Animal {
//    Cat(String name, int age) { super(name, age); }
//    @Override
//    void makeSound() { System.out.println(name + " meows!"); }
//}
//
//class Bird extends Animal {
//    Bird(String name, int age) { super(name, age); }
//    @Override
//    void makeSound() { System.out.println(name + " chirps!"); }
//}
//
//// -----------------------------
//// 2. Employee Management System
//// -----------------------------
//class Employee {
//    String name;
//    int id;
//    double salary;
//
//    Employee(String name, int id, double salary) {
//        this.name = name;
//        this.id = id;
//        this.salary = salary;
//    }
//
//    void displayDetails() {
//        System.out.println("Employee: " + name + ", ID: " + id + ", Salary: " + salary);
//    }
//}
//
//class Manager extends Employee {
//    int teamSize;
//    Manager(String name, int id, double salary, int teamSize) {
//        super(name, id, salary);
//        this.teamSize = teamSize;
//    }
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Manages a team of " + teamSize + " members.");
//    }
//}
//
//class Developer extends Employee {
//    String programmingLanguage;
//    Developer(String name, int id, double salary, String programmingLanguage) {
//        super(name, id, salary);
//        this.programmingLanguage = programmingLanguage;
//    }
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Developer in " + programmingLanguage);
//    }
//}
//
//class Intern extends Employee {
//    int duration; // months
//    Intern(String name, int id, double salary, int duration) {
//        super(name, id, salary);
//        this.duration = duration;
//    }
//    @Override
//    void displayDetails() {
//        super.displayDetails();
//        System.out.println("Internship Duration: " + duration + " months.");
//    }
//}
//
//// -----------------------------
//// 3. Vehicle and Transport System
//// -----------------------------
//class Vehicle {
//    int maxSpeed;
//    String fuelType;
//    Vehicle(int maxSpeed, String fuelType) {
//        this.maxSpeed = maxSpeed;
//        this.fuelType = fuelType;
//    }
//    void displayInfo() {
//        System.out.println("Max Speed: " + maxSpeed + ", Fuel: " + fuelType);
//    }
//}
//
//class Car extends Vehicle {
//    int seatCapacity;
//    Car(int maxSpeed, String fuelType, int seatCapacity) {
//        super(maxSpeed, fuelType);
//        this.seatCapacity = seatCapacity;
//    }
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Car Seats: " + seatCapacity);
//    }
//}
//
//class Truck extends Vehicle {
//    double loadCapacity;
//    Truck(int maxSpeed, String fuelType, double loadCapacity) {
//        super(maxSpeed, fuelType);
//        this.loadCapacity = loadCapacity;
//    }
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Truck Load Capacity: " + loadCapacity + " tons");
//    }
//}
//
//class Motorcycle extends Vehicle {
//    boolean hasCarrier;
//    Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
//        super(maxSpeed, fuelType);
//        this.hasCarrier = hasCarrier;
//    }
//    @Override
//    void displayInfo() {
//        super.displayInfo();
//        System.out.println("Motorcycle Carrier: " + (hasCarrier ? "Yes" : "No"));
//    }
//}
//
//// -----------------------------
//// 4. Single Inheritance Examples
//// -----------------------------
//class Book {
//    String title;
//    int publicationYear;
//    Book(String title, int publicationYear) {
//        this.title = title;
//        this.publicationYear = publicationYear;
//    }
//}
//
//class Author extends Book {
//    String name;
//    String bio;
//    Author(String title, int year, String name, String bio) {
//        super(title, year);
//        this.name = name;
//        this.bio = bio;
//    }
//    void displayInfo() {
//        System.out.println("Book: " + title + " (" + publicationYear + ")");
//        System.out.println("Author: " + name + " - " + bio);
//    }
//}
//
//class Device {
//    String deviceId;
//    boolean status;
//    Device(String deviceId, boolean status) {
//        this.deviceId = deviceId;
//        this.status = status;
//    }
//}
//
//class Thermostat extends Device {
//    int temperatureSetting;
//    Thermostat(String deviceId, boolean status, int temp) {
//        super(deviceId, status);
//        this.temperatureSetting = temp;
//    }
//    void displayStatus() {
//        System.out.println("Thermostat ID: " + deviceId + " | On: " + status + " | Temp: " + temperatureSetting + "°C");
//    }
//}
//
//// -----------------------------
//// 5. Multilevel Inheritance
//// -----------------------------
//class Order {
//    String orderId;
//    String orderDate;
//    Order(String id, String date) {
//        this.orderId = id;
//        this.orderDate = date;
//    }
//}
//
//class ShippedOrder extends Order {
//    String trackingNumber;
//    ShippedOrder(String id, String date, String trackingNumber) {
//        super(id, date);
//        this.trackingNumber = trackingNumber;
//    }
//}
//
//class DeliveredOrder extends ShippedOrder {
//    String deliveryDate;
//    DeliveredOrder(String id, String date, String track, String deliveryDate) {
//        super(id, date, track);
//        this.deliveryDate = deliveryDate;
//    }
//    String getOrderStatus() {
//        return "Delivered on " + deliveryDate;
//    }
//}
//
//class Course {
//    String courseName;
//    int duration;
//    Course(String name, int duration) {
//        this.courseName = name;
//        this.duration = duration;
//    }
//}
//
//class OnlineCourse extends Course {
//    String platform;
//    boolean isRecorded;
//    OnlineCourse(String name, int duration, String platform, boolean isRecorded) {
//        super(name, duration);
//        this.platform = platform;
//        this.isRecorded = isRecorded;
//    }
//}
//
//class PaidOnlineCourse extends OnlineCourse {
//    double fee;
//    double discount;
//    PaidOnlineCourse(String name, int duration, String platform, boolean isRecorded, double fee, double discount) {
//        super(name, duration, platform, isRecorded);
//        this.fee = fee;
//        this.discount = discount;
//    }
//}
//
//// -----------------------------
//// 6. Hierarchical Inheritance
//// -----------------------------
//class BankAccount {
//    String accountNumber;
//    double balance;
//    BankAccount(String accountNumber, double balance) {
//        this.accountNumber = accountNumber;
//        this.balance = balance;
//    }
//}
//
//class SavingsAccount extends BankAccount {
//    double interestRate;
//    SavingsAccount(String accountNumber, double balance, double interestRate) {
//        super(accountNumber, balance);
//        this.interestRate = interestRate;
//    }
//    void displayAccountType() {
//        System.out.println("Savings Account | Interest Rate: " + interestRate + "%");
//    }
//}
//
//class CheckingAccount extends BankAccount {
//    double withdrawalLimit;
//    CheckingAccount(String accountNumber, double balance, double limit) {
//        super(accountNumber, balance);
//        this.withdrawalLimit = limit;
//    }
//    void displayAccountType() {
//        System.out.println("Checking Account | Withdrawal Limit: " + withdrawalLimit);
//    }
//}
//
//class FixedDepositAccount extends BankAccount {
//    int term;
//    FixedDepositAccount(String accountNumber, double balance, int term) {
//        super(accountNumber, balance);
//        this.term = term;
//    }
//    void displayAccountType() {
//        System.out.println("Fixed Deposit Account | Term: " + term + " years");
//    }
//}
//
//// Person and school roles
//class Person {
//    String name;
//    int age;
//    Person(String name, int age) { this.name = name; this.age = age; }
//}
//
//class Teacher extends Person {
//    String subject;
//    Teacher(String name, int age, String subject) { super(name, age); this.subject = subject; }
//    void displayRole() { System.out.println("Teacher of " + subject); }
//}
//
//class StudentPerson extends Person {
//    String grade;
//    StudentPerson(String name, int age, String grade) { super(name, age); this.grade = grade; }
//    void displayRole() { System.out.println("Student in grade " + grade); }
//}
//
//class Staff extends Person {
//    String role;
//    Staff(String name, int age, String role) { super(name, age); this.role = role; }
//    void displayRole() { System.out.println("Staff role: " + role); }
//}
//
//// -----------------------------
//// 7. Hybrid Inheritance (via interfaces)
//// -----------------------------
//interface Worker {
//    void performDuties();
//}
//
//class Chef extends Person implements Worker {
//    Chef(String name, int age) { super(name, age); }
//    public void performDuties() { System.out.println(name + " cooks food."); }
//}
//
//class Waiter extends Person implements Worker {
//    Waiter(String name, int age) { super(name, age); }
//    public void performDuties() { System.out.println(name + " serves customers."); }
//}
//
//interface Refuelable {
//    void refuel();
//}
//
//class BaseVehicle {
//    int maxSpeed;
//    String model;
//    BaseVehicle(int maxSpeed, String model) { this.maxSpeed = maxSpeed; this.model = model; }
//}
//
//class ElectricVehicle extends BaseVehicle {
//    ElectricVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
//    void charge() { System.out.println(model + " is charging..."); }
//}
//
//class PetrolVehicle extends BaseVehicle implements Refuelable {
//    PetrolVehicle(int maxSpeed, String model) { super(maxSpeed, model); }
//    public void refuel() { System.out.println(model + " is refueling with petrol..."); }
//}
