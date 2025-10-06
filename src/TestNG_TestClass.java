import org.testng.annotations.*;

public class AdditionTest {

    @BeforeMethod
    public void beforeTest() {
        System.out.println("Start the addition..");
    }

    @Test
    public void testAddition() {
        assert 2 + 2 == 4;
    }

    @AfterMethod
    public void afterTest() {
        System.out.println("Complete the Addition");
    }
}
