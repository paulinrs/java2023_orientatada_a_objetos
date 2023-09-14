package teste_processamento;

public class Main {
    
    //exemplo 1 
    public static void main(String[] args) {
        int a, b; //processamento de dados
        a = 5;
        b = 3 * a;

        System.out.println(a);
        System.out.println(b);

    //exemplo 2    
        int c; //variavel inteira
        double d; //variavel com ponto flutuante

        c = 5;
        d = 2 * c;

        System.out.println(c);
        System.out.println(d);

   //exemplo 3
   double y, Y, x, area;
   
   y = 6.0;
   Y = 8.0;
   x = 5.0;

   area = (y + Y) / 2.0 * x;

   System.out.println(area);

 //exemplo 4
 int e, f;
 double resultado;
 
 e = 5;
 f = 2;

 resultado = (double) e / f; //casting

  System.out.println(resultado);

  //exemplo 5
  double g;
  int h;

  g = 5.0;
  h = (int) g;

  System.out.println(h);

    }

}
