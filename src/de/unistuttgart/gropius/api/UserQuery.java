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
public class UserQuery extends Query<UserQuery> {
    UserQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    /**
    * The unique username used for login
    */
    public UserQuery username() {
        startField("username");

        return this;
    }

    /**
    * The name of the user to display in the GUI
    */
    public UserQuery displayName() {
        startField("displayName");

        return this;
    }

    /**
    * The mail address of the user
    */
    public UserQuery email() {
        startField("email");

        return this;
    }

    public class ProjectsArguments extends Arguments {
        ProjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only projects AFTER one with the given cursor (exclusive)
        */
        public ProjectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only projects BEFORE the one with the given cursor (exclusive)
        */
        public ProjectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only projects matching this filter will be returned
        */
        public ProjectsArguments filterBy(ProjectFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ projects matching the filter
        */
        public ProjectsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ projects matching the filter
        */
        public ProjectsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProjectsArgumentsDefinition {
        void define(ProjectsArguments args);
    }

    /**
    * All the projects this user is a participant of matching `filterBy`
    */
    public UserQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    /**
    * All the projects this user is a participant of matching `filterBy`
    */
    public UserQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssignedToIssuesArguments extends Arguments {
        AssignedToIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public AssignedToIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public AssignedToIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public AssignedToIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public AssignedToIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public AssignedToIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssignedToIssuesArgumentsDefinition {
        void define(AssignedToIssuesArguments args);
    }

    /**
    * All issues that this the user is assigned to matching (if given) `filterBy`
    */
    public UserQuery assignedToIssues(IssuePageQueryDefinition queryDef) {
        return assignedToIssues(args -> {}, queryDef);
    }

    /**
    * All issues that this the user is assigned to matching (if given) `filterBy`
    */
    public UserQuery assignedToIssues(AssignedToIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("assignedToIssues");

        AssignedToIssuesArguments args = new AssignedToIssuesArguments(_queryBuilder);
        argsDef.define(args);
        AssignedToIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParticipantOfIssuesArguments extends Arguments {
        ParticipantOfIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        /**
        * Returns only issues AFTER one with the given cursor (exclusive)
        */
        public ParticipantOfIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Returns only issues BEFORE the one with the given cursor (exclusive)
        */
        public ParticipantOfIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        /**
        * Only issues matching this filter will be returned
        */
        public ParticipantOfIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        /**
        * Only return the first _n_ issues matching the filter
        */
        public ParticipantOfIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        /**
        * Only return the last _n_ issues matching the filter
        */
        public ParticipantOfIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParticipantOfIssuesArgumentsDefinition {
        void define(ParticipantOfIssuesArguments args);
    }

    /**
    * All issues that this the user is a participant of matching (if given) `filterBy`
    */
    public UserQuery participantOfIssues(IssuePageQueryDefinition queryDef) {
        return participantOfIssues(args -> {}, queryDef);
    }

    /**
    * All issues that this the user is a participant of matching (if given) `filterBy`
    */
    public UserQuery participantOfIssues(ParticipantOfIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("participantOfIssues");

        ParticipantOfIssuesArguments args = new ParticipantOfIssuesArguments(_queryBuilder);
        argsDef.define(args);
        ParticipantOfIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

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
    * All issue comments (not including issues) written by this user
    */
    public UserQuery issueComments(IssueCommentPageQueryDefinition queryDef) {
        return issueComments(args -> {}, queryDef);
    }

    /**
    * All issue comments (not including issues) written by this user
    */
    public UserQuery issueComments(IssueCommentsArgumentsDefinition argsDef, IssueCommentPageQueryDefinition queryDef) {
        startField("issueComments");

        IssueCommentsArguments args = new IssueCommentsArguments(_queryBuilder);
        argsDef.define(args);
        IssueCommentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
