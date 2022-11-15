public class Main {
    public static void main(String[] args) {
        Data data = new Data("rtgfbnjkmltiopfdxsay",
                "12345678901234567890",
                "12345678901234567890");
        Data.test(data.getLogin(), data.getPassword(), data.getConfirmPassword());
    }
}