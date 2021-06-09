public class Main {

    public static void main(String[] args) {

        int GLOBAL = 0;
        System.out.println(GLOBAL);

        public static void second() {

            int LOCAL = 5;
            System.out.println(LOCAL);

            GLOBAL = 10;
            System.out.println(GLOBAL);

        }

        System.out.print(LOCAL);

    }
}
