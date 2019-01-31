package com.example.interactivestory.model;

class Choice {
    private int textId;
    private int nextPage;

    public int getTextId() {
        return textId;
    }

    public int getNextPage() {
        return nextPage;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public void setNextPage(int nextPage) {
        this.nextPage = nextPage;
    }
}
