#language: en
Feature: Navigation


  Scenario Outline: Rotate Left
    Given that the submarine position is <x0> <y0> <z0> <dir0>
    When it receives the rotate left command
    Then it should move to position <x0> <y0> <z0> <dir1>
    Examples:
      | x0 | y0 | z0 | dir0  | dir1  |
      | 0  | 0  | 0  | NORTE | OESTE |
      | 0  | 0  | 0  | LESTE | NORTE |
      | 0  | 0  | 0  | SUL   | LESTE |
      | 0  | 0  | 0  | OESTE | SUL   |


  Scenario Outline: Rotate Right
    Given that the submarine position is <x0> <y0> <z0> <dir0>
    When it receives the rotate right command
    Then it should move to position <x0> <y0> <z0> <dir1>
    Examples:
      | x0 | y0 | z0 | dir0  | dir1  |
      | 0  | 0  | 0  | NORTE | LESTE |
      | 0  | 0  | 0  | LESTE | SUL   |
      | 0  | 0  | 0  | SUL   | OESTE |
      | 0  | 0  | 0  | OESTE | NORTE |


  Scenario Outline: Move
    Given that the submarine position is <x0> <y0> <z0> <dir0>
    When it receives the move command
    Then it should move to position <x1> <y1> <z0> <dir0>
    Examples:
      | x0 | y0 | z0 | dir0  | x1 | y1 |
      | 0  | 1  | 0  | NORTE | 0  | 2  |
      | 0  | 0  | 0  | NORTE | 0  | 1  |
      | 0  | -1 | 0  | NORTE | 0  | 0  |
      | 0  | 1  | 0  | SUL   | 0  | 0  |
      | 0  | 0  | 0  | SUL   | 0  | -1 |
      | 0  | -1 | 0  | SUL   | 0  | -2 |
      | 1  | 0  | 0  | LESTE | 2  | 0  |
      | 0  | 0  | 0  | LESTE | 1  | 0  |
      | -1 | 0  | 0  | LESTE | 0  | 0  |
      | 1  | 0  | 0  | OESTE | 0  | 0  |
      | 0  | 0  | 0  | OESTE | -1 | 0  |
      | -1 | 0  | 0  | OESTE | -2 | 0  |


  Scenario Outline: Emerge
    Given that the submarine position is <x0> <y0> <z0> <dir0>
    When it receives the emerge command
    Then it should move to position <x0> <y0> <z1> <dir0>
    Examples:
      | x0 | y0 | z0 | dir0  | z1 |
      | 0  | 0  | -3 | NORTE | -2 |
      | 0  | 0  | -2 | SUL   | -1 |
      | 0  | 0  | -1 | LESTE | 0  |
      | 0  | 0  | 0  | OESTE | 0  |


  Scenario Outline: Submerge
    Given that the submarine position is <x0> <y0> <z0> <dir0>
    When it receives the submerge command
    Then it should move to position <x0> <y0> <z1> <dir0>
    Examples:
      | x0 | y0 | z0 | dir0  | z1 |
      | 0  | 0  | -3 | NORTE | -4 |
      | 0  | 0  | -2 | SUL   | -3 |
      | 0  | 0  | -1 | LESTE | -2 |
      | 0  | 0  | 0  | OESTE | -1 |