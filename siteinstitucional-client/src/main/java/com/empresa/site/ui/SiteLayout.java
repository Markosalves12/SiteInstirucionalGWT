package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;

public class SiteLayout extends Composite {
    public SiteLayout() {
        FlowPanel page = new FlowPanel();
        page.add(new Header());
        page.add(new HeroSection());
        page.add(new AboutSection());
        page.add(new ServicesSection());
        page.add(new GallerySection());
        page.add(new ContactSection());
        page.add(new Footer());
        initWidget(page);
    }
}