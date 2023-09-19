package lab;

public class Print {
	public String print(Aluno arthur, CachorroQuente cq) {
		String resposta="";
	   	 
	   	 resposta+="Nome: "+ arthur.nome + " \n";
	   	 resposta+="Matricula: " + arthur.matricula+ " \n";
	   	 resposta+="Quantos: " +  arthur.qtd+ " \n";
	   	 resposta+="Proteina: " + cq.proteina + " \n";
	   	 resposta+="Queijo: " + cq.queijo + " \n";
	   	 resposta+="Adicional: " + cq.adicional + " \n";
	   	 resposta+="Bebida: " + cq.bebida + " \n";
	   	 
	   	
	   	 
	   	 return resposta;
	}

}
