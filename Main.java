class BusStop {
    String stopName;
    BusStop next;
    BusStop(String stopName) {
        this.stopName = stopName;
        this.next = null;
    }
}
class BusRoute {
    BusStop head;
    public void addStop(String stopName) {
        BusStop newStop = new BusStop(stopName);

        if (head == null) {
            head = newStop;
            return;
        }
        BusStop temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newStop;
    }
    public void displayRoute() {

        BusStop temp = head;

        while (temp != null) {
            System.out.print(temp.stopName);

            if (temp.next != null) {
                System.out.print(" -> ");
            }

            temp = temp.next;
        }

        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {

        BusRoute route = new BusRoute();

        route.addStop("Madanapalle");
        route.addStop("Tirupati");
        route.addStop("Chittoor");
        route.addStop("Vellore");

        System.out.println("Bus Route:");
        route.displayRoute();
    }
}