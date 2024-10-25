package chainofresponsibility;

import com.sun.net.httpserver.Request;

public interface AccessHandler {
    void setNext(AccessHandler next);
    void handleRequest(User user);
}
