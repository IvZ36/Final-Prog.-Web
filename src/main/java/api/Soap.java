package api;

import cliente.ws.UrlWebServiceImpl;

import javax.xml.ws.Endpoint;

public class Soap {
    public static void init() {

        Endpoint.publish("http://localhost:9090/ws/urls", new UrlWebServiceImpl());
    }
}
