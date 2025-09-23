public class Assignment_14 {
    abstract class Employee {
        private int employeeId; private String name; private double baseSalary;
        public Employee(int id,String n,double s){employeeId=id;name=n;baseSalary=s;}
        public int getId(){return employeeId;} public String getName(){return name;} public double getBaseSalary(){return baseSalary;}
        abstract double calculateSalary();
        public void displayDetails(){System.out.println("ID:"+employeeId+" Name:"+name+" Salary:"+calculateSalary());}
    }
    class FullTimeEmployee extends Employee {
        public FullTimeEmployee(int id,String n,double s){super(id,n,s);}
        double calculateSalary(){return getBaseSalary();}
    }
    class PartTimeEmployee extends Employee {
        private int hours; public PartTimeEmployee(int id,String n,double s,int h){super(id,n,s);hours=h;}
        double calculateSalary(){return hours*getBaseSalary();}
    }
    interface Department{void assignDepartment(String d);String getDepartmentDetails();}
    class EmpDept implements Department{
        String dept; public void assignDepartment(String d){dept=d;} public String getDepartmentDetails(){return dept;}
    }

    //  2. E-COMMERCE
    abstract class Product {
        private int id; private String name; private double price;
        public Product(int i,String n,double p){id=i;name=n;price=p;}
        public double getPrice(){return price;} public String getName(){return name;}
        abstract double calculateDiscount();
    }
    interface Taxable{double calculateTax();String getTaxDetails();}
    class Electronics extends Product implements Taxable {
        public Electronics(int i,String n,double p){super(i,n,p);}
        public double calculateDiscount(){return getPrice()*0.1;}
        public double calculateTax(){return getPrice()*0.18;} public String getTaxDetails(){return "18% GST";}
    }
    class Clothing extends Product implements Taxable {
        public Clothing(int i,String n,double p){super(i,n,p);}
        public double calculateDiscount(){return getPrice()*0.2;}
        public double calculateTax(){return getPrice()*0.05;} public String getTaxDetails(){return "5% GST";}
    }
    class Groceries extends Product {
        public Groceries(int i,String n,double p){super(i,n,p);}
        public double calculateDiscount(){return getPrice()*0.05;}
    }

    //  3. VEHICLE RENTAL
    abstract class Vehicle {
        private String number,type; private double rate;
        public Vehicle(String n,String t,double r){number=n;type=t;rate=r;}
        public String getType(){return type;} public double getRate(){return rate;}
        abstract double calculateRentalCost(int days);
    }
    interface Insurable{double calculateInsurance();String getInsuranceDetails();}
    class Car extends Vehicle implements Insurable{
        public Car(String n){super(n,"Car",1000);}
        double calculateRentalCost(int d){return d*getRate();}
        public double calculateInsurance(){return 2000;} public String getInsuranceDetails(){return "Car Insurance";}
    }
    class Bike extends Vehicle implements Insurable{
        public Bike(String n){super(n,"Bike",500);}
        double calculateRentalCost(int d){return d*getRate();}
        public double calculateInsurance(){return 500;} public String getInsuranceDetails(){return "Bike Insurance";}
    }

    //  4. BANKING SYSTEM
    abstract class BankAccount {
        private int acc; private String name; private double bal;
        public BankAccount(int a,String n,double b){acc=a;name=n;bal=b;}
        public void deposit(double amt){bal+=amt;} public void withdraw(double amt){bal-=amt;}
        public double getBalance(){return bal;} public String getName(){return name;}
        abstract double calculateInterest();
    }
    interface Loanable{void applyForLoan();boolean calculateLoanEligibility();}
    class SavingsAccount extends BankAccount implements Loanable{
        public SavingsAccount(int a,String n,double b){super(a,n,b);}
        double calculateInterest(){return getBalance()*0.04;}
        public void applyForLoan(){System.out.println("Applied Loan: Savings");}
        public boolean calculateLoanEligibility(){return getBalance()>5000;}
    }
    class CurrentAccount extends BankAccount {
        public CurrentAccount(int a,String n,double b){super(a,n,b);}
        double calculateInterest(){return getBalance()*0.02;}
    }

    //  5. LIBRARY
    abstract class LibraryItem{
        private int id; private String title,author;
        public LibraryItem(int i,String t,String a){id=i;title=t;author=a;}
        public void getItemDetails(){System.out.println("Item:"+title+" Author:"+author);}
        abstract int getLoanDuration();
    }
    interface Reservable{void reserveItem();boolean checkAvailability();}
    class Book extends LibraryItem implements Reservable{
        public Book(int i,String t,String a){super(i,t,a);}
        int getLoanDuration(){return 14;}
        public void reserveItem(){System.out.println("Book Reserved");}
        public boolean checkAvailability(){return true;}
    }
    class Magazine extends LibraryItem{public Magazine(int i,String t,String a){super(i,t,a);} int getLoanDuration(){return 7;}}
    class DVD extends LibraryItem{public DVD(int i,String t,String a){super(i,t,a);} int getLoanDuration(){return 3;}}

    //  6. FOOD DELIVERY
    abstract class FoodItem{
        private String name; private double price; private int qty;
        public FoodItem(String n,double p,int q){name=n;price=p;qty=q;}
        public String getName(){return name;} public double getPrice(){return price;} public int getQty(){return qty;}
        abstract double calculateTotalPrice();
    }
    interface Discountable{double applyDiscount();String getDiscountDetails();}
    class VegItem extends FoodItem implements Discountable{
        public VegItem(String n,double p,int q){super(n,p,q);}
        double calculateTotalPrice(){return getPrice()*getQty();}
        public double applyDiscount(){return calculateTotalPrice()*0.1;}
        public String getDiscountDetails(){return "10% Veg Discount";}
    }
    class NonVegItem extends FoodItem{
        public NonVegItem(String n,double p,int q){super(n,p,q);}
        double calculateTotalPrice(){return getPrice()*getQty()+50;} // extra charge
    }

    //  7. HOSPITAL
    abstract class Patient{
        private int id; private String name; private int age;
        public Patient(int i,String n,int a){id=i;name=n;age=a;}
        public void getPatientDetails(){System.out.println("Patient:"+name+" Age:"+age);}
        abstract double calculateBill();
    }
    interface MedicalRecord{void addRecord(String r);void viewRecords();}
    class InPatient extends Patient implements MedicalRecord{
        public InPatient(int i,String n,int a){super(i,n,a);}
        double calculateBill(){return 5000;}
        public void addRecord(String r){System.out.println("Record added:"+r);}
        public void viewRecords(){System.out.println("Viewing InPatient records");}
    }
    class OutPatient extends Patient{public OutPatient(int i,String n,int a){super(i,n,a);} double calculateBill(){return 1000;}}

    //  8. RIDE HAILING
    abstract class RideVehicle{
        private int id; private String driver; private double rate;
        public RideVehicle(int i,String d,double r){id=i;driver=d;rate=r;}
        public String getDriver(){return driver;} public double getRate(){return rate;}
        abstract double calculateFare(double dist);
        public void getVehicleDetails(){System.out.println("Driver:"+driver);}
    }
    interface GPS{String getCurrentLocation();void updateLocation(String loc);}
    class RideCar extends RideVehicle implements GPS{
        public RideCar(int i,String d){super(i,d,15);}
        double calculateFare(double dist){return dist*getRate();}
        public String getCurrentLocation(){return "Delhi";} public void updateLocation(String l){System.out.println("Moved to "+l);}
    }
    class RideBike extends RideVehicle{
        public RideBike(int i,String d){super(i,d,10);}
        double calculateFare(double dist){return dist*getRate();}
    }

    //  MAIN
    public class Main {
        public static void main(String[] args){
            Employee e1=new FullTimeEmployee(1,"Dev",30000);
            Employee e2=new PartTimeEmployee(2,"Raj",200,40);
            e1.displayDetails(); e2.displayDetails();

            Product p1=new Electronics(1,"Laptop",50000);
            System.out.println("Final Price:"+ (p1.getPrice()+((Taxable)p1).calculateTax()-p1.calculateDiscount()));

            Vehicle v1=new Car("UP32-1234"); System.out.println("Car Rent:"+v1.calculateRentalCost(5));

            BankAccount acc=new SavingsAccount(101,"Aman",10000);
            System.out.println("Interest:"+acc.calculateInterest());

            LibraryItem book=new Book(1,"Java","James"); book.getItemDetails();

            FoodItem f1=new VegItem("Paneer",200,2); System.out.println("Food Bill:"+f1.calculateTotalPrice());

            Patient ptn=new InPatient(1,"Rahul",30); ptn.getPatientDetails(); System.out.println("Bill:"+ptn.calculateBill());

            RideVehicle rv=new RideCar(1,"Driver1"); System.out.println("Fare:"+rv.calculateFare(12));
        }
    }

}
