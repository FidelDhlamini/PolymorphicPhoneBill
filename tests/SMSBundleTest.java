import org.junit.jupiter.api.Test;
import phone.SMSBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class SMSBundleTest {
    @Test
    public void ShouldGetSMSBundleBill(){
        SMSBundle smsBundle = new SMSBundle(0.75,4);
        smsBundle.totalCost();
        assertEquals(3.00,smsBundle.totalCost());
    }
}
