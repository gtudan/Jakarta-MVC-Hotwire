package org.eclipse.krazo.hotwire;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.ws.rs.*;

@Controller
@Path("/forms")
public class FormController {

    @Inject
    private Bulletins bulletins;

    @GET
    public String home() {
        return "forms.html";
    }

    @POST
    // Potential bug: Hotwire will send Accept: text/vnd.turbo-stream.html, text/html, application/xhtml+xml
    // and MVC will return text/vnd.turbo-stream.html;charset=UTF-8 even though that's not the real content type
    @Produces("text/html")
    public String addBulletins(@NotBlank @NotNull @FormParam("bulletin") String bulletin) {
        this.bulletins.addBulletin(bulletin);
        return "forms.html";
    }
}
