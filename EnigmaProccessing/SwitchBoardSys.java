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
public class SwitchBoardSys {
    
    public SwitchBoardSys(){
    }
    
     /**
     * Checks if the Switchboard is a valid set up
     * @param input (String)
     * @return True if the switchboard setup is valid
     */
    public boolean switchBoardCheck(String input){
        
        input = input.toLowerCase(); //ensure consistency
        
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
    public String switchBoardOperation(String input, String switchBoardSetup){
        String output = "";
        
        for (int x = 0; x < input.length(); x++){//loop for going over input
            
            //check and conversion
            if(Character.isUpperCase(input.charAt(x))){switchBoardSetup = switchBoardSetup.toUpperCase();}
            else{switchBoardSetup = switchBoardSetup.toLowerCase();}
            
            for(int y = 0; y < switchBoardSetup.length() && Character.isAlphabetic(input.charAt(x)); y++ ){//loop that goes over the setup
                
                if(input.charAt(x) == switchBoardSetup.charAt(y)){
                        
                    if(y == 0 || Character.isWhitespace(switchBoardSetup.charAt(y-1))){//if the there is a space or behind, use the forward character
                        output += switchBoardSetup.charAt(y+1);
                    }
                    else{
                        output += switchBoardSetup.charAt(y-1);
                    }

                }
                
            }
            
            if(!Character.isAlphabetic(input.charAt(x))){
                output += input.charAt(x);
            }
            
        }
        return output;
    }
    
}
