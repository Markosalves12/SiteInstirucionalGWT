package com.empresa.site;

import com.empresa.site.ui.SiteLayout;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

public class App implements EntryPoint {
	@Override
	public void onModuleLoad() {
		RootPanel.get("app").add(new SiteLayout());
	}
}