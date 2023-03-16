#pragma once


#include <iostream>


class Bryla
{
protected:
	virtual void wypisz(std::ostream& outputStream) const = 0;
	friend std::ostream& operator<<(std::ostream& outputStream, const Bryla& figura);

public:
	virtual double polePodstawy() = 0;
	virtual double polePowierzchniBocznej() = 0;
	virtual double polePowierzchniCalkowitej() = 0;
	virtual ~Bryla();
};
