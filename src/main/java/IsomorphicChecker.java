import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicChecker {
    private final String first;
    private final String second;
    private final HashMap<Character, Character> map;

    private IsomorphicChecker(String first, String second) {
        map = new HashMap<>();
        this.first = first;
        this.second = second;
    }

    public static boolean check(String first, String second) {
        return new IsomorphicChecker(first, second).check();
    }

    private boolean check() {
        for (int i = 0; i < first.length(); i++) {
            if (canReplace(first.charAt(i), second.charAt(i))) {
                map.put(first.charAt(i), second.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean canReplace(char firstChar, char secondChar) {
        return (map.containsKey(firstChar) && map.containsValue(secondChar)) ||
                (!map.containsKey(firstChar) && !map.containsValue(secondChar));
    }
}
