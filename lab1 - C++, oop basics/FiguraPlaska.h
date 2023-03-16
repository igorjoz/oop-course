#pragma once


#include <iostream>


class FiguraPlaska
{
protected:
	virtual void wypisz(std::ostream& outputStream) const = 0;
	friend std::ostream& operator<<(std::ostream& outputStream, const FiguraPlaska& figura);

public:
	virtual double pole() = 0;
	virtual double obwod() = 0;
	virtual ~FiguraPlaska();
};

