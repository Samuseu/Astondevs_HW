package ru.astondevs.lesson16.request.methods.put;

import org.junit.jupiter.api.*;
import ru.astondevs.lesson16.request.data.DataPut;
import ru.astondevs.lesson16.request.spec.SpecsPut;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class responseBodyAndResponseCodeCheck {
    @Test
    @Order(1)
    public void testPutMethod() {
        String data = "This is expected to be sent back as part of response body.";

        DataPut dataPut = SpecsPut.request
                .when()
                .body(data)
                .put("put")
                .then()
                .spec(SpecsPut.responseSpec)
                .log().body()
                .extract().as(DataPut.class);

        Assertions.assertEquals("https", dataPut.getHeaders().getXForwardedProto());
        Assertions.assertEquals("443", dataPut.getHeaders().getXForwardedPort());
        Assertions.assertEquals("postman-echo.com", dataPut.getHeaders().getHost());
        Assertions.assertNotNull(dataPut.getHeaders().getXAmznTraceId());
        Assertions.assertEquals("58", dataPut.getHeaders().getContentLength());
        Assertions.assertEquals("text/plain; charset=ISO-8859-1", dataPut.getHeaders().getContentType());
        Assertions.assertNotNull(dataPut.getHeaders().getUserAgent());
        Assertions.assertEquals("*/*", dataPut.getHeaders().getAccept());
        Assertions.assertNull(dataPut.getHeaders().getCacheControl());
        Assertions.assertNull(dataPut.getHeaders().getPostmanToken());
        Assertions.assertEquals("gzip,deflate", dataPut.getHeaders().getAcceptEncoding());
        Assertions.assertNull(dataPut.getHeaders().getCookie());
        Assertions.assertNull(dataPut.getJson());
        Assertions.assertEquals("https://postman-echo.com/put", dataPut.getUrl());
    }
}