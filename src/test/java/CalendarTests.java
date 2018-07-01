import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class CalendarTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/Calendar.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(int y, int m, int d, String result) {
        Calendar c = new Calendar(y, m, d);
        assertEquals(c.calendar(), result);
    }

}

