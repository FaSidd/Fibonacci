package fibonacci;

import fibonacci.Fibonacci;

public class ImperativeFibonacci implements Fibonacci {
  @Override
  public long nthFibonacci(long position) {
    assertNonNegativePosition(position);

    long current = 1, previous = 0;

    for (int i = 0; i < position; i++) {
      long temp = current + previous;
      previous = current;
      current = temp;
    }

    return current;
  }
}
