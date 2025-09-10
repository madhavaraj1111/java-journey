import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        String s = "846";
        System.out.println(possibleWords(s, ""));

    }

    static List < String > possibleWords(String s, String ans) {
        ArrayList < String > possible = new ArrayList < > ();
        String[] keypad = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz"
        };

        if (s.length() == 0) {
            possible.add(ans);
            return possible;
        }

        String key = keypad[s.charAt(0) - 48];
        for (int i = 0; i < key.length(); i++) {
            possible.addAll(possibleWords(s.substring(1), ans + key.charAt(i)));
        }
        
        return possible;

    }
}