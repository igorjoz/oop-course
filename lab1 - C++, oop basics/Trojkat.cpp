#include "Trojkat.h"


#include <cmath>


Trojkat::Trojkat(double a, double b, double c) : a(a), b(b), c(c) {
	std::cout << "Triangle constructor(" << a << ", " << b << ", " << c << ")" << std::endl;
}


Trojkat::~Trojkat() {
	std::cout << "Triangle destructor(" << a << ", " << b << ", " << c << ")" << std::endl;
}


double Trojkat::obwod() {
	return a + b + c;
}


double Trojkat::pole() {
	double p = (a + b + c) / 2;

	return sqrt(p * (p - a) * (p - b) * (p - c));
}


void Trojkat::wypisz(std::ostream& outputStream) const {
	outputStream << "Trojkat(" << a << ", " << b << "," << c << ")";
}


double Trojkat::getA() const {
	return a;
}


double Trojkat::getB() const {
	return b;
}


double Trojkat::getC() const {
	return b;
}


void Trojkat::setA(double a) {
	this->a = a;
}


void Trojkat::setB(double b) {
	this->b = b;
}


void Trojkat::setC(double c) {
	this->c = c;
}
