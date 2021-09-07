package coding;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * https://www.geeksforgeeks.org/find-maximum-meetings-in-one-room/
 * https://www.youtube.com/watch?v=II6ziNnub1Q&list=PLgUwDviBIf0p4ozDR_kJJkONnb1wdx2Ma&index=45&ab_channel=takeUforward
 */
public class NMeetingsInRoom {

    public static void main(String[] args) {

        int[] startTimings = {1, 3, 0, 5, 8, 5};
        int[] endTimings = {2, 4, 6, 7, 9, 9};

        ArrayList<Meeting> meetings = new ArrayList<>();
        for (int i = 0; i < startTimings.length; i++) {
            meetings.add(new Meeting(startTimings[i], endTimings[i], i + 1));
        }

        Collections.sort(meetings, new MeetingComparator());

        ArrayList<Integer> output = new ArrayList<>();

        // Initially select first meeting.
        output.add(meetings.get(0).pos);
        int timeLimit = meetings.get(0).end;
        for(int i = 1; i < meetings.size(); i++) {
            if(meetings.get(i).start > timeLimit) {
                output.add(meetings.get(i).pos);
                timeLimit = meetings.get(i).end;
            }
        }

        System.out.println(output);

    }
}

class Meeting {

    int start;
    int end;
    int pos;

    public Meeting(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class MeetingComparator implements Comparator<Meeting> {

    @Override
    public int compare(Meeting o1, Meeting o2) {
        if(o1.end < o2.end) {
            return -1;
        } else if(o1.end > o2.end) {
            return 1;
        } else if(o1.pos < o2.pos) {
            return -1;
        } else {
            return 1;
        }
    }
}
