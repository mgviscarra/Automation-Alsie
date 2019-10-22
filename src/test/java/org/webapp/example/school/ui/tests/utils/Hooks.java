package org.webapp.example.school.ui.tests.utils;

import cucumber.api.java.After;

public class Hooks {
    @After
    public void afterScenario(){
        BrowserManager.getDriverInstance().quit();
    }
}
