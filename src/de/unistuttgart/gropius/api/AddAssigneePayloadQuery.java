// Generated from graphql_java_gen gem

package de.unistuttgart.gropius.api;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.time.Instant;

import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalAccessor;

import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* The Payload/Response for the addAssignee mutation
*/
public class AddAssigneePayloadQuery extends Query<AddAssigneePayloadQuery> {
    AddAssigneePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public AddAssigneePayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The user that was assigned to the issue
    */
    public AddAssigneePayloadQuery assignee(UserQueryDefinition queryDef) {
        startField("assignee");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issue to which the user was assigned
    */
    public AddAssigneePayloadQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The issue timeline event for the assigning of the user to the issue
    */
    public AddAssigneePayloadQuery event(AssignedEventQueryDefinition queryDef) {
        startField("event");

        _queryBuilder.append('{');
        queryDef.define(new AssignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The edge to be able to request other timeline items from this timeline item
    */
    public AddAssigneePayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
