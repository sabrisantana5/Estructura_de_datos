public class Main{

	public static void main(String args[]){

		Semaforo s = new Semaforo();

		s.iniciaenRojo();

		s.RojoCambiaVerde();

		s.VerdeCambiaRojo();

		System.out.printf("Estado de la l�mpara roja: %s\n",s.getLamparaRoja().getEstado());

		s.getLamparaAmarilla().setIntensidad(2.0);
		System.out.printf("Intensidad de la l�mpara amarilla: %.2f ",s.getLamparaAmarilla().getIntensidad());

	}
}