package org.webapp.example.school.ui.tests;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/ui.tests/StudentsPage.feature", "src/test/resources/integration.tests/StudentApi.feature"} ,
        glue = {"org.webapp.example.school.ui.tests.stepdef", "org.webapp.example.school.integration.tests.stepdef"})
public class Runner {


}
