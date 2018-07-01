import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;

class TriangleTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/Triangle.csv", numLinesToSkip = 1)
    void testWithCsvFileSource(double a, double b, double c, String result) {
        Triangle t = new Triangle(a, b, c);
        assertEquals(t.triangle(), result);
    }

}
