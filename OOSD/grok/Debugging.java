public class Debugging {

    public static void main(String[] args) {

        // Some constants for good programmers
        final String WORD_SEPARATOR = "|";
        final String NAME_SEPARATOR = "_";
        final String SEPARATOR_REPLACEMENT = " ";

        int index = -1;

        String data = "Leonardo Da_Vinci 100000 False";

        // Extract first name
        index = data.indexOf(SEPARATOR_REPLACEMENT);
        String firstName = data.substring(0, index).replace(NAME_SEPARATOR, SEPARATOR_REPLACEMENT);

        data = data.substring(index + 1);

        // Extract last name
        index = data.indexOf(SEPARATOR_REPLACEMENT);
        String lastName = data.substring(0, index).replace(NAME_SEPARATOR, SEPARATOR_REPLACEMENT);
        data = data.substring(index + 1);

        // Extract student number
        index = data.indexOf(SEPARATOR_REPLACEMENT);
        int studentNumber = Integer.parseInt(data.substring(0, index));
        data = data.substring(index + 1);

        // Extract degree type
        boolean isPostgrad = Boolean.parseBoolean(data);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(studentNumber);
        System.out.println(isPostgrad);
    }
}