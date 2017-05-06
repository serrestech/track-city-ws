package code.injectors.track.city.ws.dto.review;

import code.injectors.track.city.ws.dto.AbstractDTO;
import code.injectors.track.city.ws.dto.user.UserDTO;

/**
 * @author Chatzakis Nikolaos
 */
public class ReviewDTO extends AbstractDTO {

    private Boolean isUpvote;
    private String comment;
    private UserDTO user;

    public Boolean getUpvote() {
        return isUpvote;
    }

    public void setUpvote(Boolean upvote) {
        isUpvote = upvote;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }
}