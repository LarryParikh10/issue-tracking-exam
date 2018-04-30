package au.com.domain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.math.BigInteger;
import java.util.*;
@RestController
public class IssueController {
    @Autowired
    IssueService issueService;
    @RequestMapping("/issues")
    public List<Issue> getIssues() { return issueService.getAllIssues(); }
    @RequestMapping("/issues/{id}")
    public Issue getIssue(@PathVariable BigInteger id) {
        return issueService.getIssue(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/issues")
    public void addIssue(@RequestBody Issue issue) {
        issueService.addIssue(issue);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/issues/{id}")
    public void updateIssue(@RequestBody Issue issue) {
        issueService.updateIssue(issue);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/issues/{id}")
    public void deleteIssue(@PathVariable BigInteger id) {
        issueService.deleteIssue(id);
    }
}