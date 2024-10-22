/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugaspboweek_9;

/**
 *
 * @author hp
 */
abstract class hewan {
    abstract void suara();
}

class Anjing extends hewan {
    @Override
    void suara() {
        System.out.println("Anjing mengeluarkan suara : Guk Guk");
    }    
}

class Kucing extends hewan {
    @Override
    void suara() {
        System.out.println("Kucing mengeluarkan suara : Meong");
    }
}
