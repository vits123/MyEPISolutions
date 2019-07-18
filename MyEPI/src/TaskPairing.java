/* Optimum Task Assignment using Greedy Approach
    Time Complexity- O(nlgN)
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TaskPairing {

  static class PairedTasks {

    private Integer task1;
    private Integer task2;

    private PairedTasks(Integer task1, Integer task2) {
      this.task1 = task1;
      this.task2 = task2;
    }

    @Override
    public String toString() {
      return "PairedTasks{" + "task1=" + task1 + ", task2=" + task2 + '}';
    }
  }

  private static List<PairedTasks> optimumTaskAssignment(List<Integer> taskDurations) {
    Collections.sort(taskDurations);
    List<PairedTasks> optimumAssignments = new ArrayList<>();

    for (int i = 0, j = taskDurations.size() - 1; i < j; ++i, --j) {
      optimumAssignments.add(new PairedTasks(taskDurations.get(i), taskDurations.get(j)));
    }
    return optimumAssignments;
  }

  public static void main(String[] args) {
    List<Integer> otask = new ArrayList<>();
    otask.add(5);
    otask.add(2);
    otask.add(1);
    otask.add(6);
    otask.add(4);
    otask.add(4);
    System.out.println(optimumTaskAssignment(otask));
  }
}
