Feature: DuckDuckGo Phrase Search
Scenario: Successful phrase search on DuckDuckGo main page
Given Url 'https://duckduckgo.com/' opened in Chrome
When Phrase 'W pustyni i w puszczy' entered in search input box
And Search button clicked
Then First 3 results contain phrase 'W pustyni i w puszczy'