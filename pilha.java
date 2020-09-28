import java.util.Scanner;

public class pilha {
	
	public static int pilha[][];

	public static void main(String[] args) {
		
		Scanner metodo = new Scanner(System.in);
		System.out.println("Escolha o metodo, enfileirar[0] ou desenfilerar[1]:");
		int z = metodo.nextInt();
		if(z == 0) {
			enfileirar();
		}
		else if(z == 1) {
			desenfileirar();
		}
		else {
			System.out.println("Erro, valor diferente de 0 e 1");
		}
		   metodo.close();

	}

	public static void enfileirar (){

		Scanner x = new Scanner(System.in);

		int i;

		i = x.nextInt();
		
		if(pilha.length == 0) {
			pilha[0][0] = i;
		}
		else {
		for(int j = (pilha.length) ; j < 1 || pilha[0][0] != '\0'; --j){

		pilha[0][j] = pilha[0][j-1];

		}

		pilha[0][0] = i;

		}
		
		x.close();
	}
	
	public static void desenfileirar(){

		for(int j = 0; j < (pilha.length); ++j){

		pilha[0][j] = pilha[0][j+1];

		}

		}
	
}
