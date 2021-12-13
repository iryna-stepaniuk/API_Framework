package Models;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class Collector{
	private String nickname;
	private int id;
	private int fearFactor;
}