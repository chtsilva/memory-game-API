package com.memory_game.game.model.response;

import java.time.LocalDateTime;

public class ApiResponse<T> {
    private LocalDateTime timestamp;
    private String message;
    private T data;
    private boolean success;

    public ApiResponse(String message, boolean success, T data) {
        this.timestamp = LocalDateTime.now();
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccess() {
        return success;
    }

}