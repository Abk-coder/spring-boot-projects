package metier;

import org.junit.Assert;
import org.junit.Test;

public class CalculTest {

    @Test
    public void testSomme(){
        Calcul calcul = new Calcul();
        double a = 5; double b = 9;
        double expected = 14;
        double res = calcul.somme(a, b);
        Assert.assertEquals(res, expected, 0.0);
    }
}
