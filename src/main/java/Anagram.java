import java.util.Arrays;

public class Anagram {

    public static void main(String args[]){
        String lhs = "dealer";
        String rhs = "leader";
        System.out.println("Result is: " + isAnagram(lhs, rhs));
    }

    private static boolean isAnagram(String lhs, String rhs) {
        // the length should be equal for anagram
        if(lhs.length() != rhs.length()){
            return false;
        }

        //Convert the String to Char array, do sort and check
        char[] lhsArray = lhs.toLowerCase().toCharArray();
        char[] rhsArray = rhs.toLowerCase().toCharArray();
        Arrays.sort(lhsArray);
        Arrays.sort(rhsArray);
        return Arrays.equals(lhsArray,rhsArray);
    }


}
