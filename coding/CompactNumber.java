package coding;

import java.text.NumberFormat;
import java.util.Locale;

public class CompactNumber {

    public static void main(String[] args)
    {
        NumberFormat fmt = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.LONG);

        System.out.println( fmt.format(100) );
        System.out.println( fmt.format(1000) );
        System.out.println( fmt.format(10000) );
        System.out.println( fmt.format(100000) );

        NumberFormat fmtShort = NumberFormat
                .getCompactNumberInstance(Locale.US, NumberFormat.Style.SHORT);

        fmtShort.setMinimumFractionDigits(3);

        System.out.println( fmtShort.format(100) );
        System.out.println( fmtShort.format(1000) );
        System.out.println( fmtShort.format(12345) );
        System.out.println( fmtShort.format(1000000) );
    }
}
