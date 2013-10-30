#include "MagoBlanco.h"

MagoBlanco::MagoBlanco(int hp,int puntos_de_ataque)
{
    this->hp=hp;
    this->puntos_de_ataque=puntos_de_ataque;
    this->tipo="Mago Blanco";
}
void MagoBlanco::imprimir(){
cout<<"HP: "<<hp<<endl;
    cout<<"Puntos de ataque: "<<puntos_de_ataque<<endl;
    cout<<"Tipo: "<<tipo<<endl;
}
void MagoBlanco::activarPoder(){
hp*=2;
puntos_de_ataque/=2;
}
