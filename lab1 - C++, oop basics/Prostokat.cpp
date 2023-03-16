#include "Prostokat.h"


Prostokat::Prostokat(double a, double b) : a(a), b(b) {
	std::cout << "Rectangle constructor(" << a << ", " << b << ")" << std::endl;
}


Prostokat::~Prostokat() {
	std::cout << "Rectangle destructor(" << a << ", " << b << ")" << std::endl;
}


double Prostokat::obwod() {
	return 2 * a + 2 * b;
}


double Prostokat::pole() {
	return a * b;
}


void Prostokat::wypisz(std::ostream& outputStream) const {
	outputStream << "Rectangle(" << a << ", " << b << ")";
}


double Prostokat::getA() const {
	return a;
}


double Prostokat::getB() const {
	return b;
}


void Prostokat::setA(double a) {
	this->a = a;
}


void Prostokat::setB(double b) {
	this->b = b;
}
