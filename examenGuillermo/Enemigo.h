#ifndef ENEMIGO_H
#define ENEMIGO_H

#include "Jugador.h"

class Enemigo
{
    public:
        Jugador*jugador;
        Enemigo(Jugador*jugador);
        void atacar();
        virtual ~Enemigo();
    protected:
    private:
};

#endif // ENEMIGO_H
