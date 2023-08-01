package day17;

import java.math.BigDecimal;

public abstract class Shape {



  public abstract double area();

  public static double area(Shape[] shapes){
    BigDecimal total = BigDecimal.valueOf(0);
    for(Shape s : shapes){
      total = total.add(BigDecimal.valueOf(s.area()));  
    }

    return total.doubleValue();
    
  }


}
