#include <iostream>


#include "Prostokat.h"
#include "Trojkat.h"
#include "Kolo.h"
#include "Stozek.h"


int main()
{
	int const SHAPES_QUANTITY = 10;

	for (int i = 0; i < SHAPES_QUANTITY; i++) {
		if (i % 3 == 0) {
			Prostokat* rectangle = new Prostokat(i, 2 * i);

			std::cout << *rectangle << std::endl;
			std::cout << "Pole: " << rectangle->pole() << std::endl;
			std::cout << "Obwod: " << rectangle->obwod() << std::endl << std::endl;

			delete rectangle;
		}
		else if (i % 3 == 1) {
			Trojkat* triangle = new Trojkat(i * 3, i * 4, i * 5);

			std::cout << *triangle << std::endl;
			std::cout << "Pole: " << triangle->pole() << std::endl;
			std::cout << "Obwod: " << triangle->obwod() << std::endl << std::endl;

			delete triangle;
		}
		else {
			Kolo* circle = new Kolo(i * 3);

			std::cout << *circle << std::endl;
			std::cout << "Pole: " << circle->pole() << std::endl;
			std::cout << "Obwod: " << circle->obwod() << std::endl << std::endl;

			delete circle;
		}
	}

	for (int i = 0; i < SHAPES_QUANTITY; i++) {
		Stozek* cone = new Stozek(i * 2, i * 3);

		std::cout << *cone << std::endl;
		std::cout << "Tworzaca: " << cone->tworzaca() << std::endl;
		std::cout << "Pole powierzchni bocznej: " << cone->polePowierzchniBocznej() << std::endl;
		std::cout << "Pole powierzchni calkowitej: " << cone->polePowierzchniCalkowitej() << std::endl << std::endl;

		delete cone;
	}
}
