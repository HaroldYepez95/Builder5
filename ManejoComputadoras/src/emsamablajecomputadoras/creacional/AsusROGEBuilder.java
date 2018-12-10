package emsamablajecomputadoras.creacional;

public class AsusROGEBuilder extends ComputerBuilder {
	
	
	
	public void definircomputador() { 
		
		
		
		
	}

	@Override
	public void definirComputador() {
		c = new Computador();
		
		c.setMarca( "Asus") ;
		c.setModelo("ROG") ;
		c.setRam(32);
		c.setAlmacenamiento(1000);
		
	}

	@Override
	public void definirSistemaOperativo() {
		c.setOs( new SistemaOperativo("Windows",64, "10 PRO"));
		
	}

	@Override
	public void definirMainboard() {
		c.setPlaca(new Mainboard ("Strix" , "x99"));
		
	}


}
