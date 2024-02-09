class Solution {
    public int getLucky(String s, int k) {
        StringBuilder number = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            number.append(s.charAt(i) - 'a' + 1);
        }

        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < number.length(); j++) {
                sum += number.charAt(j) - '0';
            }
            number = new StringBuilder(String.valueOf(sum));
        }

        return Integer.parseInt(number.toString());
    }
}
