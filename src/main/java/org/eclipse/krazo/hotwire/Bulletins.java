package org.eclipse.krazo.hotwire;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Named("bulletins")
@ApplicationScoped
public class Bulletins {
    private final List<String> bulletins = new ArrayList<>();

    public void addBulletin(String bulletin) {
        this.bulletins.add(bulletin);
    }

    public List<String> getBulletins() {
        return Collections.unmodifiableList(bulletins);
    }
}
