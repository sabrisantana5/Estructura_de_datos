public class Main{

	public static void main(String args[]){

		Semaforo s = new Semaforo();

		s.iniciaenRojo();

		s.RojoCambiaVerde();

		s.VerdeCambiaRojo();

		System.out.printf("Estado de la lámpara roja: %s\n",s.getLamparaRoja().getEstado());

		s.getLamparaAmarilla().setIntensidad(2.0);
		System.out.printf("Intensidad de la lámpara amarilla: %.2f ",s.getLamparaAmarilla().getIntensidad());

	}
}