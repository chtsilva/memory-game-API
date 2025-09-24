package com.memory_game.game.model.response;

public class ApiResponse<T> {
    private String message;
    private T data;
    private boolean success;

    public ApiResponse(String message, boolean success, T data) {
        this.message = message;
        this.success = success;
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public String getMessage() {
        return message;
    }

    // public void setMessage(String message) {
    //     this.message = message;
    // }

    public boolean isSuccess() {
        return success;
    }

    // public void setSuccess(boolean success) {
    //     this.success = success;
    // }
}
