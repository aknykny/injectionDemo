Feature: a
@wipp
  Scenario: first scenario
    Given Accept type is Application-Json
    When user send a GET request to the stations endPoint
    Then Status code should be 200
    And  Accept type should be Application Json
