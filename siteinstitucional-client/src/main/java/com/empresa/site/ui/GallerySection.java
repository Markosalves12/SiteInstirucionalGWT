package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Image;

public class GallerySection extends Composite {

    private static final String[] IMAGES = {
            "https://images.unsplash.com/photo-1498050108023-c5249f4df085?w=700",
            "https://images.unsplash.com/photo-1504384308090-c894fdcc538d?w=700",
            "https://images.unsplash.com/photo-1519389950473-47ba0277781c?w=700",
            "https://images.unsplash.com/photo-1531482615713-2afd69097998?w=700",
            "https://images.unsplash.com/photo-1553877522-43269d4ea984?w=700",
            "https://images.unsplash.com/photo-1600880292203-757bb62b4baf?w=700"
    };

    public GallerySection() {
        HTMLPanel root = new HTMLPanel("section", "");
        root.getElement().setId("galeria");
        root.setStyleName("section");

        FlowPanel container = new FlowPanel();
        container.setStyleName("container");
        container.add(new SectionTitle("Galeria", "Nosso dia a dia"));

        FlowPanel grid = new FlowPanel();
        grid.setStyleName("gallery");
        for (String url : IMAGES) {
            Image img = new Image(url);
            img.setAltText("Imagem de demonstração");
            grid.add(img);
        }
        container.add(grid);
        root.add(container);
        initWidget(root);
    }
}