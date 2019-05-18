package model;

public abstract class SerVivo{

private int posX;
private int posY;
private double calorias;

public SerVivo(int posX, int posY,double calorias){
this.posX = posX;
this.posY = posY;
this.calorias = calorias;
}

public int darPosY(){
  return posY;
}

public void modificarPosY(int posY){
  this.posY = posY;
}

public int darPosX(){
  return posX;
}

public void modificarPosX(int posX){
  this.posX = posX;
}

public int darCalorias(){
  return calorias;
}

public void modificarCalorias(double calorias){
  this.calorias = calorias;
}


}
