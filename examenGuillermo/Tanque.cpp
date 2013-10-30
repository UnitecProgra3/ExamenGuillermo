#include "Tanque.h"

Tanque::Tanque(int hp, int puntos_de_ataque)
{
    this->hp=hp;
    this->puntos_de_ataque=puntos_de_ataque;
    this->tipo="Tanque";
    this->escudo_activado=false;
}

Tanque::~Tanque()
{
    //dtor
}

void Tanque::imprimir()
{
    cout<<"HP: "<<hp<<endl;
    cout<<"Puntos de ataque: "<<puntos_de_ataque<<endl;
    cout<<"Tipo: "<<tipo<<endl;
    cout<<"Escudo: "<<escudo_activado<<endl;
}

void Tanque::activarPoder()
{
    this->escudo_activado=true;
}


void Tanque::recibirAtaque(int ataque)
{
    if(escudo_activado)
        this->hp-=ataque/2;
    else
        this->hp-=ataque;
}
