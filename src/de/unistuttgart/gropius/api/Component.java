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
* A component known to ccims.
* A component can have issues and can be assigned to multiple projects. (NOTE: One IMS per component)
*/
public class Component extends AbstractResponse<Component> implements IssueLocation, Node {
    public Component() {
    }

    public Component(JsonObject fields) throws SchemaViolationError {
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

                case "owner": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

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

                case "ims": {
                    IMS optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IMS(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issuesOnLocation": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
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

                case "interfaces": {
                    ComponentInterfacePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentInterfacePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "consumedInterfaces": {
                    ComponentInterfacePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentInterfacePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "labels": {
                    LabelPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LabelPage(jsonAsObject(field.getValue(), key));
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

    public Component(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Component";
    }

    /**
    * The unique id of this component
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The (non unique) display name of this component
    * Max. 256 characters
    */

    public String getName() {
        return (String) get("name");
    }

    public Component setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    /**
    * The user who administrates "owns" the component
    */

    public User getOwner() {
        return (User) get("owner");
    }

    public Component setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    /**
    * A textual description (of the fuction) of this component.
    * Max. 65536 characters
    */

    public String getDescription() {
        return (String) get("description");
    }

    public Component setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    /**
    * The IMS instance used by this component.
    */

    public IMS getIms() {
        return (IMS) get("ims");
    }

    public Component setIms(IMS arg) {
        optimisticData.put(getKey("ims"), arg);
        return this;
    }

    /**
    * All issues that are mirrored on this component (not the issue location but the ims) matching (if
    * given) `filterBy`
    */

    public IssuePage getIssues() {
        return (IssuePage) get("issues");
    }

    public Component setIssues(IssuePage arg) {
        optimisticData.put(getKey("issues"), arg);
        return this;
    }

    /**
    * All issues that are assigned to this components issue location matching (if given) `filterBy`
    */

    public IssuePage getIssuesOnLocation() {
        return (IssuePage) get("issuesOnLocation");
    }

    public Component setIssuesOnLocation(IssuePage arg) {
        optimisticData.put(getKey("issuesOnLocation"), arg);
        return this;
    }

    /**
    * All projects that this component is assigned to matching the `filterBy`
    */

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public Component setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    /**
    * Requests component interfaces which this component offers
    */

    public ComponentInterfacePage getInterfaces() {
        return (ComponentInterfacePage) get("interfaces");
    }

    public Component setInterfaces(ComponentInterfacePage arg) {
        optimisticData.put(getKey("interfaces"), arg);
        return this;
    }

    /**
    * Requests component interfaces that are used/consumed by this component
    */

    public ComponentInterfacePage getConsumedInterfaces() {
        return (ComponentInterfacePage) get("consumedInterfaces");
    }

    public Component setConsumedInterfaces(ComponentInterfacePage arg) {
        optimisticData.put(getKey("consumedInterfaces"), arg);
        return this;
    }

    /**
    * All labels which are available on this component, matching (if given) `filterBy`
    */

    public LabelPage getLabels() {
        return (LabelPage) get("labels");
    }

    public Component setLabels(LabelPage arg) {
        optimisticData.put(getKey("labels"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "owner": return true;

            case "description": return false;

            case "ims": return true;

            case "issues": return true;

            case "issuesOnLocation": return true;

            case "projects": return true;

            case "interfaces": return true;

            case "consumedInterfaces": return true;

            case "labels": return true;

            default: return false;
        }
    }
}

