import java.util.Queue;
import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {
        System.out.println("Fila de Cadeiras");
        Queue<String> Cadeiras = new LinkedList<>();
        Cadeiras.add("Assento um");
        Cadeiras.add("Assento dois");
        Cadeiras.add("Assento três");

        System.out.println("Seu assento é esse:" + Cadeiras);
        System.out.println("Sua cadeira é está:" + Cadeiras.peek());
        System.out.println("Sua opção é essa:" + Cadeiras.poll()) ;
       

    }
}