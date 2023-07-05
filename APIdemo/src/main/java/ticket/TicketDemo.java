package ticket;

public class TicketDemo {
    public static void main(String[] args) {

        Ticket t1 = new Ticket("窗口一号");
        Ticket t2 = new Ticket("窗口二号");
        Ticket t3 = new Ticket("窗口三号");
        t1.start();
        t2.start();
        t3.start();


    }



}
