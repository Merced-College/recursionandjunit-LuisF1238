

public class Recurrsion {

public static void main (String[] args){

System.out.println(count8(8));      // Expexted Output:1
System.out.println(count8(818));    // Expexted Output:2
System.out.println(count8(8818));   // Expexted Output:3
System.out.println(count8(123456)); // Expexted Output:0
System.out.println(count8(88888));  // Expexted Output:5
System.out.println(count8(80808));  // Expexted Output:3
System.out.println();
System.out.println(countHi("xxhixx"));  //Expected Output: 1   
        System.out.println(countHi("xhixhix"));  //Expected Output: 2   
        System.out.println(countHi("hi"));  //Expected Output: 1   

}

public static int count8(int n) {

    //Base case: if n is 0, there are no digits to count
if(n == 0){
    return 0;
}



int rightmostDigit = n % 10;

if(rightmostDigit == 8){
    return 1 + count8(n / 10);

} else{
    return count8(n/10);
}

}   //end methdod

public static int countHi(String str){
    //check for null
    if(str == null)
    return 0;
    
    


    if(str.length() < 2){
        return 0;
    }
    
    char char1 = str.charAt(0);
    char char2 = str.charAt(1);

    if(char1 == 'h' && char2 == 'i')
        return 1 + countHi(str.substring(2));
    
        return countHi(str.substring(1));

}   //end method

}
