public class Main {

    public static void main(String[] args)
    {
        double d1=cDistance (25,15,23,20);
        double d2=cDistance(23,20,24,21);
        double d3=cDistance(24,21,27,20);
        double d4=cDistance(27,20,19,35);
        double d5=cDistance(19,35,21,46);
        double d6=cDistance(21,46,23,56);
        double d7=cDistance(23,56,25,65);
        double d8=cDistance(25,65,28,70);
        double d9=cDistance(28,70,32,73);
        double d10=cDistance(32,73,34,74);
        double d11=cDistance(34,74,36,74);
        double d12=cDistance(36,74,39,74);

        double tDistance=d1+d2+d3+d4+d5+d6+d7+d8+d9+d10+d11+d12;
        System.out.printf("Total Distance is %f km.",tDistance);
    }

    public static double cDistance(double x1, double y1, double x2, double y2)
    {
        double a = Math.sin((x1-x2)/2)*Math.sin((x1-x2)/2)+ Math.cos(x1)* Math.cos(x2)* Math.sin((y1-y2)/2)*Math.sin((y1-y2)/2);
        double c = 2* Math.atan2(Math.pow(a,1/2),Math.pow(1-a,1/2));
        double r = 6371;
        double d = r* c;
        return d;
    }
}












