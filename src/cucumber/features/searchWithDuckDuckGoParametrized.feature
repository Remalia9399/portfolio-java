Feature: DuckDuckGo Phrase Search

  Scenario Outline: Successful phrase search on DuckDuckGo main page
    Given Url 'https://duckduckgo.com/' opened in Chrome
    When Phrase '<searchPhrase>' entered in search input box
    And Search button clicked
    Then First <meaningfulResultCount> results contain phrase '<searchPhrase>'
    Then Save screenshot
    Then Quit browser

    Examples:
      | searchPhrase            | meaningfulResultCount |
      | W pustyni i w puszczy   | 3                     |
      | Szkice Piórkiem         | 2                     |
      | Melchior Wańkowicz      | 2                     |