public class Alumno{

	private String nombre;
	private int matricula;
	private Calif c;

	public Alumno(){
		nombre = "";
		matricula = -1;
		c = new Calif("español",100);
	}

	public Alumno(String nombre, int matricula, Calif c){
	this.nombre = nombre;
	this.matricula = matricula;
	this.c = c;
	}

	public String getNombre(){
		return nombre;
	}
	public int getMatricula(){
		return matricula;
	}
	public Calif getCalif(){
		return c;
	}
	public void setNombre(String n){
		nombre = n;
	}
	public void setMatricula(int m){
		matricula = m;
	}
	public void setCalif(Calif ca){
	c = ca;
	}
}