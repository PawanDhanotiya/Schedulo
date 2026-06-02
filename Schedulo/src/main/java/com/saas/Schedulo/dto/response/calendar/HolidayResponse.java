package com.saas.Schedulo.dto.response.calendar;

import com.saas.Schedulo.entity.calendar.Holiday;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class HolidayResponse {

    private UUID id;
    private String name;
    private String description;
    private LocalDate holidayDate;
    private Holiday.HolidayType holidayType;
    private Boolean isRecurring;
    private Boolean isHalfDay;
    private String applicableTo;
    private UUID organizationId;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
