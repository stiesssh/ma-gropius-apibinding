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
* The Payload/Response for the addToCommentReaction mutation
*/
public class AddReactionToCommentPayloadQuery extends Query<AddReactionToCommentPayloadQuery> {
    AddReactionToCommentPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public AddReactionToCommentPayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The comment the reaction was added to
    */
    public AddReactionToCommentPayloadQuery comment(CommentQueryDefinition queryDef) {
        startField("comment");

        _queryBuilder.append('{');
        queryDef.define(new CommentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The group of users that all reacted to this comment with the same reaction
    */
    public AddReactionToCommentPayloadQuery reaction(ReactionGroupQueryDefinition queryDef) {
        startField("reaction");

        _queryBuilder.append('{');
        queryDef.define(new ReactionGroupQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
