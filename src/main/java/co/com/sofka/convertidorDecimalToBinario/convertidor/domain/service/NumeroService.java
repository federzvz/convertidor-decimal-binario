package co.com.sofka.convertidorDecimalToBinario.convertidor.domain.service;

import co.com.sofka.convertidorDecimalToBinario.convertidor.domain.model.Numero;
import co.com.sofka.convertidorDecimalToBinario.convertidor.infraestructure.mapper.NumeroMapper;
import org.springframework.stereotype.Service;

@Service
public class NumeroService {
    NumeroMapper mapper;
    public String convertirDecimalToBinario(String numero){
        return Long.toBinaryString(mapper.longToNumero(numero).getValor());
    }
}
