package magicCastle;
import java.util.*;
import java.awt.event.KeyAdapter;
import java.util.Random;
public class mainClass extends KeyAdapter
{
   
    // all variables which are used as global from this whole class
    public static String name;
    public static int lowerDamage;
    public static int upperDamage;
    public static int defence;
    public static int hp;
    public static int checker;
    public static int day;
    public static int magicCastle;
    public static int orbPower;
    public static int checkerForDamage = 1;
    public static String[] tableValues = new String[64];
    
    //constructor
     public mainClass()
    {
        // initialize instance variables        
    }
    
    //main method.
    public static void main(String[] args) {
        
        orbPower = 0;
        checker =0;
        magicCastle = 15;
        day = 1;
        
        //set for getting input values
        Scanner sc= new Scanner(System.in);
       
        //for random values.
        Random rand = new Random();
        
        //first initialize all table values with " "
        for(int i=0;i<64;i++){
            tableValues[i] = " ";
        }
        
        //randomly set the orb locations;
            for(int i=0;i<64;i++){
                if(i>=2 && i<60 && tableValues[i]==" "){
                    int j=2+rand.nextInt(60-2+1);
                    tableValues[j]="O";
                }
            }