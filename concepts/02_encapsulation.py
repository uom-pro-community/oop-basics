class BankAccount:
    def __init__(self, owner, balance):
        self.owner = owner
        self.__balance = balance

    def deposit(self, amount):
        if amount > 0:
            self.__balance += amount

    def get_balance(self):
        return self.__balance


account = BankAccount("Alex", 100)
account.deposit(50)
print(f"{account.owner}'s balance: ${account.get_balance()}")


class Money:
    def __init__(self,lkr,doller):
        self.lkr = lkr
        self.doller = doller
    def convert_to_dollars(self):
        sum = self.lkr / 360
        return sum
    def convert_to_lkr(self):
        sum = self.doller * 360
        return sum

money = Money(30000, 250)
print(f"{money.lkr} LKR is equal to ${money.convert_to_dollars()}")
print(f"{money.doller} USD is equal to {money.convert_to_lkr()}")
