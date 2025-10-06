import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class apitest {

    @Test
    public void getdistributors() {
        Response res = RestAssured.get("https://betaapi.beatroute.io/int/v2/distributor/index");

        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response Body: " + res.asString());

        Assert.assertEquals(res.getStatusCode(), 200, "Status code not matched");
    }
}
