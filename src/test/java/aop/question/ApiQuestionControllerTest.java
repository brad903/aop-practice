package aop.question;

import aop.user.User;
import org.junit.Test;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import support.test.AcceptanceTest;

public class ApiQuestionControllerTest extends AcceptanceTest {
    public static final User user = new User("test3", "1234");
    public static final Question question = new Question("aop 테스트 제목", "aop 테스트 내용");

    @Test
    public void test() {
        ResponseEntity<Void> responseEntity = template().postForEntity("/questions", question, Void.class);
        softly.assertThat(responseEntity.getStatusCode()).isEqualTo(HttpStatus.UNAUTHORIZED);
    }
}