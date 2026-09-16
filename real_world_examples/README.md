# Real-World OOP Examples

These examples show how classes model real objects and how methods model actions.

## ATM Machine

```mermaid
classDiagram
    class BankAccount {
        -owner
        -__pin
        -__balance
        +check_pin(pin)
        +check_balance()
        +withdraw(amount)
        +deposit(amount)
    }
    class ATM {
        -bank_account
        +login(pin)
        +show_balance()
    }
    ATM --> BankAccount : uses
```

Flow:

```mermaid
flowchart TD
    A[Enter PIN] --> B{PIN correct?}
    B -- No --> C[Show incorrect PIN]
    B -- Yes --> D[Show balance]
    D --> E[Withdraw or deposit]
    E --> F[Update account balance]
```

Code: [01_atm_machine.py](01_atm_machine.py)

## Library System

```mermaid
classDiagram
    class Book {
        +title
        +author
        +is_borrowed
    }
    class Library {
        -books
        +add_book(book)
        +show_available_books()
        +borrow_book(title)
    }
    Library "1" o-- "many" Book : contains
```

Code: [02_library_system.py](02_library_system.py)

## Shopping Cart

```mermaid
classDiagram
    class Product {
        +name
        +price
    }
    class ShoppingCart {
        -products
        +add_product(product)
        +calculate_total()
        +checkout()
    }
    ShoppingCart "1" o-- "many" Product : contains
```

Code: [03_shopping_cart.py](03_shopping_cart.py)

