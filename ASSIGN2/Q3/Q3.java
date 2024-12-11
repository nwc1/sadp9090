interface Engine {
    void assemble();
}

class ElectricEngine implements Engine {
    @Override
    public void assemble() {
        System.out.println("Assembling electric engine.");
    }
}


class GasolineEngine implements Engine {
    @Override
    public void assemble() {
        System.out.println("Assembling gasoline engine.");
    }
}


abstract class Vehicle {
    protected Engine engine;

    protected Vehicle(Engine engine) {
        this.engine = engine;
    }

    abstract void produce();
}


class Car extends Vehicle {
    public Car(Engine engine) {
        super(engine);
    }

    @Override
    void produce() {
        System.out.println("Producing a car.");
        engine.assemble();
    }
}

class Bike extends Vehicle {
    public Bike(Engine engine) {
        super(engine);
    }

    @Override
    void produce() {
        System.out.println("Producing a bike.");
        engine.assemble();
    }
}


public class Q3 {
    public static void main(String[] args) {
        
        Vehicle electricCar = new Car(new ElectricEngine());
        electricCar.produce();

     
        Vehicle gasolineCar = new Car(new GasolineEngine());
        gasolineCar.produce();

        Vehicle electricBike = new Bike(new ElectricEngine());
        electricBike.produce();


        Vehicle gasolineBike = new Bike(new GasolineEngine());
        gasolineBike.produce();
    }
}
