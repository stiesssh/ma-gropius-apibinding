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
* A page of multiple issue timeline items
*/
public class IssueTimelineItemPageQuery extends Query<IssueTimelineItemPageQuery> {
    IssueTimelineItemPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * All issue timeline items on this page
    */
    public IssueTimelineItemPageQuery nodes(IssueTimelineItemQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Edges to all nodes containing the cursor
    */
    public IssueTimelineItemPageQuery edges(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Information about the current page (like length, first/last element)
    */
    public IssueTimelineItemPageQuery pageInfo(PageInfoQueryDefinition queryDef) {
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
    public IssueTimelineItemPageQuery totalCount() {
        startField("totalCount");

        return this;
    }
}
