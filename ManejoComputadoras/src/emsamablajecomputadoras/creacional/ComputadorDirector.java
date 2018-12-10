package emsamablajecomputadoras.creacional;

public class ComputadorDirector {
	private ComputerBuilder builder;
	
	public ComputadorDirector(ComputerBuilder builder) {
		this.builder = builder;
	}
	
	public void ConstruirComputador() {
		builder.definirComputador();
		builder.definirSistemaOperativo();
		builder.definirMainboard();
	}
	
	public Computador getComputador() {
		return builder.getComputador();
	}
}
