package ladder;

import ladder.exception.TooLongNameException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class NameTest {


    @ParameterizedTest
    @ValueSource(strings = {"aaaaa" , "bbbbbbbbbbbbbbbbb", "ccccccccccccccccccccccc"})
    @DisplayName("이름이 5글자가 넘으면 예외를 던진다.")
    public void TooLongNameExceptionTest(String name) {
        Assertions.assertThrows(TooLongNameException.class , () ->
                new Name(name)
        );
    }

}
