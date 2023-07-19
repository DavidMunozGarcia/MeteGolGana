/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clase_Campeonato;
import Modelo.Clase_Temporada;
import Modelo.Modelo_Campeonato;
import Modelo.Modelo_Temporada;
import Vista.MenuPrincipal;
import Vista.VistaCampeonato;
import Vista.VistaTemporada;

/**
 *
 * @author tatip
 */
public class Controlador_MP {
    
    MenuPrincipal vistaPrincipal;
    
    public Controlador_MP (MenuPrincipal vistaPrincipal ){
        
        this.vistaPrincipal = vistaPrincipal;
        vistaPrincipal.setVisible(true);
    }
    
    public void iniciaControl (){
        vistaPrincipal.getBtnCampeonato().addActionListener(l ->menuCampeonato());
        vistaPrincipal.getBtnTemporada().addActionListener(l -> menuTemporada());

    }
    
    private void menuCampeonato () { 
        
        Modelo.Modelo_Campeonato model = new Modelo_Campeonato();
        Vista.VistaCampeonato vista = new VistaCampeonato();
        Clase_Campeonato miCampeon = new Clase_Campeonato();
        vistaPrincipal.getDesctopPrincipal().add(vista);
        Controlador.Controlador_Campeonato controlPer = new Controlador_Campeonato(model, vista);
        controlPer.iniciaControl();
        

}
    
    
     private void menuTemporada () { 
        
        Modelo.Modelo_Temporada mod = new Modelo_Temporada();
        Vista.VistaTemporada vis = new VistaTemporada();
        Clase_Temporada miTempo = new Clase_Temporada();
        vistaPrincipal.getDesctopPrincipal().add(vis);
        Controlador_temporada controlPro = new Controlador_temporada (mod, vis);
        controlPro.iniciaControl();
        

}
    
    /* private void menuFactura () { 
        
        modelo.ModeloDetalleFactura mod = new ModeloDetalleFactura();
        modelo.ModeloFactura mf = new ModeloFactura();
        modelo.ModeloPersona mp = new ModeloPersona();
        modelo.ModeloProductos mpro = new ModeloProductos();
        
        vista.VistaFactura vis = new VistaFactura();
        

         
        vistaPrincipal.getDesctopPrincipal().add(vis);
        
        controlador.ControladorFactura controlfac = new ControladorFactura(mf, mp, mpro, mod, vis);
        controlfac.iniciaControl();
        

}*/
    
}
