import org.junit.jupiter.api.Test;
import phone.DataBundle;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataBundleTest {
    @Test
    public void ShouldGetDataBundleBillForMoreThanFiveHundredMB(){
        DataBundle dataBundle = new DataBundle(800.00);
        dataBundle.totalCost();
        assertEquals(440.0, dataBundle.totalCost());
    }
    @Test
    public void ShouldGetDataBundleBillForLessThanFiveHundredMB(){
        DataBundle dataBundle = new DataBundle(400.00);
        dataBundle.totalCost();
        assertEquals(300.0, dataBundle.totalCost());
    }
    @Test
    public void ShouldGetDataBundleBillForMoreThanAThousandMB(){
        DataBundle dataBundle = new DataBundle(1500.00);
        dataBundle.totalCost();
        assertEquals(825.0, dataBundle.totalCost());
    }
}
