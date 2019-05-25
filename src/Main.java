public class Main {

    public static void main(String[] args) {
        int limit = 8; // Number of threads
        for (int i = 0; i < limit; i++) {
            MultiThread object = new MultiThread();
            object.start();
        }
    }
}
