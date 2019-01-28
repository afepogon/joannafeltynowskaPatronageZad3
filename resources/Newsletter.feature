Feature: As a user I want to be able to subscribe to Newsletter

  Scenario: Subscribing to the Newsletter by providing user's e-mail address
    Given User is on the main page in section Newsletter
    When User enters his/her e-mail address asha7788@gmail.com
    And User clicks Enter key
    Then User should see the subscription confirmation on the Website and his/her inbox

  Scenario: Another attempt to subscribing to the Newsletter by providing (the same) user's e-mail address
    Given User is on the main page in section Newsletter
    When User enters his/her e-mail address asha7788@gmail.com
    And User clicks Enter key
    Then User should see a prompt that this e-mail address was already registered

  Scenario: Subscribing to the Newsletter by providing wrong user's e-mail address
    Given User is on the main page in section Newsletter
    When User enters his or her wrong e-mail address asha7788gmail.com
    And User clicks Enter key
    Then User should see a prompt that this e-mail address is invalid

  Scenario: Subscribing to the Newsletter without providing user's e-mail address
    Given User is on the main page in section Newsletter
    When User doesn't enter his/her e-mail address
    And User clicks Enter key
    Then User should see a prompt that this e-mail address is invalid
