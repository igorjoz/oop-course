#pragma once


#include "Book.h"


#include <iostream>
#include <initializer_list>


class Library {
public:
	// constructors
	// no parameters constructor
	Library();
	// with size constructor
	Library(std::size_t size);
	// books list constructor
	Library(std::initializer_list<Book> list);
	// copy constructor
	Library(const Library& original);
	// move constructor
	Library(Library&& original);

	// destructor
	~Library();

	// assign operators
	Library& operator=(const Library& right);
	Library& operator=(Library&& right);

	// array access operator
	Book& operator[](std::size_t index);
	const Book& operator[](std::size_t index) const;

	// declare << operator as a friend
	friend std::ostream& operator<<(std::ostream& out, const Library& library);

	int getSize();

	void addBook(Book book);
	bool searchBookAuthorByTitle(std::string title);




	Book* books;
	std::size_t size;
};

