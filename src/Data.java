import java.util.Arrays;

public class Data {
    private String login;
    private String password;
    private String confirmPassword;

    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void test(String login, String password, String confirmPassword) {
        String[] loginArr = {login};
        for (String s : loginArr) {
            boolean test;
            if (s.matches("^(?i:[a-z]){20}")) {
                test = true;
                System.out.println(login + "\n" + test);
            } else try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                throw new RuntimeException(Arrays.toString(e.getStackTrace()));
            }
        }
        String[] passwordArr = {password};
        for (String s : passwordArr) {
            boolean test;
            if (s.matches("^(?d:[0-9]){20}") && password.equals(confirmPassword)) {
                test = true;
                System.out.println(password + "\n" + confirmPassword + "\n" + test);
            } else try {
                throw new WrongLoginException();
            } catch (WrongLoginException e) {
                throw new RuntimeException(Arrays.toString(e.getStackTrace()));
            }
        }
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
