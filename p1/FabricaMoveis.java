package p1;

public class FabricaMoveis {
	private static int numCadeiras;
	private static int numMesas;
	private static int numEstantes;
	private static int numSofas;
	
	private FabricaMoveis() {
				
	}
	
	public static Cadeira fazerCadeira(String nome, boolean temBraco) {
		numCadeiras ++;
		return new Cadeira(nome,temBraco);	
	}
	public static Mesa fazerMesa(String nome, int tamanho) {
		numMesas ++;
		return new Mesa(nome,tamanho);	
	}
	public static Estante fazerEstante(String nome, int numPrateleiras) {
		numEstantes ++;
		return new Estante(nome,numPrateleiras);	
	}
	public static Sofa fazerSofa(String nome, int numLugares) {
		numSofas ++;
		return new Sofa(nome,numLugares);	
	}

	public static int getNumCadeiras() {
		return numCadeiras;
	}

	public static void setNumCadeiras(int numCadeiras) {
		FabricaMoveis.numCadeiras = numCadeiras;
	}

	public static int getNumMesa() {
		return numMesas;
	}

	public static void setNumMesa(int numMesa) {
		FabricaMoveis.numMesas = numMesa;
	}

	public static int getNumEstantes() {
		return numEstantes;
	}

	public static void setNumEstantes(int numEstantes) {
		FabricaMoveis.numEstantes = numEstantes;
	}

	public static int getNumSofa() {
		return numSofas;
	}

	public static void setNumSofa(int numSofa) {
		FabricaMoveis.numSofas = numSofa;
	}
	
	
	

}
