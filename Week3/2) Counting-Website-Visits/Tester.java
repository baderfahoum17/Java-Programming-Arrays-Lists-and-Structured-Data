
/**
 * Write a description of class Tester here.
 *
 * @author (Bader Fahoum)
 * @version (2020)
 */

import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }

    public void testLogAnalyzer() {
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog1_log");
        la.printAll();
        System.out.println(la.countUniqueIPs());
        System.out.println(la.uniqueIPVisitsOnDay("Mar 24").size());
        System.out.println(la.countUniqueIPsInRange(200,299));
        la.printAllHigherThanNum(400);
    }
}
