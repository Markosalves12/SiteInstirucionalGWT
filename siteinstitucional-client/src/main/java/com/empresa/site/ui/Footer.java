package com.empresa.site.ui;

import com.google.gwt.i18n.client.DateTimeFormat;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import java.util.Date;

public class Footer extends Composite {
    public Footer() {
        String year = DateTimeFormat.getFormat("yyyy").format(new Date());
        HTMLPanel root = new HTMLPanel("footer",
                "<div class='container'><div class='footer-grid'>"
                        + "<div><h4>NovaTech</h4><p>Soluções digitais para empresas que querem crescer.</p></div>"
                        + "<div><h4>Links</h4><a href='#inicio'>Início</a><a href='#sobre'>Sobre nós</a>"
                        + "<a href='#servicos'>Serviços</a><a href='#contato'>Contato</a></div>"
                        + "<div><h4>Serviços</h4><a href='#servicos'>Web</a><a href='#servicos'>Apps</a>"
                        + "<a href='#servicos'>Design</a><a href='#servicos'>Cloud</a></div>"
                        + "<div><h4>Redes sociais</h4>"
                        + "<a href='https://instagram.com' target='_blank'>Instagram</a>"
                        + "<a href='https://linkedin.com' target='_blank'>LinkedIn</a>"
                        + "<a href='https://facebook.com' target='_blank'>Facebook</a>"
                        + "<a href='https://youtube.com' target='_blank'>YouTube</a></div>"
                        + "</div><div class='copy'>© " + year + " NovaTech. Todos os direitos reservados.</div></div>");
        root.setStyleName("site-footer");
        initWidget(root);
    }
}