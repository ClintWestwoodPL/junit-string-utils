import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringUtilsTest {

    private StringUtils classUnderTest;

@Before
    public void setUp() {
    classUnderTest = new StringUtils();
}

@Test
    public void testZipCode () {

    String a = "41-103";

    boolean czyDobry = classUnderTest.isValidZipCode(a);

    assertTrue(czyDobry);
}

@Test
    public void testUpperCase () {

    String a = "AA";

    String b = classUnderTest.toUpperCase(a);

    Assert.assertEquals("AA",b);

}
    @Test
    public void testLoverCase () {

        String a = "aa";

        String b = classUnderTest.toLowerCase(a);

        Assert.assertEquals("aa",b);

    }
  /*  @Test
    public void testFemaleName () {


    }
        */

}
