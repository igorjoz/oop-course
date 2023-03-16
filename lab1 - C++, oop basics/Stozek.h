#pragma once


#include "Bryla.h"
#include "Kolo.h"


class Stozek : public Bryla
{
private:
	double r;
	double h;
	Kolo *circle;

protected:
	void wypisz(std::ostream& outputStream) const override;

public:
	Stozek(double r, double h);
	Stozek();
	~Stozek();

	double tworzaca();
	double polePodstawy();
	double polePowierzchniBocznej();
	double polePowierzchniCalkowitej();

	double getR() const;
	double getH() const;

	void setR(double r);
	void setH(double a);
};

