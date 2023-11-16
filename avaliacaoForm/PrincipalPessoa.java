package avaliacaoForm;

public class PrincipalPessoa {
	
	public static void main(String[] args) {
		
		Fisica algm = new Fisica ("isabely", "67890", "56789");
		
		System.out.println(algm.getNome());
		System.out.println(algm.getCpf());
		System.out.println(algm.getRg());
		
		

		}
}
