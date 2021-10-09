/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnigmaProccessing;

/**
 *
 * @author Joseph Sun
 */
public class Test {
    
    public static void main(String[] args){
        Rotors r = new Rotors();
        int rotorKey = 1;
        int input = 1;
        System.out.println(input);
        input = r.proccess1(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess2(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess3(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.reflect(input);
        System.out.println(input);
        input = r.proccess3R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess2R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess1R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println("answer: " + input); 
        
        System.out.println("-------");
        System.out.println(input);
        input = r.proccess1(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess2(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess3(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.reflect(input);
        System.out.println(input);
        input = r.proccess3R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess2R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println(input);
        input = r.proccess1R(input, rotorKey); input = quickCheck(input, rotorKey);
        System.out.println("answer: " + input);
        
    }
    
    private static int quickCheck(int input, int rotorKey){
        
        if(input - rotorKey <= 0){
            return 26 + (input - rotorKey + 1);
        }
        else{
            return input - rotorKey + 1;
        }
        
    }
    
}
