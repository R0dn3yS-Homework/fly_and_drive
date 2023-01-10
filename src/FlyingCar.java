public class FlyingCar extends Vehicle implements Driveable, Flyable {
  boolean engineOn = false;
  int gear = 1;
  boolean onGround = true;
  float height = 0;

  public FlyingCar(float weight) {
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

  @Override
  public void takeOff() {
    if (onGround) {
      System.out.println("Flying car has taken off.");
      onGround = false;
    } else {
      System.out.println("Flying car has already taken off");
    }
  }

  @Override
  public void land() {
    if (!onGround) {
      System.out.println("Flying car has landed");
      onGround = true;
    } else {
      System.out.println("Flying car is already on the ground");
    }
  }

  @Override
  public void changeHeight(float newHeight) {
    if (height > 0) {
      height = newHeight;
    }
  }
}
