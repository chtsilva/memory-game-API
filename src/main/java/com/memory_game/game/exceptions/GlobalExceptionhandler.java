package com.memory_game.game.exceptions;

import java.time.LocalDateTime;
import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import com.memory_game.game.model.response.ApiResponse;

@RestController
public class GlobalExceptionhandler {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiResponse<Object>> handleAllExceptions(Exception ex) {
        Map<String, Object> body = new LinkedHashMap<>();
        body.put("timestamp", LocalDateTime.now());
        body.put("error", ex.getMessage());
        body.put("status", 500);
        body.put("message", "An unexpected error occurred");

        ApiResponse<Object> response = new ApiResponse<>("", false, body);
        return ResponseEntity.status(500).body(response);
    }

}
