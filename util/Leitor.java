package util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitor {

	public Leitor() {
	}

	public void readFile(String path, String name) throws IOException {
		File arq = new File(path, name);

		if (arq.exists() && arq.isFile()) {
			FileInputStream stream = new FileInputStream(arq);
			InputStreamReader leitor = new InputStreamReader(stream);
			BufferedReader buffer = new BufferedReader(leitor);
			String linha = buffer.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				
				if(campos[2].equals("Fruits")) {
					
					System.out.println(String.format("%-15.15s", campos[0]) + "\t " + String.format("%-15.15s", campos[1]) + "\t " + campos[3]);
				}
				
				linha = buffer.readLine();
			}
			buffer.close();
			leitor.close();
			stream.close();
		} else {
			throw new IOException("Arquivo Invalido");
		}
	}

}
