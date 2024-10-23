import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvenNumberSetTest {
    private EvenNumberSet e;

    @BeforeEach
    void setUp() throws Exception{
        e = new EvenNumberSet();
    }

    @Test
    void testAddNum(){
        e.addNum(1); e.addNum(2);
        assertEquals(1,e.size());
    }
}
