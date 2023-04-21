package p1;

public class Sofa extends Movel {
	private int numLugares;
		
	Sofa(String nome, int numLugares){
		super(nome);
		this.numLugares = numLugares;
	}

	@Override
	public String toString() {
		return "Sofa [numLugares=" + numLugares + ", nome=" + super.getNome() + "]";
	}

	public int getNumLugares() {
		return numLugares;
	}

	public void setNumLugares(int numLugares) {
		this.numLugares = numLugares;
	}
	

}
