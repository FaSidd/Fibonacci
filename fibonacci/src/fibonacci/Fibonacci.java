package fibonacci;

public interface Fibonacci {
  long nthFibonacci(long position);

  default void assertNonNegativePosition(long position) {
    if (position < 0) {
      throw new IllegalArgumentException(
        "fibonacci position cannot be negative");
    }
  }
}
