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

public class MutationResponse {
    private TopLevelResponse response;
    private Mutation data;

    public MutationResponse(TopLevelResponse response) throws SchemaViolationError {
        this.response = response;
        this.data = response.getData() != null ? new Mutation(response.getData()) : null;
    }

    public Mutation getData() {
        return data;
    }

    public List<Error> getErrors() {
        return response.getErrors();
    }

    public String toJson() {
        return new Gson().toJson(response);
    }

    public String prettyPrintJson() {
        final Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(response);
    }

    public static MutationResponse fromJson(String json) throws SchemaViolationError {
        final TopLevelResponse response = new Gson().fromJson(json, TopLevelResponse.class);
        return new MutationResponse(response);
    }
}