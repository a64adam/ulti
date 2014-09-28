package dto.team;


public class TeamMemberInfo {
    private long inviteDate;
    private long joinDate;
    private long playerId;
    private String status;

    /**
     * Date that the team member was invited to the team specified as epoch milliseconds
     */
    public long getInviteDate() {
        return inviteDate;
    }

    /**
     * Date that the team member joined the team specified as epoch milliseconds
     */
    public long getJoinDate() {
        return joinDate;
    }

    public long getPlayerId() {
        return playerId;
    }

    public String getStatus() {
        return status;
    }
}
