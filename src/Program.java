
public class Program {

	public static void main(String[] args) {
		
		String texto = "Texto com letras MAIUSCULAS e minusculas    ";
		
		//Formatar:
		String txt1 = texto.toLowerCase(); //Converter para minusculas.
		String txt2 = texto.toUpperCase(); //Converter para Maiusculas.
		String txt3 = texto.trim(); //Remover espaço no inicio e no final do string.
		
		//Recortar:
		String txt4 = texto.substring(17); //Gerar nova string a partir da posição 16 do texto.
		String txt5 = texto.substring(17, 27); //Gerar nova string a partir da posição 16 até à posição 26 do texto.
		
		//Substituir:
		String txt6 = texto.replace(" ", "."); // Substituir espaços por pontos;
		String txt7 = texto.replace("Texto", "String"); // Substituir Texto por String;
		
		//Localizar:
		int loc1 = texto.indexOf("M"); //Localiza a primeira posição encontrada.
		int loc2 = texto.lastIndexOf("a"); //Localiza a ultima posição encontrada.
		
		//Recortar / Separar:
		String[] sep = texto.split(" "); //Retorna um array para cada palavra que está separada por espaços.
		
		System.out.println("Texto Original: (" + texto + ")\n");
		System.out.println("toLowerCase(): (" + txt1 + ")");
		System.out.println("toUpperCase(): (" + txt2 + ")");
		System.out.println("trim(): (" + txt3 + ")");
		System.out.println("subString(17): (" + txt4 + ")");
		System.out.println("subString(17, 27): (" + txt5 + ")");
		System.out.println("replace(' ', '.'): (" + txt6 + ")");
		System.out.println("replace('Texto', 'String'): (" + txt7 + ")");
		System.out.println("IndexOf('M'): (Está na posição: " + loc1 + ")");
		System.out.println("LastIndexOf('a'): (Está na posição: " + loc2 + ")\n");
		System.out.println("split(' '): (Primeira palavra: " + sep[0] + ")");
		System.out.println("split(' '): (Segunda palavra: " + sep[1] + ")");
		System.out.println("split(' '): (Terceira palavra: " + sep[2] + ")");
		System.out.println("split(' '): (Quarta palavra: " + sep[3] + ")");
		System.out.println("split(' '): (Quinta palavra: " + sep[4] + ")");
		System.out.println("split(' '): (Sexta palavra: " + sep[5] + ")");
	}

}
