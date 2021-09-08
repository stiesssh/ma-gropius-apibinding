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
* A label assignable to issues. A label is per-project
*/
public class Label extends AbstractResponse<Label> implements Node {
    public Label() {
    }

    public Label(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "color": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "components": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "projects": {
                    ProjectPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProjectPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public Label(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Label";
    }

    /**
    * The unique id of this label
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The name of the label to display.
    * Max. 256 characters
    */

    public String getName() {
        return (String) get("name");
    }

    public Label setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * A text describing the labels' function
    * Max. 65536 characters
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Label setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The color of the label in the GUI
    */

    public String getColor() {
        return (String) get("color");
    }

    public Label setColor(String arg) {
        optimisticData.put(getKey("color"), arg);
        return this;
    }

    /**
    * The components this label is available on
    */

    public ComponentPage getComponents() {
        return (ComponentPage) get("components");
    }

    public Label setComponents(ComponentPage arg) {
        optimisticData.put(getKey("components"), arg);
        return this;
    }

    /**
    * All projetcs that this label is used on
    */

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public Label setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "description": return false;

            case "color": return false;

            case "components": return true;

            case "projects": return true;

            default: return false;
        }
    }
}

