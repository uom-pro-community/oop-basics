class BankAccount:
    def __init__(self, owner, pin, balance=0):
        self.owner = owner
        self.__pin = pin
        self.__balance = balance

    def check_pin(self, pin):
        return pin == self.__pin

    def check_balance(self):
        return self.__balance

    def withdraw(self, amount):
        if amount <= 0:
            print("Amount must be greater than zero.")
        elif amount > self.__balance:
            print("Insufficient balance.")
        else:
            self.__balance -= amount
            print(f"Please collect ${amount}.")

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount
            print(f"${amount} deposited successfully.")


class ATM:
    def __init__(self, bank_account):
        self.bank_account = bank_account

    def login(self, pin):
        if self.bank_account.check_pin(pin):
            print(f"Welcome, {self.bank_account.owner}!")
            return True
        print("Incorrect PIN.")
        return False

    def show_balance(self):
        print(f"Current balance: ${self.bank_account.check_balance()}")


account = BankAccount("Alex", 1234, 500)
atm = ATM(account)

if atm.login(1234):
    atm.show_balance()
    account.withdraw(100)
    account.deposit(50)
    atm.show_balance()