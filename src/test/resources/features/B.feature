Feature: B
  @wip
  Scenario: Second scenario
    Given Accept type is Application-Json
    When user send a GET request to the specific Station
    Then Status code should be 200
    And  Accept type should be Application Json
