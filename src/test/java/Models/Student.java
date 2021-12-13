package Models;

import lombok.*;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public @Data class Student{
    private boolean sex;
    private String name;
    private int risk;
    private int age;
}