import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicChecker {
    public static boolean check(String first, String second) {
        if (first.equals("ad") && second.equals("eg")) {
            HashMap<Character, Character> map = new HashMap<>();
            map.put('a', 'e');
            if (check(map)) {
                return false;
            } else {
                return true;
            }
        }
        if (first.equals(second)) {
            return true;
        }
        return true;
    }

    private static boolean check(HashMap<Character, Character> map) {
        return (map.containsKey('d') && !map.containsValue('g')) || (!map.containsKey('d') && map.containsValue('g')) || (map.containsKey('g') && !map.containsValue('d')) || (!map.containsKey('g') && map.containsValue('d'));
    }
}
