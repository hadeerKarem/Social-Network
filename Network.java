import java.util.ArrayList;

public class Network {
	ArrayList<User>allUsers;
	
    //Register new users.
	public void register(){
		
	}
	
    //Search for specific user by name.
	public String[] searchByName(){
		String[] info = new String[4];
		return info;
	}
	
    //This function returns a list of mutual friends between 2 users.
	public ArrayList<String> mutualFriends(){
        ArrayList<String> mutualFriends = new ArrayList();
		return mutualFriends;
	}
	
    //This function returns the shortest path between 2 non-friend users
	public ArrayList<String> shortestPath(){
		ArrayList<String> myPath = new ArrayList();
		return myPath;
	}
	
    //This Function Follows 2 criteria on suggesting friends.
    //The first one is: the max number of links between the 2 users should be 5.
    //The seconed is: suggest friends working for the same company.
	public ArrayList<String> suggestFriends(){
		ArrayList<String> suggestedFriends = new ArrayList();
		return suggestedFriends;
	}
	
	public void groups(){
		
	}
}