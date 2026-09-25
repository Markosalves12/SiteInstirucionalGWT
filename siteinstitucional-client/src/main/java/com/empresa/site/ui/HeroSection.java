package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;

public class HeroSection extends Composite {
    public HeroSection() {
        HTMLPanel root = new HTMLPanel("section",
                "<div class='container'>"
                        + "<h1>Tecnologia que impulsiona o seu negócio</h1>"
                        + "<p>Criamos soluções digitais sob medida para empresas que querem crescer com segurança.</p>"
                        + "<a href='#contato' class='btn'>Fale conosco</a>"
                        + "</div>");
        root.getElement().setId("inicio");
        root.setStyleName("hero");
        initWidget(root);
    }
}