package main;

import java.util.List;
 
public class Ordenador {
	private double precio;
	private String marca;
	private Procesador procesador;
	private List<Ram> listaRam;
	private List<TarjetaGrafica> listaTarjetaGrafica;
	private List<Perifericos> listaPerifericos;
	private PlacaBase placaBase; 
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPrecio() {
 		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public Procesador getProcesador() {
		return procesador;
	}

	public void setProcesador(Procesador procesador) {
		this.procesador = procesador;
	}

	public List<Ram> getListaRam() {
		return listaRam;
	}

	public void setListaRam(List<Ram> listaRam) {
		this.listaRam = listaRam;
	}

	public List<TarjetaGrafica> getListaTarjetaGrafica() {
		return listaTarjetaGrafica;
	}

	public void setListaTarjetaGrafica(List<TarjetaGrafica> listaTarjetaGrafica) {
		this.listaTarjetaGrafica = listaTarjetaGrafica;
	}

	public List<Perifericos> getListaPerifericos() {
		return listaPerifericos;
	}

	public void setListaPerifericos(List<Perifericos> listaPerifericos) {
		this.listaPerifericos = listaPerifericos;
	}

	public PlacaBase getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(PlacaBase placaBase) {
		this.placaBase = placaBase;
	}

	public double calcularPrecioComponentes() {
 		double totalRam = 0;
		double totalTarj = 0;
		double totalPeri = 0;
 		for (Ram ram : listaRam) {
			totalRam += ram.getPrecio();
		}
		for (TarjetaGrafica tarj : listaTarjetaGrafica) {
			totalTarj += tarj.getPrecio();
		}
		for (Perifericos peri : listaPerifericos) {
			totalPeri += peri.getPrecio();
		}
		precio = totalRam + procesador.getPrecio() + placaBase.getPrecio() + totalPeri + totalTarj;
		return precio;

	} 

	@Override
	public String toString() {
		return "Ordenador \nprecio=" + precio +"€"+ ",\nmarca=" + marca + ",\nprocesador=" + procesador + ",\nlistaRam="
				+ listaRam + ",\nlistaTarjetaGrafica=" + listaTarjetaGrafica + ",\nlistaPerifericos=" + listaPerifericos
				+ ",\nplacaBase=" + placaBase ;
	}

}
