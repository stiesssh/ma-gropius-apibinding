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
* The Payload/Response for the createComponent mutation
*/
public class CreateComponentPayloadQuery extends Query<CreateComponentPayloadQuery> {
    CreateComponentPayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    /**
    * The string provided by the client on sending the mutation
    */
    public CreateComponentPayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    /**
    * The component created by this mutation
    */
    public CreateComponentPayloadQuery component(ComponentQueryDefinition queryDef) {
        startField("component");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The IMS of the component created by this mutation
    */
    public CreateComponentPayloadQuery ims(IMSQueryDefinition queryDef) {
        startField("ims");

        _queryBuilder.append('{');
        queryDef.define(new IMSQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
