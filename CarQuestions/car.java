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
class Car {
    String model;
    int year;
    static int numberOfCars = 0;

    Car(String model, int year) {
        this.model = model;
        this.year = year;
        numberOfCars++;
    }

    public static void main(String[] args) {
        Car c1 = new Car("Honda", 2020);
        Car c2 = new Car("Swift", 2018);

        System.out.println("Total number of cars created: " + Car.numberOfCars);
    }
}

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


