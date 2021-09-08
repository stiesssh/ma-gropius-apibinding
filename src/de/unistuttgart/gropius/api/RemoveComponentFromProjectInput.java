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

public class RemoveComponentFromProjectInput implements Serializable {
    private ID projectId;

    private ID componentId;

    private Input<String> clientMutationId = Input.undefined();

    public RemoveComponentFromProjectInput(ID projectId, ID componentId) {
        this.projectId = projectId;

        this.componentId = componentId;
    }

    public ID getProjectId() {
        return projectId;
    }

    public RemoveComponentFromProjectInput setProjectId(ID projectId) {
        this.projectId = projectId;
        return this;
    }

    public ID getComponentId() {
        return componentId;
    }

    public RemoveComponentFromProjectInput setComponentId(ID componentId) {
        this.componentId = componentId;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public RemoveComponentFromProjectInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public RemoveComponentFromProjectInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("projectId:");
        Query.appendQuotedString(_queryBuilder, projectId.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("componentId:");
        Query.appendQuotedString(_queryBuilder, componentId.toString());

        if (this.clientMutationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("clientMutationID:");
            if (clientMutationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, clientMutationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
