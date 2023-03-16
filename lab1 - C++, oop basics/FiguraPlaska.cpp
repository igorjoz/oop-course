#include "FiguraPlaska.h"


std::ostream& operator<<(std::ostream& outputStream, const FiguraPlaska& figura) {
	figura.wypisz(outputStream);
	
	return outputStream;
}


FiguraPlaska::~FiguraPlaska() {
	
}