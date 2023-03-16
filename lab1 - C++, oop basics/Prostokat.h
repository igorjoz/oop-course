#pragma once


#include "FiguraPlaska.h"


class Prostokat : public FiguraPlaska {
private:
	double a;
	double b;

protected:
	void wypisz(std::ostream& outputStream) const override;

public:
	Prostokat(double a, double b);
	~Prostokat() override;
	
	double obwod() override;
	double pole() override;

	double getA() const;
	double getB() const;
	
	void setA(double a);
	void setB(double b);
};
