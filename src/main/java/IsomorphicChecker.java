import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicChecker {
    private final String first;
    private final String second;
    private static HashMap<Character, Character> map = new HashMap<>();

    public IsomorphicChecker(String first, String second) {

        this.first = first;
        this.second = second;
    }

    public static boolean check(String first, String second) {
        return new IsomorphicChecker(first, second).checkSS(first, second);
    }

    private boolean checkSS(String first, String second) {
        map = new HashMap<>();
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        for (int i = 0; i < firstChars.length; i++) {
            if (check(map, firstChars[i], secondChars[i])) {
                return false;
            } else {
                map.put(firstChars[i], secondChars[i]);
            }
        }
        return true;
    }

    private static boolean check(HashMap<Character, Character> map, char firstChar, char secondChar) {
        return (map.containsKey(firstChar) && !map.containsValue(secondChar))
                || (!map.containsKey(firstChar) && map.containsValue(secondChar))
                || (map.containsKey(secondChar) && !map.containsValue(firstChar))
                || (!map.containsKey(secondChar) && map.containsValue(firstChar));
    }
}
