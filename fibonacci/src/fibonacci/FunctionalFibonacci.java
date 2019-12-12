package fibonacci;

import java.util.stream.Stream;

public class FunctionalFibonacci implements Fibonacci {
  public long nthFibonacci(long position) {
    assertNonNegativePosition(position);

    return Stream.iterate(new long[] {0, 1},
      series -> new long[] { series[1], series[0] + series[1] })
      .map(series -> series[1])
      .limit(position + 1)
      .skip(position)
      .findFirst()
      .orElse(1L);
  }
}
