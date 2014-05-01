import java.util.*;

public class Total {
  //tag::imperative[]
  public int totalEven(List<Integer> values) {
    int result = 0;
    for(int e : values) {
      if(e % 2 == 0) result += e;
    }
    return result;
  }
  //end::imperative[]

  //tag::functional[]
  public int totalEven2(List<Integer> values) {
    return values.stream()
                 .filter(e -> e % 2 == 0)
                 .reduce(0, Math::addExact);
  }
  //end::functional[]
  
  public int compute(int x) {
    return 
      //tag::mutation[]
      x++ + 6 + x++;
      //end::mutation[]
  }

  public int compute2(int x) {
    return 
      //tag::pure[]
      2 * x + 7;
      //end::pure[]
  }
  
  public static void main(String[] args) {
    List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6);
    System.out.println(new Total().totalEven(list));
    System.out.println(new Total().totalEven2(list));
    
    System.out.println(new Total().compute(5));
    System.out.println(new Total().compute2(5));
  }
}