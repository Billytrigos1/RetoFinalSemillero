package com.postman.utils;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
/**
 * @autor Billy Trigos
 * @Fecha: --o--
 */
public class Data {
    private  static ArrayList<Map<String, String>> data= new ArrayList<>();
    private  static ArrayList<Map<String, String>> data2= new ArrayList<>();
    private  static ArrayList<Map<String, String>> data3= new ArrayList<>();

    public static ArrayList<Map<String, String>> extractTo(){
        try {
            data= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataPet.xlsx","InfoPost");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data;
    }
    public static ArrayList<Map<String, String>> extractURL(){
        try {
            data2= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataPet.xlsx","Url");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data2;
    }

    public static ArrayList<Map<String, String>> extractTo1(){
        try {
            data3= Excel.leerDatosDeHojaDeExcel("src/main/resources/Data/DataPet.xlsx","PUT");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return data3;
    }
}
