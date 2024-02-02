package daily_practice.test;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3 {

    public static int minRequired(String targetCourse, String[] courses, String[][][] prereqs) {
        if (courses == null || prereqs == null) {
            return -1;
        }

        Map<String, String[][]> coursePrereqsMap = new HashMap<>();
        for (int i = 0; i < courses.length; i++) {
            coursePrereqsMap.put(courses[i], prereqs[i]);
        }

        Set<String> visited = new HashSet<>();
        return dfs(targetCourse, coursePrereqsMap, visited);
    }

    private static int dfs(String course, Map<String, String[][]> coursePrereqsMap, Set<String> visited) {
        if (!coursePrereqsMap.containsKey(course)) {
            return -1;
        }

        if (visited.contains(course)) {
            return -1; // Detected a cycle, not possible to complete the course
        }

        String[][] prereqs = coursePrereqsMap.get(course);
        if (prereqs.length == 0) {
            return 1; // No prerequisite, only this course is needed
        }

        visited.add(course);
        int minCourses = Integer.MAX_VALUE;
        for (String[] prereqOption : prereqs) {
            int coursesCount = 0;
            for (String prereq : prereqOption) {
                int result = dfs(prereq, coursePrereqsMap, visited);
                if (result == -1) {
                    coursesCount = Integer.MAX_VALUE;
                    break;
                }
                coursesCount += result;
            }
            minCourses = Math.min(minCourses, coursesCount);
        }
        visited.remove(course);

        return minCourses == Integer.MAX_VALUE ? -1 : minCourses + 1;
    }
}
