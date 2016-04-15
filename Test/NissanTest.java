import org.junit.Assert;
import org.junit.Test;

/**
 * I have a nissan
 the model is a 300zx
 the year is 1991
 the engine size is 3.0
 the transtype is manual
 */
public class NissanTest {

    @Test
    public void testNissan() {
        Nissan nissan = new Nissan();

        String model = nissan.getCarModel();
        Integer year = nissan.getCarYear();
        Double engine = nissan.getEngineSize();
        String trans = nissan.getTransType();

        Assert.assertTrue(model.equalsIgnoreCase("car"));
        Assert.assertTrue(year.equals(1991));
        Assert.assertTrue(engine.equals(3.0));
        Assert.assertTrue(trans.equalsIgnoreCase("manual"));

    }
}
