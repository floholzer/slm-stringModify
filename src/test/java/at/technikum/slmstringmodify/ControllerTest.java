package at.technikum.slmstringmodify;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ControllerTest {
    Controller controller = new Controller();

    @Test
    void modifyString() {
        String input = "hello";
        String output = controller.modifyString(input);
        assertEquals("hElLo", output);
    }
    @Test
    void modifyEmptyString() {
        String input = "";
        String output = controller.modifyString(input);
        assertEquals("", output);
    }
}