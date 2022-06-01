package com.arham;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringValidator {
    public static Response isValidString(String str) {
        Response response = new Response();
        String regex = "^[a-zA-Z]+"; // to match one or more alphabets (both UPPER and lower cases)
        String regexWhiteSpace = "\\s+"; // checks for white spaces only
        Pattern patternWhiteSpace = Pattern.compile(regexWhiteSpace);
        Matcher matcherWhiteSpace = patternWhiteSpace.matcher(str);
        if (matcherWhiteSpace.matches()) {
            response.setMessage("String contains white spaces only.");
            response.setIsValid(false);
            return response;
        }
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(str);
        boolean isValid = matcher.matches();
        response.setIsValid(isValid);
        if(isValid == true)
            response.setMessage("String is valid! It only contains alphabets.");
        else
            response.setMessage("String is not valid! It contains characters other than alphabets.");
        return response;
    }
}
