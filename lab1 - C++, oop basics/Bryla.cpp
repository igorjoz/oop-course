#include "Bryla.h"


std::ostream& operator<<(std::ostream& outputStream, const Bryla& figura) {
	figura.wypisz(outputStream);

	return outputStream;
}


Bryla::~Bryla() {

}