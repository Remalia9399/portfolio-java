## Zadanie 1

Utwórz użytkownika manualnie na stronie [[https://mystore-testlab.coderslab.pl](https://mystore-testlab.coderslab.pl)](https://mystore-testlab.coderslab.pl)

Możesz wykorzystać tymczasowego maila do utworzenia użytkownika: [https://10minutemail.com/]([https://10minutemail.com/](https://10minutemail.com/))

#### Napisz skrypt, który:

- będzie logować się na tego stworzonego użytkownika,

- wejdzie klikając w kafelek Addresses po zalogowaniu. Adres, na którym powinniśmy się znaleźć to: [https://mystore-testlab.coderslab.pl/index.php?controller=addresses](https://mystore-testlab.coderslab.pl/index.php?controller=addresses)

- kliknie w **+ Create new address**,

- wypełni formularz **New address**- dane powinny być pobierane z tabeli Examples w Gherkinie (`alias`, `address`, `city`, `zip/postal code`, `country`, `phone`)

#### Dodatkowe

- usunie powyższy adres klikając w **delete**,

- sprawdzi czy adres został usunięty.

___

## Zadanie 2

#### Napisz skrypt, który:

- Zaloguje się na tego samego użytkownika z zadania 1,

- wybierze do zakupu Hummingbird Printed Sweater (<mark>opcja dodatkowa:</mark>  sprawdzi czy rabat na niego wynosi 20%),

- wybierze rozmiar M (<mark>opcja dodatkowa:</mark>  zrób tak żeby można było sparametryzować rozmiar i wybrać S, M, L, XL),

- wybierze 5 sztuk według parametru podanego w teście (<mark>opcja dodatkowa:</mark> zrób tak żeby można było sparametryzować liczbę sztuk),

- dodaj produkt do koszyka,

- przejdzie do opcji - checkout,

- potwierdzi address (możesz go dodać wcześniej ręcznie),

- wybierze metode odbioru, PrestaShop **pick up in store**,

- wybierze opcję płatności - **Pay by Check**,

- kliknie na **order with an obligation to pay**,

- zrobi screenshot z potwierdzeniem zamówienia i kwotą.

#### Dodatkowe

- Wejdź w historie zamówień i detale (najpierw kliknij w użytkownika zalogowanego, później kafelek),

- sprawdź czy zamówienie znajduje się na liście ze statusem **Awaiting check payment** i kwotą taką samą jak na zamówieniu dwa kroki wcześniej.
