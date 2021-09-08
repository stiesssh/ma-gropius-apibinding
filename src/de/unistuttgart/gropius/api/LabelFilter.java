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

public class LabelFilter implements Serializable {
    private Input<List<String>> name = Input.undefined();

    private Input<String> description = Input.undefined();

    private Input<List<ID>> createdBy = Input.undefined();

    private Input<Date> createdAfter = Input.undefined();

    private Input<Date> createdBefore = Input.undefined();

    private Input<List<String>> color = Input.undefined();

    public List<String> getName() {
        return name.getValue();
    }

    public Input<List<String>> getNameInput() {
        return name;
    }

    public LabelFilter setName(List<String> name) {
        this.name = Input.optional(name);
        return this;
    }

    public LabelFilter setNameInput(Input<List<String>> name) {
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

    public LabelFilter setDescription(String description) {
        this.description = Input.optional(description);
        return this;
    }

    public LabelFilter setDescriptionInput(Input<String> description) {
        if (description == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.description = description;
        return this;
    }

    public List<ID> getCreatedBy() {
        return createdBy.getValue();
    }

    public Input<List<ID>> getCreatedByInput() {
        return createdBy;
    }

    public LabelFilter setCreatedBy(List<ID> createdBy) {
        this.createdBy = Input.optional(createdBy);
        return this;
    }

    public LabelFilter setCreatedByInput(Input<List<ID>> createdBy) {
        if (createdBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBy = createdBy;
        return this;
    }

    public Date getCreatedAfter() {
        return createdAfter.getValue();
    }

    public Input<Date> getCreatedAfterInput() {
        return createdAfter;
    }

    public LabelFilter setCreatedAfter(Date createdAfter) {
        this.createdAfter = Input.optional(createdAfter);
        return this;
    }

    public LabelFilter setCreatedAfterInput(Input<Date> createdAfter) {
        if (createdAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAfter = createdAfter;
        return this;
    }

    public Date getCreatedBefore() {
        return createdBefore.getValue();
    }

    public Input<Date> getCreatedBeforeInput() {
        return createdBefore;
    }

    public LabelFilter setCreatedBefore(Date createdBefore) {
        this.createdBefore = Input.optional(createdBefore);
        return this;
    }

    public LabelFilter setCreatedBeforeInput(Input<Date> createdBefore) {
        if (createdBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBefore = createdBefore;
        return this;
    }

    public List<String> getColor() {
        return color.getValue();
    }

    public Input<List<String>> getColorInput() {
        return color;
    }

    public LabelFilter setColor(List<String> color) {
        this.color = Input.optional(color);
        return this;
    }

    public LabelFilter setColorInput(Input<List<String>> color) {
        if (color == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.color = color;
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

        if (this.createdBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdBy:");
            if (createdBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : createdBy.getValue()) {
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

        if (this.createdAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdAfter:");
            if (createdAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, createdAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdBefore:");
            if (createdBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, createdBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.color.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("color:");
            if (color.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : color.getValue()) {
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
