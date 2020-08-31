package exceptions.hw;

public class Main {

    public static void main(String[] args) {
        User user = new User(99);


        try {
            user.birthday();
        } catch (Throwable throwable){
            System.err.println("Поймали ошибку в Main");
        }

    }
}
