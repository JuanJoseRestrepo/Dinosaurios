package model;
import java.util.ArrayList;

public class Planta extends SerVivo implements Simulable, Comestible{

private int vecesRealizadas;

public Planta(int posX,int posY, double calorias){
super(posX,posY,calorias);
this.vecesRealizadas = vecesRealizadas;
}

public void accion(ArrayList<SerVivo> SerVivo){
    	modificarCalorias(darCalorias()/2);
  		hacerFotosintesis();
  	}

  	public void hacerFotosintesis(){
  		modificarCalorias(2*darCalorias());
  	}
}
