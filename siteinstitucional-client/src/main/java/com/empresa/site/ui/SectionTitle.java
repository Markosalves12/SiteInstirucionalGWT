package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

public class SectionTitle extends Composite {
    public SectionTitle(String kicker, String title) {
        initWidget(new HTML("<span class='kicker'>" + kicker + "</span>"
                + "<h2 class='section-title'>" + title + "</h2>"));
    }
}