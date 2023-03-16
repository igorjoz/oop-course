#include "Stozek.h"


#define _USE_MATH_DEFINES
#include <math.h>


const double DEFAULT_RADIUS = 0.5;
const double DEFAULT_HEIGHT = 0.5;


Stozek::Stozek() {
	this->r = DEFAULT_RADIUS;
	this->h = DEFAULT_HEIGHT;
	this->circle = new Kolo(DEFAULT_RADIUS);

	std::cout << "Cone constructor(" << r << ", " << h << ")" << std::endl;
}


Stozek::Stozek(double r, double h) : r(r), h(h) {
	this->circle = new Kolo(r);
	
	std::cout << "Cone constructor(" << r << ", " << h << ")" << std::endl;
}


Stozek::~Stozek() {
	delete circle;
	
	std::cout << "Cone destructor(" << r << ", " << h << ")" << std::endl;
}


double Stozek::tworzaca() {
	return sqrt(r * r + h * h);
}


double Stozek::polePodstawy() {
	return circle->pole();
}


double Stozek::polePowierzchniBocznej() {
	return M_PI * r * tworzaca();
}


double Stozek::polePowierzchniCalkowitej() {
	return polePowierzchniBocznej() + polePodstawy();
}


void Stozek::wypisz(std::ostream& outputStream) const {
	outputStream << "Stozek(" << r << ", " << h << ")";
}


double Stozek::getR() const {
	return r;
}


double Stozek::getH() const {
	return h;
}


void Stozek::setR(double r) {
	this->r = r;
}


void Stozek::setH(double h) {
	this->h = h;
}
