import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class IntegerArrayListTest {
    private IntegerArrayList list;

    @BeforeEach
    public void setup() {
        list = new IntegerArrayList();
    }

    @Test
    public void testSizeEmptyList() {
        assertEquals(list.size(), 0);
    }

    @Test
    public void testSizeNonEmptyList() {
        // TODO
    }
}
