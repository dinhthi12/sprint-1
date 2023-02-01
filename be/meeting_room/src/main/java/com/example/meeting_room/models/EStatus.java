package com.example.meeting_room.models;

public enum EStatus {
    FIXING("Đang sửa"),
    AVAILABLE("Sẵn sàng"),
    USING("Đang sử dụng");

    public final String label;

    private EStatus(String label){
        this.label = label;
    }
}
