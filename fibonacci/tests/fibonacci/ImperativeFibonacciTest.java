package fibonacci;

class ImperativeFibonacciTest extends FibonacciTest {
  @Override
  Fibonacci createFibonacci() {
    return new ImperativeFibonacci();
  }
}