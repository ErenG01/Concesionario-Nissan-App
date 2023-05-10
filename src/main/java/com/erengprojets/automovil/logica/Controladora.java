
package com.erengprojets.automovil.logica;

import com.erengprojets.automovil.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void agregarAutomovil(String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
        
        Automovil auto = new Automovil();
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setMotor(motor);
        auto.setColor(color);
        auto.setPatente(patente);
        auto.setCantPuertas(cantPuertas);

        controlPersis.agregaAutomovil(auto);
        
    }

    public List<Automovil> traerAutos() {
    
        return controlPersis.traerAutos();
        
    }

    public void borrarAuto(int idAuto) {
        
        controlPersis.borrarAuto(idAuto);
    }

    public Automovil traerAutos(int idAuto) {
        
        return controlPersis.traerAuto(idAuto);
    }

    public void modificarAuto(Automovil auto, String modelo, String marca, String motor, String color, String patente, int cantPuertas) {
    
    
        auto.setColor(color);
        auto.setModelo(modelo);
        auto.setMarca(marca);
        auto.setPatente(patente);
        auto.setMotor(motor);
        auto.setCantPuertas(cantPuertas);
        
        //LE PDIO A LA PERSISTENCIA QUE MODIFIQUE
        controlPersis.modificarAuto(auto);
    }

    
    
}
