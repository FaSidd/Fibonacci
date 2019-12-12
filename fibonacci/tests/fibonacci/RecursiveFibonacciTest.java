package fibonacci;

class RecursiveFibonacciTest extends FibonacciTest {
  @Override
  Fibonacci createFibonacci() {
    return new RecursiveFibonacci();
  }
}