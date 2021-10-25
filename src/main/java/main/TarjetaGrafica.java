package main;

public class TarjetaGrafica {
	private double precio;
	private String marca;
 	private Ram ramIntegrada;
 	private String modelo;
 	
 	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = (double) ((Math.random() * (500 - 1)) + 1);
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
 
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	@Override
	public String toString() {
		return "TarjetaGrafica precio=" + precio + ", marca=" + marca +  ", modelo=" + modelo + ", ram Integrada=" + ramIntegrada;
	}
	public Ram getRamIntegrada() {
		return ramIntegrada;
	}
	public void setRamIntegrada(Ram ramIntegrada) {
		this.ramIntegrada = ramIntegrada;
	}
	
}
