package rocks.zipcode.quiz4.fundamentals;

/**
 * @author leon on 21/12/2018.
 */
public class StringUtils {
    public static Character getMiddleCharacter(String string) {
        int Middle = string.length()/2;
        char output = (string.charAt(Middle));

        return output;
    }

    public static String capitalizeMiddleCharacter(String str) {
        int Middle = str.length();
        String output = "";
        for (int c = 0; c < Middle; c++){
            if(c == Middle/2){
                char x = Character.toUpperCase(str.charAt(c));
                output +=x;
            }else{
                output += str.charAt(c);
            }
        }

        return output;
    }

    public static String lowerCaseMiddleCharacter(String str) {
        int Middle = str.length();
        String output = "";
        for (int c = 0; c < Middle; c++){
            if(c == Middle/2){
                char x = Character.toLowerCase(str.charAt(c));
                output +=x;
            }else{
                output += str.charAt(c);
            }
        }

        return output;
    }


    public static Boolean isIsogram(String str) {
        return null;
    }

    public static Boolean hasDuplicateConsecutiveCharacters(String str) {
        return null;
    }

    public static String removeConsecutiveDuplicateCharacters(String str) {
        return null;
    }

    public static String invertCasing(String str) {
        return null;
    }
}