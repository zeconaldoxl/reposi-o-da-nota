import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListOpções{

    public static void main(String[] args) {
        
        
        List<String> Opções = new ArrayList<>();

        Opções.add("Malbec");
        Opções.add("Avon");
        Opções.add("Essencial");
        Opções.add("Eudora");
        Collections.sort(Opções);

        System.out.println("Esses são os melhores da lista" + Opções);
        System.out.println("lista final");
        System.out.println(Opções.get(3));
        System.out.println(Opções.remove(1));
        System.out.println("Essa lista tem esses componetes:" + Opções.size());
        System.out.println("Ficou dessa maneira" + Opções);

    }
}