package aplicacoes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LerBytesArquivo {

	public static void main(String[] args) {
		
		String path = "C:\\TEMP\\dados.txt";
		
		try (BufferedReader bw = new BufferedReader(new FileReader(path))){
			String s = bw.readLine();
			while(s != null) {
				System.out.println(s.getBytes());
				s = bw.readLine();
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
