class Solution {
    public String intToRoman(int num) {
     
             StringBuilder result = new StringBuilder();

        if(num >= 3000){
            result.append("MMM");
            num-=3000;
        }
        
        if(num >= 2000){
            result.append("MM");
            num-=2000;
        }
        
         if(num >= 1000){
            result.append("M");
            num-=1000;
        }

        if(num >= 900){
            result.append("CM");
            num-=900;
        }

        if(num >= 500){
            result.append("D");
            num-=500;
        }

        if(num >= 400){
            result.append("CD");
            num -= 400;
        }

        if(num >= 300){
            result.append("CCC");
            num -= 300;
        }

        if(num >= 200){
            result.append("CC");
            num -= 200;
        }

        if(num >= 100){
            result.append("C");
            num -= 100;
        }

        if(num >= 90){
            result.append("XC");
            num -= 90;
        }

        if(num >= 50){
            result.append("L");
            num -= 50;
        }

        if(num >= 40){
            result.append("XL");
            num -= 40;
        }
        
        if(num >= 30){
            result.append("XXX");
            num -= 30;
        }  

        if(num >= 20){
            result.append("XX");
            num -= 20;
        }  

        if(num >= 10){
            result.append("X");
            num -= 10;
        }    

        if(num >= 9){
            result.append("IX");
            num -= 9;
        }  

        if(num >= 5){
            result.append("V");
            num -= 5;
        }    

        if(num >= 4){
            result.append("IV");
            num -= 4;
        }   

        if(num >= 3){
            result.append("III");
            num -= 3;
        }   

        if(num >= 2){
            result.append("II");
            num -= 2;
        }   

        if(num >= 1){
            result.append("I");
            num -= 1;
        }   
        return result.toString();
    }

    }