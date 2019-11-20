Feature: AmazonUIVerification

  @BasicUIVerification
  Scenario Outline: Check landing page UI for top menubar.
    Given Open Application
    Then Verify "<uiItemsForVerification>" is present
    Examples:
    | uiItemsForVerification |
    | amazonLogo             |
    | searchBox              |
    | cart                   |
    | tryPrime               |
    | returnAndOrder         |
    | signinOption           |
    | hamburger              |