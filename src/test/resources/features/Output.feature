#language: en
Feature: Result output


  Scenario Outline: Valid commands
    Given that the submarine is in its starting position
    When it receives the commands <commands>
    Then the result '<result>' should be printed to the console
    Examples:
      | commands         | result        |
      | LMRDDMMUU        | -1 2 0 NORTE  |
      | RMMLMMMDDLL      | 2 3 -2 SUL    |
      | LMRDDMMUUU       | -1 2 0 NORTE  |
      | LMRDDMMRU        | -1 2 -1 LESTE |
      | DDMMRMMRMMRMMRUU | 0 0 0 NORTE   |
      | DDDDMMMRMMRMRMU  | 1 2 -3 OESTE  |


  Scenario Outline: Invalid commands
    Given that the submarine is in its starting position
    When it receives the commands <commands>
    Then the result '<result>' should be printed to the console
    Examples:
      | commands | result      |
      | 01234lum | 0 0 0 NORTE |
      | 56789rdm | 0 0 0 NORTE |