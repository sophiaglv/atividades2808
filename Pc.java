package poo2808;

public class Pc {
	//Atributos
	String cor;
	String tpTeclado;
	int tamMonitor;
	String marca;

	//Métodos
	String ligar;
	String desligar;
	String led;
	String viciado;

	public String getCor () {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getTpTeclado () {
		return tpTeclado;
	}
	public void setTpTeclado(String tpTeclado) {
		this.tpTeclado = tpTeclado;
	}
	public int getTamMonitor () {
		return tamMonitor;
	}
	public void setTamMonitor(int tamMonitor) {
		this.tamMonitor = tamMonitor;
	}
	public String getMarca () {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getLigar () {
		return ligar;
	}
	public void setLigar(String ligar) {
		this.ligar = ligar;
	}
	public String getDesligar () {
		return desligar;
	}
	public void setDesligar(String desligar) {
		this.desligar = desligar;
	}
	public String getLed () {
		return led;
	}
	public void setLed(String led) {
		this.led = led;
	}
	public String getViciado () {
		return viciado;
	}
	public void setViciado(String viciado) {
		this.viciado = viciado;
	}
}
