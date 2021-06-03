package program;

import java.io.IOException;

import util.Leitor;

public class Main {
	
	public static void main(String[] args) {
		String caminho = "C:\\Users\\maycon\\Documents";
		String name = "generic_food.csv";
		
		Leitor leitor = new Leitor();
		
		try {
			leitor.readFile(caminho, name);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
