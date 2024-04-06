package ru.astondevs.lesson16.request.methods.get;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.astondevs.lesson16.request.data.DataGet;
import ru.astondevs.lesson16.request.spec.Specs;

public class responseBodyAndResponseCodeCheck {
    @Test
    public void testGetMethod() {
        DataGet data = Specs.request
                .when()
                .get("/get")
                .then()
                .spec(Specs.responseSpec)
                .log().body()
                .extract().as(DataGet.class);

        Assertions.assertEquals("https", data.getHeaders().getXForwardedProto());
        Assertions.assertEquals("443", data.getHeaders().getXForwardedPort());
        Assertions.assertEquals("postman-echo.com", data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getXAmznTraceId());
        Assertions.assertEquals("application/json", data.getHeaders().getContentType());
        Assertions.assertEquals("*/*", data.getHeaders().getAccept());
        Assertions.assertNotNull(data.getHeaders().getUserAgent());
        Assertions.assertEquals("gzip,deflate", data.getHeaders().getAcceptEncoding());
        Assertions.assertEquals("https://postman-echo.com/get", data.getUrl());
    }

    @Test
    public void testGetMethodParams() {
        String foo1 = "bar1";
        String foo2 = "bar2";
        DataGet data = Specs.request
                .param("foo1",foo1)
                .param("foo2",foo2)
                .when()
                .get("/get")
                .then()
                .spec(Specs.responseSpec)
                .log().body()
                .extract().as(DataGet.class);

        Assertions.assertEquals("bar1", data.getArgs().foo1);
        Assertions.assertEquals("bar2", data.getArgs().foo2);
        Assertions.assertEquals("https", data.getHeaders().getXForwardedProto());
        Assertions.assertEquals("443", data.getHeaders().getXForwardedPort());
        Assertions.assertEquals("postman-echo.com", data.getHeaders().getHost());
        Assertions.assertNotNull(data.getHeaders().getXAmznTraceId());
        Assertions.assertEquals("application/json", data.getHeaders().getContentType());
        Assertions.assertEquals("*/*", data.getHeaders().getAccept());
        Assertions.assertNotNull(data.getHeaders().getUserAgent());
        Assertions.assertEquals("gzip,deflate", data.getHeaders().getAcceptEncoding());
        Assertions.assertEquals("https://postman-echo.com/get?foo1=bar1&foo2=bar2", data.getUrl());
    }
}
