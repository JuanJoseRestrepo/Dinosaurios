package model;

import java.util.ArrayList;

public class ModeloSimulacion{

//Constructor
public ModeloSimulacion(){

}

//relacion
private ArrayList<SerVivo> seresSimulacion;

public ArrayList<SerVivo> darSeresSimulacion(){

ArrayList<SerVivo> serSimulable = new ArrayList<SerVivo>();

for(int i = 0; i < seresSimulacion.size(); i++){
  if(serSimulable instanceof Simulable){
    serSimulable.add(seresSimulacion.get(i));
  }

}
return serSimulable;
}

public void modificarSeresSimulacion(ArrayList<SerVivo> seresSimulacion){
  this.seresSimulacion = seresSimulacion;
}

public void agregarServicio(SerVivo servivo){
  seresSimulacion.add(servivo);
}

}
