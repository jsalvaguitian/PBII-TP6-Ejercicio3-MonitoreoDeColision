package ar.edu.unlam.pb2;

public class Tren extends MedioTransporte {

	private Integer cantidadDeVagones;
	
	public Tren(Integer cantidadDeVagones, Integer cantidadPasajerosPorVagon, Integer velocidad, Double latitud, Double longitud) {
		super(cantidadPasajerosPorVagon, velocidad, latitud, longitud);
		
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	public void setCantidadDeVagones(Integer cantidadDeVagones) {
		this.cantidadDeVagones = cantidadDeVagones;
	}

	public Integer getCantidadDePasajerosPorVagon() {
		
		return this.cantidadDePasajeros;
	}
	
	

}
