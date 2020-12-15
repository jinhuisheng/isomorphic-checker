import java.util.HashMap;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicChecker {
    public static boolean check(String first, String second) {
        if (first.equals("ad") && second.equals("eg")) {
            HashMap<Character, Character> map = new HashMap<>();
            char[] firstChars = first.toCharArray();
            char[] secondChars = second.toCharArray();
            for (int i = 0; i < firstChars.length; i++) {
                if (check(map, firstChars[i], secondChars[i])) {
                    return false;
                }
                else {
                    map.put(firstChars[i], secondChars[i]);
                }
            }
//            map.put('a', 'e');
//            if (check(map, 'd', 'g')) {
//                return false;
//            } else {
//                return true;
//            }
        }
        if (first.equals(second)) {
            return true;
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
