package aop.proxy;

import java.lang.reflect.Proxy;

public class Driver {
    public static void main(String[] args) {
        Calculator cal = new myCalculator(); // 다형성

        Calculator proxy_cal = (Calculator) Proxy.newProxyInstance( // (1)
                cal.getClass().getClassLoader(),  // Loader
                cal.getClass().getInterfaces(), // Interface
                new LogPrintHandler(cal)); // Handler (보조 업무를 구현하고 있는 실제 클래스)

        System.out.println(proxy_cal.add(3, 4)); // add 메서드를 호출하여 3 + 4 결과를 출력
    }
}
