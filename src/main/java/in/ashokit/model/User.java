package in.ashokit.model;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@Data
public class User {

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Pattern(regexp = "^[0-9]{10}$")
    private  String mobile;

    @NotEmpty
    private String gender;

    @NotNull
    @Past
    private LocalDate dateOfBirth;

}
