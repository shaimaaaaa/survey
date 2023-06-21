package com.example.surveyproject;

public class Survey {
    private String q;
    private int answer1, Answer2;

    public Survey(String q, int answer1, int answer2) {
        this.q = q;
        this.answer1 = answer1;
        Answer2 = answer2;
    }
    public Survey() {
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public int getAnswer1() {
        return answer1;
    }

    public void setAnswer1(int answer1) {
        this.answer1 = answer1;
    }

    public int getAnswer2() {
        return Answer2;
    }

    public void setAnswer2(int answer2) {
        Answer2 = answer2;
    }

    @Override
    public String toString() {
        return "Survey{" +
                "q='" + q + '\'' +
                ", answer1=" + answer1 +
                ", Answer2=" + Answer2 +
                '}';
    }
}
