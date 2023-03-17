#include "Book.h"


// Constructors
// no parameters constructor
Book::Book() {
	author = "Default author";
	title = "Default title";
	date = "Default date";
}

// l-reference constructor
Book::Book(const std::string& author, const std::string& title) : author(author), title(title), date(date)
{
}

// r-reference constructor
Book::Book(std::string&& author, std::string&& title) : author(author), title(title), date(date)
{
}


// move constructor
Book::Book(const Book& book) : author(book.author), title(book.title), date(book.date)
{
}


// copy constructor
Book::Book(Book&& book) : author(book.author), title(book.title), date(book.date) {
	book.author = "", book.title = "";
}


// copy assign operator
Book& Book::operator=(const Book& book)
{
	this->author = book.author;
	this->title = book.title;
	this->date = book.date;

	return *this;
}


// move assign operator
Book& Book::operator=(Book&& book)
{
	author.swap(book.author);
	title.swap(book.title);
	date.swap(book.date);

	return *this;
}


// outputStream
std::ostream& operator<<(std::ostream& outputStream, const Book& book)
{
	outputStream << "Book: " << book.title << ", " << book.author << ", " << book.date << ";";

	return outputStream;
}


// Getters
std::string Book::getAuthor() const {
	return author;
}


std::string Book::getTitle() const {
	return title;
}


std::string Book::getDate() const {
	return date;
}


// Setters
// l-value setters
void Book::setAuthor(const std::string& author) {
	this->author = author;
}


void Book::setTitle(const std::string& title) {
	this->title = title;
}


void Book::setDate(const std::string& date) {
	this->date = date;
}


// r-value setters
void Book::setAuthor(std::string&& author) {
	this->author = author;
}


void Book::setTitle(std::string&& title) {
	this->title = title;
}


void Book::setDate(std::string&& date) {
	this->date = date;
}

