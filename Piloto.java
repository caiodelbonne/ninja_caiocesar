package entity;

import java.util.List;

public class Piloto {

	private String nome;
	private int numeroPiloto;
	private int posicaoChegada;
	private int tempoDaProva;

	public int getTempoDaProva() {
		return tempoDaProva;
	}

	public Piloto(String nome, int numeroPiloto, int tempoDaProva) {
		this.nome = nome;
		this.numeroPiloto = numeroPiloto;
		this.tempoDaProva = tempoDaProva;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroPiloto() {
		return numeroPiloto;
	}

	public int getPosicaoChegada() {
		return posicaoChegada;
	}

	public void setPosicaoChegada(int posicaoChegada) {
		this.posicaoChegada = posicaoChegada;
	}

	@Override
	public String toString() {
		return "[ Campeão :" + nome +" Numero do piloto: " + numeroPiloto + " ]";
	}

	
	

}
