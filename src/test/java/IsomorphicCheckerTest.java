import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/12/15.
 */
public class IsomorphicCheckerTest {
    @Test
    void check() {
        assertThat(IsomorphicChecker.check("a", "a")).isEqualTo(true);
        assertThat(IsomorphicChecker.check("a", "e")).isEqualTo(true);
        assertThat(IsomorphicChecker.check("ad", "eg")).isEqualTo(true);
        assertThat(IsomorphicChecker.check("ad", "ee")).isEqualTo(false);
    }
}
