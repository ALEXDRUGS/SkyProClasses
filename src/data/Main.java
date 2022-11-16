package data;

public class Main {
    public static void main(String[] args) throws WrongPasswordException {
        Data data = new Data("rtgfbnjkSltiopfdxsay",
                "12345678901234567899",
                "12345678901234567890");
        Data.test(data.getLogin(), data.getPassword(), data.getConfirmPassword());
    }
}