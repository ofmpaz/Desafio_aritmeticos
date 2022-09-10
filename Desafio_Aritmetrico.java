package fundamentos;

public class Desafio_Aritmetrico {

	public static void main(String[] args) {
		
		double numerador_A = Math.pow(6 *(3 + 2), 2); 
		double denominador_A = (3 * 2); 
		double divisao_A = (numerador_A / denominador_A); 
		
		System.out.println("O primeiro termo é: " + divisao_A);
		
		double numerador_B = ((1 - 5) * (2 - 7)); 
		double divisao_B = (numerador_B / 2); 
		double potencia_B = Math.pow(divisao_B, 2); 
		
		System.out.println("O segundo termo é: " + potencia_B);
		
		double subtracao = divisao_A - potencia_B; 
		double potencia_Total = Math.pow(subtracao, 3); 
		
		
		double denominador_C = Math.pow(10, 3); 
		double resultado = (potencia_Total / denominador_C); 
		
		System.out.println("O resultado é: " + resultado);
	
		
		
	
	
	
	}
	

}
