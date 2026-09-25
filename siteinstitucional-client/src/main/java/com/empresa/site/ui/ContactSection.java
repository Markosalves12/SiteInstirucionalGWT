package com.empresa.site.ui;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HTML;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextArea;
import com.google.gwt.user.client.ui.TextBox;

public class ContactSection extends Composite {

    private final TextBox name = field("Seu nome");
    private final TextBox email = field("Seu e-mail");
    private final TextBox phone = field("Seu telefone");
    private final TextArea message = new TextArea();
    private final Label feedback = new Label();

    public ContactSection() {
        HTMLPanel root = new HTMLPanel("section", "");
        root.getElement().setId("contato");
        root.setStyleName("section section-alt");

        FlowPanel container = new FlowPanel();
        container.setStyleName("container");
        container.add(new SectionTitle("Contato", "Vamos conversar?"));

        FlowPanel grid = new FlowPanel();
        grid.setStyleName("contact");

        message.setStyleName("field");
        message.getElement().setAttribute("placeholder", "Sua mensagem");

        Button send = new Button("Enviar mensagem");
        send.setStyleName("btn");
        send.addClickHandler(e -> submit());

        FlowPanel form = new FlowPanel();
        form.setStyleName("form");
        form.add(name);
        form.add(email);
        form.add(phone);
        form.add(message);
        form.add(send);
        form.add(feedback);

        grid.add(form);
        grid.add(new HTML("<div class='info'><h3>Informações</h3>"
                + "<p>📍 Av. Paulista, 1000 — São Paulo/SP</p>"
                + "<p>📞 (11) 4000-0000</p>"
                + "<p>✉️ contato@novatech.com.br</p>"
                + "<p>🕘 Seg a Sex, 9h às 18h</p></div>"));

        container.add(grid);
        root.add(container);
        initWidget(root);
    }

    private static TextBox field(String placeholder) {
        TextBox box = new TextBox();
        box.setStyleName("field");
        box.getElement().setAttribute("placeholder", placeholder);
        return box;
    }

    private void submit() {
        if (name.getText().trim().isEmpty() || message.getText().trim().isEmpty()) {
            show("Preencha nome e mensagem.", false);
            return;
        }
        if (!email.getText().matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            show("Informe um e-mail válido.", false);
            return;
        }
        show("Obrigado, " + name.getText().trim() + "! Retornaremos em breve.", true);
        name.setText(""); email.setText(""); phone.setText(""); message.setText("");
    }

    private void show(String text, boolean ok) {
        feedback.setText(text);
        feedback.setStyleName("feedback " + (ok ? "feedback-ok" : "feedback-error"));
    }
}