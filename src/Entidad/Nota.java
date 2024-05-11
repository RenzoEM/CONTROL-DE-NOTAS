
package Entidad;


public class Nota {
    int  dniEst;
    String curso;
    int calificacion;
    String condicion;

    public Nota(int dniEst, String nombre, int calificacion, String condicion) {
        this.dniEst = dniEst;
        this.curso = nombre;
        this.calificacion = calificacion;
        this.condicion = condicion;
    }

    public int getDniEst() {
        return dniEst;
    }

    public void setDniEst(int dniEst) {
        this.dniEst = dniEst;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {
        this.condicion = condicion;
    }

    
    
}
