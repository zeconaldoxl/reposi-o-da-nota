import java.util.Stack;
import java.util.LinkedList;
public class pilha {

    public static void main(String[] args) {
        System.out.println("Pilhas de Livros");
        Stack<String> Livros = new Stack<>();
        Livros.push("De Português");
        Livros.push("De Matemática");
        Livros.push("De Sociologia");

        System.out.println("Se encontra na próxima pilha:" + Livros.peek());
        System.out.println("Na pilha do segundo andar:" + Livros.pop());
        System.out.println("Na pilha 10:" + Livros);

    }
}