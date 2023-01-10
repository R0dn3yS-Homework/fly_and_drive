public class Plane extends Vehicle implements Flyable {
  boolean engineOn = false;
  boolean onGround = true;
  float height = 0;

  public Plane(float weight) {
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
  public void takeOff() {
    if (onGround) {
      System.out.println("Plane has taken off.");
      onGround = false;
    } else {
      System.out.println("Plane has already taken off");
    }
  }

  @Override
  public void land() {
    if (!onGround) {
      System.out.println("Plane has landed");
      onGround = true;
    } else {
      System.out.println("Plane is already on the ground");
    }
  }

  @Override
  public void changeHeight(float newHeight) {
    if (height > 0) {
      height = newHeight;
    }
  }
}
