import java.util.ArrayList;

public class ActorsAndActresses {
    private ArrayList<String> actor_actress_list=new ArrayList<String>();
    public void print_actors(){
        System.out.println("There are "+actor_actress_list.size()+" actors/actresses in the list.");
        System.out.println("----------ACTORS/ACTRESSES---------");
        for (String a : actor_actress_list){
            System.out.println(actor_actress_list.indexOf(a)+1+". actor/actress :"+a);
        }
    }
    public void add_actor(String newActor){
        actor_actress_list.add(newActor);
        System.out.println(newActor+" has been added into the list.");
    }
    public void edit_actor(int place,String eActor){
        actor_actress_list.set(place-1,eActor);
        System.out.println("Actors/Actresses list has been edited.");
    }
    public void remove_Actor(int place){
        actor_actress_list.remove(place-1);
        System.out.println("Actor is removed from the list.");
    }
    public void search_Actor(String name){
        int position=actor_actress_list.indexOf(name);
        if (position>=0){
            System.out.println("Actor/Actress has been found.");
        System.out.println(name+"'s place is "+position+1+" in the list.");
        }
        else {
            System.out.println(name+" is not in the list!");
        }
    }
}
