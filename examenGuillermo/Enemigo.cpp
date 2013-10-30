#include "Enemigo.h"

Enemigo::Enemigo(Jugador*jugador)
{
    this->jugador=jugador;
}

Enemigo::~Enemigo()
{
    //dtor
}

void Enemigo::atacar()
{
    jugador->hp-=10;
}
