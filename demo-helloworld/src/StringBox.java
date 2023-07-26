public class StringBox {
  private String string;

  public StringBox(){

  }

  public StringBox(String string){
    this.string = string;
  }
  
  public String getString(){
    return this.string;
  }

  public void setString(String string){
    this.string = string;
  }

  public String toString(){
    return this.string;
  }

  public StringBox append(String string){
    this.string += string;
    return this;
  }
}
