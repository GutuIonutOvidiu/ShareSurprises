package surprises;

import bag.ISurprise;

import java.util.Random;

public class Candies implements ISurprise {

    private int numberOfCandies;
    private CandiesType candieType;


    Candies(int numberOfCandies,CandiesType candieType ){
        this.numberOfCandies = numberOfCandies;
        this.candieType = candieType;
    }

    public static Candies generate() {
        Random random = new Random();
        int numberOfCandies = random.nextInt();
        numberOfCandies = Math.abs(numberOfCandies);
        numberOfCandies = numberOfCandies % 100 + 1;

        int numberForList = random.nextInt();
        numberForList = Math.abs(numberForList);
        numberForList = numberForList % CandiesType.values().length;

        Candies candies = new Candies(numberOfCandies,CandiesType.values()[numberForList]);

        return candies;
    }

    public String toString(){
        return "Ai primit " + this.numberOfCandies + " bomboane de tipul " + this.candieType;
    }

    @Override
    public void enjoy() {
        System.out.println("Ai primit " + this.numberOfCandies + " bomboane de tipul " + this.candieType);
    }
}
