package memoria;

public class PaginaVirtual {
	private boolean referenciada;
	private boolean modificada;
	private boolean presente;
	private Integer molduraPagina;
	private int indice;
	private int tempoVirtualAtual;
	
	public PaginaVirtual() {
		referenciar(false);
		modificar(false);
		presenca(false);
		setMolduraPagina(null);
		setTempoVirtualAtual(0);
		setIndice(-1);
	}
	
	public void descartarPagina(){
		this.referenciar(false);
		this.modificar(false);
		this.presenca(false);
		this.setMolduraPagina(null);
		this.setTempoVirtualAtual(0);
	}
	
	public void referenciar(boolean bit) {
		this.referenciada = bit;
	}
	
	public boolean referenciada() {
		return this.referenciada;
	}
	
	public void modificar(boolean bit) {
		this.modificada = bit;
	}
	
	public boolean modificada() {
		return this.modificada;
	}
	
	public void presenca(boolean bit) {
		this.presente = bit;
	}
	
	public boolean presente() {
		return this.presente;
	}
	
	public void setIndice(int pIndice) {
	    this.indice = pIndice;
	}
	
	public int getIndice() {
		return this.indice;
	}
	
	public void setMolduraPagina(Integer pMolduraPagina){
		this.molduraPagina = pMolduraPagina;
	}
	
	public Integer getMolduraPagina(){
		return this.molduraPagina;
	}
	
	public void setTempoVirtualAtual(int pTempo) {
		this.tempoVirtualAtual = pTempo;
	}
	
	public int getTempoVirtualAtual() {
		return this.tempoVirtualAtual;
	}	
}