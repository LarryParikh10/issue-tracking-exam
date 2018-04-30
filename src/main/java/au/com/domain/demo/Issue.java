package au.com.domain.demo;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Entity
@Table(name = "ISSUE", schema = "ISSUE_TRACKER")
public class Issue {
    @Id
    public BigInteger id;
    public String title;
    public String description;
    public String status;
    public BigInteger reporter;
    public BigInteger assignee;
    public Date created;
    public Date completed;
}
