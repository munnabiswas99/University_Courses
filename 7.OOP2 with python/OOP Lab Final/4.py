class Book:
    title = 'Chokher Bali'
    author = 'Rabindranath Tagore'
    isbn = 1997

    
    def display(self):
        print(self.title)
        print(self.author)
        print(self.isbn)

class Ebook(Book):
    file_format = 'pdf'

    def display(self):
        super().display()
        print(self.file_format)

obj1 = Ebook()

obj1.display()

    