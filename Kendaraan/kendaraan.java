/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package praktikumpbo_9;

/**
 *
 * @author hp
 */
abstract class Kendaraan {
    abstract void berjalan();
    void info(){
        System.out.println("Ini adalah kendaraan");
    }
}

class Mobil extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Mobil sedang berjalan dengan cepat");
    }
    
}

class Sepeda extends Kendaraan {
    @Override
    void berjalan() {
        System.out.println("Sepeda sedang berjalan dengan lambat");
    }
}