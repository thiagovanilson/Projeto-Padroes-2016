import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.thoughtworks.xstream.XStream;

import Salas.Sala;

public class GravarXML {

	public GravarXML(Sala sala){
		gravar(sala);
	}

	private boolean gravar(Sala sala){
		if(!new File("./Dados/Salas/").exists())
			new File("./Dados/Salas/").mkdir();

		if (sala.getId() != null  || sala.getId().length() < 2){
			//			if(sl.tipo != null  || sl.tipo.length() < 2){
			//				if (finalidade != null && finalidade.length() > 0 ){
			XStream x = new XStream();

			File arq = new File("./Dados/Salas/"+sala.getId() + ".xml" );

			try {
				FileWriter fw = new FileWriter(arq);
				BufferedWriter bw = new BufferedWriter(fw);

				bw.write(x.toXML(sala ));
				bw.flush();
				bw.close();fw.close();

				System.out.println("Salvo com sucesso!");
			} catch (IOException e) {			
				System.out.println("Houve um erro na gravação!\n" + e.getMessage() + "\n\n");	
			}

		}else{
			System.out.println("Não foi possivel gravar!");
			return false;
		}
		return true;
	}
}

