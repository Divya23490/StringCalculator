// StringCalculator.java

public class StringCalculator {
    public int add(String numbers) {
        if (numbers == null || numbers.isEmpty()) {
            return 0;
        }

        String[] numberArray = numbers.split("[,\n]");
        int sum = 0;

        for (String num : numberArray) {
            sum += Integer.parseInt(num);
        }

        return sum;
    }
}
