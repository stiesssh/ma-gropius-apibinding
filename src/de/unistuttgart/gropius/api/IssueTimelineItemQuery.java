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
* An event in the timeline of an issue with a date and a creator
*/
public class IssueTimelineItemQuery extends Query<IssueTimelineItemQuery> {
    IssueTimelineItemQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The unique id of this timeline item
    */
    public IssueTimelineItemQuery id() {
        startField("id");

        return this;
    }

    /**
    * The issue this timeline event belongs to
    */
    public IssueTimelineItemQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The user responsible for the creation of the event (e.g. autor of a comment)
    * It's possible there is no autor, for example if the action was performed automatically
    */
    public IssueTimelineItemQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the event occured on/was created.
    * This ISN'T updated if the event is be changed
    */
    public IssueTimelineItemQuery createdAt() {
        startField("createdAt");

        return this;
    }

    public IssueTimelineItemQuery onAddedToComponentEvent(AddedToComponentEventQueryDefinition queryDef) {
        startInlineFragment("AddedToComponentEvent");
        queryDef.define(new AddedToComponentEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onAddedToLocationEvent(AddedToLocationEventQueryDefinition queryDef) {
        startInlineFragment("AddedToLocationEvent");
        queryDef.define(new AddedToLocationEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onAssignedEvent(AssignedEventQueryDefinition queryDef) {
        startInlineFragment("AssignedEvent");
        queryDef.define(new AssignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onCategoryChangedEvent(CategoryChangedEventQueryDefinition queryDef) {
        startInlineFragment("CategoryChangedEvent");
        queryDef.define(new CategoryChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onClosedEvent(ClosedEventQueryDefinition queryDef) {
        startInlineFragment("ClosedEvent");
        queryDef.define(new ClosedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onDeletedIssueComment(DeletedIssueCommentQueryDefinition queryDef) {
        startInlineFragment("DeletedIssueComment");
        queryDef.define(new DeletedIssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onDueDateChangedEvent(DueDateChangedEventQueryDefinition queryDef) {
        startInlineFragment("DueDateChangedEvent");
        queryDef.define(new DueDateChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onEstimatedTimeChangedEvent(EstimatedTimeChangedEventQueryDefinition queryDef) {
        startInlineFragment("EstimatedTimeChangedEvent");
        queryDef.define(new EstimatedTimeChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onIssueComment(IssueCommentQueryDefinition queryDef) {
        startInlineFragment("IssueComment");
        queryDef.define(new IssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onLabelledEvent(LabelledEventQueryDefinition queryDef) {
        startInlineFragment("LabelledEvent");
        queryDef.define(new LabelledEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onLinkEvent(LinkEventQueryDefinition queryDef) {
        startInlineFragment("LinkEvent");
        queryDef.define(new LinkEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onMarkedAsDuplicateEvent(MarkedAsDuplicateEventQueryDefinition queryDef) {
        startInlineFragment("MarkedAsDuplicateEvent");
        queryDef.define(new MarkedAsDuplicateEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onPinnedEvent(PinnedEventQueryDefinition queryDef) {
        startInlineFragment("PinnedEvent");
        queryDef.define(new PinnedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onPriorityChangedEvent(PriorityChangedEventQueryDefinition queryDef) {
        startInlineFragment("PriorityChangedEvent");
        queryDef.define(new PriorityChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onReferencedByIssueEvent(ReferencedByIssueEventQueryDefinition queryDef) {
        startInlineFragment("ReferencedByIssueEvent");
        queryDef.define(new ReferencedByIssueEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onReferencedByOtherEvent(ReferencedByOtherEventQueryDefinition queryDef) {
        startInlineFragment("ReferencedByOtherEvent");
        queryDef.define(new ReferencedByOtherEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onRemovedFromComponentEvent(RemovedFromComponentEventQueryDefinition queryDef) {
        startInlineFragment("RemovedFromComponentEvent");
        queryDef.define(new RemovedFromComponentEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onRemovedFromLocationEvent(RemovedFromLocationEventQueryDefinition queryDef) {
        startInlineFragment("RemovedFromLocationEvent");
        queryDef.define(new RemovedFromLocationEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onRenamedTitleEvent(RenamedTitleEventQueryDefinition queryDef) {
        startInlineFragment("RenamedTitleEvent");
        queryDef.define(new RenamedTitleEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onReopenedEvent(ReopenedEventQueryDefinition queryDef) {
        startInlineFragment("ReopenedEvent");
        queryDef.define(new ReopenedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onStartDateChangedEvent(StartDateChangedEventQueryDefinition queryDef) {
        startInlineFragment("StartDateChangedEvent");
        queryDef.define(new StartDateChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onUnassignedEvent(UnassignedEventQueryDefinition queryDef) {
        startInlineFragment("UnassignedEvent");
        queryDef.define(new UnassignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onUnlabelledEvent(UnlabelledEventQueryDefinition queryDef) {
        startInlineFragment("UnlabelledEvent");
        queryDef.define(new UnlabelledEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onUnlinkEvent(UnlinkEventQueryDefinition queryDef) {
        startInlineFragment("UnlinkEvent");
        queryDef.define(new UnlinkEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onUnmarkedAsDuplicateEvent(UnmarkedAsDuplicateEventQueryDefinition queryDef) {
        startInlineFragment("UnmarkedAsDuplicateEvent");
        queryDef.define(new UnmarkedAsDuplicateEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onUnpinnedEvent(UnpinnedEventQueryDefinition queryDef) {
        startInlineFragment("UnpinnedEvent");
        queryDef.define(new UnpinnedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onWasLinkedEvent(WasLinkedEventQueryDefinition queryDef) {
        startInlineFragment("WasLinkedEvent");
        queryDef.define(new WasLinkedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueTimelineItemQuery onWasUnlinkedEvent(WasUnlinkedEventQueryDefinition queryDef) {
        startInlineFragment("WasUnlinkedEvent");
        queryDef.define(new WasUnlinkedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
