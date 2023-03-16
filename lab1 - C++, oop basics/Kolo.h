#pragma once


#include "FiguraPlaska.h"


class Kolo : public FiguraPlaska
{
private:
	double r;

protected:
	void wypisz(std::ostream& outputStream) const override;

public:
	Kolo(double r);
	~Kolo();

	double obwod() override;
	double pole() override;

	double getR() const;

	void setR(double a);
};

