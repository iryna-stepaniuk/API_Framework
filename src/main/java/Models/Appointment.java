package Models;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Appointment {
    private int id;
    private int deptId;
    private int[] collectorIds;
    private String appointmentDate;
}

