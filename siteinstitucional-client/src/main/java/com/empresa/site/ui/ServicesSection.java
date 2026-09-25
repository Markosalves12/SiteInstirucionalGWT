package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;

public class ServicesSection extends Composite {
    public ServicesSection() {
        HTMLPanel root = new HTMLPanel("section", "");
        root.getElement().setId("servicos");
        root.setStyleName("section section-alt");

        FlowPanel container = new FlowPanel();
        container.setStyleName("container");
        container.add(new SectionTitle("Serviços", "O que fazemos por você"));

        FlowPanel cards = new FlowPanel();
        cards.setStyleName("cards");
        cards.add(new ServiceCard("💻", "Desenvolvimento web", "Sites e sistemas rápidos, seguros e responsivos."));
        cards.add(new ServiceCard("📱", "Aplicativos", "Apps para Android e iOS com ótima experiência."));
        cards.add(new ServiceCard("🎨", "Design UI/UX", "Interfaces bonitas e fáceis de usar."));
        cards.add(new ServiceCard("☁️", "Cloud", "Infraestrutura escalável e monitorada."));

        container.add(cards);
        root.add(container);
        initWidget(root);
    }
}