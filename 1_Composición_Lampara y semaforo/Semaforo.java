public class Semaforo{

	private Lampara L1; //roja
	private Lampara L2; //amarilla
	private Lampara L3; //verde

	public Semaforo(){
		L1 = new Lampara(true,1.0,"Rojo");
		L2 = new Lampara(true,1.0,"Amarillo");
		L3 = new Lampara(true,1.0,"Verde");
		System.out.println("Se ha creado un semaforo, las 3 lamparas estan encendidas :)\n");
		}

	public Lampara getLamparaRoja(){
		return L1;
	}
	public Lampara getLamparaAmarilla(){
			return L2;
	}
	public Lampara getLamparaVerde(){
			return L3;
	}
	public void iniciaenVerde(){
		System.out.println("Se iniciará el semáforo en verde\n");
		L1.apagar();
		System.out.println("Rojo off");
		L2.apagar();
		System.out.println("Amarillo off");
		//verde ya está encendido
		System.out.println("Semáforo en verde\n");
	}
	public void iniciaenRojo(){
		System.out.println("Se iniciará el semáforo en rojo\n");
		L3.apagar();
		System.out.println("Verde off");
		L2.apagar();
		System.out.println("Amarillo off");
		//rojo ya está encendido
		System.out.println("Semáforo en rojo\n");
	}


	public void VerdeCambiaRojo (){

		System.out.println("Cambiar de verde a rojo:\n");
		L3.apagar();
		System.out.println("Verde off");
		L2.encender();
		System.out.println("Amarillo on");
		L2.apagar();
		System.out.println("Amarillo off");
		L1.encender();
		System.out.println("Rojo on");

		System.out.println("Semaforo en rojo :)\n");
	}

	public void RojoCambiaVerde (){

		System.out.println("Cambiar de rojo a verde:\n");
		L1.apagar();
		System.out.println("Rojo off");
		L2.encender();
		System.out.println("Amarillo on");
		L2.apagar();
		System.out.println("Amarillo off");
		L3.encender();
		System.out.println("Verde on");

		System.out.println("Semaforo en verde :)\n");
	}
}