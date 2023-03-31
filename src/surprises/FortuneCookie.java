package surprises;

import bag.ISurprise;

import java.util.Random;

public class FortuneCookie implements ISurprise {

    private static String message = "Felicitari ai primit o prajitura cu ravas ->> ";
    private String zicala;
    private final static String[] listaZicale = new String []{
            "When life shuts a door… Open it again. It’s a door. That’s how they work.",
            "Life has no remote. Get up and change it yourself.",
            "Purpose is an incredible alarm clock.",
            "I love the smell of fresh ambition in the morning.",
            "What you do today can improve all your tomorrows.",
            "Love all, trust a few, do wrong to none.",
            "Good food = Good mood",
            "Difficult roads often lead to beautiful destinations",
            "Look for something positive in each day, even if some days you have to look a little harder.",
            "Never give up on the things that make you smile.",
            "Count your age by friends, not years. Count your life by smiles, not tears.",
            "A day without laughter is a day wasted.",
            "Miracles happen to those who believe in them.",
            "If you do not think about the future, you cannot have one.",
            "Beauty is in the eye of the beholder.",
            "The best way to predict the future is to create it.",
            "Everything should be made as simple as possible, but not simpler.",
            "Honesty is the best policy – when there is money in it.",
            "Everything you can imagine is real.",
            "Keep smiling, because life is a beautiful thing and there’s so much to smile about."};

    FortuneCookie( String zicala){

        this.zicala = zicala;
    }

    public static FortuneCookie generate() {
        Random random = new Random();
        int numberOfCookieFromList = random.nextInt();
        numberOfCookieFromList = Math.abs(numberOfCookieFromList);
        numberOfCookieFromList = numberOfCookieFromList % listaZicale.length;
        FortuneCookie prajitura = new FortuneCookie(listaZicale[numberOfCookieFromList]);

        return prajitura;

    }

    public String toString(){
        return  message.toString() + this.zicala;
    }
    @Override
    public void enjoy() {
        System.out.println(FortuneCookie.message + this.zicala);
    }





}

