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

Code: [01_atm_machine.py](01_atm_machine.py) | [AtmMachineExample.java](AtmMachineExample.java)

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

Code: [02_library_system.py](02_library_system.py) | [LibrarySystemExample.java](LibrarySystemExample.java)

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

Code: [03_shopping_cart.py](03_shopping_cart.py) | [ShoppingCartExample.java](ShoppingCartExample.java)


## Food Ordering

```mermaid
classDiagram
    class MenuItem {
        +name
        +price
    }
    class Restaurant {
        +name
        -menu
        +add_item(item)
        +show_menu()
    }
    class FoodOrder {
        +customer
        -items
        +add_item(item_name)
        +total()
        +place_order()
    }
    Restaurant "1" o-- "many" MenuItem : offers
    FoodOrder --> Restaurant : orders from
    FoodOrder "1" o-- "many" MenuItem : contains
```

Code: [04_food_order.py](04_food_order.py) | [FoodOrderExample.java](FoodOrderExample.java)

## Vehicle Rental

```mermaid
classDiagram
    class Vehicle {
        +model
        +daily_rate
        +is_available
        +rent(days)
        +return_vehicle()
    }
    class Car
    class Motorcycle
    Vehicle <|-- Car : inherits
    Vehicle <|-- Motorcycle : inherits
```

Code: [05_vehicle_rental.py](05_vehicle_rental.py) | [VehicleRentalExample.java](VehicleRentalExample.java)

