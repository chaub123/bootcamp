import java.util.Arrays;

public class StringBox2 {
  char[] string;

  public StringBox2(){
  }

  public StringBox2(char[] string){
    this.string = Arrays.copyOf(string, string.length);
  }

  public char[] getString(){
    return this.string;
  }
  
  public String toString(){
    return Arrays.toString(this.string);
  }

  public StringBox2 append(String string){
    char[] chars = Arrays.copyOf(this.string, this.string.length + string.length());

    for(int i=this.string.length, k=0; i < chars.length; i++){
      chars[i] = string.charAt(k++);
    }
    
    this.string = chars;
    return this;
  }


  public static void main(String[] args) {
    char[] chars = new char[] {'a', 'b', 'c'};

    StringBox2 sb2 = new StringBox2(chars);
    System.out.println(sb2.toString()); // [a, b, c]

    chars[1] = 'z';
    System.out.println(sb2.toString()); // [a, z, c]

    sb2.append("hi");

    System.out.println(sb2.toString()); // [a, z, c]

  }
}
