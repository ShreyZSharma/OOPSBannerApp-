public class UC7 {

    // Inner class to hold character and its pattern together
    static class CharacterPatternMap {
        char character;
        String[] pattern;

        // Constructor
        CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter for character
        char getCharacter() {
            return character;
        }

        // Getter for pattern
        String[] getPattern() {
            return pattern;
        }
    }

    public static void main(String[] args) {

        // Create objects for each letter using the class
        CharacterPatternMap O = new CharacterPatternMap('O', new String[]{
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

        CharacterPatternMap P = new CharacterPatternMap('P', new String[]{
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

        CharacterPatternMap S = new CharacterPatternMap('S', new String[]{
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

        // Store all characters in order O, O, P, S
        CharacterPatternMap[] word = {O, O, P, S};

        System.out.println("--- OOPS Banner ---\n");

        // Loop through each row (9 rows)
        for (int row = 0; row < 9; row++) {

            // Build each line using StringBuilder
            StringBuilder line = new StringBuilder();

            // Loop through each character in the word
            for (CharacterPatternMap c : word) {
                line.append(c.getPattern()[row]);
            }

            System.out.println(line.toString());
        }
    }
}
```

---

## Key Concept Learned

| | UC6 | UC7 |
|--|-----|-----|
| Structure | Separate methods per letter | One class holds letter + pattern |
| Adding new letter | Write a new method | Create one new object |
| Reusing a letter | Call method again | Just add to `word[]` array |
| DRY principle | Partial | Full |
| OOP concept | None | Class, Constructor, Getter, Object |

---

## How the double loop works
```
row 0 → O[0] + O[0] + P[0] + S[0]  → line 1 of banner
row 1 → O[1] + O[1] + P[1] + S[1]  → line 2 of banner
...
row 8 → O[8] + O[8] + P[8] + S[8]  → line 9 of banner
