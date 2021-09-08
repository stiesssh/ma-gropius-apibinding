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
public class MutationQuery extends Query<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public class TestMutationArguments extends Arguments {
        TestMutationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public TestMutationArguments input(TestMutationInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface TestMutationArgumentsDefinition {
        void define(TestMutationArguments args);
    }

    /**
    * A mutation for testing if you're able to use GraphQL
    */
    public MutationQuery testMutation(TestMutationPayloadQueryDefinition queryDef) {
        return testMutation(args -> {}, queryDef);
    }

    /**
    * A mutation for testing if you're able to use GraphQL
    */
    public MutationQuery testMutation(TestMutationArgumentsDefinition argsDef, TestMutationPayloadQueryDefinition queryDef) {
        startField("testMutation");

        TestMutationArguments args = new TestMutationArguments(_queryBuilder);
        argsDef.define(args);
        TestMutationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new TestMutationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new issue
    */
    public MutationQuery createIssue(CreateIssueInput input, CreateIssuePayloadQueryDefinition queryDef) {
        startField("createIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new comment on an existing issue
    */
    public MutationQuery addIssueComment(AddIssueCommentInput input, AddIssueCommentPayloadQueryDefinition queryDef) {
        startField("addIssueComment");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddIssueCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class DeleteIssueCommentArguments extends Arguments {
        DeleteIssueCommentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public DeleteIssueCommentArguments input(DeleteIssueCommentInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface DeleteIssueCommentArgumentsDefinition {
        void define(DeleteIssueCommentArguments args);
    }

    /**
    * Deletes an issue comment.
    * Comments don't get fully deleted but replaced by a
    * `DeletedComment` (only contains creation/deletion date/user) which is for conversation completness
    */
    public MutationQuery deleteIssueComment(DeleteIssueCommentPayloadQueryDefinition queryDef) {
        return deleteIssueComment(args -> {}, queryDef);
    }

    /**
    * Deletes an issue comment.
    * Comments don't get fully deleted but replaced by a
    * `DeletedComment` (only contains creation/deletion date/user) which is for conversation completness
    */
    public MutationQuery deleteIssueComment(DeleteIssueCommentArgumentsDefinition argsDef, DeleteIssueCommentPayloadQueryDefinition queryDef) {
        startField("deleteIssueComment");

        DeleteIssueCommentArguments args = new DeleteIssueCommentArguments(_queryBuilder);
        argsDef.define(args);
        DeleteIssueCommentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new DeleteIssueCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Links an issue to another one, creating a relation
    */
    public MutationQuery linkIssue(LinkIssueInput input, LinkIssuePayloadQueryDefinition queryDef) {
        startField("linkIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LinkIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnlinkIssueArguments extends Arguments {
        UnlinkIssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public UnlinkIssueArguments input(UnlinkIssueInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UnlinkIssueArgumentsDefinition {
        void define(UnlinkIssueArguments args);
    }

    /**
    * Unlink an issue from another and remove their relation
    */
    public MutationQuery unlinkIssue(UnlinkIssuePayloadQueryDefinition queryDef) {
        return unlinkIssue(args -> {}, queryDef);
    }

    /**
    * Unlink an issue from another and remove their relation
    */
    public MutationQuery unlinkIssue(UnlinkIssueArgumentsDefinition argsDef, UnlinkIssuePayloadQueryDefinition queryDef) {
        startField("unlinkIssue");

        UnlinkIssueArguments args = new UnlinkIssueArguments(_queryBuilder);
        argsDef.define(args);
        UnlinkIssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UnlinkIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a label to an issue
    */
    public MutationQuery addLabelToIssue(AddLabelToIssueInput input, AddLabelToIssuePayloadQueryDefinition queryDef) {
        startField("addLabelToIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddLabelToIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveLabelFromIssueArguments extends Arguments {
        RemoveLabelFromIssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public RemoveLabelFromIssueArguments input(RemoveLabelFromIssueInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveLabelFromIssueArgumentsDefinition {
        void define(RemoveLabelFromIssueArguments args);
    }

    /**
    * Remove a label that is currently on the issue
    */
    public MutationQuery removeLabelFromIssue(RemoveLabelFromIssuePayloadQueryDefinition queryDef) {
        return removeLabelFromIssue(args -> {}, queryDef);
    }

    /**
    * Remove a label that is currently on the issue
    */
    public MutationQuery removeLabelFromIssue(RemoveLabelFromIssueArgumentsDefinition argsDef, RemoveLabelFromIssuePayloadQueryDefinition queryDef) {
        startField("removeLabelFromIssue");

        RemoveLabelFromIssueArguments args = new RemoveLabelFromIssueArguments(_queryBuilder);
        argsDef.define(args);
        RemoveLabelFromIssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveLabelFromIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PinIssueArguments extends Arguments {
        PinIssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public PinIssueArguments input(PinIssueInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface PinIssueArgumentsDefinition {
        void define(PinIssueArguments args);
    }

    /**
    * Pins an issue to a component (including in the IMS of the component)
    */
    public MutationQuery pinIssue(PinIssuePayloadQueryDefinition queryDef) {
        return pinIssue(args -> {}, queryDef);
    }

    /**
    * Pins an issue to a component (including in the IMS of the component)
    */
    public MutationQuery pinIssue(PinIssueArgumentsDefinition argsDef, PinIssuePayloadQueryDefinition queryDef) {
        startField("pinIssue");

        PinIssueArguments args = new PinIssueArguments(_queryBuilder);
        argsDef.define(args);
        PinIssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new PinIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnpinIssueArguments extends Arguments {
        UnpinIssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public UnpinIssueArguments input(UnpinIssueInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UnpinIssueArgumentsDefinition {
        void define(UnpinIssueArguments args);
    }

    /**
    * Unpin an issue from a component
    */
    public MutationQuery unpinIssue(UnpinIssuePayloadQueryDefinition queryDef) {
        return unpinIssue(args -> {}, queryDef);
    }

    /**
    * Unpin an issue from a component
    */
    public MutationQuery unpinIssue(UnpinIssueArgumentsDefinition argsDef, UnpinIssuePayloadQueryDefinition queryDef) {
        startField("unpinIssue");

        UnpinIssueArguments args = new UnpinIssueArguments(_queryBuilder);
        argsDef.define(args);
        UnpinIssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UnpinIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Change the title (rename) an issue
    */
    public MutationQuery renameIssueTitle(RenameIssueTitleInput input, RenameIssueTitlePayloadQueryDefinition queryDef) {
        startField("renameIssueTitle");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RenameIssueTitlePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Changes the category of an issue
    */
    public MutationQuery changeIssueCategory(ChangeIssueCategoryInput input, ChangeIssueCategoryPayloadQueryDefinition queryDef) {
        startField("changeIssueCategory");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueCategoryPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds a user as assignee to the issue
    */
    public MutationQuery addAssignee(AddAssigneeInput input, AddAssigneePayloadQueryDefinition queryDef) {
        startField("addAssignee");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddAssigneePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Unassignes a user that is currently an assinee on an issue
    */
    public MutationQuery removeAssignee(RemoveAssigneeInput input, RemoveAssigneePayloadQueryDefinition queryDef) {
        startField("removeAssignee");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveAssigneePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Closes an open issue
    */
    public MutationQuery closeIssue(CloseIssueInput input, CloseIssuePayloadQueryDefinition queryDef) {
        startField("closeIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CloseIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReopenIssueArguments extends Arguments {
        ReopenIssueArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public ReopenIssueArguments input(ReopenIssueInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ReopenIssueArgumentsDefinition {
        void define(ReopenIssueArguments args);
    }

    /**
    * Reopen an issue after it has been closed
    */
    public MutationQuery reopenIssue(ReopenIssuePayloadQueryDefinition queryDef) {
        return reopenIssue(args -> {}, queryDef);
    }

    /**
    * Reopen an issue after it has been closed
    */
    public MutationQuery reopenIssue(ReopenIssueArgumentsDefinition argsDef, ReopenIssuePayloadQueryDefinition queryDef) {
        startField("reopenIssue");

        ReopenIssueArguments args = new ReopenIssueArguments(_queryBuilder);
        argsDef.define(args);
        ReopenIssueArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReopenIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ChangeIssuePriorityArguments extends Arguments {
        ChangeIssuePriorityArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public ChangeIssuePriorityArguments input(ChangeIssuePriorityInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ChangeIssuePriorityArgumentsDefinition {
        void define(ChangeIssuePriorityArguments args);
    }

    /**
    * Changes the priority of an issue
    */
    public MutationQuery changeIssuePriority(ChangeIssuePriorityPayloadQueryDefinition queryDef) {
        return changeIssuePriority(args -> {}, queryDef);
    }

    /**
    * Changes the priority of an issue
    */
    public MutationQuery changeIssuePriority(ChangeIssuePriorityArgumentsDefinition argsDef, ChangeIssuePriorityPayloadQueryDefinition queryDef) {
        startField("changeIssuePriority");

        ChangeIssuePriorityArguments args = new ChangeIssuePriorityArguments(_queryBuilder);
        argsDef.define(args);
        ChangeIssuePriorityArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssuePriorityPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ChangeIssueStartDateArguments extends Arguments {
        ChangeIssueStartDateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public ChangeIssueStartDateArguments input(ChangeIssueStartDateInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ChangeIssueStartDateArgumentsDefinition {
        void define(ChangeIssueStartDateArguments args);
    }

    /**
    * Changes the set start date on an issue
    */
    public MutationQuery changeIssueStartDate(ChangeIssueStartDatePayloadQueryDefinition queryDef) {
        return changeIssueStartDate(args -> {}, queryDef);
    }

    /**
    * Changes the set start date on an issue
    */
    public MutationQuery changeIssueStartDate(ChangeIssueStartDateArgumentsDefinition argsDef, ChangeIssueStartDatePayloadQueryDefinition queryDef) {
        startField("changeIssueStartDate");

        ChangeIssueStartDateArguments args = new ChangeIssueStartDateArguments(_queryBuilder);
        argsDef.define(args);
        ChangeIssueStartDateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueStartDatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Changes the set due date on an issue
    */
    public MutationQuery changeIssueDueDate(ChangeIssueDueDateInput input, ChangeIssueDueDatePayloadQueryDefinition queryDef) {
        startField("changeIssueDueDate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueDueDatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ChangeIssueEstimatedTimeArguments extends Arguments {
        ChangeIssueEstimatedTimeArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public ChangeIssueEstimatedTimeArguments input(ChangeIssueEstimatedTimeInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface ChangeIssueEstimatedTimeArgumentsDefinition {
        void define(ChangeIssueEstimatedTimeArguments args);
    }

    /**
    * Changes the set estimated time on an issue
    */
    public MutationQuery changeIssueEstimatedTime(ChangeIssueEstimatedTimePayloadQueryDefinition queryDef) {
        return changeIssueEstimatedTime(args -> {}, queryDef);
    }

    /**
    * Changes the set estimated time on an issue
    */
    public MutationQuery changeIssueEstimatedTime(ChangeIssueEstimatedTimeArgumentsDefinition argsDef, ChangeIssueEstimatedTimePayloadQueryDefinition queryDef) {
        startField("changeIssueEstimatedTime");

        ChangeIssueEstimatedTimeArguments args = new ChangeIssueEstimatedTimeArguments(_queryBuilder);
        argsDef.define(args);
        ChangeIssueEstimatedTimeArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueEstimatedTimePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds an issue to a location (location or interface)
    */
    public MutationQuery addIssueToLocation(AddIssueToLocationInput input, AddIssueToLocationPayloadQueryDefinition queryDef) {
        startField("addIssueToLocation");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddIssueToLocationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveIssueFromLocationArguments extends Arguments {
        RemoveIssueFromLocationArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public RemoveIssueFromLocationArguments input(RemoveIssueFromLocationInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveIssueFromLocationArgumentsDefinition {
        void define(RemoveIssueFromLocationArguments args);
    }

    /**
    * Removes an issue from an issue location it was assigned to
    */
    public MutationQuery removeIssueFromLocation(RemoveIssueFromLocationPayloadQueryDefinition queryDef) {
        return removeIssueFromLocation(args -> {}, queryDef);
    }

    /**
    * Removes an issue from an issue location it was assigned to
    */
    public MutationQuery removeIssueFromLocation(RemoveIssueFromLocationArgumentsDefinition argsDef, RemoveIssueFromLocationPayloadQueryDefinition queryDef) {
        startField("removeIssueFromLocation");

        RemoveIssueFromLocationArguments args = new RemoveIssueFromLocationArguments(_queryBuilder);
        argsDef.define(args);
        RemoveIssueFromLocationArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveIssueFromLocationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds an issue to a component (including creating the issue on the ims of the component)
    */
    public MutationQuery addIssueToComponent(AddIssueToComponentInput input, AddIssueToComponentPayloadQueryDefinition queryDef) {
        startField("addIssueToComponent");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddIssueToComponentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveIssueFromComponentArguments extends Arguments {
        RemoveIssueFromComponentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public RemoveIssueFromComponentArguments input(RemoveIssueFromComponentInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveIssueFromComponentArgumentsDefinition {
        void define(RemoveIssueFromComponentArguments args);
    }

    /**
    * Removes an issue from a component it is currently assigned to and deletes it from the ims of the
    * component
    */
    public MutationQuery removeIssueFromComponent(RemoveIssueFromComponentPayloadQueryDefinition queryDef) {
        return removeIssueFromComponent(args -> {}, queryDef);
    }

    /**
    * Removes an issue from a component it is currently assigned to and deletes it from the ims of the
    * component
    */
    public MutationQuery removeIssueFromComponent(RemoveIssueFromComponentArgumentsDefinition argsDef, RemoveIssueFromComponentPayloadQueryDefinition queryDef) {
        startField("removeIssueFromComponent");

        RemoveIssueFromComponentArguments args = new RemoveIssueFromComponentArguments(_queryBuilder);
        argsDef.define(args);
        RemoveIssueFromComponentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveIssueFromComponentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class MarkIssueAsDuplicateArguments extends Arguments {
        MarkIssueAsDuplicateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public MarkIssueAsDuplicateArguments input(MarkIssueAsDuplicateInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface MarkIssueAsDuplicateArgumentsDefinition {
        void define(MarkIssueAsDuplicateArguments args);
    }

    /**
    * Marks an issue as being a duplicate of another issue
    */
    public MutationQuery markIssueAsDuplicate(MarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        return markIssueAsDuplicate(args -> {}, queryDef);
    }

    /**
    * Marks an issue as being a duplicate of another issue
    */
    public MutationQuery markIssueAsDuplicate(MarkIssueAsDuplicateArgumentsDefinition argsDef, MarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        startField("markIssueAsDuplicate");

        MarkIssueAsDuplicateArguments args = new MarkIssueAsDuplicateArguments(_queryBuilder);
        argsDef.define(args);
        MarkIssueAsDuplicateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new MarkIssueAsDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UnmarkIssueAsDuplicateArguments extends Arguments {
        UnmarkIssueAsDuplicateArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public UnmarkIssueAsDuplicateArguments input(UnmarkIssueAsDuplicateInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface UnmarkIssueAsDuplicateArgumentsDefinition {
        void define(UnmarkIssueAsDuplicateArguments args);
    }

    /**
    * Remove the marking on an issue that it is a duplicate of another issue
    */
    public MutationQuery unmarkIssueAsDuplicate(UnmarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        return unmarkIssueAsDuplicate(args -> {}, queryDef);
    }

    /**
    * Remove the marking on an issue that it is a duplicate of another issue
    */
    public MutationQuery unmarkIssueAsDuplicate(UnmarkIssueAsDuplicateArgumentsDefinition argsDef, UnmarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        startField("unmarkIssueAsDuplicate");

        UnmarkIssueAsDuplicateArguments args = new UnmarkIssueAsDuplicateArguments(_queryBuilder);
        argsDef.define(args);
        UnmarkIssueAsDuplicateArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UnmarkIssueAsDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AddReactionToCommentArguments extends Arguments {
        AddReactionToCommentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public AddReactionToCommentArguments input(AddReactionToCommentInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface AddReactionToCommentArgumentsDefinition {
        void define(AddReactionToCommentArguments args);
    }

    /**
    * Adds a reaction by the current user to a comment (issue body or issue comment)
    */
    public MutationQuery addReactionToComment(AddReactionToCommentPayloadQueryDefinition queryDef) {
        return addReactionToComment(args -> {}, queryDef);
    }

    /**
    * Adds a reaction by the current user to a comment (issue body or issue comment)
    */
    public MutationQuery addReactionToComment(AddReactionToCommentArgumentsDefinition argsDef, AddReactionToCommentPayloadQueryDefinition queryDef) {
        startField("addReactionToComment");

        AddReactionToCommentArguments args = new AddReactionToCommentArguments(_queryBuilder);
        argsDef.define(args);
        AddReactionToCommentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new AddReactionToCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class RemoveReactionFromCommentArguments extends Arguments {
        RemoveReactionFromCommentArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * The data for the mutation
        */
        public RemoveReactionFromCommentArguments input(RemoveReactionFromCommentInput value) {
            if (value != null) {
                startArgument("input");
                value.appendTo(_queryBuilder);
            }
            return this;
        }
    }

    public interface RemoveReactionFromCommentArgumentsDefinition {
        void define(RemoveReactionFromCommentArguments args);
    }

    /**
    * Remove a reaction from a comment which was added by the current user (issue body or issue comment)
    */
    public MutationQuery removeReactionFromComment(RemoveReactionFromCommentPayloadQueryDefinition queryDef) {
        return removeReactionFromComment(args -> {}, queryDef);
    }

    /**
    * Remove a reaction from a comment which was added by the current user (issue body or issue comment)
    */
    public MutationQuery removeReactionFromComment(RemoveReactionFromCommentArgumentsDefinition argsDef, RemoveReactionFromCommentPayloadQueryDefinition queryDef) {
        startField("removeReactionFromComment");

        RemoveReactionFromCommentArguments args = new RemoveReactionFromCommentArguments(_queryBuilder);
        argsDef.define(args);
        RemoveReactionFromCommentArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new RemoveReactionFromCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new project
    */
    public MutationQuery createProject(CreateProjectInput input, CreateProjectPayloadQueryDefinition queryDef) {
        startField("createProject");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateProjectPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Delets the specified project
    */
    public MutationQuery deleteProject(DeleteProjectInput input, DeleteProjectPayloadQueryDefinition queryDef) {
        startField("deleteProject");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteProjectPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Updates the specified project
    */
    public MutationQuery updateProject(UpdateProjectInput input, UpdateProjectPayloadQueryDefinition queryDef) {
        startField("updateProject");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UpdateProjectPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Adds the specified component to the project if it is not already on the project
    */
    public MutationQuery addComponentToProject(AddComponentToProjectInput input, AddComponentToProjectPayloadQueryDefinition queryDef) {
        startField("addComponentToProject");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddComponentToProjectPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Removes the specified component from the project if it is on the project
    */
    public MutationQuery removeComponentFromProject(RemoveComponentFromProjectInput input, RemoveComponentFromProjectPayloadQueryDefinition queryDef) {
        startField("removeComponentFromProject");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveComponentFromProjectPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new component in the ccims and adds it to the given users
    */
    public MutationQuery createComponent(CreateComponentInput input, CreateComponentPayloadQueryDefinition queryDef) {
        startField("createComponent");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateComponentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Creates a new user in the system
    */
    public MutationQuery createUser(CreateUserInput input, CreateUserPayloadQueryDefinition queryDef) {
        startField("createUser");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateUserPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * Create a new label in the system
    */
    public MutationQuery createLabel(CreateLabelInput input, CreateLabelPayloadQueryDefinition queryDef) {
        startField("createLabel");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateLabelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
