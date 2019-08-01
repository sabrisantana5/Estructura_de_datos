public class Empleado{

	private Salario salario;
	private String nombre;
	private String matricula;
	private String direccion;
	private boolean llegaTarde=false;
	private boolean trabaja=true;

	public Empleado(Salario salario,String nombre, String matricula, String direccion){
		this.salario = salario;
		this.nombre = nombre;
		this.matricula = matricula;
		this.direccion = direccion;
	}

	public Salario getSalario(){
	return salario;
	}

	public void setLlegaTarde(boolean r){
		llegaTarde = r;
	}
	public boolean getllegaTarde(){
		return llegaTarde;
	}

	public void setTrabaja(boolean t){
		trabaja = t;
	}
	public boolean getTrabaja(){
		return trabaja;
	}

	public String toString(){
		return "\nNombre: "+nombre+"\nMatrícula: "+matricula+"\nDireccion: "+direccion;
	}

}