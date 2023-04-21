package p1;

public class Mesa extends Movel {
	private int tamanho;

	
	Mesa(String nome, int tamanho){
	super(nome);
	this.tamanho = tamanho;
	}

	@Override
	public String toString() {
		return "Mesa [tamanho=" + tamanho + ", nome=" + super.getNome() + "]";
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}
	
	

}
