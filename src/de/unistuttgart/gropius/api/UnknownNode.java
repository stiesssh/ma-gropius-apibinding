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
* An object which can be identified by an ID - called a node
*/
public class UnknownNode extends AbstractResponse<UnknownNode> implements Node {
    public UnknownNode() {
    }

    public UnknownNode(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    ID optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ID(jsonAsString(field.getValue(), key));
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

    public static Node create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AddedToComponentEvent": {
                return new AddedToComponentEvent(fields);
            }

            case "AddedToLocationEvent": {
                return new AddedToLocationEvent(fields);
            }

            case "AssignedEvent": {
                return new AssignedEvent(fields);
            }

            case "CategoryChangedEvent": {
                return new CategoryChangedEvent(fields);
            }

            case "ClosedEvent": {
                return new ClosedEvent(fields);
            }

            case "Component": {
                return new Component(fields);
            }

            case "ComponentInterface": {
                return new ComponentInterface(fields);
            }

            case "DeletedIssueComment": {
                return new DeletedIssueComment(fields);
            }

            case "DueDateChangedEvent": {
                return new DueDateChangedEvent(fields);
            }

            case "EstimatedTimeChangedEvent": {
                return new EstimatedTimeChangedEvent(fields);
            }

            case "IMS": {
                return new IMS(fields);
            }

            case "Issue": {
                return new Issue(fields);
            }

            case "IssueComment": {
                return new IssueComment(fields);
            }

            case "Label": {
                return new Label(fields);
            }

            case "LabelledEvent": {
                return new LabelledEvent(fields);
            }

            case "LinkEvent": {
                return new LinkEvent(fields);
            }

            case "MarkedAsDuplicateEvent": {
                return new MarkedAsDuplicateEvent(fields);
            }

            case "PinnedEvent": {
                return new PinnedEvent(fields);
            }

            case "PriorityChangedEvent": {
                return new PriorityChangedEvent(fields);
            }

            case "Project": {
                return new Project(fields);
            }

            case "ReactionGroup": {
                return new ReactionGroup(fields);
            }

            case "ReferencedByIssueEvent": {
                return new ReferencedByIssueEvent(fields);
            }

            case "ReferencedByOtherEvent": {
                return new ReferencedByOtherEvent(fields);
            }

            case "RemovedFromComponentEvent": {
                return new RemovedFromComponentEvent(fields);
            }

            case "RemovedFromLocationEvent": {
                return new RemovedFromLocationEvent(fields);
            }

            case "RenamedTitleEvent": {
                return new RenamedTitleEvent(fields);
            }

            case "ReopenedEvent": {
                return new ReopenedEvent(fields);
            }

            case "StartDateChangedEvent": {
                return new StartDateChangedEvent(fields);
            }

            case "UnassignedEvent": {
                return new UnassignedEvent(fields);
            }

            case "UnlabelledEvent": {
                return new UnlabelledEvent(fields);
            }

            case "UnlinkEvent": {
                return new UnlinkEvent(fields);
            }

            case "UnmarkedAsDuplicateEvent": {
                return new UnmarkedAsDuplicateEvent(fields);
            }

            case "UnpinnedEvent": {
                return new UnpinnedEvent(fields);
            }

            case "User": {
                return new User(fields);
            }

            case "WasLinkedEvent": {
                return new WasLinkedEvent(fields);
            }

            case "WasUnlinkedEvent": {
                return new WasUnlinkedEvent(fields);
            }

            default: {
                return new UnknownNode(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    /**
    * The ID of this node. Every node will have an non-empty and non-null edge.
    * If this is ever empty or null, something went wrong.
    */

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownNode setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            default: return false;
        }
    }
}

