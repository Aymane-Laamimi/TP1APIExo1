package ma.exam.tp1_api.service;

import ma.exam.tp1_api.entites.Nombres;
import org.springframework.stereotype.Service;


@Service
public class CalculService {
    public double calculerSomme(Nombres nombres) {
        return nombres.getNombre1() + nombres.getNombre2();
    }
}
