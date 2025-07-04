Feature: As a Video Game user,
  I want to look up video games
  So that I can look up information about a video game

  @Happy
  Scenario:
    Given I am using the VideoGame API
    When I look up a video gameId 5
    Then I should receive 200 response code

#  @Happy
#  Scenario:
#    Given I am inserting VideoGame ID '10'
#    When I GET a specific ID
#    Then I should receive a game name "Grand Theft Auto III"
#
