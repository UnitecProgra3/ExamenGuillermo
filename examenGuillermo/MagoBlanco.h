#ifndef MAGOBLANCO_H_INCLUDED
#define MAGOBLANCO_H_INCLUDED
#include "Personaje.h"
class MagoBlanco: public Personaje
{
public:
        MagoBlanco(int hp,int puntos_de_ataque);
        void imprimir();
        void activarPoder();
};

#endif // MAGOBLANCO_H_INCLUDED
