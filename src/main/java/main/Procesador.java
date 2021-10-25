package main;
public class Procesador {
	private double precio;
	private double Ghz;
	private String marca;
	private TarjetaGrafica tarjetaIntegrada;

	public TarjetaGrafica getTarjetaIntegrada() {
		return tarjetaIntegrada;
	}

	public void setTarjetaIntegrada(TarjetaGrafica tarjetaIntegrada) {
		this.tarjetaIntegrada = tarjetaIntegrada;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = (double) ((Math.random() * (500 - 1)) + 1);
	}

	public double getGhz() {
		return Ghz;
	}

	public void setGhz(double hz) {
		this.Ghz = hz;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Procesador precio=" + precio + ", Ghz=" + Ghz + ", marca=" + marca + ", Tarjeta Integrada= "
				+ tarjetaIntegrada;
	}
	
	
}
