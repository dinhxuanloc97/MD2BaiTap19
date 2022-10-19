package Bai2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberPhone {
    private static final String CLASS_REGEX = "^\\d{2}[-][0]\\d{8}$";
    public NumberPhone(){

    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return  matcher.matches();
    }
}
