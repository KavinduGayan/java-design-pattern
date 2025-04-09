package structural.adapter;

public class AdapterMain {
    /**
     * Here is the example to adapter for USB cable to convert to the type c
     * @param args
     */
    public static void main(String[] args) {
        USBToCTypeAdapter adapter = new USBToCTypeAdapter(new USBCable());
        adapter.plug();
    }
}
