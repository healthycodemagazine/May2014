//tag::functional[]
import java.util.stream.LongStream;

public class PrimeFunctional {
  public boolean isDivisible(long number, long divisor) {
    return number % divisor == 0;
  }
  
  public boolean isPrime(long number) {
    return number > 1 &&
      LongStream.range(2, number)
                .noneMatch(index -> isDivisible(number, index));
  }
}
//end::functional[]
