package fibonacci;

public class RecursiveFibonacci implements Fibonacci {

  @Override
  public long nthFibonacci(long position) {
    assertNonNegativePosition(position);

    if (position < 2) {
      return 1;
    }

    return nthFibonacci(position - 1) + nthFibonacci(position - 2);
  }
}
