import java.time.LocalDate;
import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {


        List<Rectangle> prostokot = Arrays.asList(
                new Rectangle(1,1),
                new Rectangle(2,3),
                new Rectangle(4,5),
                new Rectangle(6,7),
                new Rectangle(6,9),
                new Rectangle(42,1),
                new Rectangle(5,8),
                new Rectangle(3,6),
                new Rectangle(6,1),
                new Rectangle(8,2)
        );

        //Zadanie A

        List<Double> ZadA = prostokot.stream()
                .filter(nwm -> nwm.getArea() > nwm.getPerimeter())
                .map(beka -> beka.getArea())
                .collect(Collectors.toList());
        System.out.println("Zadanie A");
        System.out.println(ZadA);

        //Zadanie B

        List<Double> ZadB = prostokot.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getPerimeter))
                .map(beka -> beka.getPerimeter())
                .collect(Collectors.toList());
        System.out.println("Zadanie B");
        System.out.println(ZadB);

        //Zadanie C

        DoubleSummaryStatistics ZadC = prostokot.stream()
                .mapToDouble(Rectangle::getPerimeter)
                .summaryStatistics();
        System.out.println("Zadanie C");
        System.out.println(ZadC.getAverage());

        //Zadanie D

        DoubleSummaryStatistics lmao = prostokot.stream()
                .mapToDouble(Rectangle::getArea)
                .summaryStatistics();

        List<Double> ZadD = prostokot.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getArea).reversed())
                .filter(idk -> idk.getArea() < lmao.getAverage())
                .map(beka -> beka.getArea())
                .collect(Collectors.toList());
        System.out.println("Zadanie D");
        System.out.println(ZadD);

        //Zadanie E

        DoubleSummaryStatistics ZadE = prostokot.stream()
                .mapToDouble(Rectangle::getArea)
                .summaryStatistics();
        System.out.println("Zadanie E");
        System.out.println(ZadE.getSum());

        List<Double> Mapa = prostokot.stream()
                .map(lol -> lol.getArea())
                .collect(Collectors.toList());
        System.out.println("Zmapowane z polem");
        System.out.println(Mapa);
    }
}