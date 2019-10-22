package org.webapp.example.school.ui.tests.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManager {
    private static WebDriver browserInstance = null ;

    /**
     *
     * @return
     */
    public static WebDriver getDriverInstance(){
        if(browserInstance==null){
            browserInstance = new ChromeDriver();
        }
        return browserInstance;
    }

}
