import org.junit.Assert;
import org.junit.Test;
public class AppTest {
    /**
     * Created by macan on 2017-11-6.
     */
    @Test
    public void testLengthOfTheUniqueKey() {

        App obj = new App();
        Assert.assertEquals(36, obj.generateUniqueKey().length());

    }

}
