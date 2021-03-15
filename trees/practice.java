package trees;

public class practice {

  public class Equipments {
    private String name;
    private String description;
    private int distanceMoved;
    private int maintainanceCost;
    private int type;

    // Constructor
    public Equipments() {
      this.distanceMoved = 0;
      this.maintainanceCost = 0;
    }

    // Move By Method
    public void moveBy(int x) {
      setDistanceMoved(this.distanceMoved + x);
      // change the maintainance cost also
    }

    // getters

    public int getMaintainanceCost() {
      return this.maintainanceCost;
    }

    public int getDistanceMoved() {
      return this.distanceMoved;
    }

    // setters
    public void setMaintainanceCost(int x) {
      this.maintainanceCost = x;
    }

    public void setDistanceMoved(int x) {
      this.distanceMoved = x;
    }
  }

  // Inheriting Equipment Class to create Mobile Class
  public class Mobile extends Equipments {
    int numberOfWheels;

    // overriding moveby method
    public void moveBy(int x) {
      int temp = this.getDistanceMoved();
      temp += x;
      this.setDistanceMoved(temp);
      int cost = this.getMaintainanceCost();
      this.setMaintainanceCost(cost * this.numberOfWheels);
    }
  }
}
