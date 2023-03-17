#pragma once


#include <iostream>
#include <string>


class Book
{
private:
	std::string author;
	std::string title;
	std::string date;

public:
	// contructors
	// no parameters constructor
	Book();

	// l-reference constructor
	Book(const std::string& author, const std::string& title);

	// r-reference constructor
	Book(std::string&& author, std::string&& title);

	// move constructor
	Book(const Book& book);

	// copy constructor
	Book(Book&& book);

	// outoutStream
	friend std::ostream& operator<<(std::ostream& out, const Book& book);

	// copy assign operator
	Book& operator=(const Book& book);

	// move assign operator
	Book& operator=(Book&& book);

	// getters
	std::string getAuthor() const;
	std::string getTitle() const;
	std::string getDate() const;

	// l-value setters
	void setAuthor(const std::string& author);
	void setTitle(const std::string& title);
	void setDate(const std::string& title);

	// r-value setters
	void setAuthor(std::string&& author);
	void setTitle(std::string&& title);
	void setDate(std::string&& date);
};
