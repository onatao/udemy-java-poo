package secao11;
    import java.time.LocalDate;
    import java.sql.Date;
    import java.time.Instant;
    import java.time.LocalDateTime;
    import java.time.ZoneId;
    import java.time.format.DateTimeFormatter;
public class ConvString {
    public static void main(String[] args) {
       LocalDate data1 = LocalDate.parse("2022-07-20");
       LocalDateTime data2 = LocalDateTime.parse("2022-07-20T01:30:26");
       Instant data3  = Instant.parse("2022-07-20T01:30:26Z");

       // Customizando o formato de saída
       
       // Data
       DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
       // Data e hora
       DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"); 
       // Especificando o fuso horário (INSTANT) considerando o fuso horári do sistema local
       DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

       System.out.println("Data 1 " + data1.format(fmt1));
       System.out.println("Data 2 " + data2.format(fmt2));

       // INSTANT não possui método format, inverter chamada
       System.out.println("Data 3 " + fmt3.format(data3));

    }
    
}
