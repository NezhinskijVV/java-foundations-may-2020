package exceptions.hw;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class User {
    private int age;

    public void setAge(int age) {
        if ((age < 0) || (age >= 100)) {
            System.err.println("Поймали ошибку в setAge");
            throw new MyRuntimeException("AGE IS NOT CORRECT");
        }
        this.age = age;
    }


    public void birthday() {
        try {
            setAge(++age);
        } catch (Throwable throwable) {
            System.err.println("Поймали ошибку в birthday " + throwable.getMessage());
            throw new RuntimeException();
        }
    }
}
