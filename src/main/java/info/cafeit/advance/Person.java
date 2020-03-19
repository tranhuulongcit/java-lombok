package info.cafeit.advance;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@ToString
@Builder
@Getter
public class Person {
    private Long id;
    private String name;
    private Integer gender;
    private Date birthDay;
}
