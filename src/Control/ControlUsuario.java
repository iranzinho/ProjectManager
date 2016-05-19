package Control;

public class ControlUsuario {
	
	private AcessoBD camadaAcessoBD;
	
	public ControlUsuario(){
		camadaAcessoBD =new AcessoBD();
	}
	
	public salvarUsuario(Usuario usuario){
		camadaAcessoBD.salvarUsuario(usuario);
	}
	
}
