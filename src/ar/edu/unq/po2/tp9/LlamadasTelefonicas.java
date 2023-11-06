package ar.edu.unq.po2.tp9;

public abstract class LlamadasTelefonicas {
	private int tiempo;
	private int horaDelDia;
	
	public LlamadasTelefonicas(int tiempo, int horaDelDia){
		this.tiempo = tiempo;
		this.horaDelDia = horaDelDia;
	}
	
	public int getTiempo(){ //Operacion concreta
		return this.tiempo;
	}
	
	public int getHoraDelDia(){ //Operacion concreta
		return this.horaDelDia;
	}
	
	public abstract boolean esHoraPico(); //Operacion primitiva
	
	public float costoFinal(){ //Template method
		if(this.esHoraPico()){
			return this.costoNeto()*1.2f*this.getTiempo();
		}
		else{
			return this.costoNeto()*this.getTiempo();
		}
	}
	
	public float costoNeto(){ //Operacion Hook
		return this.getTiempo()*1;
	}
}
