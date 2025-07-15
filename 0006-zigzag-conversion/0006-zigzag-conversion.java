import java.util.ArrayList;
import java.util.List;

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            rows.add(new StringBuilder());
        }

        int currentRow = 0;
        boolean goingDown = true;

        for (char c : s.toCharArray()) {
            rows.get(currentRow).append(c);

            if (goingDown) {
                currentRow++;
            } else {
                currentRow--;
            }

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }
}