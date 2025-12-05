package com.analyze;

import com.analyze.KeywordAnalyzer;

import java.util.Arrays;

public class SpamAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] keywords;

    public SpamAnalyzer(String[] args) {
        this.keywords = Arrays.copyOf(args, args.length);
    }

    protected String[] getKeywords() {
        return this.keywords;
    }

    protected Label getLabel(){
        return Label.SPAM;
    }
}
