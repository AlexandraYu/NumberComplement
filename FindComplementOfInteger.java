import java.lang.Integer;
import java.lang.Math; 
public class FindComplementOfInteger{
    public static int findComplement(int num) {
        String binaryString = Integer.toBinaryString(num); 
        int power=0, answer=0; 
        for(int i = binaryString.length()-1; i>0; i--) {
            if(binaryString.charAt(i) == '0') { //normally '1' is the binary digit that we need to apply exponential power and add up, but here since we're looking for the "complement," 1 becomes 0, and 0 becomes 1. 
                answer = answer+(int)Math.pow(2, power); 
            }
            power++; 
        }
        return answer; 
    }
     public static void main(String []args){
        int solution = findComplement(5); 
        System.out.println("Answer is "+solution);
     }
}
