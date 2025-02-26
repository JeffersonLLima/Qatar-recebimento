package com.exemplo.controller;

import com.exemplo.model.Documento;
import com.exemplo.repository.DocumentoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class DocumentoController {

    @Autowired
    private DocumentoRepository documentoRepository;

    @GetMapping("/")
    public String listarDocumentos(Model model) {
        model.addAttribute("documentos", documentoRepository.findAll());
        return "index"; // Vai renderizar o template index.html
    }

    @PostMapping("/adicionar")
    public String adicionarDocumento(Documento documento) {
        documentoRepository.save(documento);
        return "redirect:/"; // Redireciona para a página inicial
    }

    @GetMapping("/remover/{mawb}")
    public String removerDocumento(@PathVariable String mawb) {
        documentoRepository.deleteById(mawb);
        return "redirect:/"; // Redireciona para a página inicial
    }

    // Função para calcular a divergência percentual (exemplo de cálculo)
    @PostMapping("/calcular")
    public String calcularDivergencia(@RequestParam double valorAntigo, @RequestParam double valorNovo, Model model) {
        double divergencia = ((valorNovo - valorAntigo) / valorAntigo) * 100;
        String mensagem = divergencia > 0 ? 
                          "Aumento de " + divergencia + "%" : 
                          "Redução de " + Math.abs(divergencia) + "%";
        model.addAttribute("resultado", mensagem);
        return "index"; // Retorna ao template
    }
}
