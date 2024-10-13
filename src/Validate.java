import exception.WrongLoginException;
import exception.WrongPasswordException;

import java.util.regex.Pattern;

public class Validate {

    private final static Pattern LOGIN_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");
    private final static Pattern PASS_PATTERN = Pattern.compile("[a-zA-Z0-9_]{1,20}");

    public static void validate (String login, String pass, String confirmPass) {
        validateLogin(login);
        validatePass(pass, confirmPass);
    }


    private static void validateLogin(String login) {
        if (!LOGIN_PATTERN.matcher(login).matches()) {
            throw new WrongLoginException("Неверный формат логина");
        }
    }
    private static void validatePass(String pass, String confirmPass) {
        if (!PASS_PATTERN.matcher(pass).matches()) {
            throw new WrongPasswordException("Неверный формат пароля");
        }
        if (!pass.equals(confirmPass)) {
            throw new WrongPasswordException("Пароли не совпадают");
        }
    }
}
