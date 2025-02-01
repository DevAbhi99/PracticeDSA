package strings;

public class Strings {
    

    public static void main(String args[]){

  String s="heyman";

  String t="Heyman";

  String text=" hey";

  //charAt()

  System.out.println(s.charAt(0));

  //conpareTo() compares to strings lexicographically

  System.out.println(s.compareTo(t));

  //equals() to check if both the strings are equal

  System.out.println(s.equals(t));

  //equalsIgnoreCase() to check two strings ignoring the cases

  System.out.println(s.equalsIgnoreCase(t));

  //Convert string to char array[]

  char c[]=s.toCharArray();

  for(char i:c){
    System.out.println(i);
  }

  //Convert string to string array[]

  String str[]=s.split("");

  for(String i:str){
    System.out.println(i);
  }

//trim() removes spaces from the string

System.out.println(text.trim());

//substring(index included,last index excluded)

System.out.print(s.substring(1,3));

//concat() joins two strings

System.out.println(s.concat(t));

//contains() to check if a sequence of character exists in a string

System.out.println(s.contains("hey"));

//empty() to check if the string is empty

System.out.println(s.isEmpty());

//indexOf() to find index of a character in a string

System.out.println(s.indexOf("y"));

//String.valueOf(number) Converts number to string

int n=10;

String nn=String.valueOf(n);

System.out.println(nn);

    }
}
