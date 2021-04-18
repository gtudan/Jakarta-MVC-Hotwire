package org.eclipse.krazo.hotwire;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/lazy")
public class LazyContentController {

    @GET
    public String about() {
        return "lazy.html";
    }

    @GET
    @Path("/content")
    public String content() throws InterruptedException {
        Thread.sleep(1000);
        return "lazyContent.html";
    }
}
