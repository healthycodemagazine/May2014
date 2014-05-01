import java.time.*;
import java.time.temporal.Temporal;
import java.util.function.Supplier;

public class TimeIt {
  public static <T> T code(Supplier<T> block) {
    final Temporal start = LocalDateTime.now();
    try {
      return block.get();
    } finally {
      final Temporal end = LocalDateTime.now();
      System.out.println("Time taken(s): " +
         Duration.between(start, end).getSeconds());      
    }
  }
}