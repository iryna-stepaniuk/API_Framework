package Models;

import java.util.List;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class Appointment{
	private List<Integer> collectorIds;
	private int id;
	private int debtId;
	private String appointmentDate;
}