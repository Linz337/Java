package daily_practice.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;



public class Q4TeamsTest {

    @Test
    public void testAddAndMove() {
        Q4Teams teams = new Q4Teams();
        int alice = teams.addPerson(3);
        assertEquals(0, alice, () -> teams.toString() + ".addPerson (1st)");
        int bob = teams.addPerson(2);
        assertEquals(1, bob, () -> teams.toString() + ".addPerson (2nd)");
        int artemis = teams.addPerson(5);
        assertEquals(2, artemis, () -> teams.toString() + ".addPerson (3rd)");
        int baal = teams.addPerson(5);
        assertEquals(3, baal, () -> teams.toString() + ".addPerson (4th)");
        int A_team = teams.createTeam();
        assertEquals(0, A_team, () -> teams.toString() + ".createTeam (1st)");
        int B_team = teams.createTeam();
        assertEquals(1, B_team, () -> teams.toString() + ".createTeam (2nd)");
        assertEquals(-1, teams.getTeam(alice),
                () -> teams.toString() + ".getTeam(" + alice + ")");
        teams.addToTeam(alice, A_team);
        teams.addToTeam(bob, A_team);
        teams.addToTeam(artemis, B_team);
        teams.addToTeam(baal, B_team);
        assertEquals(A_team, teams.getTeam(alice),
                () -> teams.toString() + ".getTeam(" + alice + ")");
        assertEquals(A_team, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
        assertEquals(B_team, teams.getTeam(baal),
                () -> teams.toString() + ".getTeam(" + baal + ")");
        teams.addToTeam(artemis, A_team);
        assertEquals(A_team, teams.getTeam(alice),
                () -> teams.toString() + ".getTeam(" + alice + ")");
        assertEquals(A_team, teams.getTeam(artemis),
                () -> teams.toString() + ".getTeam(" + artemis + ")");
        teams.addToTeam(bob, B_team);
        assertEquals(A_team, teams.getTeam(artemis),
                () -> teams.toString() + ".getTeam(" + artemis + ")");
        assertEquals(B_team, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
    }

    @Test
    public void testAddAndRemove() {
        Q4Teams teams = new Q4Teams();
        int alice = teams.addPerson(3);
        int bob = teams.addPerson(2);
        int artemis = teams.addPerson(5);
        int baal = teams.addPerson(5);
        int A_team = teams.createTeam();
        int B_team = teams.createTeam();
        assertEquals(-1, teams.getTeam(alice),
                () -> teams.toString() + ".getTeam(" + alice + ")");
        teams.addToTeam(alice, A_team);
        assertEquals(A_team, teams.getTeam(alice),
                () -> teams.toString() + ".getTeam(" + alice + ")");
        teams.addToTeam(bob, A_team);
        assertEquals(A_team, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
        teams.addToTeam(artemis, B_team);
        teams.addToTeam(baal, B_team);
        teams.removeFromTeam(bob, A_team);
        assertEquals(-1, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
        teams.removeFromTeam(bob, B_team);
        teams.removeFromTeam(baal, B_team);
        assertEquals(-1, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
        teams.addToTeam(bob, B_team);
        assertEquals(B_team, teams.getTeam(bob),
                () -> teams.toString() + ".getTeam(" + bob + ")");
        assertEquals(-1, teams.getTeam(baal),
                () -> teams.toString() + ".getTeam(" + baal + ")");
    }

    @Test
    public void testCounting() {
        Q4Teams teams = new Q4Teams();
        int alice = teams.addPerson(3);
        int bob = teams.addPerson(2);
        int artemis = teams.addPerson(5);
        int baal = teams.addPerson(5);
        // checking team size before first team created:
        assertEquals(-1, teams.getTeamSize(0),
                () -> teams.toString() + ".getTeamSize(" + 0 + ")");
        int A_team = teams.createTeam();
        int B_team = teams.createTeam();
        assertEquals(0, teams.getTeamSize(A_team),
                () -> teams.toString() + ".getTeamSize(" + A_team + ")");
        assertEquals(4, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
        teams.addToTeam(alice, A_team);
        teams.addToTeam(bob, A_team);
        assertEquals(2, teams.getTeamSize(A_team),
                () -> teams.toString() + ".getTeamSize(" + A_team + ")");
        assertEquals(2, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
        assertEquals(0, teams.getTeamSize(B_team),
                () -> teams.toString() + ".getTeamSize(" + B_team + ")");
        teams.addToTeam(artemis, B_team);
        teams.addToTeam(baal, B_team);
        assertEquals(2, teams.getTeamSize(B_team),
                () -> teams.toString() + ".getTeamSize(" + B_team + ")");
        assertEquals(0, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
        teams.removeFromTeam(bob, B_team);
        assertEquals(2, teams.getTeamSize(B_team),
                () -> teams.toString() + ".getTeamSize(" + B_team + ")");
        assertEquals(0, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
        teams.removeFromTeam(bob, A_team);
        assertEquals(1, teams.getTeamSize(A_team),
                () -> teams.toString() + ".getTeamSize(" + A_team + ")");
        assertEquals(1, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
        teams.addToTeam(artemis, A_team);
        assertEquals(2, teams.getTeamSize(A_team),
                () -> teams.toString() + ".getTeamSize(" + A_team + ")");
        assertEquals(1, teams.getTeamSize(B_team),
                () -> teams.toString() + ".getTeamSize(" + B_team + ")");
        assertEquals(1, teams.getUnallocated(),
                () -> teams.toString() + ".getUnallocated()");
    }

    @Test
    public void testSkill() {
        Q4Teams teams = new Q4Teams();
        int alice = teams.addPerson(3);
        int bob = teams.addPerson(2);
        int artemis = teams.addPerson(5);
        int baal = teams.addPerson(5);
        assertEquals(15, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        // checking team skill before team created:
        assertEquals(-1, teams.getTeamSkill(0),
                () -> teams.toString() + ".getTeamSkill(" + 0 + ")");
        int A_team = teams.createTeam();
        int B_team = teams.createTeam();
        assertEquals(15, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        assertEquals(0, teams.getTeamSkill(A_team),
                () -> teams.toString() + ".getTeamSkill(" + A_team + ")");
        teams.addToTeam(alice, A_team);
        assertEquals(3, teams.getTeamSkill(A_team),
                () -> teams.toString() + ".getTeamSkill(" + A_team + ")");
        assertEquals(0, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        assertEquals(12, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        teams.addToTeam(bob, A_team);
        teams.addToTeam(artemis, B_team);
        teams.addToTeam(baal, B_team);
        assertEquals(5, teams.getTeamSkill(A_team),
                () -> teams.toString() + ".getTeamSkill(" + A_team + ")");
        assertEquals(10, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        assertEquals(0, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        teams.removeFromTeam(bob, B_team);
        assertEquals(10, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        assertEquals(0, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        teams.removeFromTeam(bob, A_team);
        assertEquals(3, teams.getTeamSkill(A_team),
                () -> teams.toString() + ".getTeamSkill(" + A_team + ")");
        assertEquals(2, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
        teams.addToTeam(artemis, A_team);
        assertEquals(8, teams.getTeamSkill(A_team),
                () -> teams.toString() + ".getTeamSkill(" + A_team + ")");
        teams.addToTeam(bob, B_team);
        assertEquals(7, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        teams.setSkill(bob, -2);
        assertEquals(3, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        teams.removeFromTeam(bob, B_team);
        assertEquals(5, teams.getTeamSkill(B_team),
                () -> teams.toString() + ".getTeamSkill(" + B_team + ")");
        assertEquals(-2, teams.getTalentReserve(),
                () -> teams.toString() + ".getTalentReserve()");
    }

    public void testTri(int n) {
        int p = (n * (n + 1)) / 2;
        int[] pid = new int[p];
        int[] tid = new int[n];
        Q4Teams teams = new Q4Teams();
        int l = 0;
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n - k; i++) {
                if (k == 0) tid[i] = teams.createTeam();
                pid[l++] = teams.addPerson(k + 1);
                teams.addToTeam(pid[l - 1], tid[i]);
                assertEquals(k + 1, teams.getTeamSize(tid[i]),
                        () -> teams.toString());
                assertEquals(((k + 1) * (k + 2))/2, teams.getTeamSkill(tid[i]),
                        () -> teams.toString());
            }
        }
        l = n;
        for (int k = 1; k < n; k++) {
            for (int i = k; i < n; i++) {
                teams.addToTeam(pid[l++], tid[i]);
            }
        }
        for (int i = 0; i < n; i++) {
            assertEquals(i + 1, teams.getTeamSize(tid[i]),
                    () -> teams.toString());
            assertEquals(((i + 1) * (i + 2))/2, teams.getTeamSkill(tid[i]),
                    () -> teams.toString());
        }
    }

    @Test
    public void testTriSmall() {
        testTri(3);
        testTri(5);
    }

    @Test
    public void testTriMed() {
        testTri(9);
        testTri(17);
    }

    @Test
    public void testTriLarge() {
        testTri(25);
        testTri(77);
    }

}