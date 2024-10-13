import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Main {
    public static void main(String[] args) {

        String login = "Sfs_";
        String pass = "123456";
        String confirmPass = "123456";
        try {
            Validate.validate(login, pass, confirmPass);
        } catch (WrongLoginException wrongLoginException) {
            System.out.println("Логин не принят");
        } catch (WrongPasswordException wrongPasswordException) {
            System.out.println("Пароль не принят");
        } finally {
            System.out.println("Валидация завершена");
        }

    }
}