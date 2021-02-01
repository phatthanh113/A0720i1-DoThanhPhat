package commons.regex;

public class Regex {
    public static final String RG_BIRTHDAY = "";
    public static final String RG_NAME = "^[a-z ,.'-]+$";

    public boolean validate(String string,String regex) {
        return string.matches(regex);
    }
}
