package org.eclipse.krazo.hotwire;

import javax.mvc.Controller;
import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Controller
@Path("/")
public class HomeController {

    @GET
    public String index() {
        return "index.html";
    }
}
