import java.util.ArrayList;
public class Main{

	public static void main(String[] args){

	ArrayList<Empleado> nomina = new ArrayList<Empleado>();

	Salario s;

	Empleado a = new Empleado(new Salario(12000.0),"Sabrina","A01025397","Interlomas 53" );
	Empleado b = new Empleado(new Salario(13000.0),"Alejandro","A01025398","Satélite 55");

	nomina.add(a);
	nomina.add(b);

	a.getSalario().incrementarBase(3000.0);
	a.setTrabaja(true);
	b.setLlegaTarde(true);

		System.out.println("Bienvenido a la nómina de empleados :)");


	for(Empleado e : nomina){

		System.out.println(e.toString());
		System.out.printf("Salario base: %.2f\n",e.getSalario().getsBase());
		System.out.printf("Salario neto: %.2f \n",e.getSalario().calculasNeto(5,e.getllegaTarde(), e.getTrabaja()));
		System.out.println(e.getSalario().toString());
	}


	}
}