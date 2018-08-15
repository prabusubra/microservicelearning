package com.example.blogmanagement.configs;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractReactiveCassandraConfiguration;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;

import java.util.Arrays;
import java.util.List;

@Configuration
public class CassandraConfig extends AbstractReactiveCassandraConfiguration {

    @Override
    protected String getKeyspaceName() {
        return "blogs";
    }

    @Override
    protected String getContactPoints() {
        return "127.0.0.1";
    }

    @Override
    protected int getPort() {
        return 9042;

    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {

        return Arrays.asList(CreateKeyspaceSpecification
                .createKeyspace(getKeyspaceName())
                .ifNotExists()
                .withSimpleReplication(3));
    }

    @Override
    protected List<String> getStartupScripts() {
        String cqlscript1 = "CREATE TABLE IF NOT EXISTS " + this.getKeyspaceName() + ".topic ("
                + "topicid TEXT PRIMARY KEY ,"
                + "content TEXT ,"
                + "author TEXT ,"
                + "name TEXT, "
                + "category TEXT"
                + ");";
        return Arrays.asList(cqlscript1);
    }
}
