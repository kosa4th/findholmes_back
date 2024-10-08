package org.detective.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ParticipantDTO {

    private Long userId;
    private String userName;
    private String role;
}
