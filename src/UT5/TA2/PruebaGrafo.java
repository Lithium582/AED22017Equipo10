package UT5.TA2;


import UT4.TA06.*;
import static java.lang.System.in;
import java.util.Collection;

public class PruebaGrafo {

    public static void main(String[] args) {
        TGrafoNoDirigido gd = (TGrafoNoDirigido) UtilGrafos.cargarGrafo("./src/verticesBEA.txt", "./src/aristasBEA.txt",
                false, TGrafoNoDirigido.class);

        Object[] etiquetasarray = gd.getEtiquetasOrdenado();
        //String bean = gd.bea();
        String bean5 = gd.bea("f");
        
        //System.out.println(bean);
        System.out.println(bean5);
   
        //gd.desvisitarVertices();
   /*
        if (gd.tieneCiclo()) {
            System.out.println("tiene ciclos");
        } else {
            System.out.println("no tiene ciclos");
        }*/
    }
}
