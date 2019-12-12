package fibonacci;

class FunctionalFibonacciTest extends FibonacciTest {
  @Override
  Fibonacci createFibonacci() {
    return new FunctionalFibonacci();
  }
}