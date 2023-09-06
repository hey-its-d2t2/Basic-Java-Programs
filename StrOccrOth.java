/* Find the locations and count of occurrences of a string in 
another string */


import java.util.Scanner;

class StrOccrOth
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the main string : ");
        String mainString = sc.nextLine();

        System.out.print("Enter the search string  : ");
        String searchString = sc.nextLine();

        int count = 0;
        int index = mainString.indexOf(searchString);

        System.out.println("Locations of occurrences : ");

        while(index != -1)
        {
            System.out.println("Index : "+index);
            count++;
            index = mainString.indexOf(searchString, index+1);
        } 
        if(count > 0)
            System.out.println("The search string ' "+searchString+" ' occurs "+count+" times in the main string.");
        else
            System.out.println("The search string ' "+searchString+" ' does not occur  in the main string.");
    }
}
