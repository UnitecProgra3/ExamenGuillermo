#ifndef TANQUE_H
#define TANQUE_H

#include "Personaje.h"

class Tanque : public Personaje
{
    public:
        bool escudo_activado;
        Tanque(int hp, int puntos_de_ataque);
        void imprimir();
        void activarPoder();
        void recibirAtaque(int ataque);
        virtual ~Tanque();
    protected:
    private:
};

#endif // TANQUE_H
