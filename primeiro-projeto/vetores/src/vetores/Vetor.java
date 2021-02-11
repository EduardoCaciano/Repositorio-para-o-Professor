package vetores;

public class Vetor {
	
	
private static double media(double vetor[]) {
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i];
		}
		return media / vetor.length;
	}
	
private static double soma(double vetor[]) {
	double soma = 0;
	
	for (int i = 0; i < vetor.length; i++) {
		soma += vetor[i];
	}
	return soma + vetor.length;
}



	public static void main(String[] args) {
		
		double notas[] = {8.5, 9.3, 7.2, 9.7};
		
		System.out.println("Média notas: " + media(notas));
		System.out.println("Soma notas: " + soma(notas));
		
		String[] nomes = {"Ana", "Pedro", "Fabiana", "Luiz"};
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print("Nome dos alunos: " + nomes[i] + ", " );
		}
		
		
		
		
		//************************************************
		
		
		double idades[] = {
				46, 17, 17, 16,
				17, 17, 17, 16,
				17, 22, 17, 19,
				16, 16, 17, 16,
				16};
		
		System.out.println("Média idades: " + media(idades));
		System.out.println("Soma idades: " + soma(idades));
	}
	
	

}
