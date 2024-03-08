import java.util.Scanner;
public class Questao02 {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// 2 questao
		System.out.println("Informe um número inteiro para saber se está na sequência de fibonacci: ");
		int num = sc.nextInt();
		System.out.println("Se seu número estiver receberá true como resposta, se não, receberá false: ");
		String resposta = isFibonacci(num);
		System.out.println(resposta);

	}
	private static String isFibonacci(int num) {
		int a = 0;
		int b = 1;
		int fib = b;
		
		while (fib < num) {
			fib = a + b;
			a = b;
			b = fib;
		}
		
		if (num == fib) {
			return "Sim, esse número pertence a sequência!";
		} else {
			return "Esse número não pertence a sequência :(";
		}
		
	}

}
