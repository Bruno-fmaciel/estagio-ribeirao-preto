import java.util.Scanner;
public class Questao05 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Informe uma frase para ser invertida: ");
		String frase = sc.nextLine();
		frase = frase.replaceAll(" ", ",");
		String saida = "";
		for(int i = frase.length() - 1; i >= 0; i--){
			saida += frase.charAt(i);
		}
		saida = saida.replaceAll(",", " ");
		System.out.println(saida);
	}

}
