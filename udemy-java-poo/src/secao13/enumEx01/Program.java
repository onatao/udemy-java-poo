package secao13.enumEx01;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        
       Order o = new Order(12, new Date(), OrderStatus.PAGAMENTO_PENDENTE);

       System.out.println(o);
    }
    
}
