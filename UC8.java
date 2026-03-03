import java.util.HashMap;

public class UC8 {

    public static void main(String[] args) {

        // HashMap to store character -> pattern mapping
        HashMap<Character, String[]> patterns = new HashMap<>();

        // Store O pattern
        patterns.put('O', new String[]{
            "  ** ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            " *  * ",
            "  **  "
        });

        // Store P pattern
        patterns.put('P', new String[]{
            "  ** ",
            " *  * ",
            " *  * ",
            " ***  ",
            " *    ",
            " *    ",
            " *    ",
            " *    ",
            " *    "
        });

        // Store S pattern
        patterns.put('S', new String[]{
            " *** ",
            " *  * ",
            " *  * ",
            " ***  ",
            "  ***",
            "     * ",
            "     * ",
            " *   * ",
            "  *** "
        });

        // Define the word to display
        char[] word = {'O', 'O', 'P', 'S'};

        System.out.println("--- OOPS Banner ---\n");

        // Loop through each row (9 rows)
        for (int row = 0; row < 9; row++) {

            // Build each line using StringBuilder
            StringBuilder line = new StringBuilder();

            // Loop through each character in word
            for (char c : word) {
                // Look up pattern from HashMap using character as key
                String[] pattern = patterns.get(c);
                line.append(pattern[row]);
            }

            System.out.println(line.toString());
        }
    }
}
