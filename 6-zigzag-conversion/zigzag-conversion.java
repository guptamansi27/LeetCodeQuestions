class Solution {
    public String convert(String s, int numRows) {
        // Special case
        if (numRows == 1) return s;

        String[] rows = new String[numRows];
        
        // Initialize
        for (int i = 0; i < numRows; i++) {
            rows[i] = "";
        }

        int i = 0;          // current row
        boolean down = true;

        for (char ch : s.toCharArray()) {
            rows[i] += ch;

            // change direction
            if (i == 0) down = true;
            else if (i == numRows - 1) down = false;

            // move row
            if (down) i++;
            else i--;
        }

        // join all rows
        String ans = "";
        for (String row : rows) {
            ans += row;
        }

        return ans;
    }
}