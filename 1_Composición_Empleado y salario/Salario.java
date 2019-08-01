public class Salario{

	private double sNeto;
	private double sBase;
	private double primaDeAntiguedad; //la prima de antigüedad consiste en el pago de 12 días de salario extra por cada año trabajado para este pago mensual
	private double incProduct;
	private double incPunt;
	private double retSS;
	private double retSalario;

	public Salario(){
		sBase = 0.0;
	}
	public Salario(double sBase){
		this.sBase = sBase;
	}

	public double calculasNeto(double antiguedad, boolean tarde, boolean trabaja){
		primaDeAntiguedad = antiguedad*0.4*sBase;
			if(tarde==false)
				incPunt = sBase*0.01;
			if(trabaja==true)
				incProduct = sBase*0.01;
			if(sBase<6000)
			{
					retSalario = sBase*0.07;
					retSS = sBase*0.05;
					sBase = sBase-(sBase*.12);
			}
			else
			{
					retSalario = sBase*0.09;
					retSS = sBase*0.05;
					sBase = sBase-(sBase*.14);
			sNeto = sBase + incPunt + incProduct + primaDeAntiguedad;
		}
			return sNeto;
	}
	public String toString(){
		return "Total de retenciones:\n"+"Incentivo de producción: "+incProduct+"\nIncentivo de puntualidad: "+incPunt+"\nPrima de antiguedad: "+primaDeAntiguedad+"\nRetenciones por salario: "+retSalario+"\nRetenciones por seguro social: "+retSS;
	}

	public void incrementarBase(double a){
		sBase += a;
	}
	public void decrementarBase(double a){
		sBase -= a;
	}
	public void setsNeto(double s){
		sNeto = s;
	}
	public double getsNeto(){
		return sNeto;
	}
	public void setsBase(double s){
		sBase = s;
	}
	public double getsBase(){
		return sBase;
	}

}