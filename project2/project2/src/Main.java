public class Main {
    public static void main(String[] args) {

        //VARIABLES
        int numeroIf = 13;
        int numeroWhile = 0;
        int numeroDoWhile = 0;


        //IF
        if (numeroIf < 0){
             System.out.println("El numero es negativo");
        } else if (numeroIf == 0) {
            System.out.println("El numero es cero");
        }else {
            System.out.println("El numero es positivo");
        }


        //BUCLE WHILE
        while (numeroWhile < 3){
            System.out.println(numeroWhile);
            numeroWhile+=1;
        }


        //BUCLE DO WHILE
        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile+=1;
        } while(numeroDoWhile<1);


        //BUCLE FOR
        for (int numeroFor = 0; numeroFor < 3 ; numeroFor ++ ){
            System.out.println(numeroFor);
        };

        // SWITCH
        String estacion = "PRIMAVERA";

        switch (estacion){
            case "VERANO":
                System.out.println("es verano");
                break;
            case "OTOÑO":
                System.out.println("es otoño");
                break;
            case "INVIERNO":
                System.out.println("es invierno");
                break;
            case "PRIMAVERA":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("No es una estacion");
        }

    }
}