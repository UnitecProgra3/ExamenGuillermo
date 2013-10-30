#include "MagoNegro.h"

MagoNegro::MagoNegro (int hp , int punto_de_ataque)
{
    this->hp=hp;
    this->puntos_de_ataque=puntos_de_ataque;
    this->tipo="Mago Negro";
    this->super_rayo_activado=false;
}

void MagoNegro::imprimir()
{
    cout<<"HP: "<<hp<<endl;
    cout<<"Puntos de ataque: "<<puntos_de_ataque<<endl;
    cout<<"Tipo: "<<tipo<<endl;
    cout<<"Super rayo : "<<super_rayo_activado<<endl;
}

void MagoNegro::activarPoder()
{
    super_rayo_activado=true;
}
void MagoNegro::atacarPersonaje(Personaje*objeto)
{
    if (super_rayo_activado)
        objeto->recibirAtaque(puntos_de_ataque*2);
    else
        objeto->recibirAtaque(puntos_de_ataque);
}
