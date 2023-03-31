package gatherSurprises;

import bag.ISurprise;
import surprises.Candies;
import surprises.FortuneCookie;
import surprises.MinionToy;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public final class GatherSurprises {
    static Random random = new Random();

    private GatherSurprises() {
    }

    private static ISurprise getNextSurprise() {
        int number = random.nextInt(3);
        switch (number) {
            case 0:
                return Candies.generate();
            case 1:
                return FortuneCookie.generate();
            default:
                return MinionToy.generate();
        }
    }

    public static List<ISurprise> gather(int n) {
        List<ISurprise> surprise = new ArrayList<ISurprise>(n);
        for (int i = 0; i < n; i++) {
            surprise.add(gather());
        }
        return surprise;
    }

    public static ISurprise gather() {

        return getNextSurprise();
    }
}