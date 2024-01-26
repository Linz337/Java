package daily_practice.test;

public class Q3Prerequisites {

    /**
     * Compute the minimum number of courses required to complete
     * `targetCourse`, given a specification of course prequisites.
     * <p>
     *
     * @param targetCourse The name of the target course.
     * @param courses Array of course names.
     * @param prereqs Specification of course prerequisites:
     *   `prereqs[i]` are the prerequisites of `courses[i]`.
     * <p>
     *
     * Each course's prerequisites is an array of arrays of Strings.
     * Each element of this array represents one prerequisite (all of
     * them must be fulfilled), and is an array of course names, such
     * at least one of the courses in this array must be taken to meet
     * the prerequisite.
     * <p>
     *
     * @return The smallest number of courses required to complete the
     *   specified `targetCourse`, including its prerequisites.
     * <p>
     *
     * For example, suppose
     * <p>
     *
     * courses = {
     *   "comp1100", "comp1110", "comp1600", "comp1730", "comp2100", "comp3600"
     * }
     * <p>
     *
     * and
     * <p>
     *
     * prereqs = {
     *   {},                             // comp1100
     *   { {"comp1100", "comp1730"} },   // comp1110
     *   {},                             // comp1600
     *   {},                             // comp1730
     *   { {"comp1110"}, {"comp1100"} }, // comp2100
     *   { {"comp1110"}, {"comp1600"} }  // comp3600
     * }
     * <p>
     *
     * This means comp1100, comp1600, and comp1730 have no prerequisites;
     * comp1110 has one prerequisite, which requires having taken comp1100
     * or comp1730; comp2100 has two prerequisites, which are comp1110 and
     * comp1100; and comp3600 also has two prerequisites, which are comp1110
     * and comp1600.
     * <p>
     *
     * To complete comp1110 requires taking either comp1100 and comp1110,
     * or comp1730 and comp1110; thus, the minimum for comp1110 is 2.
     * <p>
     *
     * To complete comp2100 requires taking either comp1100, comp1110, and
     * comp2100, or comp1730, comp1110, comp1100 and comp2100; thus, the
     * minimum for comp2100 is 3.
     * <p>
     *
     * To complete comp3600 requires taking either comp1100, comp1110,
     * comp1600, and comp3600, or comp1730, comp1110, comp1600 and comp3600;
     * thus, the minimum for comp3600 is 4.
     * <p>
     *
     * If there is no way to complete the prerequisites of the given
     * targetCourse, the method should return -1.
     */
    public static int minRequired(String targetCourse,
                                  String[] courses,
                                  String[][][] prereqs)
    {
        if (courses==null||prereqs==null){
            return -1;
        }
        for (String[][] prereq : prereqs) {

            if (prereq.equals(targetCourse)){
                if (prereq==null){
                    return 0;
                }
            }
        }
        // FIXME: Implement this method
        return 1;
    }

}