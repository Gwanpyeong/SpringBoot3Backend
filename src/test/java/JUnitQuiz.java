import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitQuiz {

    @Test
    public void junitQuiz1() {
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";


    }

    @Test
    public void junitQuiz2() {
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        assertThat(number3).isLessThan(number2);
    }
}