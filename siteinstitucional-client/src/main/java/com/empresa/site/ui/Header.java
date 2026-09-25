package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class Header extends Composite {

    public Header() {
        HTMLPanel root = new HTMLPanel("header",
                "<div class='container nav'>"
                        + "<a href='#inicio' class='logo'>Nova<span>Tech</span></a>"
                        + "<nav class='menu'>"
                        + link("inicio", "Início")
                        + link("sobre", "Sobre nós")
                        + link("servicos", "Serviços")
                        + link("galeria", "Galeria")
                        + link("contato", "Contato")
                        + "</nav></div>");
        root.setStyleName("site-header");
        initWidget(root);
    }

    private static String link(String id, String label) {
        return "<a href='#" + id + "'>" + label + "</a>";
    }
}