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
* A user of th ccims. Can be assigned to projects, components and can have multiple ims accounts
*/
public class User extends AbstractResponse<User> implements Node {
    public User() {
    }

    public User(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "username": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "displayName": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "email": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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

                case "assignedToIssues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "participantOfIssues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issueComments": {
                    IssueCommentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueCommentPage(jsonAsObject(field.getValue(), key));
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

    public User(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "User";
    }

    /**
    * The unique id of this user
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The unique username used for login
    */

    public String getUsername() {
        return (String) get("username");
    }

    public User setUsername(String arg) {
        optimisticData.put(getKey("username"), arg);
        return this;
    }

    /**
    * The name of the user to display in the GUI
    */

    public String getDisplayName() {
        return (String) get("displayName");
    }

    public User setDisplayName(String arg) {
        optimisticData.put(getKey("displayName"), arg);
        return this;
    }

    /**
    * The mail address of the user
    */

    public String getEmail() {
        return (String) get("email");
    }

    public User setEmail(String arg) {
        optimisticData.put(getKey("email"), arg);
        return this;
    }

    /**
    * All the projects this user is a participant of matching `filterBy`
    */

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public User setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    /**
    * All issues that this the user is assigned to matching (if given) `filterBy`
    */

    public IssuePage getAssignedToIssues() {
        return (IssuePage) get("assignedToIssues");
    }

    public User setAssignedToIssues(IssuePage arg) {
        optimisticData.put(getKey("assignedToIssues"), arg);
        return this;
    }

    /**
    * All issues that this the user is a participant of matching (if given) `filterBy`
    */

    public IssuePage getParticipantOfIssues() {
        return (IssuePage) get("participantOfIssues");
    }

    public User setParticipantOfIssues(IssuePage arg) {
        optimisticData.put(getKey("participantOfIssues"), arg);
        return this;
    }

    /**
    * All issue comments (not including issues) written by this user
    */

    public IssueCommentPage getIssueComments() {
        return (IssueCommentPage) get("issueComments");
    }

    public User setIssueComments(IssueCommentPage arg) {
        optimisticData.put(getKey("issueComments"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "username": return false;

            case "displayName": return false;

            case "email": return false;

            case "projects": return true;

            case "assignedToIssues": return true;

            case "participantOfIssues": return true;

            case "issueComments": return true;

            default: return false;
        }
    }
}

