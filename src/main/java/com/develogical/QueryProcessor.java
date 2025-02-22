package com.develogical;

public class QueryProcessor {

    public String process(String query) {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }

        if (query.contains("we")){
            return "bear";
        }

        if(query.contains("name")){
            return "KSYJJHKKM-TEAM";
        }
        if (query.contains("plus")){
            String[] l = query.split(" plus ");
            String front = l[0];
            String back = l[1];
            return String.valueOf(Integer.parseInt(Character.toString(front.charAt(front.length() - 1))) + Integer.parseInt(Character.toString(back.charAt(0))));
        }
        return "";
    }
}
