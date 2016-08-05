#language: en
Feature: Result output

  Scenario Outline: Navigations
    Given that the submarine is in its starting position
    When it receives the commands <commands>
    Then the result '<result>' should be printed to the console
    Examples:
      | commands   | result        |
      | LMRDDMMUU  | -1 2 0 NORTE  |
      | LMRDDMMUUU | -1 2 0 NORTE  |
      | LMRDDMMRU  | -1 2 -1 LESTE |