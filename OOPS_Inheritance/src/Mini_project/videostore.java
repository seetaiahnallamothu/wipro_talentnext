package Mini_project;
import java.util.ArrayList;
public class videostore {
	public class videoStore {
	    private ArrayList<video> store = new ArrayList<>();

	    public void addVideo(String name) {
	        store.add(new video(name));
	        System.out.println("Video added: " + name);
	    }

	    public void doCheckout(String name) {
	        for (video video : store) {
	            if (video.getName().equalsIgnoreCase(name)) {
	                video.doCheckout();
	                System.out.println("Video checked out: " + name);
	                return;
	            }
	        }
	        System.out.println("Video not found: " + name);
	    }

	    public void doReturn(String name) {
	        for (video video : store) {
	            if (video.getName().equalsIgnoreCase(name)) {
	                video.doReturn();
	                System.out.println("Video returned: " + name);
	                return;
	            }
	        }
	        System.out.println("Video not found: " + name);
	    }

	    public void receiveRating(String name, int rating) {
	        for (video video : store) {
	            if (video.getName().equalsIgnoreCase(name)) {
	                video.receiveRating(rating);
	                System.out.println("Rating " + rating + " has been assigned to " + name);
	                return;
	            }
	        }
	        System.out.println("Video not found: " + name);
	    }

	    public void listInventory() {
	        System.out.println("\n--- Video Inventory ---");
	        for (video video : store) {
	            System.out.println("Name: " + video.getName() +
	                               " | Checked Out: " + video.getCheckout() +
	                               " | Rating: " + video.getRating());
	        }
	    }
	}




}
