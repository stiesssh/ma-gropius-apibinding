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

public class CreateComponentInput implements Serializable {
    private String name;

    private ID owner;

    private IMSType imsType;

    private String endpoint;

    private String connectionData;

    private Input<String> clientMutationId = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ID>> projects = Input.undefined();

    private Input<List<ID>> consumedInterfaces = Input.undefined();

    public CreateComponentInput(String name, ID owner, IMSType imsType, String endpoint, String connectionData) {
        this.name = name;

        this.owner = owner;

        this.imsType = imsType;

        this.endpoint = endpoint;

        this.connectionData = connectionData;
    }

    public String getName() {
        return name;
    }

    public CreateComponentInput setName(String name) {
        this.name = name;
        return this;
    }

    public ID getOwner() {
        return owner;
    }

    public CreateComponentInput setOwner(ID owner) {
        this.owner = owner;
        return this;
    }

    public IMSType getImsType() {
        return imsType;
    }

    public CreateComponentInput setImsType(IMSType imsType) {
        this.imsType = imsType;
        return this;
    }

    public String getEndpoint() {
        return endpoint;
    }

    public CreateComponentInput setEndpoint(String endpoint) {
        this.endpoint = endpoint;
        return this;
    }

    public String getConnectionData() {
        return connectionData;
    }

    public CreateComponentInput setConnectionData(String connectionData) {
        this.connectionData = connectionData;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public CreateComponentInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public CreateComponentInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public CreateComponentInput setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public CreateComponentInput setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ID> getProjects() {
        return projects.getValue();
    }

    public Input<List<ID>> getProjectsInput() {
        return projects;
    }

    public CreateComponentInput setProjects(List<ID> projects) {
        this.projects = Input.optional(projects);
        return this;
    }

    public CreateComponentInput setProjectsInput(Input<List<ID>> projects) {
        if (projects == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.projects = projects;
        return this;
    }

    public List<ID> getConsumedInterfaces() {
        return consumedInterfaces.getValue();
    }

    public Input<List<ID>> getConsumedInterfacesInput() {
        return consumedInterfaces;
    }

    public CreateComponentInput setConsumedInterfaces(List<ID> consumedInterfaces) {
        this.consumedInterfaces = Input.optional(consumedInterfaces);
        return this;
    }

    public CreateComponentInput setConsumedInterfacesInput(Input<List<ID>> consumedInterfaces) {
        if (consumedInterfaces == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.consumedInterfaces = consumedInterfaces;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("owner:");
        Query.appendQuotedString(_queryBuilder, owner.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("imsType:");
        _queryBuilder.append(imsType.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("endpoint:");
        Query.appendQuotedString(_queryBuilder, endpoint.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("connectionData:");
        Query.appendQuotedString(_queryBuilder, connectionData.toString());

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

        if (this.description.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("description:");
            if (description.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, description.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.projects.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("projects:");
            if (projects.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : projects.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.consumedInterfaces.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("consumedInterfaces:");
            if (consumedInterfaces.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : consumedInterfaces.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
