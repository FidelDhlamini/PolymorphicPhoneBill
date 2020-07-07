import org.junit.jupiter.api.Test;
import phone.DataBundle;
import phone.PhoneBill;
import phone.PhoneCall;
import phone.SMSBundle;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneBillTest {
    @Test
    public void ShouldAcceptSmsBillActionAndReturnTotal(){
        PhoneBill phoneBill = new PhoneBill();
        SMSBundle smsBundle = new SMSBundle(0.75,2);
//        accepting 2 sms' bill action
        phoneBill.accept(smsBundle);
        phoneBill.total();
        assertEquals(1.5,phoneBill.total());

    }
    @Test
    public void ShouldAcceptDataBundleBillActionAndReturnTotal(){
        PhoneBill phoneBill = new PhoneBill();
        DataBundle dataBundle = new DataBundle(550);
//        accepting 550mb bill action
        phoneBill.accept(dataBundle);
        phoneBill.total();
        assertEquals(303.0,phoneBill.total());

    }
    @Test
    public void ShouldAcceptPhoneCallBillActionAndReturnTotal(){
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall= new PhoneCall(12.00);
        phoneBill.accept(phoneCall);
        phoneBill.total();
        assertEquals(12.00,phoneBill.total());

    }
    @Test
    public void ShouldAcceptAllThreeDifferentBillActionsAndReturnTotal(){
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall= new PhoneCall(12.00);
        DataBundle dataBundle = new DataBundle(550);
        SMSBundle smsBundle = new SMSBundle(0.75,2);
        phoneBill.accept(phoneCall);
        phoneBill.accept(dataBundle);
        phoneBill.accept(smsBundle);
        phoneBill.total();
        assertEquals(316.5,phoneBill.total());

    }

}
