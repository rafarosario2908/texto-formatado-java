public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("TEXTO QUE NAO VAI QUEBRA A LINHA ");
        System.out.println("\ntexto que quebra a linha ");

        // %S _ substitui no texto um valor String
        System.out.printf(" vai imprimir %s " , "um texto"  );

        // %d _ subtitui o coringa por um numero inteiro no texto
        System.out.printf("\nminha idade é : %d",33);

        //%f_ subtititui o coringa %f por um numero flutuante
        System.out.printf("\n o valor de PI É: %f" , 3.1415f);

        //%.2f subtitui o coringa %2f por um numero flutuante
        //com casas decimais 
        System.out.printf("\n o valor de PI É: %.2f" , 3.1415 );

        //%b substitui o coringa %b por um valor boolean
        System.out.printf("\nesse valor é %b " , true);
        System.out.printf("\nesse valor é %b " , false);
        
        //%c substitui o coringa %c por uma caracter 
        System.out.printf("\no caracter é %c" ,'A');
        System.out.printf("\no caracter é %c" ,'5');
        System.out.printf("\no caracter é %c" ,'*');
        System.out.printf("\no caracter é %c" ,'\\');
        System.out.printf("\no caracter é %c" ,'\"');


        // printf com os todos os tipos usando variaveis

        String texto = "alguma coisa ";
        int numerointeiro = 1;
        float numeroquebrado = 123.232f;
        boolean valorverdadeiro = true;
        char umCaractere = '°';
        
        System.out.printf("\n %s, %d, %.2f, %b, %c" ,
                            texto,
                            numerointeiro,
                            numeroquebrado,
                            valorverdadeiro,
                            umCaractere);
        


    }
}
