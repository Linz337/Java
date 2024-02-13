package daily_practice.test;


/**
 * This class tracks the allocation of persons to teams.
 * Each person is assigned an integer id. These are consecutive (i.e.,
 * the first person created gets id 0, the next gets id 1, and so on).
 * Likewise, each team is also assigned an integer id. These are also
 * consecutive (i.e., the first team created gets id 0, the next gets
 * id 1, and so on).
 * <p>
 *
 * A person can be a member of at most one team. If a person that is
 * already in a team is added to another team, they are (automatically)
 * also removed from the team they are currently in.
 * <p>
 *
 * A person can also be removed from their current team, without being
 * reassigned to another team.
 * <p>
 *
 * A person who is not in any team is said to be "unallocated".
 * <p>
 *
 * Each person has a skill level, represented by an integer value.
 * The skill of a team is defined as the sum of the skills of all team
 * members.
 * The sum of the skill levels of all unallocated persons is called the
 * "talent reserve".
 * <p>
 *
 * Level 1: Complete all class methods below. You must complete your
 * implementation in this java file. However, you are allowed to (and
 * indeed encouraged to) define additional methods and/or nested classes
 * within this class if that is useful for your solution, and you must
 * of course add fields as required to implement a solution.
 * A set of tests of the required functionality is provided in Q4TeamsTest.
 * <p>
 *
 * Level 2: Implement all methods (except, optionally, the class'
 * constructor) so that they run in _amortised constant time_.
 * The main method provided in Q4TeamsScalingTest will run tests to measure
 * the scaling behaviour of your implementation.
 * <p>
 *
 * There is no requirement on the absolute running time of your implementation.
 * However, the scaling tests will use large numbers of persons and teams,
 * so if your implementation is too slow, you will not be able to run this
 * test in a reasonable time. You can still run the functionality tests
 * (provided in the test class, Q4TeamsTest).
 */
public class Q4 {

    public Q4() {}


    /**
     * Add a new person, with a given skill level.
     * The person is initially unallocated (i.e., not in any team).
     * The new person is assigned an id (int) equal to the number
     * of persons previously added (i.e., the first person added
     * gets id 0, the next id 1, and so on).
     * @return The id of the newly added person.
     */
    public int addPerson(int skillLevel) {
        // FIXME: Implement this method
        return 0;
    }

    /**
     * Create a new team.
     * The team initially has no members.
     * The team is assigned an id (of type int) that is equal to
     * the number of teams previously created (i.e., the first team
     * gets id 0, the next id 1, and so on).
     * @return The id of the newly created team.
     */
    public int createTeam() {

        // FIXME: Implement this method
        return 0;
    }

    /**
     * Add a person to a team.
     * If either the person or the team does not exist, the method
     * should do nothing (i.e., not modify any person or team).
     * Since a person can only be a member of at most one team, if
     * the named person is already in another team, they are removed
     * from that team.
     */
    public void addToTeam(int personId, int teamId) {
        // FIXME: Implement this method
    }

    /**
     * Remove a person from a team.
     * The person becomes unallocated (i.e., not a member of any team).
     * If either the person or the team does not exist, or if the
     * person is not a member of the named team, the method should
     * do nothing.
     */
    public void removeFromTeam(int personId, int teamId) {
        // FIXME: Implement this method
    }

    /**
     * Set the skill level of an existing person to a new value.
     * If no person with the given id exists, the method should do
     * nothing.
     */
    public void setSkill(int personId, int newSkillLevel) {
        // FIXME: Implement this method
    }

    /**
     * Return the id of the team that the given person is currently
     * in. (Since a person can be a member of at most one team, their
     * current team is unique.)
     * If the id does not correspond to any person, or if person is
     * not a member of any team (i.e., is unallocated) the method
     * should return -1.
     */
    public int getTeam(int personId) {
        // FIXME: Implement this method
        return -1;
    }

    /**
     * Return the current size of (i.e., number of members in) the
     * named team.
     * If no time with the given id exists, return -1.
     */
    public int getTeamSize(int teamId) {
        // FIXME: Implement this method
        return 0;
    }

    /**
     * Return the skill level of the given team. The skill level of a
     * team is equal to the sum of the skill levels of all team members.
     * If no team with the given id exists, return -1.
     */
    public int getTeamSkill(int teamId) {
        // FIXME: Implement this method
        return 0;
    }

    /**
     * Return the number of persons who are currenly unallocated (i.e.,
     * not in any team).
     */
    public int getUnallocated() {
        // FIXME: Implement this method
        return 0;
    }

    /**
     * Return the sum of skill levels of all currently unallocated persons.
     */
    public int getTalentReserve() {
        // FIXME: Implement this method
        return -1;
    }

    /**
     * Return a string representation of the Dictionary object.
     *
     * This method will be used to generate error messages for failing
     * tests. You may change its implementation if you wish (it may help
     * you debug errors in your implementation of the other methods),
     * but implementing it is not requried.
     */
    public String toString() {
        return super.toString();
    }

}