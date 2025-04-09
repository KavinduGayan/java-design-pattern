package structural.adapter;
// Adaptee implementation
public class USBCable implements USBType {

    public void plug() {
        System.out.println("Successfully plug usb cable");
    }
    
}
