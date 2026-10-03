import java.util.Scanner ;
public class SolarEnergy_1 {
public static void main(String[] args) { 
System.out.println(" Enter Energy Generated in kWh");
Scanner sc =new Scanner (System.in);
int EnergygeneratedinkWh = sc.nextInt();
if (EnergygeneratedinkWh >=10)
{
System.out.println("Good Energy Generation");
}
else {
System.out.println("Low Energy Generation");
}
}
}

