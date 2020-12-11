package br.edu.infnet.appLanche.model.leitura;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import br.edu.infnet.appLanche.model.exception.AdicionalCaldaInvalidaException;
import br.edu.infnet.appLanche.model.exception.MedidaNegativaException;
import br.edu.infnet.appLanche.model.exception.PorcaoInvalidaException;
import br.edu.infnet.appLanche.model.negocio.Bebida;
import br.edu.infnet.appLanche.model.negocio.Comida;
import br.edu.infnet.appLanche.model.negocio.Sobremesa;

public class Arquivo {

	public static void main(String[] args) {
		String dir = "C:/dev/workspace20E4/";
		
		String arquivo = "pedidos.txt";
		
		try {
			FileReader leitura = new FileReader(dir+arquivo);			
			BufferedReader in = new BufferedReader(leitura);
			
			FileWriter escrita = new FileWriter(dir+"out_"+arquivo);
			BufferedWriter out = new BufferedWriter(escrita);
			
			String linha = in.readLine();
			
			while(linha != null) {
				String[] campos = linha.split(";");
				
				if(campos.length != 5) {
					switch (campos[0].toUpperCase()) {
					case "B":
						Bebida bebida = new Bebida(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						bebida.setMedida(Float.valueOf(campos[4]));
						bebida.setMarca(campos[5]);
						
						out.write(bebida.obterValorProduto());
						break;

					case "C":
						Comida comida = new Comida(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						comida.setDoce(Boolean.valueOf(campos[4]));
						comida.setPorcao(Integer.valueOf(campos[5]));

						out.write(comida.obterValorProduto());
						break;

					case "S":
						Sobremesa sobremesa = new Sobremesa(campos[1], Float.valueOf(campos[2]), Boolean.valueOf(campos[3]));
						sobremesa.setFrio(Boolean.valueOf(campos[4]));
						sobremesa.setAdicionalCalda(Float.valueOf(campos[5]));

						out.write(sobremesa.obterValorProduto());
						break;
						
					default:
						break;
					}
				}
				
				linha = in.readLine();
			}

			in.close();
			leitura.close();
			out.close();
			escrita.close();
			System.out.println(args.length == 1 ? args[0] : "Pronto!!!");
			
		} catch (IOException | MedidaNegativaException | PorcaoInvalidaException | AdicionalCaldaInvalidaException e) {
			System.out.println(e.getMessage());
		}		
	}
}