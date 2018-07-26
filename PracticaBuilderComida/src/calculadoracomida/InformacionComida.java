/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoracomida;

/**
 *
 * @author maguero
 */
public class InformacionComida {
    private String nombre; 
    private int cantidadPorcion;
    private Medida unidadDeMedida;
    private int porciones;
    private int calorias;
    private int grasa;
    private int sodio;
    private int carbohidratos;

    public InformacionComida(String pNombre, int pCantidadPorcion, Medida pMedida, 
                              int pPorciones, int pCalorias, int pGrasa, int pSodio, int pCarbohidratos){
        this.nombre = pNombre;
        this.cantidadPorcion = pCantidadPorcion;
        this.unidadDeMedida = pMedida;
        this.porciones = pPorciones;
        this.calorias = pCalorias;
        this.grasa = pGrasa;
        this.sodio = pSodio;
        this.carbohidratos = pCarbohidratos;
    }
    
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the cantidadPorcion
     */
    public int getCantidadPorcion() {
        return cantidadPorcion;
    }

    /**
     * @param cantidadPorcion the cantidadPorcion to set
     */
    public void setCantidadPorcion(int cantidadPorcion) {
        this.cantidadPorcion = cantidadPorcion;
    }

    /**
     * @return the unidadDeMedida
     */
    public Medida getUnidadDeMedida() {
        return unidadDeMedida;
    }

    /**
     * @param unidadDeMedida the unidadDeMedida to set
     */
    public void setUnidadDeMedida(Medida unidadDeMedida) {
        this.unidadDeMedida = unidadDeMedida;
    }

    /**
     * @return the porciones
     */
    public int getPorciones() {
        return porciones;
    }

    /**
     * @param porciones the porciones to set
     */
    public void setPorciones(int porciones) {
        this.porciones = porciones;
    }

    /**
     * @return the calorias
     */
    public int getCalorias() {
        return calorias;
    }

    /**
     * @param calorias the calorias to set
     */
    public void setCalorias(int calorias) {
        this.calorias = calorias;
    }

    /**
     * @return the grasa
     */
    public int getGrasa() {
        return grasa;
    }

    /**
     * @param grasa the grasa to set
     */
    public void setGrasa(int grasa) {
        this.grasa = grasa;
    }

    /**
     * @return the sodio
     */
    public int getSodio() {
        return sodio;
    }

    /**
     * @param sodio the sodio to set
     */
    public void setSodio(int sodio) {
        this.sodio = sodio;
    }

    /**
     * @return the carbohidratos
     */
    public int getCarbohidratos() {
        return carbohidratos;
    }

    /**
     * @param carbohidratos the carbohidratos to set
     */
    public void setCarbohidratos(int carbohidratos) {
        this.carbohidratos = carbohidratos;
    }
 
    
    
}
