import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Produto pruduto;

        boolean encerrar = false;
        String nome = "";
        double valor = 0;
        double total = 0;

        do {
            nome = JOptionPane.showInputDialog("Digite o nome do produto:");


            valor = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do produto [Apenas números]: "));

           pruduto = new Produto(nome, valor);

            System.out.println(pruduto);

            total = total + pruduto.getValor();

            System.out.println("Deseja mais alguma coisa?" +
                                    "[1] = SIM" +
                                    "[0] = NÃO");
            int opcao = Integer.parseInt (JOptionPane.showInputDialog("\"Deseja mais alguma coisa?\" +\n" +
                                                                        "[1] = SIM" +
                                                                        "[0] = NÃO"));
            encerrar = opcao == 1 ? false : true;

        }while (encerrar == false);

        System.out.printf("TOTAL DA COMPRA: R$ %,.2n" , total);

    }
}