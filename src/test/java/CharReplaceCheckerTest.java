import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * @author huisheng.jin
 * @date 2020/9/29.
 */
public class CharReplaceCheckerTest {
    /**
     * 1.不存在时，可以替换；
     * 2.已存在，但key、value和之前是一样的对应关系，可以替换；
     * 3.已存在，但key或value和之前不一样
     * 两个字符不能映射到同一个字符上，但字符可以映射自己本身
     */
    @Test
    void should_check_success() {
        CharReplaceChecker charReplaceChecker = new CharReplaceChecker();
        assertThat(charReplaceChecker.canReplace('a', 'b')).isEqualTo(true);
        assertThat(charReplaceChecker.size()).isEqualTo(1);
        assertThat(charReplaceChecker.canReplace('a', 'b')).isEqualTo(true);
        assertThat(charReplaceChecker.size()).isEqualTo(1);
        assertThat(charReplaceChecker.canReplace('c', 'd')).isEqualTo(true);
        assertThat(charReplaceChecker.size()).isEqualTo(2);
        assertThat(charReplaceChecker.canReplace('d', 'a')).isEqualTo(false);
        assertThat(charReplaceChecker.canReplace('a', 'd')).isEqualTo(false);
        assertThat(charReplaceChecker.size()).isEqualTo(2);
        assertThat(charReplaceChecker.canReplace('g', 'l')).isEqualTo(true);
        assertThat(charReplaceChecker.size()).isEqualTo(3);
    }
}
