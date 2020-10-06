package aplicacoes;

public class PrimoFatorial {

	public static void main(String[] args) {
		
		for(int i=0;i<=20;i++) {
			int numero = (int)(Math.random() * 200);
			if(primo(numero) && numero!= 0) {
				System.out.println("Primo: " + numero + "\nFatorial: ");
				System.out.println(fatorial(numero));
			}
		}
	}
		public static boolean primo(int dividendo) {
			boolean primo = primo(dividendo, 2, 1);
			return primo;
		}
		
		private static boolean primo(int dividendo, int divisor, double resultado) {
			if(resultado == 0) {
				return false;
			} else if(divisor >= dividendo) {
				return true;
			}
			return primo(dividendo, (divisor+1), (dividendo % divisor));
		}
		
		static int fatorial(int n) {
			if (n == 1) {
				return 1;
			} else {
				return n * fatorial(n - 1);
			}
		}
	}

