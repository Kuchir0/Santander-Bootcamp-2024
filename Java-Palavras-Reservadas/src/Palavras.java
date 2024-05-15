import java.awt.Desktop;
import java.net.URI;

/* Palavras reservadas
Palavras reservadas, são identificadores de uma linguagem que já possuem uma finalidade específica, portanto, 
não podem ser utilizados para nomear variáveis, classes, métodos ou atributos.
A linguagem Java possui 52 palavras reservadas. */

public class Palavras {
    public static void main(String[] args) {
        try {
            // URL da página das palavras reservadas
            URI uri = new URI("https://glysns.gitbook.io/java-basico/sintaxe/palavras-reservadas");

            // Abre o navegador padrão com a página
            Desktop.getDesktop().browse(uri);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}




