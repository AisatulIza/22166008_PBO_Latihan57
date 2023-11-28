/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2166008_pbo_lat57;

/**
* author
* Nama      : A`isatul Iza
* Nim       : 22166008
* Semester  : 3
* Prodi     : Sistem Informasi
* Matkul    : PBO
**/
//kelas vehicle
public class Vehicle {
    //variabel
    private String myBrand;
    private String myModel;
    //konstruktor
    public Vehicle(String brand, String model) {
        this.myBrand = brand;
        this.myModel = model;
    }
    //metode get 
    public String getBrand() {
        return myBrand;
    }
    //metode set untuk mengubah nilai awal variabel brand
    public void setBrand(String brand) {
        this.myBrand = brand;
    }
    //metode get
    public String getModel() {
        return myModel;
    }
    //metode set untuk mengubah nilai awal variabel model
    public void setModel(String model) {
        this.myModel = model;
    }
}
//kelas bicycle turunan dari kelas vehicle
class Bicycle extends Vehicle {
    //variabel
    private int myGearCount;
    //konstruktor
    public Bicycle(String brand, String model, int gearCount) {
        super(brand, model);
        this.myGearCount = gearCount;
    }
    //metode get
    public int getGearCount() {
        return myGearCount;
    }
    //metode set
    public void setGearCount(int gearCount) {
        this.myGearCount = gearCount;
    }
}
//kelas skateboard turunan dari kelas vehicle
class Skateboard extends Vehicle {
    //variabel
    private double myBoardLength;
    //konstruktor
    public Skateboard(String brand, String model, double boardLength) {
        super(brand, model);
        this.myBoardLength = boardLength;
    }
    //metode get
    public double getBoardLength() {
        return myBoardLength;
    }
    //metode set
    public void setBoardLength(double boardLength) {
        this.myBoardLength = boardLength;
    }
    //metode untuk menjalankan prorgram
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Trek", "7.4FX", 23);
        System.out.println("Bicycle");
        System.out.println("Brand : " + bicycle.getBrand());
        System.out.println("Model : " + bicycle.getModel());
        System.out.println("Jumlah Gear : " + bicycle.getGearCount());
        Skateboard skateboard = new Skateboard("Ally Skate", "Rocket", 54.5);
        System.out.println("Skateboard");
        System.out.println("Brand : " + skateboard.getBrand());
        System.out.println("Model : " + skateboard.getModel());
        System.out.println("Panjangnya Board : " + skateboard.getBoardLength());
    }
    
}
