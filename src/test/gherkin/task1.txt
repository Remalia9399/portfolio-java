Feature: Dodanie lub usuniecie adresu po zalogowaniu

  Scenario Outline: Dodanie danych adresowych (alias, adres, miasto, kod pocztowy, kraj, numer telefonu) i usuniecie
    Given Zalogowanie się na email 'xm@loo.pl' haslo '12345'
    When Wejscie na kafelek Adresses
    Given Dodanie danych adresowych '<alias>' '<address>' '<city>' '<zipCode>' '<country>' '<phone>'
    Then Sprawdzenie poprawnosci wprowadzonych danych

    Examples:
      | alias         | address        | city         | zipCode      | country        | phone    |
      | alias-automat | adress-automat | city-automat | zipCode-auto | United Kingdom | 11111111 |

  Scenario: usuniecie adresu po zalogowaniu
    Given Zalogowanie się na email 'xm@loo.pl' haslo '12345'
    When Usuniecie dodanego adresu
    Then Sprawdzenie czy adres zostal usuniety
