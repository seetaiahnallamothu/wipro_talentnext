package Mini_project;
import java.util.Scanner;

import Mini_project.video.Video;
public class video {
	
	// Video class
	class Video {
	    private String videoName;
	    private boolean checkout;
	    private int rating;

	    public Video(String name) {
	        this.videoName = name;
	        this.checkout = false;
	        this.rating = 0;
	    }

	    public String getName() {
	        return videoName;
	    }

	    public void doCheckout() {
	        this.checkout = true;
	    }

	    public void doReturn() {
	        this.checkout = false;
	    }

	    public void receiveRating(int rating) {
	        this.rating = rating;
	    }

	    public int getRating() {
	        return rating;
	    }

	    public boolean getCheckout() {
	        return checkout;
	    }
	}

	// VideoStore class
	class VideoStore {
	    private Video[] store = new Video[100];
	    private int count = 0;

	    public void addVideo(String name) {
	        store[count++] = new Video(name);
	        System.out.println("Video \"" + name + "\" added successfully.");
	    }

	    public void doCheckout(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].doCheckout();
	                System.out.println("Video \"" + name + "\" checked out.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void doReturn(String name) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].doReturn();
	                System.out.println("Video \"" + name + "\" returned.");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void receiveRating(String name, int rating) {
	        for (int i = 0; i < count; i++) {
	            if (store[i].getName().equalsIgnoreCase(name)) {
	                store[i].receiveRating(rating);
	                System.out.println("Rating " + rating + " has been mapped to the Video \"" + name + "\".");
	                return;
	            }
	        }
	        System.out.println("Video not found.");
	    }

	    public void listInventory() {
	        System.out.println("\n--- Inventory ---");
	        for (int i = 0; i < count; i++) {
	            System.out.println("Name: " + store[i].getName() + 
	                               " | Checked Out: " + store[i].getCheckout() +
	                               " | Rating: " + store[i].getRating());
	        }
	        if (count == 0) {
	            System.out.println("No videos in inventory.");
	        }
	    }
	}

	// VideoLauncher class (Main)
	public class VideoLauncher {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        VideoStore store = new VideoStore();
	        videostore video=store.new videostore();
	        int choice;

	        do {
	            System.out.println("\n--- Video Store Menu ---");
	            System.out.println("1. Add Video");
	            System.out.println("2. Check Out Video");
	            System.out.println("3. Return Video");
	            System.out.println("4. Receive Rating");
	            System.out.println("5. List Inventory");
	            System.out.println("6. Exit");
	            System.out.print("Enter your choice: ");

	            choice = scanner.nextInt();
	            scanner.nextLine(); // consume newline

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter video name to add: ");
	                    String addName = scanner.nextLine();
	                    store.addVideo(addName);
	                    break;
	                case 2:
	                    System.out.print("Enter video name to check out: ");
	                    String checkoutName = scanner.nextLine();
	                    store.doCheckout(checkoutName);
	                    break;
	                case 3:
	                    System.out.print("Enter video name to return: ");
	                    String returnName = scanner.nextLine();
	                    store.doReturn(returnName);
	                    break;
	                case 4:
	                    System.out.print("Enter video name to rate: ");
	                    String rateName = scanner.nextLine();
	                    System.out.print("Enter rating (1-10): ");
	                    int rating = scanner.nextInt();
	                    store.receiveRating(rateName, rating);
	                    break;
	                case 5:
	                    store.listInventory();
	                    break;
	                case 6:
	                    System.out.println("Thank you for using the Video Rental System!");
	                    return;
	                default:
	                    System.out.println("Invalid choice. Please try again.");
	            }
	        } while (true);
	    }
	}
}
