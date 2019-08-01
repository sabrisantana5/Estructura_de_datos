/* Programa que realiza suma de polinomios
Realizado en Netbeans */
package polinomios;
public class Polinomios {
    public static void main(String[] args) {
        Polinomio p1 = new Polinomio(0,10);
        p1.setSiguiente(new Polinomio(2,4));
        p1.getSiguiente().setSiguiente(new Polinomio(40,20));
        p1.getSiguiente().getSiguiente().setSiguiente(new Polinomio(86,8));
        Polinomio p2 = new Polinomio(1,7);
        p2.setSiguiente(new Polinomio(2,10));
        p2.getSiguiente().setSiguiente(new Polinomio(86,-8));
        //p2.getSiguiente().getSiguiente().setSiguiente(new Polinomio(0,0));

        printPolinomioLigado(SumaPolinomios(p1,p2));

    }
    public static Polinomio SumaPolinomios(Polinomio p1, Polinomio p2){
        Polinomio r = new Polinomio(0,0);

        if((p1==null)||(p2==null)){
        return r;
      }
        if(p1.getExponente()<p2.getExponente()){
            r = p1;
            r.setSiguiente(SumaPolinomios(p1.getSiguiente(),p2));
        }
         if(p1.getExponente()>p2.getExponente()){
             r = p2;
             r.setSiguiente(SumaPolinomios(p1,p2.getSiguiente()));

         }
         if(p1.getExponente()==p2.getExponente()){
             r = p1;
             r.setCoeficiente(p1.getCoeficiente() + p2.getCoeficiente());
             if(r.getCoeficiente()==0){
                r = SumaPolinomios(p1.getSiguiente(), p2.getSiguiente());
                p1 = null; //nunca llega a esta instruccion pero no se como hacerlas a la par
             }
             else{
                 r.setSiguiente(SumaPolinomios(p1.getSiguiente(), p2.getSiguiente())); //aqui hay algo apuntando a null
             }
               p2 = null;
         }
        return r;
    }
     private static void printPolinomioLigado(Polinomio p1){
           System.out.println(p1);

           while(p1.getSiguiente()!=null){
               if(p1.getSiguiente().getCoeficiente()==0){
               }
               else{
                p1 = p1.getSiguiente();
                System.out.println(p1);
               }
            }
       }

}
