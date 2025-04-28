import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Claim{
    int cId;
    static int count = 0;
    String polNum;
    double cAmt;
    String cDate;
    boolean status;

    Claim(String polNum, double cAmt, String cDate, boolean status){
        this.cId = ++count;
        this.polNum = polNum;
        this.cAmt = cAmt;
        this.cDate = cDate;
        this.status = status;
    }

    @Override
    public String toString(){
        return "Claim Id: "+cId+" Policy Number: "+polNum+" Claim Amount: "
                +cAmt+" Claim Date: "+cDate+" Claim Status: "+status;
    }
}

public class ClaimAnalysis {

    public static void filterByAmount(List<Claim> claim){
        System.out.println("Filter By Amount:");
        claim.stream().filter(c->c.status==true && c.cAmt > 5000)
                .forEach(System.out::println);
    }

    public static void groupByClaims(List<Claim> claim){
        Map<String, List<Claim>> grouped = claim.stream().collect(Collectors.groupingBy(c->c.polNum));
        grouped.forEach((polNum, policylist)->{
            System.out.printf("\nPolicy->"+polNum+"\n");
            policylist.forEach(System.out::println);
        });
    }

    public static void getTotandAvg(List<Claim> claim){
        System.out.println("\nTotal Value: "+claim.stream().map(c->c.cAmt)
                .reduce(0.0, Double::sum));
        System.out.println("\nAverage Value: "+claim.stream().mapToDouble(c->c.cAmt)
                .average());
    }

    public static void top3byAmount(List<Claim> claim){
        System.out.println("Top 3 high paid claim Amounts: ");
        claim.stream().sorted((c1, c2)->Double.compare(c2.cAmt, c1.cAmt))
                .limit(3).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Claim> list = Arrays.asList(
                new Claim("A1", 7000, "4thJuly", true),
                new Claim("B1", 3500, "6thJuly", false),
                new Claim("C1", 4500, "5thAug", true),
                new Claim("D1", 6700, "13thSep", false)
        );

        filterByAmount(list);
        groupByClaims(list);
        getTotandAvg(list);
        top3byAmount(list);
    }
}
