package fibonacci;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public abstract class FibonacciTest {
  private Fibonacci fibonacci;

  @BeforeEach
  void setUp() {
    fibonacci = createFibonacci();
  }

  @Test
  void canary() {
    assertTrue(true);
  }

  abstract Fibonacci createFibonacci();

  @Test
  void testFibonacciTestCases() {
    assertAll(
      () -> assertEquals(1, fibonacci.nthFibonacci(0)),
      () -> assertEquals(1, fibonacci.nthFibonacci(1)),
      () -> assertEquals(2, fibonacci.nthFibonacci(2)),
      () -> assertEquals(3, fibonacci.nthFibonacci(3)),
      () -> assertEquals(5, fibonacci.nthFibonacci(4)),
      () -> assertEquals(8, fibonacci.nthFibonacci(5)),
      () -> assertEquals(514229, fibonacci.nthFibonacci(28))
    );
  }

  @Test
  void testThrowsNegative() {
    assertThrows(IllegalArgumentException.class,
      () -> fibonacci.nthFibonacci(-1));
  }
}
