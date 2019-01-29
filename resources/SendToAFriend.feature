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


  Scenario: Another attempt to sending an information about selected dress by entering (the same) friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters Name of his/her friend Asia and E-mail address of his/her friend asha7788@gmail.com
    And User clicks Send button
    Then User should see the confirmation on the Website


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters Name of his/her friend Asia and wrong E-mail address of his/her friend asha7788gmail.com
    And User clicks Send button
    Then User should see the confirmation on the Website


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters wrong Name of his/her friend A! and E-mail address of his/her friend asha7788@gmail.com
    And User clicks Send button
    Then User should see the confirmation on the Website


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters wrong Name of his/her friend A! and wrong E-mail address of his/her friend asha7788gmail.com
    And User clicks Send button
    Then User should see the confirmation on the Website


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User doesn't enter Name of his/her friend but enters E-mail address of his/her friend asha7788@gmail.com
    And User clicks Send button
    Then User should see a prompt that he/she didn't fill required fields


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User enters Name of his/her friend Asia but doesn't enter E-mail address of his/her friend
    And User clicks Send button
    Then User should see a prompt that he/she didn't fill required fields


  Scenario: Sending an information about selected dress by entering friend's e-mail address
    Given User is on the main page in section Dresses
    When User clicks Dresses
    And User clicks Evening Dresses
    And User clicks a picture with a Printed Dress
    And User clicks More
    And User clicks Send to a friend
    And User doesn't enter Name and E-mail address of his/her friend
    And User clicks Send button
    Then User should see a prompt that he/she didn't fill required fields