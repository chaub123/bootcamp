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

  public char[] toCharArray(){
    char[] result = new char[this.string.length()];
    for(int i=0; i<result.length; i++){
      result[i] = this.string.charAt(i);
    }
    return result;
  }

  public StringBox append(String string){
    this.string += string;
    return this;
  }
}
