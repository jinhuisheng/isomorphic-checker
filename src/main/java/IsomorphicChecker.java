import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author huisheng.jin
 * @version 2019/12/21.
 */
public class IsomorphicChecker {
    public static boolean check(String first, String second) {
        String[] firstArray = first.split("");
        String[] secondArray = second.split("");

        Map<String, String> convertedChar = new HashMap<>(3);
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i].equals(secondArray[i])) {
                continue;
            }
            if (convertedChar.containsKey(secondArray[i])) {
                if (convertedChar.get(secondArray[i]).equals(firstArray[i])) {
                    firstArray[i] = secondArray[i];
                } else {
                    return false;
                }
            } else {
                if (convertedChar.containsValue(firstArray[i])) {
                    return false;
                } else {
                    convertedChar.put(secondArray[i], firstArray[i]);
                    firstArray[i] = secondArray[i];
                }
            }
        }

        return toString(firstArray).equals(second);
    }

    private static String toString(String[] firstArray) {
        return Arrays.stream(firstArray).reduce((x, y) -> x + y).get();
    }

}
