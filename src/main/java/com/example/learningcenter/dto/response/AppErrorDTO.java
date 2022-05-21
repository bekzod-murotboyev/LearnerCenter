package com.example.learningcenter.dto.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.time.LocalDateTime;


@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class AppErrorDTO {
    private Timestamp timestamp;
    private Integer status;
    private String error;
    private String message;
    private String path;

    @Builder(builderMethodName = "secondBuilder")
    public AppErrorDTO(HttpStatus status, String message, String path) {
        this.timestamp = Timestamp.valueOf(LocalDateTime.now());
        this.status = status.value();
        this.error = status.getReasonPhrase();
        this.message = message;
        this.path = path;
    }
}