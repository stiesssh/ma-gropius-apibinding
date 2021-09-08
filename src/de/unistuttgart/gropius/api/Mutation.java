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
* Mutations to change the data within the ccims
*/
public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "testMutation": {
                    TestMutationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new TestMutationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createIssue": {
                    CreateIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addIssueComment": {
                    AddIssueCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddIssueCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteIssueComment": {
                    DeleteIssueCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteIssueCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkIssue": {
                    LinkIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LinkIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unlinkIssue": {
                    UnlinkIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnlinkIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addLabelToIssue": {
                    AddLabelToIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddLabelToIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeLabelFromIssue": {
                    RemoveLabelFromIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveLabelFromIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pinIssue": {
                    PinIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PinIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unpinIssue": {
                    UnpinIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnpinIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "renameIssueTitle": {
                    RenameIssueTitlePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RenameIssueTitlePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueCategory": {
                    ChangeIssueCategoryPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueCategoryPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addAssignee": {
                    AddAssigneePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddAssigneePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeAssignee": {
                    RemoveAssigneePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveAssigneePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closeIssue": {
                    CloseIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CloseIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reopenIssue": {
                    ReopenIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReopenIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssuePriority": {
                    ChangeIssuePriorityPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssuePriorityPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueStartDate": {
                    ChangeIssueStartDatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueStartDatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueDueDate": {
                    ChangeIssueDueDatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueDueDatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueEstimatedTime": {
                    ChangeIssueEstimatedTimePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueEstimatedTimePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addIssueToLocation": {
                    AddIssueToLocationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddIssueToLocationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeIssueFromLocation": {
                    RemoveIssueFromLocationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveIssueFromLocationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addIssueToComponent": {
                    AddIssueToComponentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddIssueToComponentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeIssueFromComponent": {
                    RemoveIssueFromComponentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveIssueFromComponentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "markIssueAsDuplicate": {
                    MarkIssueAsDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarkIssueAsDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unmarkIssueAsDuplicate": {
                    UnmarkIssueAsDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnmarkIssueAsDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReactionToComment": {
                    AddReactionToCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReactionToCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeReactionFromComment": {
                    RemoveReactionFromCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveReactionFromCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createProject": {
                    CreateProjectPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateProjectPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteProject": {
                    DeleteProjectPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteProjectPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "updateProject": {
                    UpdateProjectPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UpdateProjectPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addComponentToProject": {
                    AddComponentToProjectPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddComponentToProjectPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeComponentFromProject": {
                    RemoveComponentFromProjectPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveComponentFromProjectPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createComponent": {
                    CreateComponentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateComponentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createUser": {
                    CreateUserPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateUserPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createLabel": {
                    CreateLabelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateLabelPayload(jsonAsObject(field.getValue(), key));
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

    public String getGraphQlTypeName() {
        return "Mutation";
    }

    /**
    * A mutation for testing if you're able to use GraphQL
    */

    public TestMutationPayload getTestMutation() {
        return (TestMutationPayload) get("testMutation");
    }

    public Mutation setTestMutation(TestMutationPayload arg) {
        optimisticData.put(getKey("testMutation"), arg);
        return this;
    }

    /**
    * Creates a new issue
    */

    public CreateIssuePayload getCreateIssue() {
        return (CreateIssuePayload) get("createIssue");
    }

    public Mutation setCreateIssue(CreateIssuePayload arg) {
        optimisticData.put(getKey("createIssue"), arg);
        return this;
    }

    /**
    * Creates a new comment on an existing issue
    */

    public AddIssueCommentPayload getAddIssueComment() {
        return (AddIssueCommentPayload) get("addIssueComment");
    }

    public Mutation setAddIssueComment(AddIssueCommentPayload arg) {
        optimisticData.put(getKey("addIssueComment"), arg);
        return this;
    }

    /**
    * Deletes an issue comment.
    * Comments don't get fully deleted but replaced by a
    * `DeletedComment` (only contains creation/deletion date/user) which is for conversation completness
    */

    public DeleteIssueCommentPayload getDeleteIssueComment() {
        return (DeleteIssueCommentPayload) get("deleteIssueComment");
    }

    public Mutation setDeleteIssueComment(DeleteIssueCommentPayload arg) {
        optimisticData.put(getKey("deleteIssueComment"), arg);
        return this;
    }

    /**
    * Links an issue to another one, creating a relation
    */

    public LinkIssuePayload getLinkIssue() {
        return (LinkIssuePayload) get("linkIssue");
    }

    public Mutation setLinkIssue(LinkIssuePayload arg) {
        optimisticData.put(getKey("linkIssue"), arg);
        return this;
    }

    /**
    * Unlink an issue from another and remove their relation
    */

    public UnlinkIssuePayload getUnlinkIssue() {
        return (UnlinkIssuePayload) get("unlinkIssue");
    }

    public Mutation setUnlinkIssue(UnlinkIssuePayload arg) {
        optimisticData.put(getKey("unlinkIssue"), arg);
        return this;
    }

    /**
    * Adds a label to an issue
    */

    public AddLabelToIssuePayload getAddLabelToIssue() {
        return (AddLabelToIssuePayload) get("addLabelToIssue");
    }

    public Mutation setAddLabelToIssue(AddLabelToIssuePayload arg) {
        optimisticData.put(getKey("addLabelToIssue"), arg);
        return this;
    }

    /**
    * Remove a label that is currently on the issue
    */

    public RemoveLabelFromIssuePayload getRemoveLabelFromIssue() {
        return (RemoveLabelFromIssuePayload) get("removeLabelFromIssue");
    }

    public Mutation setRemoveLabelFromIssue(RemoveLabelFromIssuePayload arg) {
        optimisticData.put(getKey("removeLabelFromIssue"), arg);
        return this;
    }

    /**
    * Pins an issue to a component (including in the IMS of the component)
    */

    public PinIssuePayload getPinIssue() {
        return (PinIssuePayload) get("pinIssue");
    }

    public Mutation setPinIssue(PinIssuePayload arg) {
        optimisticData.put(getKey("pinIssue"), arg);
        return this;
    }

    /**
    * Unpin an issue from a component
    */

    public UnpinIssuePayload getUnpinIssue() {
        return (UnpinIssuePayload) get("unpinIssue");
    }

    public Mutation setUnpinIssue(UnpinIssuePayload arg) {
        optimisticData.put(getKey("unpinIssue"), arg);
        return this;
    }

    /**
    * Change the title (rename) an issue
    */

    public RenameIssueTitlePayload getRenameIssueTitle() {
        return (RenameIssueTitlePayload) get("renameIssueTitle");
    }

    public Mutation setRenameIssueTitle(RenameIssueTitlePayload arg) {
        optimisticData.put(getKey("renameIssueTitle"), arg);
        return this;
    }

    /**
    * Changes the category of an issue
    */

    public ChangeIssueCategoryPayload getChangeIssueCategory() {
        return (ChangeIssueCategoryPayload) get("changeIssueCategory");
    }

    public Mutation setChangeIssueCategory(ChangeIssueCategoryPayload arg) {
        optimisticData.put(getKey("changeIssueCategory"), arg);
        return this;
    }

    /**
    * Adds a user as assignee to the issue
    */

    public AddAssigneePayload getAddAssignee() {
        return (AddAssigneePayload) get("addAssignee");
    }

    public Mutation setAddAssignee(AddAssigneePayload arg) {
        optimisticData.put(getKey("addAssignee"), arg);
        return this;
    }

    /**
    * Unassignes a user that is currently an assinee on an issue
    */

    public RemoveAssigneePayload getRemoveAssignee() {
        return (RemoveAssigneePayload) get("removeAssignee");
    }

    public Mutation setRemoveAssignee(RemoveAssigneePayload arg) {
        optimisticData.put(getKey("removeAssignee"), arg);
        return this;
    }

    /**
    * Closes an open issue
    */

    public CloseIssuePayload getCloseIssue() {
        return (CloseIssuePayload) get("closeIssue");
    }

    public Mutation setCloseIssue(CloseIssuePayload arg) {
        optimisticData.put(getKey("closeIssue"), arg);
        return this;
    }

    /**
    * Reopen an issue after it has been closed
    */

    public ReopenIssuePayload getReopenIssue() {
        return (ReopenIssuePayload) get("reopenIssue");
    }

    public Mutation setReopenIssue(ReopenIssuePayload arg) {
        optimisticData.put(getKey("reopenIssue"), arg);
        return this;
    }

    /**
    * Changes the priority of an issue
    */

    public ChangeIssuePriorityPayload getChangeIssuePriority() {
        return (ChangeIssuePriorityPayload) get("changeIssuePriority");
    }

    public Mutation setChangeIssuePriority(ChangeIssuePriorityPayload arg) {
        optimisticData.put(getKey("changeIssuePriority"), arg);
        return this;
    }

    /**
    * Changes the set start date on an issue
    */

    public ChangeIssueStartDatePayload getChangeIssueStartDate() {
        return (ChangeIssueStartDatePayload) get("changeIssueStartDate");
    }

    public Mutation setChangeIssueStartDate(ChangeIssueStartDatePayload arg) {
        optimisticData.put(getKey("changeIssueStartDate"), arg);
        return this;
    }

    /**
    * Changes the set due date on an issue
    */

    public ChangeIssueDueDatePayload getChangeIssueDueDate() {
        return (ChangeIssueDueDatePayload) get("changeIssueDueDate");
    }

    public Mutation setChangeIssueDueDate(ChangeIssueDueDatePayload arg) {
        optimisticData.put(getKey("changeIssueDueDate"), arg);
        return this;
    }

    /**
    * Changes the set estimated time on an issue
    */

    public ChangeIssueEstimatedTimePayload getChangeIssueEstimatedTime() {
        return (ChangeIssueEstimatedTimePayload) get("changeIssueEstimatedTime");
    }

    public Mutation setChangeIssueEstimatedTime(ChangeIssueEstimatedTimePayload arg) {
        optimisticData.put(getKey("changeIssueEstimatedTime"), arg);
        return this;
    }

    /**
    * Adds an issue to a location (location or interface)
    */

    public AddIssueToLocationPayload getAddIssueToLocation() {
        return (AddIssueToLocationPayload) get("addIssueToLocation");
    }

    public Mutation setAddIssueToLocation(AddIssueToLocationPayload arg) {
        optimisticData.put(getKey("addIssueToLocation"), arg);
        return this;
    }

    /**
    * Removes an issue from an issue location it was assigned to
    */

    public RemoveIssueFromLocationPayload getRemoveIssueFromLocation() {
        return (RemoveIssueFromLocationPayload) get("removeIssueFromLocation");
    }

    public Mutation setRemoveIssueFromLocation(RemoveIssueFromLocationPayload arg) {
        optimisticData.put(getKey("removeIssueFromLocation"), arg);
        return this;
    }

    /**
    * Adds an issue to a component (including creating the issue on the ims of the component)
    */

    public AddIssueToComponentPayload getAddIssueToComponent() {
        return (AddIssueToComponentPayload) get("addIssueToComponent");
    }

    public Mutation setAddIssueToComponent(AddIssueToComponentPayload arg) {
        optimisticData.put(getKey("addIssueToComponent"), arg);
        return this;
    }

    /**
    * Removes an issue from a component it is currently assigned to and deletes it from the ims of the
    * component
    */

    public RemoveIssueFromComponentPayload getRemoveIssueFromComponent() {
        return (RemoveIssueFromComponentPayload) get("removeIssueFromComponent");
    }

    public Mutation setRemoveIssueFromComponent(RemoveIssueFromComponentPayload arg) {
        optimisticData.put(getKey("removeIssueFromComponent"), arg);
        return this;
    }

    /**
    * Marks an issue as being a duplicate of another issue
    */

    public MarkIssueAsDuplicatePayload getMarkIssueAsDuplicate() {
        return (MarkIssueAsDuplicatePayload) get("markIssueAsDuplicate");
    }

    public Mutation setMarkIssueAsDuplicate(MarkIssueAsDuplicatePayload arg) {
        optimisticData.put(getKey("markIssueAsDuplicate"), arg);
        return this;
    }

    /**
    * Remove the marking on an issue that it is a duplicate of another issue
    */

    public UnmarkIssueAsDuplicatePayload getUnmarkIssueAsDuplicate() {
        return (UnmarkIssueAsDuplicatePayload) get("unmarkIssueAsDuplicate");
    }

    public Mutation setUnmarkIssueAsDuplicate(UnmarkIssueAsDuplicatePayload arg) {
        optimisticData.put(getKey("unmarkIssueAsDuplicate"), arg);
        return this;
    }

    /**
    * Adds a reaction by the current user to a comment (issue body or issue comment)
    */

    public AddReactionToCommentPayload getAddReactionToComment() {
        return (AddReactionToCommentPayload) get("addReactionToComment");
    }

    public Mutation setAddReactionToComment(AddReactionToCommentPayload arg) {
        optimisticData.put(getKey("addReactionToComment"), arg);
        return this;
    }

    /**
    * Remove a reaction from a comment which was added by the current user (issue body or issue comment)
    */

    public RemoveReactionFromCommentPayload getRemoveReactionFromComment() {
        return (RemoveReactionFromCommentPayload) get("removeReactionFromComment");
    }

    public Mutation setRemoveReactionFromComment(RemoveReactionFromCommentPayload arg) {
        optimisticData.put(getKey("removeReactionFromComment"), arg);
        return this;
    }

    /**
    * Creates a new project
    */

    public CreateProjectPayload getCreateProject() {
        return (CreateProjectPayload) get("createProject");
    }

    public Mutation setCreateProject(CreateProjectPayload arg) {
        optimisticData.put(getKey("createProject"), arg);
        return this;
    }

    /**
    * Delets the specified project
    */

    public DeleteProjectPayload getDeleteProject() {
        return (DeleteProjectPayload) get("deleteProject");
    }

    public Mutation setDeleteProject(DeleteProjectPayload arg) {
        optimisticData.put(getKey("deleteProject"), arg);
        return this;
    }

    /**
    * Updates the specified project
    */

    public UpdateProjectPayload getUpdateProject() {
        return (UpdateProjectPayload) get("updateProject");
    }

    public Mutation setUpdateProject(UpdateProjectPayload arg) {
        optimisticData.put(getKey("updateProject"), arg);
        return this;
    }

    /**
    * Adds the specified component to the project if it is not already on the project
    */

    public AddComponentToProjectPayload getAddComponentToProject() {
        return (AddComponentToProjectPayload) get("addComponentToProject");
    }

    public Mutation setAddComponentToProject(AddComponentToProjectPayload arg) {
        optimisticData.put(getKey("addComponentToProject"), arg);
        return this;
    }

    /**
    * Removes the specified component from the project if it is on the project
    */

    public RemoveComponentFromProjectPayload getRemoveComponentFromProject() {
        return (RemoveComponentFromProjectPayload) get("removeComponentFromProject");
    }

    public Mutation setRemoveComponentFromProject(RemoveComponentFromProjectPayload arg) {
        optimisticData.put(getKey("removeComponentFromProject"), arg);
        return this;
    }

    /**
    * Creates a new component in the ccims and adds it to the given users
    */

    public CreateComponentPayload getCreateComponent() {
        return (CreateComponentPayload) get("createComponent");
    }

    public Mutation setCreateComponent(CreateComponentPayload arg) {
        optimisticData.put(getKey("createComponent"), arg);
        return this;
    }

    /**
    * Creates a new user in the system
    */

    public CreateUserPayload getCreateUser() {
        return (CreateUserPayload) get("createUser");
    }

    public Mutation setCreateUser(CreateUserPayload arg) {
        optimisticData.put(getKey("createUser"), arg);
        return this;
    }

    /**
    * Create a new label in the system
    */

    public CreateLabelPayload getCreateLabel() {
        return (CreateLabelPayload) get("createLabel");
    }

    public Mutation setCreateLabel(CreateLabelPayload arg) {
        optimisticData.put(getKey("createLabel"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "testMutation": return true;

            case "createIssue": return true;

            case "addIssueComment": return true;

            case "deleteIssueComment": return true;

            case "linkIssue": return true;

            case "unlinkIssue": return true;

            case "addLabelToIssue": return true;

            case "removeLabelFromIssue": return true;

            case "pinIssue": return true;

            case "unpinIssue": return true;

            case "renameIssueTitle": return true;

            case "changeIssueCategory": return true;

            case "addAssignee": return true;

            case "removeAssignee": return true;

            case "closeIssue": return true;

            case "reopenIssue": return true;

            case "changeIssuePriority": return true;

            case "changeIssueStartDate": return true;

            case "changeIssueDueDate": return true;

            case "changeIssueEstimatedTime": return true;

            case "addIssueToLocation": return true;

            case "removeIssueFromLocation": return true;

            case "addIssueToComponent": return true;

            case "removeIssueFromComponent": return true;

            case "markIssueAsDuplicate": return true;

            case "unmarkIssueAsDuplicate": return true;

            case "addReactionToComment": return true;

            case "removeReactionFromComment": return true;

            case "createProject": return true;

            case "deleteProject": return true;

            case "updateProject": return true;

            case "addComponentToProject": return true;

            case "removeComponentFromProject": return true;

            case "createComponent": return true;

            case "createUser": return true;

            case "createLabel": return true;

            default: return false;
        }
    }
}

