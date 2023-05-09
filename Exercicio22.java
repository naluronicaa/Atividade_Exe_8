import javax.swing.*;

public class Exercicio22{

    private static ListaSE_Modelo lista;
    private static ListaSE_Modelo.NodeSE listaa;
    public static void main(String[] args) {
        lista = new ListaSE_Modelo();
        listaa = lista.new NodeSE();

        int opicao = 0;

        do {
            opicao = Integer.parseInt(JOptionPane.showInputDialog(null, "Bem vindo(a)!\nEscolha a operação que deseja realizar \n1. Inserir nó em uma lista \n2. Remover nó da Lista \n3. Sair."));

            switch(opicao){
                case 1:
                    //sempre o adicionar pela cauda
                    int i = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número inteiro para ser adicionado a lista singularmente encadeada!"));
                    listaa.putTail(i);
                    JOptionPane.showMessageDialog(null, "O número: " +i+ ", foi adicionado à fila!");
                    break;
                case 2:
                    //tirar pela cauda
                    int iP = listaa.viewTail();
                    JOptionPane.showMessageDialog(null, "O número: "+iP+", foi retirado da fila!");
                    listaa.takeTail();
                    break;
                case 3:
                    opicao = 3;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opição Inválida");
                    break;
            }
        } while (opicao != 4);
    }
}