

import java.util.*;
import edu.duke.*;
/**
 * Write a description of class LogAnalyzer here.
 *
 * @author (Bader Fahoum)
 * @version (2020)
 */
 
public class LogAnalyzer
{
    private ArrayList<LogEntry> records;

    public LogAnalyzer() {
        this.records = new ArrayList<>();
    }

    public void readFile(String filename) {
        FileResource resource = new FileResource(filename);
        for (String line : resource.lines()) {
            LogEntry l = WebLogParser.parseEntry(line);
            this.records.add(l);
        }
    }

    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }


}
