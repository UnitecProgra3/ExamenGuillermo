#ifndef GUERRERO_H_INCLUDED
#define GUERRERO_H_INCLUDED

#include "Personaje.h"

class Guerrero:public Personaje
{
public:
        Guerrero(int hp,int puntos_de_ataque);
        void imprimir();
        void activarPoder();

};

#endif // GUERRERO_H_INCLUDED
