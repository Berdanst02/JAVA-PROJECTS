/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dealership;

/**
 *
 * @author berd1810
 */
public class car {

    private String Color;
    private String Model;
    private String Year;
    private String Make;

    public car(String mk, String mdl, String col, String yr) {

        Color = col;
        Model = mdl;
        Year = yr;
        Make = mk;

    }

    public String getColor() {

        return Color;

    }

    public String getModel() {

        return Model;
    }

    public String getYear() {

        return Year;
    }

    public String getMake() {
        return Make;
    }

    public void setColor(String newColor) {

        this.Color = newColor;
    }

    public void setBrand(String newModel) {

        this.Model = newModel;
    }

    public void setMake(String newMake) {

        this.Make = newMake;
    }

    public void setYear(String newYear) {

        this.Year = newYear;
    }

}
