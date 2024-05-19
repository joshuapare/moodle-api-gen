# \MoodleApi

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**core_admin_set_block_protection**](MoodleApi.md#core_admin_set_block_protection) | **POST** /core_admin_set_block_protection | Set the protection state for a block plugin
[**core_admin_set_plugin_order**](MoodleApi.md#core_admin_set_plugin_order) | **POST** /core_admin_set_plugin_order | Set the order of a plugin
[**core_admin_set_plugin_state**](MoodleApi.md#core_admin_set_plugin_state) | **POST** /core_admin_set_plugin_state | Set the state of a plugin
[**core_auth_confirm_user**](MoodleApi.md#core_auth_confirm_user) | **POST** /core_auth_confirm_user | Confirm a user account.
[**core_auth_is_age_digital_consent_verification_enabled**](MoodleApi.md#core_auth_is_age_digital_consent_verification_enabled) | **POST** /core_auth_is_age_digital_consent_verification_enabled | Checks if age digital consent verification is enabled.
[**core_auth_is_minor**](MoodleApi.md#core_auth_is_minor) | **POST** /core_auth_is_minor | Requests a check if a user is a digital minor.
[**core_auth_request_password_reset**](MoodleApi.md#core_auth_request_password_reset) | **POST** /core_auth_request_password_reset | Requests a password reset.
[**core_auth_resend_confirmation_email**](MoodleApi.md#core_auth_resend_confirmation_email) | **POST** /core_auth_resend_confirmation_email | Resend confirmation email.
[**core_backup_get_async_backup_links_backup**](MoodleApi.md#core_backup_get_async_backup_links_backup) | **POST** /core_backup_get_async_backup_links_backup | Gets the data to use when updating the status table row in the UI for when an async backup completes.
[**core_backup_get_async_backup_links_restore**](MoodleApi.md#core_backup_get_async_backup_links_restore) | **POST** /core_backup_get_async_backup_links_restore | Gets the data to use when updating the status table row in the UI for when an async restore completes.
[**core_backup_get_async_backup_progress**](MoodleApi.md#core_backup_get_async_backup_progress) | **POST** /core_backup_get_async_backup_progress | Get the progress of an Asyncronhous backup.
[**core_backup_get_copy_progress**](MoodleApi.md#core_backup_get_copy_progress) | **POST** /core_backup_get_copy_progress | Gets the progress of course copy operations.
[**core_backup_submit_copy_form**](MoodleApi.md#core_backup_submit_copy_form) | **POST** /core_backup_submit_copy_form | Handles ajax submission of course copy form.
[**core_badges_get_user_badge_by_hash**](MoodleApi.md#core_badges_get_user_badge_by_hash) | **POST** /core_badges_get_user_badge_by_hash | Returns the badge awarded to a user by hash.
[**core_badges_get_user_badges**](MoodleApi.md#core_badges_get_user_badges) | **POST** /core_badges_get_user_badges | Returns the list of badges awarded to a user.
[**core_block_fetch_addable_blocks**](MoodleApi.md#core_block_fetch_addable_blocks) | **POST** /core_block_fetch_addable_blocks | Returns all addable blocks in a given page.
[**core_block_get_course_blocks**](MoodleApi.md#core_block_get_course_blocks) | **POST** /core_block_get_course_blocks | Returns blocks information for a course.
[**core_block_get_dashboard_blocks**](MoodleApi.md#core_block_get_dashboard_blocks) | **POST** /core_block_get_dashboard_blocks | Returns blocks information for the given user dashboard.
[**core_blog_get_entries**](MoodleApi.md#core_blog_get_entries) | **POST** /core_blog_get_entries | Returns blog entries.
[**core_blog_view_entries**](MoodleApi.md#core_blog_view_entries) | **POST** /core_blog_view_entries | Trigger the blog_entries_viewed event.
[**core_calendar_create_calendar_events**](MoodleApi.md#core_calendar_create_calendar_events) | **POST** /core_calendar_create_calendar_events | Create calendar events
[**core_calendar_delete_calendar_events**](MoodleApi.md#core_calendar_delete_calendar_events) | **POST** /core_calendar_delete_calendar_events | Delete calendar events
[**core_calendar_delete_subscription**](MoodleApi.md#core_calendar_delete_subscription) | **POST** /core_calendar_delete_subscription | Delete the calendar subscription
[**core_calendar_get_action_events_by_course**](MoodleApi.md#core_calendar_get_action_events_by_course) | **POST** /core_calendar_get_action_events_by_course | Get calendar action events by course
[**core_calendar_get_action_events_by_courses**](MoodleApi.md#core_calendar_get_action_events_by_courses) | **POST** /core_calendar_get_action_events_by_courses | Get calendar action events by courses
[**core_calendar_get_action_events_by_timesort**](MoodleApi.md#core_calendar_get_action_events_by_timesort) | **POST** /core_calendar_get_action_events_by_timesort | Get calendar action events by tiemsort
[**core_calendar_get_allowed_event_types**](MoodleApi.md#core_calendar_get_allowed_event_types) | **POST** /core_calendar_get_allowed_event_types | Get the type of events a user can create in the given course.
[**core_calendar_get_calendar_access_information**](MoodleApi.md#core_calendar_get_calendar_access_information) | **POST** /core_calendar_get_calendar_access_information | Convenience function to retrieve some permissions/access information for the given course calendar.
[**core_calendar_get_calendar_day_view**](MoodleApi.md#core_calendar_get_calendar_day_view) | **POST** /core_calendar_get_calendar_day_view | Fetch the day view data for a calendar
[**core_calendar_get_calendar_event_by_id**](MoodleApi.md#core_calendar_get_calendar_event_by_id) | **POST** /core_calendar_get_calendar_event_by_id | Get calendar event by id
[**core_calendar_get_calendar_events**](MoodleApi.md#core_calendar_get_calendar_events) | **POST** /core_calendar_get_calendar_events | Get calendar events
[**core_calendar_get_calendar_export_token**](MoodleApi.md#core_calendar_get_calendar_export_token) | **POST** /core_calendar_get_calendar_export_token | Return the auth token required for exporting a calendar.
[**core_calendar_get_calendar_monthly_view**](MoodleApi.md#core_calendar_get_calendar_monthly_view) | **POST** /core_calendar_get_calendar_monthly_view | Fetch the monthly view data for a calendar
[**core_calendar_get_calendar_upcoming_view**](MoodleApi.md#core_calendar_get_calendar_upcoming_view) | **POST** /core_calendar_get_calendar_upcoming_view | Fetch the upcoming view data for a calendar
[**core_calendar_get_timestamps**](MoodleApi.md#core_calendar_get_timestamps) | **POST** /core_calendar_get_timestamps | Fetch unix timestamps for given date times.
[**core_calendar_submit_create_update_form**](MoodleApi.md#core_calendar_submit_create_update_form) | **POST** /core_calendar_submit_create_update_form | Submit form data for event form
[**core_calendar_update_event_start_day**](MoodleApi.md#core_calendar_update_event_start_day) | **POST** /core_calendar_update_event_start_day | Update the start day (but not time) for an event.
[**core_change_editmode**](MoodleApi.md#core_change_editmode) | **POST** /core_change_editmode | Change the editing mode
[**core_cohort_add_cohort_members**](MoodleApi.md#core_cohort_add_cohort_members) | **POST** /core_cohort_add_cohort_members | Adds cohort members.
[**core_cohort_create_cohorts**](MoodleApi.md#core_cohort_create_cohorts) | **POST** /core_cohort_create_cohorts | Creates new cohorts.
[**core_cohort_delete_cohort_members**](MoodleApi.md#core_cohort_delete_cohort_members) | **POST** /core_cohort_delete_cohort_members | Deletes cohort members.
[**core_cohort_delete_cohorts**](MoodleApi.md#core_cohort_delete_cohorts) | **POST** /core_cohort_delete_cohorts | Deletes all specified cohorts.
[**core_cohort_get_cohort_members**](MoodleApi.md#core_cohort_get_cohort_members) | **POST** /core_cohort_get_cohort_members | Returns cohort members.
[**core_cohort_get_cohorts**](MoodleApi.md#core_cohort_get_cohorts) | **POST** /core_cohort_get_cohorts | Returns cohort details.
[**core_cohort_search_cohorts**](MoodleApi.md#core_cohort_search_cohorts) | **POST** /core_cohort_search_cohorts | Search for cohorts.
[**core_cohort_update_cohorts**](MoodleApi.md#core_cohort_update_cohorts) | **POST** /core_cohort_update_cohorts | Updates existing cohorts.
[**core_comment_add_comments**](MoodleApi.md#core_comment_add_comments) | **POST** /core_comment_add_comments | Adds a comment or comments.
[**core_comment_delete_comments**](MoodleApi.md#core_comment_delete_comments) | **POST** /core_comment_delete_comments | Deletes a comment or comments.
[**core_comment_get_comments**](MoodleApi.md#core_comment_get_comments) | **POST** /core_comment_get_comments | Returns comments.
[**core_competency_add_competency_to_course**](MoodleApi.md#core_competency_add_competency_to_course) | **POST** /core_competency_add_competency_to_course | Add the competency to a course
[**core_competency_add_competency_to_plan**](MoodleApi.md#core_competency_add_competency_to_plan) | **POST** /core_competency_add_competency_to_plan | Add the competency to a learning plan
[**core_competency_add_competency_to_template**](MoodleApi.md#core_competency_add_competency_to_template) | **POST** /core_competency_add_competency_to_template | Add the competency to a template
[**core_competency_add_related_competency**](MoodleApi.md#core_competency_add_related_competency) | **POST** /core_competency_add_related_competency | Adds a related competency
[**core_competency_approve_plan**](MoodleApi.md#core_competency_approve_plan) | **POST** /core_competency_approve_plan | Approve a plan.
[**core_competency_competency_framework_viewed**](MoodleApi.md#core_competency_competency_framework_viewed) | **POST** /core_competency_competency_framework_viewed | Log event competency framework viewed
[**core_competency_competency_viewed**](MoodleApi.md#core_competency_competency_viewed) | **POST** /core_competency_competency_viewed | Log event competency viewed
[**core_competency_complete_plan**](MoodleApi.md#core_competency_complete_plan) | **POST** /core_competency_complete_plan | Complete learning plan.
[**core_competency_count_competencies**](MoodleApi.md#core_competency_count_competencies) | **POST** /core_competency_count_competencies | Count a list of a competencies.
[**core_competency_count_competencies_in_course**](MoodleApi.md#core_competency_count_competencies_in_course) | **POST** /core_competency_count_competencies_in_course | List the competencies in a course
[**core_competency_count_competencies_in_template**](MoodleApi.md#core_competency_count_competencies_in_template) | **POST** /core_competency_count_competencies_in_template | Count a list of a competencies for a given template.
[**core_competency_count_competency_frameworks**](MoodleApi.md#core_competency_count_competency_frameworks) | **POST** /core_competency_count_competency_frameworks | Count a list of a competency frameworks.
[**core_competency_count_course_module_competencies**](MoodleApi.md#core_competency_count_course_module_competencies) | **POST** /core_competency_count_course_module_competencies | Count the competencies in a course module
[**core_competency_count_courses_using_competency**](MoodleApi.md#core_competency_count_courses_using_competency) | **POST** /core_competency_count_courses_using_competency | List the courses using a competency
[**core_competency_count_templates**](MoodleApi.md#core_competency_count_templates) | **POST** /core_competency_count_templates | Count a list of a learning plan templates.
[**core_competency_count_templates_using_competency**](MoodleApi.md#core_competency_count_templates_using_competency) | **POST** /core_competency_count_templates_using_competency | Count a list of a learning plan templates for a given competency.
[**core_competency_create_competency**](MoodleApi.md#core_competency_create_competency) | **POST** /core_competency_create_competency | Creates new competencies.
[**core_competency_create_competency_framework**](MoodleApi.md#core_competency_create_competency_framework) | **POST** /core_competency_create_competency_framework | Creates new competency frameworks.
[**core_competency_create_plan**](MoodleApi.md#core_competency_create_plan) | **POST** /core_competency_create_plan | Creates a learning plan.
[**core_competency_create_template**](MoodleApi.md#core_competency_create_template) | **POST** /core_competency_create_template | Creates new learning plan templates.
[**core_competency_create_user_evidence_competency**](MoodleApi.md#core_competency_create_user_evidence_competency) | **POST** /core_competency_create_user_evidence_competency | Create an evidence of prior learning relationship with a competency.
[**core_competency_delete_competency**](MoodleApi.md#core_competency_delete_competency) | **POST** /core_competency_delete_competency | Delete a competency.
[**core_competency_delete_competency_framework**](MoodleApi.md#core_competency_delete_competency_framework) | **POST** /core_competency_delete_competency_framework | Delete a competency framework.
[**core_competency_delete_evidence**](MoodleApi.md#core_competency_delete_evidence) | **POST** /core_competency_delete_evidence | Delete an evidence
[**core_competency_delete_plan**](MoodleApi.md#core_competency_delete_plan) | **POST** /core_competency_delete_plan | Delete a learning plan.
[**core_competency_delete_template**](MoodleApi.md#core_competency_delete_template) | **POST** /core_competency_delete_template | Delete a learning plan template.
[**core_competency_delete_user_evidence**](MoodleApi.md#core_competency_delete_user_evidence) | **POST** /core_competency_delete_user_evidence | Delete an evidence of prior learning.
[**core_competency_delete_user_evidence_competency**](MoodleApi.md#core_competency_delete_user_evidence_competency) | **POST** /core_competency_delete_user_evidence_competency | Delete an evidence of prior learning relationship with a competency.
[**core_competency_duplicate_competency_framework**](MoodleApi.md#core_competency_duplicate_competency_framework) | **POST** /core_competency_duplicate_competency_framework | Duplicate a competency framework.
[**core_competency_duplicate_template**](MoodleApi.md#core_competency_duplicate_template) | **POST** /core_competency_duplicate_template | Duplicate learning plan template.
[**core_competency_get_scale_values**](MoodleApi.md#core_competency_get_scale_values) | **POST** /core_competency_get_scale_values | Fetch the values for a specific scale
[**core_competency_grade_competency**](MoodleApi.md#core_competency_grade_competency) | **POST** /core_competency_grade_competency | Grade a competency.
[**core_competency_grade_competency_in_course**](MoodleApi.md#core_competency_grade_competency_in_course) | **POST** /core_competency_grade_competency_in_course | Grade a competency from the course page.
[**core_competency_grade_competency_in_plan**](MoodleApi.md#core_competency_grade_competency_in_plan) | **POST** /core_competency_grade_competency_in_plan | Grade a competency from the user plan page.
[**core_competency_list_competencies**](MoodleApi.md#core_competency_list_competencies) | **POST** /core_competency_list_competencies | Load a list of a competencies.
[**core_competency_list_competencies_in_template**](MoodleApi.md#core_competency_list_competencies_in_template) | **POST** /core_competency_list_competencies_in_template | Load a list of a competencies for a given template.
[**core_competency_list_competency_frameworks**](MoodleApi.md#core_competency_list_competency_frameworks) | **POST** /core_competency_list_competency_frameworks | Load a list of a competency frameworks.
[**core_competency_list_course_competencies**](MoodleApi.md#core_competency_list_course_competencies) | **POST** /core_competency_list_course_competencies | List the competencies in a course
[**core_competency_list_course_module_competencies**](MoodleApi.md#core_competency_list_course_module_competencies) | **POST** /core_competency_list_course_module_competencies | List the competencies in a course module
[**core_competency_list_plan_competencies**](MoodleApi.md#core_competency_list_plan_competencies) | **POST** /core_competency_list_plan_competencies | List the competencies in a plan
[**core_competency_list_templates**](MoodleApi.md#core_competency_list_templates) | **POST** /core_competency_list_templates | Load a list of a learning plan templates.
[**core_competency_list_templates_using_competency**](MoodleApi.md#core_competency_list_templates_using_competency) | **POST** /core_competency_list_templates_using_competency | Load a list of a learning plan templates for a given competency.
[**core_competency_list_user_plans**](MoodleApi.md#core_competency_list_user_plans) | **POST** /core_competency_list_user_plans | List a user's learning plans.
[**core_competency_move_down_competency**](MoodleApi.md#core_competency_move_down_competency) | **POST** /core_competency_move_down_competency | Re-order a competency.
[**core_competency_move_up_competency**](MoodleApi.md#core_competency_move_up_competency) | **POST** /core_competency_move_up_competency | Re-order a competency.
[**core_competency_plan_cancel_review_request**](MoodleApi.md#core_competency_plan_cancel_review_request) | **POST** /core_competency_plan_cancel_review_request | Cancel the review of a plan.
[**core_competency_plan_request_review**](MoodleApi.md#core_competency_plan_request_review) | **POST** /core_competency_plan_request_review | Request for a plan to be reviewed.
[**core_competency_plan_start_review**](MoodleApi.md#core_competency_plan_start_review) | **POST** /core_competency_plan_start_review | Start the review of a plan.
[**core_competency_plan_stop_review**](MoodleApi.md#core_competency_plan_stop_review) | **POST** /core_competency_plan_stop_review | Stop the review of a plan.
[**core_competency_read_competency**](MoodleApi.md#core_competency_read_competency) | **POST** /core_competency_read_competency | Load a summary of a competency.
[**core_competency_read_competency_framework**](MoodleApi.md#core_competency_read_competency_framework) | **POST** /core_competency_read_competency_framework | Load a summary of a competency framework.
[**core_competency_read_plan**](MoodleApi.md#core_competency_read_plan) | **POST** /core_competency_read_plan | Load a learning plan.
[**core_competency_read_template**](MoodleApi.md#core_competency_read_template) | **POST** /core_competency_read_template | Load a summary of a learning plan template.
[**core_competency_read_user_evidence**](MoodleApi.md#core_competency_read_user_evidence) | **POST** /core_competency_read_user_evidence | Read an evidence of prior learning.
[**core_competency_remove_competency_from_course**](MoodleApi.md#core_competency_remove_competency_from_course) | **POST** /core_competency_remove_competency_from_course | Remove a competency from a course
[**core_competency_remove_competency_from_plan**](MoodleApi.md#core_competency_remove_competency_from_plan) | **POST** /core_competency_remove_competency_from_plan | Remove the competency from a learning plan
[**core_competency_remove_competency_from_template**](MoodleApi.md#core_competency_remove_competency_from_template) | **POST** /core_competency_remove_competency_from_template | Remove a competency from a template
[**core_competency_remove_related_competency**](MoodleApi.md#core_competency_remove_related_competency) | **POST** /core_competency_remove_related_competency | Remove a related competency
[**core_competency_reopen_plan**](MoodleApi.md#core_competency_reopen_plan) | **POST** /core_competency_reopen_plan | Reopen learning plan.
[**core_competency_reorder_course_competency**](MoodleApi.md#core_competency_reorder_course_competency) | **POST** /core_competency_reorder_course_competency | Move a course competency to a new relative sort order.
[**core_competency_reorder_plan_competency**](MoodleApi.md#core_competency_reorder_plan_competency) | **POST** /core_competency_reorder_plan_competency | Move a plan competency to a new relative sort order.
[**core_competency_reorder_template_competency**](MoodleApi.md#core_competency_reorder_template_competency) | **POST** /core_competency_reorder_template_competency | Move a template competency to a new relative sort order.
[**core_competency_request_review_of_user_evidence_linked_competencies**](MoodleApi.md#core_competency_request_review_of_user_evidence_linked_competencies) | **POST** /core_competency_request_review_of_user_evidence_linked_competencies | Send user evidence competencies in review
[**core_competency_search_competencies**](MoodleApi.md#core_competency_search_competencies) | **POST** /core_competency_search_competencies | Search a list of a competencies.
[**core_competency_set_course_competency_ruleoutcome**](MoodleApi.md#core_competency_set_course_competency_ruleoutcome) | **POST** /core_competency_set_course_competency_ruleoutcome | Modify the ruleoutcome value for course competency
[**core_competency_set_parent_competency**](MoodleApi.md#core_competency_set_parent_competency) | **POST** /core_competency_set_parent_competency | Set a new parent for a competency.
[**core_competency_template_has_related_data**](MoodleApi.md#core_competency_template_has_related_data) | **POST** /core_competency_template_has_related_data | Check if a template has related data
[**core_competency_template_viewed**](MoodleApi.md#core_competency_template_viewed) | **POST** /core_competency_template_viewed | Log event template viewed
[**core_competency_unapprove_plan**](MoodleApi.md#core_competency_unapprove_plan) | **POST** /core_competency_unapprove_plan | Unapprove a plan.
[**core_competency_unlink_plan_from_template**](MoodleApi.md#core_competency_unlink_plan_from_template) | **POST** /core_competency_unlink_plan_from_template | Unlink a plan form it template.
[**core_competency_update_competency**](MoodleApi.md#core_competency_update_competency) | **POST** /core_competency_update_competency | Update a competency.
[**core_competency_update_competency_framework**](MoodleApi.md#core_competency_update_competency_framework) | **POST** /core_competency_update_competency_framework | Update a competency framework.
[**core_competency_update_course_competency_settings**](MoodleApi.md#core_competency_update_course_competency_settings) | **POST** /core_competency_update_course_competency_settings | Update the course competency settings
[**core_competency_update_plan**](MoodleApi.md#core_competency_update_plan) | **POST** /core_competency_update_plan | Updates a learning plan.
[**core_competency_update_template**](MoodleApi.md#core_competency_update_template) | **POST** /core_competency_update_template | Update a learning plan template.
[**core_competency_user_competency_cancel_review_request**](MoodleApi.md#core_competency_user_competency_cancel_review_request) | **POST** /core_competency_user_competency_cancel_review_request | Cancel a review request.
[**core_competency_user_competency_plan_viewed**](MoodleApi.md#core_competency_user_competency_plan_viewed) | **POST** /core_competency_user_competency_plan_viewed | Log the user competency plan viewed event.
[**core_competency_user_competency_request_review**](MoodleApi.md#core_competency_user_competency_request_review) | **POST** /core_competency_user_competency_request_review | Request a review.
[**core_competency_user_competency_start_review**](MoodleApi.md#core_competency_user_competency_start_review) | **POST** /core_competency_user_competency_start_review | Start a review.
[**core_competency_user_competency_stop_review**](MoodleApi.md#core_competency_user_competency_stop_review) | **POST** /core_competency_user_competency_stop_review | Stop a review.
[**core_competency_user_competency_viewed**](MoodleApi.md#core_competency_user_competency_viewed) | **POST** /core_competency_user_competency_viewed | Log the user competency viewed event.
[**core_competency_user_competency_viewed_in_course**](MoodleApi.md#core_competency_user_competency_viewed_in_course) | **POST** /core_competency_user_competency_viewed_in_course | Log the user competency viewed in course event
[**core_competency_user_competency_viewed_in_plan**](MoodleApi.md#core_competency_user_competency_viewed_in_plan) | **POST** /core_competency_user_competency_viewed_in_plan | Log the user competency viewed in plan event.
[**core_completion_get_activities_completion_status**](MoodleApi.md#core_completion_get_activities_completion_status) | **POST** /core_completion_get_activities_completion_status | Return the activities completion status for a user in a course.
[**core_completion_get_course_completion_status**](MoodleApi.md#core_completion_get_course_completion_status) | **POST** /core_completion_get_course_completion_status | Returns course completion status.
[**core_completion_mark_course_self_completed**](MoodleApi.md#core_completion_mark_course_self_completed) | **POST** /core_completion_mark_course_self_completed | Update the course completion status for the current user (if course self-completion is enabled).
[**core_completion_override_activity_completion_status**](MoodleApi.md#core_completion_override_activity_completion_status) | **POST** /core_completion_override_activity_completion_status | Update completion status for a user in an activity by overriding it.
[**core_completion_update_activity_completion_status_manually**](MoodleApi.md#core_completion_update_activity_completion_status_manually) | **POST** /core_completion_update_activity_completion_status_manually | Update completion status for the current user in an activity, only for activities with manual tracking.
[**core_contentbank_copy_content**](MoodleApi.md#core_contentbank_copy_content) | **POST** /core_contentbank_copy_content | Copy a content in the content bank.
[**core_contentbank_delete_content**](MoodleApi.md#core_contentbank_delete_content) | **POST** /core_contentbank_delete_content | Delete a content from the content bank.
[**core_contentbank_rename_content**](MoodleApi.md#core_contentbank_rename_content) | **POST** /core_contentbank_rename_content | Rename a content in the content bank.
[**core_contentbank_set_content_visibility**](MoodleApi.md#core_contentbank_set_content_visibility) | **POST** /core_contentbank_set_content_visibility | Set the visibility of a content in the content bank.
[**core_course_add_content_item_to_user_favourites**](MoodleApi.md#core_course_add_content_item_to_user_favourites) | **POST** /core_course_add_content_item_to_user_favourites | Adds a content item (activity, resource or their subtypes) to the favourites for the user.
[**core_course_check_updates**](MoodleApi.md#core_course_check_updates) | **POST** /core_course_check_updates | Check if there is updates affecting the user for the given course and contexts.
[**core_course_create_categories**](MoodleApi.md#core_course_create_categories) | **POST** /core_course_create_categories | Create course categories
[**core_course_create_courses**](MoodleApi.md#core_course_create_courses) | **POST** /core_course_create_courses | Create new courses
[**core_course_delete_categories**](MoodleApi.md#core_course_delete_categories) | **POST** /core_course_delete_categories | Delete course categories
[**core_course_delete_courses**](MoodleApi.md#core_course_delete_courses) | **POST** /core_course_delete_courses | Deletes all specified courses
[**core_course_delete_modules**](MoodleApi.md#core_course_delete_modules) | **POST** /core_course_delete_modules | Deletes all specified module instances
[**core_course_duplicate_course**](MoodleApi.md#core_course_duplicate_course) | **POST** /core_course_duplicate_course | Duplicate an existing course (creating a new one).
[**core_course_edit_module**](MoodleApi.md#core_course_edit_module) | **POST** /core_course_edit_module | Performs an action on course module (change visibility, duplicate, delete, etc.)
[**core_course_edit_section**](MoodleApi.md#core_course_edit_section) | **POST** /core_course_edit_section | Performs an action on course section (change visibility, set marker, delete)
[**core_course_get_activity_chooser_footer**](MoodleApi.md#core_course_get_activity_chooser_footer) | **POST** /core_course_get_activity_chooser_footer | Fetch the data for the activity chooser footer.
[**core_course_get_categories**](MoodleApi.md#core_course_get_categories) | **POST** /core_course_get_categories | Return category details
[**core_course_get_contents**](MoodleApi.md#core_course_get_contents) | **POST** /core_course_get_contents | Get course contents
[**core_course_get_course_content_items**](MoodleApi.md#core_course_get_course_content_items) | **POST** /core_course_get_course_content_items | Fetch all the content items (activities, resources and their subtypes) for the activity picker
[**core_course_get_course_module**](MoodleApi.md#core_course_get_course_module) | **POST** /core_course_get_course_module | Return information about a course module
[**core_course_get_course_module_by_instance**](MoodleApi.md#core_course_get_course_module_by_instance) | **POST** /core_course_get_course_module_by_instance | Return information about a given module name and instance id
[**core_course_get_courses**](MoodleApi.md#core_course_get_courses) | **POST** /core_course_get_courses | Return course details
[**core_course_get_courses_by_field**](MoodleApi.md#core_course_get_courses_by_field) | **POST** /core_course_get_courses_by_field | Get courses matching a specific field (id/s, shortname, idnumber, category)
[**core_course_get_enrolled_courses_by_timeline_classification**](MoodleApi.md#core_course_get_enrolled_courses_by_timeline_classification) | **POST** /core_course_get_enrolled_courses_by_timeline_classification | List of enrolled courses for the given timeline classification (past, inprogress, or future).
[**core_course_get_enrolled_courses_with_action_events_by_timeline_classification**](MoodleApi.md#core_course_get_enrolled_courses_with_action_events_by_timeline_classification) | **POST** /core_course_get_enrolled_courses_with_action_events_by_timeline_classification | List of enrolled courses with action events in a given timeframe, for the given timeline classification.
[**core_course_get_enrolled_users_by_cmid**](MoodleApi.md#core_course_get_enrolled_users_by_cmid) | **POST** /core_course_get_enrolled_users_by_cmid | List users by course module id, filter by group and active enrolment status.
[**core_course_get_module**](MoodleApi.md#core_course_get_module) | **POST** /core_course_get_module | Returns html with one activity module on course page
[**core_course_get_recent_courses**](MoodleApi.md#core_course_get_recent_courses) | **POST** /core_course_get_recent_courses | List of courses a user has accessed most recently.
[**core_course_get_updates_since**](MoodleApi.md#core_course_get_updates_since) | **POST** /core_course_get_updates_since | Check if there are updates affecting the user for the given course since the given time stamp.
[**core_course_get_user_administration_options**](MoodleApi.md#core_course_get_user_administration_options) | **POST** /core_course_get_user_administration_options | Return a list of administration options in a set of courses that are avaialable or not for the current                             user.
[**core_course_get_user_navigation_options**](MoodleApi.md#core_course_get_user_navigation_options) | **POST** /core_course_get_user_navigation_options | Return a list of navigation options in a set of courses that are avaialable or not for the current user.
[**core_course_import_course**](MoodleApi.md#core_course_import_course) | **POST** /core_course_import_course | Import course data from a course into another course. Does not include any user data.
[**core_course_remove_content_item_from_user_favourites**](MoodleApi.md#core_course_remove_content_item_from_user_favourites) | **POST** /core_course_remove_content_item_from_user_favourites | Removes a content item (activity, resource or their subtypes) from the favourites for the user.
[**core_course_search_courses**](MoodleApi.md#core_course_search_courses) | **POST** /core_course_search_courses | Search courses by (name, module, block, tag)
[**core_course_set_favourite_courses**](MoodleApi.md#core_course_set_favourite_courses) | **POST** /core_course_set_favourite_courses | Add a list of courses to the list of favourite courses.
[**core_course_toggle_activity_recommendation**](MoodleApi.md#core_course_toggle_activity_recommendation) | **POST** /core_course_toggle_activity_recommendation | Adds or removes an activity as a recommendation in the activity chooser.
[**core_course_update_categories**](MoodleApi.md#core_course_update_categories) | **POST** /core_course_update_categories | Update categories
[**core_course_update_courses**](MoodleApi.md#core_course_update_courses) | **POST** /core_course_update_courses | Update courses
[**core_course_view_course**](MoodleApi.md#core_course_view_course) | **POST** /core_course_view_course | Log that the course was viewed
[**core_courseformat_file_handlers**](MoodleApi.md#core_courseformat_file_handlers) | **POST** /core_courseformat_file_handlers | Get the current course file hanlders.
[**core_courseformat_get_state**](MoodleApi.md#core_courseformat_get_state) | **POST** /core_courseformat_get_state | Get the current course state.
[**core_courseformat_update_course**](MoodleApi.md#core_courseformat_update_course) | **POST** /core_courseformat_update_course | Update course contents.
[**core_create_userfeedback_action_record**](MoodleApi.md#core_create_userfeedback_action_record) | **POST** /core_create_userfeedback_action_record | Record the action that the user takes in the user feedback notification for future use.
[**core_customfield_create_category**](MoodleApi.md#core_customfield_create_category) | **POST** /core_customfield_create_category | Creates a new category
[**core_customfield_delete_category**](MoodleApi.md#core_customfield_delete_category) | **POST** /core_customfield_delete_category | Deletes a category
[**core_customfield_delete_field**](MoodleApi.md#core_customfield_delete_field) | **POST** /core_customfield_delete_field | Deletes an entry
[**core_customfield_move_category**](MoodleApi.md#core_customfield_move_category) | **POST** /core_customfield_move_category | Drag and drop categories
[**core_customfield_move_field**](MoodleApi.md#core_customfield_move_field) | **POST** /core_customfield_move_field | Drag and drop
[**core_customfield_reload_template**](MoodleApi.md#core_customfield_reload_template) | **POST** /core_customfield_reload_template | Reloads template
[**core_dynamic_tabs_get_content**](MoodleApi.md#core_dynamic_tabs_get_content) | **POST** /core_dynamic_tabs_get_content | Returns the content for a dynamic tab
[**core_enrol_get_course_enrolment_methods**](MoodleApi.md#core_enrol_get_course_enrolment_methods) | **POST** /core_enrol_get_course_enrolment_methods | Get the list of course enrolment methods
[**core_enrol_get_enrolled_users**](MoodleApi.md#core_enrol_get_enrolled_users) | **POST** /core_enrol_get_enrolled_users | Get enrolled users by course id.
[**core_enrol_get_enrolled_users_with_capability**](MoodleApi.md#core_enrol_get_enrolled_users_with_capability) | **POST** /core_enrol_get_enrolled_users_with_capability | For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability
[**core_enrol_get_potential_users**](MoodleApi.md#core_enrol_get_potential_users) | **POST** /core_enrol_get_potential_users | Get the list of potential users to enrol
[**core_enrol_get_users_courses**](MoodleApi.md#core_enrol_get_users_courses) | **POST** /core_enrol_get_users_courses | Get the list of courses where a user is enrolled in
[**core_enrol_search_users**](MoodleApi.md#core_enrol_search_users) | **POST** /core_enrol_search_users | Search within the list of course participants
[**core_enrol_submit_user_enrolment_form**](MoodleApi.md#core_enrol_submit_user_enrolment_form) | **POST** /core_enrol_submit_user_enrolment_form | Submit form data for enrolment form
[**core_enrol_unenrol_user_enrolment**](MoodleApi.md#core_enrol_unenrol_user_enrolment) | **POST** /core_enrol_unenrol_user_enrolment | External function that unenrols a given user enrolment
[**core_fetch_notifications**](MoodleApi.md#core_fetch_notifications) | **POST** /core_fetch_notifications | Return a list of notifications for the current session
[**core_files_delete_draft_files**](MoodleApi.md#core_files_delete_draft_files) | **POST** /core_files_delete_draft_files | Delete the indicated files (or directories) from a user draft file area.
[**core_files_get_files**](MoodleApi.md#core_files_get_files) | **POST** /core_files_get_files | browse moodle files
[**core_files_get_unused_draft_itemid**](MoodleApi.md#core_files_get_unused_draft_itemid) | **POST** /core_files_get_unused_draft_itemid | Generate a new draft itemid for the current user.
[**core_files_upload**](MoodleApi.md#core_files_upload) | **POST** /core_files_upload | upload a file to moodle
[**core_filters_get_available_in_context**](MoodleApi.md#core_filters_get_available_in_context) | **POST** /core_filters_get_available_in_context | Returns the filters available in the given contexts.
[**core_form_dynamic_form**](MoodleApi.md#core_form_dynamic_form) | **POST** /core_form_dynamic_form | Process submission of a dynamic (modal) form
[**core_form_get_filetypes_browser_data**](MoodleApi.md#core_form_get_filetypes_browser_data) | **POST** /core_form_get_filetypes_browser_data | Provides data for the filetypes element browser.
[**core_get_component_strings**](MoodleApi.md#core_get_component_strings) | **POST** /core_get_component_strings | Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call
[**core_get_fragment**](MoodleApi.md#core_get_fragment) | **POST** /core_get_fragment | Return a fragment for inclusion, such as a JavaScript page.
[**core_get_string**](MoodleApi.md#core_get_string) | **POST** /core_get_string | Return a translated string - similar to core get_string(), call
[**core_get_strings**](MoodleApi.md#core_get_strings) | **POST** /core_get_strings | Return some translated strings - like several core get_string(), calls
[**core_get_user_dates**](MoodleApi.md#core_get_user_dates) | **POST** /core_get_user_dates | Return formatted timestamps
[**core_grades_create_gradecategories**](MoodleApi.md#core_grades_create_gradecategories) | **POST** /core_grades_create_gradecategories | Create grade categories inside a course gradebook.
[**core_grades_get_enrolled_users_for_search_widget**](MoodleApi.md#core_grades_get_enrolled_users_for_search_widget) | **POST** /core_grades_get_enrolled_users_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.
[**core_grades_get_enrolled_users_for_selector**](MoodleApi.md#core_grades_get_enrolled_users_for_selector) | **POST** /core_grades_get_enrolled_users_for_selector | Returns the enrolled users within and map some fields to the returned array of user objects.
[**core_grades_get_feedback**](MoodleApi.md#core_grades_get_feedback) | **POST** /core_grades_get_feedback | Get the feedback data for a grade item
[**core_grades_get_gradable_users**](MoodleApi.md#core_grades_get_gradable_users) | **POST** /core_grades_get_gradable_users | Returns the gradable users in a course
[**core_grades_get_grade_tree**](MoodleApi.md#core_grades_get_grade_tree) | **POST** /core_grades_get_grade_tree | Get the grade tree structure for a course
[**core_grades_get_gradeitems**](MoodleApi.md#core_grades_get_gradeitems) | **POST** /core_grades_get_gradeitems | Get the gradeitems for a course
[**core_grades_get_groups_for_search_widget**](MoodleApi.md#core_grades_get_groups_for_search_widget) | **POST** /core_grades_get_groups_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
[**core_grades_get_groups_for_selector**](MoodleApi.md#core_grades_get_groups_for_selector) | **POST** /core_grades_get_groups_for_selector | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
[**core_grades_grader_gradingpanel_point_fetch**](MoodleApi.md#core_grades_grader_gradingpanel_point_fetch) | **POST** /core_grades_grader_gradingpanel_point_fetch | Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required
[**core_grades_grader_gradingpanel_point_store**](MoodleApi.md#core_grades_grader_gradingpanel_point_store) | **POST** /core_grades_grader_gradingpanel_point_store | Store the data required to display the grader grading panel for simple grading
[**core_grades_grader_gradingpanel_scale_fetch**](MoodleApi.md#core_grades_grader_gradingpanel_scale_fetch) | **POST** /core_grades_grader_gradingpanel_scale_fetch | Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required
[**core_grades_grader_gradingpanel_scale_store**](MoodleApi.md#core_grades_grader_gradingpanel_scale_store) | **POST** /core_grades_grader_gradingpanel_scale_store | Store the data required to display the grader grading panel for scale-based grading
[**core_grades_update_grades**](MoodleApi.md#core_grades_update_grades) | **POST** /core_grades_update_grades | Update a grade item and associated student grades.
[**core_grading_get_definitions**](MoodleApi.md#core_grading_get_definitions) | **POST** /core_grading_get_definitions | Get grading definitions
[**core_grading_get_gradingform_instances**](MoodleApi.md#core_grading_get_gradingform_instances) | **POST** /core_grading_get_gradingform_instances | Get grading form instances
[**core_grading_save_definitions**](MoodleApi.md#core_grading_save_definitions) | **POST** /core_grading_save_definitions | Save grading definitions
[**core_group_add_group_members**](MoodleApi.md#core_group_add_group_members) | **POST** /core_group_add_group_members | Adds group members.
[**core_group_assign_grouping**](MoodleApi.md#core_group_assign_grouping) | **POST** /core_group_assign_grouping | Assing groups from groupings
[**core_group_create_groupings**](MoodleApi.md#core_group_create_groupings) | **POST** /core_group_create_groupings | Creates new groupings
[**core_group_create_groups**](MoodleApi.md#core_group_create_groups) | **POST** /core_group_create_groups | Creates new groups.
[**core_group_delete_group_members**](MoodleApi.md#core_group_delete_group_members) | **POST** /core_group_delete_group_members | Deletes group members.
[**core_group_delete_groupings**](MoodleApi.md#core_group_delete_groupings) | **POST** /core_group_delete_groupings | Deletes all specified groupings.
[**core_group_delete_groups**](MoodleApi.md#core_group_delete_groups) | **POST** /core_group_delete_groups | Deletes all specified groups.
[**core_group_get_activity_allowed_groups**](MoodleApi.md#core_group_get_activity_allowed_groups) | **POST** /core_group_get_activity_allowed_groups | Gets a list of groups that the user is allowed to access within the specified activity.
[**core_group_get_activity_groupmode**](MoodleApi.md#core_group_get_activity_groupmode) | **POST** /core_group_get_activity_groupmode | Returns effective groupmode used in a given activity.
[**core_group_get_course_groupings**](MoodleApi.md#core_group_get_course_groupings) | **POST** /core_group_get_course_groupings | Returns all groupings in specified course.
[**core_group_get_course_groups**](MoodleApi.md#core_group_get_course_groups) | **POST** /core_group_get_course_groups | Returns all groups in specified course.
[**core_group_get_course_user_groups**](MoodleApi.md#core_group_get_course_user_groups) | **POST** /core_group_get_course_user_groups | Returns all groups in specified course for the specified user.
[**core_group_get_group_members**](MoodleApi.md#core_group_get_group_members) | **POST** /core_group_get_group_members | Returns group members.
[**core_group_get_groupings**](MoodleApi.md#core_group_get_groupings) | **POST** /core_group_get_groupings | Returns groupings details.
[**core_group_get_groups**](MoodleApi.md#core_group_get_groups) | **POST** /core_group_get_groups | Returns group details.
[**core_group_get_groups_for_selector**](MoodleApi.md#core_group_get_groups_for_selector) | **POST** /core_group_get_groups_for_selector | Get the group/(s) for a course
[**core_group_unassign_grouping**](MoodleApi.md#core_group_unassign_grouping) | **POST** /core_group_unassign_grouping | Unassing groups from groupings
[**core_group_update_groupings**](MoodleApi.md#core_group_update_groupings) | **POST** /core_group_update_groupings | Updates existing groupings
[**core_group_update_groups**](MoodleApi.md#core_group_update_groups) | **POST** /core_group_update_groups | Updates existing groups.
[**core_h5p_get_trusted_h5p_file**](MoodleApi.md#core_h5p_get_trusted_h5p_file) | **POST** /core_h5p_get_trusted_h5p_file | Get the H5P file cleaned for Mobile App.
[**core_message_block_user**](MoodleApi.md#core_message_block_user) | **POST** /core_message_block_user | Blocks a user
[**core_message_confirm_contact_request**](MoodleApi.md#core_message_confirm_contact_request) | **POST** /core_message_confirm_contact_request | Confirms a contact request
[**core_message_create_contact_request**](MoodleApi.md#core_message_create_contact_request) | **POST** /core_message_create_contact_request | Creates a contact request
[**core_message_data_for_messagearea_search_messages**](MoodleApi.md#core_message_data_for_messagearea_search_messages) | **POST** /core_message_data_for_messagearea_search_messages | Retrieve the template data for searching for messages
[**core_message_decline_contact_request**](MoodleApi.md#core_message_decline_contact_request) | **POST** /core_message_decline_contact_request | Declines a contact request
[**core_message_delete_contacts**](MoodleApi.md#core_message_delete_contacts) | **POST** /core_message_delete_contacts | Remove contacts from the contact list
[**core_message_delete_conversations_by_id**](MoodleApi.md#core_message_delete_conversations_by_id) | **POST** /core_message_delete_conversations_by_id | Deletes a list of conversations.
[**core_message_delete_message**](MoodleApi.md#core_message_delete_message) | **POST** /core_message_delete_message | Deletes a message.
[**core_message_delete_message_for_all_users**](MoodleApi.md#core_message_delete_message_for_all_users) | **POST** /core_message_delete_message_for_all_users | Deletes a message for all users.
[**core_message_get_blocked_users**](MoodleApi.md#core_message_get_blocked_users) | **POST** /core_message_get_blocked_users | Retrieve a list of users blocked
[**core_message_get_contact_requests**](MoodleApi.md#core_message_get_contact_requests) | **POST** /core_message_get_contact_requests | Returns contact requests for a user
[**core_message_get_conversation**](MoodleApi.md#core_message_get_conversation) | **POST** /core_message_get_conversation | Retrieve a conversation for a user
[**core_message_get_conversation_between_users**](MoodleApi.md#core_message_get_conversation_between_users) | **POST** /core_message_get_conversation_between_users | Retrieve a conversation for a user between another user
[**core_message_get_conversation_counts**](MoodleApi.md#core_message_get_conversation_counts) | **POST** /core_message_get_conversation_counts | Retrieve a list of conversation counts, indexed by type.
[**core_message_get_conversation_members**](MoodleApi.md#core_message_get_conversation_members) | **POST** /core_message_get_conversation_members | Retrieve a list of members in a conversation
[**core_message_get_conversation_messages**](MoodleApi.md#core_message_get_conversation_messages) | **POST** /core_message_get_conversation_messages | Retrieve the conversation messages and relevant member information
[**core_message_get_conversations**](MoodleApi.md#core_message_get_conversations) | **POST** /core_message_get_conversations | Retrieve a list of conversations for a user
[**core_message_get_member_info**](MoodleApi.md#core_message_get_member_info) | **POST** /core_message_get_member_info | Retrieve a user message profiles
[**core_message_get_message_processor**](MoodleApi.md#core_message_get_message_processor) | **POST** /core_message_get_message_processor | Get a message processor
[**core_message_get_messages**](MoodleApi.md#core_message_get_messages) | **POST** /core_message_get_messages | Retrieve a list of messages sent and received by a user (conversations, notifications or both)
[**core_message_get_received_contact_requests_count**](MoodleApi.md#core_message_get_received_contact_requests_count) | **POST** /core_message_get_received_contact_requests_count | Gets the number of received contact requests
[**core_message_get_self_conversation**](MoodleApi.md#core_message_get_self_conversation) | **POST** /core_message_get_self_conversation | Retrieve a self-conversation for a user
[**core_message_get_unread_conversation_counts**](MoodleApi.md#core_message_get_unread_conversation_counts) | **POST** /core_message_get_unread_conversation_counts | Retrieve a list of unread conversation counts, indexed by type.
[**core_message_get_unread_conversations_count**](MoodleApi.md#core_message_get_unread_conversations_count) | **POST** /core_message_get_unread_conversations_count | Retrieve the count of unread conversations for a given user
[**core_message_get_unread_notification_count**](MoodleApi.md#core_message_get_unread_notification_count) | **POST** /core_message_get_unread_notification_count | Get number of unread notifications.
[**core_message_get_user_contacts**](MoodleApi.md#core_message_get_user_contacts) | **POST** /core_message_get_user_contacts | Retrieve the contact list
[**core_message_get_user_message_preferences**](MoodleApi.md#core_message_get_user_message_preferences) | **POST** /core_message_get_user_message_preferences | Get the message preferences for a given user.
[**core_message_get_user_notification_preferences**](MoodleApi.md#core_message_get_user_notification_preferences) | **POST** /core_message_get_user_notification_preferences | Get the notification preferences for a given user.
[**core_message_mark_all_conversation_messages_as_read**](MoodleApi.md#core_message_mark_all_conversation_messages_as_read) | **POST** /core_message_mark_all_conversation_messages_as_read | Mark all conversation messages as read for a given user
[**core_message_mark_all_notifications_as_read**](MoodleApi.md#core_message_mark_all_notifications_as_read) | **POST** /core_message_mark_all_notifications_as_read | Mark all notifications as read for a given user
[**core_message_mark_message_read**](MoodleApi.md#core_message_mark_message_read) | **POST** /core_message_mark_message_read | Mark a single message as read, trigger message_viewed event.
[**core_message_mark_notification_read**](MoodleApi.md#core_message_mark_notification_read) | **POST** /core_message_mark_notification_read | Mark a single notification as read, trigger notification_viewed event.
[**core_message_message_processor_config_form**](MoodleApi.md#core_message_message_processor_config_form) | **POST** /core_message_message_processor_config_form | Process the message processor config form
[**core_message_message_search_users**](MoodleApi.md#core_message_message_search_users) | **POST** /core_message_message_search_users | Retrieve the data for searching for people
[**core_message_mute_conversations**](MoodleApi.md#core_message_mute_conversations) | **POST** /core_message_mute_conversations | Mutes a list of conversations
[**core_message_search_contacts**](MoodleApi.md#core_message_search_contacts) | **POST** /core_message_search_contacts | Search for contacts
[**core_message_send_instant_messages**](MoodleApi.md#core_message_send_instant_messages) | **POST** /core_message_send_instant_messages | Send instant messages
[**core_message_send_messages_to_conversation**](MoodleApi.md#core_message_send_messages_to_conversation) | **POST** /core_message_send_messages_to_conversation | Send messages to an existing conversation between users
[**core_message_set_favourite_conversations**](MoodleApi.md#core_message_set_favourite_conversations) | **POST** /core_message_set_favourite_conversations | Mark a conversation or group of conversations as favourites/starred conversations.
[**core_message_unblock_user**](MoodleApi.md#core_message_unblock_user) | **POST** /core_message_unblock_user | Unblocks a user
[**core_message_unmute_conversations**](MoodleApi.md#core_message_unmute_conversations) | **POST** /core_message_unmute_conversations | Unmutes a list of conversations
[**core_message_unset_favourite_conversations**](MoodleApi.md#core_message_unset_favourite_conversations) | **POST** /core_message_unset_favourite_conversations | Unset a conversation or group of conversations as favourites/starred conversations.
[**core_moodlenet_auth_check**](MoodleApi.md#core_moodlenet_auth_check) | **POST** /core_moodlenet_auth_check | Check a user has authorized for a given MoodleNet site
[**core_moodlenet_get_share_info_activity**](MoodleApi.md#core_moodlenet_get_share_info_activity) | **POST** /core_moodlenet_get_share_info_activity | Get information about an activity being shared
[**core_moodlenet_get_shared_course_info**](MoodleApi.md#core_moodlenet_get_shared_course_info) | **POST** /core_moodlenet_get_shared_course_info | Get information about an course being shared
[**core_moodlenet_send_activity**](MoodleApi.md#core_moodlenet_send_activity) | **POST** /core_moodlenet_send_activity | Send activity to MoodleNet
[**core_moodlenet_send_course**](MoodleApi.md#core_moodlenet_send_course) | **POST** /core_moodlenet_send_course | Send course to MoodleNet
[**core_my_view_page**](MoodleApi.md#core_my_view_page) | **POST** /core_my_view_page | Trigger the My or Dashboard viewed event.
[**core_notes_create_notes**](MoodleApi.md#core_notes_create_notes) | **POST** /core_notes_create_notes | Create notes
[**core_notes_delete_notes**](MoodleApi.md#core_notes_delete_notes) | **POST** /core_notes_delete_notes | Delete notes
[**core_notes_get_course_notes**](MoodleApi.md#core_notes_get_course_notes) | **POST** /core_notes_get_course_notes | Returns all notes in specified course (or site), for the specified user.
[**core_notes_get_notes**](MoodleApi.md#core_notes_get_notes) | **POST** /core_notes_get_notes | Get notes
[**core_notes_update_notes**](MoodleApi.md#core_notes_update_notes) | **POST** /core_notes_update_notes | Update notes
[**core_notes_view_notes**](MoodleApi.md#core_notes_view_notes) | **POST** /core_notes_view_notes | Simulates the web interface view of notes/index.php: trigger events.
[**core_output_load_fontawesome_icon_map**](MoodleApi.md#core_output_load_fontawesome_icon_map) | **POST** /core_output_load_fontawesome_icon_map | Load the mapping of names to icons
[**core_output_load_fontawesome_icon_system_map**](MoodleApi.md#core_output_load_fontawesome_icon_system_map) | **POST** /core_output_load_fontawesome_icon_system_map | Load the mapping of moodle pix names to fontawesome icon names
[**core_output_load_template**](MoodleApi.md#core_output_load_template) | **POST** /core_output_load_template | Load a template for a renderable
[**core_output_load_template_with_dependencies**](MoodleApi.md#core_output_load_template_with_dependencies) | **POST** /core_output_load_template_with_dependencies | Load a template and its dependencies for a renderable
[**core_payment_get_available_gateways**](MoodleApi.md#core_payment_get_available_gateways) | **POST** /core_payment_get_available_gateways | Get the list of payment gateways that support the given component/area
[**core_question_get_random_question_summaries**](MoodleApi.md#core_question_get_random_question_summaries) | **POST** /core_question_get_random_question_summaries | Get the random question set for a criteria
[**core_question_submit_tags_form**](MoodleApi.md#core_question_submit_tags_form) | **POST** /core_question_submit_tags_form | Update the question tags.
[**core_question_update_flag**](MoodleApi.md#core_question_update_flag) | **POST** /core_question_update_flag | Update the flag state of a question attempt.
[**core_rating_add_rating**](MoodleApi.md#core_rating_add_rating) | **POST** /core_rating_add_rating | Rates an item.
[**core_rating_get_item_ratings**](MoodleApi.md#core_rating_get_item_ratings) | **POST** /core_rating_get_item_ratings | Retrieve all the ratings for an item.
[**core_reportbuilder_audiences_delete**](MoodleApi.md#core_reportbuilder_audiences_delete) | **POST** /core_reportbuilder_audiences_delete | Delete audience from report
[**core_reportbuilder_can_view_system_report**](MoodleApi.md#core_reportbuilder_can_view_system_report) | **POST** /core_reportbuilder_can_view_system_report | Determine access to a system report
[**core_reportbuilder_columns_add**](MoodleApi.md#core_reportbuilder_columns_add) | **POST** /core_reportbuilder_columns_add | Add column to report
[**core_reportbuilder_columns_delete**](MoodleApi.md#core_reportbuilder_columns_delete) | **POST** /core_reportbuilder_columns_delete | Delete column from report
[**core_reportbuilder_columns_reorder**](MoodleApi.md#core_reportbuilder_columns_reorder) | **POST** /core_reportbuilder_columns_reorder | Re-order column within report
[**core_reportbuilder_columns_sort_get**](MoodleApi.md#core_reportbuilder_columns_sort_get) | **POST** /core_reportbuilder_columns_sort_get | Retrieve column sorting for report
[**core_reportbuilder_columns_sort_reorder**](MoodleApi.md#core_reportbuilder_columns_sort_reorder) | **POST** /core_reportbuilder_columns_sort_reorder | Re-order column sorting within report
[**core_reportbuilder_columns_sort_toggle**](MoodleApi.md#core_reportbuilder_columns_sort_toggle) | **POST** /core_reportbuilder_columns_sort_toggle | Toggle sorting of column within report
[**core_reportbuilder_conditions_add**](MoodleApi.md#core_reportbuilder_conditions_add) | **POST** /core_reportbuilder_conditions_add | Add condition to report
[**core_reportbuilder_conditions_delete**](MoodleApi.md#core_reportbuilder_conditions_delete) | **POST** /core_reportbuilder_conditions_delete | Delete condition from report
[**core_reportbuilder_conditions_reorder**](MoodleApi.md#core_reportbuilder_conditions_reorder) | **POST** /core_reportbuilder_conditions_reorder | Re-order condition within report
[**core_reportbuilder_conditions_reset**](MoodleApi.md#core_reportbuilder_conditions_reset) | **POST** /core_reportbuilder_conditions_reset | Reset conditions for given report
[**core_reportbuilder_filters_add**](MoodleApi.md#core_reportbuilder_filters_add) | **POST** /core_reportbuilder_filters_add | Add filter to report
[**core_reportbuilder_filters_delete**](MoodleApi.md#core_reportbuilder_filters_delete) | **POST** /core_reportbuilder_filters_delete | Delete filter from report
[**core_reportbuilder_filters_reorder**](MoodleApi.md#core_reportbuilder_filters_reorder) | **POST** /core_reportbuilder_filters_reorder | Re-order filter within report
[**core_reportbuilder_filters_reset**](MoodleApi.md#core_reportbuilder_filters_reset) | **POST** /core_reportbuilder_filters_reset | Reset filters for given report
[**core_reportbuilder_list_reports**](MoodleApi.md#core_reportbuilder_list_reports) | **POST** /core_reportbuilder_list_reports | List custom reports for current user
[**core_reportbuilder_reports_delete**](MoodleApi.md#core_reportbuilder_reports_delete) | **POST** /core_reportbuilder_reports_delete | Delete report
[**core_reportbuilder_reports_get**](MoodleApi.md#core_reportbuilder_reports_get) | **POST** /core_reportbuilder_reports_get | Get custom report
[**core_reportbuilder_retrieve_report**](MoodleApi.md#core_reportbuilder_retrieve_report) | **POST** /core_reportbuilder_retrieve_report | Retrieve custom report content
[**core_reportbuilder_retrieve_system_report**](MoodleApi.md#core_reportbuilder_retrieve_system_report) | **POST** /core_reportbuilder_retrieve_system_report | Retrieve system report content
[**core_reportbuilder_schedules_delete**](MoodleApi.md#core_reportbuilder_schedules_delete) | **POST** /core_reportbuilder_schedules_delete | Delete schedule from report
[**core_reportbuilder_schedules_send**](MoodleApi.md#core_reportbuilder_schedules_send) | **POST** /core_reportbuilder_schedules_send | Send report schedule
[**core_reportbuilder_schedules_toggle**](MoodleApi.md#core_reportbuilder_schedules_toggle) | **POST** /core_reportbuilder_schedules_toggle | Toggle state of report schedule
[**core_reportbuilder_set_filters**](MoodleApi.md#core_reportbuilder_set_filters) | **POST** /core_reportbuilder_set_filters | Set filter values for given report
[**core_reportbuilder_view_report**](MoodleApi.md#core_reportbuilder_view_report) | **POST** /core_reportbuilder_view_report | Trigger custom report viewed
[**core_role_assign_roles**](MoodleApi.md#core_role_assign_roles) | **POST** /core_role_assign_roles | Manual role assignments.
[**core_role_unassign_roles**](MoodleApi.md#core_role_unassign_roles) | **POST** /core_role_unassign_roles | Manual role unassignments.
[**core_search_get_relevant_users**](MoodleApi.md#core_search_get_relevant_users) | **POST** /core_search_get_relevant_users | Gets relevant users for a search request.
[**core_search_get_results**](MoodleApi.md#core_search_get_results) | **POST** /core_search_get_results | Get search results.
[**core_search_get_search_areas_list**](MoodleApi.md#core_search_get_search_areas_list) | **POST** /core_search_get_search_areas_list | Get search areas.
[**core_search_get_top_results**](MoodleApi.md#core_search_get_top_results) | **POST** /core_search_get_top_results | Get top search results.
[**core_search_view_results**](MoodleApi.md#core_search_view_results) | **POST** /core_search_view_results | Trigger view search results event.
[**core_session_time_remaining**](MoodleApi.md#core_session_time_remaining) | **POST** /core_session_time_remaining | Count the seconds remaining in this session
[**core_session_touch**](MoodleApi.md#core_session_touch) | **POST** /core_session_touch | Keep the users session alive
[**core_table_get_dynamic_table_content**](MoodleApi.md#core_table_get_dynamic_table_content) | **POST** /core_table_get_dynamic_table_content | Get the dynamic table content raw html
[**core_tag_get_tag_areas**](MoodleApi.md#core_tag_get_tag_areas) | **POST** /core_tag_get_tag_areas | Retrieves existing tag areas.
[**core_tag_get_tag_cloud**](MoodleApi.md#core_tag_get_tag_cloud) | **POST** /core_tag_get_tag_cloud | Retrieves a tag cloud for the given collection and/or query search.
[**core_tag_get_tag_collections**](MoodleApi.md#core_tag_get_tag_collections) | **POST** /core_tag_get_tag_collections | Retrieves existing tag collections.
[**core_tag_get_tagindex**](MoodleApi.md#core_tag_get_tagindex) | **POST** /core_tag_get_tagindex | Gets tag index page for one tag and one tag area
[**core_tag_get_tagindex_per_area**](MoodleApi.md#core_tag_get_tagindex_per_area) | **POST** /core_tag_get_tagindex_per_area | Gets tag index page per different areas.
[**core_tag_get_tags**](MoodleApi.md#core_tag_get_tags) | **POST** /core_tag_get_tags | Gets tags by their ids
[**core_tag_update_tags**](MoodleApi.md#core_tag_update_tags) | **POST** /core_tag_update_tags | Updates tags
[**core_update_inplace_editable**](MoodleApi.md#core_update_inplace_editable) | **POST** /core_update_inplace_editable | Generic service to update title
[**core_user_add_user_device**](MoodleApi.md#core_user_add_user_device) | **POST** /core_user_add_user_device | Store mobile user devices information for PUSH Notifications.
[**core_user_add_user_private_files**](MoodleApi.md#core_user_add_user_private_files) | **POST** /core_user_add_user_private_files | Copy files from a draft area to users private files area.
[**core_user_agree_site_policy**](MoodleApi.md#core_user_agree_site_policy) | **POST** /core_user_agree_site_policy | Agree the site policy for the current user.
[**core_user_create_users**](MoodleApi.md#core_user_create_users) | **POST** /core_user_create_users | Create users.
[**core_user_delete_users**](MoodleApi.md#core_user_delete_users) | **POST** /core_user_delete_users | Delete users.
[**core_user_get_course_user_profiles**](MoodleApi.md#core_user_get_course_user_profiles) | **POST** /core_user_get_course_user_profiles | Get course user profiles (each of the profils matching a course id and a user id),.
[**core_user_get_private_files_info**](MoodleApi.md#core_user_get_private_files_info) | **POST** /core_user_get_private_files_info | Returns general information about files in the user private files area.
[**core_user_get_user_preferences**](MoodleApi.md#core_user_get_user_preferences) | **POST** /core_user_get_user_preferences | Return user preferences.
[**core_user_get_users**](MoodleApi.md#core_user_get_users) | **POST** /core_user_get_users | search for users matching the parameters
[**core_user_get_users_by_field**](MoodleApi.md#core_user_get_users_by_field) | **POST** /core_user_get_users_by_field | Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().
[**core_user_remove_user_device**](MoodleApi.md#core_user_remove_user_device) | **POST** /core_user_remove_user_device | Remove a user device from the Moodle database.
[**core_user_search_identity**](MoodleApi.md#core_user_search_identity) | **POST** /core_user_search_identity | Return list of users identities matching the given criteria in their name or other identity fields.
[**core_user_set_user_preferences**](MoodleApi.md#core_user_set_user_preferences) | **POST** /core_user_set_user_preferences | Set user preferences.
[**core_user_update_picture**](MoodleApi.md#core_user_update_picture) | **POST** /core_user_update_picture | Update or delete the user picture in the site
[**core_user_update_user_device_public_key**](MoodleApi.md#core_user_update_user_device_public_key) | **POST** /core_user_update_user_device_public_key | Store mobile user public key.
[**core_user_update_user_preferences**](MoodleApi.md#core_user_update_user_preferences) | **POST** /core_user_update_user_preferences | Update a user's preferences
[**core_user_update_users**](MoodleApi.md#core_user_update_users) | **POST** /core_user_update_users | Update users.
[**core_user_view_user_list**](MoodleApi.md#core_user_view_user_list) | **POST** /core_user_view_user_list | Simulates the web-interface view of user/index.php (triggering events),.
[**core_user_view_user_profile**](MoodleApi.md#core_user_view_user_profile) | **POST** /core_user_view_user_profile | Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.
[**core_webservice_get_site_info**](MoodleApi.md#core_webservice_get_site_info) | **POST** /core_webservice_get_site_info | Return some site info / user info / list web service functions
[**core_xapi_delete_state**](MoodleApi.md#core_xapi_delete_state) | **POST** /core_xapi_delete_state | Delete an xAPI state data from an activityId.
[**core_xapi_delete_states**](MoodleApi.md#core_xapi_delete_states) | **POST** /core_xapi_delete_states | Delete all xAPI state data from an activityId.
[**core_xapi_get_state**](MoodleApi.md#core_xapi_get_state) | **POST** /core_xapi_get_state | Get an xAPI state data from an activityId.
[**core_xapi_get_states**](MoodleApi.md#core_xapi_get_states) | **POST** /core_xapi_get_states | Get all state ID from an activityId.
[**core_xapi_post_state**](MoodleApi.md#core_xapi_post_state) | **POST** /core_xapi_post_state | Post an xAPI state into an activityId.
[**core_xapi_statement_post**](MoodleApi.md#core_xapi_statement_post) | **POST** /core_xapi_statement_post | Post an xAPI statement.



## core_admin_set_block_protection

> serde_json::Value core_admin_set_block_protection(core_admin_set_block_protection_request)
Set the protection state for a block plugin

Set the protection state for a block plugin

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_admin_set_block_protection_request** | [**CoreAdminSetBlockProtectionRequest**](CoreAdminSetBlockProtectionRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_admin_set_plugin_order

> serde_json::Value core_admin_set_plugin_order(core_admin_set_plugin_order_request)
Set the order of a plugin

Set the order of a plugin

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_admin_set_plugin_order_request** | [**CoreAdminSetPluginOrderRequest**](CoreAdminSetPluginOrderRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_admin_set_plugin_state

> serde_json::Value core_admin_set_plugin_state(core_admin_set_plugin_state_request)
Set the state of a plugin

Set the state of a plugin

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_admin_set_plugin_state_request** | [**CoreAdminSetPluginStateRequest**](CoreAdminSetPluginStateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_auth_confirm_user

> models::CoreAuthConfirmUser200Response core_auth_confirm_user(core_auth_confirm_user_request)
Confirm a user account.

Confirm a user account.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_auth_confirm_user_request** | [**CoreAuthConfirmUserRequest**](CoreAuthConfirmUserRequest.md) |  | [required] |

### Return type

[**models::CoreAuthConfirmUser200Response**](core_auth_confirm_user_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_auth_is_age_digital_consent_verification_enabled

> models::CoreAuthIsAgeDigitalConsentVerificationEnabled200Response core_auth_is_age_digital_consent_verification_enabled()
Checks if age digital consent verification is enabled.

Checks if age digital consent verification is enabled.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreAuthIsAgeDigitalConsentVerificationEnabled200Response**](core_auth_is_age_digital_consent_verification_enabled_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_auth_is_minor

> models::CoreAuthIsMinor200Response core_auth_is_minor(core_auth_is_minor_request)
Requests a check if a user is a digital minor.

Requests a check if a user is a digital minor.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_auth_is_minor_request** | [**CoreAuthIsMinorRequest**](CoreAuthIsMinorRequest.md) |  | [required] |

### Return type

[**models::CoreAuthIsMinor200Response**](core_auth_is_minor_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_auth_request_password_reset

> models::CoreAuthRequestPasswordReset200Response core_auth_request_password_reset(core_auth_request_password_reset_request)
Requests a password reset.

Requests a password reset.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_auth_request_password_reset_request** | [**CoreAuthRequestPasswordResetRequest**](CoreAuthRequestPasswordResetRequest.md) |  | [required] |

### Return type

[**models::CoreAuthRequestPasswordReset200Response**](core_auth_request_password_reset_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_auth_resend_confirmation_email

> models::CoreAuthResendConfirmationEmail200Response core_auth_resend_confirmation_email(core_auth_resend_confirmation_email_request)
Resend confirmation email.

Resend confirmation email.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_auth_resend_confirmation_email_request** | [**CoreAuthResendConfirmationEmailRequest**](CoreAuthResendConfirmationEmailRequest.md) |  | [required] |

### Return type

[**models::CoreAuthResendConfirmationEmail200Response**](core_auth_resend_confirmation_email_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_backup_get_async_backup_links_backup

> models::CoreBackupGetAsyncBackupLinksBackup200Response core_backup_get_async_backup_links_backup(core_backup_get_async_backup_links_backup_request)
Gets the data to use when updating the status table row in the UI for when an async backup completes.

Gets the data to use when updating the status table row in the UI for when an async backup completes.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_backup_get_async_backup_links_backup_request** | [**CoreBackupGetAsyncBackupLinksBackupRequest**](CoreBackupGetAsyncBackupLinksBackupRequest.md) |  | [required] |

### Return type

[**models::CoreBackupGetAsyncBackupLinksBackup200Response**](core_backup_get_async_backup_links_backup_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_backup_get_async_backup_links_restore

> models::CoreBackupGetAsyncBackupLinksRestore200Response core_backup_get_async_backup_links_restore(core_backup_get_async_backup_links_restore_request)
Gets the data to use when updating the status table row in the UI for when an async restore completes.

Gets the data to use when updating the status table row in the UI for when an async restore completes.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_backup_get_async_backup_links_restore_request** | [**CoreBackupGetAsyncBackupLinksRestoreRequest**](CoreBackupGetAsyncBackupLinksRestoreRequest.md) |  | [required] |

### Return type

[**models::CoreBackupGetAsyncBackupLinksRestore200Response**](core_backup_get_async_backup_links_restore_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_backup_get_async_backup_progress

> serde_json::Value core_backup_get_async_backup_progress(core_backup_get_async_backup_progress_request)
Get the progress of an Asyncronhous backup.

Get the progress of an Asyncronhous backup.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_backup_get_async_backup_progress_request** | [**CoreBackupGetAsyncBackupProgressRequest**](CoreBackupGetAsyncBackupProgressRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_backup_get_copy_progress

> serde_json::Value core_backup_get_copy_progress(core_backup_get_copy_progress_request)
Gets the progress of course copy operations.

Gets the progress of course copy operations.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_backup_get_copy_progress_request** | [**CoreBackupGetCopyProgressRequest**](CoreBackupGetCopyProgressRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_backup_submit_copy_form

> serde_json::Value core_backup_submit_copy_form(core_backup_submit_copy_form_request)
Handles ajax submission of course copy form.

Handles ajax submission of course copy form.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_backup_submit_copy_form_request** | [**CoreBackupSubmitCopyFormRequest**](CoreBackupSubmitCopyFormRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_badges_get_user_badge_by_hash

> models::CoreBadgesGetUserBadgeByHash200Response core_badges_get_user_badge_by_hash(core_badges_get_user_badge_by_hash_request)
Returns the badge awarded to a user by hash.

Returns the badge awarded to a user by hash.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_badges_get_user_badge_by_hash_request** | [**CoreBadgesGetUserBadgeByHashRequest**](CoreBadgesGetUserBadgeByHashRequest.md) |  | [required] |

### Return type

[**models::CoreBadgesGetUserBadgeByHash200Response**](core_badges_get_user_badge_by_hash_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_badges_get_user_badges

> models::CoreBadgesGetUserBadges200Response core_badges_get_user_badges(core_badges_get_user_badges_request)
Returns the list of badges awarded to a user.

Returns the list of badges awarded to a user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_badges_get_user_badges_request** | [**CoreBadgesGetUserBadgesRequest**](CoreBadgesGetUserBadgesRequest.md) |  | [required] |

### Return type

[**models::CoreBadgesGetUserBadges200Response**](core_badges_get_user_badges_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_block_fetch_addable_blocks

> serde_json::Value core_block_fetch_addable_blocks(core_block_fetch_addable_blocks_request)
Returns all addable blocks in a given page.

Returns all addable blocks in a given page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_block_fetch_addable_blocks_request** | [**CoreBlockFetchAddableBlocksRequest**](CoreBlockFetchAddableBlocksRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_block_get_course_blocks

> models::CoreBlockGetCourseBlocks200Response core_block_get_course_blocks(core_block_get_course_blocks_request)
Returns blocks information for a course.

Returns blocks information for a course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_block_get_course_blocks_request** | [**CoreBlockGetCourseBlocksRequest**](CoreBlockGetCourseBlocksRequest.md) |  | [required] |

### Return type

[**models::CoreBlockGetCourseBlocks200Response**](core_block_get_course_blocks_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_block_get_dashboard_blocks

> models::CoreBlockGetDashboardBlocks200Response core_block_get_dashboard_blocks(core_block_get_dashboard_blocks_request)
Returns blocks information for the given user dashboard.

Returns blocks information for the given user dashboard.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_block_get_dashboard_blocks_request** | [**CoreBlockGetDashboardBlocksRequest**](CoreBlockGetDashboardBlocksRequest.md) |  | [required] |

### Return type

[**models::CoreBlockGetDashboardBlocks200Response**](core_block_get_dashboard_blocks_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_blog_get_entries

> models::CoreBlogGetEntries200Response core_blog_get_entries(core_blog_get_entries_request)
Returns blog entries.

Returns blog entries.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_blog_get_entries_request** | [**CoreBlogGetEntriesRequest**](CoreBlogGetEntriesRequest.md) |  | [required] |

### Return type

[**models::CoreBlogGetEntries200Response**](core_blog_get_entries_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_blog_view_entries

> models::CoreBlogViewEntries200Response core_blog_view_entries(core_blog_view_entries_request)
Trigger the blog_entries_viewed event.

Trigger the blog_entries_viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_blog_view_entries_request** | [**CoreBlogViewEntriesRequest**](CoreBlogViewEntriesRequest.md) |  | [required] |

### Return type

[**models::CoreBlogViewEntries200Response**](core_blog_view_entries_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_create_calendar_events

> models::CoreCalendarCreateCalendarEvents200Response core_calendar_create_calendar_events(core_calendar_create_calendar_events_request)
Create calendar events

Create calendar events

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_create_calendar_events_request** | [**CoreCalendarCreateCalendarEventsRequest**](CoreCalendarCreateCalendarEventsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarCreateCalendarEvents200Response**](core_calendar_create_calendar_events_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_delete_calendar_events

> serde_json::Value core_calendar_delete_calendar_events(core_calendar_delete_calendar_events_request)
Delete calendar events

Delete calendar events

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_delete_calendar_events_request** | [**CoreCalendarDeleteCalendarEventsRequest**](CoreCalendarDeleteCalendarEventsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_delete_subscription

> models::CoreCalendarDeleteSubscription200Response core_calendar_delete_subscription(core_calendar_delete_subscription_request)
Delete the calendar subscription

Delete the calendar subscription

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_delete_subscription_request** | [**CoreCalendarDeleteSubscriptionRequest**](CoreCalendarDeleteSubscriptionRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_action_events_by_course

> models::CoreCalendarGetActionEventsByCourse200Response core_calendar_get_action_events_by_course(core_calendar_get_action_events_by_course_request)
Get calendar action events by course

Get calendar action events by course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_action_events_by_course_request** | [**CoreCalendarGetActionEventsByCourseRequest**](CoreCalendarGetActionEventsByCourseRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetActionEventsByCourse200Response**](core_calendar_get_action_events_by_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_action_events_by_courses

> models::CoreCalendarGetActionEventsByCourses200Response core_calendar_get_action_events_by_courses(core_calendar_get_action_events_by_courses_request)
Get calendar action events by courses

Get calendar action events by courses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_action_events_by_courses_request** | [**CoreCalendarGetActionEventsByCoursesRequest**](CoreCalendarGetActionEventsByCoursesRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetActionEventsByCourses200Response**](core_calendar_get_action_events_by_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_action_events_by_timesort

> models::CoreCalendarGetActionEventsByTimesort200Response core_calendar_get_action_events_by_timesort(core_calendar_get_action_events_by_timesort_request)
Get calendar action events by tiemsort

Get calendar action events by tiemsort

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_action_events_by_timesort_request** | [**CoreCalendarGetActionEventsByTimesortRequest**](CoreCalendarGetActionEventsByTimesortRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetActionEventsByTimesort200Response**](core_calendar_get_action_events_by_timesort_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_allowed_event_types

> models::CoreCalendarGetAllowedEventTypes200Response core_calendar_get_allowed_event_types(core_calendar_get_allowed_event_types_request)
Get the type of events a user can create in the given course.

Get the type of events a user can create in the given course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_allowed_event_types_request** | [**CoreCalendarGetAllowedEventTypesRequest**](CoreCalendarGetAllowedEventTypesRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetAllowedEventTypes200Response**](core_calendar_get_allowed_event_types_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_access_information

> models::CoreCalendarGetCalendarAccessInformation200Response core_calendar_get_calendar_access_information(core_calendar_get_calendar_access_information_request)
Convenience function to retrieve some permissions/access information for the given course calendar.

Convenience function to retrieve some permissions/access information for the given course calendar.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_access_information_request** | [**CoreCalendarGetCalendarAccessInformationRequest**](CoreCalendarGetCalendarAccessInformationRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarAccessInformation200Response**](core_calendar_get_calendar_access_information_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_day_view

> models::CoreCalendarGetCalendarDayView200Response core_calendar_get_calendar_day_view(core_calendar_get_calendar_day_view_request)
Fetch the day view data for a calendar

Fetch the day view data for a calendar

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_day_view_request** | [**CoreCalendarGetCalendarDayViewRequest**](CoreCalendarGetCalendarDayViewRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarDayView200Response**](core_calendar_get_calendar_day_view_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_event_by_id

> models::CoreCalendarGetCalendarEventById200Response core_calendar_get_calendar_event_by_id(core_calendar_get_calendar_event_by_id_request)
Get calendar event by id

Get calendar event by id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_event_by_id_request** | [**CoreCalendarGetCalendarEventByIdRequest**](CoreCalendarGetCalendarEventByIdRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarEventById200Response**](core_calendar_get_calendar_event_by_id_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_events

> models::CoreCalendarGetCalendarEvents200Response core_calendar_get_calendar_events(core_calendar_get_calendar_events_request)
Get calendar events

Get calendar events

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_events_request** | [**CoreCalendarGetCalendarEventsRequest**](CoreCalendarGetCalendarEventsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarEvents200Response**](core_calendar_get_calendar_events_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_export_token

> models::CoreCalendarGetCalendarExportToken200Response core_calendar_get_calendar_export_token()
Return the auth token required for exporting a calendar.

Return the auth token required for exporting a calendar.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreCalendarGetCalendarExportToken200Response**](core_calendar_get_calendar_export_token_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_monthly_view

> models::CoreCalendarGetCalendarMonthlyView200Response core_calendar_get_calendar_monthly_view(core_calendar_get_calendar_monthly_view_request)
Fetch the monthly view data for a calendar

Fetch the monthly view data for a calendar

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_monthly_view_request** | [**CoreCalendarGetCalendarMonthlyViewRequest**](CoreCalendarGetCalendarMonthlyViewRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarMonthlyView200Response**](core_calendar_get_calendar_monthly_view_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_calendar_upcoming_view

> models::CoreCalendarGetCalendarUpcomingView200Response core_calendar_get_calendar_upcoming_view(core_calendar_get_calendar_upcoming_view_request)
Fetch the upcoming view data for a calendar

Fetch the upcoming view data for a calendar

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_calendar_upcoming_view_request** | [**CoreCalendarGetCalendarUpcomingViewRequest**](CoreCalendarGetCalendarUpcomingViewRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetCalendarUpcomingView200Response**](core_calendar_get_calendar_upcoming_view_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_get_timestamps

> models::CoreCalendarGetTimestamps200Response core_calendar_get_timestamps(core_calendar_get_timestamps_request)
Fetch unix timestamps for given date times.

Fetch unix timestamps for given date times.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_get_timestamps_request** | [**CoreCalendarGetTimestampsRequest**](CoreCalendarGetTimestampsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarGetTimestamps200Response**](core_calendar_get_timestamps_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_submit_create_update_form

> models::CoreCalendarSubmitCreateUpdateForm200Response core_calendar_submit_create_update_form(core_calendar_submit_create_update_form_request)
Submit form data for event form

Submit form data for event form

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_submit_create_update_form_request** | [**CoreCalendarSubmitCreateUpdateFormRequest**](CoreCalendarSubmitCreateUpdateFormRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarSubmitCreateUpdateForm200Response**](core_calendar_submit_create_update_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_calendar_update_event_start_day

> models::CoreCalendarUpdateEventStartDay200Response core_calendar_update_event_start_day(core_calendar_update_event_start_day_request)
Update the start day (but not time) for an event.

Update the start day (but not time) for an event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_calendar_update_event_start_day_request** | [**CoreCalendarUpdateEventStartDayRequest**](CoreCalendarUpdateEventStartDayRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarUpdateEventStartDay200Response**](core_calendar_update_event_start_day_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_change_editmode

> models::CoreChangeEditmode200Response core_change_editmode(core_change_editmode_request)
Change the editing mode

Change the editing mode

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_change_editmode_request** | [**CoreChangeEditmodeRequest**](CoreChangeEditmodeRequest.md) |  | [required] |

### Return type

[**models::CoreChangeEditmode200Response**](core_change_editmode_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_add_cohort_members

> models::CoreCohortAddCohortMembers200Response core_cohort_add_cohort_members(core_cohort_add_cohort_members_request)
Adds cohort members.

Adds cohort members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_add_cohort_members_request** | [**CoreCohortAddCohortMembersRequest**](CoreCohortAddCohortMembersRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_create_cohorts

> serde_json::Value core_cohort_create_cohorts(core_cohort_create_cohorts_request)
Creates new cohorts.

Creates new cohorts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_create_cohorts_request** | [**CoreCohortCreateCohortsRequest**](CoreCohortCreateCohortsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_delete_cohort_members

> serde_json::Value core_cohort_delete_cohort_members(core_cohort_delete_cohort_members_request)
Deletes cohort members.

Deletes cohort members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_delete_cohort_members_request** | [**CoreCohortDeleteCohortMembersRequest**](CoreCohortDeleteCohortMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_delete_cohorts

> serde_json::Value core_cohort_delete_cohorts(core_cohort_delete_cohorts_request)
Deletes all specified cohorts.

Deletes all specified cohorts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_delete_cohorts_request** | [**CoreCohortDeleteCohortsRequest**](CoreCohortDeleteCohortsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_get_cohort_members

> serde_json::Value core_cohort_get_cohort_members(core_cohort_get_cohort_members_request)
Returns cohort members.

Returns cohort members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_get_cohort_members_request** | [**CoreCohortGetCohortMembersRequest**](CoreCohortGetCohortMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_get_cohorts

> serde_json::Value core_cohort_get_cohorts(core_cohort_get_cohorts_request)
Returns cohort details.

Returns cohort details.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_get_cohorts_request** | [**CoreCohortGetCohortsRequest**](CoreCohortGetCohortsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_search_cohorts

> models::CoreCohortSearchCohorts200Response core_cohort_search_cohorts(core_cohort_search_cohorts_request)
Search for cohorts.

Search for cohorts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_search_cohorts_request** | [**CoreCohortSearchCohortsRequest**](CoreCohortSearchCohortsRequest.md) |  | [required] |

### Return type

[**models::CoreCohortSearchCohorts200Response**](core_cohort_search_cohorts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_cohort_update_cohorts

> serde_json::Value core_cohort_update_cohorts(core_cohort_update_cohorts_request)
Updates existing cohorts.

Updates existing cohorts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_cohort_update_cohorts_request** | [**CoreCohortUpdateCohortsRequest**](CoreCohortUpdateCohortsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_comment_add_comments

> serde_json::Value core_comment_add_comments(core_comment_add_comments_request)
Adds a comment or comments.

Adds a comment or comments.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_comment_add_comments_request** | [**CoreCommentAddCommentsRequest**](CoreCommentAddCommentsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_comment_delete_comments

> serde_json::Value core_comment_delete_comments(core_comment_delete_comments_request)
Deletes a comment or comments.

Deletes a comment or comments.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_comment_delete_comments_request** | [**CoreCommentDeleteCommentsRequest**](CoreCommentDeleteCommentsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_comment_get_comments

> models::CoreCommentGetComments200Response core_comment_get_comments(core_comment_get_comments_request)
Returns comments.

Returns comments.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_comment_get_comments_request** | [**CoreCommentGetCommentsRequest**](CoreCommentGetCommentsRequest.md) |  | [required] |

### Return type

[**models::CoreCommentGetComments200Response**](core_comment_get_comments_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_add_competency_to_course

> serde_json::Value core_competency_add_competency_to_course(core_competency_add_competency_to_course_request)
Add the competency to a course

Add the competency to a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_add_competency_to_course_request** | [**CoreCompetencyAddCompetencyToCourseRequest**](CoreCompetencyAddCompetencyToCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_add_competency_to_plan

> serde_json::Value core_competency_add_competency_to_plan(core_competency_add_competency_to_plan_request)
Add the competency to a learning plan

Add the competency to a learning plan

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_add_competency_to_plan_request** | [**CoreCompetencyAddCompetencyToPlanRequest**](CoreCompetencyAddCompetencyToPlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_add_competency_to_template

> serde_json::Value core_competency_add_competency_to_template(core_competency_add_competency_to_template_request)
Add the competency to a template

Add the competency to a template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_add_competency_to_template_request** | [**CoreCompetencyAddCompetencyToTemplateRequest**](CoreCompetencyAddCompetencyToTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_add_related_competency

> serde_json::Value core_competency_add_related_competency(core_competency_add_related_competency_request)
Adds a related competency

Adds a related competency

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_add_related_competency_request** | [**CoreCompetencyAddRelatedCompetencyRequest**](CoreCompetencyAddRelatedCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_approve_plan

> serde_json::Value core_competency_approve_plan(core_competency_approve_plan_request)
Approve a plan.

Approve a plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_approve_plan_request** | [**CoreCompetencyApprovePlanRequest**](CoreCompetencyApprovePlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_competency_framework_viewed

> serde_json::Value core_competency_competency_framework_viewed(core_competency_competency_framework_viewed_request)
Log event competency framework viewed

Log event competency framework viewed

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_framework_viewed_request** | [**CoreCompetencyCompetencyFrameworkViewedRequest**](CoreCompetencyCompetencyFrameworkViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_competency_viewed

> serde_json::Value core_competency_competency_viewed(core_competency_competency_viewed_request)
Log event competency viewed

Log event competency viewed

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_complete_plan

> serde_json::Value core_competency_complete_plan(core_competency_complete_plan_request)
Complete learning plan.

Complete learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_complete_plan_request** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_competencies

> serde_json::Value core_competency_count_competencies(core_competency_count_competencies_request)
Count a list of a competencies.

Count a list of a competencies.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_request** | [**CoreCompetencyCountCompetenciesRequest**](CoreCompetencyCountCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_competencies_in_course

> serde_json::Value core_competency_count_competencies_in_course(core_competency_count_competencies_in_course_request)
List the competencies in a course

List the competencies in a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_course_request** | [**CoreCompetencyCountCompetenciesInCourseRequest**](CoreCompetencyCountCompetenciesInCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_competencies_in_template

> serde_json::Value core_competency_count_competencies_in_template(core_competency_count_competencies_in_template_request)
Count a list of a competencies for a given template.

Count a list of a competencies for a given template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_template_request** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_competency_frameworks

> serde_json::Value core_competency_count_competency_frameworks(core_competency_count_competency_frameworks_request)
Count a list of a competency frameworks.

Count a list of a competency frameworks.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competency_frameworks_request** | [**CoreCompetencyCountCompetencyFrameworksRequest**](CoreCompetencyCountCompetencyFrameworksRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_course_module_competencies

> serde_json::Value core_competency_count_course_module_competencies(core_competency_count_course_module_competencies_request)
Count the competencies in a course module

Count the competencies in a course module

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_course_module_competencies_request** | [**CoreCompetencyCountCourseModuleCompetenciesRequest**](CoreCompetencyCountCourseModuleCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_courses_using_competency

> serde_json::Value core_competency_count_courses_using_competency(core_competency_competency_viewed_request)
List the courses using a competency

List the courses using a competency

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_templates

> serde_json::Value core_competency_count_templates(core_competency_count_competency_frameworks_request)
Count a list of a learning plan templates.

Count a list of a learning plan templates.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competency_frameworks_request** | [**CoreCompetencyCountCompetencyFrameworksRequest**](CoreCompetencyCountCompetencyFrameworksRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_count_templates_using_competency

> serde_json::Value core_competency_count_templates_using_competency(core_competency_competency_viewed_request)
Count a list of a learning plan templates for a given competency.

Count a list of a learning plan templates for a given competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_create_competency

> models::CoreCompetencyCreateCompetency200Response core_competency_create_competency(core_competency_create_competency_request)
Creates new competencies.

Creates new competencies.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_create_competency_request** | [**CoreCompetencyCreateCompetencyRequest**](CoreCompetencyCreateCompetencyRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateCompetency200Response**](core_competency_create_competency_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_create_competency_framework

> models::CoreCompetencyCreateCompetencyFramework200Response core_competency_create_competency_framework(core_competency_create_competency_framework_request)
Creates new competency frameworks.

Creates new competency frameworks.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_create_competency_framework_request** | [**CoreCompetencyCreateCompetencyFrameworkRequest**](CoreCompetencyCreateCompetencyFrameworkRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateCompetencyFramework200Response**](core_competency_create_competency_framework_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_create_plan

> models::CoreCompetencyCreatePlan200Response core_competency_create_plan(core_competency_create_plan_request)
Creates a learning plan.

Creates a learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_create_plan_request** | [**CoreCompetencyCreatePlanRequest**](CoreCompetencyCreatePlanRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreatePlan200Response**](core_competency_create_plan_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_create_template

> models::CoreCompetencyCreateTemplate200Response core_competency_create_template(core_competency_create_template_request)
Creates new learning plan templates.

Creates new learning plan templates.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_create_template_request** | [**CoreCompetencyCreateTemplateRequest**](CoreCompetencyCreateTemplateRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateTemplate200Response**](core_competency_create_template_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_create_user_evidence_competency

> models::CoreCompetencyCreateUserEvidenceCompetency200Response core_competency_create_user_evidence_competency(core_competency_create_user_evidence_competency_request)
Create an evidence of prior learning relationship with a competency.

Create an evidence of prior learning relationship with a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_create_user_evidence_competency_request** | [**CoreCompetencyCreateUserEvidenceCompetencyRequest**](CoreCompetencyCreateUserEvidenceCompetencyRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateUserEvidenceCompetency200Response**](core_competency_create_user_evidence_competency_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_competency

> serde_json::Value core_competency_delete_competency(core_competency_delete_competency_request)
Delete a competency.

Delete a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_competency_request** | [**CoreCompetencyDeleteCompetencyRequest**](CoreCompetencyDeleteCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_competency_framework

> serde_json::Value core_competency_delete_competency_framework(core_competency_delete_competency_framework_request)
Delete a competency framework.

Delete a competency framework.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_competency_framework_request** | [**CoreCompetencyDeleteCompetencyFrameworkRequest**](CoreCompetencyDeleteCompetencyFrameworkRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_evidence

> serde_json::Value core_competency_delete_evidence(core_competency_delete_evidence_request)
Delete an evidence

Delete an evidence

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_evidence_request** | [**CoreCompetencyDeleteEvidenceRequest**](CoreCompetencyDeleteEvidenceRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_plan

> serde_json::Value core_competency_delete_plan(core_competency_delete_plan_request)
Delete a learning plan.

Delete a learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_plan_request** | [**CoreCompetencyDeletePlanRequest**](CoreCompetencyDeletePlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_template

> serde_json::Value core_competency_delete_template(core_competency_delete_template_request)
Delete a learning plan template.

Delete a learning plan template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_template_request** | [**CoreCompetencyDeleteTemplateRequest**](CoreCompetencyDeleteTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_user_evidence

> serde_json::Value core_competency_delete_user_evidence(core_competency_delete_user_evidence_request)
Delete an evidence of prior learning.

Delete an evidence of prior learning.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_user_evidence_request** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_delete_user_evidence_competency

> serde_json::Value core_competency_delete_user_evidence_competency(core_competency_delete_user_evidence_competency_request)
Delete an evidence of prior learning relationship with a competency.

Delete an evidence of prior learning relationship with a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_user_evidence_competency_request** | [**CoreCompetencyDeleteUserEvidenceCompetencyRequest**](CoreCompetencyDeleteUserEvidenceCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_duplicate_competency_framework

> models::CoreCompetencyDuplicateCompetencyFramework200Response core_competency_duplicate_competency_framework(core_competency_duplicate_competency_framework_request)
Duplicate a competency framework.

Duplicate a competency framework.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_duplicate_competency_framework_request** | [**CoreCompetencyDuplicateCompetencyFrameworkRequest**](CoreCompetencyDuplicateCompetencyFrameworkRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyDuplicateCompetencyFramework200Response**](core_competency_duplicate_competency_framework_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_duplicate_template

> models::CoreCompetencyCreateTemplate200Response core_competency_duplicate_template(core_competency_count_competencies_in_template_request)
Duplicate learning plan template.

Duplicate learning plan template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_template_request** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateTemplate200Response**](core_competency_create_template_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_get_scale_values

> serde_json::Value core_competency_get_scale_values(core_competency_get_scale_values_request)
Fetch the values for a specific scale

Fetch the values for a specific scale

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_get_scale_values_request** | [**CoreCompetencyGetScaleValuesRequest**](CoreCompetencyGetScaleValuesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_grade_competency

> models::CoreCompetencyGradeCompetency200Response core_competency_grade_competency(core_competency_grade_competency_request)
Grade a competency.

Grade a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_grade_competency_request** | [**CoreCompetencyGradeCompetencyRequest**](CoreCompetencyGradeCompetencyRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyGradeCompetency200Response**](core_competency_grade_competency_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_grade_competency_in_course

> models::CoreCompetencyGradeCompetencyInCourse200Response core_competency_grade_competency_in_course(core_competency_grade_competency_in_course_request)
Grade a competency from the course page.

Grade a competency from the course page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_grade_competency_in_course_request** | [**CoreCompetencyGradeCompetencyInCourseRequest**](CoreCompetencyGradeCompetencyInCourseRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyGradeCompetencyInCourse200Response**](core_competency_grade_competency_in_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_grade_competency_in_plan

> models::CoreCompetencyGradeCompetencyInCourse200Response core_competency_grade_competency_in_plan(core_competency_grade_competency_in_plan_request)
Grade a competency from the user plan page.

Grade a competency from the user plan page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_grade_competency_in_plan_request** | [**CoreCompetencyGradeCompetencyInPlanRequest**](CoreCompetencyGradeCompetencyInPlanRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyGradeCompetencyInCourse200Response**](core_competency_grade_competency_in_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_competencies

> serde_json::Value core_competency_list_competencies(core_competency_list_competencies_request)
Load a list of a competencies.

Load a list of a competencies.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_competencies_request** | [**CoreCompetencyListCompetenciesRequest**](CoreCompetencyListCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_competencies_in_template

> serde_json::Value core_competency_list_competencies_in_template(core_competency_count_competencies_in_template_request)
Load a list of a competencies for a given template.

Load a list of a competencies for a given template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_template_request** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_competency_frameworks

> serde_json::Value core_competency_list_competency_frameworks(core_competency_list_competency_frameworks_request)
Load a list of a competency frameworks.

Load a list of a competency frameworks.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_competency_frameworks_request** | [**CoreCompetencyListCompetencyFrameworksRequest**](CoreCompetencyListCompetencyFrameworksRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_course_competencies

> serde_json::Value core_competency_list_course_competencies(core_competency_count_competencies_in_course_request)
List the competencies in a course

List the competencies in a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_course_request** | [**CoreCompetencyCountCompetenciesInCourseRequest**](CoreCompetencyCountCompetenciesInCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_course_module_competencies

> serde_json::Value core_competency_list_course_module_competencies(core_competency_list_course_module_competencies_request)
List the competencies in a course module

List the competencies in a course module

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_course_module_competencies_request** | [**CoreCompetencyListCourseModuleCompetenciesRequest**](CoreCompetencyListCourseModuleCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_plan_competencies

> serde_json::Value core_competency_list_plan_competencies(core_competency_list_plan_competencies_request)
List the competencies in a plan

List the competencies in a plan

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_plan_competencies_request** | [**CoreCompetencyListPlanCompetenciesRequest**](CoreCompetencyListPlanCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_templates

> serde_json::Value core_competency_list_templates(core_competency_list_templates_request)
Load a list of a learning plan templates.

Load a list of a learning plan templates.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_templates_request** | [**CoreCompetencyListTemplatesRequest**](CoreCompetencyListTemplatesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_templates_using_competency

> serde_json::Value core_competency_list_templates_using_competency(core_competency_competency_viewed_request)
Load a list of a learning plan templates for a given competency.

Load a list of a learning plan templates for a given competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_list_user_plans

> serde_json::Value core_competency_list_user_plans(core_competency_list_user_plans_request)
List a user's learning plans.

List a user's learning plans.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_user_plans_request** | [**CoreCompetencyListUserPlansRequest**](CoreCompetencyListUserPlansRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_move_down_competency

> serde_json::Value core_competency_move_down_competency(core_competency_competency_viewed_request)
Re-order a competency.

Re-order a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_move_up_competency

> serde_json::Value core_competency_move_up_competency(core_competency_competency_viewed_request)
Re-order a competency.

Re-order a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_competency_viewed_request** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_plan_cancel_review_request

> serde_json::Value core_competency_plan_cancel_review_request(core_competency_plan_cancel_review_request_request)
Cancel the review of a plan.

Cancel the review of a plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_plan_cancel_review_request_request** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_plan_request_review

> serde_json::Value core_competency_plan_request_review(core_competency_plan_cancel_review_request_request)
Request for a plan to be reviewed.

Request for a plan to be reviewed.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_plan_cancel_review_request_request** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_plan_start_review

> serde_json::Value core_competency_plan_start_review(core_competency_plan_cancel_review_request_request)
Start the review of a plan.

Start the review of a plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_plan_cancel_review_request_request** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_plan_stop_review

> serde_json::Value core_competency_plan_stop_review(core_competency_plan_cancel_review_request_request)
Stop the review of a plan.

Stop the review of a plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_plan_cancel_review_request_request** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_read_competency

> models::CoreCompetencyCreateCompetency200Response core_competency_read_competency(core_competency_read_competency_request)
Load a summary of a competency.

Load a summary of a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_read_competency_request** | [**CoreCompetencyReadCompetencyRequest**](CoreCompetencyReadCompetencyRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateCompetency200Response**](core_competency_create_competency_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_read_competency_framework

> models::CoreCompetencyDuplicateCompetencyFramework200Response core_competency_read_competency_framework(core_competency_duplicate_competency_framework_request)
Load a summary of a competency framework.

Load a summary of a competency framework.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_duplicate_competency_framework_request** | [**CoreCompetencyDuplicateCompetencyFrameworkRequest**](CoreCompetencyDuplicateCompetencyFrameworkRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyDuplicateCompetencyFramework200Response**](core_competency_duplicate_competency_framework_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_read_plan

> models::CoreCompetencyReadPlan200Response core_competency_read_plan(core_competency_read_plan_request)
Load a learning plan.

Load a learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_read_plan_request** | [**CoreCompetencyReadPlanRequest**](CoreCompetencyReadPlanRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyReadPlan200Response**](core_competency_read_plan_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_read_template

> models::CoreCompetencyCreateTemplate200Response core_competency_read_template(core_competency_read_template_request)
Load a summary of a learning plan template.

Load a summary of a learning plan template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_read_template_request** | [**CoreCompetencyReadTemplateRequest**](CoreCompetencyReadTemplateRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyCreateTemplate200Response**](core_competency_create_template_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_read_user_evidence

> models::CoreCompetencyReadUserEvidence200Response core_competency_read_user_evidence(core_competency_delete_user_evidence_request)
Read an evidence of prior learning.

Read an evidence of prior learning.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_user_evidence_request** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyReadUserEvidence200Response**](core_competency_read_user_evidence_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_remove_competency_from_course

> serde_json::Value core_competency_remove_competency_from_course(core_competency_remove_competency_from_course_request)
Remove a competency from a course

Remove a competency from a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_remove_competency_from_course_request** | [**CoreCompetencyRemoveCompetencyFromCourseRequest**](CoreCompetencyRemoveCompetencyFromCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_remove_competency_from_plan

> serde_json::Value core_competency_remove_competency_from_plan(core_competency_remove_competency_from_plan_request)
Remove the competency from a learning plan

Remove the competency from a learning plan

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_remove_competency_from_plan_request** | [**CoreCompetencyRemoveCompetencyFromPlanRequest**](CoreCompetencyRemoveCompetencyFromPlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_remove_competency_from_template

> serde_json::Value core_competency_remove_competency_from_template(core_competency_remove_competency_from_template_request)
Remove a competency from a template

Remove a competency from a template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_remove_competency_from_template_request** | [**CoreCompetencyRemoveCompetencyFromTemplateRequest**](CoreCompetencyRemoveCompetencyFromTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_remove_related_competency

> serde_json::Value core_competency_remove_related_competency(core_competency_remove_related_competency_request)
Remove a related competency

Remove a related competency

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_remove_related_competency_request** | [**CoreCompetencyRemoveRelatedCompetencyRequest**](CoreCompetencyRemoveRelatedCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_reopen_plan

> serde_json::Value core_competency_reopen_plan(core_competency_complete_plan_request)
Reopen learning plan.

Reopen learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_complete_plan_request** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_reorder_course_competency

> serde_json::Value core_competency_reorder_course_competency(core_competency_reorder_course_competency_request)
Move a course competency to a new relative sort order.

Move a course competency to a new relative sort order.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_reorder_course_competency_request** | [**CoreCompetencyReorderCourseCompetencyRequest**](CoreCompetencyReorderCourseCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_reorder_plan_competency

> serde_json::Value core_competency_reorder_plan_competency(core_competency_reorder_plan_competency_request)
Move a plan competency to a new relative sort order.

Move a plan competency to a new relative sort order.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_reorder_plan_competency_request** | [**CoreCompetencyReorderPlanCompetencyRequest**](CoreCompetencyReorderPlanCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_reorder_template_competency

> serde_json::Value core_competency_reorder_template_competency(core_competency_reorder_template_competency_request)
Move a template competency to a new relative sort order.

Move a template competency to a new relative sort order.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_reorder_template_competency_request** | [**CoreCompetencyReorderTemplateCompetencyRequest**](CoreCompetencyReorderTemplateCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_request_review_of_user_evidence_linked_competencies

> serde_json::Value core_competency_request_review_of_user_evidence_linked_competencies(core_competency_delete_user_evidence_request)
Send user evidence competencies in review

Send user evidence competencies in review

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_delete_user_evidence_request** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_search_competencies

> serde_json::Value core_competency_search_competencies(core_competency_search_competencies_request)
Search a list of a competencies.

Search a list of a competencies.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_search_competencies_request** | [**CoreCompetencySearchCompetenciesRequest**](CoreCompetencySearchCompetenciesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_set_course_competency_ruleoutcome

> serde_json::Value core_competency_set_course_competency_ruleoutcome(core_competency_set_course_competency_ruleoutcome_request)
Modify the ruleoutcome value for course competency

Modify the ruleoutcome value for course competency

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_set_course_competency_ruleoutcome_request** | [**CoreCompetencySetCourseCompetencyRuleoutcomeRequest**](CoreCompetencySetCourseCompetencyRuleoutcomeRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_set_parent_competency

> serde_json::Value core_competency_set_parent_competency(core_competency_set_parent_competency_request)
Set a new parent for a competency.

Set a new parent for a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_set_parent_competency_request** | [**CoreCompetencySetParentCompetencyRequest**](CoreCompetencySetParentCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_template_has_related_data

> serde_json::Value core_competency_template_has_related_data(core_competency_count_competencies_in_template_request)
Check if a template has related data

Check if a template has related data

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_count_competencies_in_template_request** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_template_viewed

> serde_json::Value core_competency_template_viewed(core_competency_read_template_request)
Log event template viewed

Log event template viewed

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_read_template_request** | [**CoreCompetencyReadTemplateRequest**](CoreCompetencyReadTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_unapprove_plan

> serde_json::Value core_competency_unapprove_plan(core_competency_plan_cancel_review_request_request)
Unapprove a plan.

Unapprove a plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_plan_cancel_review_request_request** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_unlink_plan_from_template

> serde_json::Value core_competency_unlink_plan_from_template(core_competency_unlink_plan_from_template_request)
Unlink a plan form it template.

Unlink a plan form it template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_unlink_plan_from_template_request** | [**CoreCompetencyUnlinkPlanFromTemplateRequest**](CoreCompetencyUnlinkPlanFromTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_update_competency

> serde_json::Value core_competency_update_competency(core_competency_update_competency_request)
Update a competency.

Update a competency.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_update_competency_request** | [**CoreCompetencyUpdateCompetencyRequest**](CoreCompetencyUpdateCompetencyRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_update_competency_framework

> serde_json::Value core_competency_update_competency_framework(core_competency_update_competency_framework_request)
Update a competency framework.

Update a competency framework.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_update_competency_framework_request** | [**CoreCompetencyUpdateCompetencyFrameworkRequest**](CoreCompetencyUpdateCompetencyFrameworkRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_update_course_competency_settings

> serde_json::Value core_competency_update_course_competency_settings(core_competency_update_course_competency_settings_request)
Update the course competency settings

Update the course competency settings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_update_course_competency_settings_request** | [**CoreCompetencyUpdateCourseCompetencySettingsRequest**](CoreCompetencyUpdateCourseCompetencySettingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_update_plan

> models::CoreCompetencyReadPlan200Response core_competency_update_plan(core_competency_update_plan_request)
Updates a learning plan.

Updates a learning plan.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_update_plan_request** | [**CoreCompetencyUpdatePlanRequest**](CoreCompetencyUpdatePlanRequest.md) |  | [required] |

### Return type

[**models::CoreCompetencyReadPlan200Response**](core_competency_read_plan_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_update_template

> serde_json::Value core_competency_update_template(core_competency_update_template_request)
Update a learning plan template.

Update a learning plan template.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_update_template_request** | [**CoreCompetencyUpdateTemplateRequest**](CoreCompetencyUpdateTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_cancel_review_request

> serde_json::Value core_competency_user_competency_cancel_review_request(core_competency_user_competency_cancel_review_request_request)
Cancel a review request.

Cancel a review request.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_cancel_review_request_request** | [**CoreCompetencyUserCompetencyCancelReviewRequestRequest**](CoreCompetencyUserCompetencyCancelReviewRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_plan_viewed

> serde_json::Value core_competency_user_competency_plan_viewed(core_competency_user_competency_plan_viewed_request)
Log the user competency plan viewed event.

Log the user competency plan viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_plan_viewed_request** | [**CoreCompetencyUserCompetencyPlanViewedRequest**](CoreCompetencyUserCompetencyPlanViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_request_review

> serde_json::Value core_competency_user_competency_request_review(core_competency_user_competency_request_review_request)
Request a review.

Request a review.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_request_review_request** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_start_review

> serde_json::Value core_competency_user_competency_start_review(core_competency_user_competency_request_review_request)
Start a review.

Start a review.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_request_review_request** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_stop_review

> serde_json::Value core_competency_user_competency_stop_review(core_competency_user_competency_request_review_request)
Stop a review.

Stop a review.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_request_review_request** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_viewed

> serde_json::Value core_competency_user_competency_viewed(core_competency_user_competency_viewed_request)
Log the user competency viewed event.

Log the user competency viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_viewed_request** | [**CoreCompetencyUserCompetencyViewedRequest**](CoreCompetencyUserCompetencyViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_viewed_in_course

> serde_json::Value core_competency_user_competency_viewed_in_course(core_competency_user_competency_viewed_in_course_request)
Log the user competency viewed in course event

Log the user competency viewed in course event

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_viewed_in_course_request** | [**CoreCompetencyUserCompetencyViewedInCourseRequest**](CoreCompetencyUserCompetencyViewedInCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_competency_user_competency_viewed_in_plan

> serde_json::Value core_competency_user_competency_viewed_in_plan(core_competency_user_competency_plan_viewed_request)
Log the user competency viewed in plan event.

Log the user competency viewed in plan event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_user_competency_plan_viewed_request** | [**CoreCompetencyUserCompetencyPlanViewedRequest**](CoreCompetencyUserCompetencyPlanViewedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_completion_get_activities_completion_status

> models::CoreCompletionGetActivitiesCompletionStatus200Response core_completion_get_activities_completion_status(core_completion_get_activities_completion_status_request)
Return the activities completion status for a user in a course.

Return the activities completion status for a user in a course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_get_activities_completion_status_request** | [**CoreCompletionGetActivitiesCompletionStatusRequest**](CoreCompletionGetActivitiesCompletionStatusRequest.md) |  | [required] |

### Return type

[**models::CoreCompletionGetActivitiesCompletionStatus200Response**](core_completion_get_activities_completion_status_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_completion_get_course_completion_status

> models::CoreCompletionGetCourseCompletionStatus200Response core_completion_get_course_completion_status(core_completion_get_activities_completion_status_request)
Returns course completion status.

Returns course completion status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_get_activities_completion_status_request** | [**CoreCompletionGetActivitiesCompletionStatusRequest**](CoreCompletionGetActivitiesCompletionStatusRequest.md) |  | [required] |

### Return type

[**models::CoreCompletionGetCourseCompletionStatus200Response**](core_completion_get_course_completion_status_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_completion_mark_course_self_completed

> models::CoreCompletionMarkCourseSelfCompleted200Response core_completion_mark_course_self_completed(core_completion_mark_course_self_completed_request)
Update the course completion status for the current user (if course self-completion is enabled).

Update the course completion status for the current user (if course self-completion is enabled).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_mark_course_self_completed_request** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | [required] |

### Return type

[**models::CoreCompletionMarkCourseSelfCompleted200Response**](core_completion_mark_course_self_completed_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_completion_override_activity_completion_status

> models::CoreCompletionOverrideActivityCompletionStatus200Response core_completion_override_activity_completion_status(core_completion_override_activity_completion_status_request)
Update completion status for a user in an activity by overriding it.

Update completion status for a user in an activity by overriding it.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_override_activity_completion_status_request** | [**CoreCompletionOverrideActivityCompletionStatusRequest**](CoreCompletionOverrideActivityCompletionStatusRequest.md) |  | [required] |

### Return type

[**models::CoreCompletionOverrideActivityCompletionStatus200Response**](core_completion_override_activity_completion_status_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_completion_update_activity_completion_status_manually

> models::CoreCompletionUpdateActivityCompletionStatusManually200Response core_completion_update_activity_completion_status_manually(core_completion_update_activity_completion_status_manually_request)
Update completion status for the current user in an activity, only for activities with manual tracking.

Update completion status for the current user in an activity, only for activities with manual tracking.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_update_activity_completion_status_manually_request** | [**CoreCompletionUpdateActivityCompletionStatusManuallyRequest**](CoreCompletionUpdateActivityCompletionStatusManuallyRequest.md) |  | [required] |

### Return type

[**models::CoreCompletionUpdateActivityCompletionStatusManually200Response**](core_completion_update_activity_completion_status_manually_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_contentbank_copy_content

> models::CoreContentbankCopyContent200Response core_contentbank_copy_content(core_contentbank_copy_content_request)
Copy a content in the content bank.

Copy a content in the content bank.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_contentbank_copy_content_request** | [**CoreContentbankCopyContentRequest**](CoreContentbankCopyContentRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankCopyContent200Response**](core_contentbank_copy_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_contentbank_delete_content

> models::CoreContentbankDeleteContent200Response core_contentbank_delete_content(core_contentbank_delete_content_request)
Delete a content from the content bank.

Delete a content from the content bank.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_contentbank_delete_content_request** | [**CoreContentbankDeleteContentRequest**](CoreContentbankDeleteContentRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankDeleteContent200Response**](core_contentbank_delete_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_contentbank_rename_content

> models::CoreContentbankRenameContent200Response core_contentbank_rename_content(core_contentbank_rename_content_request)
Rename a content in the content bank.

Rename a content in the content bank.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_contentbank_rename_content_request** | [**CoreContentbankRenameContentRequest**](CoreContentbankRenameContentRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_contentbank_set_content_visibility

> models::CoreContentbankRenameContent200Response core_contentbank_set_content_visibility(core_contentbank_set_content_visibility_request)
Set the visibility of a content in the content bank.

Set the visibility of a content in the content bank.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_contentbank_set_content_visibility_request** | [**CoreContentbankSetContentVisibilityRequest**](CoreContentbankSetContentVisibilityRequest.md) |  | [required] |

### Return type

[**models::CoreContentbankRenameContent200Response**](core_contentbank_rename_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_add_content_item_to_user_favourites

> models::CoreCourseAddContentItemToUserFavourites200Response core_course_add_content_item_to_user_favourites(core_course_add_content_item_to_user_favourites_request)
Adds a content item (activity, resource or their subtypes) to the favourites for the user.

Adds a content item (activity, resource or their subtypes) to the favourites for the user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_add_content_item_to_user_favourites_request** | [**CoreCourseAddContentItemToUserFavouritesRequest**](CoreCourseAddContentItemToUserFavouritesRequest.md) |  | [required] |

### Return type

[**models::CoreCourseAddContentItemToUserFavourites200Response**](core_course_add_content_item_to_user_favourites_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_check_updates

> models::CoreCourseCheckUpdates200Response core_course_check_updates(core_course_check_updates_request)
Check if there is updates affecting the user for the given course and contexts.

Check if there is updates affecting the user for the given course and contexts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_check_updates_request** | [**CoreCourseCheckUpdatesRequest**](CoreCourseCheckUpdatesRequest.md) |  | [required] |

### Return type

[**models::CoreCourseCheckUpdates200Response**](core_course_check_updates_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_create_categories

> serde_json::Value core_course_create_categories(core_course_create_categories_request)
Create course categories

Create course categories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_create_categories_request** | [**CoreCourseCreateCategoriesRequest**](CoreCourseCreateCategoriesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_create_courses

> serde_json::Value core_course_create_courses(core_course_create_courses_request)
Create new courses

Create new courses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_create_courses_request** | [**CoreCourseCreateCoursesRequest**](CoreCourseCreateCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_delete_categories

> serde_json::Value core_course_delete_categories(core_course_delete_categories_request)
Delete course categories

Delete course categories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_delete_categories_request** | [**CoreCourseDeleteCategoriesRequest**](CoreCourseDeleteCategoriesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_delete_courses

> models::CoreCohortAddCohortMembers200Response core_course_delete_courses(core_course_delete_courses_request)
Deletes all specified courses

Deletes all specified courses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_delete_courses_request** | [**CoreCourseDeleteCoursesRequest**](CoreCourseDeleteCoursesRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_delete_modules

> serde_json::Value core_course_delete_modules(core_course_delete_modules_request)
Deletes all specified module instances

Deletes all specified module instances

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_delete_modules_request** | [**CoreCourseDeleteModulesRequest**](CoreCourseDeleteModulesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_duplicate_course

> models::CoreCourseDuplicateCourse200Response core_course_duplicate_course(core_course_duplicate_course_request)
Duplicate an existing course (creating a new one).

Duplicate an existing course (creating a new one).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_duplicate_course_request** | [**CoreCourseDuplicateCourseRequest**](CoreCourseDuplicateCourseRequest.md) |  | [required] |

### Return type

[**models::CoreCourseDuplicateCourse200Response**](core_course_duplicate_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_edit_module

> serde_json::Value core_course_edit_module(core_course_edit_module_request)
Performs an action on course module (change visibility, duplicate, delete, etc.)

Performs an action on course module (change visibility, duplicate, delete, etc.)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_edit_module_request** | [**CoreCourseEditModuleRequest**](CoreCourseEditModuleRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_edit_section

> serde_json::Value core_course_edit_section(core_course_edit_section_request)
Performs an action on course section (change visibility, set marker, delete)

Performs an action on course section (change visibility, set marker, delete)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_edit_section_request** | [**CoreCourseEditSectionRequest**](CoreCourseEditSectionRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_activity_chooser_footer

> models::CoreCourseGetActivityChooserFooter200Response core_course_get_activity_chooser_footer(core_course_get_activity_chooser_footer_request)
Fetch the data for the activity chooser footer.

Fetch the data for the activity chooser footer.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_activity_chooser_footer_request** | [**CoreCourseGetActivityChooserFooterRequest**](CoreCourseGetActivityChooserFooterRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetActivityChooserFooter200Response**](core_course_get_activity_chooser_footer_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_categories

> serde_json::Value core_course_get_categories(core_course_get_categories_request)
Return category details

Return category details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_categories_request** | [**CoreCourseGetCategoriesRequest**](CoreCourseGetCategoriesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_contents

> serde_json::Value core_course_get_contents(core_course_get_contents_request)
Get course contents

Get course contents

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_contents_request** | [**CoreCourseGetContentsRequest**](CoreCourseGetContentsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_course_content_items

> models::CoreCourseGetCourseContentItems200Response core_course_get_course_content_items(core_course_get_course_content_items_request)
Fetch all the content items (activities, resources and their subtypes) for the activity picker

Fetch all the content items (activities, resources and their subtypes) for the activity picker

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_course_content_items_request** | [**CoreCourseGetCourseContentItemsRequest**](CoreCourseGetCourseContentItemsRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetCourseContentItems200Response**](core_course_get_course_content_items_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_course_module

> models::CoreCourseGetCourseModule200Response core_course_get_course_module(core_competency_list_course_module_competencies_request)
Return information about a course module

Return information about a course module

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_competency_list_course_module_competencies_request** | [**CoreCompetencyListCourseModuleCompetenciesRequest**](CoreCompetencyListCourseModuleCompetenciesRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetCourseModule200Response**](core_course_get_course_module_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_course_module_by_instance

> models::CoreCourseGetCourseModuleByInstance200Response core_course_get_course_module_by_instance(core_course_get_course_module_by_instance_request)
Return information about a given module name and instance id

Return information about a given module name and instance id

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_course_module_by_instance_request** | [**CoreCourseGetCourseModuleByInstanceRequest**](CoreCourseGetCourseModuleByInstanceRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetCourseModuleByInstance200Response**](core_course_get_course_module_by_instance_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_courses

> serde_json::Value core_course_get_courses(core_course_get_courses_request)
Return course details

Return course details

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_courses_request** | [**CoreCourseGetCoursesRequest**](CoreCourseGetCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_courses_by_field

> models::CoreCourseGetCoursesByField200Response core_course_get_courses_by_field(core_course_get_courses_by_field_request)
Get courses matching a specific field (id/s, shortname, idnumber, category)

Get courses matching a specific field (id/s, shortname, idnumber, category)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_courses_by_field_request** | [**CoreCourseGetCoursesByFieldRequest**](CoreCourseGetCoursesByFieldRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetCoursesByField200Response**](core_course_get_courses_by_field_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_enrolled_courses_by_timeline_classification

> models::CoreCourseGetEnrolledCoursesByTimelineClassification200Response core_course_get_enrolled_courses_by_timeline_classification(core_course_get_enrolled_courses_by_timeline_classification_request)
List of enrolled courses for the given timeline classification (past, inprogress, or future).

List of enrolled courses for the given timeline classification (past, inprogress, or future).

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_enrolled_courses_by_timeline_classification_request** | [**CoreCourseGetEnrolledCoursesByTimelineClassificationRequest**](CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetEnrolledCoursesByTimelineClassification200Response**](core_course_get_enrolled_courses_by_timeline_classification_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_enrolled_courses_with_action_events_by_timeline_classification

> models::CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response core_course_get_enrolled_courses_with_action_events_by_timeline_classification(core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request)
List of enrolled courses with action events in a given timeframe, for the given timeline classification.

List of enrolled courses with action events in a given timeframe, for the given timeline classification.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request** | [**CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest**](CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response**](core_course_get_enrolled_courses_with_action_events_by_timeline_classification_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_enrolled_users_by_cmid

> models::CoreCourseGetEnrolledUsersByCmid200Response core_course_get_enrolled_users_by_cmid(core_course_get_enrolled_users_by_cmid_request)
List users by course module id, filter by group and active enrolment status.

List users by course module id, filter by group and active enrolment status.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_enrolled_users_by_cmid_request** | [**CoreCourseGetEnrolledUsersByCmidRequest**](CoreCourseGetEnrolledUsersByCmidRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetEnrolledUsersByCmid200Response**](core_course_get_enrolled_users_by_cmid_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_module

> serde_json::Value core_course_get_module(core_course_get_module_request)
Returns html with one activity module on course page

Returns html with one activity module on course page

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_module_request** | [**CoreCourseGetModuleRequest**](CoreCourseGetModuleRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_recent_courses

> serde_json::Value core_course_get_recent_courses(core_course_get_recent_courses_request)
List of courses a user has accessed most recently.

List of courses a user has accessed most recently.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_recent_courses_request** | [**CoreCourseGetRecentCoursesRequest**](CoreCourseGetRecentCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_updates_since

> models::CoreCourseGetUpdatesSince200Response core_course_get_updates_since(core_course_get_updates_since_request)
Check if there are updates affecting the user for the given course since the given time stamp.

Check if there are updates affecting the user for the given course since the given time stamp.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_updates_since_request** | [**CoreCourseGetUpdatesSinceRequest**](CoreCourseGetUpdatesSinceRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetUpdatesSince200Response**](core_course_get_updates_since_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_user_administration_options

> models::CoreCourseGetUserAdministrationOptions200Response core_course_get_user_administration_options(core_course_get_user_administration_options_request)
Return a list of administration options in a set of courses that are avaialable or not for the current                             user.

Return a list of administration options in a set of courses that are avaialable or not for the current                             user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_user_administration_options_request** | [**CoreCourseGetUserAdministrationOptionsRequest**](CoreCourseGetUserAdministrationOptionsRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetUserAdministrationOptions200Response**](core_course_get_user_administration_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_get_user_navigation_options

> models::CoreCourseGetUserNavigationOptions200Response core_course_get_user_navigation_options(core_course_get_user_navigation_options_request)
Return a list of navigation options in a set of courses that are avaialable or not for the current user.

Return a list of navigation options in a set of courses that are avaialable or not for the current user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_get_user_navigation_options_request** | [**CoreCourseGetUserNavigationOptionsRequest**](CoreCourseGetUserNavigationOptionsRequest.md) |  | [required] |

### Return type

[**models::CoreCourseGetUserNavigationOptions200Response**](core_course_get_user_navigation_options_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_import_course

> serde_json::Value core_course_import_course(core_course_import_course_request)
Import course data from a course into another course. Does not include any user data.

Import course data from a course into another course. Does not include any user data.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_import_course_request** | [**CoreCourseImportCourseRequest**](CoreCourseImportCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_remove_content_item_from_user_favourites

> models::CoreCourseAddContentItemToUserFavourites200Response core_course_remove_content_item_from_user_favourites(core_course_remove_content_item_from_user_favourites_request)
Removes a content item (activity, resource or their subtypes) from the favourites for the user.

Removes a content item (activity, resource or their subtypes) from the favourites for the user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_remove_content_item_from_user_favourites_request** | [**CoreCourseRemoveContentItemFromUserFavouritesRequest**](CoreCourseRemoveContentItemFromUserFavouritesRequest.md) |  | [required] |

### Return type

[**models::CoreCourseAddContentItemToUserFavourites200Response**](core_course_add_content_item_to_user_favourites_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_search_courses

> models::CoreCourseSearchCourses200Response core_course_search_courses(core_course_search_courses_request)
Search courses by (name, module, block, tag)

Search courses by (name, module, block, tag)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_search_courses_request** | [**CoreCourseSearchCoursesRequest**](CoreCourseSearchCoursesRequest.md) |  | [required] |

### Return type

[**models::CoreCourseSearchCourses200Response**](core_course_search_courses_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_set_favourite_courses

> models::CoreCohortAddCohortMembers200Response core_course_set_favourite_courses(core_course_set_favourite_courses_request)
Add a list of courses to the list of favourite courses.

Add a list of courses to the list of favourite courses.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_set_favourite_courses_request** | [**CoreCourseSetFavouriteCoursesRequest**](CoreCourseSetFavouriteCoursesRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_toggle_activity_recommendation

> models::CoreCourseToggleActivityRecommendation200Response core_course_toggle_activity_recommendation(core_course_toggle_activity_recommendation_request)
Adds or removes an activity as a recommendation in the activity chooser.

Adds or removes an activity as a recommendation in the activity chooser.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_toggle_activity_recommendation_request** | [**CoreCourseToggleActivityRecommendationRequest**](CoreCourseToggleActivityRecommendationRequest.md) |  | [required] |

### Return type

[**models::CoreCourseToggleActivityRecommendation200Response**](core_course_toggle_activity_recommendation_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_update_categories

> serde_json::Value core_course_update_categories(core_course_update_categories_request)
Update categories

Update categories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_update_categories_request** | [**CoreCourseUpdateCategoriesRequest**](CoreCourseUpdateCategoriesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_update_courses

> models::CoreCohortAddCohortMembers200Response core_course_update_courses(core_course_update_courses_request)
Update courses

Update courses

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_update_courses_request** | [**CoreCourseUpdateCoursesRequest**](CoreCourseUpdateCoursesRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_course_view_course

> models::CoreCalendarDeleteSubscription200Response core_course_view_course(core_course_view_course_request)
Log that the course was viewed

Log that the course was viewed

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_course_view_course_request** | [**CoreCourseViewCourseRequest**](CoreCourseViewCourseRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_courseformat_file_handlers

> serde_json::Value core_courseformat_file_handlers(core_courseformat_file_handlers_request)
Get the current course file hanlders.

Get the current course file hanlders.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_courseformat_file_handlers_request** | [**CoreCourseformatFileHandlersRequest**](CoreCourseformatFileHandlersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_courseformat_get_state

> serde_json::Value core_courseformat_get_state(core_courseformat_file_handlers_request)
Get the current course state.

Get the current course state.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_courseformat_file_handlers_request** | [**CoreCourseformatFileHandlersRequest**](CoreCourseformatFileHandlersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_courseformat_update_course

> serde_json::Value core_courseformat_update_course(core_courseformat_update_course_request)
Update course contents.

Update course contents.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_courseformat_update_course_request** | [**CoreCourseformatUpdateCourseRequest**](CoreCourseformatUpdateCourseRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_create_userfeedback_action_record

> serde_json::Value core_create_userfeedback_action_record(core_create_userfeedback_action_record_request)
Record the action that the user takes in the user feedback notification for future use.

Record the action that the user takes in the user feedback notification for future use.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_create_userfeedback_action_record_request** | [**CoreCreateUserfeedbackActionRecordRequest**](CoreCreateUserfeedbackActionRecordRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_create_category

> serde_json::Value core_customfield_create_category(core_customfield_create_category_request)
Creates a new category

Creates a new category

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_create_category_request** | [**CoreCustomfieldCreateCategoryRequest**](CoreCustomfieldCreateCategoryRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_delete_category

> serde_json::Value core_customfield_delete_category(core_customfield_delete_category_request)
Deletes a category

Deletes a category

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_delete_category_request** | [**CoreCustomfieldDeleteCategoryRequest**](CoreCustomfieldDeleteCategoryRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_delete_field

> serde_json::Value core_customfield_delete_field(core_customfield_delete_field_request)
Deletes an entry

Deletes an entry

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_delete_field_request** | [**CoreCustomfieldDeleteFieldRequest**](CoreCustomfieldDeleteFieldRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_move_category

> serde_json::Value core_customfield_move_category(core_customfield_move_category_request)
Drag and drop categories

Drag and drop categories

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_move_category_request** | [**CoreCustomfieldMoveCategoryRequest**](CoreCustomfieldMoveCategoryRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_move_field

> serde_json::Value core_customfield_move_field(core_customfield_move_field_request)
Drag and drop

Drag and drop

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_move_field_request** | [**CoreCustomfieldMoveFieldRequest**](CoreCustomfieldMoveFieldRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_customfield_reload_template

> models::CoreCustomfieldReloadTemplate200Response core_customfield_reload_template(core_customfield_reload_template_request)
Reloads template

Reloads template

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_customfield_reload_template_request** | [**CoreCustomfieldReloadTemplateRequest**](CoreCustomfieldReloadTemplateRequest.md) |  | [required] |

### Return type

[**models::CoreCustomfieldReloadTemplate200Response**](core_customfield_reload_template_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_dynamic_tabs_get_content

> models::CoreDynamicTabsGetContent200Response core_dynamic_tabs_get_content(core_dynamic_tabs_get_content_request)
Returns the content for a dynamic tab

Returns the content for a dynamic tab

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_dynamic_tabs_get_content_request** | [**CoreDynamicTabsGetContentRequest**](CoreDynamicTabsGetContentRequest.md) |  | [required] |

### Return type

[**models::CoreDynamicTabsGetContent200Response**](core_dynamic_tabs_get_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_get_course_enrolment_methods

> serde_json::Value core_enrol_get_course_enrolment_methods(core_enrol_get_course_enrolment_methods_request)
Get the list of course enrolment methods

Get the list of course enrolment methods

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_get_course_enrolment_methods_request** | [**CoreEnrolGetCourseEnrolmentMethodsRequest**](CoreEnrolGetCourseEnrolmentMethodsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_get_enrolled_users

> serde_json::Value core_enrol_get_enrolled_users(core_enrol_get_enrolled_users_request)
Get enrolled users by course id.

Get enrolled users by course id.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_get_enrolled_users_request** | [**CoreEnrolGetEnrolledUsersRequest**](CoreEnrolGetEnrolledUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_get_enrolled_users_with_capability

> serde_json::Value core_enrol_get_enrolled_users_with_capability(core_enrol_get_enrolled_users_with_capability_request)
For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability

For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_get_enrolled_users_with_capability_request** | [**CoreEnrolGetEnrolledUsersWithCapabilityRequest**](CoreEnrolGetEnrolledUsersWithCapabilityRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_get_potential_users

> serde_json::Value core_enrol_get_potential_users(core_enrol_get_potential_users_request)
Get the list of potential users to enrol

Get the list of potential users to enrol

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_get_potential_users_request** | [**CoreEnrolGetPotentialUsersRequest**](CoreEnrolGetPotentialUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_get_users_courses

> serde_json::Value core_enrol_get_users_courses(core_enrol_get_users_courses_request)
Get the list of courses where a user is enrolled in

Get the list of courses where a user is enrolled in

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_get_users_courses_request** | [**CoreEnrolGetUsersCoursesRequest**](CoreEnrolGetUsersCoursesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_search_users

> serde_json::Value core_enrol_search_users(core_enrol_search_users_request)
Search within the list of course participants

Search within the list of course participants

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_search_users_request** | [**CoreEnrolSearchUsersRequest**](CoreEnrolSearchUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_submit_user_enrolment_form

> models::CoreEnrolSubmitUserEnrolmentForm200Response core_enrol_submit_user_enrolment_form(core_enrol_submit_user_enrolment_form_request)
Submit form data for enrolment form

Submit form data for enrolment form

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_submit_user_enrolment_form_request** | [**CoreEnrolSubmitUserEnrolmentFormRequest**](CoreEnrolSubmitUserEnrolmentFormRequest.md) |  | [required] |

### Return type

[**models::CoreEnrolSubmitUserEnrolmentForm200Response**](core_enrol_submit_user_enrolment_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_enrol_unenrol_user_enrolment

> models::CoreEnrolUnenrolUserEnrolment200Response core_enrol_unenrol_user_enrolment(core_enrol_unenrol_user_enrolment_request)
External function that unenrols a given user enrolment

External function that unenrols a given user enrolment

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_enrol_unenrol_user_enrolment_request** | [**CoreEnrolUnenrolUserEnrolmentRequest**](CoreEnrolUnenrolUserEnrolmentRequest.md) |  | [required] |

### Return type

[**models::CoreEnrolUnenrolUserEnrolment200Response**](core_enrol_unenrol_user_enrolment_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_fetch_notifications

> serde_json::Value core_fetch_notifications(core_fetch_notifications_request)
Return a list of notifications for the current session

Return a list of notifications for the current session

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_fetch_notifications_request** | [**CoreFetchNotificationsRequest**](CoreFetchNotificationsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_files_delete_draft_files

> models::CoreFilesDeleteDraftFiles200Response core_files_delete_draft_files(core_files_delete_draft_files_request)
Delete the indicated files (or directories) from a user draft file area.

Delete the indicated files (or directories) from a user draft file area.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_files_delete_draft_files_request** | [**CoreFilesDeleteDraftFilesRequest**](CoreFilesDeleteDraftFilesRequest.md) |  | [required] |

### Return type

[**models::CoreFilesDeleteDraftFiles200Response**](core_files_delete_draft_files_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_files_get_files

> models::CoreFilesGetFiles200Response core_files_get_files(core_files_get_files_request)
browse moodle files

browse moodle files

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_files_get_files_request** | [**CoreFilesGetFilesRequest**](CoreFilesGetFilesRequest.md) |  | [required] |

### Return type

[**models::CoreFilesGetFiles200Response**](core_files_get_files_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_files_get_unused_draft_itemid

> models::CoreFilesGetUnusedDraftItemid200Response core_files_get_unused_draft_itemid()
Generate a new draft itemid for the current user.

Generate a new draft itemid for the current user.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreFilesGetUnusedDraftItemid200Response**](core_files_get_unused_draft_itemid_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_files_upload

> models::CoreFilesUpload200Response core_files_upload(core_files_upload_request)
upload a file to moodle

upload a file to moodle

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_files_upload_request** | [**CoreFilesUploadRequest**](CoreFilesUploadRequest.md) |  | [required] |

### Return type

[**models::CoreFilesUpload200Response**](core_files_upload_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_filters_get_available_in_context

> models::CoreFiltersGetAvailableInContext200Response core_filters_get_available_in_context(core_filters_get_available_in_context_request)
Returns the filters available in the given contexts.

Returns the filters available in the given contexts.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_filters_get_available_in_context_request** | [**CoreFiltersGetAvailableInContextRequest**](CoreFiltersGetAvailableInContextRequest.md) |  | [required] |

### Return type

[**models::CoreFiltersGetAvailableInContext200Response**](core_filters_get_available_in_context_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_form_dynamic_form

> models::CoreFormDynamicForm200Response core_form_dynamic_form(core_form_dynamic_form_request)
Process submission of a dynamic (modal) form

Process submission of a dynamic (modal) form

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_form_dynamic_form_request** | [**CoreFormDynamicFormRequest**](CoreFormDynamicFormRequest.md) |  | [required] |

### Return type

[**models::CoreFormDynamicForm200Response**](core_form_dynamic_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_form_get_filetypes_browser_data

> models::CoreFormGetFiletypesBrowserData200Response core_form_get_filetypes_browser_data(core_form_get_filetypes_browser_data_request)
Provides data for the filetypes element browser.

Provides data for the filetypes element browser.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_form_get_filetypes_browser_data_request** | [**CoreFormGetFiletypesBrowserDataRequest**](CoreFormGetFiletypesBrowserDataRequest.md) |  | [required] |

### Return type

[**models::CoreFormGetFiletypesBrowserData200Response**](core_form_get_filetypes_browser_data_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_get_component_strings

> serde_json::Value core_get_component_strings(core_get_component_strings_request)
Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call

Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_get_component_strings_request** | [**CoreGetComponentStringsRequest**](CoreGetComponentStringsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_get_fragment

> models::CoreGetFragment200Response core_get_fragment(core_get_fragment_request)
Return a fragment for inclusion, such as a JavaScript page.

Return a fragment for inclusion, such as a JavaScript page.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_get_fragment_request** | [**CoreGetFragmentRequest**](CoreGetFragmentRequest.md) |  | [required] |

### Return type

[**models::CoreGetFragment200Response**](core_get_fragment_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_get_string

> serde_json::Value core_get_string(core_get_string_request)
Return a translated string - similar to core get_string(), call

Return a translated string - similar to core get_string(), call

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_get_string_request** | [**CoreGetStringRequest**](CoreGetStringRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_get_strings

> serde_json::Value core_get_strings(core_get_strings_request)
Return some translated strings - like several core get_string(), calls

Return some translated strings - like several core get_string(), calls

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_get_strings_request** | [**CoreGetStringsRequest**](CoreGetStringsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_get_user_dates

> models::CoreGetUserDates200Response core_get_user_dates(core_get_user_dates_request)
Return formatted timestamps

Return formatted timestamps

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_get_user_dates_request** | [**CoreGetUserDatesRequest**](CoreGetUserDatesRequest.md) |  | [required] |

### Return type

[**models::CoreGetUserDates200Response**](core_get_user_dates_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_create_gradecategories

> models::CoreGradesCreateGradecategories200Response core_grades_create_gradecategories(core_grades_create_gradecategories_request)
Create grade categories inside a course gradebook.

Create grade categories inside a course gradebook.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_create_gradecategories_request** | [**CoreGradesCreateGradecategoriesRequest**](CoreGradesCreateGradecategoriesRequest.md) |  | [required] |

### Return type

[**models::CoreGradesCreateGradecategories200Response**](core_grades_create_gradecategories_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_enrolled_users_for_search_widget

> models::CoreGradesGetEnrolledUsersForSearchWidget200Response core_grades_get_enrolled_users_for_search_widget(core_grades_get_enrolled_users_for_search_widget_request)
** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.

** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_enrolled_users_for_search_widget_request** | [**CoreGradesGetEnrolledUsersForSearchWidgetRequest**](CoreGradesGetEnrolledUsersForSearchWidgetRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetEnrolledUsersForSearchWidget200Response**](core_grades_get_enrolled_users_for_search_widget_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_enrolled_users_for_selector

> models::CoreGradesGetEnrolledUsersForSelector200Response core_grades_get_enrolled_users_for_selector(core_grades_get_enrolled_users_for_selector_request)
Returns the enrolled users within and map some fields to the returned array of user objects.

Returns the enrolled users within and map some fields to the returned array of user objects.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_enrolled_users_for_selector_request** | [**CoreGradesGetEnrolledUsersForSelectorRequest**](CoreGradesGetEnrolledUsersForSelectorRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetEnrolledUsersForSelector200Response**](core_grades_get_enrolled_users_for_selector_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_feedback

> models::CoreGradesGetFeedback200Response core_grades_get_feedback(core_grades_get_feedback_request)
Get the feedback data for a grade item

Get the feedback data for a grade item

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_feedback_request** | [**CoreGradesGetFeedbackRequest**](CoreGradesGetFeedbackRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetFeedback200Response**](core_grades_get_feedback_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_gradable_users

> models::CoreGradesGetGradableUsers200Response core_grades_get_gradable_users(core_grades_get_gradable_users_request)
Returns the gradable users in a course

Returns the gradable users in a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_gradable_users_request** | [**CoreGradesGetGradableUsersRequest**](CoreGradesGetGradableUsersRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGradableUsers200Response**](core_grades_get_gradable_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_grade_tree

> serde_json::Value core_grades_get_grade_tree(core_completion_mark_course_self_completed_request)
Get the grade tree structure for a course

Get the grade tree structure for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_mark_course_self_completed_request** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_gradeitems

> models::CoreGradesGetGradeitems200Response core_grades_get_gradeitems(core_completion_mark_course_self_completed_request)
Get the gradeitems for a course

Get the gradeitems for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_completion_mark_course_self_completed_request** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGradeitems200Response**](core_grades_get_gradeitems_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_groups_for_search_widget

> models::CoreGradesGetGroupsForSearchWidget200Response core_grades_get_groups_for_search_widget(core_grades_get_groups_for_search_widget_request)
** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_groups_for_search_widget_request** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGroupsForSearchWidget200Response**](core_grades_get_groups_for_search_widget_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_get_groups_for_selector

> models::CoreGradesGetGroupsForSelector200Response core_grades_get_groups_for_selector(core_grades_get_groups_for_search_widget_request)
** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_groups_for_search_widget_request** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGroupsForSelector200Response**](core_grades_get_groups_for_selector_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_grader_gradingpanel_point_fetch

> models::CoreGradesGraderGradingpanelPointFetch200Response core_grades_grader_gradingpanel_point_fetch(core_grades_grader_gradingpanel_point_fetch_request)
Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required

Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_point_fetch_request** | [**CoreGradesGraderGradingpanelPointFetchRequest**](CoreGradesGraderGradingpanelPointFetchRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGraderGradingpanelPointFetch200Response**](core_grades_grader_gradingpanel_point_fetch_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_grader_gradingpanel_point_store

> models::CoreGradesGraderGradingpanelPointStore200Response core_grades_grader_gradingpanel_point_store(core_grades_grader_gradingpanel_point_store_request)
Store the data required to display the grader grading panel for simple grading

Store the data required to display the grader grading panel for simple grading

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_point_store_request** | [**CoreGradesGraderGradingpanelPointStoreRequest**](CoreGradesGraderGradingpanelPointStoreRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGraderGradingpanelPointStore200Response**](core_grades_grader_gradingpanel_point_store_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_grader_gradingpanel_scale_fetch

> models::CoreGradesGraderGradingpanelScaleFetch200Response core_grades_grader_gradingpanel_scale_fetch(core_grades_grader_gradingpanel_scale_fetch_request)
Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required

Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_scale_fetch_request** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGraderGradingpanelScaleFetch200Response**](core_grades_grader_gradingpanel_scale_fetch_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_grader_gradingpanel_scale_store

> models::CoreGradesGraderGradingpanelScaleStore200Response core_grades_grader_gradingpanel_scale_store(core_grades_grader_gradingpanel_scale_store_request)
Store the data required to display the grader grading panel for scale-based grading

Store the data required to display the grader grading panel for scale-based grading

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_grader_gradingpanel_scale_store_request** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGraderGradingpanelScaleStore200Response**](core_grades_grader_gradingpanel_scale_store_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grades_update_grades

> serde_json::Value core_grades_update_grades(core_grades_update_grades_request)
Update a grade item and associated student grades.

Update a grade item and associated student grades.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_update_grades_request** | [**CoreGradesUpdateGradesRequest**](CoreGradesUpdateGradesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grading_get_definitions

> models::CoreGradingGetDefinitions200Response core_grading_get_definitions(core_grading_get_definitions_request)
Get grading definitions

Get grading definitions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grading_get_definitions_request** | [**CoreGradingGetDefinitionsRequest**](CoreGradingGetDefinitionsRequest.md) |  | [required] |

### Return type

[**models::CoreGradingGetDefinitions200Response**](core_grading_get_definitions_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grading_get_gradingform_instances

> models::CoreGradingGetGradingformInstances200Response core_grading_get_gradingform_instances(core_grading_get_gradingform_instances_request)
Get grading form instances

Get grading form instances

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grading_get_gradingform_instances_request** | [**CoreGradingGetGradingformInstancesRequest**](CoreGradingGetGradingformInstancesRequest.md) |  | [required] |

### Return type

[**models::CoreGradingGetGradingformInstances200Response**](core_grading_get_gradingform_instances_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_grading_save_definitions

> serde_json::Value core_grading_save_definitions(core_grading_save_definitions_request)
Save grading definitions

Save grading definitions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grading_save_definitions_request** | [**CoreGradingSaveDefinitionsRequest**](CoreGradingSaveDefinitionsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_add_group_members

> serde_json::Value core_group_add_group_members(core_group_add_group_members_request)
Adds group members.

Adds group members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_add_group_members_request** | [**CoreGroupAddGroupMembersRequest**](CoreGroupAddGroupMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_assign_grouping

> serde_json::Value core_group_assign_grouping(core_group_assign_grouping_request)
Assing groups from groupings

Assing groups from groupings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_assign_grouping_request** | [**CoreGroupAssignGroupingRequest**](CoreGroupAssignGroupingRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_create_groupings

> serde_json::Value core_group_create_groupings(core_group_create_groupings_request)
Creates new groupings

Creates new groupings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_create_groupings_request** | [**CoreGroupCreateGroupingsRequest**](CoreGroupCreateGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_create_groups

> serde_json::Value core_group_create_groups(core_group_create_groups_request)
Creates new groups.

Creates new groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_create_groups_request** | [**CoreGroupCreateGroupsRequest**](CoreGroupCreateGroupsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_delete_group_members

> serde_json::Value core_group_delete_group_members(core_group_delete_group_members_request)
Deletes group members.

Deletes group members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_delete_group_members_request** | [**CoreGroupDeleteGroupMembersRequest**](CoreGroupDeleteGroupMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_delete_groupings

> serde_json::Value core_group_delete_groupings(core_group_delete_groupings_request)
Deletes all specified groupings.

Deletes all specified groupings.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_delete_groupings_request** | [**CoreGroupDeleteGroupingsRequest**](CoreGroupDeleteGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_delete_groups

> serde_json::Value core_group_delete_groups(core_group_delete_groups_request)
Deletes all specified groups.

Deletes all specified groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_delete_groups_request** | [**CoreGroupDeleteGroupsRequest**](CoreGroupDeleteGroupsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_activity_allowed_groups

> models::CoreGroupGetActivityAllowedGroups200Response core_group_get_activity_allowed_groups(core_group_get_activity_allowed_groups_request)
Gets a list of groups that the user is allowed to access within the specified activity.

Gets a list of groups that the user is allowed to access within the specified activity.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_activity_allowed_groups_request** | [**CoreGroupGetActivityAllowedGroupsRequest**](CoreGroupGetActivityAllowedGroupsRequest.md) |  | [required] |

### Return type

[**models::CoreGroupGetActivityAllowedGroups200Response**](core_group_get_activity_allowed_groups_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_activity_groupmode

> models::CoreGroupGetActivityGroupmode200Response core_group_get_activity_groupmode(core_group_get_activity_groupmode_request)
Returns effective groupmode used in a given activity.

Returns effective groupmode used in a given activity.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_activity_groupmode_request** | [**CoreGroupGetActivityGroupmodeRequest**](CoreGroupGetActivityGroupmodeRequest.md) |  | [required] |

### Return type

[**models::CoreGroupGetActivityGroupmode200Response**](core_group_get_activity_groupmode_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_course_groupings

> serde_json::Value core_group_get_course_groupings(core_group_get_course_groupings_request)
Returns all groupings in specified course.

Returns all groupings in specified course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_course_groupings_request** | [**CoreGroupGetCourseGroupingsRequest**](CoreGroupGetCourseGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_course_groups

> serde_json::Value core_group_get_course_groups(core_group_get_course_groupings_request)
Returns all groups in specified course.

Returns all groups in specified course.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_course_groupings_request** | [**CoreGroupGetCourseGroupingsRequest**](CoreGroupGetCourseGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_course_user_groups

> models::CoreGroupGetCourseUserGroups200Response core_group_get_course_user_groups(core_group_get_course_user_groups_request)
Returns all groups in specified course for the specified user.

Returns all groups in specified course for the specified user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_course_user_groups_request** | [**CoreGroupGetCourseUserGroupsRequest**](CoreGroupGetCourseUserGroupsRequest.md) |  | [required] |

### Return type

[**models::CoreGroupGetCourseUserGroups200Response**](core_group_get_course_user_groups_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_group_members

> serde_json::Value core_group_get_group_members(core_group_get_group_members_request)
Returns group members.

Returns group members.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_group_members_request** | [**CoreGroupGetGroupMembersRequest**](CoreGroupGetGroupMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_groupings

> serde_json::Value core_group_get_groupings(core_group_get_groupings_request)
Returns groupings details.

Returns groupings details.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_groupings_request** | [**CoreGroupGetGroupingsRequest**](CoreGroupGetGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_groups

> serde_json::Value core_group_get_groups(core_group_get_group_members_request)
Returns group details.

Returns group details.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_get_group_members_request** | [**CoreGroupGetGroupMembersRequest**](CoreGroupGetGroupMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_get_groups_for_selector

> models::CoreGradesGetGroupsForSelector200Response core_group_get_groups_for_selector(core_grades_get_groups_for_search_widget_request)
Get the group/(s) for a course

Get the group/(s) for a course

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_grades_get_groups_for_search_widget_request** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | [required] |

### Return type

[**models::CoreGradesGetGroupsForSelector200Response**](core_grades_get_groups_for_selector_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_unassign_grouping

> serde_json::Value core_group_unassign_grouping(core_group_unassign_grouping_request)
Unassing groups from groupings

Unassing groups from groupings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_unassign_grouping_request** | [**CoreGroupUnassignGroupingRequest**](CoreGroupUnassignGroupingRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_update_groupings

> serde_json::Value core_group_update_groupings(core_group_update_groupings_request)
Updates existing groupings

Updates existing groupings

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_update_groupings_request** | [**CoreGroupUpdateGroupingsRequest**](CoreGroupUpdateGroupingsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_group_update_groups

> serde_json::Value core_group_update_groups(core_group_update_groups_request)
Updates existing groups.

Updates existing groups.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_group_update_groups_request** | [**CoreGroupUpdateGroupsRequest**](CoreGroupUpdateGroupsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_h5p_get_trusted_h5p_file

> models::CoreH5pGetTrustedH5pFile200Response core_h5p_get_trusted_h5p_file(core_h5p_get_trusted_h5p_file_request)
Get the H5P file cleaned for Mobile App.

Get the H5P file cleaned for Mobile App.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_h5p_get_trusted_h5p_file_request** | [**CoreH5pGetTrustedH5pFileRequest**](CoreH5pGetTrustedH5pFileRequest.md) |  | [required] |

### Return type

[**models::CoreH5pGetTrustedH5pFile200Response**](core_h5p_get_trusted_h5p_file_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_block_user

> serde_json::Value core_message_block_user(core_message_block_user_request)
Blocks a user

Blocks a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_block_user_request** | [**CoreMessageBlockUserRequest**](CoreMessageBlockUserRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_confirm_contact_request

> serde_json::Value core_message_confirm_contact_request(core_message_confirm_contact_request_request)
Confirms a contact request

Confirms a contact request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_confirm_contact_request_request** | [**CoreMessageConfirmContactRequestRequest**](CoreMessageConfirmContactRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_create_contact_request

> models::CoreMessageCreateContactRequest200Response core_message_create_contact_request(core_message_create_contact_request_request)
Creates a contact request

Creates a contact request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_create_contact_request_request** | [**CoreMessageCreateContactRequestRequest**](CoreMessageCreateContactRequestRequest.md) |  | [required] |

### Return type

[**models::CoreMessageCreateContactRequest200Response**](core_message_create_contact_request_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_data_for_messagearea_search_messages

> models::CoreMessageDataForMessageareaSearchMessages200Response core_message_data_for_messagearea_search_messages(core_message_data_for_messagearea_search_messages_request)
Retrieve the template data for searching for messages

Retrieve the template data for searching for messages

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_data_for_messagearea_search_messages_request** | [**CoreMessageDataForMessageareaSearchMessagesRequest**](CoreMessageDataForMessageareaSearchMessagesRequest.md) |  | [required] |

### Return type

[**models::CoreMessageDataForMessageareaSearchMessages200Response**](core_message_data_for_messagearea_search_messages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_decline_contact_request

> serde_json::Value core_message_decline_contact_request(core_message_create_contact_request_request)
Declines a contact request

Declines a contact request

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_create_contact_request_request** | [**CoreMessageCreateContactRequestRequest**](CoreMessageCreateContactRequestRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_delete_contacts

> serde_json::Value core_message_delete_contacts(core_message_delete_contacts_request)
Remove contacts from the contact list

Remove contacts from the contact list

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_delete_contacts_request** | [**CoreMessageDeleteContactsRequest**](CoreMessageDeleteContactsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_delete_conversations_by_id

> serde_json::Value core_message_delete_conversations_by_id(core_message_delete_conversations_by_id_request)
Deletes a list of conversations.

Deletes a list of conversations.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_delete_conversations_by_id_request** | [**CoreMessageDeleteConversationsByIdRequest**](CoreMessageDeleteConversationsByIdRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_delete_message

> models::CoreMessageDeleteMessage200Response core_message_delete_message(core_message_delete_message_request)
Deletes a message.

Deletes a message.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_delete_message_request** | [**CoreMessageDeleteMessageRequest**](CoreMessageDeleteMessageRequest.md) |  | [required] |

### Return type

[**models::CoreMessageDeleteMessage200Response**](core_message_delete_message_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_delete_message_for_all_users

> serde_json::Value core_message_delete_message_for_all_users(core_message_delete_message_for_all_users_request)
Deletes a message for all users.

Deletes a message for all users.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_delete_message_for_all_users_request** | [**CoreMessageDeleteMessageForAllUsersRequest**](CoreMessageDeleteMessageForAllUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_blocked_users

> models::CoreMessageGetBlockedUsers200Response core_message_get_blocked_users(core_message_get_blocked_users_request)
Retrieve a list of users blocked

Retrieve a list of users blocked

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_blocked_users_request** | [**CoreMessageGetBlockedUsersRequest**](CoreMessageGetBlockedUsersRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetBlockedUsers200Response**](core_message_get_blocked_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_contact_requests

> serde_json::Value core_message_get_contact_requests(core_message_get_contact_requests_request)
Returns contact requests for a user

Returns contact requests for a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_contact_requests_request** | [**CoreMessageGetContactRequestsRequest**](CoreMessageGetContactRequestsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversation

> models::CoreMessageGetConversation200Response core_message_get_conversation(core_message_get_conversation_request)
Retrieve a conversation for a user

Retrieve a conversation for a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_request** | [**CoreMessageGetConversationRequest**](CoreMessageGetConversationRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversation200Response**](core_message_get_conversation_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversation_between_users

> models::CoreMessageGetConversationBetweenUsers200Response core_message_get_conversation_between_users(core_message_get_conversation_between_users_request)
Retrieve a conversation for a user between another user

Retrieve a conversation for a user between another user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_between_users_request** | [**CoreMessageGetConversationBetweenUsersRequest**](CoreMessageGetConversationBetweenUsersRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversationBetweenUsers200Response**](core_message_get_conversation_between_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversation_counts

> models::CoreMessageGetConversationCounts200Response core_message_get_conversation_counts(core_message_get_conversation_counts_request)
Retrieve a list of conversation counts, indexed by type.

Retrieve a list of conversation counts, indexed by type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_counts_request** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversationCounts200Response**](core_message_get_conversation_counts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversation_members

> serde_json::Value core_message_get_conversation_members(core_message_get_conversation_members_request)
Retrieve a list of members in a conversation

Retrieve a list of members in a conversation

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_members_request** | [**CoreMessageGetConversationMembersRequest**](CoreMessageGetConversationMembersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversation_messages

> models::CoreMessageGetConversationMessages200Response core_message_get_conversation_messages(core_message_get_conversation_messages_request)
Retrieve the conversation messages and relevant member information

Retrieve the conversation messages and relevant member information

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_messages_request** | [**CoreMessageGetConversationMessagesRequest**](CoreMessageGetConversationMessagesRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversationMessages200Response**](core_message_get_conversation_messages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_conversations

> models::CoreMessageGetConversations200Response core_message_get_conversations(core_message_get_conversations_request)
Retrieve a list of conversations for a user

Retrieve a list of conversations for a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversations_request** | [**CoreMessageGetConversationsRequest**](CoreMessageGetConversationsRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversations200Response**](core_message_get_conversations_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_member_info

> serde_json::Value core_message_get_member_info(core_message_get_member_info_request)
Retrieve a user message profiles

Retrieve a user message profiles

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_member_info_request** | [**CoreMessageGetMemberInfoRequest**](CoreMessageGetMemberInfoRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_message_processor

> models::CoreMessageGetMessageProcessor200Response core_message_get_message_processor(core_message_get_message_processor_request)
Get a message processor

Get a message processor

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_message_processor_request** | [**CoreMessageGetMessageProcessorRequest**](CoreMessageGetMessageProcessorRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetMessageProcessor200Response**](core_message_get_message_processor_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_messages

> models::CoreMessageGetMessages200Response core_message_get_messages(core_message_get_messages_request)
Retrieve a list of messages sent and received by a user (conversations, notifications or both)

Retrieve a list of messages sent and received by a user (conversations, notifications or both)

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_messages_request** | [**CoreMessageGetMessagesRequest**](CoreMessageGetMessagesRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetMessages200Response**](core_message_get_messages_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_received_contact_requests_count

> serde_json::Value core_message_get_received_contact_requests_count(core_message_get_received_contact_requests_count_request)
Gets the number of received contact requests

Gets the number of received contact requests

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_received_contact_requests_count_request** | [**CoreMessageGetReceivedContactRequestsCountRequest**](CoreMessageGetReceivedContactRequestsCountRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_self_conversation

> models::CoreMessageGetConversationBetweenUsers200Response core_message_get_self_conversation(core_message_get_self_conversation_request)
Retrieve a self-conversation for a user

Retrieve a self-conversation for a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_self_conversation_request** | [**CoreMessageGetSelfConversationRequest**](CoreMessageGetSelfConversationRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetConversationBetweenUsers200Response**](core_message_get_conversation_between_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_unread_conversation_counts

> models::CoreMessageGetUnreadConversationCounts200Response core_message_get_unread_conversation_counts(core_message_get_conversation_counts_request)
Retrieve a list of unread conversation counts, indexed by type.

Retrieve a list of unread conversation counts, indexed by type.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_counts_request** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetUnreadConversationCounts200Response**](core_message_get_unread_conversation_counts_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_unread_conversations_count

> serde_json::Value core_message_get_unread_conversations_count(core_message_get_unread_conversations_count_request)
Retrieve the count of unread conversations for a given user

Retrieve the count of unread conversations for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_unread_conversations_count_request** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_unread_notification_count

> serde_json::Value core_message_get_unread_notification_count(core_message_get_unread_notification_count_request)
Get number of unread notifications.

Get number of unread notifications.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_unread_notification_count_request** | [**CoreMessageGetUnreadNotificationCountRequest**](CoreMessageGetUnreadNotificationCountRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_user_contacts

> serde_json::Value core_message_get_user_contacts(core_message_get_user_contacts_request)
Retrieve the contact list

Retrieve the contact list

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_user_contacts_request** | [**CoreMessageGetUserContactsRequest**](CoreMessageGetUserContactsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_user_message_preferences

> models::CoreMessageGetUserMessagePreferences200Response core_message_get_user_message_preferences(core_message_get_conversation_counts_request)
Get the message preferences for a given user.

Get the message preferences for a given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_counts_request** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetUserMessagePreferences200Response**](core_message_get_user_message_preferences_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_get_user_notification_preferences

> models::CoreMessageGetUserNotificationPreferences200Response core_message_get_user_notification_preferences(core_message_get_conversation_counts_request)
Get the notification preferences for a given user.

Get the notification preferences for a given user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_get_conversation_counts_request** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | [required] |

### Return type

[**models::CoreMessageGetUserNotificationPreferences200Response**](core_message_get_user_notification_preferences_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_mark_all_conversation_messages_as_read

> serde_json::Value core_message_mark_all_conversation_messages_as_read(core_message_mark_all_conversation_messages_as_read_request)
Mark all conversation messages as read for a given user

Mark all conversation messages as read for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_mark_all_conversation_messages_as_read_request** | [**CoreMessageMarkAllConversationMessagesAsReadRequest**](CoreMessageMarkAllConversationMessagesAsReadRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_mark_all_notifications_as_read

> serde_json::Value core_message_mark_all_notifications_as_read(core_message_mark_all_notifications_as_read_request)
Mark all notifications as read for a given user

Mark all notifications as read for a given user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_mark_all_notifications_as_read_request** | [**CoreMessageMarkAllNotificationsAsReadRequest**](CoreMessageMarkAllNotificationsAsReadRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_mark_message_read

> models::CoreMessageMarkMessageRead200Response core_message_mark_message_read(core_message_mark_message_read_request)
Mark a single message as read, trigger message_viewed event.

Mark a single message as read, trigger message_viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_mark_message_read_request** | [**CoreMessageMarkMessageReadRequest**](CoreMessageMarkMessageReadRequest.md) |  | [required] |

### Return type

[**models::CoreMessageMarkMessageRead200Response**](core_message_mark_message_read_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_mark_notification_read

> models::CoreMessageMarkNotificationRead200Response core_message_mark_notification_read(core_message_mark_notification_read_request)
Mark a single notification as read, trigger notification_viewed event.

Mark a single notification as read, trigger notification_viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_mark_notification_read_request** | [**CoreMessageMarkNotificationReadRequest**](CoreMessageMarkNotificationReadRequest.md) |  | [required] |

### Return type

[**models::CoreMessageMarkNotificationRead200Response**](core_message_mark_notification_read_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_message_processor_config_form

> serde_json::Value core_message_message_processor_config_form(core_message_message_processor_config_form_request)
Process the message processor config form

Process the message processor config form

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_message_processor_config_form_request** | [**CoreMessageMessageProcessorConfigFormRequest**](CoreMessageMessageProcessorConfigFormRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_message_search_users

> models::CoreMessageMessageSearchUsers200Response core_message_message_search_users(core_message_message_search_users_request)
Retrieve the data for searching for people

Retrieve the data for searching for people

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_message_search_users_request** | [**CoreMessageMessageSearchUsersRequest**](CoreMessageMessageSearchUsersRequest.md) |  | [required] |

### Return type

[**models::CoreMessageMessageSearchUsers200Response**](core_message_message_search_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_mute_conversations

> serde_json::Value core_message_mute_conversations(core_message_mute_conversations_request)
Mutes a list of conversations

Mutes a list of conversations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_mute_conversations_request** | [**CoreMessageMuteConversationsRequest**](CoreMessageMuteConversationsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_search_contacts

> serde_json::Value core_message_search_contacts(core_message_search_contacts_request)
Search for contacts

Search for contacts

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_search_contacts_request** | [**CoreMessageSearchContactsRequest**](CoreMessageSearchContactsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_send_instant_messages

> serde_json::Value core_message_send_instant_messages(core_message_send_instant_messages_request)
Send instant messages

Send instant messages

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_send_instant_messages_request** | [**CoreMessageSendInstantMessagesRequest**](CoreMessageSendInstantMessagesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_send_messages_to_conversation

> serde_json::Value core_message_send_messages_to_conversation(core_message_send_messages_to_conversation_request)
Send messages to an existing conversation between users

Send messages to an existing conversation between users

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_send_messages_to_conversation_request** | [**CoreMessageSendMessagesToConversationRequest**](CoreMessageSendMessagesToConversationRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_set_favourite_conversations

> serde_json::Value core_message_set_favourite_conversations(core_message_set_favourite_conversations_request)
Mark a conversation or group of conversations as favourites/starred conversations.

Mark a conversation or group of conversations as favourites/starred conversations.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_set_favourite_conversations_request** | [**CoreMessageSetFavouriteConversationsRequest**](CoreMessageSetFavouriteConversationsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_unblock_user

> serde_json::Value core_message_unblock_user(core_message_unblock_user_request)
Unblocks a user

Unblocks a user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_unblock_user_request** | [**CoreMessageUnblockUserRequest**](CoreMessageUnblockUserRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_unmute_conversations

> serde_json::Value core_message_unmute_conversations(core_message_unmute_conversations_request)
Unmutes a list of conversations

Unmutes a list of conversations

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_unmute_conversations_request** | [**CoreMessageUnmuteConversationsRequest**](CoreMessageUnmuteConversationsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_message_unset_favourite_conversations

> serde_json::Value core_message_unset_favourite_conversations(core_message_set_favourite_conversations_request)
Unset a conversation or group of conversations as favourites/starred conversations.

Unset a conversation or group of conversations as favourites/starred conversations.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_message_set_favourite_conversations_request** | [**CoreMessageSetFavouriteConversationsRequest**](CoreMessageSetFavouriteConversationsRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_moodlenet_auth_check

> models::CoreMoodlenetAuthCheck200Response core_moodlenet_auth_check(core_moodlenet_auth_check_request)
Check a user has authorized for a given MoodleNet site

Check a user has authorized for a given MoodleNet site

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_moodlenet_auth_check_request** | [**CoreMoodlenetAuthCheckRequest**](CoreMoodlenetAuthCheckRequest.md) |  | [required] |

### Return type

[**models::CoreMoodlenetAuthCheck200Response**](core_moodlenet_auth_check_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_moodlenet_get_share_info_activity

> models::CoreMoodlenetGetShareInfoActivity200Response core_moodlenet_get_share_info_activity(core_moodlenet_get_share_info_activity_request)
Get information about an activity being shared

Get information about an activity being shared

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_moodlenet_get_share_info_activity_request** | [**CoreMoodlenetGetShareInfoActivityRequest**](CoreMoodlenetGetShareInfoActivityRequest.md) |  | [required] |

### Return type

[**models::CoreMoodlenetGetShareInfoActivity200Response**](core_moodlenet_get_share_info_activity_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_moodlenet_get_shared_course_info

> models::CoreMoodlenetGetSharedCourseInfo200Response core_moodlenet_get_shared_course_info(core_moodlenet_get_shared_course_info_request)
Get information about an course being shared

Get information about an course being shared

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_moodlenet_get_shared_course_info_request** | [**CoreMoodlenetGetSharedCourseInfoRequest**](CoreMoodlenetGetSharedCourseInfoRequest.md) |  | [required] |

### Return type

[**models::CoreMoodlenetGetSharedCourseInfo200Response**](core_moodlenet_get_shared_course_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_moodlenet_send_activity

> models::CoreMoodlenetSendActivity200Response core_moodlenet_send_activity(core_moodlenet_send_activity_request)
Send activity to MoodleNet

Send activity to MoodleNet

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_moodlenet_send_activity_request** | [**CoreMoodlenetSendActivityRequest**](CoreMoodlenetSendActivityRequest.md) |  | [required] |

### Return type

[**models::CoreMoodlenetSendActivity200Response**](core_moodlenet_send_activity_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_moodlenet_send_course

> models::CoreMoodlenetSendCourse200Response core_moodlenet_send_course(core_moodlenet_send_course_request)
Send course to MoodleNet

Send course to MoodleNet

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_moodlenet_send_course_request** | [**CoreMoodlenetSendCourseRequest**](CoreMoodlenetSendCourseRequest.md) |  | [required] |

### Return type

[**models::CoreMoodlenetSendCourse200Response**](core_moodlenet_send_course_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_my_view_page

> models::CoreCalendarDeleteSubscription200Response core_my_view_page(core_my_view_page_request)
Trigger the My or Dashboard viewed event.

Trigger the My or Dashboard viewed event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_my_view_page_request** | [**CoreMyViewPageRequest**](CoreMyViewPageRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_create_notes

> serde_json::Value core_notes_create_notes(core_notes_create_notes_request)
Create notes

Create notes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_create_notes_request** | [**CoreNotesCreateNotesRequest**](CoreNotesCreateNotesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_delete_notes

> serde_json::Value core_notes_delete_notes(core_notes_delete_notes_request)
Delete notes

Delete notes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_delete_notes_request** | [**CoreNotesDeleteNotesRequest**](CoreNotesDeleteNotesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_get_course_notes

> models::CoreNotesGetCourseNotes200Response core_notes_get_course_notes(core_notes_get_course_notes_request)
Returns all notes in specified course (or site), for the specified user.

Returns all notes in specified course (or site), for the specified user.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_get_course_notes_request** | [**CoreNotesGetCourseNotesRequest**](CoreNotesGetCourseNotesRequest.md) |  | [required] |

### Return type

[**models::CoreNotesGetCourseNotes200Response**](core_notes_get_course_notes_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_get_notes

> models::CoreNotesGetNotes200Response core_notes_get_notes(core_notes_get_notes_request)
Get notes

Get notes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_get_notes_request** | [**CoreNotesGetNotesRequest**](CoreNotesGetNotesRequest.md) |  | [required] |

### Return type

[**models::CoreNotesGetNotes200Response**](core_notes_get_notes_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_update_notes

> serde_json::Value core_notes_update_notes(core_notes_update_notes_request)
Update notes

Update notes

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_update_notes_request** | [**CoreNotesUpdateNotesRequest**](CoreNotesUpdateNotesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_notes_view_notes

> models::CoreCalendarDeleteSubscription200Response core_notes_view_notes(core_notes_view_notes_request)
Simulates the web interface view of notes/index.php: trigger events.

Simulates the web interface view of notes/index.php: trigger events.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_notes_view_notes_request** | [**CoreNotesViewNotesRequest**](CoreNotesViewNotesRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_output_load_fontawesome_icon_map

> serde_json::Value core_output_load_fontawesome_icon_map()
Load the mapping of names to icons

Load the mapping of names to icons

### Parameters

This endpoint does not need any parameter.

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_output_load_fontawesome_icon_system_map

> serde_json::Value core_output_load_fontawesome_icon_system_map(core_output_load_fontawesome_icon_system_map_request)
Load the mapping of moodle pix names to fontawesome icon names

Load the mapping of moodle pix names to fontawesome icon names

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_output_load_fontawesome_icon_system_map_request** | [**CoreOutputLoadFontawesomeIconSystemMapRequest**](CoreOutputLoadFontawesomeIconSystemMapRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_output_load_template

> serde_json::Value core_output_load_template(core_output_load_template_request)
Load a template for a renderable

Load a template for a renderable

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_output_load_template_request** | [**CoreOutputLoadTemplateRequest**](CoreOutputLoadTemplateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_output_load_template_with_dependencies

> models::CoreOutputLoadTemplateWithDependencies200Response core_output_load_template_with_dependencies(core_output_load_template_with_dependencies_request)
Load a template and its dependencies for a renderable

Load a template and its dependencies for a renderable

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_output_load_template_with_dependencies_request** | [**CoreOutputLoadTemplateWithDependenciesRequest**](CoreOutputLoadTemplateWithDependenciesRequest.md) |  | [required] |

### Return type

[**models::CoreOutputLoadTemplateWithDependencies200Response**](core_output_load_template_with_dependencies_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_payment_get_available_gateways

> serde_json::Value core_payment_get_available_gateways(core_payment_get_available_gateways_request)
Get the list of payment gateways that support the given component/area

Get the list of payment gateways that support the given component/area

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_payment_get_available_gateways_request** | [**CorePaymentGetAvailableGatewaysRequest**](CorePaymentGetAvailableGatewaysRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_question_get_random_question_summaries

> models::CoreQuestionGetRandomQuestionSummaries200Response core_question_get_random_question_summaries(core_question_get_random_question_summaries_request)
Get the random question set for a criteria

Get the random question set for a criteria

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_question_get_random_question_summaries_request** | [**CoreQuestionGetRandomQuestionSummariesRequest**](CoreQuestionGetRandomQuestionSummariesRequest.md) |  | [required] |

### Return type

[**models::CoreQuestionGetRandomQuestionSummaries200Response**](core_question_get_random_question_summaries_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_question_submit_tags_form

> models::CoreQuestionSubmitTagsForm200Response core_question_submit_tags_form(core_question_submit_tags_form_request)
Update the question tags.

Update the question tags.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_question_submit_tags_form_request** | [**CoreQuestionSubmitTagsFormRequest**](CoreQuestionSubmitTagsFormRequest.md) |  | [required] |

### Return type

[**models::CoreQuestionSubmitTagsForm200Response**](core_question_submit_tags_form_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_question_update_flag

> models::CoreCalendarDeleteSubscription200Response core_question_update_flag(core_question_update_flag_request)
Update the flag state of a question attempt.

Update the flag state of a question attempt.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_question_update_flag_request** | [**CoreQuestionUpdateFlagRequest**](CoreQuestionUpdateFlagRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_rating_add_rating

> models::CoreRatingAddRating200Response core_rating_add_rating(core_rating_add_rating_request)
Rates an item.

Rates an item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_rating_add_rating_request** | [**CoreRatingAddRatingRequest**](CoreRatingAddRatingRequest.md) |  | [required] |

### Return type

[**models::CoreRatingAddRating200Response**](core_rating_add_rating_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_rating_get_item_ratings

> models::CoreRatingGetItemRatings200Response core_rating_get_item_ratings(core_rating_get_item_ratings_request)
Retrieve all the ratings for an item.

Retrieve all the ratings for an item.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_rating_get_item_ratings_request** | [**CoreRatingGetItemRatingsRequest**](CoreRatingGetItemRatingsRequest.md) |  | [required] |

### Return type

[**models::CoreRatingGetItemRatings200Response**](core_rating_get_item_ratings_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_audiences_delete

> serde_json::Value core_reportbuilder_audiences_delete(core_reportbuilder_audiences_delete_request)
Delete audience from report

Delete audience from report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_audiences_delete_request** | [**CoreReportbuilderAudiencesDeleteRequest**](CoreReportbuilderAudiencesDeleteRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_can_view_system_report

> serde_json::Value core_reportbuilder_can_view_system_report(core_reportbuilder_can_view_system_report_request)
Determine access to a system report

Determine access to a system report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_can_view_system_report_request** | [**CoreReportbuilderCanViewSystemReportRequest**](CoreReportbuilderCanViewSystemReportRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_add

> models::CoreReportbuilderColumnsAdd200Response core_reportbuilder_columns_add(core_reportbuilder_columns_add_request)
Add column to report

Add column to report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_add_request** | [**CoreReportbuilderColumnsAddRequest**](CoreReportbuilderColumnsAddRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderColumnsAdd200Response**](core_reportbuilder_columns_add_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_delete

> models::CoreReportbuilderColumnsDelete200Response core_reportbuilder_columns_delete(core_reportbuilder_columns_delete_request)
Delete column from report

Delete column from report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_delete_request** | [**CoreReportbuilderColumnsDeleteRequest**](CoreReportbuilderColumnsDeleteRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderColumnsDelete200Response**](core_reportbuilder_columns_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_reorder

> serde_json::Value core_reportbuilder_columns_reorder(core_reportbuilder_columns_reorder_request)
Re-order column within report

Re-order column within report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_reorder_request** | [**CoreReportbuilderColumnsReorderRequest**](CoreReportbuilderColumnsReorderRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_sort_get

> models::CoreReportbuilderColumnsDelete200Response core_reportbuilder_columns_sort_get(core_reportbuilder_columns_sort_get_request)
Retrieve column sorting for report

Retrieve column sorting for report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_get_request** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderColumnsDelete200Response**](core_reportbuilder_columns_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_sort_reorder

> models::CoreReportbuilderColumnsDelete200Response core_reportbuilder_columns_sort_reorder(core_reportbuilder_columns_sort_reorder_request)
Re-order column sorting within report

Re-order column sorting within report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_reorder_request** | [**CoreReportbuilderColumnsSortReorderRequest**](CoreReportbuilderColumnsSortReorderRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderColumnsDelete200Response**](core_reportbuilder_columns_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_columns_sort_toggle

> models::CoreReportbuilderColumnsDelete200Response core_reportbuilder_columns_sort_toggle(core_reportbuilder_columns_sort_toggle_request)
Toggle sorting of column within report

Toggle sorting of column within report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_toggle_request** | [**CoreReportbuilderColumnsSortToggleRequest**](CoreReportbuilderColumnsSortToggleRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderColumnsDelete200Response**](core_reportbuilder_columns_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_conditions_add

> models::CoreReportbuilderConditionsAdd200Response core_reportbuilder_conditions_add(core_reportbuilder_conditions_add_request)
Add condition to report

Add condition to report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_conditions_add_request** | [**CoreReportbuilderConditionsAddRequest**](CoreReportbuilderConditionsAddRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderConditionsAdd200Response**](core_reportbuilder_conditions_add_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_conditions_delete

> models::CoreReportbuilderConditionsDelete200Response core_reportbuilder_conditions_delete(core_reportbuilder_conditions_delete_request)
Delete condition from report

Delete condition from report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_conditions_delete_request** | [**CoreReportbuilderConditionsDeleteRequest**](CoreReportbuilderConditionsDeleteRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderConditionsDelete200Response**](core_reportbuilder_conditions_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_conditions_reorder

> models::CoreReportbuilderConditionsDelete200Response core_reportbuilder_conditions_reorder(core_reportbuilder_conditions_reorder_request)
Re-order condition within report

Re-order condition within report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_conditions_reorder_request** | [**CoreReportbuilderConditionsReorderRequest**](CoreReportbuilderConditionsReorderRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderConditionsDelete200Response**](core_reportbuilder_conditions_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_conditions_reset

> models::CoreReportbuilderConditionsDelete200Response core_reportbuilder_conditions_reset(core_reportbuilder_columns_sort_get_request)
Reset conditions for given report

Reset conditions for given report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_get_request** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderConditionsDelete200Response**](core_reportbuilder_conditions_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_filters_add

> models::CoreReportbuilderFiltersAdd200Response core_reportbuilder_filters_add(core_reportbuilder_filters_add_request)
Add filter to report

Add filter to report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_filters_add_request** | [**CoreReportbuilderFiltersAddRequest**](CoreReportbuilderFiltersAddRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderFiltersAdd200Response**](core_reportbuilder_filters_add_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_filters_delete

> models::CoreReportbuilderFiltersDelete200Response core_reportbuilder_filters_delete(core_reportbuilder_filters_delete_request)
Delete filter from report

Delete filter from report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_filters_delete_request** | [**CoreReportbuilderFiltersDeleteRequest**](CoreReportbuilderFiltersDeleteRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderFiltersDelete200Response**](core_reportbuilder_filters_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_filters_reorder

> models::CoreReportbuilderFiltersDelete200Response core_reportbuilder_filters_reorder(core_reportbuilder_filters_reorder_request)
Re-order filter within report

Re-order filter within report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_filters_reorder_request** | [**CoreReportbuilderFiltersReorderRequest**](CoreReportbuilderFiltersReorderRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderFiltersDelete200Response**](core_reportbuilder_filters_delete_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_filters_reset

> serde_json::Value core_reportbuilder_filters_reset(core_reportbuilder_filters_reset_request)
Reset filters for given report

Reset filters for given report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_filters_reset_request** | [**CoreReportbuilderFiltersResetRequest**](CoreReportbuilderFiltersResetRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_list_reports

> models::CoreReportbuilderListReports200Response core_reportbuilder_list_reports(core_reportbuilder_list_reports_request)
List custom reports for current user

List custom reports for current user

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_list_reports_request** | [**CoreReportbuilderListReportsRequest**](CoreReportbuilderListReportsRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderListReports200Response**](core_reportbuilder_list_reports_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_reports_delete

> serde_json::Value core_reportbuilder_reports_delete(core_reportbuilder_columns_sort_get_request)
Delete report

Delete report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_get_request** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_reports_get

> models::CoreReportbuilderReportsGet200Response core_reportbuilder_reports_get(core_reportbuilder_reports_get_request)
Get custom report

Get custom report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_reports_get_request** | [**CoreReportbuilderReportsGetRequest**](CoreReportbuilderReportsGetRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderReportsGet200Response**](core_reportbuilder_reports_get_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_retrieve_report

> models::CoreReportbuilderRetrieveReport200Response core_reportbuilder_retrieve_report(core_reportbuilder_retrieve_report_request)
Retrieve custom report content

Retrieve custom report content

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_retrieve_report_request** | [**CoreReportbuilderRetrieveReportRequest**](CoreReportbuilderRetrieveReportRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderRetrieveReport200Response**](core_reportbuilder_retrieve_report_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_retrieve_system_report

> models::CoreReportbuilderRetrieveSystemReport200Response core_reportbuilder_retrieve_system_report(core_reportbuilder_retrieve_system_report_request)
Retrieve system report content

Retrieve system report content

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_retrieve_system_report_request** | [**CoreReportbuilderRetrieveSystemReportRequest**](CoreReportbuilderRetrieveSystemReportRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderRetrieveSystemReport200Response**](core_reportbuilder_retrieve_system_report_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_schedules_delete

> serde_json::Value core_reportbuilder_schedules_delete(core_reportbuilder_schedules_delete_request)
Delete schedule from report

Delete schedule from report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_schedules_delete_request** | [**CoreReportbuilderSchedulesDeleteRequest**](CoreReportbuilderSchedulesDeleteRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_schedules_send

> serde_json::Value core_reportbuilder_schedules_send(core_reportbuilder_schedules_send_request)
Send report schedule

Send report schedule

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_schedules_send_request** | [**CoreReportbuilderSchedulesSendRequest**](CoreReportbuilderSchedulesSendRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_schedules_toggle

> serde_json::Value core_reportbuilder_schedules_toggle(core_reportbuilder_schedules_toggle_request)
Toggle state of report schedule

Toggle state of report schedule

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_schedules_toggle_request** | [**CoreReportbuilderSchedulesToggleRequest**](CoreReportbuilderSchedulesToggleRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_set_filters

> serde_json::Value core_reportbuilder_set_filters(core_reportbuilder_set_filters_request)
Set filter values for given report

Set filter values for given report

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_set_filters_request** | [**CoreReportbuilderSetFiltersRequest**](CoreReportbuilderSetFiltersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_reportbuilder_view_report

> models::CoreReportbuilderViewReport200Response core_reportbuilder_view_report(core_reportbuilder_columns_sort_get_request)
Trigger custom report viewed

Trigger custom report viewed

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_reportbuilder_columns_sort_get_request** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | [required] |

### Return type

[**models::CoreReportbuilderViewReport200Response**](core_reportbuilder_view_report_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_role_assign_roles

> serde_json::Value core_role_assign_roles(core_role_assign_roles_request)
Manual role assignments.

Manual role assignments.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_role_assign_roles_request** | [**CoreRoleAssignRolesRequest**](CoreRoleAssignRolesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_role_unassign_roles

> serde_json::Value core_role_unassign_roles(core_role_unassign_roles_request)
Manual role unassignments.

Manual role unassignments.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_role_unassign_roles_request** | [**CoreRoleUnassignRolesRequest**](CoreRoleUnassignRolesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_search_get_relevant_users

> serde_json::Value core_search_get_relevant_users(core_search_get_relevant_users_request)
Gets relevant users for a search request.

Gets relevant users for a search request.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_search_get_relevant_users_request** | [**CoreSearchGetRelevantUsersRequest**](CoreSearchGetRelevantUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_search_get_results

> models::CoreSearchGetResults200Response core_search_get_results(core_search_get_results_request)
Get search results.

Get search results.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_search_get_results_request** | [**CoreSearchGetResultsRequest**](CoreSearchGetResultsRequest.md) |  | [required] |

### Return type

[**models::CoreSearchGetResults200Response**](core_search_get_results_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_search_get_search_areas_list

> models::CoreSearchGetSearchAreasList200Response core_search_get_search_areas_list(core_search_get_search_areas_list_request)
Get search areas.

Get search areas.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_search_get_search_areas_list_request** | [**CoreSearchGetSearchAreasListRequest**](CoreSearchGetSearchAreasListRequest.md) |  | [required] |

### Return type

[**models::CoreSearchGetSearchAreasList200Response**](core_search_get_search_areas_list_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_search_get_top_results

> models::CoreSearchGetTopResults200Response core_search_get_top_results(core_search_get_top_results_request)
Get top search results.

Get top search results.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_search_get_top_results_request** | [**CoreSearchGetTopResultsRequest**](CoreSearchGetTopResultsRequest.md) |  | [required] |

### Return type

[**models::CoreSearchGetTopResults200Response**](core_search_get_top_results_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_search_view_results

> models::CoreCalendarDeleteSubscription200Response core_search_view_results(core_search_view_results_request)
Trigger view search results event.

Trigger view search results event.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_search_view_results_request** | [**CoreSearchViewResultsRequest**](CoreSearchViewResultsRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_session_time_remaining

> models::CoreSessionTimeRemaining200Response core_session_time_remaining()
Count the seconds remaining in this session

Count the seconds remaining in this session

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreSessionTimeRemaining200Response**](core_session_time_remaining_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_session_touch

> serde_json::Value core_session_touch()
Keep the users session alive

Keep the users session alive

### Parameters

This endpoint does not need any parameter.

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_table_get_dynamic_table_content

> models::CoreTableGetDynamicTableContent200Response core_table_get_dynamic_table_content(core_table_get_dynamic_table_content_request)
Get the dynamic table content raw html

Get the dynamic table content raw html

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_table_get_dynamic_table_content_request** | [**CoreTableGetDynamicTableContentRequest**](CoreTableGetDynamicTableContentRequest.md) |  | [required] |

### Return type

[**models::CoreTableGetDynamicTableContent200Response**](core_table_get_dynamic_table_content_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tag_areas

> models::CoreTagGetTagAreas200Response core_tag_get_tag_areas()
Retrieves existing tag areas.

Retrieves existing tag areas.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreTagGetTagAreas200Response**](core_tag_get_tag_areas_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tag_cloud

> models::CoreTagGetTagCloud200Response core_tag_get_tag_cloud(core_tag_get_tag_cloud_request)
Retrieves a tag cloud for the given collection and/or query search.

Retrieves a tag cloud for the given collection and/or query search.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_tag_get_tag_cloud_request** | [**CoreTagGetTagCloudRequest**](CoreTagGetTagCloudRequest.md) |  | [required] |

### Return type

[**models::CoreTagGetTagCloud200Response**](core_tag_get_tag_cloud_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tag_collections

> models::CoreTagGetTagCollections200Response core_tag_get_tag_collections()
Retrieves existing tag collections.

Retrieves existing tag collections.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreTagGetTagCollections200Response**](core_tag_get_tag_collections_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tagindex

> models::CoreTagGetTagindex200Response core_tag_get_tagindex(core_tag_get_tagindex_request)
Gets tag index page for one tag and one tag area

Gets tag index page for one tag and one tag area

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_tag_get_tagindex_request** | [**CoreTagGetTagindexRequest**](CoreTagGetTagindexRequest.md) |  | [required] |

### Return type

[**models::CoreTagGetTagindex200Response**](core_tag_get_tagindex_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tagindex_per_area

> serde_json::Value core_tag_get_tagindex_per_area(core_tag_get_tagindex_per_area_request)
Gets tag index page per different areas.

Gets tag index page per different areas.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_tag_get_tagindex_per_area_request** | [**CoreTagGetTagindexPerAreaRequest**](CoreTagGetTagindexPerAreaRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_get_tags

> models::CoreTagGetTags200Response core_tag_get_tags(core_tag_get_tags_request)
Gets tags by their ids

Gets tags by their ids

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_tag_get_tags_request** | [**CoreTagGetTagsRequest**](CoreTagGetTagsRequest.md) |  | [required] |

### Return type

[**models::CoreTagGetTags200Response**](core_tag_get_tags_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_tag_update_tags

> models::CoreCohortAddCohortMembers200Response core_tag_update_tags(core_tag_update_tags_request)
Updates tags

Updates tags

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_tag_update_tags_request** | [**CoreTagUpdateTagsRequest**](CoreTagUpdateTagsRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_update_inplace_editable

> models::CoreUpdateInplaceEditable200Response core_update_inplace_editable(core_update_inplace_editable_request)
Generic service to update title

Generic service to update title

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_update_inplace_editable_request** | [**CoreUpdateInplaceEditableRequest**](CoreUpdateInplaceEditableRequest.md) |  | [required] |

### Return type

[**models::CoreUpdateInplaceEditable200Response**](core_update_inplace_editable_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_add_user_device

> serde_json::Value core_user_add_user_device(core_user_add_user_device_request)
Store mobile user devices information for PUSH Notifications.

Store mobile user devices information for PUSH Notifications.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_add_user_device_request** | [**CoreUserAddUserDeviceRequest**](CoreUserAddUserDeviceRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_add_user_private_files

> serde_json::Value core_user_add_user_private_files(core_user_add_user_private_files_request)
Copy files from a draft area to users private files area.

Copy files from a draft area to users private files area.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_add_user_private_files_request** | [**CoreUserAddUserPrivateFilesRequest**](CoreUserAddUserPrivateFilesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_agree_site_policy

> models::CoreUserAgreeSitePolicy200Response core_user_agree_site_policy()
Agree the site policy for the current user.

Agree the site policy for the current user.

### Parameters

This endpoint does not need any parameter.

### Return type

[**models::CoreUserAgreeSitePolicy200Response**](core_user_agree_site_policy_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_create_users

> serde_json::Value core_user_create_users(core_user_create_users_request)
Create users.

Create users.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_create_users_request** | [**CoreUserCreateUsersRequest**](CoreUserCreateUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_delete_users

> serde_json::Value core_user_delete_users(core_user_delete_users_request)
Delete users.

Delete users.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_delete_users_request** | [**CoreUserDeleteUsersRequest**](CoreUserDeleteUsersRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_get_course_user_profiles

> serde_json::Value core_user_get_course_user_profiles(core_user_get_course_user_profiles_request)
Get course user profiles (each of the profils matching a course id and a user id),.

Get course user profiles (each of the profils matching a course id and a user id),.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_get_course_user_profiles_request** | [**CoreUserGetCourseUserProfilesRequest**](CoreUserGetCourseUserProfilesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_get_private_files_info

> models::CoreUserGetPrivateFilesInfo200Response core_user_get_private_files_info(core_user_get_private_files_info_request)
Returns general information about files in the user private files area.

Returns general information about files in the user private files area.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_get_private_files_info_request** | [**CoreUserGetPrivateFilesInfoRequest**](CoreUserGetPrivateFilesInfoRequest.md) |  | [required] |

### Return type

[**models::CoreUserGetPrivateFilesInfo200Response**](core_user_get_private_files_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_get_user_preferences

> models::CoreUserGetUserPreferences200Response core_user_get_user_preferences(core_user_get_user_preferences_request)
Return user preferences.

Return user preferences.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_get_user_preferences_request** | [**CoreUserGetUserPreferencesRequest**](CoreUserGetUserPreferencesRequest.md) |  | [required] |

### Return type

[**models::CoreUserGetUserPreferences200Response**](core_user_get_user_preferences_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_get_users

> models::CoreUserGetUsers200Response core_user_get_users(core_user_get_users_request)
search for users matching the parameters

search for users matching the parameters

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_get_users_request** | [**CoreUserGetUsersRequest**](CoreUserGetUsersRequest.md) |  | [required] |

### Return type

[**models::CoreUserGetUsers200Response**](core_user_get_users_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_get_users_by_field

> serde_json::Value core_user_get_users_by_field(core_user_get_users_by_field_request)
Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().

Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_get_users_by_field_request** | [**CoreUserGetUsersByFieldRequest**](CoreUserGetUsersByFieldRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_remove_user_device

> models::CoreUserRemoveUserDevice200Response core_user_remove_user_device(core_user_remove_user_device_request)
Remove a user device from the Moodle database.

Remove a user device from the Moodle database.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_remove_user_device_request** | [**CoreUserRemoveUserDeviceRequest**](CoreUserRemoveUserDeviceRequest.md) |  | [required] |

### Return type

[**models::CoreUserRemoveUserDevice200Response**](core_user_remove_user_device_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_search_identity

> models::CoreUserSearchIdentity200Response core_user_search_identity(core_user_search_identity_request)
Return list of users identities matching the given criteria in their name or other identity fields.

Return list of users identities matching the given criteria in their name or other identity fields.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_search_identity_request** | [**CoreUserSearchIdentityRequest**](CoreUserSearchIdentityRequest.md) |  | [required] |

### Return type

[**models::CoreUserSearchIdentity200Response**](core_user_search_identity_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_set_user_preferences

> models::CoreUserSetUserPreferences200Response core_user_set_user_preferences(core_user_set_user_preferences_request)
Set user preferences.

Set user preferences.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_set_user_preferences_request** | [**CoreUserSetUserPreferencesRequest**](CoreUserSetUserPreferencesRequest.md) |  | [required] |

### Return type

[**models::CoreUserSetUserPreferences200Response**](core_user_set_user_preferences_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_update_picture

> models::CoreUserUpdatePicture200Response core_user_update_picture(core_user_update_picture_request)
Update or delete the user picture in the site

Update or delete the user picture in the site

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_update_picture_request** | [**CoreUserUpdatePictureRequest**](CoreUserUpdatePictureRequest.md) |  | [required] |

### Return type

[**models::CoreUserUpdatePicture200Response**](core_user_update_picture_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_update_user_device_public_key

> models::CoreUserUpdateUserDevicePublicKey200Response core_user_update_user_device_public_key(core_user_update_user_device_public_key_request)
Store mobile user public key.

Store mobile user public key.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_update_user_device_public_key_request** | [**CoreUserUpdateUserDevicePublicKeyRequest**](CoreUserUpdateUserDevicePublicKeyRequest.md) |  | [required] |

### Return type

[**models::CoreUserUpdateUserDevicePublicKey200Response**](core_user_update_user_device_public_key_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_update_user_preferences

> serde_json::Value core_user_update_user_preferences(core_user_update_user_preferences_request)
Update a user's preferences

Update a user's preferences

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_update_user_preferences_request** | [**CoreUserUpdateUserPreferencesRequest**](CoreUserUpdateUserPreferencesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_update_users

> models::CoreCohortAddCohortMembers200Response core_user_update_users(core_user_update_users_request)
Update users.

Update users.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_update_users_request** | [**CoreUserUpdateUsersRequest**](CoreUserUpdateUsersRequest.md) |  | [required] |

### Return type

[**models::CoreCohortAddCohortMembers200Response**](core_cohort_add_cohort_members_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_view_user_list

> models::CoreCalendarDeleteSubscription200Response core_user_view_user_list(core_user_view_user_list_request)
Simulates the web-interface view of user/index.php (triggering events),.

Simulates the web-interface view of user/index.php (triggering events),.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_view_user_list_request** | [**CoreUserViewUserListRequest**](CoreUserViewUserListRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_user_view_user_profile

> models::CoreCalendarDeleteSubscription200Response core_user_view_user_profile(core_user_view_user_profile_request)
Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.

Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_user_view_user_profile_request** | [**CoreUserViewUserProfileRequest**](CoreUserViewUserProfileRequest.md) |  | [required] |

### Return type

[**models::CoreCalendarDeleteSubscription200Response**](core_calendar_delete_subscription_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_webservice_get_site_info

> models::CoreWebserviceGetSiteInfo200Response core_webservice_get_site_info(core_webservice_get_site_info_request)
Return some site info / user info / list web service functions

Return some site info / user info / list web service functions

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_webservice_get_site_info_request** | [**CoreWebserviceGetSiteInfoRequest**](CoreWebserviceGetSiteInfoRequest.md) |  | [required] |

### Return type

[**models::CoreWebserviceGetSiteInfo200Response**](core_webservice_get_site_info_200_response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_delete_state

> serde_json::Value core_xapi_delete_state(core_xapi_delete_state_request)
Delete an xAPI state data from an activityId.

Delete an xAPI state data from an activityId.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_delete_state_request** | [**CoreXapiDeleteStateRequest**](CoreXapiDeleteStateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_delete_states

> serde_json::Value core_xapi_delete_states(core_xapi_delete_states_request)
Delete all xAPI state data from an activityId.

Delete all xAPI state data from an activityId.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_delete_states_request** | [**CoreXapiDeleteStatesRequest**](CoreXapiDeleteStatesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_get_state

> serde_json::Value core_xapi_get_state(core_xapi_get_state_request)
Get an xAPI state data from an activityId.

Get an xAPI state data from an activityId.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_get_state_request** | [**CoreXapiGetStateRequest**](CoreXapiGetStateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_get_states

> serde_json::Value core_xapi_get_states(core_xapi_get_states_request)
Get all state ID from an activityId.

Get all state ID from an activityId.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_get_states_request** | [**CoreXapiGetStatesRequest**](CoreXapiGetStatesRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_post_state

> serde_json::Value core_xapi_post_state(core_xapi_post_state_request)
Post an xAPI state into an activityId.

Post an xAPI state into an activityId.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_post_state_request** | [**CoreXapiPostStateRequest**](CoreXapiPostStateRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## core_xapi_statement_post

> serde_json::Value core_xapi_statement_post(core_xapi_statement_post_request)
Post an xAPI statement.

Post an xAPI statement.

### Parameters


Name | Type | Description  | Required | Notes
------------- | ------------- | ------------- | ------------- | -------------
**core_xapi_statement_post_request** | [**CoreXapiStatementPostRequest**](CoreXapiStatementPostRequest.md) |  | [required] |

### Return type

[**serde_json::Value**](serde_json::Value.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

