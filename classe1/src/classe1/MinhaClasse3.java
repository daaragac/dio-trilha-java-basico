package classe1;

public class MinhaClasse3 {
	public static void main(String [] args) {
		String primeiroNome = "Daniel";
		String segundoNome = "Aragão";
		
		String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
		System.out.println(nomeCompleto);
		
	}
	//Criando um método
public static String nomeCompleto(String primeiroNome, String segundoNome) {
	return "Resultado do método: " + primeiroNome.concat(" ").concat(segundoNome);
}
}
