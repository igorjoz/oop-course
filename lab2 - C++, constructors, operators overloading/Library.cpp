#include "Library.h"


// Constructors
// no parameters constructor
Library::Library()
{
	books = nullptr;
	size = 0;
}


// with size constructor
Library::Library(std::size_t size)
{
	this->size = size;
	books = new Book[size];
}


// books list constructor
Library::Library(std::initializer_list<Book> list)
{
	size = list.size();
	books = new Book[size];
	std::size_t i = 0;
	for (auto& book : list) {
		books[i++] = book;
	}
}


// copy constructor
Library::Library(const Library& original)
{
	size = original.size;
	books = new Book[size];
	for (std::size_t i = 0; i < size; i++) {
		books[i] = original.books[i];
	}
}


// move constructor
Library::Library(Library&& original)
{
	size = original.size;
	books = std::exchange(original.books, nullptr);
	original.size = 0;
}


// destructor
Library::~Library()
{
	size = 0;
	delete[] books;
}


// assign operator
Library& Library::operator=(const Library& right)
{
	if (this != &right)
	{
		delete[] books;
		size = right.size;
		books = new Book[size];
		for (std::size_t i = 0; i < size; i++)
		{
			books[i] = right.books[i];
		}
	}
	return *this;
}


// r-value assign operator
Library& Library::operator=(Library&& right)
{
	if (this != &right)
	{

		std::swap(right.books, books);
		std::swap(right.size, size);
	}
	return *this;
}


// index operator
Book& Library::operator[](std::size_t index)
{
	return books[index];
}


// cons Book index operator
const Book& Library::operator[](std::size_t index) const
{
	return books[index];
}


// output stream
std::ostream& operator<<(std::ostream& out, const Library& library)
{
	out << "[";
	for (std::size_t i = 0; i < library.size; i++)
	{
		out << library.books[i] << ", ";
	}
	out << "], size = " << library.size;
	return out;
}


int Library::getSize() {
	return size;
}


void Library::addBook(Book book) {
	size++;
	Book* newBooksList = new Book[size];

	for (int i = 0; i < size - 1; i++) {
		newBooksList[i] = books[i];
	}

	newBooksList[size - 1] = book;
	books = newBooksList;
}


bool Library::searchBookAuthorByTitle(std::string title) {
	for (int i = 0; i < size; i++) {
		if (books[i].getTitle() == title) {
			std::cout << "Book found!" << std::endl;
			std::cout << title << " belongs to " << books[i].getAuthor() << std::endl;

			return true;
		}
	}

	return false;
}
