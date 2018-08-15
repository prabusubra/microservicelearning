package com.example.blogmanagement.repositories;

import org.springframework.data.cassandra.repository.ReactiveCassandraRepository;
import org.springframework.stereotype.Repository;

import com.example.blogmanagement.beans.Topic;

@Repository
public interface BlogRepository extends ReactiveCassandraRepository<Topic, String> {

}
