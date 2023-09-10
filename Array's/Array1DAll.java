/** Java program to implement the 1D array, and make the all ooperations menu based */
import java.util.Scanner;
import java.io.IOException;
class Array1DAll
{
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		String ch="NULL";
		int []array = {0};
		int sz=0,i=0;
		do
		{
			System.out.println("-------------------------------------------");
			System.out.println("\t\tSelect form menu.");
			System.out.println("-------------------------------------------");
			System.out.println("[1]   Read new elements");
			System.out.println("[2]   Display the elements vertically");	
			System.out.println("[3]   Display the elements horizontally");
			System.out.println("[4]   Calculate the sum and average of elements");
			System.out.println("[5]   Count the total even numbers");
			System.out.println("[6]   Count the total odd numbers");
			System.out.println("[7]   Calculate the sum of all even numbers");
			System.out.println("[8]   Calculate the sum of all odd numbers");
			System.out.println("[9]   Search a particuleer element");
			System.out.println("[10]  Count the totla number of occurrences of the given element");
			System.out.println("[11]  Sort the elements in Asscending/Descending order");
			System.out.println("[12]  Insert the elements at specified location/position");
			System.out.println("[13]  Delete the given element from specified location/position");
			System.out.println("[14]  Insert element at beginning");
			System.out.println("[15]  Insert element at end");
			System.out.println("[16]  Remove duplicate elements ");
			System.out.println("[17]  Exit");
			System.out.println("-------------------------------------------");

			System.out.print("Enter your choice (1 to 17) : ");
			ch = sc.next();
			
			switch(ch)
			{
				case"1":
				{
					System.out.println("You select, [1]   Read new elements");
					System.out.print("Enter the size of array : ");
					sz = sc.nextInt();
					array = new int[sz];
					System.out.println("Now, enter elements one by one : ");
					for(i = 0;i < sz; i++)
					{
						System.out.print("[E"+(i+1)+"] : ");
						array[i] = sc.nextInt();
					}
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}	
				case "2":
				{
					System.out.println("You select, [2]   Display the elements vertically");
					for(i = 0;i < sz; i++)
						System.out.print(array[i]+" ");
					System.out.println();
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"3":
				{
					System.out.println("You select, [3]   Display the elements horizontally");
					for(i = 0;i < sz; i++)
						System.out.println(array[i]);
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"4":
				{
					System.out.println("You select, [4]   Calculate the sum and average of elements");
					int sum ,avg;sum = avg = 0;
					for(i = 0; i< sz; i++)
						sum +=array[i]; 
					avg = sum/sz;
					System.out.println("Sum : "+sum);
					System.out.println("Average : "+avg);
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"5":
				{
					System.out.println("You select, [5]   Count the total even numbers");
					int econt= 0;
					for(i = 0;i < sz; i++)
					{
						if(array[i] % 2 == 0)
							econt++;
					}
					System.out.println("Total even numbers : "+econt);
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"6":
				{
					System.out.println("You select,[6]   Count the total odd numbers");
					int ocont= 0;
					for(i = 0;i < sz; i++)
					{
						if(array[i] % 2 != 0)
							ocont++;
					}
					System.out.println("Total odd numbers : "+ocont);
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"7":
				{
					System.out.println("You select,[7]   Calculate the sum of all even numbers");
					int esum= 0;
					for(i = 0;i < sz; i++)
					{
						if(array[i] % 2 == 0)
							esum += array[i];
					}
					System.out.println("Sum of total even numbers : "+esum);
					break;
				}
				case"8":
				{
					System.out.println("You select,[8]   Calculate the sum of all odd numbers");
					int osum= 0;
					for(i = 0;i < sz; i++)
					{
						if(array[i] % 2 != 0)
							osum += array[i];
					}
					System.out.println(" Sum of total odd numbers : "+osum);
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"9":
				{
					System.out.println("You select, [9]   Search a particuleer element");
					System.out.print("Enter the element which you wnat to search : ");
					int esearch = sc.nextInt();
					boolean b = false;
					int pos=0;
					for(i = 0;i < sz; i++)
					{
						if(array[i] == esearch)
						{	
							b = true;
							pos = i; 	
						}
					}
					if(b != true)
						System.out.println("Element not found.");
					else
						System.out.println("Element Found at position "+(pos+1));	
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"10":
				{
					System.out.println("You select, [10]  Count the totla number of occurrences of the given element");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"11":
				{
					System.out.println("You select, [11]  Sort the elements in Asscending/Descending order");
					//Asscending order 
					for(i = 0;i < sz; i++)
					{
						for(int j= 0; j < sz; j++)
						{
							if(array[i]<array[j])
							{
								int temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}
					}
					System.out.println("Array elements after sorting :\nDescending order : ");
					for(i = 0; i< sz; i++)
						System.out.print(array[i]+" ");
					//Ascending order
					for(i = 0;i < sz; i++)
					{
						for(int j= 0; j < sz; j++)
						{
							if(array[i]>array[j])
							{
								int temp = array[i];
								array[i] = array[j];
								array[j] = temp;
							}
						}
					}
					System.out.println("\nAsscending order : ");
					for(i = 0; i< sz; i++)
						System.out.print(array[i]+" ");
					System.out.println("\nPress Enter to continue...");
					System.in.read();
					break;
				}
				case"12":
				{
					System.out.println("You select, [12]  Insert the elements at specified location/position");
					System.out.print("Enter the number to be inserted : ");
					int innum = sc.nextInt();
					System.out.print("Enter the position at which the number has to be inserted : ");
					int posins = sc.nextInt();
					for(i = sz-1 ;i >= posins;i --)
						array[i+1] = array[i];
					array[posins] = innum;
					sz++;
					System.out.println("After insertion of "+innum+" is : ");
					for(i = 0;i < sz; i++)
						System.out.print(array[i]+" ");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"13":
				{
					System.out.println("You select, [13]  Delete the given element from specified location/position");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"14":
				{
					System.out.println("You select, [14]  Insert element at beginning");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"15":
				{
					System.out.println("You select, [15]  Insert element at end");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"16":
				{
					System.out.println("You select, [16]  Remove duplicate elements");
					System.out.println("Press Enter to continue...");
					System.in.read();
					break;
				}
				case"17":
				{
					System.exit(0);
					break;
				}
				default:
					System.out.println("Invalid Choice.");
			}

		}while(ch != "17");
		
	}

}