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
* An DeletedIssueComment in the timeline of an issue with a date and a creator
*/
public class DeletedIssueCommentQuery extends Query<DeletedIssueCommentQuery> {
    DeletedIssueCommentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The issue this timeline event belongs to
    */
    public DeletedIssueCommentQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user responsible who originally wrote the comment
    */
    public DeletedIssueCommentQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the original comment was first written. It's importand to user __this__ date for sorting to
    * maintain the conversation order
    */
    public DeletedIssueCommentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * The user who __deleted__ the comment
    */
    public DeletedIssueCommentQuery deletedBy(UserQueryDefinition queryDef) {
        startField("deletedBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the comment was deleted
    */
    public DeletedIssueCommentQuery deletedAt() {
        startField("deletedAt");

        return this;
    }
}
