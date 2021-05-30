package com.javabugs.logmanager.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LogWithoutEventDTO {

    private Long id;
    private Date date;
    private String description;
    private Integer quantity;
    private String level;
    private String origin;

}
