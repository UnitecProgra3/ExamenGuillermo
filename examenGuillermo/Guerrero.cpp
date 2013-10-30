#include "Guerrero.h"
Guerrero::Guerrero(int hp, int puntos_de_ataque){
this->hp=hp;
this->puntos_de_ataque=puntos_de_ataque;
this->tipo="Guerrero";
};
void Guerrero::imprimir(){
cout<<"HP: "<<hp<<endl;
    cout<<"Puntos de ataque: "<<puntos_de_ataque<<endl;
    cout<<"Tipo: "<<tipo<<endl;
};
void Guerrero::activarPoder(){
puntos_de_ataque*=2;
hp/=2;
}
