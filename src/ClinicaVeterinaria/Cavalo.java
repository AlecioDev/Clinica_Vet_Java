package ClinicaVeterinaria;

public class Cavalo extends Animal {

	private static final long serialVersionUID = 1L;

	public String soar() {
		return "Relinchos";
	}
	public Cavalo(String nome, int idade, String dono) {
		super(nome, idade, dono);
		this.especie 	= "Cavalo";
		this.alimento 	= "Ra��o, aveia, alfafa, ma��, etc.";
		this.cuidados 	= "Corrida, trote, cascos e ferraduras.";
	}
}
