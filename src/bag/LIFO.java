package bag;

import java.util.ArrayList;
import java.util.List;

public class LIFO implements IBag {
    private List<ISurprise> bag = new ArrayList<>();

    @Override
    public void put(ISurprise newSurprise) {
        bag.add(newSurprise);
    }

    @Override
    public ISurprise takeOut() {

        return bag.remove(bag.size()-1);
    }

    @Override
    public void put(IBag bagOfSurprises) {
        while(!bag.isEmpty()){
            this.bag.add(bagOfSurprises.takeOut());
        }
    }

    @Override
    public boolean isEmpty() {
        return (bag.isEmpty() ? true: false);
    }

    @Override
    public String toString(){
        String result = "";
        for(ISurprise surprise:bag){
            result =result + "\n" + surprise.toString();
        }
        return result;
    }

    @Override
    public int size() {
        return bag.size();
    }
}

