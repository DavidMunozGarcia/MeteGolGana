/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clase_Campeonato;
import Modelo.Clase_Temporada;
import Modelo.Modelo_Campeonato;
import Vista.MenuPrincipal;
import Vista.VistaCampeonato;

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
        vistaPrincipal.getBtnPersonaMn().addActionListener(l -> menuPersonas() );
        vistaPrincipal.getBtnProductosMN().addActionListener(l -> menuProductos());
        vistaPrincipal.getBtnFactura().addActionListener(l -> menuFactura());
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
        
        Modelo.ModeloProductos mod = new ModeloProductos();
        Vista.VistaProductos vis = new VistaProductos();
        Clase_Temporada miproducto = new Clase_Temporada();
        vistaPrincipal.getDesctopPrincipal().add(vis);
        controlador.ControladorProductos controlPro = new ControladorProductos(mod, vis);
        controlPro.iniciaControl();
        

}
    
     private void menuFactura () { 
        
        modelo.ModeloDetalleFactura mod = new ModeloDetalleFactura();
        modelo.ModeloFactura mf = new ModeloFactura();
        modelo.ModeloPersona mp = new ModeloPersona();
        modelo.ModeloProductos mpro = new ModeloProductos();
        
        vista.VistaFactura vis = new VistaFactura();
        

         
        vistaPrincipal.getDesctopPrincipal().add(vis);
        
        controlador.ControladorFactura controlfac = new ControladorFactura(mf, mp, mpro, mod, vis);
        controlfac.iniciaControl();
        

}
    
}
