import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class CommissionTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/Commission.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(int tower, int display, int peripheral, String result) {
        Commission c = new Commission(tower, display, peripheral);
        assertEquals(c.commission(), result);
    }

}
