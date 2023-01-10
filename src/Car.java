public class Car extends Vehicle implements Driveable {
  boolean engineOn = false;
  int gear = 1;

  public Car(float weight) {
    super(weight);
  }

  @Override
  public void startEngine() {
    if (!engineOn) {
      System.out.println("Engine has started.");
      engineOn = true;
    } else {
      System.out.println("Engine already on.");
    }
  }

  @Override
  public void turnOffEngine() {
    if (engineOn) {
      System.out.println("Engine has stopped.");
      engineOn = false;
    } else {
      System.out.println("Engine already stopped.");
    }
  }

  @Override
  public void accelerate() {
    this.speed += 5;
    System.out.println("Accelerating, speed is now: " + this.speed);
  }

  @Override
  public void brake() {
    this.speed -= 5;
    System.out.println("Braking, speed is now: " + this.speed);
  }

  @Override
  public void changeGear(int newGear) {
    if (gear > 0 && gear < 7) {
      this.gear = newGear;
      System.out.println("Changed gear to " + newGear);
    }
  }
}
