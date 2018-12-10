package emsamablajecomputadoras.creacional;

public abstract class ComputerBuilder {
	
	Computador c;
	
	public Computador getComputador() {
		return c;
	}
	
	public abstract void definirComputador();
	public abstract void definirSistemaOperativo();
	public abstract void definirMainboard();
	
}
