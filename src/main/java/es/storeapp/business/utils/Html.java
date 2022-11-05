package es.storeapp.business.utils;

import org.springframework.web.util.HtmlUtils;

public class Html {
    /**
     * Verify if a string contains any HTML characters by comparing its
     * HTML-escaped version with the original.
     * @param String input  the input String
     * @return boolean  True if the String contains HTML characters
     */
    public static boolean isHtml(String input) {
        boolean isHtml = false;
        if (input != null) {
            if (!input.equals(HtmlUtils.htmlEscape(input))) {
                isHtml = true;
            }
        }
        return isHtml;
    }

    /**
     * Escape HTML characters in a String.
     * @param String input  the input String
     * @return String  the escaped String
     */
    public static String escape(String input) {
        return HtmlUtils.htmlEscape(input);   
    }

    /**
     * Unescape HTML characters in a String.
     * @param String input  the input String
     * @return String  the unescaped String
     */
    public static String unescape(String input) {
        return HtmlUtils.htmlUnescape(input);
    }
}