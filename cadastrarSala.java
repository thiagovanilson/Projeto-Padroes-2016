import java.io.File;
import java.util.Scanner;
import Salas.SalaNormal;

public class cadastrarSala {
	
	final byte SALA_NORMAL = 0, SALA_VIDEOCONFERENCIA = 1, SALA_INTELIGENTE = 2;
	
	cadastrarSala(int tipo){
		
		System.out.print("Digite o Id da sala: ");
		String id = new Scanner(System.in).next();
		
		System.out.print("Digite a discrição da sala: ");
		String desc = new Scanner(System.in).nextLine();
		
		System.out.print("Digite a largura da sala: ");
		float larg = new Scanner(System.in).nextFloat();
		
		System.out.print("Digite comprimento da sala: ");
		float comp = new Scanner(System.in).nextFloat();
		
		System.out.print("Digite capacidade maxima: ");
		int capa = new Scanner(System.in).nextInt();
		
		
		if(tipo == SALA_NORMAL)
			if(validarDados(id, desc))
				if(!existe(id)){
					new GravarXML(new SalaNormal(id, desc, larg, comp, capa));
					return;
				}
		
	}
	private boolean validarDados(String id, String desc){
		if(id != null && id.length() >= 2)
			if (desc != null && desc.length() > 5)
				if (!existe(id))
					return true;
		return false;
	}

	private boolean existe(String nome){
		File arq = new File(nome + ".xml");
		
		if(arq.exists())
			return true;
		return false;
	}
}
