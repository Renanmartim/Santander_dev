# Santander_dev

<h1> This project was created and thinking about a DIO course </h1>

<h2> Proposal </h2>

<p> The purpose of this project is to simulate a banking application where it is possible to register users with salary, CPF and name with classes linked to it such as: account, card, features, news, bank loan and account. </p>

<h2> Technologies Used </h2>

<ol>
<li>Java 17</li>
<li>Spring Boot 3.2</li>
<li>Swagger (To document and facilitate access to endpoints)</li>
<li>Railway</li>
<li>PostgreSQL</li>
</ol>

<p> This project was designed to run in production with Railway with a PostgreSQL cloud server.  </p>

<h1> Class Diagram </h1>

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
