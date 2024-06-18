``` mermaid
flowchart TB;
    subgraph sg0 [opis]
        direction TB
        subgraph sg1 [Opis]
            direction TB
            A[Start] --> B["TB, BT, LR, RL"];
            B -..- C(["A stadium-shaped node"]);
            C -..-> D[["A node in a subroutine shape"]];
            D === E[("A node in cylindral shape")];
            E ===> F(("A node in the form of a circle"));
            F --> G>"A node in an asymmetric shape"];
            click A "www.google.com" _blank
            click B "www.google.com" "Open this in a new tab" _blank
        end
        subgraph sg2 [Opis2]
            direction TB
            Z[Example text] --> H{"A node (rhombus)"};
            H --x|Line text| I{{"A hexagon node"}};
            I x--x J[/"Parallelogram"/];
            J --o K[\"Parallelogram alt"\];
            K o--o L[/"Trapezoid"\];
            L <--> M[\"Trapezoid alt"/];
            M --> N("A node with round edges")
            end
    end
    BA -->sg0 --> BB
```

%% This is comment

``` mermaid
pie title Pets adopted by volunteers
    "Dogs" : 386
    "Cats" : 85
    "Rats" : 15
```

%% This is comment

``` mermaid
pie showData
%%{init: {"pie": {"textPosition": 0.5}, "themeVariables": {"pieOuterStrokeWidth": "5px"}} }%%
    title "Key elements in Product X"
    "Calcium" : 42.96
    "Potassium" : 50.05
    "Magnesium" : 10.01
    "Iron" :  5
```

%% This is comment

``` mermaid
mindmap
  root((mindmap))
    Origins
      id[I am a square]
      id(I am a rounded square)
      id((I am a circle))
      id))I am a bang((
    Research
      Test
      Test
        Test
            Test
            Test
            Test
    Tools
      id)I am a cloud(
      id{{I am a hexagon}}
      I am the default shape
```

%% This is comment

``` mermaid
sequenceDiagram
    autonumber
    Alice->>John: Hello John, how are you #9829;?
    loop HealthCheck
        John->>John: Fight against hypochondria
    end
    Note right of John: Rational thoughts!
    John-->>Alice: Great!
    John->>Bob: How about you?
    Bob-->>John: Jolly good!
```

``` mermaid
sequenceDiagram
    box Purple Alice & John
    participant A
    participant J
    end
    box Another Group
    participant B
    participant C
    end
    A->>J: Hello John, how are you?
    J->>A: Great!
    A->>B: Hello Bob, how is Charley?
    B->>C: Hello Charley, how are you?
```

``` mermaid
sequenceDiagram
    participant Alice
    participant John
    links Alice: {"Dashboard": "https://dashboard.contoso.com/alice", "Wiki": "https://wiki.contoso.com/alice"}
    links John: {"Dashboard": "https://dashboard.contoso.com/john", "Wiki": "https://wiki.contoso.com/john"}
    Alice->>John: Hello John, how are you?
    John-->>Alice: Great!
    Alice-)John: See you later!
```

``` mermaid
sequenceDiagram
    participant A
    actor B C
    participant D
    participant E
    participant F
    A->>B: Test
```

``` mermaid
classDiagram
classA --|> classB : Inheritance
classC --* classD : Composition
classE --o classF : Aggregation
classG --> classH : Association
classI -- classJ : Link(Solid)
classK ..> classL : Dependency
classM ..|> classN : Realization
classO .. classP : Link(Dashed)
```

``` mermaid
classDiagram

BankAccount --> Shape : Association
Color --> Shape: to jest\n sobie tekst

namespace BaseShapes {
    class BankAccount{
        +String owner
        +BigDecimal balance
        + Public
        - Private
        # Protected
        ~ Package/Internal
        String someField$
        +deposit(amount) bool
        +withdrawal(amount) int
        someAbstractMethod()*
        someAbstractMethod() int*
        someStaticMethod()$
        someStaticMethod() String$
    }
    class Shape{
        <<interface>>
        %%<<Interface>> To represent an Interface class
        %%<<Abstract>> To represent an abstract class
        %%<<Service>> To represent a service class
        %%<<Enumeration>> To represent an enum
        noOfVertices
        draw()
    }
    class Color{
        <<enumeration>>
        RED
        BLUE
        GREEN
        WHITE
        BLACK
    }
}
```

``` mermaid
    timeline
        title History of Social Media Platform
          2002 : LinkedIn
          2004 : Facebook : Google <br> google
          2005 : Youtube
          2006 : Twitter
```

``` mermaid
      gitGraph
        commit type:HIGHLIGHT
        branch hotfix
        checkout hotfix
        commit
        branch develop
        checkout develop
        commit id:"Opis danego commita" tag:"Koncepcja wydania w świecie tag albo wersja wydania"
        branch featureB
        checkout featureB
        commit type:HIGHLIGHT
        checkout main
        checkout hotfix
        commit type:NORMAL
        checkout develop
        commit type:REVERSE
        checkout featureB
        commit
        checkout main
        merge hotfix
        checkout featureB
        commit
        checkout develop
        branch featureA
        commit
        checkout develop
        merge hotfix
        checkout featureA
        commit
        checkout featureB
        commit
        checkout develop
        merge featureA
        branch release
        checkout release
        commit
        checkout main
        commit
        checkout release
        merge main
        checkout develop
        merge release
```

``` mermaid
xychart-beta
    title "Sales Revenue"
    x-axis [jan, feb, mar, apr, may, jun, jul, aug, sep, oct, nov, dec]
    y-axis "Revenue (in $)" 4000 --> 11000
    bar [5000, 6000, 7500, 8200, 9500, 10500, 11000, 10200, 9200, 8500, 7000, 6000]
    line [5000, 6000, 7500, 8200, 9500, 10500, 11000, 10200, 9200, 8500, 7000, 6000]

```

``` mermaid
gantt
    title A Gantt Diagram
    dateFormat YYYY-MM-DD
    section Section
        A task          :a1, 2014-01-01, 30d
        Another task    :after a1, 20d
    section Another
        Task in Another :2014-01-12, 12d
        another task    :24d

```


``` mermaid
gantt
    dateFormat  YYYY-MM-DD
    title       Adding GANTT diagram functionality to mermaid
    excludes    weekends
    %% (`excludes` accepts specific dates in YYYY-MM-DD format, days of the week ("sunday") or "weekends", but not the word "weekdays".)

    section A section
    Completed task            :done,    des1, 2014-01-06,2014-01-08
    Active task               :active,  des2, 2014-01-09, 3d
    Future task               :         des3, after des2, 5d
    Future task2              :         des4, after des3, 5d

    section Critical tasks
    Completed task in the critical line :crit, done, 2014-01-06,24h
    Implement parser and jison          :crit, done, after des1, 2d
    Create tests for parser             :crit, active, 3d
    Future task in critical line        :crit, 5d
    Create tests for renderer           :2d
    Add to mermaid                      :until isadded
    Functionality added                 :milestone, isadded, 2014-01-25, 0d

    section Documentation
    Describe gantt syntax               :active, a1, after des1, 3d
    Add gantt diagram to demo page      :after a1  , 20h
    Add another diagram to demo page    :doc1, after a1  , 48h

    section Last section
    Describe gantt syntax               :after doc1, 3d
    Add gantt diagram to demo page      :20h
    Add another diagram to demo page    :48h

```