package ma.exam.tp1_api.controller;

import ma.exam.tp1_api.entites.Nombres;
import ma.exam.tp1_api.service.CalculService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/calculateur")
public class CalculateurController {
    private final CalculService calculService;

    public CalculateurController(CalculService calculService) {
        this.calculService = calculService;
    }

    @GetMapping("/somme")
    public double somme(
            @RequestParam("nombre1") double nombre1,
            @RequestParam("nombre2") double nombre2) {

        Nombres nombres = new Nombres(nombre1, nombre2);
        return calculService.calculerSomme(nombres);
    }
}
