package KunalProblems.arrays;

import java.util.Arrays;

public class BasicsOfArray {
    public static void main(String[] args) {
        System.out.println(checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    public static boolean checkIfPangram(String sentence) {
        boolean[] count = new boolean[26];
        for(int i =0; i<sentence.length(); i++){
            if(sentence.charAt(i)>='a' && sentence.charAt(i)<='z'){
                count[sentence.charAt(i)-97] = true;
            }
        }
        for (boolean value : count) {
            if (!value) {
                return false;
            }
        }
        return true;
    }
}
