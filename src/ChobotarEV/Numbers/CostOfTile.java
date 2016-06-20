package ChobotarEV.Numbers;

import java.util.Scanner;

/*
    Calculate the total cost of tile it would take to cover a floor plan of width and height, 
using a cost entered by the user.
*/
public class CostOfTile {
    private final float floorWidth,
                        floorHeight,
                        tileWidth,
                        tileHeight,
                        costOfTile;

    public CostOfTile() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter floor width(m): " ); this.floorWidth  = scanner.nextFloat();
        System.out.println("Enter floor height(m): "); this.floorHeight = scanner.nextFloat();
        System.out.println("Enter tile width(m): "  ); this.tileWidth   = scanner.nextFloat();
        System.out.println("Enter tile height(m): " ); this.tileHeight  = scanner.nextFloat();
        System.out.println("Enter tile cost:($) "   ); this.costOfTile  = scanner.nextFloat();
        scanner.close();
        System.out.println("Cost: " + calculateCost() + "$");
    }
    
    private double calculateCost(){
        float sFloor     = this.floorHeight * this.floorWidth,
              sTile      = this.tileHeight  * this.tileWidth;
        int   numOfTiles = (int)Math.floor(sFloor / sTile);
        return costOfTile * numOfTiles;
    }
}
