package one.digitalinnovation.personapi.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PersonDTO {

    @JsonProperty("ID")
    private Long id;

    @NotEmpty
    @Size(min = 2, max = 100)
    @JsonProperty("First Name")
    private String firstName;

    @NotEmpty
    @Size(min = 2, max = 100)
    @JsonProperty("Last Name")
    private String lastName;

    @NotEmpty
    @CPF
    @JsonProperty("CPF")
    private String cpf;

    @JsonProperty("Birth Date")
    private String birthDate;

    @Valid
    @NotEmpty
    @JsonProperty("List of Phones")
    private List<PhoneDTO> phones;
}
