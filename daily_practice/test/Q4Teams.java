package daily_practice.test;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

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
public class Q4Teams {
    int perID=0;
    int TeamID=0;

    public Q4Teams(){}
    public class Teams{
        public int TeamID;
        public int skill;
        public int size;
        Set<Person> people=new HashSet<>();
        public Teams(int TeamID) {
            this.TeamID = TeamID;
            this.skill = 0;
            this.size=0;
        }
    }


    public class Person{
        public int personID;
        public int Team;
        public int skillLevel;
        boolean allocated;

        public Person(int personID,int skillLevel) {
            this.personID = personID;
            this.skillLevel=skillLevel;
            this.allocated = false;
        }
    }
    Map<Integer,Person> personmap=new HashMap<>();
    Map<Integer,Teams> teamsMap=new HashMap<>();

    /**
     * Add a new person, with a given skill level.
     * The person is initially unallocated (i.e., not in any team).
     * The new person is assigned an id (int) equal to the number
     * of persons previously added (i.e., the first person added
     * gets id 0, the next id 1, and so on).
     * @return The id of the newly added person.
     */
    public int addPerson(int skillLevel) {
        int personID=perID;
        perID++;
        Person person1=new Person(personID,skillLevel);
        personmap.put(personID,person1);
        return personID;
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
        int teamid=TeamID;
        TeamID++;
        Teams team=new Teams(teamid);
        teamsMap.put(teamid,team);
        // FIXME: Implement this method
        return teamid;
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
        if (personmap.containsKey(personId)==false||teamsMap.containsKey(teamId)==false){
            return;
        }
        Person person2=personmap.get(personId);
        if (person2.allocated==false){
            person2.allocated=true;
        }
        else {
            int oriteam=person2.Team;
            Teams team=teamsMap.get(oriteam);
            team.people.remove(person2);
            team.size--;
            team.skill-=person2.skillLevel;
            teamsMap.put(oriteam,team);
        }
        person2.Team=teamId;
        personmap.put(personId,person2);
        Teams team2=teamsMap.get(teamId);
        team2.people.add(person2);
        team2.skill+=person2.skillLevel;
        team2.size++;
        teamsMap.put(teamId,team2);
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
        if (personmap.containsKey(personId)==false||teamsMap.containsKey(teamId)==false){
            return;
        }
        Person person3=personmap.get(personId);
        if (person3.allocated==false){return;}
        if (person3.Team!=teamId){
            return;
        }
        person3.allocated=false;
        person3.Team=-1;
        personmap.put(personId,person3);
        Teams team=teamsMap.get(teamId);
        team.people.remove(person3);
        team.skill-=person3.skillLevel;
        team.size--;
        teamsMap.put(teamId,team);
    }

    /**
     * Set the skill level of an existing person to a new value.
     * If no person with the given id exists, the method should do
     * nothing.
     */
    public void setSkill(int personId, int newSkillLevel) {
//         FIXME: Implement this method
        if (personmap.containsKey(personId)==false){
            return;
        }
        Person person=personmap.get(personId);
        Teams team=teamsMap.get(person.Team);
        team.skill-=person.skillLevel;
        person.skillLevel=newSkillLevel;
        team.skill+=person.skillLevel;
        personmap.put(personId,person);
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
        if (personmap.containsKey(personId)==false||personmap.get(personId).allocated==false){
            return -1;
        }
        return personmap.get(personId).Team;
    }

    /**
     * Return the current size of (i.e., number of members in) the
     * named team.
     * If no time with the given id exists, return -1.
     */
    public int getTeamSize(int teamId) {
        // FIXME: Implement this method
        if (teamsMap.containsKey(teamId)==false){
            return -1;
        }
        Teams team=teamsMap.get(teamId);
        return team.people.size();
//        return teamsMap.get(teamId).people.size();
    }

    /**
     * Return the skill level of the given team. The skill level of a
     * team is equal to the sum of the skill levels of all team members.
     * If no team with the given id exists, return -1.
     */
    public int getTeamSkill(int teamId) {
        // FIXME: Implement this method
        if (teamsMap.containsKey(teamId)==false){
            return -1;
        }
        Teams team=teamsMap.get(teamId);
//        int totallevel=0;
//        for (Person person : team.people) {
//            totallevel+=person.skillLevel;
//        }
        return team.skill;
    }

    /**
     * Return the number of persons who are currenly unallocated (i.e.,
     * not in any team).
     */
    public int getUnallocated() {
        int unnum=0;
        for (Person value : personmap.values()) {
            if (value.allocated==false){
                unnum++;
            }
        }
        // FIXME: Implement this method
        return unnum;
    }

    /**
     * Return the sum of skill levels of all currently unallocated persons.
     */
    public int getTalentReserve() {
        // FIXME: Implement this method
        int unlevels=0;
        for (Person value : personmap.values()) {
            if (value.allocated==false){
                unlevels+=value.skillLevel;
            }
        }
        return unlevels;
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