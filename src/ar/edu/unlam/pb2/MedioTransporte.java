package ar.edu.unlam.pb2;

public abstract class MedioTransporte {
	protected String patente;
	protected Integer cantidadDePasajeros;
	protected Integer velocidad;
	protected Double latitud;
	protected Double longitud;
	
	public MedioTransporte(String patente, Integer cantidadPasajeros, Integer velocidad, Double latitud, Double longitud) {
		this.patente = patente;
		this.cantidadDePasajeros = cantidadPasajeros;
		this.velocidad = velocidad;
		this.latitud = latitud;
		this.longitud = longitud;	
	}
	
	//Bici
	public MedioTransporte(Double latitud, Double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
		/*this.cantidadDePasajeros = 1; //cuento como pasajero al que maneja la bici
		this.velocidad = 0; */
	}
	
	public MedioTransporte(Integer cantidadPasajerosPorVagon, Integer velocidad, Double latitud, Double longitud) {
		this.cantidadDePasajeros = cantidadPasajerosPorVagon;
		this.velocidad = velocidad;
		this.latitud = latitud;
		this.longitud = longitud;
	}

	public String getPatente() {
		return this.patente;
	}
	
	public Integer getCantidadDePasajeros() {
		return this.cantidadDePasajeros;
	}
	
	public Integer getVelocidad() {
		return this.velocidad;
	}
	
	public Double getLatitud() {
		return this.latitud;
	}
	
	public Double getLongitud() {
		return this.longitud;
	}

	public void actualizarCoordenadas(double latitud, double longitud) {
		this.latitud = latitud;
		this.longitud = longitud;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((latitud == null) ? 0 : latitud.hashCode());
		result = prime * result + ((longitud == null) ? 0 : longitud.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MedioTransporte other = (MedioTransporte) obj;
		if (latitud == null) {
			if (other.latitud != null)
				return false;
		} else if (!latitud.equals(other.latitud))
			return false;
		if (longitud == null) {
			if (other.longitud != null)
				return false;
		} else if (!longitud.equals(other.longitud))
			return false;
		return true;
	}
	
	
	
}
