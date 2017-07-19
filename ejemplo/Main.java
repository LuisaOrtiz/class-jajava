package ejemplo;
  
  public class Main {
    
      public static void main(String[] args){
        System.out.println("hola mundo");
          int s= suma (20,30);
          System.out.println(s);
          int r= resta (20,30);
          System.out.println(r);
          int m= multiplicacion (30,7);
          System.out.println(m);
          
          try {
            double d = division (2,3);
            System.out.println(d);
          }catch(Exception e){
            string mensaje = e.getMessage();
            System.out.println(mensaje); 
          }
        
          double d= division (5,3);
          System.out.println(d);
      }
    public static int suma(int numero1 , int numero2 ){
      return numero1 + numero2;
    }
    public static int resta(int numero1, int numero2 ){
      return numero1 - numero2;
    }
    public static int multiplicacion(int numero1, int numero2){
      return numero1 * numero2;
    }
    public static double division(double numero1, int numero2)throws Exception{
      if (numero2 == 2){
        throw new Exception("No es posible hacer division por cero");
        (==0)
      }
      return numero1 / numero2;
    } 
  }