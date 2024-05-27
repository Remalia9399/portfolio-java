## Zadanie 1

Narysuj schemat blokowy znajdujący największą liczbę w 10-elementowej tablicy.

```mermaid
flowchart TB;
    A([Start]) --> B["max = A[0] <br> idx = 1"]
    B --> C{"idx < 10"};
    C -->|False| D(["Stop"]);
    C -->|True| E{"A[idx] > max"};
    E -->|True| F["max = A[idx]"];
    F --> G["idx = idx + 1"];
    G --> C;
    E -->|False| G
  

```

## Zadanie 2

Narysuj schemat blokowy, który doda wszystkie elementy w 10-elementowej tablicy, a wynik wypisze na ekranie.

```mermaid
flowchart TB;
    A([Start]) --> B["sum = A[0] <br/> idx = 1"]
    B --> C{"idx < 10"};
    C -->|True| D["sum = sum + A[idx] <br/> idx = idx + 1"];
    D -->C;
    C -->|False| E[/"Wypisze sum"/] --> F(["Stop"]);
```

## Zadanie 3

Narysuj schemat blokowy wypisujący wszystkie pozycje, na których w tablicy ```A[0, . . . , n-1] ``` znajduje się liczba **x**.

```mermaid
flowchart TB;
    A([Start]) --> B[/"Podnaj n <br/> Podaj x"/];
    B --> C["idx = 0"];
    C --> D{"idx < n"};
    D -->|False| F(["Stop"]);
    D -->|True| E{"A[idx] == x "};
    E -->|True| G[/"Wypisz idx"/];
    G --> H["idx = idx + 1"];
    E -->|False| H;
    H -->D;
```

## Zadanie 4

Narysuj schemat blokowy programu, który wczytuje liczby do momentu wystąpienia 0 oraz oblicza ich sumę i średnią.
Gdy wystąpi 0 wypisze wartość sumy oraz średnią arytmetyczną.

```mermaid
flowchart TB;
    A([Start]) --> B["sum = 0 <br/> count = 0"];
    B --> C[/"Podaj x"/];
    C --> D{"x == 0"};
    D -->|False| E["sum = sum + x <br/> count = count  + 1"];
    E --> C
    D -->|True| F[/"Wypisze sum <br/> Wypisze sum/count"/];
    F --> G(["Stop"]);
```

## Zadanie 5

Narysuj schemat blokowy programu, który wczytuje liczby do momentu wystąpienia 0.
Gdy wystąpi 0 wypisze maksymalną i minimalną wartość.

```mermaid
flowchart TB;
    A([Start]) --> B["min = MIN_INT <br/> max = MAX_INT"];
    B --> C[/"Podaj x"/];
    C --> D{"x == 0"};
    D -->|False| E{"x < min"};
    D -->|True| F[/"Wypisze min <br/> Wypisze max"/] --> G(["Stop"]);
    E -->|True| H["min = x"];
    H --> I{"x > max"};
    E -->|False| I;
    I --> J["max = x"];
    J --> C;
```

## Zadanie 6

Narysuj schemat blokowy programu, który wczytuje słowa do momentu wystąpienia 0, jeżeli liczba znaków jest większa od 6
słowo zostanie wyświetlone.
Gdy wystąpi 0, wypisze ile było słów, w których liczba znaków była mniejsza bądź równa 6.

```mermaid
flowchart TB;
    A([Start]) --> B["liczbaSłów = 0"];
    B --> C[/"Wczytanie słowa"/];
    C --> D{"słowo == 0"};
    D -->|False| E{"słowo > 6"};
    D -->|True| H[/"Wypisanie zmienna liczba słów"/];
    H -->I(["Stop"]);
    E -->|False| C;
    E -->|True| F[/"Wypisanie słowa"/]
    F --> G["liczba słow++"];
    G -->C;
 
    
   
    

  

```
