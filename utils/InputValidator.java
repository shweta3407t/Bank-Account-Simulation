package utils;

public class InputValidator {
    public static boolean isString(String name) {

        if (name == null || name.isEmpty()) {
            return false;
        } else if (name.matches("[a-zA-ZipEntry]+")) {
            return true;
        }

        return false;

    }

    public static boolean isPositive(double balance) {
        // if(balance.matches)

        if (balance < 0 || balance == 0) {
            return false;
        }

        return true;

    }
}
