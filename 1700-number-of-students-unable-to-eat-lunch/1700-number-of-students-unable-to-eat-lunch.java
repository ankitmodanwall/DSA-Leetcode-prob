class Solution {
    public int countStudents(int[] students, int[] sandwiches) {

        // count students
        int ones = 0, zeros = 0;
        for (int std : students) {
            if (std == 0) {
                zeros++;
            } else {
                ones++;
            }
        }

        // count sandwich
        for (int sandwich : sandwiches) {
            if (sandwich == 0) {
                if (zeros == 0)
                    return ones;
                zeros--;
            } else {

                if (ones == 0)
                    return zeros;

                ones--;

            }
        }
        return 0;
    }
}
