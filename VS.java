
package vs;

import java.util.*;
import java.io.*;
public class VS{
    public static void main(String[] args) {      
        ArrayList av=new ArrayList ();
        ArrayList rt=new ArrayList ();
        av.add("KADHAIPPOMA");
        av.add("KURUMUGIL");
        av.add("KURUNCHIRAGHU");
        av.add("THENMOZHI");
        av.add("MAYAKAMAA");
        av.add("MARUVAARTHAI");
        av.add("NILAYO");
        av.add("BAE");
        av.add("THANGAMAE");
        av.add("MUNDHINAM");
        av.add("MALARE");
        av.add("MAYILAANJIYE");
        av.add("ADIYE");
        av.add("SENJITALEY");
        av.add("JALABULAJANGU");
        av.add("RANJITHAME");
        av.add("ORASAADHA");
        av.add("SENTHOORA");
        av.add("CHELLAMMA");
        av.add("ADIPOLI");
        Scanner s=new Scanner(System.in);
        ArrayList av1 = new ArrayList(); 
        av1 = (ArrayList)av.clone();
        String b;
        System.out.println(PURPLE_BOLD+"\t\t\t\tTeam-3 Video Song Store:"+RESET);
        System.out.println(CYAN+"\t\t\t\tWelcome To Team-3 Video Song Store"+RESET);
        System.out.println(GREEN+"\t\t\t\tWhat do you want Sir/Madam?"+RESET);
        char ch='y';
        while(ch=='y'){
            System.out.println(YELLOW+"1.See the available Video Songs to get"+RESET);
            System.out.println(YELLOW+"2.Rent a Video"+RESET);
            System.out.println(YELLOW+"3.Return a Video"+RESET);
            System.out.println(RED+"4.Exit"+RESET);
            System.out.print(GREEN+"Enter Your Choice:"+RESET);
            int choice=0;            
            try{
                choice=s.nextInt();
            }
            catch(Exception o){
                System.out.println(RED+"InputMismatchError"+RESET);                 
            }            
            System.out.print("\n");
            if(choice==1){
                for(int i=0;i<av.size();i++){
                    Object curr=av.get(i);
                    System.out.print(i+1+".");
                    System.out.print(CYAN+curr+RESET);
                    System.out.print("\n");
                }                                   
            }
            else if(choice==2){
                System.out.println(PURPLE+"NOTE:Only one song can be rented at a time.So after renting one song,again press the 'RENT' option to rent another song"+RESET);
                System.out.println(GREEN+"Enter the Video Song Name you want to rent:"+RESET);
                int  video=0;
                try{
                    video=s.nextInt();
                }
                catch(Exception o){
                    System.out.println(RED+"InputMismatchError"+RESET);
                
                }                
                
                
                if(video>0&&video<=20){
                 int songno;
                 songno=video-1; 
        
                 System.out.println(CYAN+"\nYou have rented the  video song   : "+av.get(songno)+RESET);
                 
                 av.remove(songno);
                 
                System.out.println("\nThe available songs  :");
                   for (int i=0; i<av.size(); i++) {
                                Object current = av.get(i);
                                System.out.print(i+1+".");
                                System.out.println(CYAN+current+RESET);
                   }
                 Object a;
                 a=av.get(songno);
                 rt.add(a);
                 
                }
               else{
                   System.out.println("This video song is not available in the store");
                  
                   break;
               }
            }
            else if(choice==3){
                System.out.println(YELLOW+"1.See the numbers of the Video Song(s) you should return to store"+RESET);
                System.out.println(YELLOW+"2.Return the Video Song by entering the number "+RESET);
                System.out.print(GREEN+"Enter the Choice:"+RESET);
                int choice2=0;            
                try{
                    choice2=s.nextInt();
                }
                catch(Exception o){
                    System.out.println(RED+"InputMismatchError"+RESET);                
                }
                if(choice2==1){
                    if(rt.size()>0){
                        for(int i=0;i<rt.size();i++){
                        Object curr=rt.get(i);
                        System.out.println(i+1+".");
                        System.out.println(CYAN+curr+RESET);                           
                        }
                    }
                    else{
                        System.out.println("\n"+"Currently you have not borrowed any songs from our store");
                    }
                }
                else if(choice2==2){
                    System.out.println(PURPLE+"NOTE:Only one song can be returned at a time.So after returning one song,again press the 'RETURN' option to return another song"+RESET);
                    System.out.println(GREEN+"Enter the Video Song number to be returned:"+RESET);
                    int ret=0;
                    try{
                        ret=s.nextInt();
                    }
                    catch(Exception o){
                    System.out.println(RED+"InputMismatchError"+RESET);                   
                    }
                     
                    if(ret>0&&ret<=rt.size()){
                        Object a;
                        a=av.get(ret);
                        rt.add(a);
                 
                        
                        System.out.println("You have returned the video song "+CYAN+a+RESET);
                        rt.remove(ret);
                        av.add(a);
                    }
                    else{
                        System.out.println(RED+"You have entered Invalid Chioce "+RESET);
                    }
                }
                else{
                    System.out.println(RED+"You have entered the invalid choice"+RESET);
                break;
                }
            }
            else if(choice==4){
                System.out.println(GREEN+"Thank you for contacting our store"+RESET);
                break;
            }
            else{
                System.out.println(RED+"You have entered the invalid choice"+RESET);
                break;
            }                      
        }
        System.out.println(GREEN+"Do you want to continue?Then run the program again"+RESET);
        System.out.println(GREEN+"Thank You"+RESET);                       
    } 
    // Reset
    public static final String RESET = "\033[0m";  // Text Reset

    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE
    public static final String PURPLE = "\033[0;35m";  // PURPLE
    public static final String CYAN = "\033[0;36m";    // CYAN
    

    // Bold
   
    public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
   
}



