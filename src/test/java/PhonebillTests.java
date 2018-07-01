import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

class PhonebillTests {

    @ParameterizedTest
    @CsvFileSource(resources = "/Phonebill.csv", numLinesToSkip = 1)
    void test(int time, int num, double result) {
        Phonebill phonebill = new Phonebill(time, num);
        assertEquals(phonebill.calculateCharge(), result);
    }
}
