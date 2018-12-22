package aop.aspect;

import aop.security.HttpSessionUtils;
import aop.security.UnAuthenticationException;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

import static org.slf4j.LoggerFactory.getLogger;

@Aspect
@Component
public class LoginAspect {
    private static final Logger log = getLogger(LoginAspect.class);

    @Pointcut("execution(* aop.question.ApiQuestionController.*(..)) && args(session,..)")
    public void getSession(HttpSession session) {
    }

    @Around("getSession(session)")
    public Object sessionCheck(ProceedingJoinPoint jp, HttpSession session) throws Throwable {
        if(!HttpSessionUtils.isLogin(session)) {
            log.info("====== aop 예외 발생 ======");
            throw new UnAuthenticationException("로그인이 필요합니다.");
        }
        return jp.proceed();
    }

}
