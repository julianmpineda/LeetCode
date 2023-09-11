class Solution {
    public int numberOfBeams(String[] bank) {
        int laserSum = 0, lastRow = 0;
        Boolean firstRow = true;
        List<Integer> laserRows = new ArrayList<Integer>();

        for (int i = 0; i < bank.length; i++) {
            int sum = 0;
            int trimmed = 0;

            for (int j = 0; j < bank[i].length(); j++) {
                if (bank[i].charAt(j) == '1') {
                    trimmed++;
                }
            }

            if (trimmed != 0 && firstRow) {
                lastRow = trimmed;
                firstRow = false;
            } else if (trimmed != 0) {
                laserSum += (trimmed * lastRow);
                lastRow = trimmed;
            }
        }

        return laserSum; 
    }
}
