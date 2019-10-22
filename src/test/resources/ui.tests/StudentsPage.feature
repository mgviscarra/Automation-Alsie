Feature: Students
  Scenario: Create student
    Given I go to http://localhost:8080/student-records.html
    When I create a student with data
      |name                |Steve              |
      |socialSecurityNumber|12345              |
      |birthDate           |2019-10-22         |
    Then I verify Steve was born 2019-10-22 is displayed in student list