package nuchangejava;

import java.util.LinkedList;
import java.util.Scanner;
import com.google.gson.Gson;

public class assignment
{
    public static void main(String[] args) 
    {
        LinkedList<Table> list = new LinkedList<Table>();
        Scanner sc = new Scanner(System.in);
        int x = 1;
        String jsonArray;
        do {
            System.out.println("Enter the command");
            String user_command = sc.nextLine();
            String[] command = user_command.split(" ");
            if (command[0].equals("storeurl")) 
            {
                int shortkey = command[1].hashCode();
                Table instance = new Table(shortkey, command[1], 0);
                list.add(instance);
                System.out.println("Stored");
            } 
            else
                if (command[0].equals("get")) 
                {
                    int list_size = list.size();
                    for (int i = 0; i < list_size; i++) 
                    {
                        String value = list.get(i).name;
                        if (value.equals(command[1])) 
                        {
                            list.get(i).count += 1;
                            System.out.println(list.get(i).shortkey + " count incremented");
                            break;
                        }
                    }
                } 
                else
                    if (command[0].equals("count")) 
                    {
                        int list_size = list.size();
                        for (int i = 0; i < list_size; i++) 
                        {
                            String value = list.get(i).name;
                            if (value.equals(command[1])) 
                            {
                                System.out.println(list.get(i).count + " is the count");
                                break;
                            }
                        }
                    }
                    else
                        if (command[0].equals("list")) 
                        {
                            Gson gson = new Gson(); 
                            jsonArray = gson.toJson(list);
                            System.out.println(jsonArray);
                        } 
                        else if (command[0].equals("exit")) 
                        {
                            System.out.println("exiting");
                            x = 0;
                        } 
                        else 
                        {
                            System.out.println("Command is wrong");
                        }
        } while (x == 1);
    }
}