package persistence;
import java.io.*;
import java.sql.*;
import java.util.*;
import java.math.*;

 /**
  * Taller Value Object.
  * This class is value object representing database table Taller
  * This class is intented to be used together with associated Dao object.
  */

 /**
  * This sourcecode has been generated by FREE DaoGen generator version 2.4.1.
  * The usage of generated code is restricted to OpenSource software projects
  * only. DaoGen is available in http://titaniclinux.net/daogen/
  * It has been programmed by Tuomo Lukka, Tuomo.Lukka@iki.fi
  *
  * DaoGen license: The following DaoGen generated source code is licensed
  * under the terms of GNU GPL license. The full text for license is available
  * in GNU project's pages: http://www.gnu.org/copyleft/gpl.html
  *
  * If you wish to use the DaoGen generator to produce code for closed-source
  * commercial applications, you must pay the lisence fee. The price is
  * 5 USD or 5 Eur for each database table, you are generating code for.
  * (That includes unlimited amount of iterations with all supported languages
  * for each database table you are paying for.) Send mail to
  * "Tuomo.Lukka@iki.fi" for more information. Thank you!
  */



public class Taller implements Cloneable, Serializable {

    /** 
     * Persistent Instance variables. This data is directly 
     * mapped to the columns of database table.
     */
    private int id;
    private String puntaje;
    private double co2generado;
    private int id_tallerista;



    /** 
     * Constructors. DaoGen generates two constructors by default.
     * The first one takes no arguments and provides the most simple
     * way to create object instance. The another one takes one
     * argument, which is the primary key of the corresponding table.
     */

    public Taller () {

    }

    public Taller (int idIn) {

          this.id = idIn;

    }


    /** 
     * Get- and Set-methods for persistent variables. The default
     * behaviour does not make any checks against malformed data,
     * so these might require some manual additions.
     */

    public int getId() {
          return this.id;
    }
    public void setId(int idIn) {
          this.id = idIn;
    }

    public String getPuntaje() {
          return this.puntaje;
    }
    public void setPuntaje(String puntajeIn) {
          this.puntaje = puntajeIn;
    }

    public double getCo2generado() {
          return this.co2generado;
    }
    public void setCo2generado(double co2generadoIn) {
          this.co2generado = co2generadoIn;
    }

    public int getId_tallerista() {
          return this.id_tallerista;
    }
    public void setId_tallerista(int id_talleristaIn) {
          this.id_tallerista = id_talleristaIn;
    }



    /** 
     * setAll allows to set all persistent variables in one method call.
     * This is useful, when all data is available and it is needed to 
     * set the initial state of this object. Note that this method will
     * directly modify instance variales, without going trough the 
     * individual set-methods.
     */

    public void setAll(int idIn,
          String puntajeIn,
          double co2generadoIn,
          int id_talleristaIn) {
          this.id = idIn;
          this.puntaje = puntajeIn;
          this.co2generado = co2generadoIn;
          this.id_tallerista = id_talleristaIn;
    }


    /** 
     * hasEqualMapping-method will compare two Taller instances
     * and return true if they contain same values in all persistent instance 
     * variables. If hasEqualMapping returns true, it does not mean the objects
     * are the same instance. However it does mean that in that moment, they 
     * are mapped to the same row in database.
     */
    public boolean hasEqualMapping(Taller valueObject) {

          if (valueObject.getId() != this.id) {
                    return(false);
          }
          if (this.puntaje == null) {
                    if (valueObject.getPuntaje() != null)
                           return(false);
          } else if (!this.puntaje.equals(valueObject.getPuntaje())) {
                    return(false);
          }
          if (valueObject.getCo2generado() != this.co2generado) {
                    return(false);
          }
          if (valueObject.getId_tallerista() != this.id_tallerista) {
                    return(false);
          }

          return true;
    }



    /**
     * toString will return String object representing the state of this 
     * valueObject. This is useful during application development, and 
     * possibly when application is writing object states in textlog.
     */
    public String toString() {
        StringBuffer out = new StringBuffer(this.getDaogenVersion());
        out.append("\nclass Taller, mapping to table Taller\n");
        out.append("Persistent attributes: \n"); 
        out.append("id = " + this.id + "\n"); 
        out.append("puntaje = " + this.puntaje + "\n"); 
        out.append("co2generado = " + this.co2generado + "\n"); 
        out.append("id_tallerista = " + this.id_tallerista + "\n"); 
        return out.toString();
    }


    /**
     * Clone will return identical deep copy of this valueObject.
     * Note, that this method is different than the clone() which
     * is defined in java.lang.Object. Here, the retuned cloned object
     * will also have all its attributes cloned.
     */
    public Object clone() {
        Taller cloned = new Taller();

        cloned.setId(this.id); 
        if (this.puntaje != null)
             cloned.setPuntaje(new String(this.puntaje)); 
        cloned.setCo2generado(this.co2generado); 
        cloned.setId_tallerista(this.id_tallerista); 
        return cloned;
    }



    /** 
     * getDaogenVersion will return information about
     * generator which created these sources.
     */
    public String getDaogenVersion() {
        return "DaoGen version 2.4.1";
    }

}