Feature: Students
  Scenario: Create student
    Given I create a student with data
      |name                |Mauricio Viscarra  |
      |socialSecurityNumber|12345              |
      |birthDate           |2010-04-05         |
    And I verify the create user status code is 200
    When I get the student list
    Then I verify response includes the following
      |name      |Mauricio Viscarra  |
      |SSN       |12345              |
      |DOB       |2010-04-05         |

  Scenario: Get student by Name
    Given I create a student with data
      |name                |Diego     |
      |socialSecurityNumber|12345     |
      |birthDate           |2010-04-05|
    When I get a student by name with: Diego
    Then I verify the create user status code is 200
    And I verify response includes the following
      |name                |Diego     |
      |SSN                 |12345     |
      |DOB                 |2010-04-05|