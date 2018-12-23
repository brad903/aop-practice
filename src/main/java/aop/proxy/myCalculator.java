package aop.proxy;

import org.slf4j.Logger;

import static org.slf4j.LoggerFactory.getLogger;

public class myCalculator implements Calculator {
    private static final Logger log = getLogger(myCalculator.class);

    @Override
    public int add(int x, int y) {
        log.info("계산 중");
        return x + y;
    }

    @Override
    public int subtract(int x, int y) {
        return x - y;
    }

    @Override
    public int multiply(int x, int y) {
        return x * y;
    }

    @Override
    public int divide(int x, int y) {
        return x / y;
    }

}
