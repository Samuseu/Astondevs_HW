package ru.astondevs.lesson16.request.methods.patch;

import org.junit.jupiter.api.*;
import ru.astondevs.lesson16.request.data.DataPath;
import ru.astondevs.lesson16.request.spec.SpecsPatch;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class responseBodyAndResponseCodeCheck {
    @Test
    @Order(1)
    public void testPathMethod() {
        String data = "New update:This is expected to be sent back as part of response body.";

        DataPath dataPath = SpecsPatch.request
                .when()
                .body(data)
                .patch("patch")
                .then()
                .spec(SpecsPatch.responseSpec)
                .log().body()
                .extract().as(DataPath.class);

        Assertions.assertEquals("https", dataPath.getHeaders().getXForwardedProto());
        Assertions.assertEquals("443", dataPath.getHeaders().getXForwardedPort());
        Assertions.assertEquals("postman-echo.com", dataPath.getHeaders().getHost());
        Assertions.assertNotNull(dataPath.getHeaders().getXAmznTraceId());
        Assertions.assertEquals("69", dataPath.getHeaders().getContentLength());
        Assertions.assertEquals("text/plain; charset=ISO-8859-1", dataPath.getHeaders().getContentType());
        Assertions.assertNotNull(dataPath.getHeaders().getUserAgent());
        Assertions.assertEquals("*/*", dataPath.getHeaders().getAccept());
        Assertions.assertNull(dataPath.getHeaders().getCacheControl());
        Assertions.assertNull(dataPath.getHeaders().getPostmanToken());
        Assertions.assertEquals("gzip,deflate", dataPath.getHeaders().getAcceptEncoding());
        Assertions.assertNull(dataPath.getHeaders().getCookie());
        Assertions.assertNull(dataPath.getJson());
        Assertions.assertEquals("https://postman-echo.com/patch", dataPath.getUrl());
    }
}