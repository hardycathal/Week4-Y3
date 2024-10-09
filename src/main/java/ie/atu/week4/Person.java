package ie.atu.week4;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotNull(message = "You must Enter a name.")
    private String name;
    @NotNull(message = "You must enter a title")
    private String title;
    @Min(250) @Max(value = 1000, message = "Employee ID must be between 250-1000")
    private int employeeid;
    @Positive(message = "Invalid entry, age must be positive")
    private int age;
    @Email(message = "Please enter a valid email address")
    private String email;
    @NotNull(message = "You must enter a position")
    private String position;
    @NotNull(message = "You must enter a position")
    private String department;


}
