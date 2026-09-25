package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTML;

public class ServiceCard extends Composite {
    public ServiceCard(String icon, String title, String text) {
        HTML card = new HTML("<div class='card-icon'>" + icon + "</div>"
                + "<h3>" + title + "</h3><p>" + text + "</p>");
        card.setStyleName("card");
        initWidget(card);
    }
}