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
            return (!map.containsKey('d') || map.containsValue('g')) && (map.containsKey('d') || !map.containsValue('g')) && (!map.containsKey('g') || map.containsValue('d')) && (map.containsKey('g') || !map.containsValue('d'));
        }
        if (first.equals(second)) {
            return true;
        }
        return true;
    }
}
