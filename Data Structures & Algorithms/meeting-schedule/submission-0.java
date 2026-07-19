/**
 * Definition of Interval:
 * public class Interval {
 *     public int start, end;
 *     public Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

class Solution {
    public boolean canAttendMeetings(List<Interval> intervals) {
        PriorityQueue<Interval> meetings=new PriorityQueue<>(
            (a, b) -> Integer.compare(a.start, b.start)
        );
        for(Interval item:intervals){
            meetings.offer(item);
        }
        Interval curr=meetings.poll();
        while (!meetings.isEmpty()){
            Interval next=meetings.poll();
            if (next.start<curr.end){
                return false;
            }
            curr=next;
        }
        return true;
    }
}
