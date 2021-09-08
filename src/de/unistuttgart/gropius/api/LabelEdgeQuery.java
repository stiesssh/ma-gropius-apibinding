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
* An edge for a LabelPage to link a cursor to an element
*/
public class LabelEdgeQuery extends Query<LabelEdgeQuery> {
    LabelEdgeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The label linked to by this edge
    */
    public LabelEdgeQuery node(LabelQueryDefinition queryDef) {
        startField("node");

        _queryBuilder.append('{');
        queryDef.define(new LabelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The cursor for use in the pagination
    */
    public LabelEdgeQuery cursor() {
        startField("cursor");

        return this;
    }
}
