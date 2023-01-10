public class Main {
  public static void main(String[] args) {
    Car car = new Car(900);

    car.startEngine();
    car.accelerate();
    car.changeGear(2);

    Plane plane = new Plane(12000);

    plane.startEngine();
    plane.takeOff();
    plane.changeHeight(45);

    FlyingCar flyingcar = new FlyingCar(1200);

    flyingcar.startEngine();
    flyingcar.takeOff();
    flyingcar.accelerate();
    flyingcar.changeGear(5);
  }
}
