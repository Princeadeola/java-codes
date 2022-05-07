package TypeCasting.Object_Casting;

class Vehicles {

}

class Car extends Vehicles {
    static void method(Vehicles v) {

        if (v instanceof Car) {

            // Downcasting
            Car c = (Car)v;

            System.out.println("Downcasting performed");
        }
    }

    public static void main(String[] args) {
        // Creating an object of Vehicle class
        // and referring it to Car class
        Vehicles v = new Car();
        Car.method(v);
    }
}

