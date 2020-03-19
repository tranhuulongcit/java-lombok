package info.cafeit.basic;

import lombok.*;


//@Data
//@NoArgsConstructor
@Getter
@Setter
@ToString(exclude = {"firstName", "lastName"})
@EqualsAndHashCode(exclude = {"firstName", "lastName"})
@RequiredArgsConstructor
@AllArgsConstructor
public class Employee {
    private final Long id;
    private String firstName;
    private String lastName;
}
