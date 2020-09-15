package entities;

import exceptions.VotoInvalidoException;

public class Voto {
	private String nome;
	private int voto;
	
	public Voto(String nome, int voto) {
		this.nome = nome;
		this.voto = voto;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getVoto() {
		return voto;
	}
	public void setVoto(int voto) throws VotoInvalidoException {
		
		if(voto>150) {
			throw new VotoInvalidoException();
		}
		this.voto = voto;
	}

	@Override
	public String toString() {
		return "Voto [nome=" + nome + ", voto=" + voto + "]";
	}
	
	
}
