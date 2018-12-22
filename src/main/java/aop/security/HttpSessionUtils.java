package aop.security;

import aop.user.User;

import javax.servlet.http.HttpSession;

public class HttpSessionUtils {
    public final static String USER_SESSION_KEY = "loginUser";

    public static boolean isLogin(HttpSession session) {
        Object sessionedObject = session.getAttribute(USER_SESSION_KEY);
        return sessionedObject != null;
    }

    public static User getUserFromSession(HttpSession session) {
        if (!isLogin(session)) {
            return null;
        }
        return (User) session.getAttribute(USER_SESSION_KEY);
    }

}