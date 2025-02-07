package facebook;

public class firstOccurence {
    
    static int occurence(String txt, String pat){


        if(txt.contains(pat)){
            return txt.indexOf(pat);
        }

        return -1;
    }
    public static void main(String args[]){

String txt="GeeksForGeeks";

String pat="For";

System.out.println(occurence(txt, pat));

    }
}
