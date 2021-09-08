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
* The type of the Issue management system. Currently only GitHub and ccims internal are available
*/
public enum IMSType {
    /**
    * The type of the Issue management system. Currently only GitHub and ccims internal are available
    */
    CCIMS,

    /**
    * GitHub (or GitHub enterprise server) is the IMS for the component
    */
    GITHUB,

    /**
    * Any instance of GitLab is used as issue management system
    */
    GITLAB,

    /**
    * Any instance of Jira is used as issue management system
    */
    JIRA,

    /**
    * Any instance of Redmine is used as issue management system
    */
    REDMINE,

    UNKNOWN_VALUE;

    public static IMSType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CCIMS": {
                return CCIMS;
            }

            case "GITHUB": {
                return GITHUB;
            }

            case "GITLAB": {
                return GITLAB;
            }

            case "JIRA": {
                return JIRA;
            }

            case "REDMINE": {
                return REDMINE;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CCIMS: {
                return "CCIMS";
            }

            case GITHUB: {
                return "GITHUB";
            }

            case GITLAB: {
                return "GITLAB";
            }

            case JIRA: {
                return "JIRA";
            }

            case REDMINE: {
                return "REDMINE";
            }

            default: {
                return "";
            }
        }
    }
}

