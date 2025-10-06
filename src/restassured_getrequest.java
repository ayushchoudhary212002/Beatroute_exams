import io.restassured.RestAssured;
import io.restassured.response.Response;

public class getdistributors {
    public static void main(String[] args) {
        Response res = RestAssured.get("https://betaapi.beatroute.io/int/v2/distributor/index");
        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response: " + res.asString());
    }
}
