package com.cardenas.clinicaHistorial.entidad;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class usuarioEntidad {

    @Size(min=3, max=50)
    @Pattern(regexp = "^[a-zA-Z ]+$", message = "El nombre solo puede contener letras y espacios.")
    private String nombre;

    @NotNull
    @Size(min=8, max=15)
    @Pattern(regexp = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$@$!%*?&])[A-Za-z\\d$@$!%*?&]{8,15}", message="La contraseña debe tener min 8 caracteres Una Mayuscula, Una minuscula, un numero y un caracter especial")
    private String clave;

    @NotBlank
    @Email(message = "Ingrese un correo")
    private String correo;

    @NotBlank
    @Pattern(regexp = "^\\d{10}$", message = "El número de teléfono debe tener 10 dígitos y solo contener números")
    private String telefono;

    @Size(min=10, max=150)
    private String domicilio;

    @NotBlank
    private String genero;

    @DateTimeFormat(pattern = "yyyy-mm-yy")
    private Date fecha_nacimiento;

    @NotBlank
    private String tipoSangre;

    @AssertTrue
    private boolean alergia;

    @Size(min=10, max=150)
    private String enfermedad;



}
