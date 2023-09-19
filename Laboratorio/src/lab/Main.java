package lab;

public class Main {

	public static void main(String[] args) {
		Aluno arthur = new Aluno(540017,"Arthur",2);
		CachorroQuente cq = new CachorroQuente("frango","parmesão","maionese e batata palha","Suco do Chaves");
		Print p = new Print();
		System.out.println(p.print(arthur,cq));
		
		
		
		
	}

}
