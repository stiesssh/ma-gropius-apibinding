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

public class ComponentFilter implements Serializable {
    private Input<List<String>> name = Input.undefined();

    private Input<List<ID>> owner = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<IMSType>> imsType = Input.undefined();

    public List<String> getName() {
        return name.getValue();
    }

    public Input<List<String>> getNameInput() {
        return name;
    }

    public ComponentFilter setName(List<String> name) {
        this.name = Input.optional(name);
        return this;
    }

    public ComponentFilter setNameInput(Input<List<String>> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<ID> getOwner() {
        return owner.getValue();
    }

    public Input<List<ID>> getOwnerInput() {
        return owner;
    }

    public ComponentFilter setOwner(List<ID> owner) {
        this.owner = Input.optional(owner);
        return this;
    }

    public ComponentFilter setOwnerInput(Input<List<ID>> owner) {
        if (owner == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owner = owner;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public ComponentFilter setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ComponentFilter setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<IMSType> getImsType() {
        return imsType.getValue();
    }

    public Input<List<IMSType>> getImsTypeInput() {
        return imsType;
    }

    public ComponentFilter setImsType(List<IMSType> imsType) {
        this.imsType = Input.optional(imsType);
        return this;
    }

    public ComponentFilter setImsTypeInput(Input<List<IMSType>> imsType) {
        if (imsType == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.imsType = imsType;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : name.getValue()) {
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

        if (this.owner.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owner:");
            if (owner.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : owner.getValue()) {
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

        if (this.imsType.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("imsType:");
            if (imsType.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (IMSType item1 : imsType.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
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
