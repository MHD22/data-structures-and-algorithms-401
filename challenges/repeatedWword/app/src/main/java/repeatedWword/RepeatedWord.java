package repeatedWword;

import hashtable.Hashtable;

import java.util.Arrays;

public class RepeatedWord {


    public static void main(String[] args) {
        String test = "It was a queer, sultry summer, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        System.out.println(getFirstRepeatedWord(test));
    }

    public static String getFirstRepeatedWord(String book){
        Hashtable<Integer> dictionary = new Hashtable<>();
        book = book.toLowerCase();
        String[] words = book.split("(\s+)|(,\s*)");
        for (String word : words){
            if( dictionary.contains(word))
                return word;
            else
                dictionary.add(word,1);
        }
        return null;
    }
}
