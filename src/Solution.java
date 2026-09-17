import java.util.ArrayList;

class Interval {
    int start;
    int end;
    Interval() { start = 0; end = 0; }
    Interval(int s, int e) { start = s; end = e; }
}

public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        int i = 0;
        int n = intervals.size();

        while (i < n && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }

        int start = newInterval.start;
        int end = newInterval.end;

        while (i < n && intervals.get(i).start <= end) {
            start = Math.min(start, intervals.get(i).start);
            end = Math.max(end, intervals.get(i).end);
            i++;
        }

        result.add(new Interval(start, end));

        while (i < n) {
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}