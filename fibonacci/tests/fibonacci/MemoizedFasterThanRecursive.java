package fibonacci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MemoizedFasterThanRecursive {
  @Test
  void verifyMemoizedFasterThanRecursive() {
    long memoizedCPUTime = timeFibonacci(new MemoizedFibonacci());
    long recursiveCPUTime = timeFibonacci(new RecursiveFibonacci());
    assertTrue(memoizedCPUTime * 10 < recursiveCPUTime);
  }

  long timeFibonacci(Fibonacci fib) {
    long startTime = System.currentTimeMillis();
    fib.nthFibonacci(30);
    long endTime = System.currentTimeMillis();

    return (endTime - startTime);
  }
}
