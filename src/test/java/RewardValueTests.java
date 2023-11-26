import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(milesValue, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        double cashValue = 100;
        double expectedMiles = cashValue / 0.0035; // Convert cash to miles
        var rewardValue = new RewardValue(cashValue);
        assertEquals(expectedMiles, rewardValue.getMilesValue(), "Conversion from cash to miles is incorrect");
    }

    @Test
    void convert_from_miles_to_cash() {
        double milesValue = 10000;
        double expectedCash = milesValue * 0.0035; // Convert miles to cash
        var rewardValue = new RewardValue(milesValue, true);
        assertEquals(expectedCash, rewardValue.getCashValue(), "Conversion from miles to cash is incorrect");
    }
}
