/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * 
 * Generated by: https://openapi-generator.tech
 */


use reqwest;

use crate::{apis::ResponseContent, models};
use super::{Error, configuration};


/// struct for typed errors of method [`mod_bigbluebuttonbn_can_join`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnCanJoinError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_completion_validate`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnCompletionValidateError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_end_meeting`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnEndMeetingError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_get_join_url`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnGetJoinUrlError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_get_recordings`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnGetRecordingsError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_get_recordings_to_import`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnGetRecordingsToImportError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_meeting_info`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnMeetingInfoError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_update_recording`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnUpdateRecordingError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}

/// struct for typed errors of method [`mod_bigbluebuttonbn_view_bigbluebuttonbn`]
#[derive(Debug, Clone, Serialize, Deserialize)]
#[serde(untagged)]
pub enum ModBigbluebuttonbnViewBigbluebuttonbnError {
    Status400(models::ErrorResponse),
    UnknownValue(serde_json::Value),
}


/// Returns information if the current user can join or not.
pub async fn mod_bigbluebuttonbn_can_join(configuration: &configuration::Configuration, mod_bigbluebuttonbn_can_join_request: models::ModBigbluebuttonbnCanJoinRequest) -> Result<models::ModBigbluebuttonbnCanJoin200Response, Error<ModBigbluebuttonbnCanJoinError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_can_join", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_can_join_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnCanJoinError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Validate completion
pub async fn mod_bigbluebuttonbn_completion_validate(configuration: &configuration::Configuration, mod_bigbluebuttonbn_completion_validate_request: models::ModBigbluebuttonbnCompletionValidateRequest) -> Result<models::CoreCohortAddCohortMembers200Response, Error<ModBigbluebuttonbnCompletionValidateError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_completion_validate", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_completion_validate_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnCompletionValidateError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// End a meeting
pub async fn mod_bigbluebuttonbn_end_meeting(configuration: &configuration::Configuration, mod_bigbluebuttonbn_end_meeting_request: models::ModBigbluebuttonbnEndMeetingRequest) -> Result<models::CoreCohortAddCohortMembers200Response, Error<ModBigbluebuttonbnEndMeetingError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_end_meeting", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_end_meeting_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnEndMeetingError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns a list of bigbluebuttonbns in a provided list of courses, if no list is provided                             all bigbluebuttonbns that the user can view will be returned.
pub async fn mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses(configuration: &configuration::Configuration, mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request: models::ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesRequest) -> Result<models::ModBigbluebuttonbnGetBigbluebuttonbnsByCourses200Response, Error<ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_get_bigbluebuttonbns_by_courses_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnGetBigbluebuttonbnsByCoursesError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get the join URL for the meeting and create if it does not exist.
pub async fn mod_bigbluebuttonbn_get_join_url(configuration: &configuration::Configuration, mod_bigbluebuttonbn_can_join_request: models::ModBigbluebuttonbnCanJoinRequest) -> Result<models::ModBigbluebuttonbnGetJoinUrl200Response, Error<ModBigbluebuttonbnGetJoinUrlError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_get_join_url", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_can_join_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnGetJoinUrlError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns a list of recordings ready to be processed by a datatable.
pub async fn mod_bigbluebuttonbn_get_recordings(configuration: &configuration::Configuration, mod_bigbluebuttonbn_get_recordings_request: models::ModBigbluebuttonbnGetRecordingsRequest) -> Result<models::ModBigbluebuttonbnGetRecordings200Response, Error<ModBigbluebuttonbnGetRecordingsError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_get_recordings", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_get_recordings_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnGetRecordingsError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Returns a list of recordings ready to import to be processed by a datatable.
pub async fn mod_bigbluebuttonbn_get_recordings_to_import(configuration: &configuration::Configuration, mod_bigbluebuttonbn_get_recordings_to_import_request: models::ModBigbluebuttonbnGetRecordingsToImportRequest) -> Result<models::ModBigbluebuttonbnGetRecordingsToImport200Response, Error<ModBigbluebuttonbnGetRecordingsToImportError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_get_recordings_to_import", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_get_recordings_to_import_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnGetRecordingsToImportError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Get displayable information on the meeting
pub async fn mod_bigbluebuttonbn_meeting_info(configuration: &configuration::Configuration, mod_bigbluebuttonbn_meeting_info_request: models::ModBigbluebuttonbnMeetingInfoRequest) -> Result<models::ModBigbluebuttonbnMeetingInfo200Response, Error<ModBigbluebuttonbnMeetingInfoError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_meeting_info", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_meeting_info_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnMeetingInfoError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Update a single recording
pub async fn mod_bigbluebuttonbn_update_recording(configuration: &configuration::Configuration, mod_bigbluebuttonbn_update_recording_request: models::ModBigbluebuttonbnUpdateRecordingRequest) -> Result<serde_json::Value, Error<ModBigbluebuttonbnUpdateRecordingError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_update_recording", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_update_recording_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnUpdateRecordingError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

/// Trigger the course module viewed event and update the module completion status.
pub async fn mod_bigbluebuttonbn_view_bigbluebuttonbn(configuration: &configuration::Configuration, mod_bigbluebuttonbn_view_bigbluebuttonbn_request: models::ModBigbluebuttonbnViewBigbluebuttonbnRequest) -> Result<models::CoreCalendarDeleteSubscription200Response, Error<ModBigbluebuttonbnViewBigbluebuttonbnError>> {
    let local_var_configuration = configuration;

    let local_var_client = &local_var_configuration.client;

    let local_var_uri_str = format!("{}/mod_bigbluebuttonbn_view_bigbluebuttonbn", local_var_configuration.base_path);
    let mut local_var_req_builder = local_var_client.request(reqwest::Method::POST, local_var_uri_str.as_str());

    if let Some(ref local_var_user_agent) = local_var_configuration.user_agent {
        local_var_req_builder = local_var_req_builder.header(reqwest::header::USER_AGENT, local_var_user_agent.clone());
    }
    if let Some(ref local_var_apikey) = local_var_configuration.api_key {
        let local_var_key = local_var_apikey.key.clone();
        let local_var_value = match local_var_apikey.prefix {
            Some(ref local_var_prefix) => format!("{} {}", local_var_prefix, local_var_key),
            None => local_var_key,
        };
        local_var_req_builder = local_var_req_builder.header("Authorization", local_var_value);
    };
    local_var_req_builder = local_var_req_builder.json(&mod_bigbluebuttonbn_view_bigbluebuttonbn_request);

    let local_var_req = local_var_req_builder.build()?;
    let local_var_resp = local_var_client.execute(local_var_req).await?;

    let local_var_status = local_var_resp.status();
    let local_var_content = local_var_resp.text().await?;

    if !local_var_status.is_client_error() && !local_var_status.is_server_error() {
        serde_json::from_str(&local_var_content).map_err(Error::from)
    } else {
        let local_var_entity: Option<ModBigbluebuttonbnViewBigbluebuttonbnError> = serde_json::from_str(&local_var_content).ok();
        let local_var_error = ResponseContent { status: local_var_status, content: local_var_content, entity: local_var_entity };
        Err(Error::ResponseError(local_var_error))
    }
}

