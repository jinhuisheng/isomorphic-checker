/**
 * @author huisheng.jin
 * @version 2019/12/21.
 */
public class FizzBuzz {

    private int number;

    public FizzBuzz(int number) {
        this.number = number;
    }

    public static String of(int number) {
        FizzBuzz fizzBuzz = new FizzBuzz(number);
        if (fizzBuzz.isDividedBy1(3) && fizzBuzz.isDividedBy1(5)) {
            return "FizzBuzz";
        }
        if (fizzBuzz.isDividedBy1(3)) {
            return "Fizz";
        }
        if (fizzBuzz.isDividedBy1(5)) {
            return "Buzz";
        }
        return String.valueOf(number);
    }

    private boolean isDividedBy1(int i) {
        return this.number % i == 0;
    }

}
