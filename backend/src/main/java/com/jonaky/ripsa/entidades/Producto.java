package com.jonaky.ripsa.entidades;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Producto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProducto;

    @ManyToOne
    private Proveedor proveedor;

    private String codigoUnico;

    private String descripcion;

    private Double precio;

    private Double codEan;

    private String detalleLargo;

    private Integer cantidad;

}
