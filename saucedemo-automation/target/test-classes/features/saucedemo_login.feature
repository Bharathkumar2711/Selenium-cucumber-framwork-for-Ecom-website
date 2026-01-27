Feature: Saucedemo basic purchase flow
  Background:
  Given user open the Swag Labs login page

  @smoke
  Scenario: Valid user logs successfully
    When user login with username "standard_user" and password "secret_sauce"
    Then user should be on the products page

  @neg @smoke
  Scenario: locked user login shows an error
    When user login with username "locked_out_user" and password "secret_sauce"
    Then user should see an error "Sorry, this user has been locked out"

  @neg @smoke
  Scenario: login with invalid username and valid password shows an error
    When user login with wrong username "locked_out_user123" and password "secret_sauce"
    Then user should see an error "Epic sadface: Username and password do not match any user in this service"

  @neg @smoke
  Scenario: login with valid username and invalid password shows an error
    When user login with username "standard_user" and wrong password "secret_sauce123"
    Then user should see an error "Epic sadface: Username and password do not match any user in this service"
