package com.exemplo.estoquecerveja.controller;

import com.exemplo.estoquecerveja.model.Cerveja;
import com.exemplo.estoquecerveja.service.CervejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cervejas")
public class CervejaController {

    @Autowired
    private CervejaService cervejaService;

    @GetMapping
    public List<Cerveja> listarTodas() {
        return cervejaService.listarTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cerveja> buscarPorId(@PathVariable Long id) {
        Optional<Cerveja> cerveja = cervejaService.buscarPorId(id);
        return cerveja.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Cerveja> salvar(@RequestBody Cerveja cerveja) {
        Cerveja cervejaSalva = cervejaService.salvar(cerveja);
        return ResponseEntity.status(HttpStatus.CREATED).body(cervejaSalva);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        cervejaService.deletar(id);
        return ResponseEntity.noContent().build();
    }
}
