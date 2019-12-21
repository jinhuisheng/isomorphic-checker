import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @author huisheng.jin
 * @version 2019/12/21.
 */
public class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "1,1",
            "3,Fizz",
            "5,Buzz",
            "15,FizzBuzz",
    })
    void should_return_string_when_input_number(int number,String expected) {
        assertThat(FizzBuzz.of(number)).isEqualTo(expected);
    }
}
