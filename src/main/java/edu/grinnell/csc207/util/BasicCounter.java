package edu.grinnell.csc207.util;

public class BasicCounter implements Counter {

  protected int start;
  protected int count;

  public BasicCounter(int start) {
    this.count = start;
    this.start = start;
  }

  /**
   * Count something.
   *
   * @throws Exception
   *   When the count gets too large.
   */
  public void increment() throws Exception {
    this.count += 1;
  }

  /**
   * Reset the counter.
   */
  public void reset() {
    this.count = this.start;
  }

  /**
   * Get the value of the counter.
   *
   * @return the current value of the counter
   */
  public int get() {
    return count;
  }
  
}
