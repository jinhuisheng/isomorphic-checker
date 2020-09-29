import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class IsomorphicCheckerTest {
    @Test
    void should_be_isomorphic_with_itself() {
        assertIsomorphic("a", "a", true);
    }

    @Test
    void should_be_not_isomorphic_with_different_length() {
        assertIsomorphic("a", "ab", false);
    }

    @Test
    void should_be_isomorphic_with_one_character_different() {
        assertIsomorphic("a", "b", true);
    }

    @Test
    void should_be_isomorphic_false() {
        assertIsomorphic("ee", "ad", false);
        assertIsomorphic("foo", "bar", false);
    }

    @Test
    void should_be_isomorphic_success() {
        assertIsomorphic("eg", "ad", true);
        assertIsomorphic("egg", "add", true);
    }


    private void assertIsomorphic(String first, String second, boolean reslut) {
        Boolean result = IsomorphicChecker.check(first, second);
        assertThat(result).isEqualTo(reslut);
    }


}
