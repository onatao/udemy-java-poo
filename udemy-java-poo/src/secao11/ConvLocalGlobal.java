package secao11;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvLocalGlobal {
    public static void main(String[] args) {
        LocalDate data1 = LocalDate.parse("2022-07-20");
        LocalDateTime data2 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant data3  = Instant.parse("2022-07-20T01:30:26Z");

        // Lista de nomes para especificar fuso horário
        //for (String s: ZoneId.getAvailableZoneIds()) System.out.println(s);

        // Converter Instant para LocalDate (considerando o fuso horário da maquina)
        LocalDate r1 = LocalDate.ofInstant(data3, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(data3, ZoneId.of("Portugal")); // fuso horário de portugal
        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);

        // LocalDateTime
        LocalDateTime r3 = LocalDateTime.ofInstant(data3, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(data3, ZoneId.of("Portugal"));
        System.out.println(r3);
        System.out.println(r4);

        // Obter dados específicos
        System.out.println("dia data1 " + data1.getDayOfMonth());
        System.out.println("data 1 ano " + data1.getYear());

    }
}
