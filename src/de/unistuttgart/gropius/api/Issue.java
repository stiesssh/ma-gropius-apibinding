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
* A cross component issue within ccims which links multiple issues from single ims
*/
public class Issue extends AbstractResponse<Issue> implements Comment, Node {
    public Issue() {
    }

    public Issue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "body": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bodyRendered": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "editedBy": {
                    List<User> optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        List<User> list1 = new ArrayList<>();
                        for (JsonElement element1 : jsonAsArray(field.getValue(), key)) {
                            list1.add(new User(jsonAsObject(element1, key)));
                        }

                        optional1 = list1;
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key)))));

                    break;
                }

                case "lastEditedAt": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updatedAt": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isOpen": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isDuplicate": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "category": {
                    responseData.put(key, IssueCategory.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "currentUserCanEdit": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "currentUserCanComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "startDate": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dueDate": {
                    Date optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = Date.from(Instant.from(DateTimeFormatter.ISO_INSTANT.parse(jsonAsString(field.getValue(), key))));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "estimatedTime": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "spentTime": {
                    Integer optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsInteger(field.getValue(), key);
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

                case "linksToIssues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkedByIssues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reactions": {
                    ReactionGroupPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroupPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assignees": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
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

                case "participants": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pinnedOn": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timeline": {
                    IssueTimelineItemPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locations": {
                    IssueLocationPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueLocationPage(jsonAsObject(field.getValue(), key));
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

    public Issue(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Issue";
    }

    /**
    * The unique id of this issue
    */

    public ID getId() {
        return (ID) get("id");
    }

    /**
    * The title to display for this issue.
    * Not unique; Max. 256 characters
    */

    public String getTitle() {
        return (String) get("title");
    }

    public Issue setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    /**
    * The body text of the issue.
    * Markdown supported.
    * Max. 65536 characters
    */

    public String getBody() {
        return (String) get("body");
    }

    public Issue setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    /**
    * The body text of the issue rendered to html
    */

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public Issue setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    /**
    * The user who originally created the issue (in ccims or any ims)
    */

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public Issue setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    /**
    * A list of all people who edited the root of this issue (body and title)
    */

    public List<User> getEditedBy() {
        return (List<User>) get("editedBy");
    }

    public Issue setEditedBy(List<User> arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    /**
    * The date the issue was first created on
    */

    public Date getCreatedAt() {
        return (Date) get("createdAt");
    }

    public Issue setCreatedAt(Date arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    /**
    * Date when the core issue(title, body etc.) was last changed (comments and other events DO NOT count)
    */

    public Date getLastEditedAt() {
        return (Date) get("lastEditedAt");
    }

    public Issue setLastEditedAt(Date arg) {
        optimisticData.put(getKey("lastEditedAt"), arg);
        return this;
    }

    /**
    * Date when any update / activity was made to any part of the issue (__including__ title, commens,
    * reactions)
    */

    public Date getUpdatedAt() {
        return (Date) get("updatedAt");
    }

    public Issue setUpdatedAt(Date arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    /**
    * `true` iff the issue is open at this point
    */

    public Boolean getIsOpen() {
        return (Boolean) get("isOpen");
    }

    public Issue setIsOpen(Boolean arg) {
        optimisticData.put(getKey("isOpen"), arg);
        return this;
    }

    /**
    * Weather or not this issue has been marked as duplicate of another issue
    */

    public Boolean getIsDuplicate() {
        return (Boolean) get("isDuplicate");
    }

    public Issue setIsDuplicate(Boolean arg) {
        optimisticData.put(getKey("isDuplicate"), arg);
        return this;
    }

    /**
    * The ccims-issue-category the issue belongs to.
    * This can be one of BUG,FEATURE_REQUEST or UNCLASSIFIED
    */

    public IssueCategory getCategory() {
        return (IssueCategory) get("category");
    }

    public Issue setCategory(IssueCategory arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to edit this issue.
    * This only refers to editing the core issue (title, body, etc.)
    */

    public Boolean getCurrentUserCanEdit() {
        return (Boolean) get("currentUserCanEdit");
    }

    public Issue setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to comment on this issue.
    */

    public Boolean getCurrentUserCanComment() {
        return (Boolean) get("currentUserCanComment");
    }

    public Issue setCurrentUserCanComment(Boolean arg) {
        optimisticData.put(getKey("currentUserCanComment"), arg);
        return this;
    }

    /**
    * A start date set for start of work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */

    public Date getStartDate() {
        return (Date) get("startDate");
    }

    public Issue setStartDate(Date arg) {
        optimisticData.put(getKey("startDate"), arg);
        return this;
    }

    /**
    * A due date set when work on the issue must be done.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */

    public Date getDueDate() {
        return (Date) get("dueDate");
    }

    public Issue setDueDate(Date arg) {
        optimisticData.put(getKey("dueDate"), arg);
        return this;
    }

    /**
    * The time estimated needed for work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */

    public Integer getEstimatedTime() {
        return (Integer) get("estimatedTime");
    }

    public Issue setEstimatedTime(Integer arg) {
        optimisticData.put(getKey("estimatedTime"), arg);
        return this;
    }

    /**
    * The time already spent on work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */

    public Integer getSpentTime() {
        return (Integer) get("spentTime");
    }

    public Issue setSpentTime(Integer arg) {
        optimisticData.put(getKey("spentTime"), arg);
        return this;
    }

    /**
    * All issue comments on this issue
    */

    public IssueCommentPage getIssueComments() {
        return (IssueCommentPage) get("issueComments");
    }

    public Issue setIssueComments(IssueCommentPage arg) {
        optimisticData.put(getKey("issueComments"), arg);
        return this;
    }

    /**
    * All issues linked to from issue (this issue is __origin__ of relation, matching the given filter.
    * If no filter is given, all issues will be returned
    */

    public IssuePage getLinksToIssues() {
        return (IssuePage) get("linksToIssues");
    }

    public Issue setLinksToIssues(IssuePage arg) {
        optimisticData.put(getKey("linksToIssues"), arg);
        return this;
    }

    /**
    * All issues linking to this issue (this issue is __destination__ of relation), matching the given
    * filter.
    * If no filter is given, all issues will be returned
    */

    public IssuePage getLinkedByIssues() {
        return (IssuePage) get("linkedByIssues");
    }

    public Issue setLinkedByIssues(IssuePage arg) {
        optimisticData.put(getKey("linkedByIssues"), arg);
        return this;
    }

    /**
    * All reactions that have been added to the body of this issue
    */

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public Issue setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    /**
    * All users who are explicitely assigned to issue, matching the given filter.
    * If no filter is given, all issues will be returned
    */

    public UserPage getAssignees() {
        return (UserPage) get("assignees");
    }

    public Issue setAssignees(UserPage arg) {
        optimisticData.put(getKey("assignees"), arg);
        return this;
    }

    /**
    * All labels that are currently assigned to this issue
    */

    public LabelPage getLabels() {
        return (LabelPage) get("labels");
    }

    public Issue setLabels(LabelPage arg) {
        optimisticData.put(getKey("labels"), arg);
        return this;
    }

    /**
    * All users participating on this issue (by writing a comment, etc.), matching the given filter.
    * If no filter is given, all users will be returned
    */

    public UserPage getParticipants() {
        return (UserPage) get("participants");
    }

    public Issue setParticipants(UserPage arg) {
        optimisticData.put(getKey("participants"), arg);
        return this;
    }

    /**
    * All components where this issue has been pinned, matching the given filter.
    * If no filter is given, all components will be returned
    */

    public ComponentPage getPinnedOn() {
        return (ComponentPage) get("pinnedOn");
    }

    public Issue setPinnedOn(ComponentPage arg) {
        optimisticData.put(getKey("pinnedOn"), arg);
        return this;
    }

    /**
    * All timeline events for this issue in chonological order from oldest to newest, matching (if given)
    * `filterBy`
    */

    public IssueTimelineItemPage getTimeline() {
        return (IssueTimelineItemPage) get("timeline");
    }

    public Issue setTimeline(IssueTimelineItemPage arg) {
        optimisticData.put(getKey("timeline"), arg);
        return this;
    }

    /**
    * All issue locations this issue is assigned to, matching (if given) `filterBy`
    */

    public IssueLocationPage getLocations() {
        return (IssueLocationPage) get("locations");
    }

    public Issue setLocations(IssueLocationPage arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "title": return false;

            case "body": return false;

            case "bodyRendered": return false;

            case "createdBy": return true;

            case "editedBy": return true;

            case "createdAt": return false;

            case "lastEditedAt": return false;

            case "updatedAt": return false;

            case "isOpen": return false;

            case "isDuplicate": return false;

            case "category": return false;

            case "currentUserCanEdit": return false;

            case "currentUserCanComment": return false;

            case "startDate": return false;

            case "dueDate": return false;

            case "estimatedTime": return false;

            case "spentTime": return false;

            case "issueComments": return true;

            case "linksToIssues": return true;

            case "linkedByIssues": return true;

            case "reactions": return true;

            case "assignees": return true;

            case "labels": return true;

            case "participants": return true;

            case "pinnedOn": return true;

            case "timeline": return true;

            case "locations": return true;

            default: return false;
        }
    }
}

