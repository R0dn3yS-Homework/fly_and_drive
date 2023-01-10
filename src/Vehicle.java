abstract public class Vehicle {
  int speed = 0;
  float weight;

  public Vehicle(float weight) {
    this.weight = weight;
  }

  abstract void startEngine();
  abstract void turnOffEngine();
}
