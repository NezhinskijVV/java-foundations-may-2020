package iostreams.serialization;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@AllArgsConstructor
@Data
public class Person implements Serializable {
    private final String name;
    private int age;
}