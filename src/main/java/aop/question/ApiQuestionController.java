package aop.question;

import aop.security.HttpSessionUtils;
import aop.security.UnAuthenticationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/questions")
public class ApiQuestionController {
    @Autowired
    private QuestionRepository questionRepository;

    @PostMapping("")
    public ResponseEntity<Void> post(HttpSession session, Question question) {
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{id}/form")
    public ResponseEntity<Void> showUpdateForm(HttpSession session, @PathVariable Long id) {
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateQuestion(HttpSession session, @PathVariable Long id, Question updatedQuestion) {
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(HttpSession session, @PathVariable Long id) {
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}