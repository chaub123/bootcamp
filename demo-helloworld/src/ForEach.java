import java.util.Arrays;

public class ForEach {
  public static void main(String[] args) {
    String str = "Hello World ! I am Vincent and today is raining cat and dog!";
    
    int space = 0;
    for(char i:str.toCharArray()){
      if(i == ' ') space++;
    }

    String[] strings = new String[space +1];

    for(int i=0, arrayIdx=0, strIdx=0; i<str.length();i++){
      if(str.charAt(i) == ' '){
        strings[arrayIdx] = str.substring(strIdx, i);
        strIdx = i+1;
        arrayIdx++;
        continue;
      }

      if(arrayIdx == space){
        strings[arrayIdx] = str.substring(strIdx);
        break;
      }
    }

    System.out.println(Arrays.toString(strings));
  }
}
