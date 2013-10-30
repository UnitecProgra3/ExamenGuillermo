#include "Personaje.h"

Personaje::Personaje()
{
    //ctor
}

Personaje::~Personaje()
{
    //dtor
}

Personaje::Personaje(int hp,int puntos_de_ataque,string tipo)
{
    this->hp=hp;
    this->puntos_de_ataque=puntos_de_ataque;
    this->tipo=tipo;
}

void Personaje::recibirAtaque(int ataque)
{
    hp-=ataque;
}
void Personaje::atacarPersonaje(Personaje*objeto){
objeto->recibirAtaque(puntos_de_ataque);
}
