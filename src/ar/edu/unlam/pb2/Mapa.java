package ar.edu.unlam.pb2;

import java.util.HashSet;
import java.util.Set;

public class Mapa {
	
	private String nombreDelLugar;
	private Set<MedioTransporte> conjuntoDeVehiculos;

	public Mapa(String nombreDelLugar) {
		this.nombreDelLugar = nombreDelLugar;
		this.conjuntoDeVehiculos = new HashSet<>();
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public void agregarVehiculo(MedioTransporte vehiculo) throws PatenteDuplicadaException, ColitionException {
		
		
		validarPatenteDuplicadas(vehiculo); //valido previamente que no se agregue auto o motos con la misma patente
		
		if(!this.conjuntoDeVehiculos.add(vehiculo)) {
			throw new ColitionException("Ups... Houston tenemos un problemos hubo una colisión x_x");
		}
	}

///////////////////////////////////////////////////////////////////////////////////////////////////////////
	private void validarPatenteDuplicadas(MedioTransporte vehiculo) throws PatenteDuplicadaException{
		
		for(MedioTransporte unVehiculoDelSet : this.conjuntoDeVehiculos) {
			if((unVehiculoDelSet instanceof Moto  || unVehiculoDelSet instanceof Auto) &&  
				(vehiculo instanceof Moto || vehiculo instanceof Auto) 
				&& unVehiculoDelSet.getPatente().equals(vehiculo.getPatente())) {
				
				throw new PatenteDuplicadaException("El vehiculo tiene una patente duplicada");
			}
		}
	}
///////////////////////////////////////////////////////////////////////////////////////////////////////////

	public Integer getCantidadDeVehiculos() {
		return this.conjuntoDeVehiculos.size();
	}

	public void hayColicion() throws ColitionException {
		//Recorro todo mi hashSet y comparo uno por uno su latitud y longitud
		
		for(MedioTransporte elVehiculoAComparar: this.conjuntoDeVehiculos) {
			
			for(MedioTransporte elOtroVehiculoAComparar : this.conjuntoDeVehiculos) {
				
				if(!(elVehiculoAComparar.equals(elOtroVehiculoAComparar)) && 
					(elVehiculoAComparar.latitud.equals(elOtroVehiculoAComparar.latitud) && elVehiculoAComparar.longitud.equals(elOtroVehiculoAComparar.longitud))){
					
					throw new ColitionException("Ups... Houston tenemos un problemos hubo una colisión x_x");
				}
			}
			
		}
		
	}

}
