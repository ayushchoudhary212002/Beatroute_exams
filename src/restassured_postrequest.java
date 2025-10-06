import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.http.ContentType;

public class CreateNote {
    public static void main(String[] args) {
        String body = "{ \"note\": \"This is a test note\" }";
        Response res = RestAssured.given()
                .contentType(ContentType.JSON)
                .body(body)
                .post("https://betaapi.beatroute.io/int/v2/credit-note/create");
        System.out.println("Status Code: " + res.getStatusCode());
        System.out.println("Response: " + res.asString());
    }
}
