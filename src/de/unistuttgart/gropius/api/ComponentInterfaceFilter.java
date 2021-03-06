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

public class ComponentInterfaceFilter implements Serializable {
    private Input<String> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ID>> component = Input.undefined();

    private Input<List<ID>> consumedBy = Input.undefined();

    public String getName() {
        return name.getValue();
    }

    public Input<String> getNameInput() {
        return name;
    }

    public ComponentInterfaceFilter setName(String name) {
        this.name = Input.optional(name);
        return this;
    }

    public ComponentInterfaceFilter setNameInput(Input<String> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description.getValue();
    }

    public Input<String> getDescriptionInput() {
        return description;
    }

    public ComponentInterfaceFilter setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public ComponentInterfaceFilter setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ID> getComponent() {
        return component.getValue();
    }

    public Input<List<ID>> getComponentInput() {
        return component;
    }

    public ComponentInterfaceFilter setComponent(List<ID> component) {
        this.component = Input.optional(component);
        return this;
    }

    public ComponentInterfaceFilter setComponentInput(Input<List<ID>> component) {
        if (component == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.component = component;
        return this;
    }

    public List<ID> getConsumedBy() {
        return consumedBy.getValue();
    }

    public Input<List<ID>> getConsumedByInput() {
        return consumedBy;
    }

    public ComponentInterfaceFilter setConsumedBy(List<ID> consumedBy) {
        this.consumedBy = Input.optional(consumedBy);
        return this;
    }

    public ComponentInterfaceFilter setConsumedByInput(Input<List<ID>> consumedBy) {
        if (consumedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.consumedBy = consumedBy;
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
                Query.appendQuotedString(_queryBuilder, name.getValue().toString());
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

        if (this.component.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("component:");
            if (component.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : component.getValue()) {
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

        if (this.consumedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("consumedBy:");
            if (consumedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : consumedBy.getValue()) {
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
