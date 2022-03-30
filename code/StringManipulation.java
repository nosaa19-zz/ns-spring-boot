package sa.id.simple.domain;

public class StringManipulation {

    public void CombineAndReverse(int num, String text) {
        int digit, temp;
        int div = getDivider(num);

        StringBuilder result = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        sb.append(text);

        while (div > 1){
            temp = num / div;
            digit = temp % 10;
            result.append(text).append(digit).append(" ");
            div /= 10;
            text = sb.reverse().toString();
        }
        digit = num % 10;
        result.append(text).append(digit).append(" ");
        System.out.println(result.toString());
    }

    private int getDivider(int num){
        int power = (int) (Math.log10(num));
        int divider = (int) Math.pow(10,power);
        return divider;
    }
}
