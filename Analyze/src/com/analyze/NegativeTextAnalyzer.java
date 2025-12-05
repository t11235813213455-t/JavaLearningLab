package com.analyze;

public class NegativeTextAnalyzer extends KeywordAnalyzer implements TextAnalyzer {

    private String[] smiles = {":(", "=(", ":|"};

    protected String[] getKeywords() {
        return this.smiles;
    }

    protected Label getLabel(){
        return Label.NEGATIVE_TEXT;
    }
}
