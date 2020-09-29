import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class CharReplaceChecker {
    private Map<Character, Character> map = new HashMap<>();

    public Boolean canReplace(char first, char second) {
        if (existReplaced(first, second)) {
            return true;
        }
        if (oneCharReplaced(first, second)) {
            return false;
        }
        map.put(first, second);
        return true;
    }

    private boolean oneCharReplaced(char first, char second) {
        String charListString = getReplacedCharsStr();
        return charListString.indexOf(first) >= 0
                || charListString.indexOf(second) >= 0;
    }

    private String getReplacedCharsStr() {
        return map.entrySet().stream()
                .map(entry -> entry.getKey() + "," + entry.getValue())
                .collect(Collectors.joining(","));
    }

    private boolean existReplaced(char first, char second) {
        return map.entrySet().stream()
                .anyMatch(entry -> (entry.getKey().equals(first)
                        && entry.getValue().equals(second)));
    }

    public Integer size() {
        return map.size();
    }
}
