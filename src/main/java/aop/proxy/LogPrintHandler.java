package aop.proxy;

import org.apache.commons.lang3.time.StopWatch;
import org.slf4j.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import static org.slf4j.LoggerFactory.getLogger;

public class LogPrintHandler implements InvocationHandler {
    private static final Logger log = getLogger(LogPrintHandler.class);

    private Object target;

    public LogPrintHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        StopWatch sw = new StopWatch();
        sw.start();
        log.info("Timer Begin");
        int result = (int) method.invoke(target, args); // (3) 주업무를 invoke 함수를 통해 호출
        sw.stop();
        log.info("Timer Stop – Elapsed Time : "+ sw.getTime());
        return result;

    }
}
