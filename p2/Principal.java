package p2;

import p1.FabricaMoveis;

public class Principal {
	public static void main(String[] args) {
		FabricaMoveis.fazerSofa("SOFA 1",2);
		FabricaMoveis.fazerSofa("SOFA 2",5);
		System.out.println("Total de sofás é: "  + FabricaMoveis.getNumSofa());
		
		FabricaMoveis.fazerMesa("MESA 1",4);
		FabricaMoveis.fazerMesa("MESA 2",6);
		System.out.println("Total de mesas é: "  +FabricaMoveis.getNumMesa());
		
		FabricaMoveis.fazerCadeira("CADEIRA 1",true);
		FabricaMoveis.fazerCadeira("CADEIRA 2",false);
		System.out.println("Total de cadeiras é: "  +FabricaMoveis.getNumCadeiras());
		
		FabricaMoveis.fazerEstante("ESTANTE 1",8);
		FabricaMoveis.fazerEstante("ESTANTE 2",10);
		System.out.println("Total de estantes é: "  +FabricaMoveis.getNumEstantes());
				
	}

}

