import bag.BagFactory;
import bag.IBag;
import bag.IBagFactory;
import gatherSurprises.GatherSurprises;
import shareSurprise.GiveSurpriseAndApplause;
import shareSurprise.GiveSurpriseAndHug;
import shareSurprise.GiveSurpriseAndSing;

public class Main {
    public static void main(String[]args){

        IBagFactory factory = new BagFactory();

        IBag randomBag =  factory.makeBag("RANDOM");
        randomBag.put(GatherSurprises.gather());
        randomBag.put(GatherSurprises.gather());
        randomBag.put(GatherSurprises.gather());
        randomBag.put(GatherSurprises.gather());

        System.out.println("Lista Surpize:");
        System.out.println(randomBag.toString());

        randomBag.takeOut();
        System.out.println(randomBag.toString());

        System.out.println("Bagajul este gol? ->> " + randomBag.isEmpty());
        System.out.println("Bagajul contine " + randomBag.size() + " surprize");

        System.out.println("Lifo surprize");
        IBag bagLifo = factory.makeBag("LIFO");
        bagLifo.put(GatherSurprises.gather());
        System.out.println(bagLifo.toString());

        System.out.println();
        System.out.println("****** METODA FIFO ******");

        GiveSurpriseAndApplause surprizeFifo = new GiveSurpriseAndApplause("FIFO",3);
        surprizeFifo.put(GatherSurprises.gather());
        surprizeFifo.put(GatherSurprises.gather());
        surprizeFifo.put(GatherSurprises.gather());
        surprizeFifo.put(GatherSurprises.gather());
        System.out.println(surprizeFifo.toString());
        System.out.println();
        surprizeFifo.give();
        System.out.println();
        surprizeFifo.giveAll();

        System.out.println();
        System.out.println("****** METODA LIFO ******");

        GiveSurpriseAndHug surprizeLIFO = new GiveSurpriseAndHug("LIFO",3);
        surprizeLIFO.put(GatherSurprises.gather());
        surprizeLIFO.put(GatherSurprises.gather());
        surprizeLIFO.put(GatherSurprises.gather());
        surprizeLIFO.put(GatherSurprises.gather());
        System.out.println(surprizeLIFO.toString());
        System.out.println();
        surprizeLIFO.give();
        System.out.println();
        surprizeLIFO.giveAll();

        System.out.println();
        System.out.println("****** METODA RANDOM ******");

        GiveSurpriseAndSing surprizeRandom = new GiveSurpriseAndSing("RANDOM",3);
        surprizeRandom.put(GatherSurprises.gather());
        surprizeRandom.put(GatherSurprises.gather());
        surprizeRandom.put(GatherSurprises.gather());
        surprizeRandom.put(GatherSurprises.gather());
        System.out.println(surprizeRandom.toString());
        System.out.println();
        surprizeRandom.give();
        System.out.println();
        surprizeRandom.giveAll();

    }
}
