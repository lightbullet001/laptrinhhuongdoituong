package oo;

public class MyInteger{
  private int value;
  public boolean greaterThan (MyInteger other)  {
      return (this.value > other.value)
  }

  public boolean lessThan (MyInteger other)  {
      return (other greaterThan(this));
  }

  public MyInteger increament() {
      value++;
      return this;
  }
}
