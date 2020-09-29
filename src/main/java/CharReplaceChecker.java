import java.util.HashMap;
import java.util.Map;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class CharReplaceChecker {
    private Map<Character, Character> map = new HashMap<>();

    public Boolean canReplace(char first, char second) {
        if (checkValid(first, second)) {
            return false;
        }
        if (existReplaced(first, second)) {
            return true;
        }
        map.put(first, second);
        return true;
    }

    private boolean checkValid(char first, char second) {
        for (Map.Entry<Character, Character> entry : map.entrySet()) {
            Character key = entry.getKey();
            Character value = entry.getValue();
            if (key.equals(first) && !value.equals(second)) {
                return true;
            }
            if (key.equals(second) && !value.equals(first)) {
                return true;
            }
        }
        return false;
    }

    private boolean existReplaced(char first, char second) {
        return map.entrySet().stream()
                .anyMatch(entry -> (entry.getKey().equals(first)
                        && entry.getValue().equals(second))
                        || (entry.getKey().equals(second)
                        && entry.getValue().equals(first))
                );
    }

    public Integer size() {
        return map.size();
    }
}
