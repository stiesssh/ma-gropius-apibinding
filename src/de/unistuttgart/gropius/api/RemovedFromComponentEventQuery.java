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
* An RemovedFromComponentEvent in the timeline of an issue with a date and a creator
*/
public class RemovedFromComponentEventQuery extends Query<RemovedFromComponentEventQuery> {
    RemovedFromComponentEventQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The issue this timeline event belongs to
    */
    public RemovedFromComponentEventQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user responsible for the creation of the event (e.g. autor of a comment)
    * It's possible there is no autor, for example if the action was performed automatically
    */
    public RemovedFromComponentEventQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the event occured on/was created.
    * This ISN'T updated if the event is be changed
    */
    public RemovedFromComponentEventQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The component the issue was removed from
    */
    public RemovedFromComponentEventQuery removedComponent(ComponentQueryDefinition queryDef) {
        startField("removedComponent");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
