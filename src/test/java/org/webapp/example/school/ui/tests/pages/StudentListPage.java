package org.webapp.example.school.ui.tests.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.webapp.example.school.ui.tests.utils.BrowserManager;

import java.util.List;

public class StudentListPage {
    private static String studentListItemsLocator = "//ul[@class='w3-ul w3-card-4 w3-green']/li";

    public List<WebElement> getStudentListItems(){
        return BrowserManager.getDriverInstance().findElements(By.xpath(studentListItemsLocator));
    }
}
