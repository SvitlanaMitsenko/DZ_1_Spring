package org.example.task2;

public interface IQuest {
    void passQuest();
    default String getSuccess(){
        return "Квест успешно пройден! :)";
    }
    default String getFault(){
        return "Квест провален! :(";
    }
}
