public class homeappliancesstore {
    static String  onomaetairias ;
    static String  dieuthinsh ;
    static int plithos ;

    public static int deviceCounter = 0;

    public static void main(String[]args)
    {

        AirCondition AirCondition = new AirCondition();
        Fridge Fridge = new Fridge();
        Oven Oven = new Oven();
        WashingMachine WashingMachine = new WashingMachine();

        System.out.print("........AirCondition........"+ '\n');
        AirCondition.PrintDetails();
        System.out.print('\n' +"........Fridge........"+ '\n');
        Fridge.PrintDetails();
        System.out.print('\n' +"........Oven........"+ '\n');
        Oven.PrintDetails();
        System.out.print('\n' +"........WashingMachine........"+ '\n' );
        WashingMachine.PrintDetails();

        System.out.print( '\n' + "........DeviceCounter........"+ '\n');
        System.out.println("Devices:"+ " " + deviceCounter);
        System.out.print( '\n' + " " + '\n' + " " + '\n' + "........Homeappliancesstore........"+ '\n');
        getset antikeimeno = new getset();
        antikeimeno.setOnomaetairias(args[0]);
        antikeimeno.setDieuthinsh(args[1]);
        antikeimeno.setPlithos(Integer.parseInt(args[2]));
        System.out.println("untitled.src.getset.onoma = " + antikeimeno.getOnomaetairias() + '\n' + "untitled.src.getset.dieunthish = " + antikeimeno.getDieuthinsh() + '\n' + "untitled.src.getset.plithos = " + antikeimeno.getPlithos());
        onomaetairias = args[0];
        dieuthinsh = args[1];
        plithos = Integer.parseInt(args[2]);
        if (onomaetairias == null) {
            System.out.println("lathos onomaetaιrias");
        }
        if (dieuthinsh == null) {
            System.out.println("lathos dieuthinsh");
        }
        System.out.println("onoma = " + onomaetairias + '\n' + "dieunthish = " + dieuthinsh + '\n' + "plithos = " + plithos);
    }

}

