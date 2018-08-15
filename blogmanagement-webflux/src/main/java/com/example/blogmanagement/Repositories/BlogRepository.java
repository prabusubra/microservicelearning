package com.example.blogmanagement.Repositories;

import com.example.blogmanagement.beans.Topic;
import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlogRepository extends ReactiveCassandraRepository<Topic,String> {
}
