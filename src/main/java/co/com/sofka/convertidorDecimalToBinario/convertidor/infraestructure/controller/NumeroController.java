package co.com.sofka.convertidorDecimalToBinario.convertidor.infraestructure.controller;

import co.com.sofka.convertidorDecimalToBinario.convertidor.domain.model.Numero;
import co.com.sofka.convertidorDecimalToBinario.convertidor.domain.service.NumeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convertir")
@CrossOrigin("*")
public class NumeroController {
    @Autowired
    private NumeroService service;

    @GetMapping("/{numero}")
    public ResponseEntity<String> decimalToBinario(@PathVariable("numero") String numero) {
        return new ResponseEntity<>(this.service.convertirDecimalToBinario(numero), HttpStatus.OK);
    }

}
