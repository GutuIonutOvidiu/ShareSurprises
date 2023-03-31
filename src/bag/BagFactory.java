package bag;

public class BagFactory implements IBagFactory {
    @Override
    public IBag makeBag(String type) {

        switch (type) {
            case "RANDOM":
                return new RANDOM();
            case "FIFO":
                return new FIFO();
            case "LIFO":
                return new LIFO();
            default:
                System.out.println("Invalid operation");
                return null;
        }
    }
}