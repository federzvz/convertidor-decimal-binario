package co.com.sofka.convertidorDecimalToBinario.convertidor.infraestructure.mapper;

import co.com.sofka.convertidorDecimalToBinario.convertidor.domain.model.Numero;

public class NumeroMapper {
    public Numero longToNumero(String num){
        return new Numero(Long.parseLong(num));
    }
}
