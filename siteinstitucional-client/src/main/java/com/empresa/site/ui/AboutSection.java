package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;

public class AboutSection extends Composite {
    public AboutSection() {
        HTMLPanel root = new HTMLPanel("section", "");
        root.getElement().setId("sobre");
        root.setStyleName("section");

        FlowPanel grid = new FlowPanel();
        grid.setStyleName("container about");

        FlowPanel text = new FlowPanel();
        text.add(new SectionTitle("Sobre nós", "Mais de 10 anos criando soluções"));
        text.add(new HTML("<p>Somos uma equipe apaixonada por tecnologia, design e resultados. "
                + "Ajudamos empresas a transformar ideias em produtos digitais.</p>"
                + "<div class='stats'>"
                + "<div><strong>250+</strong>projetos</div>"
                + "<div><strong>120</strong>clientes</div>"
                + "<div><strong>98%</strong>satisfação</div></div>"));

        grid.add(text);
        grid.add(new HTML("<img src='https://images.unsplash.com/photo-1522071820081-009f0129c71c?w=900' alt='Equipe'>"));
        root.add(grid);
        initWidget(root);
    }
}