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

public class Operations {
    public static QueryQuery query(QueryQueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("{");
        QueryQuery query = new QueryQuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }

    public static MutationQuery mutation(MutationQueryDefinition queryDef) {
        StringBuilder queryString = new StringBuilder("mutation{");
        MutationQuery query = new MutationQuery(queryString);
        queryDef.define(query);
        queryString.append('}');
        return query;
    }
}
