package Models;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class Debt {
	private int studentId;
	private int monthlyPercent;
	private int amount;
	private int id;
}