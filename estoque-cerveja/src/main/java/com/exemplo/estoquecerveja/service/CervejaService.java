package com.exemplo.estoquecerveja.service;

import com.exemplo.estoquecerveja.model.Cerveja;
import com.exemplo.estoquecerveja.repository.CervejaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CervejaService {

    @Autowired
    private CervejaRepository cervejaRepository;

    public List<Cerveja> listarTodas() {
        return cervejaRepository.findAll();
    }

    public Optional<Cerveja> buscarPorId(Long id) {
        return cervejaRepository.findById(id);
    }

    public Cerveja salvar(Cerveja cerveja) {
        return cervejaRepository.save(cerveja);
    }

    public void deletar(Long id) {
        cervejaRepository.deleteById(id);
    }
}
