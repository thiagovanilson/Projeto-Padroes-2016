package Salas;

public interface SalaNormal extends Sala{
/*    ID da sala não pode ser nulo.
    ID é único( não é permitido adicionar mais de uma sala com o mesmo ID).
    Não é permitido adicionar uma sala cujo o tipo ou a finalidade seja nulo.
    Uma sala de aula pode ser normal, inteligente ou de videoconferência.
    Um laboratório pode ser de química, física, biologia e computação.
    Uma sala escritório só pode ser do tipo computação.
    Uma sala de conferência pode ser normal e de videoconferência.*/
	
//	private String ID;
//	private String descricao;
//	private float largura;
//	private float comprimento;
//	private boolean aberta;
//	private int capacidade;
//	
//	public SalaNormal(String Id, String desc, float larg, float comp, int capa){
//		ID = Id;
//		descricao = desc;
//		largura = larg;
//		comprimento = comp;
//		capacidade = capa;
//	}
	
//	SalaNormal(){
//		
//	}
	//Gets
//	public String getId(){
//		return ID;
//	}
//	public String getDescricao(){
//		return descricao;
//	}
//	public int getCapacidade(){
//		return capacidade;
//	}
//	public boolean estaAberta(){
//		return aberta;
//	}
//	
//	//Sets
//	public void setDescricao(String novaDesc){
//		descricao = novaDesc;
//	}
//	public void setLargura(float novaLarg){
//		if(novaLarg > 0)
//			largura = novaLarg;
//	}
//	public void setComprimento(float novoComp){
//		if(novoComp > 0)
//			comprimento = novoComp;
//	}
//	public void setCapa(int novaCapa){
//		if (novaCapa > 0)
//			capacidade = novaCapa;
//	}
//	
//	public String toString(){
//		return "ID: " + ID + "\nDescricao: " + descricao +"\nCapacidade: " + capacidade + "\nLargura: " + largura + "\nComprimento: " + comprimento;
//	}
}
