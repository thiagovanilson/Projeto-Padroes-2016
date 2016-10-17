import java.util.Scanner;

public class Principal {
	final byte SALA_NORMAL = 0, SALA_VIDEOCONFERENCIA = 1, SALA_INTELIGENTE = 2;

	public static void main(String[] args) {
		new Principal();
	}
	
	//Menu Principal no contrutor
	Principal(){
		
		while(true){
						
			System.out.println("Escolha uma opcao: \n\n");
			System.out.println("1 - Cadastrar.\n2 - Editar.\n3 - Reservar.\n4 - Remover.\n\n9 - Zerar sistema.\n0 - Sair.");
			
			int op = new Scanner(System.in).nextInt();
			
			if      (op == 1)
				cadastrar();
			else if (op == 2)
				editar();
			else if (op == 3)
				reservar();
			else if (op == 4)
				remover();
			else if (op == 0)
				System.exit(0);	
			else if (op == 9)
				zerarSistema();
			else
				System.out.println("Opção invalida!");
		}
	}//Fim do menu principal
	
	private void zerarSistema() {
		// TODO Auto-generated method stub
		
	}

	//Inicio dos submenus
	private void cadastrar(){
		while(true){
			System.out.println("O que voce deseja cadastrar?\n\n ");
			System.out.println("1 - Sala normal.\n2 - Sala de videoconferencia.\n3 - Sala inteligente." );
			System.out.println("4 - Laboratorio.\n5 - Escritorio\n6 - Evento.\n7 - Buscar.\n0 - Voltar ao menu principal.");
			
			int op = new Scanner(System.in).nextInt();
			
			if(op == 1)
				new cadastrarSala(SALA_NORMAL);
			else if(op == 2)
				new cadastrarSala(SALA_VIDEOCONFERENCIA);
			else if(op == 3)
				new cadastrarSala(SALA_INTELIGENTE);
			else if(op == 4)
				new cadastrarLaboratorio();
			else if (op == 5)
				new cadastrarEscritorio();
			else if (op == 0)
				return;	
			else
				System.out.println("Opcao invalida");
		}
	}
	private void editar(){
		
	}
	private void reservar(){
		
	}
	private void remover(){
		
	}
	private void buscar(){
		
	}
	//Fim dos submenus
}
