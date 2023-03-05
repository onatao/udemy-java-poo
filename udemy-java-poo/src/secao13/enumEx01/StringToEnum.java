package secao13.enumEx01;

public class StringToEnum {
    // Conversão de String para Enum
    public static void main(String[] args) {
        
        OrderStatus os1 = OrderStatus.ENTREGUE;
        OrderStatus os2 = OrderStatus.valueOf("Entregue");

        System.out.println(os1);
        System.out.println(os2);
    }
    
}
