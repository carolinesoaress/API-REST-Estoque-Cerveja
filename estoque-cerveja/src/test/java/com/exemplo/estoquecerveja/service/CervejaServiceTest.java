package com.exemplo.estoquecerveja.service;

import com.exemplo.estoquecerveja.model.Cerveja;
import com.exemplo.estoquecerveja.repository.CervejaRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class CervejaServiceTest {

    @Mock
    private CervejaRepository cervejaRepository;

    @InjectMocks
    private CervejaService cervejaService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testListarTodas() {
        List<Cerveja> cervejas = new ArrayList<>();
        Cerveja cerveja = new Cerveja();
        cerveja.setId(1L);
        cerveja.setNome("Cerveja Exemplo");
        cerveja.setQuantidade(10);
        cervejas.add(cerveja);

        when(cervejaRepository.findAll()).thenReturn(cervejas);

        List<Cerveja> resultado = cervejaService.listarTodas();
        assertEquals(1, resultado.size());
        assertEquals("Cerveja Exemplo", resultado.get(0).getNome());
    }

    @Test
    public void testBuscarPorId() {
        Cerveja cerveja = new Cerveja();
        cerveja.setId(1L);
        cerveja.setNome("Cerveja Exemplo");
        cerveja.setQuantidade(10);

        when(cervejaRepository.findById(1L)).thenReturn(Optional.of(cerveja));

        Optional<Cerveja> resultado = cervejaService.buscarPorId(1L);
        assertEquals("Cerveja Exemplo", resultado.get().getNome());
    }

 
}

