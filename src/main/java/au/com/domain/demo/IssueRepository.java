package au.com.domain.demo;

import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;
import java.math.BigInteger;

@Repository
public interface IssueRepository extends CrudRepository<Issue, BigInteger> {

}

