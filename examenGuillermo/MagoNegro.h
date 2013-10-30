#ifndef MAGONEGRO_H_INCLUDED
#define MAGONEGRO_H_INCLUDED
#include "Personaje.h"

class MagoNegro : public Personaje
{
public:
    bool super_rayo_activado;
    MagoNegro(int hp,int puntos_de_ataque);
    void imprimir();
    void activarPoder();
    void atacarPersonaje(Personaje*objeto);
};

#endif // MAGONEGRO_H_INCLUDED
