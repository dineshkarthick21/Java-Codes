import java.util.*;

class Activity {
    int start, finish;

    Activity(int s, int f) {
        start = s;
        finish = f;
    }
}

public class ActivitySelectionGreedy {

    public static void main(String[] args) {

        int[] start = {1, 3, 0, 5, 4, 8, 5};
        int[] finish = {2, 4, 6, 7, 9, 9, 9};

        int n = start.length;

        Activity[] activities = new Activity[n];

        for (int i = 0; i < n; i++) {
            activities[i] = new Activity(start[i], finish[i]);
        }

        // Sort based on finish time
        Arrays.sort(activities, (a, b) -> a.finish - b.finish);

        System.out.println("Selected Activities:");

        int count = 1;
        System.out.println(activities[0].start + " " + activities[0].finish);

        int lastFinish = activities[0].finish;

        for (int i = 1; i < n; i++) {

            if (activities[i].start >= lastFinish) {
                System.out.println(activities[i].start + " " + activities[i].finish);
                lastFinish = activities[i].finish;
                count++;
            }
        }

        System.out.println("Maximum number of activities = " + count);
    }
}

// Input:
// start  = {1, 3, 0, 5, 4, 8, 5}
// finish = {2, 4, 6, 7, 9, 9, 9}
// Output:
// Selected Activities:
// 1 2
// 3 4
// 5 7
// 8 9
// Maximum number of activities = 4