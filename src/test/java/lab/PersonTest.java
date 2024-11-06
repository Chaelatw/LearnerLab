package lab;

import org.junit.jupiter.api.BeforeEach;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {

    Person person;

    @BeforeEach
    public void setUp(){
        person = new Person(1, "Larry");
    }

    @Test
    public void testConstructor() {
        assertEquals(1, person.getId());
        assertEquals("Larry", person.getName());

    }
    @Test
    void testSetName(){
        person.setName("Larry");

        assertEquals(1, person.getName());
    }
}
