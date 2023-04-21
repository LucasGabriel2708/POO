package p1;

public class Cadeira extends Movel{
	private boolean temBraco;
	
	
	Cadeira(String nome, boolean temBraco){
		super(nome);
		this.temBraco = false;
		}

	@Override
	public String toString() {
		return "Cadeira [temBraco=" + temBraco + ", nome=" + super.getNome() + "]";
	}

	public boolean isTemBraco() {
		return temBraco;
	}

	public void setTemBraco(boolean temBraco) {
		this.temBraco = temBraco;
	}
	

}
