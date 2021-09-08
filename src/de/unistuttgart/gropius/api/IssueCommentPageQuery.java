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
* A page of multiple issue comments
*/
public class IssueCommentPageQuery extends Query<IssueCommentPageQuery> {
    IssueCommentPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * All issue comments on this page
    */
    public IssueCommentPageQuery nodes(IssueCommentQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edges to all nodes containing the cursor
    */
    public IssueCommentPageQuery edges(IssueCommentEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Information about the current page (like length, first/last element)
    */
    public IssueCommentPageQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of elements matching the filter
    * (Even ones that don't match the current page)
    */
    public IssueCommentPageQuery totalCount() {
        startField("totalCount");

        return this;
    }
}
