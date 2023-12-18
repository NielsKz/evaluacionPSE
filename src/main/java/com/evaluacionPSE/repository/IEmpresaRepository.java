package com.evaluacionPSE.repository;

import com.evaluacionPSE.entity.Empresa;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IEmpresaRepository extends JpaRepository<Empresa,Long> {

  // Método para encontrar las últimas 3 personas ordenadas por createdAt de forma descendente
  List<Empresa> findTop3ByOrderByIdEmpresaDesc();

}
