/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UT5.TA2;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author Lithium582
 */
public class TGrafoNoDirigido extends TGrafoDirigido {
    private Map<Comparable, TVertice> vertices; //lista de vertices del grafo.-
    private LinkedList<TArista> aristas;

    public TGrafoNoDirigido(Collection<TVertice> vertices, Collection<TArista> arista) {
        super(vertices, arista);
        //aristas.setAristas(arista);
    }
    
    public boolean insertarArista(TArista arista) {
        if ((arista.getEtiquetaOrigen()!= null) && (arista.getEtiquetaDestino() != null)) {
            TVertice vertOrigen = buscarVertice(arista.getEtiquetaOrigen());
            TVertice vertDestino = buscarVertice(arista.getEtiquetaDestino());
            if ((vertOrigen != null) && (vertDestino != null)) {
                return vertOrigen.insertarAdyacencia(arista.getCosto(), vertDestino) && vertDestino.insertarAdyacencia(arista.getCosto(), vertOrigen);
            }
        }
        return false;
    }
    
    private TVertice buscarVertice(Comparable unaEtiqueta) {
        return getVertices().get(unaEtiqueta);
    }
    
    public LinkedList<TVertice> metodoPrim(LinkedList<TArista> pAristas){
        
        return new LinkedList<TVertice>();
        /*LinkedList<TVertice> listaRetorno = new LinkedList();
        pAristas = new LinkedList();
        Set<Comparable> claves = this.vertices.keySet();
        
        TVertice primerVertice = this.vertices.get(claves.toArray()[0]);
        listaRetorno.add(primerVertice);
        
        while()*/
        /*
        LinkedList<Comparable> verticesU = new LinkedList();
        LinkedList<Comparable> verticesV = new LinkedList();
        TAristas aristasAAM = new TAristas();
        TArista tempArista;
        
        
        while(!verticesV.isEmpty()){
            tempArista = this.getLasAristas().buscarMin(verticesU,verticesV);
            if(tempArista == null){
                return null;
            }
            
            aristasAAM.add(tempArista);
            Comparable destino = tempArista.getEtiquetaDestino();
            verticesV.remove(destino);
            verticesU.add(destino);
            costoPrim += tempArista.getCosto();
        }
        
        return new TGrafoNoDirigido(this.getVertices().values(),aristasAAM);*/
    }
    
    //Bean, apresien, ovserben ?)
    public String bea(){
        if (this.getVertices().isEmpty()) {
            return "El grafo está vacio";
        } else {
            for (TVertice vertV : this.getVertices().values()) {
                if (!vertV.getVisitado()) {
                   return vertV.bea();//Lo hace para el primero nada más por el return.
                }
            }
        }
      return "El grafo está vacio";
    }
    
    //Bean, apresien, ovserben ?)
    public String bea(Comparable etiquetaInicial){
        if (this.getVertices().isEmpty()) {
            return "El grafo está vacio";
        } else {
            /*for (TVertice vertV : this.getVertices().values()) {
                if (!vertV.getVisitado()) {
                   return vertV.bea();
                }
            }*/
            
            TVertice verticeBuscado = this.getVertices().get(etiquetaInicial);
            
            return verticeBuscado.bea();
        }
        
        //return "HOLU";
    }
}
