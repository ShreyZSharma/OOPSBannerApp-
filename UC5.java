public class UC5 {
    public static void main(String[] args) {

        String[] banner = {
                String.join("", "  ** ",  "  ** ",  " *** ",  "  *** "),
                String.join("", " *  * ", " *  * ", " *  * ", " *   "),
                String.join("", " *  * ", " *  * ", " *  * ", " *   "),
                String.join("", " *  * ", " *  * ", " ***  ", " *  "),
                String.join("", " *  * ", " *  * ", " *    ", "  ***"),
                String.join("", " *  * ", " *  * ", " *    ", "     * "),
                String.join("", " *  * ", " *  * ", " *    ", "     * "),
                String.join("", " *  * ", " *  * ", " *    ", " *   * "),
                String.join("", "  **  ", "  **  ", " *    ", "  *** ")
        };

        System.out.println("--- OOPS Banner ---\n");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
