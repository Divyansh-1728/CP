class Car {
    String model;
    int year;
    Car(String model, int year) {
        this.model = model;
        this.year = year;
    }
    public static void main(String[] args) {
        Car car1 = new Car("Honda City", 2020);
        Car car2 = new Car("Swift", 2018);

        System.out.println("Car 1: " + car1.model + ", " + car1.year);
        System.out.println("Car 2: " + car2.model + ", " + car2.year);
    }
}
