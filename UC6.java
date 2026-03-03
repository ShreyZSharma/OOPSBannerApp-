public class UC6 {

    // Method for letter O
    static String[] buildO() {
        return new String[]{
            "  ** ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            "  **  "
        };
    }

    // Method for letter P
    static String[] buildP() {
        return new String[]{
            "  ** ",
            " *  * ",
            " *  * ",
            " ***  ",
            " *    ",
            " *    ",
            " *    ",
            " *    ",
            " *    "
        };
    }

    // Method for letter S
    static String[] buildS() {
        return new String[]{
            " *** ",
            " *  * ",
            " *  * ",
            " ***  ",
            "  ***",
            "     * ",
            "     * ",
            " *   * ",
            "  *** "
        };
    }

    public static void main(String[] args) {

        // Get each letter from its method
        String[] O = buildO();
        String[] P = buildP();
        String[] S = buildS();

        // Build banner by combining methods during array declaration
        String[] banner = {
            String.join("", O[0], P[0], S[0], S[0]),
            String.join("", O[1], P[1], S[1], S[1]),
            String.join("", O[2], P[2], S[2], S[2]),
            String.join("", O[3], P[3], S[3], S[3]),
            String.join("", O[4], P[4], S[4], S[4]),
            String.join("", O[5], P[5], S[5], S[5]),
            String.join("", O[6], P[6], S[6], S[6]),
            String.join("", O[7], P[7], S[7], S[7]),
            String.join("", O[8], P[8], S[8], S[8])
        };

        System.out.println("--- OOPS Banner ---\n");

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
