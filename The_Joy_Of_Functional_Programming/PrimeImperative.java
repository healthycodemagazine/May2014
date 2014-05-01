//tag::imperative[]
public class PrimeImperative {
  public boolean isDivisible(long number, long divisor) {
    return number % divisor == 0;
  }
  
  public boolean isPrime(long number) {
    for(long i = 2; i < number; i++) {
      if(isDivisible(number, i)) return false;
    }
    return number > 1;
  }
}
//end::imperative[]
