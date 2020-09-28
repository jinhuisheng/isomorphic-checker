import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @version 2019/12/21.
 */
public class IsomorphicCheckerTest {
    @Test
    void should_success() {
        assertThat(IsomorphicChecker.check("aaa", "aaa")).isEqualTo(true);
        assertThat(IsomorphicChecker.check("egg", "add")).isEqualTo(true);
        assertThat(IsomorphicChecker.check("foo", "bar")).isEqualTo(false);
    }
}
