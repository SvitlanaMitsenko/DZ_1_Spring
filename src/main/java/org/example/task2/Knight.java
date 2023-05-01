package org.example.task2;

public class Knight {
    private IQuest quest;

    public IQuest getQuest() {
        return quest;
    }

    public void setQuest(IQuest quest) {
        this.quest = quest;
    }

    public Knight(IQuest quest) {
        this.quest = quest;
    }
}
