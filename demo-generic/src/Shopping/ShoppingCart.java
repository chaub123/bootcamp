package Shopping;
import java.util.ArrayList;

public class ShoppingCart <T extends Food> {
  private ArrayList<T> foods;

  public ShoppingCart(){
    foods = new ArrayList<>();
  }
  
}
