package main;

import phone.DataBundle;
import phone.PhoneBill;
import phone.PhoneCall;
import phone.SMSBundle;

public class Main {
    public static void main(String[] args) {
        PhoneBill phoneBill = new PhoneBill();
        PhoneCall phoneCall= new PhoneCall(8.00);
        SMSBundle smsBundle = new SMSBundle(0.75,2);
        DataBundle dataBundle = new DataBundle(550);
        phoneBill.accept(dataBundle);
        phoneBill.accept(phoneCall);
        System.out.println(phoneBill.total());
    }
}
