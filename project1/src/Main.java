public class Main {
    public static void main(String[] args) {
        //Primera parte
        int result = Suma.functionSuma(2, 3, 5);
        System.out.println(result);
        //Segunda parte
        Coche miCoche;
        miCoche = new Coche();
        System.out.println(miCoche.cantDoors);
        miCoche.functionDoorsCar(1);
        System.out.println(miCoche.cantDoors);

    }

}

class Suma {
    public static int functionSuma (int par1 ,int par2, int par3){
            int result = par1 + par2 + par3;
            return (result);
    }
}

class Coche {
    static int cantDoors = 2;
    public static int functionDoorsCar(int addDoors){
        Coche.cantDoors = Coche.cantDoors + addDoors;
        return (cantDoors);
    }
}
