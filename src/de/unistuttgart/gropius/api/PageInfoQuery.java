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
* Information about a page including the first and last elements cursor and next/previous pages
*/
public class PageInfoQuery extends Query<PageInfoQuery> {
    PageInfoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The cursor of the first element on the page. Can be used to request the previous page.
    */
    public PageInfoQuery startCursor() {
        startField("startCursor");

        return this;
    }

    /**
    * The cursor of the last element on the page. Can be used to request the next page.
    */
    public PageInfoQuery endCursor() {
        startField("endCursor");

        return this;
    }

    /**
    * true iff there is another page of elements with the current filter
    */
    public PageInfoQuery hasNextPage() {
        startField("hasNextPage");

        return this;
    }

    /**
    * true iff there is a previous page of elements with the current filter
    */
    public PageInfoQuery hasPreviousPage() {
        startField("hasPreviousPage");

        return this;
    }
}
