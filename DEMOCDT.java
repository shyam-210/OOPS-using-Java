import packex.CurrancyDEY;
import packex.TimeConversion;
import packex.Distance;
import java.util.Scanner;

public class DEMOCDT {
    double dollar, rupee, yen, euro, km;
    int hours, minutes, seconds, meter;
    CurrancyDEY c = new CurrancyDEY();
    Distance d = new Distance();
    Scanner obj = new Scanner(System.in);

    void getCurrencyInput() {

        System.out.println("Enter the dollor:");
        dollar = obj.nextDouble();
        System.out.println("Enter the euro:");
        euro = obj.nextDouble();
        System.out.println("Enter the yen:");
        yen = obj.nextDouble();
        System.out.println("Enter the rupee:");
        rupee = obj.nextDouble();
    }

    void conCurrency() {
        System.out.println("Dollar to Rupee:" + Math.ceil(c.dolToRup(dollar)));
        System.out.println("Euro to Rupee :" + Math.ceil(c.euroToRup(euro)));
        System.out.println("Yen to Rupee :" + Math.ceil(c.yenToRup(yen)));
        System.out.println("Rupee to Dollar:" + Math.ceil(c.rupToDol(rupee)));
        System.out.println("Rupee to Euro :" + Math.ceil(c.rupToEuro(rupee)));
        System.out.println("Rupee to Yen :" + Math.ceil(c.rupToYen(rupee)));

    }

    void getDistanceInput() {
        System.out.println("Enter the kilometer:");
        km = obj.nextDouble();
        System.out.println("Enter the meter:");
        meter = obj.nextInt();
    }

    void conDistance() {
        System.out.println("Kilo-meter to meters:" + d.kmToMeter(km));
        System.out.println("Meters to Kilo-meters:" + d.meterToKM(meter));
    }

    void getTimeInput() {
        System.out.println("Enter the hours");
        hours = obj.nextInt();
        System.out.println("Enter the minutes");
        minutes = obj.nextInt();
        System.out.println("Enter the seconds");
        seconds = obj.nextInt();
    }

    TimeConversion t = new TimeConversion();

    void conTime() {
        if (minutes <= 60 && seconds <= 60)
            System.out.println("Hours, Minutes & Seconds to Seconds:"
                    + t.hrsMinsSecsToSecs(hours, minutes, seconds));
        else {
            System.out.println("Hours to Minutes:" + t.hrsToMins(hours));
            System.out.println("Hours to Seconds:" + t.hrsToSecs(hours));
            System.out.println("Minutes to Hours:" + t.minsToHrs(minutes));
            System.out.println("Seconds to Hours:" + t.secsToHrs(seconds));
        }
    }

    public static void main(String arg[]) {
        DEMOCDT obj = new DEMOCDT();
        obj.getCurrencyInput();
        obj.conCurrency();
        obj.getDistanceInput();
        obj.conDistance();
        obj.getTimeInput();
        obj.conTime();
    }
}
