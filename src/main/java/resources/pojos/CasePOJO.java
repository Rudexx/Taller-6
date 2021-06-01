package resources.pojos;

import java.util.Date;

public class CasePOJO {

    private int case_id;

    private Date created_At;

    private String type;

    private String description;

    private int pet_Id;

    public CasePOJO() {
    }

    public CasePOJO(int case_id, Date created_At, String type, String description, int pet_Id) {
        this.case_id = case_id;
        this.created_At = created_At;
        this.type = type;
        this.description = description;
        this.pet_Id = pet_Id;
    }
}
