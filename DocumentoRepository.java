package com.exemplo.repository;

import com.exemplo.model.Documento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentoRepository extends JpaRepository<Documento, String> {
}
