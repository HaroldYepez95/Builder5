package emsamablajecomputadoras.creacional;

public class AsusZenbook extends ComputerBuilder{

	@Override
	public void definirComputador() {
		c = new Computador();
		c.setRam(32);
		c.setAlmacenamiento(1000);
		c.setMarca("Asus");
		c.setModelo("ROG");
		c.setCoolerExterno(true);
	}

	@Override
	public void definirSistemaOperativo() {
		// TODO Auto-generated method stub
		c.setOs(new SistemaOperativo("Windows",64,"10 Pro"));
	}

	@Override
	public void definirMainboard() {
		// TODO Auto-generated method stub
		c.setPlaca(new Mainboard("Strix","x99"));
	}

}
