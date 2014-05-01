import java.util.stream.LongStream;

public class MeasurePrime {
  public boolean isDivisible(long number, long divisor) {
    return number % divisor == 0;
  }

  //tag::sequential[]  
  public boolean isPrimeSequential(long number) {
    return number > 1 &&
      LongStream.range(2, number)
                .noneMatch(index -> isDivisible(number, index));
  }
  //end::sequential[]  

  //tag::concurrent[]  
  public boolean isPrimeConcurrent(long number) {
    return number > 1 &&
      LongStream.range(2, number)
                .parallel()
                .noneMatch(index -> isDivisible(number, index));
  }
  //end::concurrent[]  
  
  public static void main(String[] args) {
    //tag::measure[]  
    long number = 9999999967L;
    System.out.println(TimeIt.code(() -> new MeasurePrime().isPrimeSequential(number)));
    System.out.println(TimeIt.code(() -> new MeasurePrime().isPrimeConcurrent(number)));
    //end::measure[]  
  }
}
