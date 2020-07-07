import org.junit.jupiter.api.Test;
import phone.PhoneCall;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneCallTest {
    @Test
    public void ShouldGetPhoneCallBill() {
        PhoneCall phoneCall = new PhoneCall(9.0);
        phoneCall.totalCost();
        assertEquals(9.00,phoneCall.totalCost());
    }
}
