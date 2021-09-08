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
public class IssueQuery extends Query<IssueQuery> {
    IssueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The title to display for this issue.
    * Not unique; Max. 256 characters
    */
    public IssueQuery title() {
        startField("title");

        return this;
    }

    /**
    * The body text of the issue.
    * Markdown supported.
    * Max. 65536 characters
    */
    public IssueQuery body() {
        startField("body");

        return this;
    }

    /**
    * The body text of the issue rendered to html
    */
    public IssueQuery bodyRendered() {
        startField("bodyRendered");

        return this;
    }

    /**
    * The user who originally created the issue (in ccims or any ims)
    */
    public IssueQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * A list of all people who edited the root of this issue (body and title)
    */
    public IssueQuery editedBy(UserQueryDefinition queryDef) {
        startField("editedBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    /**
    * The date the issue was first created on
    */
    public IssueQuery createdAt() {
        startField("createdAt");

        return this;
    }

    /**
    * Date when the core issue(title, body etc.) was last changed (comments and other events DO NOT count)
    */
    public IssueQuery lastEditedAt() {
        startField("lastEditedAt");

        return this;
    }

    /**
    * Date when any update / activity was made to any part of the issue (__including__ title, commens,
    * reactions)
    */
    public IssueQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    /**
    * `true` iff the issue is open at this point
    */
    public IssueQuery isOpen() {
        startField("isOpen");

        return this;
    }

    /**
    * Weather or not this issue has been marked as duplicate of another issue
    */
    public IssueQuery isDuplicate() {
        startField("isDuplicate");

        return this;
    }

    /**
    * The ccims-issue-category the issue belongs to.
    * This can be one of BUG,FEATURE_REQUEST or UNCLASSIFIED
    */
    public IssueQuery category() {
        startField("category");

        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to edit this issue.
    * This only refers to editing the core issue (title, body, etc.)
    */
    public IssueQuery currentUserCanEdit() {
        startField("currentUserCanEdit");

        return this;
    }

    /**
    * `true` iff the user authenticated by the given JWT is permitted to comment on this issue.
    */
    public IssueQuery currentUserCanComment() {
        startField("currentUserCanComment");

        return this;
    }

    /**
    * A start date set for start of work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */
    public IssueQuery startDate() {
        startField("startDate");

        return this;
    }

    /**
    * A due date set when work on the issue must be done.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */
    public IssueQuery dueDate() {
        startField("dueDate");

        return this;
    }

    /**
    * The time estimated needed for work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */
    public IssueQuery estimatedTime() {
        startField("estimatedTime");

        return this;
    }

    /**
    * The time already spent on work on this issue.
    * This is only for displaying and has no effect on the ccims but will be synce to other ims
    */
    public IssueQuery spentTime() {
        startField("spentTime");

        return this;
    }

    public class IssueCommentsArguments extends Arguments {
        IssueCommentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issue comments AFTER one with the given cursor (exclusive)
        */
        public IssueCommentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issue comments BEFORE the one with the given cursor (exclusive)
        */
        public IssueCommentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issue comments matching this filter will be returned
        */
        public IssueCommentsArguments filterBy(IssueCommentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issue comments matching the filter
        */
        public IssueCommentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issue comments matching the filter
        */
        public IssueCommentsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssueCommentsArgumentsDefinition {
        void define(IssueCommentsArguments args);
    }

    /**
    * All issue comments on this issue
    */
    public IssueQuery issueComments(IssueCommentPageQueryDefinition queryDef) {
        return issueComments(args -> {}, queryDef);
    }

    /**
    * All issue comments on this issue
    */
    public IssueQuery issueComments(IssueCommentsArgumentsDefinition argsDef, IssueCommentPageQueryDefinition queryDef) {
        startField("issueComments");

        IssueCommentsArguments args = new IssueCommentsArguments(_queryBuilder);
        argsDef.define(args);
        IssueCommentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LinksToIssuesArguments extends Arguments {
        LinksToIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public LinksToIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public LinksToIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public LinksToIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public LinksToIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public LinksToIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinksToIssuesArgumentsDefinition {
        void define(LinksToIssuesArguments args);
    }

    /**
    * All issues linked to from issue (this issue is __origin__ of relation, matching the given filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery linksToIssues(IssuePageQueryDefinition queryDef) {
        return linksToIssues(args -> {}, queryDef);
    }

    /**
    * All issues linked to from issue (this issue is __origin__ of relation, matching the given filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery linksToIssues(LinksToIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("linksToIssues");

        LinksToIssuesArguments args = new LinksToIssuesArguments(_queryBuilder);
        argsDef.define(args);
        LinksToIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LinkedByIssuesArguments extends Arguments {
        LinkedByIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public LinkedByIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public LinkedByIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public LinkedByIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public LinkedByIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public LinkedByIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinkedByIssuesArgumentsDefinition {
        void define(LinkedByIssuesArguments args);
    }

    /**
    * All issues linking to this issue (this issue is __destination__ of relation), matching the given
    * filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery linkedByIssues(IssuePageQueryDefinition queryDef) {
        return linkedByIssues(args -> {}, queryDef);
    }

    /**
    * All issues linking to this issue (this issue is __destination__ of relation), matching the given
    * filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery linkedByIssues(LinkedByIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("linkedByIssues");

        LinkedByIssuesArguments args = new LinkedByIssuesArguments(_queryBuilder);
        argsDef.define(args);
        LinkedByIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ReactionsArguments extends Arguments {
        ReactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only reactions AFTER one with the given cursor (exclusive)
        */
        public ReactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only reactions BEFORE the one with the given cursor (exclusive)
        */
        public ReactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only reactions matching this filter will be returned
        */
        public ReactionsArguments filterBy(ReactionGroupFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ reactions matching the filter
        */
        public ReactionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ reactions matching the filter
        */
        public ReactionsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReactionsArgumentsDefinition {
        void define(ReactionsArguments args);
    }

    /**
    * All reactions that have been added to the body of this issue
    */
    public IssueQuery reactions(ReactionGroupPageQueryDefinition queryDef) {
        return reactions(args -> {}, queryDef);
    }

    /**
    * All reactions that have been added to the body of this issue
    */
    public IssueQuery reactions(ReactionsArgumentsDefinition argsDef, ReactionGroupPageQueryDefinition queryDef) {
        startField("reactions");

        ReactionsArguments args = new ReactionsArguments(_queryBuilder);
        argsDef.define(args);
        ReactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReactionGroupPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssigneesArguments extends Arguments {
        AssigneesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only users AFTER one with the given cursor (exclusive)
        */
        public AssigneesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only users BEFORE the one with the given cursor (exclusive)
        */
        public AssigneesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only users matching this filter will be returned
        */
        public AssigneesArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ users matching the filter
        */
        public AssigneesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ users matching the filter
        */
        public AssigneesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssigneesArgumentsDefinition {
        void define(AssigneesArguments args);
    }

    /**
    * All users who are explicitely assigned to issue, matching the given filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery assignees(UserPageQueryDefinition queryDef) {
        return assignees(args -> {}, queryDef);
    }

    /**
    * All users who are explicitely assigned to issue, matching the given filter.
    * If no filter is given, all issues will be returned
    */
    public IssueQuery assignees(AssigneesArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("assignees");

        AssigneesArguments args = new AssigneesArguments(_queryBuilder);
        argsDef.define(args);
        AssigneesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LabelsArguments extends Arguments {
        LabelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only labels AFTER one with the given cursor (exclusive)
        */
        public LabelsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only labels BEFORE the one with the given cursor (exclusive)
        */
        public LabelsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only labels matching this filter will be returned
        */
        public LabelsArguments filterBy(LabelFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ labels matching the filter
        */
        public LabelsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ labels matching the filter
        */
        public LabelsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LabelsArgumentsDefinition {
        void define(LabelsArguments args);
    }

    /**
    * All labels that are currently assigned to this issue
    */
    public IssueQuery labels(LabelPageQueryDefinition queryDef) {
        return labels(args -> {}, queryDef);
    }

    /**
    * All labels that are currently assigned to this issue
    */
    public IssueQuery labels(LabelsArgumentsDefinition argsDef, LabelPageQueryDefinition queryDef) {
        startField("labels");

        LabelsArguments args = new LabelsArguments(_queryBuilder);
        argsDef.define(args);
        LabelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LabelPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParticipantsArguments extends Arguments {
        ParticipantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only users AFTER one with the given cursor (exclusive)
        */
        public ParticipantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only users BEFORE the one with the given cursor (exclusive)
        */
        public ParticipantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only users matching this filter will be returned
        */
        public ParticipantsArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ users matching the filter
        */
        public ParticipantsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ users matching the filter
        */
        public ParticipantsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParticipantsArgumentsDefinition {
        void define(ParticipantsArguments args);
    }

    /**
    * All users participating on this issue (by writing a comment, etc.), matching the given filter.
    * If no filter is given, all users will be returned
    */
    public IssueQuery participants(UserPageQueryDefinition queryDef) {
        return participants(args -> {}, queryDef);
    }

    /**
    * All users participating on this issue (by writing a comment, etc.), matching the given filter.
    * If no filter is given, all users will be returned
    */
    public IssueQuery participants(ParticipantsArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("participants");

        ParticipantsArguments args = new ParticipantsArguments(_queryBuilder);
        argsDef.define(args);
        ParticipantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PinnedOnArguments extends Arguments {
        PinnedOnArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only components AFTER one with the given cursor (exclusive)
        */
        public PinnedOnArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only components BEFORE the one with the given cursor (exclusive)
        */
        public PinnedOnArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only components matching this filter will be returned
        */
        public PinnedOnArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ components matching the filter
        */
        public PinnedOnArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ components matching the filter
        */
        public PinnedOnArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PinnedOnArgumentsDefinition {
        void define(PinnedOnArguments args);
    }

    /**
    * All components where this issue has been pinned, matching the given filter.
    * If no filter is given, all components will be returned
    */
    public IssueQuery pinnedOn(ComponentPageQueryDefinition queryDef) {
        return pinnedOn(args -> {}, queryDef);
    }

    /**
    * All components where this issue has been pinned, matching the given filter.
    * If no filter is given, all components will be returned
    */
    public IssueQuery pinnedOn(PinnedOnArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("pinnedOn");

        PinnedOnArguments args = new PinnedOnArguments(_queryBuilder);
        argsDef.define(args);
        PinnedOnArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TimelineArguments extends Arguments {
        TimelineArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only timeline items AFTER one with the given cursor (exclusive)
        */
        public TimelineArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only timeline items BEFORE the one with the given cursor (exclusive)
        */
        public TimelineArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only timeline items matching this filter will be returned
        */
        public TimelineArguments filterBy(IssueTimelineItemFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ timeline items matching the filter
        */
        public TimelineArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ timeline items matching the filter
        */
        public TimelineArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TimelineArgumentsDefinition {
        void define(TimelineArguments args);
    }

    /**
    * All timeline events for this issue in chonological order from oldest to newest, matching (if given)
    * `filterBy`
    */
    public IssueQuery timeline(IssueTimelineItemPageQueryDefinition queryDef) {
        return timeline(args -> {}, queryDef);
    }

    /**
    * All timeline events for this issue in chonological order from oldest to newest, matching (if given)
    * `filterBy`
    */
    public IssueQuery timeline(TimelineArgumentsDefinition argsDef, IssueTimelineItemPageQueryDefinition queryDef) {
        startField("timeline");

        TimelineArguments args = new TimelineArguments(_queryBuilder);
        argsDef.define(args);
        TimelineArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationsArguments extends Arguments {
        LocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issue locations AFTER one with the given cursor (exclusive)
        */
        public LocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issue locations BEFORE the one with the given cursor (exclusive)
        */
        public LocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issue locations matching this filter will be returned
        */
        public LocationsArguments filterBy(IssueLocationFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issue locations matching the filter
        */
        public LocationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issue locations matching the filter
        */
        public LocationsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsArgumentsDefinition {
        void define(LocationsArguments args);
    }

    /**
    * All issue locations this issue is assigned to, matching (if given) `filterBy`
    */
    public IssueQuery locations(IssueLocationPageQueryDefinition queryDef) {
        return locations(args -> {}, queryDef);
    }

    /**
    * All issue locations this issue is assigned to, matching (if given) `filterBy`
    */
    public IssueQuery locations(LocationsArgumentsDefinition argsDef, IssueLocationPageQueryDefinition queryDef) {
        startField("locations");

        LocationsArguments args = new LocationsArguments(_queryBuilder);
        argsDef.define(args);
        LocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueLocationPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
