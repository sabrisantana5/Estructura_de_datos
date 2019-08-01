package polinomios;
public class Polinomio {
    private int exponente;
    private int coeficiente;
    private Polinomio siguiente;

    public Polinomio(int exponente, int coeficiente) {
        this.exponente = exponente;
        this.coeficiente = coeficiente;
    }
    
    public int getExponente() {
        return exponente;
    }

    public void setExponente(int exponente) {
        this.exponente = exponente;
    }

    public int getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(int coeficiente) {
        this.coeficiente = coeficiente;
    }

    public Polinomio getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Polinomio siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return "Polinomio{" + "exponente=" + exponente + ", coeficiente=" + coeficiente +'}';
    }
    
    
}
