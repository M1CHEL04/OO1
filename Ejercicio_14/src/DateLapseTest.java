import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class DateLapseTest {
    private DateLapse d;

    @BeforeEach
    void setUp() throws Exception{
        LocalDate from = LocalDate.of(2023,12,10);
        LocalDate to = LocalDate.of(2023,12,15);
        d= new DateLapse(from,to);
    }

    @Test
    void TestSizeInDays(){
        assertEquals(5,d.sizeInDays());
    }

    @Test
    void TestIncludesDate(){
        LocalDate f1 = LocalDate.of(2023,12,12);
        LocalDate f2 = LocalDate.of(2024,12,12);
        assertTrue(d.includesDate(f1));
        assertFalse(d.includesDate(f2));
    }

}
