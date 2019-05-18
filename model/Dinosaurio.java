package model;
import java.util.ArrayList;

public class Dinosaurio extends SerVivo{

public static final int CARNIVORO = 10;
public static final int HERBIVORO = 20;

private int tipo;

public Dinosaurio(int posX, int posY, double calorias, int tipo){
super(posX,posY,calorias);
this.tipo = tipo;

}

public void accion(ArrayList<SerVivo> servivo){
  int retorno = 0;
if(tipo == HERBIVORO){

  for(int i = 0; i < servivo.size(); i++){
    if(servivo.get(i) instanceof Planta && distancia(darPosX() , darPosY() , servivo.get(i).darPosX() , servivo.get(i).darPosY()) < 100 ){
      comer((Comestible) servivo.get(i));
    }
  }

  }else{
      for(int k = 0; k < servivo.size(); k++){
        if(servivo.get(k) instanceof Dinosaurio && distancia(darPosX() , darPosY() , servivo.get(k).darPosX() , servivo.get(k).darPosY()) > 50){
          retorno++;
          }
        }
      }
    }


public void comer(Comestible planta){
Planta p = (Planta)planta;

modificarCalorias(darCalorias() + p.darCalorias());

}

public double distancia(int posX, int posY, int posXPlanta, int posYPlanta){

int calculo = 0.0;

calculo = (posX - posXPlanta) * (posY - posYPlanta);

return Math.sqrt(calculo);



}

public int darTipo(){
  return tipo;
}

public void modificarTipo(int tipo){
  this.tipo = tipo;
}

}
