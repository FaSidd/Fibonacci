package fibonacci;

import java.util.HashMap;
import java.util.Map;

public class MemoizedFibonacci extends RecursiveFibonacci {
  private Map<Long, Long> cache = new HashMap<>();

  @Override
  public long nthFibonacci(long position) {
    if (!cache.containsKey(position)) {
      cache.put(position, super.nthFibonacci(position));
    }

    return cache.get(position);
  }
}
