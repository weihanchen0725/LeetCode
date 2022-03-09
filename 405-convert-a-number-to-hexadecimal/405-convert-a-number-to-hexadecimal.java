class Solution {
    public String toHex(int num) {
        // Safety 
        if(num == 0)
        {
            return "0";
        }
        
        int defVal = 0;
        
        // if the num is negative
        // using twos complement  
        if(num < 0)
        {
            num = (-1 * num) - 1;
            defVal = 15;
        }
        
        String ans = convertToHex(num, defVal);
        
        return ans; 
        
    } // end of toHex method 
    
    private String convertToHex(int num, int defVal)
    {
        char[] charArray = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b','c','d','e','f'};
        StringBuilder ans = new StringBuilder();
        
        while(num > 0)
        {
            int result = num % 16;
            
            if(defVal > 0)
            {
                result = defVal - num % 16;
            }
            
            ans.append(charArray[result]);
            
            // decrement the num 
            num = num / 16;
        } // end of while loop
        
        if(defVal > 0)
        {
            while(ans.length() < 8)
            {
                ans.append(charArray[defVal]);
            }
        }
        
        return ans.reverse().toString();
    } // end of convertToHex method 
} // end of Solution class