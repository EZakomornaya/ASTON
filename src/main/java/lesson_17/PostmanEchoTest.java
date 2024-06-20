package lesson_17;

import io.restassured.http.ContentType;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class PostmanEchoTest {
   //1
    @Test(description = "Get Request Woops")
    public void getRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .headers("Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*", "Cookie",
                        "sails.sid=s%3Aw_GiOdL4riO4COkx3XqK6D7ZLv3iW2ax.XzKjQlYVzm5Npo0MfU7c2wgMgHLkM%2FkQTX6TAZx32i0")
                .queryParam("foo1", "bar1")
                .queryParam("foo2", "bar2")

                .when()
                .contentType(ContentType.JSON)
                .get("https://postman-echo.com/get")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("args.foo1", equalTo("bar1"))
                .body("args.foo2", is("bar2"))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("url", equalTo("https://postman-echo.com/get?foo1=bar1&foo2=bar2"))

                .extract()
                .response();
    }
//2
    @Test(description = "Post Raw Text")
    public void postRawTextRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .headers("Content-Type", "text/plain", "Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*","Cookie",
                        "sails.sid=s%3AvwQx2fqMLErmjTBwFdO838LKXK_f68y0.gsyuf9NvpDiJhUOgQ6a3yhYU3JmOdvzrJmDfVxmFR5k")
                .body("This is expected to be sent back as part of response body.")

                .when()
                .post("https://postman-echo.com/post")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/post"))

                .extract()
                .response();
    }
//3
    @Test(description = "Post Form Data")
    public void postFormDataRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .cookie("sails.sid=s%3AfyhHCuABuY13hsb2mH3Vp_d3HvFYOs8a.yJ0yFV4HfI2HcFLcR91zIp%2FJfbQQfVHaktas%2Fwdi0Y4")
                .headers("Content-Type", "application/x-www-form-urlencoded;charset=UTF-8", "Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*")
                .formParam("foo1", "bar1")
                .formParam("foo2", "bar2")

                .when()
                .post("https://postman-echo.com/post")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("form.foo1", equalTo("bar1"))
                .body("form.foo2", equalTo("bar2"))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json",  notNullValue())
                .body("url", equalTo("https://postman-echo.com/post"))

                .extract()
                .response();
    }
//4
    @Test(description = "Put Request")
    public void putRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body.")
                .headers("Content-Type", "text/plain", "Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*","Cookie",
                        "sails.sid=s%3A7B8FFYB6tKHWWCbGu0rYlwUXmyPTv91n.D9vvYh5imdsxSyPJrWRS07Es0FU8XZGymeI5O6hK6V0")

                .when()
                .put("https://postman-echo.com/put")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/put"))

                .extract()
                .response();
    }
//5
    @Test(description = "Patch Request")
    public void patchRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body.")
                .headers("Content-Type", "text/plain", "Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*","Cookie",
                        "sails.sid=s%3AELeBrvjbuXA2H1rsCF4JMuyR8R9fabPG.wn27i3QuMJUWgOCH8T5qcSKczt50BCnhwM4f0sI96iY")

                .when()
                .patch("https://postman-echo.com/patch")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("cache-control", nullValue())
                .body("headers.accept", equalTo("*/*"))
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/patch"))

                .extract()
                .response();
    }
//6
    @Test(description = "Delete Request")
    public void deleteRequestTest() {
        given()
                .baseUri("https://postman-echo.com")
                .body("This is expected to be sent back as part of response body.")
                .headers("Content-Type", "text/plain", "Accept-Encoding", "gzip, deflate, br",
                        "User-Agent", "PostmanRuntime/7.39.0", "Connection",
                        "keep-alive", "Accept", "*/*","Cookie",
                        "sails.sid=s%3Ax8b_uK-WUQtiAZN_dPSd8genr4sSNFPS.E%2FwE9FKuPbToIodSM%2FWtV%2BfvjaHNZAs%2FmEa6ZV8MVYE")

                .when()
                .delete("https://postman-echo.com/delete")

                .then().log().all()
                .assertThat().statusCode(200)
                .body("data", equalTo("This is expected to be sent back as part of response body."))

                .body("headers.host", equalTo("postman-echo.com"))
                .body("headers.x-request-start", notNullValue())
                .body("headers.x-forwarded-proto", equalTo("https"))
                .body("headers.x-forwarded-port", equalTo("443"))
                .body("headers.x-amzn-trace-id", notNullValue())
                .body("headers.user-agent", equalTo("PostmanRuntime/7.39.0"))
                .body("headers.accept", equalTo("*/*"))
                .body("cache-control", nullValue())
                .body("headers.accept-encoding", equalTo("gzip, deflate, br"))
                .body("json", nullValue())
                .body("url", equalTo("https://postman-echo.com/delete"))

                .extract()
                .response();
    }
}







