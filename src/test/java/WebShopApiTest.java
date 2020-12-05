import org.junit.jupiter.api.Test;
import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.is;

public class WebShopApiTest {

    @Test
    void bookStoreTest() {
//        curl -X GET "https://demoqa.com/BookStore/v1/Books" -H "accept: application/json"

        get("https://demoqa.com/BookStore/v1/Books")
                .then()
                .body("books[0].title",is("Git Pocket Guide"));
    }
}
