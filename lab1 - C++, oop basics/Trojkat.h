#pragma once


#include "FiguraPlaska.h"


class Trojkat : public FiguraPlaska
{
private:
	double a;
	double b;
	double c;

protected:
	void wypisz(std::ostream& outputStream) const override;

public:
	Trojkat(double a, double b, double c);
	~Trojkat();

	double obwod() override;
	double pole() override;

	double getA() const;
	double getB() const;
	double getC() const;

	void setA(double a);
	void setB(double b);
	void setC(double c);
};

