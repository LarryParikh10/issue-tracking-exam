package au.com.domain.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;
import java.math.BigInteger;

@Service
public class IssueService {
    @Autowired
    IssueRepository issueRepository;
    public List<Issue> getAllIssues() {
       List<Issue> issues = new ArrayList<>();
       Iterable<Issue> issueIteration = issueRepository.findAll();
       for(Issue issue: issueIteration) {
            issues.add(issue);
        }
       return issues;
    }
    public Issue getIssue(BigInteger id) {
        return issueRepository.findOne(id);
    }
    public void addIssue(Issue issue) {
         issueRepository.save(issue);
    }
    public void updateIssue(Issue issue) {
        issueRepository.save(issue);
    }
    public void deleteIssue(BigInteger id) {
        issueRepository.delete(id);
    }
}
