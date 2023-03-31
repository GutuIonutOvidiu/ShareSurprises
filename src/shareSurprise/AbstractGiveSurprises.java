package shareSurprise;

import bag.BagFactory;
import bag.IBag;
import bag.IBagFactory;
import bag.ISurprise;

import java.util.concurrent.TimeUnit;

public abstract class AbstractGiveSurprises {
    private IBag tolba;
    private int waitTime;

    AbstractGiveSurprises(String typeOfBag, int waitTime) {
        IBagFactory factory = new BagFactory();
        this.tolba = factory.makeBag(typeOfBag);
        this.waitTime = waitTime;
    }

    public void put(ISurprise newSurprise) {
        tolba.put(newSurprise);
    }

    public void put(IBag surprises) {
        tolba.put(surprises);
    }

    public void give() {
        tolba.takeOut().enjoy();
        giveWithPassion();
    }
    public void giveAll(){
        while(!tolba.isEmpty()){
            try {
                TimeUnit.SECONDS.sleep(this.waitTime);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            tolba.takeOut().enjoy();
            giveWithPassion();
        }
    }

    @Override
    public String toString(){
        return this.tolba.toString() ;
    }
    public boolean isEmpty(){
        return tolba.isEmpty();
    }

    protected abstract void giveWithPassion();



}
