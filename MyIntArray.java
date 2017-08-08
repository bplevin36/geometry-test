public class MyIntArray extends Object{
  public int[] underlying;
  public MyIntArray(int[] mainArray) {
    this.underlying = mainArray;
  }
  public MyIntArray(int length) {
    this(new int[Math.max(0, length)]);
  }
  public MyIntArray() {
    this(0);
  }
  public int length() {
    return this.underlying.length;
  }
  public int get(int index) { //accessor: returns an underlying piece of data
    if (index < this.underlying.length && index >= 0) {
      return this.underlying[index];
    } else {
      return Integer.MAX_VALUE;
    }
  }
  public void set(int index, int change) { //mutator: changes an underlying piece of data
    if (index < this.underlying.length && index >= 0) {
      this.underlying[index] = change;
    }
  }
  public int findGreatest() {
    int baseMax = underlying[0];
    for (int i = 0; i < underlying.length; i = i + 1) {
      if (baseMax < underlying[i]) {
        baseMax = underlying[i];
      }
    }
    return baseMax;
  }
  public int findLeast() {
    int baseMin = underlying[0];
    for (int i = 0; i < underlying.length; i = i + 1) {
      if (baseMin > underlying[i]) {
        baseMin = underlying[i];
      }
    }
    return baseMin;
  }
  public void print() {
    System.out.println(this);
  }
  @Override
  public String toString() {
    String all = "" + this.get(0);
    for (int i = 1; i < this.length(); i = i + 1) {
      all = all + ", " + this.get(i);
    }
    return all;
  }
}
