import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicChecker {
    private final String first;
    private final String second;
    private HashMap<Character, Character> map = new HashMap<>();

    public IsomorphicChecker(String first, String second) {
        this.first = first;
        this.second = second;
    }

    public static boolean check(String first, String second) {
        return new IsomorphicChecker(first, second).check();
    }

    private boolean check() {
        char[] firstChars = first.toCharArray();
        char[] secondChars = second.toCharArray();
        for (int i = 0; i < firstChars.length; i++) {
            if (isIsomorphic(firstChars[i], secondChars[i])) {
                map.put(firstChars[i], secondChars[i]);
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isIsomorphic(char firstChar, char secondChar) {
        return (map.containsKey(firstChar) && map.containsValue(secondChar)) ||
                (!map.containsKey(firstChar) && !map.containsValue(secondChar));
    }
}
