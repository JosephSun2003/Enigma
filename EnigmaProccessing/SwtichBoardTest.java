/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnigmaProccessing;
import java.io.*;
/**
 *
 * @author Joseph Sun
 */
public class SwtichBoardTest {
    
    public static void main(String[] args){
        String switchBoardSetup = "";
        String inputString = "";
        
        try{
            
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            switchBoardSetup = input.readLine();
            inputString = input.readLine();
            input.close();
            
        }catch(IOException e){System.out.println("Input Error");}
        
        if(!switchBoardCheck(switchBoardSetup)){System.out.println("Switch board set up is not valid");}
        
        else{System.out.println(switchBoardOperation(inputString, switchBoardSetup));}
        
    }
    
    /**
     * Checks if the Switchboard is a valid set up
     * @param input (String)
     * @return True if the switchboard setup is valid
     */
    public static boolean switchBoardCheck(String input){
        
        for(int x = 0; x < input.length(); x++){//loop to check the string
            
            // loop that goes down the string start from X and checking if the string is valid as an input
            for(int y = x+1; input.charAt(x) != ' ' && y < input.length(); y++){
                
                if(input.charAt(y) == input.charAt(x)){return false;}//fail condition
                
            }
            
        }//loop end
        
        return true;
    }
    
    /**
     * Purpose: switchboard operation to switch the characters
     * @param input (String input to be translated)
     * @param switchBoardSetup (Set up of Switchboard "ab cd ef")
     * @return output (Translated String)
     */
    public static String switchBoardOperation(String input, String switchBoardSetup){
        String output = "";
        
        for (int x = 0; x < input.length(); x++){//loop for going over input
            
            //check and conversion
            if(Character.isUpperCase(input.charAt(x))){switchBoardSetup = switchBoardSetup.toUpperCase();}
            else{switchBoardSetup = switchBoardSetup.toLowerCase();}
                
            
            for(int y = 0; y < switchBoardSetup.length(); y++ ){//loop that goes over the setup
                
                if(input.charAt(x) == switchBoardSetup.charAt(y)){
                        
                    if(y == 0 || Character.isWhitespace(switchBoardSetup.charAt(y-1))){//if the there is a space or behind, use the forward character
                        output += switchBoardSetup.charAt(y+1);
                    }
                    else{
                        output += switchBoardSetup.charAt(y-1);
                    }

                }
                
            }
            
        }
        return output;
    }
}
