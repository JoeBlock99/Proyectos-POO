import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del archivo: ");
        Scanner input = new Scanner(System.in);
        String nombreTXT = input.nextLine();
        //String[][] mapLista;

        try {
            Stream<String> lines = Files.lines(
                    Paths.get("/Users/block/Desktop/Jose Block/Radio/Rurple/mapas/"+nombreTXT+".txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(s -> System.out.println(s));




        } catch(IOException exception) {
            System.out.println("Error!");
        }


    }
}
