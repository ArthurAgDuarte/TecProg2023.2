
public class Questao17 {

	public static void main(String[] args) {
		int A= 10;
		int B= 10;
		int soma = A + B;
		
		if(A>10 || soma == 20)
			System.out.println("numero valido");
		else if(A==B)
			System.out.println("A eh igual B");
		else if(A!=10 && B != 10 && A<10)
			System.out.println("A eh menor que 10");
		else
			System.out.println("numero invalido");

	}

}
