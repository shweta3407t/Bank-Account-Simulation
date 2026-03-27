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

}
