import java.util.Arrays;

public class Anagram {
    public static void main(String args[]){
        String lhs = "leader";
        String rhs = "dealer1";
        System.out.println(isAnagram(lhs, rhs));
        System.out.println(isAnagramOtherWay(lhs, rhs));
    }

    private static boolean isAnagramOtherWay(String lhs, String rhs) {
        //They have to be similar length to achieve it as Anagrams
        if(lhs.length() != rhs.length()){
            return false;
        }
        String temp = rhs;
        char[] lhsArray = lhs.toLowerCase().toCharArray();
        //Check each character in a lhs String with rhs and if present remove the character from the rhs
        for(int i=0; i<lhsArray.length; i++){
            if(!temp.contains(String.valueOf(lhsArray[i]))){
                return false;
            }
            temp = rhs.replaceFirst(String.valueOf(lhsArray[i]) , "");
            rhs = temp;
        }
        return true;
    }

    private static boolean isAnagram(String lhs, String rhs) {
        //They have to be similar length to achieve it as Anagrams
        if(lhs.length() != rhs.length()){
            return false;
        }

        //Sort the String based on the characters and then compare. If both are equal then its a Anagram
        char[] lhsArray = lhs.toLowerCase().toCharArray();
        char[] rhsArray = rhs.toLowerCase().toCharArray();
        Arrays.sort(lhsArray);
        Arrays.sort(rhsArray);
        return Arrays.equals(lhsArray, rhsArray);
    }
}
