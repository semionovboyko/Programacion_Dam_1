package Pruebas;

public class arraysstrings {
    public static void main (String[] args){
       String str[]={"Java", "desde","Cero"};
        System.out.println("Array Original: ");
        
        for (String s : str)
            System.out.print(s+ " ");
        System.out.println("\n");
       
        //Cambiando un String
        str[1]="Curso";
        str[2]="Online";
        
        System.out.println("Array Modificado: ");
        for (String s : str)
            System.out.print(s+ "");
        System.out.println("\n");
        
        String sr="Java desde Cero";
        //Construyendo un substring
         String substr=sr.substring(5,15);
         System.out.println("str: "+str);
         System.out.println("substr: "+substr);
         
         
    }

}
