import java.util.HashMap;
import java.util.Map;

public class PrintWord {

    public static void main(String[] args) {

        String word = "OOPS";

        Map<Character, String[]> patternMap = buildPatternMap();

        renderBanner(word, patternMap);
    }

    // Function to build character pattern map
    public static Map<Character, String[]> buildPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        patternMap.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        patternMap.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return patternMap;
    }

    // Function to render the banner
    public static void renderBanner(String word, Map<Character, String[]> patternMap) {

        int rows = 7;

        for (int i = 0; i < rows; i++) {

            StringBuilder lineBuilder = new StringBuilder();

            for (char c : word.toCharArray()) {

                String[] pattern = patternMap.get(c);

                if (pattern != null) {
                    lineBuilder.append(pattern[i]).append("  ");
                }
            }

            System.out.println(lineBuilder.toString());
        }
    }
}