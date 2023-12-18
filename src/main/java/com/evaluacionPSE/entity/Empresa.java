package com.evaluacionPSE.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Table(name = "empresa")
@Entity
@Getter
@Setter
public class Empresa {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long idEmpresa;
  private String ruc;
  private String RazonSocial;
  private String direccion;
  private String estado;
}
