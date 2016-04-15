import org.junit.Assert;
import org.junit.Test;

/**
 * I have a G37
 The make of this car is Infiniti
 The crank horsepower of the car is 350 chp
 The car is clean
 the size of the engine in the car is 3.7
 */
public class G37Test {
    @Test
    public void testG37(){
        G37 g37 = new G37();

        String carMake = g37.getCarMake();
        Integer chp = g37.getCrankHorsePower();
        Boolean clean = g37.isCarCleaned();
        Double engine = g37.getSizeOfEngine();

        Assert.assertTrue(carMake.equalsIgnoreCase("Infiniti"));
        Assert.assertTrue(chp.equals(350));
        Assert.assertTrue(clean.equals(true));
        Assert.assertTrue(engine.equals(3.7));
    }
}
