public class Zoo<T> {
  T animal;

  public Zoo(T animal){
    this.animal = animal;
  }

  public T getAnimal(){
    return this.animal;
  }

  public void setAnimal(T animal){
    this.animal = animal;
  }
}
