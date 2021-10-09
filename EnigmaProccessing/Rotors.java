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
public class Rotors {
    
    public Rotors(){//just here do i don't have to deal with the java shit i wouldn't normally death with in c#
    }
    
    public int proccess1(int input, int rotorKey){ //note cannot do adding/substracting due to risks of 0s
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 1:
                return 5;
            case 2:
                return 11;
            case 3:
                return 13;
            case 4:
                return 6;
            case 5:
                return 12;
            case 6:
                return 7;
            case 7:
                return 4;
            case 8:
                return 17;
            case 9:
                return 22;
            case 10:
                return 26;
            case 11:
                return 14;
            case 12:
                return 20;
            case 13:
                return 15;
            case 14:
                return 23;
            case 15:
                return 25;
            case 16:
                return 8;
            case 17:
                return 24;
            case 18:
                return 21;
            case 19:
                return 19;
            case 20:
                return 16;
            case 21:
                return 1;
            case 22:
                return 9;
            case 23:
                return 2;
            case 24:
                return 18;
            case 25:
                return 3;
            case 26:
                return 10;
                
            default:
                return -1;
        }
    }
    public int proccess2(int input, int rotorKey){
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 1:
                return 1;
            case 2:
                return 10;
            case 3:
                return 4;
            case 4:
                return 11;
            case 5:
                return 19;
            case 6:
                return 9;
            case 7:
                return 18;
            case 8:
                return 21;
            case 9:
                return 24;
            case 10:
                return 2;
            case 11:
                return 12;
            case 12:
                return 8;
            case 13:
                return 23;
            case 14:
                return 20;
            case 15:
                return 13;
            case 16:
                return 3;
            case 17:
                return 17;
            case 18:
                return 7;
            case 19:
                return 26;
            case 20:
                return 14;
            case 21:
                return 16;
            case 22:
                return 25;
            case 23:
                return 6;
            case 24:
                return 22;
            case 25:
                return 15;
            case 26:
                return 5;
                
            default:
                return -1;
        }
    }
    public int proccess3(int input, int rotorKey){
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 6;
            case 4:
                return 8;
            case 5:
                return 10;
            case 6:
                return 12;
            case 7:
                return 3;
            case 8:
                return 16;
            case 9:
                return 18;
            case 10:
                return 20;
            case 11:
                return 24;
            case 12:
                return 22;
            case 13:
                return 26;
            case 14:
                return 14;
            case 15:
                return 25;
            case 16:
                return 5;
            case 17:
                return 9;
            case 18:
                return 23;
            case 19:
                return 7;
            case 20:
                return 1;
            case 21:
                return 11;
            case 22:
                return 13;
            case 23:
                return 21;
            case 24:
                return 19;
            case 25:
                return 17;
            case 26:
                return 15;
                
            default:
                return -1;
        }
    }
    public int reflect(int input){
        switch(input){
            case 1:
                return 17;
            case 2:
                return 25;
            case 3:
                return 8;
            case 4:
                return 15;
            case 5:
                return 7;
            case 6:
                return 14;
            case 7:
                return 5;
            case 8:
                return 3;
            case 9:
                return 22;
            case 10:
                return 16;
            case 11:
                return 21;
            case 12:
                return 26;
            case 13:
                return 20;
            case 14:
                return 6;
            case 15:
                return 4;
            case 16:
                return 10;
            case 17:
                return 1;
            case 18:
                return 24;
            case 19:
                return 23;
            case 20:
                return 13;
            case 21:
                return 11;
            case 22:
                return 9;
            case 23:
                return 19;
            case 24:
                return 18;
            case 25:
                return 2;
            case 26:
                return 12;
            
            default:
                return -1;
        }
    }
    public int proccess3R(int input, int rotorKey){
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 2:
                return 1;
            case 4:
                return 2;
            case 6:
                return 3;
            case 8:
                return 4;
            case 10:
                return 5;
            case 12:
                return 6;
            case 3:
                return 7;
            case 16:
                return 8;
            case 18:
                return 9;
            case 20:
                return 10;
            case 24:
                return 11;
            case 22:
                return 12;
            case 26:
                return 13;
            case 14:
                return 14;
            case 25:
                return 15;
            case 5:
                return 16;
            case 9:
                return 17;
            case 23:
                return 18;
            case 7:
                return 19;
            case 1:
                return 20;
            case 11:
                return 21;
            case 13:
                return 22;
            case 21:
                return 23;
            case 19:
                return 24;
            case 17:
                return 25;
            case 15:
                return 26;
                
            default:
                return -1;
        }
    }
    public int proccess2R(int input, int rotorKey){
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 1:
                return 1;
            case 10:
                return 2;
            case 4:
                return 3;
            case 11:
                return 4;
            case 19:
                return 5;
            case 9:
                return 6;
            case 18:
                return 7;
            case 21:
                return 8;
            case 24:
                return 9;
            case 2:
                return 10;
            case 12:
                return 11;
            case 8:
                return 12;
            case 23:
                return 13;
            case 20:
                return 14;
            case 13:
                return 15;
            case 3:
                return 16;
            case 17:
                return 17;
            case 7:
                return 18;
            case 26:
                return 19;
            case 14:
                return 20;
            case 16:
                return 21;
            case 25:
                return 22;
            case 6:
                return 23;
            case 22:
                return 24;
            case 15:
                return 25;
            case 5:
                return 26;
                
            default:
                return -1;
        }
    }
    public int proccess1R(int input, int rotorKey){ //note cannot do adding/substracting due to risks of 0s
        input += rotorKey - 1;
        if(input > 26){
            input -= 26;
        }
        switch(input){
            case 5:
                return 1;
            case 11:
                return 2;
            case 13:
                return 3;
            case 6:
                return 4;
            case 12:
                return 5;
            case 7:
                return 6;
            case 4:
                return 7;
            case 17:
                return 8;
            case 22:
                return 9;
            case 26:
                return 10;
            case 14:
                return 11;
            case 20:
                return 12;
            case 15:
                return 13;
            case 23:
                return 14;
            case 25:
                return 15;
            case 8:
                return 16;
            case 24:
                return 17;
            case 21:
                return 18;
            case 19:
                return 19;
            case 16:
                return 20;
            case 1:
                return 21;
            case 9:
                return 22;
            case 2:
                return 23;
            case 18:
                return 24;
            case 3:
                return 25;
            case 10:
                return 26;
                
            default:
                return -1;
        }
    }
    
}
