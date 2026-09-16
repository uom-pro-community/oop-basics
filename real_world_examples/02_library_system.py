class Book:
    def __init__(self, title, author):
        self.title = title
        self.author = author
        self.is_borrowed = False


class Library:
    def __init__(self):
        self.books = []

    def add_book(self, book):
        self.books.append(book)

    def show_available_books(self):
        for book in self.books:
            if not book.is_borrowed:
                print(f"{book.title} by {book.author}")

    def borrow_book(self, title):
        for book in self.books:
            if book.title == title and not book.is_borrowed:
                book.is_borrowed = True
                print(f"You borrowed: {book.title}")
                return
        print("Book is not available.")


library = Library()
library.add_book(Book("Clean Code", "Robert C. Martin"))
library.add_book(Book("Python Crash Course", "Eric Matthes"))

print("Available books:")
library.show_available_books()
library.borrow_book("Clean Code")