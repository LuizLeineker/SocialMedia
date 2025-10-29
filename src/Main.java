import Adapters.AdapterRedeSocial;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Insira a rede social - (X/Instagram): ");
        String rede = leitor.nextLine();

        // Interface responsavel para postar o conteudo independente da rede social
        AdapterRedeSocial adapter = RedeSocialFactory.criarAdapter(rede);

        if(adapter != null){
            System.out.print("Digite o conteúdo da publicação: ");
            String texto = leitor.nextLine();

            GerenciadorRedeSocial gerenciador = new GerenciadorRedeSocial(adapter);
            gerenciador.publicar(texto);
        }

        leitor.close();
    }
}
