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
* A relation of users who have reacted with a certain reaction to something
*/
public class ReactionGroupQuery extends Query<ReactionGroupQuery> {
    ReactionGroupQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * Users who reacted with this reaction.
    * If there are only a few, all users will be returned. If too many users are part of this reaction
    * group, only a few will be returned
    */
    public ReactionGroupQuery users(UserQueryDefinition queryDef) {
        startField("users");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The total number of users in this reaction group.
    * This is needed in case the `users` list was truncated.
    */
    public ReactionGroupQuery totalUserCount() {
        startField("totalUserCount");

        return this;
    }

    /**
    * The name of the recation with which the people in this reaction group have reacted
    */
    public ReactionGroupQuery reaction() {
        startField("reaction");

        return this;
    }
}
