package com.alevel.helper;

public class VerifHelper {
    public boolean containsIgnoreCase(String text, String searchString) {
        return text.toLowerCase().contains(searchString.toLowerCase());
    }
}
