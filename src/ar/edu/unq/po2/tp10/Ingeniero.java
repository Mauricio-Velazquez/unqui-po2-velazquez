package ar.edu.unq.po2.tp10;

public class Ingeniero implements Movimiento {
	private int lajasDisponibles;
	
	Ingeniero(int lajasDisponibles){
		this.lajasDisponibles = lajasDisponibles;
	}
	
    @Override
    public void caminar() {
        if (lajasDisponibles > 0) {
            construirCamino();
            lajasDisponibles--;
        } else {
            caminarNormalmente();
        }
    }
    
    public int getLajasDisponibles(){
    	return lajasDisponibles;
    }

    private void construirCamino() {
        // Implementar lógica para construir el camino y colocar lajas
    }

    private void caminarNormalmente() {
        // Implementar lógica para caminar sin construir el camino
    }
}
