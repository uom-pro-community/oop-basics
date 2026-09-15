class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def introduce(self):
        print(f"My name is {self.name}. I am {self.age} years old.")


student = Student("Alex", 20)
student.introduce()