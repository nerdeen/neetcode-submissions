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
    public int minMeetingRooms(List<Interval> intervals) {

        PriorityQueue<Interval> meetings=new PriorityQueue<>(
            (a, b) -> Integer.compare(a.start, b.start)
        );
        PriorityQueue<Interval> existingmeetings=new PriorityQueue<>(
            (a, b) -> Integer.compare(a.end, b.end)
        );
        int rooms=0;

        for(Interval item:intervals){
            meetings.offer(item);
        }
        while(!meetings.isEmpty()){
            Interval item = meetings.poll();
            while( ( !existingmeetings.isEmpty() ) && ( existingmeetings.peek().end<=item.start ) ){
                    existingmeetings.poll();
            }
            existingmeetings.offer(item);
            rooms=Math.max(rooms,existingmeetings.size());
        }
        return Math.max(rooms,existingmeetings.size());
    }
}
