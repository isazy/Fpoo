package avaliacaoForm;

public class PrincipalUsu {

	public static void main(String[] args) {
		
	Usuario alguem = new Usuario(1,"isabely",12345,"negado", "adm");
	
	System.out.println(alguem.getId());
	System.out.println(alguem.getNome());
	System.out.println(alguem.getPassword());
	System.out.println(alguem.getPermissao());
	System.out.println(alguem.getUsuario());



	}

}
