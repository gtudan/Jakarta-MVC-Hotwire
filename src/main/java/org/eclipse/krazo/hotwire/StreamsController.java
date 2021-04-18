package org.eclipse.krazo.hotwire;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/streams")
public class StreamsController {

    @GET
    public String streams() {
        return "streams.html";
    }
}
