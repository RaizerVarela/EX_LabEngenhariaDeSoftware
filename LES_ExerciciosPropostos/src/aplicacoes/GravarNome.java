package aplicacoes;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

public class GravarNome {

	public static void main(String[] args) {
		
		String path, nome[];
		int quant;
		
		path = "C:\\Users\\Raize\\Desktop\\FATEC\\Engenharia de Software III\\Nomes.txt";
		
		quant = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de nomes a serem cadastrados:"));
		nome = new String[quant];
		
		for(int i=0; i<nome.length; i++) {
			nome[i] = JOptionPane.showInputDialog("Digite o(s) nome(s):");
		}
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
			for(String n : nome) {
				bw.write(n);
				bw.newLine();
			}
		} catch(IOException e) {
			JOptionPane.showMessageDialog(null, "Error: " +  e.getMessage());
		}
		
		
	}
}
