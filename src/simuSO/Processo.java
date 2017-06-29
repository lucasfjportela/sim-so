package simuSO;

import memoria.PaginaVirtual;

public class Processo implements Runnable {
	
	private PaginaVirtual memoria;
	private int indice;
	
	public Processo(PaginaVirtual pMemoria) {
		this.memoria = pMemoria;
		this.indice = pMemoria.getIndice();
	}
	
	@Override
	public void run() {
		while(true) {
			System.out.println("processo consumindo a posi��o " + this.indice + " da memoria");
		}
	}

}
