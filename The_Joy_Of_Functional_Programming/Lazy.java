import java.util.*;

public class Lazy {
  
  //tag::lazy[]
  public boolean isEven(int number) {
    System.out.println("isEven called for " + number);
    return number % 2 == 0;
  }
  
  public int doubleFirstEven(List<Integer> values) {
    return values.stream()
                 .filter(this::isEven)
                 .map(e -> e * 2)
                 .findFirst()
                 .orElse(0);
  }
  //end::lazy[]
  
  public void use() {
    //tag::call[]
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    
    doubleFirstEven(list);
    //end::call[]
  }

  public static void main(String[] args) {
    new Lazy().use();
  }
}