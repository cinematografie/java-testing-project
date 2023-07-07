package junit;

import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class CustomerDescriptionTest {
//WIP - call the method
        @Test
        void welcomeMessage() {
            var message = new CustomerDescription();
                assertEquals("Welcome Customer", message.accountDescription(HashMap.description[0]));
        }
}