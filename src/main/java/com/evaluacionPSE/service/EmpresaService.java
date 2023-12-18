package com.evaluacionPSE.service;

import com.evaluacionPSE.entity.Empresa;
import com.evaluacionPSE.repository.IEmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpresaService {
  @Autowired
  private IEmpresaRepository repository;

  public Empresa createEmpresa(Empresa person) {
    return repository.save(person);
  }

  public List<Empresa> listEmpresa() {
    return repository.findAll();
  }
  public List<Empresa> listLastEmpresa() {
    return repository.findTop3ByOrderByIdEmpresaDesc();
  }

}
