package co.com.sofka.convertidorDecimalToBinario.convertidor.domain.service;

import org.springframework.stereotype.Service;

@Service
public class NumeroService {

    public String convertirDecimalToBinario(Long numero){
        return Long.toBinaryString(numero);
    }
}
