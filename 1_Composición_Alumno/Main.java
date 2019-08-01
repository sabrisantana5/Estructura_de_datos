public class Main{

	public static void main(String[] args){

	Calif d = new Calif("Default",0);
	Alumno a = new Alumno("Sabrina",5397,d);
	Calif c = new Calif("Matematicas",95);

	a.setCalif(c);

	System.out.printf("Informacion:\nNombre: %s\nMatricula:%d\nMateria:%s\nCalificacion:%d\n",a.getNombre(),a.getMatricula(),a.getCalif().getNombreMateria(),a.getCalif().getPuntos());
	}
}