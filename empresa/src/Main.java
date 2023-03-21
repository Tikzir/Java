public class Main {
    public static void main(String[] args){
        trabajador trabajador1 = new trabajador("15265", "tom", "mancer", 5000);
        System.out.println(trabajador1.toString());
        supervisor supervisor1 = new supervisor("51838", "sebas", "lope", 35000, 150);
        System.out.println(supervisor1.toString());
        temporal temporal1 = new temporal("68158", "paul", "silvestre", 750, 8);
        System.out.println(temporal1.toString());
    }
}