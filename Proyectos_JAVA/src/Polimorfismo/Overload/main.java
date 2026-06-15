package Polimorfismo.Overload;

public class main {
    public static void main (String [] Números ){

        //Instacnciar objetos en el static

        var caculadoraMixta= new Calculadora(){

        };

        //Aplicar método Overload para mismo método con diferentes declaraciones (int,float)

        var resultado1=caculadoraMixta.sumar(2,3);
        System.out.println(resultado1);

        var resultado2=caculadoraMixta.sumar(2.2,3.3);
        System.out.println(resultado2);



    }


}
