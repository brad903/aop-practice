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
    public ResponseEntity<Void> post(Question question, HttpSession session) {
        if(!HttpSessionUtils.isLogin(session)) throw new UnAuthenticationException("로그인이 필요합니다.");
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @GetMapping("/{id}/form")
    public ResponseEntity<Void> showUpdateForm(@PathVariable Long id, HttpSession session) {
        if(!HttpSessionUtils.isLogin(session)) throw new UnAuthenticationException("로그인이 필요합니다.");
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void> updateQuestion(@PathVariable Long id, Question updatedQuestion, HttpSession session) {
        if(!HttpSessionUtils.isLogin(session)) throw new UnAuthenticationException("로그인이 필요합니다.");
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id, HttpSession session) {
        if(!HttpSessionUtils.isLogin(session)) throw new UnAuthenticationException("로그인이 필요합니다.");
        // ..
        // 내부 로직
        // ..
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
}