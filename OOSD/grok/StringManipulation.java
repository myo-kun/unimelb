public class StringManipulation {
    public static void main(String[] args) {
        // Constants
        final char DOLLAR = '$';
        final char NEW_LINE = '\n';

        String recipe = "12 $12.72 Beef\n" +
                "04 Carrots will cost $03.64\n" +
                "99 I think $00.05 for Herbs";

        int index, line = 0;
        double sum = 0;

        // Extract information from lines
        while (line < 3) {
            index = recipe.indexOf(DOLLAR);
            int quantity = Integer.parseInt(recipe.substring(0, 2));
            double price = Double.parseDouble(recipe.substring(index+1, index + 6));
            sum += quantity * price;
            line += 1;
            index = recipe.indexOf(NEW_LINE);
            recipe = recipe.substring(index + 1);
        }

        System.out.println(sum);
    }
}
