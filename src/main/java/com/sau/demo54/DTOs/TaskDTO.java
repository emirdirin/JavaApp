package com.sau.demo54.DTOs;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Data
@NoArgsConstructor


public class TaskDTO {
    private Long taskId;
    private String taskName;
    private String description;

    private List<TaskerDTO> taskers;


    public TaskDTO(Long taskId, String taskName, String description) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
    }

    public TaskDTO(Long taskId, String taskName, String description, List<TaskerDTO> taskers) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.taskers = taskers;
    }
}

