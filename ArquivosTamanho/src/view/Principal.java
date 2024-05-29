package view;

import controller.TamanhoController;

public class Principal {
	public static void main(String[] args) {
        String diretorio = "C:\\TEMP";
        TamanhoController controller = new TamanhoController();
        controller.tamanho(diretorio);
        
	}
}
