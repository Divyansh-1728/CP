package CarQuestions;
//class Car {
//    String model;
//    int year;
//    Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//    }
//    public static void main(String[] args) {
//        Car car1 = new Car("Honda City", 2020);
//        Car car2 = new Car("Swift", 2018);
//
//        System.out.println("CarQuestions.Car 1: " + car1.model + ", " + car1.year);
//        System.out.println("CarQuestions.Car 2: " + car2.model + ", " + car2.year);
//    }
//}

//Q2
//class Car {
//    String model;
//    int year;
//    static int numberOfCars = 0;
//
//    Car(String model, int year) {
//        this.model = model;
//        this.year = year;
//        numberOfCars++;
//    }
//    public static void main(String[] args) {
//        Car c1 = new Car("Honda", 2020);
//        Car c2 = new Car("Swift", 2018);
//
//        System.out.println("Total number of cars created: " + Car.numberOfCars);
//    }
//}

//q3
//class Q3 {
//    void show() {
//        int x = 10;  // local variable
//        System.out.println("Inside method: " + x);
//    }
//
//    public static void main(String[] args) {
//        Q3 obj = new Q3();
//        obj.show();
//
//    }
//}

//q4
//class Q4 {
//    String name;
//    int marks;
//
//    Q4(String name, int marks) {
//        this.name = name;
//        this.marks = marks;
//    }
//
//    public static void main(String[] args) {
//        Q4 s1 = new Q4("Dev", 85);
//        Q4 s2 = new Q4("Aman", 90);
//
//        System.out.println("Student 1: " + s1.name + ", Marks: " + s1.marks);
//        System.out.println("Student 2: " + s2.name + ", Marks: " + s2.marks);
//    }
//}

//q5
//class Q5 {
//    static int num = 0;
//
//    public static void main(String[] args) {
//        Q5 a = new Q5();
//        Q5 b = new Q5();
//
//        a.num = 5;  // modify static using object a
//        System.out.println("Value from object b: " + b.num); // Shows 5
//    }
//}

//q6
//class Q6 {
//    int number = 100;  // instance variable
//
//    void display() {
//        int number = 50;  // local variable
//        System.out.println("Local variable: " + number);
//        System.out.println("Instance variable: " + this.number);
//    }
//
//    public static void main(String[] args) {
//        Q6 obj = new Q6();
//        obj.display();
//    }
//}


//q7
//class Q7 {
//    final int value = 10;
//    public static void main(String[] args) {
//        Q7 obj = new Q7();
//    }
//}

//q8
//class Q8 {
//    static int a;
//    static {
//        a = 50;
//        System.out.println("Static block executed, a = " + a);
//    }
//    public static void main(String[] args) {
//        System.out.println("Inside main, a = " + a);
//    }
//}

//q9
//class Q9 {
//    String accountHolder;
//    double balance;
//    public static void main(String[] args) {
//        Q9 acc = new Q9();
//        System.out.println("Name: " + acc.accountHolder);
//        System.out.println("Balance: " + acc.balance);
//    }
//}

//q10
//class Q10 {
//    static int staticVar = 10;
//    int instanceVar = 20;
//
//    void show() {
//        int localVar = 30;
//        System.out.println("Static = " + staticVar);
//        System.out.println("Instance = " + instanceVar);
//        System.out.println("Local = " + localVar);
//    }
//
//    public static void main(String[] args) {
//        Q10 obj = new Q10();
//        obj.show();
//    }
//}

//q11
//class Q11 {
//    static int x;
//    public static void main(String[] args) {
//        System.out.println("Default value of x = " + x);
//        x = 50;
//        System.out.println("After assigning, x = " + x);
//    }
//}

//q12
//class Q12 {
//    final int userId;
//
//    Q12(int userId) {
//        this.userId = userId;
//    }
//
//    public static void main(String[] args) {
//        Q12 u = new Q12(101);
//        System.out.println("User ID = " + u.userId);
//    }
//}

//q13
//class A {
//    static int x = 10;
//}
//
//class B {
//    public static void main(String[] args) {
//        A.x = 50;   // change static variable from A
//        System.out.println("Value of x = " + A.x);
//    }
//}

//q14
//class Q14 {
//    int age;
//
//    void setAge(int age) {
//        this.age = age;   // this keyword
//    }
//
//    public static void main(String[] args) {
//        Q14 p = new Q14();
//        p.setAge(25);
//        System.out.println("Age = " + p.age);
//    }
//}

//q15
//class Q15 {
//    int count = 0;
//
//    void increase() {
//        count++;
//    }
//    void show() {
//        System.out.println("Count = " + count);
//    }
//    public static void main(String[] args) {
//        Q15 obj = new Q15();
//        obj.increase();
//        obj.increase();
//        obj.show();
//    }
//}


//q16
//class Q16 {
//    public static void main(String[] args) {
//        int x;
//    }
//}

//q17
//class Q17 {
//    static final double PI = 3.14;
//
//    public static void main(String[] args) {
//        System.out.println("Pi = " + PI);
//    }
//}


//q18
class Q18 {
    int num = 100; // instance

    void test() {
        int num = 50; // local
        System.out.println("Local num = " + num);
        System.out.println("Instance num = " + this.num);
    }

    public static void main(String[] args) {
        Q18 obj = new Q18();
        obj.test();
    }
}
