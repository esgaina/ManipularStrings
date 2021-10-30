
public class Program {

	public static void main(String[] args) {
		
		String texto = "Texto com letras MAIUSCULAS e minusculas    ";
		
		//Formatar:
		String txt1 = texto.toLowerCase(); //Converter para minusculas.
		String txt2 = texto.toUpperCase(); //Converter para Maiusculas.
		String txt3 = texto.trim(); //Remover espa�o no inicio e no final do string.
		
		//Recortar:
		String txt4 = texto.substring(17); //Gerar nova string a partir da posi��o 16 do texto.
		String txt5 = texto.substring(17, 27); //Gerar nova string a partir da posi��o 16 at� � posi��o 26 do texto.
		
		//Substituir:
		String txt6 = texto.replace(" ", "."); // Substituir espa�os por pontos;
		String txt7 = texto.replace("Texto", "String"); // Substituir Texto por String;
		
		//Localizar:
		int loc1 = texto.indexOf("M"); //Localiza a primeira posi��o encontrada.
		int loc2 = texto.lastIndexOf("a"); //Localiza a ultima posi��o encontrada.
		
		//Recortar / Separar:
		String[] sep = texto.split(" "); //Retorna um array para cada palavra que est� separada por espa�os.
		
		System.out.println("Texto Original: (" + texto + ")\n");
		System.out.println("toLowerCase(): (" + txt1 + ")");
		System.out.println("toUpperCase(): (" + txt2 + ")");
		System.out.println("trim(): (" + txt3 + ")");
		System.out.println("subString(17): (" + txt4 + ")");
		System.out.println("subString(17, 27): (" + txt5 + ")");
		System.out.println("replace(' ', '.'): (" + txt6 + ")");
		System.out.println("replace('Texto', 'String'): (" + txt7 + ")");
		System.out.println("IndexOf('M'): (Est� na posi��o: " + loc1 + ")");
		System.out.println("LastIndexOf('a'): (Est� na posi��o: " + loc2 + ")\n");
		System.out.println("split(' '): (Primeira palavra: " + sep[0] + ")");
		System.out.println("split(' '): (Segunda palavra: " + sep[1] + ")");
		System.out.println("split(' '): (Terceira palavra: " + sep[2] + ")");
		System.out.println("split(' '): (Quarta palavra: " + sep[3] + ")");
		System.out.println("split(' '): (Quinta palavra: " + sep[4] + ")");
		System.out.println("split(' '): (Sexta palavra: " + sep[5] + ")");
	}

}
