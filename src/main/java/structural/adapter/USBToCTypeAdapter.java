package structural.adapter;

// Adapter: adapts USBType to CType
public class USBToCTypeAdapter implements CType {
    private final USBType usbCable;

    public USBToCTypeAdapter (USBType usbCable) {
        this.usbCable = new USBCable();
    }
    @Override
    public void plug() {
        System.out.println("Converting USB to Type-C...");
        usbCable.plug();
    }

}