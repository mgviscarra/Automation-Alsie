package org.webapp.example.school.ui.tests.stepdef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.webapp.example.school.ui.tests.pages.StudentListPage;
import org.webapp.example.school.ui.tests.utils.BrowserManager;

import java.util.List;

public class StudentListStepDefinitions {
    @Given("I go to (.*)")
    public void goToUrl(String page){
        BrowserManager.getDriverInstance().get(page);

    }

    @Then("I verify (.*) is displayed in student list")
    public void verifyStudent(String student){
        boolean exist = false;
        StudentListPage studentPage = new StudentListPage();
        List<WebElement> studentList = studentPage.getStudentListItems();
        for (WebElement studentElement: studentList) {
            if(student.equalsIgnoreCase(studentElement.getAttribute("innerText"))){
                exist = true;
            }
        }
        if(!exist){
            Assert.fail("The record: "+student+" was not found");
        }
    }
}
