//Generic

public class Printer<T> { // step 1. add a <T>
  T value;

  public T getValue(){
    return this.value;
  }

  public void setValue(T value){
    this.value = value;
  }
}
