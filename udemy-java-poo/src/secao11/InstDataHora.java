package secao11;

    import java.time.Instant;
    import java.time.LocalDate;
    import java.time.LocalDateTime;
    import java.time.format.DateTimeFormatter;

public class InstDataHora {
    public static void main(String[] args) {
        // Instanciando data atual
        LocalDate data1 = LocalDate.now(); 
        System.out.println(data1);

        // data atual com horário
        LocalDateTime data2 = LocalDateTime.now();
        System.out.println(data2);

        // Data hora global GMT (fuso horário)
        Instant data3 = Instant.now();
        System.out.println(data3);

        LocalDate data4 = LocalDate.parse("2022-07-20");
        System.out.println(data4);

        LocalDateTime data5 = LocalDateTime.parse("2022-07-20T1:30:26");
        System.out.println(data5);

        Instant data6 = Instant.parse("2022-07-20T1:30:26Z");
        System.out.println(data6);

        Instant data7 = Instant.parse("2022-07-20T1:30:26-3:00");
        System.out.println(data7);

        // Especificando formato customizado
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data08 = LocalDate.parse("21/02/2023", fmt1);
        System.out.println(data08);
    }
    
}
