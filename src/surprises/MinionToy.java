package surprises;

import bag.ISurprise;

import java.util.ArrayList;
import java.util.Arrays;

public class MinionToy implements ISurprise {

    private String nameOfToy;
    private static ArrayList<String> minionName = new ArrayList<String>(Arrays.asList("John", "Tim", "Alex", "Dave", "Johana", "Alice"));
    ;
    static int cont = 0;

    MinionToy(String nameOfToy) {
        this.nameOfToy = nameOfToy;
    }

    public static MinionToy generate() {
        String first = minionName.get(cont);
        MinionToy minion = new MinionToy(first);
        if (cont < minionName.size() - 1) {
            cont++;
            return minion;
        } else {
            cont = 0;
            return minion;
        }
    }

    @Override
    public void enjoy() {
        System.out.println("Ai primit o jucarie surprises.MinionToy cu numele " + this.nameOfToy);

    }
}
