package com.analyze;

import com.analyze.TextAnalyzer;

public class TooLongTextAnalyzer implements TextAnalyzer {

    private int maxLength = 10;

    public TooLongTextAnalyzer(int m) {
        this.maxLength = m;
    }

    public Label processText(String text) {
        if (text.length() > this.maxLength) {
            return Label.TOO_LONG;
        } else {
            return Label.OK;
        }
    }
}
