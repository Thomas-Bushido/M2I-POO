package org.example.WaterTank;

public class Main {
    public static void main(String[] args) {

        WaterTank citerne1 = new WaterTank(0, 0, 3000);
          citerne1.remplir(700);
        System.out.println(citerne1);
    //    citerne1.vider(500);
        System.out.println(citerne1);
    }
}
