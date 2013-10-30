#ifndef PERSONAJE_H
#define PERSONAJE_H

#include <string>
#include <iostream>
using namespace std;

class Personaje
{
    public:
        int hp;
        int puntos_de_ataque;
        string tipo;
        Personaje();
        Personaje(int hp,int puntos_de_ataque,string tipo);
        virtual void imprimir()=0;
        virtual void recibirAtaque(int ataque);
        virtual void activarPoder()=0;
        virtual void atacarPersonaje(Personaje*objeto);
        virtual ~Personaje();
    protected:
    private:
};

#endif // PERSONAJE_H
