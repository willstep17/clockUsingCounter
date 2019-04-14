import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        BoundedCounter seconds = new BoundedCounter(59);
        BoundedCounter minutes = new BoundedCounter(59);
        BoundedCounter hours = new BoundedCounter(23);
        
        System.out.print("Seconds: ");
        int s = Integer.parseInt(reader.nextLine());
        System.out.print("Minutes: ");
        int m = Integer.parseInt(reader.nextLine());
        System.out.print("Hours: ");
        int h = Integer.parseInt(reader.nextLine());
        
        seconds.setValue(s);
        minutes.setValue(m);
        hours.setValue(h);
        

        int i = 0;
        while(i < 121) {
            System.out.println(hours + ":" + minutes + ":" + seconds);
            seconds.next();
            
            if(seconds.getValue() == 0) {
                minutes.next();
                if(minutes.getValue() == 0) {
                    hours.next();
                }
            }
            i++;
        }
    }
}