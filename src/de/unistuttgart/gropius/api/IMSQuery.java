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
* An issue management system. This will be an __instance__ of one of the available IMS Types.
* E.g. One GitHub Repository's issue page.
*/
public class IMSQuery extends Query<IMSQuery> {
    IMSQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The type/system this IMS is an instance of
    */
    public IMSQuery imsType() {
        startField("imsType");

        return this;
    }

    /**
    * The component this IMS belongs to
    */
    public IMSQuery component(ComponentQueryDefinition queryDef) {
        startField("component");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
