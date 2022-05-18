#LoginFeature
Feature: Test Google login
  Scenario: Test with valid Google email and Password
    Given open Google Chrome
    When I Enter Valid Email And password
    Then user should be able to Login
    Then Homepage must be shown
