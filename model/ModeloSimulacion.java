package model;

import java.uril.ArrayList;

public class ModeloSimulacion{

//Constructor
public ModeloSimulacion(){

}

//relacion
private ArrayList<SerVivo> seresSimulacion;

public ArrayList<SerVivo> darSeresSimulacion(){
return seresSimulacion;
}

public void modificarSeresSimulacion(ArrayList<SerVivo> seresSimulacion){
  this.seresSimulacion = seresSimulacion;
}

public void agregarServicio(SerVivo servivo){
  seresSimulacion.add(servivo);
}

}
