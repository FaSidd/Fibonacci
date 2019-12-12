package fibonacci;

import org.junit.jupiter.api.Test;

class MemoizedFibonacciTest extends FibonacciTest {
  @Override
  Fibonacci createFibonacci() {
    return new MemoizedFibonacci();
  }
}