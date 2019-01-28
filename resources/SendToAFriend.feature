Feature: As a user I want to be able to send to my friend an information about the selected dress

  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters Name of his/her friend Asia and E-mail address of his/her friend asha7788@gmail.com
    And User clicks Send button
    Then User should see the confirmation on the Website