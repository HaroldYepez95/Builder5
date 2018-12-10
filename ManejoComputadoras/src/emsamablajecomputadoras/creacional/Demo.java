package emsamablajecomputadoras.creacional;

public class Demo {
	
	  public static void main(String[] args) {
		  
		  ComputadorDirector directorR = new ComputadorDirector(new AsusROGEBuilder());
		  
		  directorR.ConstruirComputador();
		  	Computador roge= directorR.getComputador(); 
		  	
		  	
		  	ComputadorDirector directorZ = new ComputadorDirector(new AsusZenbook());
			  
			  directorZ.ConstruirComputador();
			  Computador zen= directorZ.getComputador(); 
			  
			  
			  System.out.println(roge.especificacionesTecnicas());	
			  System.out.println(zen.especificacionesTecnicas());	
			  	
		  	
		  
		  
		  
	  }

}
