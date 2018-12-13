package labirinto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * 
 */
 
public class LerMatriz {
    public static void main(String[] args) {
 
        String nomeArquivo = null;
        String nomeArquivoCompleto = "C:\\Users\\leore\\Documents\\NetBeansProjects\\Trabalho de Ia\\src\\trabalho\\de\\ia\\matriz.txt";
        nomeArquivo = nomeArquivoCompleto;
 
        FileInputStream fin = null;
        BufferedReader in = null;
        String linha = null;
        int qtddLinhas = 0;
      
        
        String[] linhas = new String[qtddLinhas];
 
        try {
 
            fin = new FileInputStream(nomeArquivo);
            in = new BufferedReader(new InputStreamReader(fin));
 
            // IOException
            while (in.ready()) {
                // IOException
                linha = in.readLine();
 
                if (linha == null) {
                    break;
                }
 
                linha = linha.trim();
 
                if (linha.length() != 0) {
                    System.out.println(linha);
 
                    qtddLinhas++;
 
                }
            }

            // IOException
            fin.close();
 
            // IOException
            in.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("Erro durante a leitura do arquivo");
            System.exit(1);
        }
    }
}

