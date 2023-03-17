#include <iostream>


#include "Book.h"
#include "Library.h"
#include "windows.h"


void printInstruction() {
    std::cout << "Books & Library program" << std::endl;
    std::cout << "a + ENTER - add a book" << std::endl;
    std::cout << "l + ENTER - list all books" << std::endl;
    std::cout << "s + ENTER - search author by title" << std::endl;
    std::cout << "k + ENTER - previous result" << std::endl;
    std::cout << "l + ENTER - next result" << std::endl;
    std::cout << "q + ENTER - quit program" << std::endl << std::endl;
}


int main()
{
    //// Book
    //std::string bookAuthor = "Author example";
    //std::string bookTitle = "Title example";

    //Book basicBook;
    //std::cout << "basicBook: " << basicBook << std::endl;

    //Book b1 = { bookAuthor, bookTitle };
    //std::cout << "b1: " << b1 << std::endl;

    //Book b2 = { "Book2 author","Book2 title" };
    //std::cout << "b2: " << b2 << std::endl;

    //Book b3 = b1;
    //std::cout << "b3: " << b3 << " b1: " << b1 << std::endl;

    //basicBook = std::move(b2);
    //std::cout << "basicBook: " << basicBook << " b2:" << b2 << std::endl;

    //basicBook.setAuthor("New author");
    //std::cout << "basicBook: " << basicBook << std::endl;

    //basicBook.setTitle("NewTitle");
    //std::cout << "basicBook: " << basicBook << std::endl << std::endl << std::endl;


    //// Library - array representation
    //Library basicLibrary;
    //std::cout << "basicLibrary: " << basicLibrary << std::endl;
    //Library l1 = { {"Author example 1", "Title example 1"},
    //{"Author example 2", "Title example 3"},
    //{"Author example 3", "Title example 3"} };

    //std::cout << "l1: " << l1 << std::endl;
    //Library l2(2);
    //std::cout << "l2: " << l2 << std::endl;
    //l2[0] = { "Lib2 author1", "Lib2 title1" };
    //l2[1] = { "Lib2 author2", "Lib2 author2" };
    //std::cout << "l2: " << l2 << std::endl;

    //basicLibrary = std::move(l2);
    //std::cout << "basicLibrary: " << basicLibrary << " l2: " << l2 << std::endl;
    //l1[0] = std::move(basicLibrary[1]);
    //std::cout << "l1: " << l1 << " basicLibrary: " << basicLibrary << std::endl;

    Library library;
    char operation = ' ';
    
    printInstruction();

    std::cout << "Operation: ";
    operation = getchar();

    while (operation != 'q') {
        Book book = {};
        std::string title = "";
        std::string author = "";
        std::string date = "";
        bool isFound = false;
        int currentBookIndex = 0;
        char nextAction = ' ';

        switch (operation) {
        case 'a':
            std::cout << "ADD NEW BOOK" << std::endl;

            std::cout << "Enter book title: ";
            std::cin >> title;

            std::cout << "Enter book author: ";
            std::cin >> author;

            std::cout << "Enter the date: ";
            std::cin >> date;

            book.setTitle(title);
            book.setAuthor(author);
            book.setDate(date);

            library.addBook(book);

            std::cout << "The book has been added successfully!" << std::endl;

            break;
        case 'l':
            std::cout << "LIST ALL BOOKS" << std::endl;
            std::cout << "Use k & l to browse results; q to stop browsing results" << std::endl;

            if (library.getSize() <= 0) {
                std::cout << "NO BOOKS IN THE LIBRARY" << std::endl;
                break;
            }

            /*for (int i = 0; i < library.getSize(); i++) {
                std::cout << library.books[i] << std::endl;
            }*/

            while (nextAction != 'q') {
                system("cls");
                printInstruction();
                
                if (nextAction == 'k' and currentBookIndex >= 1) {
                    currentBookIndex--;
                }
                else if (nextAction == 'l' and currentBookIndex < library.getSize()) {
                    currentBookIndex++;
                }
                else if (nextAction == 'q') {
                    break;
                }
                std::cout << library.books[currentBookIndex] << std::endl;

                std::cout << "Enter next action (k/l/q): " << std::endl;
                std::cin >> nextAction;
            }

            //std::cout << "END OF BOOKS LIST" << std::endl;

            break;
        case 's':
            std::cout << "SEARCH AUTHOR BY TITLE" << std::endl;
            std::cout << "Enter the title: ";
            std::cin >> title;

            isFound = library.searchBookAuthorByTitle(title);

            if (!isFound) {
                std::cout << "Sorry, we couldn't find the author of this book!" << std::endl;
            }

            break;
        }

        std::cout << std::endl << "Operation: ";
        std::cin >> operation;
    }

    return 0;
}
