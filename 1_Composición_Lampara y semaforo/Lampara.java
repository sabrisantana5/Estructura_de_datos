public class Lampara{

 private boolean estado;
 private double intensidad;
 private String color;

 public Lampara(){
 estado = false;
 intensidad = 0.0;
 color = "";
 }
 public Lampara(boolean estado, double intensidad, String color){
   this.estado = estado;
   this.intensidad = intensidad;
   this.color = color;
 }

 public void setEstado(boolean estado){
  this.estado = estado;
 }

 public void setIntensidad(double intensidad){
  this.intensidad = intensidad;
 }

 public void encender(){
	 estado = true;
 }
 public void apagar(){
	 estado = false;
	 intensidad = 0.0;
 }

 public String getEstado(){
 return((estado)?"Prendido":"Apagado");
}
 public double getIntensidad(){
 return intensidad;
 }
}