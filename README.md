# Santander_dev

<h1> This project was created and thinking about a DIO course </h1>

<h3> Class Diagram </h3>

```mermaid
classDiagram
  class User {
    -String name
    -Long cpf
    -Long wage
    -Account account
    -Feature[] features
    -Card card
    -News[] news
  }

  class Account {
    -String number
    -String agency
    -Number balance
    -Number limit
  }

  class Feature {
    -String icon
    -String description
  }

  class Card {
    -String number
    -Number limit
  }

  class News {
    -String icon
    -String description
  }

  class BankLoan {
    -Long cpf
    -boolean status
  }

  User "1" *-- "1" Account
  User "1" *-- "N" Feature
  User "1" *-- "1" Card
  User "1" *-- "N" News
  User ..> BankLoan

```
