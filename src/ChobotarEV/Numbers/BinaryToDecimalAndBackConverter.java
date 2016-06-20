package ChobotarEV.Numbers;
/*
Develop a converter to convert a decimal number to binary or a binary number to its decimal equivalent.
*/
public class BinaryToDecimalAndBackConverter {
    
    private String bin;
    private int dec;
    
    public BinaryToDecimalAndBackConverter(int n) {
        System.out.println("Number:\t"+n);
        this.bin = Integer.toString(n,2);   System.out.println("Binary:\t"+bin);
        this.dec = Integer.parseInt(bin,2); System.out.println("Decimal:"+dec);
    }
}
