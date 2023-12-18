package com.evaluacionPSE.controller;

import com.evaluacionPSE.entity.Empresa;
import com.evaluacionPSE.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/empresa")
public class EmpresaController {
  @Autowired
  private EmpresaService empresaService;

  @PostMapping()
  public ResponseEntity<Empresa> createPerson(@RequestBody Empresa empresa) {
    return new ResponseEntity<>(empresaService.createEmpresa(empresa), HttpStatus.CREATED);
  }

  @GetMapping()
  public ResponseEntity<List<Empresa>> getAllPeople() {
    List<Empresa> last = empresaService.listEmpresa();
    return new ResponseEntity<>(last, HttpStatus.OK);
  }
  @GetMapping("/last")
  public ResponseEntity<List<Empresa>> getlastPeople() {
    List<Empresa> last = empresaService.listLastEmpresa();
    return new ResponseEntity<>(last, HttpStatus.OK);
  }


}
