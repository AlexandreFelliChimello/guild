package com.projeto.guild.entities.enums;

public enum QuestStatus {

    WAITING_ADVENTURE(0),
    IN_PROGRESS(1),
    COMPLETED(2),
    CANCELLED(3);

    private int code;

    QuestStatus() {}

    QuestStatus(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
    // Method to return the enum by code comparison
    public static QuestStatus valueOf(int code){
        for (QuestStatus q : QuestStatus.values()){
            if (q.getCode() == code){
                return q;
            }
        }
        throw new IllegalArgumentException("Invalid code");
    }
}
