import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Ingrese el nombre del archivo: ");
        Scanner input = new Scanner(System.in);
        String nombreTXT = input.nextLine();
        List<List> mapaArray = new ArrayList<>();

        try {
            Stream<String> lines = Files.lines(
                    Paths.get("/Users/block/Desktop/Jose Block/Radio/Rurple/mapas/"+nombreTXT+".txt"),
                    StandardCharsets.UTF_8
            );
            lines.forEach(line -> {
                List<String> l = new ArrayList<>();
                for (int i=0; i<line.length(); i++){
                    String espacio = Character.toString(line.charAt(i));
                    l.add(espacio);
                }
                mapaArray.add(l);
            });
            //mapaArray.forEach(l -> System.out.print(l));

            Map myMap = new Map(mapaArray);
            System.out.println(myMap);

            System.out.println("Ingrese el nombre del archivo de solucion: ");
            Scanner inpu = new Scanner(System.in);
            String nombreTEXT = inpu.nextLine();
            try{
                Stream<String> lineas = Files.lines(
                        Paths.get("/Users/block/Desktop/Jose BLock/Radio/Rurple/instrucciones/"+nombreTEXT+".txt"),
                        StandardCharsets.UTF_8
                );
                lineas.forEach(line -> {
                    System.out.println(line);
                    switch (line){
                        case "MOVE":
                            myMap.getRobot().move();
                            break;
                        case "ROTATE":
                            myMap.getRobot().turnleft();
                            break;
                        case "PICK":
                            if (myMap.hayPoints()){
                                myMap.getRobot().pick();
                                myMap.quitarPoint();
                            }
                            break;
                    }
                    myMap.recargar();
                    System.out.println(myMap);
                    System.out.println("Points: "+myMap.getRobot().getPoints());
                });
            }catch(IOException exception){
                System.out.println("Error!");
            }
        } catch(IOException exception) {
            System.out.println("Error!");
        }
    }
}
