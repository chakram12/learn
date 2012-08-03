package com.jsfcompref.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class Model {
    public String generateSentance(String word1, String word2) {
        String result = "invalid arguments";

        if (null != word1 && !word1.isEmpty() &&
            null != word2 && !word2.isEmpty()) {
            result = "The value of word1 is \"" + word1 +
                    "\" and the value of word2 is \"" + word2 + "\".";
        }

        return result;
    }
}

