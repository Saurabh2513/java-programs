package inheritance;

public interface NewInterface {
    abstract void AiRevolution();

    //java 8 onwards
    default void AiRevolution1() {
        System.out.println("java 8 pasun ");
    }

    static void AiRevolution2() {
        System.out.println("java 8 pasun ");
    }
}
