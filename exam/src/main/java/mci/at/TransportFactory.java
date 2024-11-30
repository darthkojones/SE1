package mci.at;

public class TransportFactory {
    public static Transport getTransport(String transportType) {
        switch (transportType) {
            case "Taxi":
                return new Taxi();
            case "Motorbike":
                return new Motorbike();
            case "Vaporetto":
                return new Vaporetto();
            case "Helicopter":
                return new Helicopter();
            //adding the newly created transport for mars option
            case "UFO":
                return new UFO();    
            default:
                throw new IllegalArgumentException("ain't got that on offer");
        }
    }
}