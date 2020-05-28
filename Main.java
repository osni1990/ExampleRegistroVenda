import java.util.Calendar;
class Main {
  public static void main(String[] args) {
    
    
    RegistroVenda rV = new RegistroVenda();
    rV.populaVenda();
    System.out.println(rV.totalVendas());
    System.out.println(rV.maiorVenda());
    System.out.println(rV.valorMedio());
   

  }
  
}
