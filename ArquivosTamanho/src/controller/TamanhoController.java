package controller;

import java.io.File;
import java.util.Arrays;

public class TamanhoController {
	
	public void tamanho(String diretorio) {
		File file = new File(diretorio);
		File[] files = file.listFiles();
		Arrays.sort(files, (f1, f2) -> Long.compare(f1.length(), f2.length()));
		
		System.out.println("Arquivos ordenados por tamanho:");
		for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName() + " - " + (files[i].length()/1024)/1024 + " MB");
        }
		
       
	}
}
