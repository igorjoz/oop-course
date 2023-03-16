#include "Kolo.h"


#define _USE_MATH_DEFINES
#include <math.h>


Kolo::Kolo(double r) : r(r) {
	std::cout << "Circle constructor(" << r << ")" << std::endl;
}


Kolo::~Kolo() {
	std::cout << "Circle destructor(" << r << ")" << std::endl;
}


double Kolo::obwod() {
	return 2 * M_PI * r;
}


double Kolo::pole() {
	return M_PI * r * r;
}


void Kolo::wypisz(std::ostream& outputStream) const {
	outputStream << "Kolo(" << r << ")";
}


double Kolo::getR() const {
	return r;
}


void Kolo::setR(double r) {
	this->r = r;
}
