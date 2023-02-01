package com.example.meeting_room.models.user;

public enum EGender {
    MALE("nam"),
    FEMALE("nữ");

    public final String label;

    private EGender(String label) {
        this.label = label;
    }
}
