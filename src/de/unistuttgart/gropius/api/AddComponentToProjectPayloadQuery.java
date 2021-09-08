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
* The Payload/Response for the addComponentToProject mutation
*/
public class AddComponentToProjectPayloadQuery extends Query<AddComponentToProjectPayloadQuery> {
    AddComponentToProjectPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public AddComponentToProjectPayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The project to which the component was added
    */
    public AddComponentToProjectPayloadQuery project(ProjectQueryDefinition queryDef) {
        startField("project");

        _queryBuilder.append('{');
        queryDef.define(new ProjectQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The component which was added to the project
    */
    public AddComponentToProjectPayloadQuery component(ComponentQueryDefinition queryDef) {
        startField("component");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
