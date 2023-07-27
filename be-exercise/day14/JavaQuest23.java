/*
 * Question : given a string s of even length. Split this string into two halves of equal lengths, and let a be the first half and b be the second half.
 * 
 * Two strings are alike if they have the same number of vowels ('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'). Notice that s contains uppercase and lowercase letters.
 * 
 * Return true if a and b are alike. Otherwise, return false.
 */

// hints : substring() , toCharArray() ?
public class JavaQuest23 {
  public static void main(String[] args) {
    System.out.println(sameNumberOfVowels("book")); // true
    System.out.println(sameNumberOfVowels("textbook")); // false
  }

  public static boolean sameNumberOfVowels(String s) {
    // code here
    String first = s.substring(0, s.length() / 2 ).toLowerCase();
    String second = s.substring(s.length() / 2).toLowerCase();

    char[] vowels = {'a', 'e', 'i', 'o', 'u'};
    
    for(char v : vowels){
      first = first.replaceAll(Character.toString(v), "");
      second = second.replaceAll(Character.toString(v), "");
    }
    
    return first.length() == second.length();
  }
}
