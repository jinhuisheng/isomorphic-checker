
/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class IsomorphicChecker {
    public static Boolean check(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        CharReplaceChecker charReplaceChecker = new CharReplaceChecker();
        for (int i = 0; i < first.length(); i++) {
            char firstChar = first.charAt(i);
            char secondChar = second.charAt(i);
            if (!charReplaceChecker.canReplace(firstChar, secondChar)) {
                return false;
            }
        }
        return true;
    }
}
