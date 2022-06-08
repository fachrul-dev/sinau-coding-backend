package com.example.sinauspringboot.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class DataResponse<T> {

    private boolean success;
    private String message;
    private T data;
}
