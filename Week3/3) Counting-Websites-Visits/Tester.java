import java.text.*; 
import java.util.*;
import edu.duke.*;

/**
 * Write a description of Tester here.
 * 
 * @author Bader Fahoum
 * @version (2020)
 */
public class Tester {
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...short-test_log");
        la.printAll();
    }
    
    public void testUniqIPs(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog2_log");
        int uniqueIPs = la.countUniqueIPs();
        System.out.println("There are " + uniqueIPs + " IPs");
    }
    
    public void testHigherStatus(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog1_log");
        ArrayList<LogEntry> higherStatus = la.printAllHigherThanNum(400);
        System.out.println("All the logs with higher status are: " + higherStatus.size());
        for(LogEntry le : higherStatus){
             System.out.println(le);
        }
    }
    
     public void testUniqueIPVisistsOnDay(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog2_log");
        ArrayList<String> uniqueIps = la.uniqueIPVisistsOnDay("Sep 27");
        System.out.println("All the logs visited on this date are: "+ uniqueIps.size()+ " " + uniqueIps.toString());
    }
    
    
    public void testCountUniqueIPsInRange(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog2_log");
        ArrayList<String> uniqueIps = la.countUniqueIPsInRange(200,299);
        System.out.println("All the logs within range of 200-299 are: "+ uniqueIps.size()+ " " + uniqueIps.toString());
        uniqueIps = la.countUniqueIPsInRange(400,499);
        System.out.println("All the logs within range of 300-399 are: "+ uniqueIps.size()+ " " + uniqueIps.toString());
    
    }
    
    public void testCount(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...short-test_log");
        HashMap<String,Integer> counts = la.countVisitsPerIP();
        
        for (String i : counts.keySet()) {
            System.out.println("key: " + i + " value: " +counts.get(i));
        } 
    
    }
    
    public void testipsMostVisits(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog2_log");
        System.out.println(la.ipsMostVisits(la.countVisitsPerIP()));
        
    }
    public void testmostNumberVisitsByIP(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog2_log");
        System.out.println(la.mostNumberVisitsByIP(la.countVisitsPerIP()));
    
    }
    public void testIPsForDays(){
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("...weblog3-short_log");
        HashMap<String,ArrayList<String>> daysIp = la.ipsForDays();
        
        for (String i : daysIp.keySet()) {
            System.out.println("key: " + i + " value: " +daysIp.get(i));
        } 
    
    
    }
    
    public void testDayWithMostIPVists(){
    LogAnalyzer la = new LogAnalyzer();
    la.readFile("...weblog2_log");
    System.out.println("the day with most IP visits is: " + la.dayWithMostIPVisits(la.ipsForDays()));
    
    }
    
    public void testIPsWithMostVistsOnDay(){
    LogAnalyzer la = new LogAnalyzer();
    la.readFile("...weblog2_log");
    System.out.println(la.ipsWithMostVistsOnDay(la.ipsForDays(),"Sep 30"));

    }
}
