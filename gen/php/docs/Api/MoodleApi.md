# OpenAPI\Client\MoodleApi

All URIs are relative to https://localhost/webservice/rest/server.php, except if the operation defines another base path.

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**coreAdminSetBlockProtection()**](MoodleApi.md#coreAdminSetBlockProtection) | **POST** /core_admin_set_block_protection | Set the protection state for a block plugin |
| [**coreAdminSetPluginOrder()**](MoodleApi.md#coreAdminSetPluginOrder) | **POST** /core_admin_set_plugin_order | Set the order of a plugin |
| [**coreAdminSetPluginState()**](MoodleApi.md#coreAdminSetPluginState) | **POST** /core_admin_set_plugin_state | Set the state of a plugin |
| [**coreAuthConfirmUser()**](MoodleApi.md#coreAuthConfirmUser) | **POST** /core_auth_confirm_user | Confirm a user account. |
| [**coreAuthIsAgeDigitalConsentVerificationEnabled()**](MoodleApi.md#coreAuthIsAgeDigitalConsentVerificationEnabled) | **POST** /core_auth_is_age_digital_consent_verification_enabled | Checks if age digital consent verification is enabled. |
| [**coreAuthIsMinor()**](MoodleApi.md#coreAuthIsMinor) | **POST** /core_auth_is_minor | Requests a check if a user is a digital minor. |
| [**coreAuthRequestPasswordReset()**](MoodleApi.md#coreAuthRequestPasswordReset) | **POST** /core_auth_request_password_reset | Requests a password reset. |
| [**coreAuthResendConfirmationEmail()**](MoodleApi.md#coreAuthResendConfirmationEmail) | **POST** /core_auth_resend_confirmation_email | Resend confirmation email. |
| [**coreBackupGetAsyncBackupLinksBackup()**](MoodleApi.md#coreBackupGetAsyncBackupLinksBackup) | **POST** /core_backup_get_async_backup_links_backup | Gets the data to use when updating the status table row in the UI for when an async backup completes. |
| [**coreBackupGetAsyncBackupLinksRestore()**](MoodleApi.md#coreBackupGetAsyncBackupLinksRestore) | **POST** /core_backup_get_async_backup_links_restore | Gets the data to use when updating the status table row in the UI for when an async restore completes. |
| [**coreBackupGetAsyncBackupProgress()**](MoodleApi.md#coreBackupGetAsyncBackupProgress) | **POST** /core_backup_get_async_backup_progress | Get the progress of an Asyncronhous backup. |
| [**coreBackupGetCopyProgress()**](MoodleApi.md#coreBackupGetCopyProgress) | **POST** /core_backup_get_copy_progress | Gets the progress of course copy operations. |
| [**coreBackupSubmitCopyForm()**](MoodleApi.md#coreBackupSubmitCopyForm) | **POST** /core_backup_submit_copy_form | Handles ajax submission of course copy form. |
| [**coreBadgesGetUserBadgeByHash()**](MoodleApi.md#coreBadgesGetUserBadgeByHash) | **POST** /core_badges_get_user_badge_by_hash | Returns the badge awarded to a user by hash. |
| [**coreBadgesGetUserBadges()**](MoodleApi.md#coreBadgesGetUserBadges) | **POST** /core_badges_get_user_badges | Returns the list of badges awarded to a user. |
| [**coreBlockFetchAddableBlocks()**](MoodleApi.md#coreBlockFetchAddableBlocks) | **POST** /core_block_fetch_addable_blocks | Returns all addable blocks in a given page. |
| [**coreBlockGetCourseBlocks()**](MoodleApi.md#coreBlockGetCourseBlocks) | **POST** /core_block_get_course_blocks | Returns blocks information for a course. |
| [**coreBlockGetDashboardBlocks()**](MoodleApi.md#coreBlockGetDashboardBlocks) | **POST** /core_block_get_dashboard_blocks | Returns blocks information for the given user dashboard. |
| [**coreBlogGetEntries()**](MoodleApi.md#coreBlogGetEntries) | **POST** /core_blog_get_entries | Returns blog entries. |
| [**coreBlogViewEntries()**](MoodleApi.md#coreBlogViewEntries) | **POST** /core_blog_view_entries | Trigger the blog_entries_viewed event. |
| [**coreCalendarCreateCalendarEvents()**](MoodleApi.md#coreCalendarCreateCalendarEvents) | **POST** /core_calendar_create_calendar_events | Create calendar events |
| [**coreCalendarDeleteCalendarEvents()**](MoodleApi.md#coreCalendarDeleteCalendarEvents) | **POST** /core_calendar_delete_calendar_events | Delete calendar events |
| [**coreCalendarDeleteSubscription()**](MoodleApi.md#coreCalendarDeleteSubscription) | **POST** /core_calendar_delete_subscription | Delete the calendar subscription |
| [**coreCalendarGetActionEventsByCourse()**](MoodleApi.md#coreCalendarGetActionEventsByCourse) | **POST** /core_calendar_get_action_events_by_course | Get calendar action events by course |
| [**coreCalendarGetActionEventsByCourses()**](MoodleApi.md#coreCalendarGetActionEventsByCourses) | **POST** /core_calendar_get_action_events_by_courses | Get calendar action events by courses |
| [**coreCalendarGetActionEventsByTimesort()**](MoodleApi.md#coreCalendarGetActionEventsByTimesort) | **POST** /core_calendar_get_action_events_by_timesort | Get calendar action events by tiemsort |
| [**coreCalendarGetAllowedEventTypes()**](MoodleApi.md#coreCalendarGetAllowedEventTypes) | **POST** /core_calendar_get_allowed_event_types | Get the type of events a user can create in the given course. |
| [**coreCalendarGetCalendarAccessInformation()**](MoodleApi.md#coreCalendarGetCalendarAccessInformation) | **POST** /core_calendar_get_calendar_access_information | Convenience function to retrieve some permissions/access information for the given course calendar. |
| [**coreCalendarGetCalendarDayView()**](MoodleApi.md#coreCalendarGetCalendarDayView) | **POST** /core_calendar_get_calendar_day_view | Fetch the day view data for a calendar |
| [**coreCalendarGetCalendarEventById()**](MoodleApi.md#coreCalendarGetCalendarEventById) | **POST** /core_calendar_get_calendar_event_by_id | Get calendar event by id |
| [**coreCalendarGetCalendarEvents()**](MoodleApi.md#coreCalendarGetCalendarEvents) | **POST** /core_calendar_get_calendar_events | Get calendar events |
| [**coreCalendarGetCalendarExportToken()**](MoodleApi.md#coreCalendarGetCalendarExportToken) | **POST** /core_calendar_get_calendar_export_token | Return the auth token required for exporting a calendar. |
| [**coreCalendarGetCalendarMonthlyView()**](MoodleApi.md#coreCalendarGetCalendarMonthlyView) | **POST** /core_calendar_get_calendar_monthly_view | Fetch the monthly view data for a calendar |
| [**coreCalendarGetCalendarUpcomingView()**](MoodleApi.md#coreCalendarGetCalendarUpcomingView) | **POST** /core_calendar_get_calendar_upcoming_view | Fetch the upcoming view data for a calendar |
| [**coreCalendarGetTimestamps()**](MoodleApi.md#coreCalendarGetTimestamps) | **POST** /core_calendar_get_timestamps | Fetch unix timestamps for given date times. |
| [**coreCalendarSubmitCreateUpdateForm()**](MoodleApi.md#coreCalendarSubmitCreateUpdateForm) | **POST** /core_calendar_submit_create_update_form | Submit form data for event form |
| [**coreCalendarUpdateEventStartDay()**](MoodleApi.md#coreCalendarUpdateEventStartDay) | **POST** /core_calendar_update_event_start_day | Update the start day (but not time) for an event. |
| [**coreChangeEditmode()**](MoodleApi.md#coreChangeEditmode) | **POST** /core_change_editmode | Change the editing mode |
| [**coreCohortAddCohortMembers()**](MoodleApi.md#coreCohortAddCohortMembers) | **POST** /core_cohort_add_cohort_members | Adds cohort members. |
| [**coreCohortCreateCohorts()**](MoodleApi.md#coreCohortCreateCohorts) | **POST** /core_cohort_create_cohorts | Creates new cohorts. |
| [**coreCohortDeleteCohortMembers()**](MoodleApi.md#coreCohortDeleteCohortMembers) | **POST** /core_cohort_delete_cohort_members | Deletes cohort members. |
| [**coreCohortDeleteCohorts()**](MoodleApi.md#coreCohortDeleteCohorts) | **POST** /core_cohort_delete_cohorts | Deletes all specified cohorts. |
| [**coreCohortGetCohortMembers()**](MoodleApi.md#coreCohortGetCohortMembers) | **POST** /core_cohort_get_cohort_members | Returns cohort members. |
| [**coreCohortGetCohorts()**](MoodleApi.md#coreCohortGetCohorts) | **POST** /core_cohort_get_cohorts | Returns cohort details. |
| [**coreCohortSearchCohorts()**](MoodleApi.md#coreCohortSearchCohorts) | **POST** /core_cohort_search_cohorts | Search for cohorts. |
| [**coreCohortUpdateCohorts()**](MoodleApi.md#coreCohortUpdateCohorts) | **POST** /core_cohort_update_cohorts | Updates existing cohorts. |
| [**coreCommentAddComments()**](MoodleApi.md#coreCommentAddComments) | **POST** /core_comment_add_comments | Adds a comment or comments. |
| [**coreCommentDeleteComments()**](MoodleApi.md#coreCommentDeleteComments) | **POST** /core_comment_delete_comments | Deletes a comment or comments. |
| [**coreCommentGetComments()**](MoodleApi.md#coreCommentGetComments) | **POST** /core_comment_get_comments | Returns comments. |
| [**coreCompetencyAddCompetencyToCourse()**](MoodleApi.md#coreCompetencyAddCompetencyToCourse) | **POST** /core_competency_add_competency_to_course | Add the competency to a course |
| [**coreCompetencyAddCompetencyToPlan()**](MoodleApi.md#coreCompetencyAddCompetencyToPlan) | **POST** /core_competency_add_competency_to_plan | Add the competency to a learning plan |
| [**coreCompetencyAddCompetencyToTemplate()**](MoodleApi.md#coreCompetencyAddCompetencyToTemplate) | **POST** /core_competency_add_competency_to_template | Add the competency to a template |
| [**coreCompetencyAddRelatedCompetency()**](MoodleApi.md#coreCompetencyAddRelatedCompetency) | **POST** /core_competency_add_related_competency | Adds a related competency |
| [**coreCompetencyApprovePlan()**](MoodleApi.md#coreCompetencyApprovePlan) | **POST** /core_competency_approve_plan | Approve a plan. |
| [**coreCompetencyCompetencyFrameworkViewed()**](MoodleApi.md#coreCompetencyCompetencyFrameworkViewed) | **POST** /core_competency_competency_framework_viewed | Log event competency framework viewed |
| [**coreCompetencyCompetencyViewed()**](MoodleApi.md#coreCompetencyCompetencyViewed) | **POST** /core_competency_competency_viewed | Log event competency viewed |
| [**coreCompetencyCompletePlan()**](MoodleApi.md#coreCompetencyCompletePlan) | **POST** /core_competency_complete_plan | Complete learning plan. |
| [**coreCompetencyCountCompetencies()**](MoodleApi.md#coreCompetencyCountCompetencies) | **POST** /core_competency_count_competencies | Count a list of a competencies. |
| [**coreCompetencyCountCompetenciesInCourse()**](MoodleApi.md#coreCompetencyCountCompetenciesInCourse) | **POST** /core_competency_count_competencies_in_course | List the competencies in a course |
| [**coreCompetencyCountCompetenciesInTemplate()**](MoodleApi.md#coreCompetencyCountCompetenciesInTemplate) | **POST** /core_competency_count_competencies_in_template | Count a list of a competencies for a given template. |
| [**coreCompetencyCountCompetencyFrameworks()**](MoodleApi.md#coreCompetencyCountCompetencyFrameworks) | **POST** /core_competency_count_competency_frameworks | Count a list of a competency frameworks. |
| [**coreCompetencyCountCourseModuleCompetencies()**](MoodleApi.md#coreCompetencyCountCourseModuleCompetencies) | **POST** /core_competency_count_course_module_competencies | Count the competencies in a course module |
| [**coreCompetencyCountCoursesUsingCompetency()**](MoodleApi.md#coreCompetencyCountCoursesUsingCompetency) | **POST** /core_competency_count_courses_using_competency | List the courses using a competency |
| [**coreCompetencyCountTemplates()**](MoodleApi.md#coreCompetencyCountTemplates) | **POST** /core_competency_count_templates | Count a list of a learning plan templates. |
| [**coreCompetencyCountTemplatesUsingCompetency()**](MoodleApi.md#coreCompetencyCountTemplatesUsingCompetency) | **POST** /core_competency_count_templates_using_competency | Count a list of a learning plan templates for a given competency. |
| [**coreCompetencyCreateCompetency()**](MoodleApi.md#coreCompetencyCreateCompetency) | **POST** /core_competency_create_competency | Creates new competencies. |
| [**coreCompetencyCreateCompetencyFramework()**](MoodleApi.md#coreCompetencyCreateCompetencyFramework) | **POST** /core_competency_create_competency_framework | Creates new competency frameworks. |
| [**coreCompetencyCreatePlan()**](MoodleApi.md#coreCompetencyCreatePlan) | **POST** /core_competency_create_plan | Creates a learning plan. |
| [**coreCompetencyCreateTemplate()**](MoodleApi.md#coreCompetencyCreateTemplate) | **POST** /core_competency_create_template | Creates new learning plan templates. |
| [**coreCompetencyCreateUserEvidenceCompetency()**](MoodleApi.md#coreCompetencyCreateUserEvidenceCompetency) | **POST** /core_competency_create_user_evidence_competency | Create an evidence of prior learning relationship with a competency. |
| [**coreCompetencyDeleteCompetency()**](MoodleApi.md#coreCompetencyDeleteCompetency) | **POST** /core_competency_delete_competency | Delete a competency. |
| [**coreCompetencyDeleteCompetencyFramework()**](MoodleApi.md#coreCompetencyDeleteCompetencyFramework) | **POST** /core_competency_delete_competency_framework | Delete a competency framework. |
| [**coreCompetencyDeleteEvidence()**](MoodleApi.md#coreCompetencyDeleteEvidence) | **POST** /core_competency_delete_evidence | Delete an evidence |
| [**coreCompetencyDeletePlan()**](MoodleApi.md#coreCompetencyDeletePlan) | **POST** /core_competency_delete_plan | Delete a learning plan. |
| [**coreCompetencyDeleteTemplate()**](MoodleApi.md#coreCompetencyDeleteTemplate) | **POST** /core_competency_delete_template | Delete a learning plan template. |
| [**coreCompetencyDeleteUserEvidence()**](MoodleApi.md#coreCompetencyDeleteUserEvidence) | **POST** /core_competency_delete_user_evidence | Delete an evidence of prior learning. |
| [**coreCompetencyDeleteUserEvidenceCompetency()**](MoodleApi.md#coreCompetencyDeleteUserEvidenceCompetency) | **POST** /core_competency_delete_user_evidence_competency | Delete an evidence of prior learning relationship with a competency. |
| [**coreCompetencyDuplicateCompetencyFramework()**](MoodleApi.md#coreCompetencyDuplicateCompetencyFramework) | **POST** /core_competency_duplicate_competency_framework | Duplicate a competency framework. |
| [**coreCompetencyDuplicateTemplate()**](MoodleApi.md#coreCompetencyDuplicateTemplate) | **POST** /core_competency_duplicate_template | Duplicate learning plan template. |
| [**coreCompetencyGetScaleValues()**](MoodleApi.md#coreCompetencyGetScaleValues) | **POST** /core_competency_get_scale_values | Fetch the values for a specific scale |
| [**coreCompetencyGradeCompetency()**](MoodleApi.md#coreCompetencyGradeCompetency) | **POST** /core_competency_grade_competency | Grade a competency. |
| [**coreCompetencyGradeCompetencyInCourse()**](MoodleApi.md#coreCompetencyGradeCompetencyInCourse) | **POST** /core_competency_grade_competency_in_course | Grade a competency from the course page. |
| [**coreCompetencyGradeCompetencyInPlan()**](MoodleApi.md#coreCompetencyGradeCompetencyInPlan) | **POST** /core_competency_grade_competency_in_plan | Grade a competency from the user plan page. |
| [**coreCompetencyListCompetencies()**](MoodleApi.md#coreCompetencyListCompetencies) | **POST** /core_competency_list_competencies | Load a list of a competencies. |
| [**coreCompetencyListCompetenciesInTemplate()**](MoodleApi.md#coreCompetencyListCompetenciesInTemplate) | **POST** /core_competency_list_competencies_in_template | Load a list of a competencies for a given template. |
| [**coreCompetencyListCompetencyFrameworks()**](MoodleApi.md#coreCompetencyListCompetencyFrameworks) | **POST** /core_competency_list_competency_frameworks | Load a list of a competency frameworks. |
| [**coreCompetencyListCourseCompetencies()**](MoodleApi.md#coreCompetencyListCourseCompetencies) | **POST** /core_competency_list_course_competencies | List the competencies in a course |
| [**coreCompetencyListCourseModuleCompetencies()**](MoodleApi.md#coreCompetencyListCourseModuleCompetencies) | **POST** /core_competency_list_course_module_competencies | List the competencies in a course module |
| [**coreCompetencyListPlanCompetencies()**](MoodleApi.md#coreCompetencyListPlanCompetencies) | **POST** /core_competency_list_plan_competencies | List the competencies in a plan |
| [**coreCompetencyListTemplates()**](MoodleApi.md#coreCompetencyListTemplates) | **POST** /core_competency_list_templates | Load a list of a learning plan templates. |
| [**coreCompetencyListTemplatesUsingCompetency()**](MoodleApi.md#coreCompetencyListTemplatesUsingCompetency) | **POST** /core_competency_list_templates_using_competency | Load a list of a learning plan templates for a given competency. |
| [**coreCompetencyListUserPlans()**](MoodleApi.md#coreCompetencyListUserPlans) | **POST** /core_competency_list_user_plans | List a user&#39;s learning plans. |
| [**coreCompetencyMoveDownCompetency()**](MoodleApi.md#coreCompetencyMoveDownCompetency) | **POST** /core_competency_move_down_competency | Re-order a competency. |
| [**coreCompetencyMoveUpCompetency()**](MoodleApi.md#coreCompetencyMoveUpCompetency) | **POST** /core_competency_move_up_competency | Re-order a competency. |
| [**coreCompetencyPlanCancelReviewRequest()**](MoodleApi.md#coreCompetencyPlanCancelReviewRequest) | **POST** /core_competency_plan_cancel_review_request | Cancel the review of a plan. |
| [**coreCompetencyPlanRequestReview()**](MoodleApi.md#coreCompetencyPlanRequestReview) | **POST** /core_competency_plan_request_review | Request for a plan to be reviewed. |
| [**coreCompetencyPlanStartReview()**](MoodleApi.md#coreCompetencyPlanStartReview) | **POST** /core_competency_plan_start_review | Start the review of a plan. |
| [**coreCompetencyPlanStopReview()**](MoodleApi.md#coreCompetencyPlanStopReview) | **POST** /core_competency_plan_stop_review | Stop the review of a plan. |
| [**coreCompetencyReadCompetency()**](MoodleApi.md#coreCompetencyReadCompetency) | **POST** /core_competency_read_competency | Load a summary of a competency. |
| [**coreCompetencyReadCompetencyFramework()**](MoodleApi.md#coreCompetencyReadCompetencyFramework) | **POST** /core_competency_read_competency_framework | Load a summary of a competency framework. |
| [**coreCompetencyReadPlan()**](MoodleApi.md#coreCompetencyReadPlan) | **POST** /core_competency_read_plan | Load a learning plan. |
| [**coreCompetencyReadTemplate()**](MoodleApi.md#coreCompetencyReadTemplate) | **POST** /core_competency_read_template | Load a summary of a learning plan template. |
| [**coreCompetencyReadUserEvidence()**](MoodleApi.md#coreCompetencyReadUserEvidence) | **POST** /core_competency_read_user_evidence | Read an evidence of prior learning. |
| [**coreCompetencyRemoveCompetencyFromCourse()**](MoodleApi.md#coreCompetencyRemoveCompetencyFromCourse) | **POST** /core_competency_remove_competency_from_course | Remove a competency from a course |
| [**coreCompetencyRemoveCompetencyFromPlan()**](MoodleApi.md#coreCompetencyRemoveCompetencyFromPlan) | **POST** /core_competency_remove_competency_from_plan | Remove the competency from a learning plan |
| [**coreCompetencyRemoveCompetencyFromTemplate()**](MoodleApi.md#coreCompetencyRemoveCompetencyFromTemplate) | **POST** /core_competency_remove_competency_from_template | Remove a competency from a template |
| [**coreCompetencyRemoveRelatedCompetency()**](MoodleApi.md#coreCompetencyRemoveRelatedCompetency) | **POST** /core_competency_remove_related_competency | Remove a related competency |
| [**coreCompetencyReopenPlan()**](MoodleApi.md#coreCompetencyReopenPlan) | **POST** /core_competency_reopen_plan | Reopen learning plan. |
| [**coreCompetencyReorderCourseCompetency()**](MoodleApi.md#coreCompetencyReorderCourseCompetency) | **POST** /core_competency_reorder_course_competency | Move a course competency to a new relative sort order. |
| [**coreCompetencyReorderPlanCompetency()**](MoodleApi.md#coreCompetencyReorderPlanCompetency) | **POST** /core_competency_reorder_plan_competency | Move a plan competency to a new relative sort order. |
| [**coreCompetencyReorderTemplateCompetency()**](MoodleApi.md#coreCompetencyReorderTemplateCompetency) | **POST** /core_competency_reorder_template_competency | Move a template competency to a new relative sort order. |
| [**coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies()**](MoodleApi.md#coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies) | **POST** /core_competency_request_review_of_user_evidence_linked_competencies | Send user evidence competencies in review |
| [**coreCompetencySearchCompetencies()**](MoodleApi.md#coreCompetencySearchCompetencies) | **POST** /core_competency_search_competencies | Search a list of a competencies. |
| [**coreCompetencySetCourseCompetencyRuleoutcome()**](MoodleApi.md#coreCompetencySetCourseCompetencyRuleoutcome) | **POST** /core_competency_set_course_competency_ruleoutcome | Modify the ruleoutcome value for course competency |
| [**coreCompetencySetParentCompetency()**](MoodleApi.md#coreCompetencySetParentCompetency) | **POST** /core_competency_set_parent_competency | Set a new parent for a competency. |
| [**coreCompetencyTemplateHasRelatedData()**](MoodleApi.md#coreCompetencyTemplateHasRelatedData) | **POST** /core_competency_template_has_related_data | Check if a template has related data |
| [**coreCompetencyTemplateViewed()**](MoodleApi.md#coreCompetencyTemplateViewed) | **POST** /core_competency_template_viewed | Log event template viewed |
| [**coreCompetencyUnapprovePlan()**](MoodleApi.md#coreCompetencyUnapprovePlan) | **POST** /core_competency_unapprove_plan | Unapprove a plan. |
| [**coreCompetencyUnlinkPlanFromTemplate()**](MoodleApi.md#coreCompetencyUnlinkPlanFromTemplate) | **POST** /core_competency_unlink_plan_from_template | Unlink a plan form it template. |
| [**coreCompetencyUpdateCompetency()**](MoodleApi.md#coreCompetencyUpdateCompetency) | **POST** /core_competency_update_competency | Update a competency. |
| [**coreCompetencyUpdateCompetencyFramework()**](MoodleApi.md#coreCompetencyUpdateCompetencyFramework) | **POST** /core_competency_update_competency_framework | Update a competency framework. |
| [**coreCompetencyUpdateCourseCompetencySettings()**](MoodleApi.md#coreCompetencyUpdateCourseCompetencySettings) | **POST** /core_competency_update_course_competency_settings | Update the course competency settings |
| [**coreCompetencyUpdatePlan()**](MoodleApi.md#coreCompetencyUpdatePlan) | **POST** /core_competency_update_plan | Updates a learning plan. |
| [**coreCompetencyUpdateTemplate()**](MoodleApi.md#coreCompetencyUpdateTemplate) | **POST** /core_competency_update_template | Update a learning plan template. |
| [**coreCompetencyUserCompetencyCancelReviewRequest()**](MoodleApi.md#coreCompetencyUserCompetencyCancelReviewRequest) | **POST** /core_competency_user_competency_cancel_review_request | Cancel a review request. |
| [**coreCompetencyUserCompetencyPlanViewed()**](MoodleApi.md#coreCompetencyUserCompetencyPlanViewed) | **POST** /core_competency_user_competency_plan_viewed | Log the user competency plan viewed event. |
| [**coreCompetencyUserCompetencyRequestReview()**](MoodleApi.md#coreCompetencyUserCompetencyRequestReview) | **POST** /core_competency_user_competency_request_review | Request a review. |
| [**coreCompetencyUserCompetencyStartReview()**](MoodleApi.md#coreCompetencyUserCompetencyStartReview) | **POST** /core_competency_user_competency_start_review | Start a review. |
| [**coreCompetencyUserCompetencyStopReview()**](MoodleApi.md#coreCompetencyUserCompetencyStopReview) | **POST** /core_competency_user_competency_stop_review | Stop a review. |
| [**coreCompetencyUserCompetencyViewed()**](MoodleApi.md#coreCompetencyUserCompetencyViewed) | **POST** /core_competency_user_competency_viewed | Log the user competency viewed event. |
| [**coreCompetencyUserCompetencyViewedInCourse()**](MoodleApi.md#coreCompetencyUserCompetencyViewedInCourse) | **POST** /core_competency_user_competency_viewed_in_course | Log the user competency viewed in course event |
| [**coreCompetencyUserCompetencyViewedInPlan()**](MoodleApi.md#coreCompetencyUserCompetencyViewedInPlan) | **POST** /core_competency_user_competency_viewed_in_plan | Log the user competency viewed in plan event. |
| [**coreCompletionGetActivitiesCompletionStatus()**](MoodleApi.md#coreCompletionGetActivitiesCompletionStatus) | **POST** /core_completion_get_activities_completion_status | Return the activities completion status for a user in a course. |
| [**coreCompletionGetCourseCompletionStatus()**](MoodleApi.md#coreCompletionGetCourseCompletionStatus) | **POST** /core_completion_get_course_completion_status | Returns course completion status. |
| [**coreCompletionMarkCourseSelfCompleted()**](MoodleApi.md#coreCompletionMarkCourseSelfCompleted) | **POST** /core_completion_mark_course_self_completed | Update the course completion status for the current user (if course self-completion is enabled). |
| [**coreCompletionOverrideActivityCompletionStatus()**](MoodleApi.md#coreCompletionOverrideActivityCompletionStatus) | **POST** /core_completion_override_activity_completion_status | Update completion status for a user in an activity by overriding it. |
| [**coreCompletionUpdateActivityCompletionStatusManually()**](MoodleApi.md#coreCompletionUpdateActivityCompletionStatusManually) | **POST** /core_completion_update_activity_completion_status_manually | Update completion status for the current user in an activity, only for activities with manual tracking. |
| [**coreContentbankCopyContent()**](MoodleApi.md#coreContentbankCopyContent) | **POST** /core_contentbank_copy_content | Copy a content in the content bank. |
| [**coreContentbankDeleteContent()**](MoodleApi.md#coreContentbankDeleteContent) | **POST** /core_contentbank_delete_content | Delete a content from the content bank. |
| [**coreContentbankRenameContent()**](MoodleApi.md#coreContentbankRenameContent) | **POST** /core_contentbank_rename_content | Rename a content in the content bank. |
| [**coreContentbankSetContentVisibility()**](MoodleApi.md#coreContentbankSetContentVisibility) | **POST** /core_contentbank_set_content_visibility | Set the visibility of a content in the content bank. |
| [**coreCourseAddContentItemToUserFavourites()**](MoodleApi.md#coreCourseAddContentItemToUserFavourites) | **POST** /core_course_add_content_item_to_user_favourites | Adds a content item (activity, resource or their subtypes) to the favourites for the user. |
| [**coreCourseCheckUpdates()**](MoodleApi.md#coreCourseCheckUpdates) | **POST** /core_course_check_updates | Check if there is updates affecting the user for the given course and contexts. |
| [**coreCourseCreateCategories()**](MoodleApi.md#coreCourseCreateCategories) | **POST** /core_course_create_categories | Create course categories |
| [**coreCourseCreateCourses()**](MoodleApi.md#coreCourseCreateCourses) | **POST** /core_course_create_courses | Create new courses |
| [**coreCourseDeleteCategories()**](MoodleApi.md#coreCourseDeleteCategories) | **POST** /core_course_delete_categories | Delete course categories |
| [**coreCourseDeleteCourses()**](MoodleApi.md#coreCourseDeleteCourses) | **POST** /core_course_delete_courses | Deletes all specified courses |
| [**coreCourseDeleteModules()**](MoodleApi.md#coreCourseDeleteModules) | **POST** /core_course_delete_modules | Deletes all specified module instances |
| [**coreCourseDuplicateCourse()**](MoodleApi.md#coreCourseDuplicateCourse) | **POST** /core_course_duplicate_course | Duplicate an existing course (creating a new one). |
| [**coreCourseEditModule()**](MoodleApi.md#coreCourseEditModule) | **POST** /core_course_edit_module | Performs an action on course module (change visibility, duplicate, delete, etc.) |
| [**coreCourseEditSection()**](MoodleApi.md#coreCourseEditSection) | **POST** /core_course_edit_section | Performs an action on course section (change visibility, set marker, delete) |
| [**coreCourseGetActivityChooserFooter()**](MoodleApi.md#coreCourseGetActivityChooserFooter) | **POST** /core_course_get_activity_chooser_footer | Fetch the data for the activity chooser footer. |
| [**coreCourseGetCategories()**](MoodleApi.md#coreCourseGetCategories) | **POST** /core_course_get_categories | Return category details |
| [**coreCourseGetContents()**](MoodleApi.md#coreCourseGetContents) | **POST** /core_course_get_contents | Get course contents |
| [**coreCourseGetCourseContentItems()**](MoodleApi.md#coreCourseGetCourseContentItems) | **POST** /core_course_get_course_content_items | Fetch all the content items (activities, resources and their subtypes) for the activity picker |
| [**coreCourseGetCourseModule()**](MoodleApi.md#coreCourseGetCourseModule) | **POST** /core_course_get_course_module | Return information about a course module |
| [**coreCourseGetCourseModuleByInstance()**](MoodleApi.md#coreCourseGetCourseModuleByInstance) | **POST** /core_course_get_course_module_by_instance | Return information about a given module name and instance id |
| [**coreCourseGetCourses()**](MoodleApi.md#coreCourseGetCourses) | **POST** /core_course_get_courses | Return course details |
| [**coreCourseGetCoursesByField()**](MoodleApi.md#coreCourseGetCoursesByField) | **POST** /core_course_get_courses_by_field | Get courses matching a specific field (id/s, shortname, idnumber, category) |
| [**coreCourseGetEnrolledCoursesByTimelineClassification()**](MoodleApi.md#coreCourseGetEnrolledCoursesByTimelineClassification) | **POST** /core_course_get_enrolled_courses_by_timeline_classification | List of enrolled courses for the given timeline classification (past, inprogress, or future). |
| [**coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification()**](MoodleApi.md#coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification) | **POST** /core_course_get_enrolled_courses_with_action_events_by_timeline_classification | List of enrolled courses with action events in a given timeframe, for the given timeline classification. |
| [**coreCourseGetEnrolledUsersByCmid()**](MoodleApi.md#coreCourseGetEnrolledUsersByCmid) | **POST** /core_course_get_enrolled_users_by_cmid | List users by course module id, filter by group and active enrolment status. |
| [**coreCourseGetModule()**](MoodleApi.md#coreCourseGetModule) | **POST** /core_course_get_module | Returns html with one activity module on course page |
| [**coreCourseGetRecentCourses()**](MoodleApi.md#coreCourseGetRecentCourses) | **POST** /core_course_get_recent_courses | List of courses a user has accessed most recently. |
| [**coreCourseGetUpdatesSince()**](MoodleApi.md#coreCourseGetUpdatesSince) | **POST** /core_course_get_updates_since | Check if there are updates affecting the user for the given course since the given time stamp. |
| [**coreCourseGetUserAdministrationOptions()**](MoodleApi.md#coreCourseGetUserAdministrationOptions) | **POST** /core_course_get_user_administration_options | Return a list of administration options in a set of courses that are avaialable or not for the current                             user. |
| [**coreCourseGetUserNavigationOptions()**](MoodleApi.md#coreCourseGetUserNavigationOptions) | **POST** /core_course_get_user_navigation_options | Return a list of navigation options in a set of courses that are avaialable or not for the current user. |
| [**coreCourseImportCourse()**](MoodleApi.md#coreCourseImportCourse) | **POST** /core_course_import_course | Import course data from a course into another course. Does not include any user data. |
| [**coreCourseRemoveContentItemFromUserFavourites()**](MoodleApi.md#coreCourseRemoveContentItemFromUserFavourites) | **POST** /core_course_remove_content_item_from_user_favourites | Removes a content item (activity, resource or their subtypes) from the favourites for the user. |
| [**coreCourseSearchCourses()**](MoodleApi.md#coreCourseSearchCourses) | **POST** /core_course_search_courses | Search courses by (name, module, block, tag) |
| [**coreCourseSetFavouriteCourses()**](MoodleApi.md#coreCourseSetFavouriteCourses) | **POST** /core_course_set_favourite_courses | Add a list of courses to the list of favourite courses. |
| [**coreCourseToggleActivityRecommendation()**](MoodleApi.md#coreCourseToggleActivityRecommendation) | **POST** /core_course_toggle_activity_recommendation | Adds or removes an activity as a recommendation in the activity chooser. |
| [**coreCourseUpdateCategories()**](MoodleApi.md#coreCourseUpdateCategories) | **POST** /core_course_update_categories | Update categories |
| [**coreCourseUpdateCourses()**](MoodleApi.md#coreCourseUpdateCourses) | **POST** /core_course_update_courses | Update courses |
| [**coreCourseViewCourse()**](MoodleApi.md#coreCourseViewCourse) | **POST** /core_course_view_course | Log that the course was viewed |
| [**coreCourseformatFileHandlers()**](MoodleApi.md#coreCourseformatFileHandlers) | **POST** /core_courseformat_file_handlers | Get the current course file hanlders. |
| [**coreCourseformatGetState()**](MoodleApi.md#coreCourseformatGetState) | **POST** /core_courseformat_get_state | Get the current course state. |
| [**coreCourseformatUpdateCourse()**](MoodleApi.md#coreCourseformatUpdateCourse) | **POST** /core_courseformat_update_course | Update course contents. |
| [**coreCreateUserfeedbackActionRecord()**](MoodleApi.md#coreCreateUserfeedbackActionRecord) | **POST** /core_create_userfeedback_action_record | Record the action that the user takes in the user feedback notification for future use. |
| [**coreCustomfieldCreateCategory()**](MoodleApi.md#coreCustomfieldCreateCategory) | **POST** /core_customfield_create_category | Creates a new category |
| [**coreCustomfieldDeleteCategory()**](MoodleApi.md#coreCustomfieldDeleteCategory) | **POST** /core_customfield_delete_category | Deletes a category |
| [**coreCustomfieldDeleteField()**](MoodleApi.md#coreCustomfieldDeleteField) | **POST** /core_customfield_delete_field | Deletes an entry |
| [**coreCustomfieldMoveCategory()**](MoodleApi.md#coreCustomfieldMoveCategory) | **POST** /core_customfield_move_category | Drag and drop categories |
| [**coreCustomfieldMoveField()**](MoodleApi.md#coreCustomfieldMoveField) | **POST** /core_customfield_move_field | Drag and drop |
| [**coreCustomfieldReloadTemplate()**](MoodleApi.md#coreCustomfieldReloadTemplate) | **POST** /core_customfield_reload_template | Reloads template |
| [**coreDynamicTabsGetContent()**](MoodleApi.md#coreDynamicTabsGetContent) | **POST** /core_dynamic_tabs_get_content | Returns the content for a dynamic tab |
| [**coreEnrolGetCourseEnrolmentMethods()**](MoodleApi.md#coreEnrolGetCourseEnrolmentMethods) | **POST** /core_enrol_get_course_enrolment_methods | Get the list of course enrolment methods |
| [**coreEnrolGetEnrolledUsers()**](MoodleApi.md#coreEnrolGetEnrolledUsers) | **POST** /core_enrol_get_enrolled_users | Get enrolled users by course id. |
| [**coreEnrolGetEnrolledUsersWithCapability()**](MoodleApi.md#coreEnrolGetEnrolledUsersWithCapability) | **POST** /core_enrol_get_enrolled_users_with_capability | For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability |
| [**coreEnrolGetPotentialUsers()**](MoodleApi.md#coreEnrolGetPotentialUsers) | **POST** /core_enrol_get_potential_users | Get the list of potential users to enrol |
| [**coreEnrolGetUsersCourses()**](MoodleApi.md#coreEnrolGetUsersCourses) | **POST** /core_enrol_get_users_courses | Get the list of courses where a user is enrolled in |
| [**coreEnrolSearchUsers()**](MoodleApi.md#coreEnrolSearchUsers) | **POST** /core_enrol_search_users | Search within the list of course participants |
| [**coreEnrolSubmitUserEnrolmentForm()**](MoodleApi.md#coreEnrolSubmitUserEnrolmentForm) | **POST** /core_enrol_submit_user_enrolment_form | Submit form data for enrolment form |
| [**coreEnrolUnenrolUserEnrolment()**](MoodleApi.md#coreEnrolUnenrolUserEnrolment) | **POST** /core_enrol_unenrol_user_enrolment | External function that unenrols a given user enrolment |
| [**coreFetchNotifications()**](MoodleApi.md#coreFetchNotifications) | **POST** /core_fetch_notifications | Return a list of notifications for the current session |
| [**coreFilesDeleteDraftFiles()**](MoodleApi.md#coreFilesDeleteDraftFiles) | **POST** /core_files_delete_draft_files | Delete the indicated files (or directories) from a user draft file area. |
| [**coreFilesGetFiles()**](MoodleApi.md#coreFilesGetFiles) | **POST** /core_files_get_files | browse moodle files |
| [**coreFilesGetUnusedDraftItemid()**](MoodleApi.md#coreFilesGetUnusedDraftItemid) | **POST** /core_files_get_unused_draft_itemid | Generate a new draft itemid for the current user. |
| [**coreFilesUpload()**](MoodleApi.md#coreFilesUpload) | **POST** /core_files_upload | upload a file to moodle |
| [**coreFiltersGetAvailableInContext()**](MoodleApi.md#coreFiltersGetAvailableInContext) | **POST** /core_filters_get_available_in_context | Returns the filters available in the given contexts. |
| [**coreFormDynamicForm()**](MoodleApi.md#coreFormDynamicForm) | **POST** /core_form_dynamic_form | Process submission of a dynamic (modal) form |
| [**coreFormGetFiletypesBrowserData()**](MoodleApi.md#coreFormGetFiletypesBrowserData) | **POST** /core_form_get_filetypes_browser_data | Provides data for the filetypes element browser. |
| [**coreGetComponentStrings()**](MoodleApi.md#coreGetComponentStrings) | **POST** /core_get_component_strings | Return all raw strings (with {$a-&gt;xxx}), for a specific component - similar to core get_component_strings(), call |
| [**coreGetFragment()**](MoodleApi.md#coreGetFragment) | **POST** /core_get_fragment | Return a fragment for inclusion, such as a JavaScript page. |
| [**coreGetString()**](MoodleApi.md#coreGetString) | **POST** /core_get_string | Return a translated string - similar to core get_string(), call |
| [**coreGetStrings()**](MoodleApi.md#coreGetStrings) | **POST** /core_get_strings | Return some translated strings - like several core get_string(), calls |
| [**coreGetUserDates()**](MoodleApi.md#coreGetUserDates) | **POST** /core_get_user_dates | Return formatted timestamps |
| [**coreGradesCreateGradecategories()**](MoodleApi.md#coreGradesCreateGradecategories) | **POST** /core_grades_create_gradecategories | Create grade categories inside a course gradebook. |
| [**coreGradesGetEnrolledUsersForSearchWidget()**](MoodleApi.md#coreGradesGetEnrolledUsersForSearchWidget) | **POST** /core_grades_get_enrolled_users_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects. |
| [**coreGradesGetEnrolledUsersForSelector()**](MoodleApi.md#coreGradesGetEnrolledUsersForSelector) | **POST** /core_grades_get_enrolled_users_for_selector | Returns the enrolled users within and map some fields to the returned array of user objects. |
| [**coreGradesGetFeedback()**](MoodleApi.md#coreGradesGetFeedback) | **POST** /core_grades_get_feedback | Get the feedback data for a grade item |
| [**coreGradesGetGradableUsers()**](MoodleApi.md#coreGradesGetGradableUsers) | **POST** /core_grades_get_gradable_users | Returns the gradable users in a course |
| [**coreGradesGetGradeTree()**](MoodleApi.md#coreGradesGetGradeTree) | **POST** /core_grades_get_grade_tree | Get the grade tree structure for a course |
| [**coreGradesGetGradeitems()**](MoodleApi.md#coreGradesGetGradeitems) | **POST** /core_grades_get_gradeitems | Get the gradeitems for a course |
| [**coreGradesGetGroupsForSearchWidget()**](MoodleApi.md#coreGradesGetGroupsForSearchWidget) | **POST** /core_grades_get_groups_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course |
| [**coreGradesGetGroupsForSelector()**](MoodleApi.md#coreGradesGetGroupsForSelector) | **POST** /core_grades_get_groups_for_selector | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course |
| [**coreGradesGraderGradingpanelPointFetch()**](MoodleApi.md#coreGradesGraderGradingpanelPointFetch) | **POST** /core_grades_grader_gradingpanel_point_fetch | Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required |
| [**coreGradesGraderGradingpanelPointStore()**](MoodleApi.md#coreGradesGraderGradingpanelPointStore) | **POST** /core_grades_grader_gradingpanel_point_store | Store the data required to display the grader grading panel for simple grading |
| [**coreGradesGraderGradingpanelScaleFetch()**](MoodleApi.md#coreGradesGraderGradingpanelScaleFetch) | **POST** /core_grades_grader_gradingpanel_scale_fetch | Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required |
| [**coreGradesGraderGradingpanelScaleStore()**](MoodleApi.md#coreGradesGraderGradingpanelScaleStore) | **POST** /core_grades_grader_gradingpanel_scale_store | Store the data required to display the grader grading panel for scale-based grading |
| [**coreGradesUpdateGrades()**](MoodleApi.md#coreGradesUpdateGrades) | **POST** /core_grades_update_grades | Update a grade item and associated student grades. |
| [**coreGradingGetDefinitions()**](MoodleApi.md#coreGradingGetDefinitions) | **POST** /core_grading_get_definitions | Get grading definitions |
| [**coreGradingGetGradingformInstances()**](MoodleApi.md#coreGradingGetGradingformInstances) | **POST** /core_grading_get_gradingform_instances | Get grading form instances |
| [**coreGradingSaveDefinitions()**](MoodleApi.md#coreGradingSaveDefinitions) | **POST** /core_grading_save_definitions | Save grading definitions |
| [**coreGroupAddGroupMembers()**](MoodleApi.md#coreGroupAddGroupMembers) | **POST** /core_group_add_group_members | Adds group members. |
| [**coreGroupAssignGrouping()**](MoodleApi.md#coreGroupAssignGrouping) | **POST** /core_group_assign_grouping | Assing groups from groupings |
| [**coreGroupCreateGroupings()**](MoodleApi.md#coreGroupCreateGroupings) | **POST** /core_group_create_groupings | Creates new groupings |
| [**coreGroupCreateGroups()**](MoodleApi.md#coreGroupCreateGroups) | **POST** /core_group_create_groups | Creates new groups. |
| [**coreGroupDeleteGroupMembers()**](MoodleApi.md#coreGroupDeleteGroupMembers) | **POST** /core_group_delete_group_members | Deletes group members. |
| [**coreGroupDeleteGroupings()**](MoodleApi.md#coreGroupDeleteGroupings) | **POST** /core_group_delete_groupings | Deletes all specified groupings. |
| [**coreGroupDeleteGroups()**](MoodleApi.md#coreGroupDeleteGroups) | **POST** /core_group_delete_groups | Deletes all specified groups. |
| [**coreGroupGetActivityAllowedGroups()**](MoodleApi.md#coreGroupGetActivityAllowedGroups) | **POST** /core_group_get_activity_allowed_groups | Gets a list of groups that the user is allowed to access within the specified activity. |
| [**coreGroupGetActivityGroupmode()**](MoodleApi.md#coreGroupGetActivityGroupmode) | **POST** /core_group_get_activity_groupmode | Returns effective groupmode used in a given activity. |
| [**coreGroupGetCourseGroupings()**](MoodleApi.md#coreGroupGetCourseGroupings) | **POST** /core_group_get_course_groupings | Returns all groupings in specified course. |
| [**coreGroupGetCourseGroups()**](MoodleApi.md#coreGroupGetCourseGroups) | **POST** /core_group_get_course_groups | Returns all groups in specified course. |
| [**coreGroupGetCourseUserGroups()**](MoodleApi.md#coreGroupGetCourseUserGroups) | **POST** /core_group_get_course_user_groups | Returns all groups in specified course for the specified user. |
| [**coreGroupGetGroupMembers()**](MoodleApi.md#coreGroupGetGroupMembers) | **POST** /core_group_get_group_members | Returns group members. |
| [**coreGroupGetGroupings()**](MoodleApi.md#coreGroupGetGroupings) | **POST** /core_group_get_groupings | Returns groupings details. |
| [**coreGroupGetGroups()**](MoodleApi.md#coreGroupGetGroups) | **POST** /core_group_get_groups | Returns group details. |
| [**coreGroupGetGroupsForSelector()**](MoodleApi.md#coreGroupGetGroupsForSelector) | **POST** /core_group_get_groups_for_selector | Get the group/(s) for a course |
| [**coreGroupUnassignGrouping()**](MoodleApi.md#coreGroupUnassignGrouping) | **POST** /core_group_unassign_grouping | Unassing groups from groupings |
| [**coreGroupUpdateGroupings()**](MoodleApi.md#coreGroupUpdateGroupings) | **POST** /core_group_update_groupings | Updates existing groupings |
| [**coreGroupUpdateGroups()**](MoodleApi.md#coreGroupUpdateGroups) | **POST** /core_group_update_groups | Updates existing groups. |
| [**coreH5pGetTrustedH5pFile()**](MoodleApi.md#coreH5pGetTrustedH5pFile) | **POST** /core_h5p_get_trusted_h5p_file | Get the H5P file cleaned for Mobile App. |
| [**coreMessageBlockUser()**](MoodleApi.md#coreMessageBlockUser) | **POST** /core_message_block_user | Blocks a user |
| [**coreMessageConfirmContactRequest()**](MoodleApi.md#coreMessageConfirmContactRequest) | **POST** /core_message_confirm_contact_request | Confirms a contact request |
| [**coreMessageCreateContactRequest()**](MoodleApi.md#coreMessageCreateContactRequest) | **POST** /core_message_create_contact_request | Creates a contact request |
| [**coreMessageDataForMessageareaSearchMessages()**](MoodleApi.md#coreMessageDataForMessageareaSearchMessages) | **POST** /core_message_data_for_messagearea_search_messages | Retrieve the template data for searching for messages |
| [**coreMessageDeclineContactRequest()**](MoodleApi.md#coreMessageDeclineContactRequest) | **POST** /core_message_decline_contact_request | Declines a contact request |
| [**coreMessageDeleteContacts()**](MoodleApi.md#coreMessageDeleteContacts) | **POST** /core_message_delete_contacts | Remove contacts from the contact list |
| [**coreMessageDeleteConversationsById()**](MoodleApi.md#coreMessageDeleteConversationsById) | **POST** /core_message_delete_conversations_by_id | Deletes a list of conversations. |
| [**coreMessageDeleteMessage()**](MoodleApi.md#coreMessageDeleteMessage) | **POST** /core_message_delete_message | Deletes a message. |
| [**coreMessageDeleteMessageForAllUsers()**](MoodleApi.md#coreMessageDeleteMessageForAllUsers) | **POST** /core_message_delete_message_for_all_users | Deletes a message for all users. |
| [**coreMessageGetBlockedUsers()**](MoodleApi.md#coreMessageGetBlockedUsers) | **POST** /core_message_get_blocked_users | Retrieve a list of users blocked |
| [**coreMessageGetContactRequests()**](MoodleApi.md#coreMessageGetContactRequests) | **POST** /core_message_get_contact_requests | Returns contact requests for a user |
| [**coreMessageGetConversation()**](MoodleApi.md#coreMessageGetConversation) | **POST** /core_message_get_conversation | Retrieve a conversation for a user |
| [**coreMessageGetConversationBetweenUsers()**](MoodleApi.md#coreMessageGetConversationBetweenUsers) | **POST** /core_message_get_conversation_between_users | Retrieve a conversation for a user between another user |
| [**coreMessageGetConversationCounts()**](MoodleApi.md#coreMessageGetConversationCounts) | **POST** /core_message_get_conversation_counts | Retrieve a list of conversation counts, indexed by type. |
| [**coreMessageGetConversationMembers()**](MoodleApi.md#coreMessageGetConversationMembers) | **POST** /core_message_get_conversation_members | Retrieve a list of members in a conversation |
| [**coreMessageGetConversationMessages()**](MoodleApi.md#coreMessageGetConversationMessages) | **POST** /core_message_get_conversation_messages | Retrieve the conversation messages and relevant member information |
| [**coreMessageGetConversations()**](MoodleApi.md#coreMessageGetConversations) | **POST** /core_message_get_conversations | Retrieve a list of conversations for a user |
| [**coreMessageGetMemberInfo()**](MoodleApi.md#coreMessageGetMemberInfo) | **POST** /core_message_get_member_info | Retrieve a user message profiles |
| [**coreMessageGetMessageProcessor()**](MoodleApi.md#coreMessageGetMessageProcessor) | **POST** /core_message_get_message_processor | Get a message processor |
| [**coreMessageGetMessages()**](MoodleApi.md#coreMessageGetMessages) | **POST** /core_message_get_messages | Retrieve a list of messages sent and received by a user (conversations, notifications or both) |
| [**coreMessageGetReceivedContactRequestsCount()**](MoodleApi.md#coreMessageGetReceivedContactRequestsCount) | **POST** /core_message_get_received_contact_requests_count | Gets the number of received contact requests |
| [**coreMessageGetSelfConversation()**](MoodleApi.md#coreMessageGetSelfConversation) | **POST** /core_message_get_self_conversation | Retrieve a self-conversation for a user |
| [**coreMessageGetUnreadConversationCounts()**](MoodleApi.md#coreMessageGetUnreadConversationCounts) | **POST** /core_message_get_unread_conversation_counts | Retrieve a list of unread conversation counts, indexed by type. |
| [**coreMessageGetUnreadConversationsCount()**](MoodleApi.md#coreMessageGetUnreadConversationsCount) | **POST** /core_message_get_unread_conversations_count | Retrieve the count of unread conversations for a given user |
| [**coreMessageGetUnreadNotificationCount()**](MoodleApi.md#coreMessageGetUnreadNotificationCount) | **POST** /core_message_get_unread_notification_count | Get number of unread notifications. |
| [**coreMessageGetUserContacts()**](MoodleApi.md#coreMessageGetUserContacts) | **POST** /core_message_get_user_contacts | Retrieve the contact list |
| [**coreMessageGetUserMessagePreferences()**](MoodleApi.md#coreMessageGetUserMessagePreferences) | **POST** /core_message_get_user_message_preferences | Get the message preferences for a given user. |
| [**coreMessageGetUserNotificationPreferences()**](MoodleApi.md#coreMessageGetUserNotificationPreferences) | **POST** /core_message_get_user_notification_preferences | Get the notification preferences for a given user. |
| [**coreMessageMarkAllConversationMessagesAsRead()**](MoodleApi.md#coreMessageMarkAllConversationMessagesAsRead) | **POST** /core_message_mark_all_conversation_messages_as_read | Mark all conversation messages as read for a given user |
| [**coreMessageMarkAllNotificationsAsRead()**](MoodleApi.md#coreMessageMarkAllNotificationsAsRead) | **POST** /core_message_mark_all_notifications_as_read | Mark all notifications as read for a given user |
| [**coreMessageMarkMessageRead()**](MoodleApi.md#coreMessageMarkMessageRead) | **POST** /core_message_mark_message_read | Mark a single message as read, trigger message_viewed event. |
| [**coreMessageMarkNotificationRead()**](MoodleApi.md#coreMessageMarkNotificationRead) | **POST** /core_message_mark_notification_read | Mark a single notification as read, trigger notification_viewed event. |
| [**coreMessageMessageProcessorConfigForm()**](MoodleApi.md#coreMessageMessageProcessorConfigForm) | **POST** /core_message_message_processor_config_form | Process the message processor config form |
| [**coreMessageMessageSearchUsers()**](MoodleApi.md#coreMessageMessageSearchUsers) | **POST** /core_message_message_search_users | Retrieve the data for searching for people |
| [**coreMessageMuteConversations()**](MoodleApi.md#coreMessageMuteConversations) | **POST** /core_message_mute_conversations | Mutes a list of conversations |
| [**coreMessageSearchContacts()**](MoodleApi.md#coreMessageSearchContacts) | **POST** /core_message_search_contacts | Search for contacts |
| [**coreMessageSendInstantMessages()**](MoodleApi.md#coreMessageSendInstantMessages) | **POST** /core_message_send_instant_messages | Send instant messages |
| [**coreMessageSendMessagesToConversation()**](MoodleApi.md#coreMessageSendMessagesToConversation) | **POST** /core_message_send_messages_to_conversation | Send messages to an existing conversation between users |
| [**coreMessageSetFavouriteConversations()**](MoodleApi.md#coreMessageSetFavouriteConversations) | **POST** /core_message_set_favourite_conversations | Mark a conversation or group of conversations as favourites/starred conversations. |
| [**coreMessageUnblockUser()**](MoodleApi.md#coreMessageUnblockUser) | **POST** /core_message_unblock_user | Unblocks a user |
| [**coreMessageUnmuteConversations()**](MoodleApi.md#coreMessageUnmuteConversations) | **POST** /core_message_unmute_conversations | Unmutes a list of conversations |
| [**coreMessageUnsetFavouriteConversations()**](MoodleApi.md#coreMessageUnsetFavouriteConversations) | **POST** /core_message_unset_favourite_conversations | Unset a conversation or group of conversations as favourites/starred conversations. |
| [**coreMoodlenetAuthCheck()**](MoodleApi.md#coreMoodlenetAuthCheck) | **POST** /core_moodlenet_auth_check | Check a user has authorized for a given MoodleNet site |
| [**coreMoodlenetGetShareInfoActivity()**](MoodleApi.md#coreMoodlenetGetShareInfoActivity) | **POST** /core_moodlenet_get_share_info_activity | Get information about an activity being shared |
| [**coreMoodlenetGetSharedCourseInfo()**](MoodleApi.md#coreMoodlenetGetSharedCourseInfo) | **POST** /core_moodlenet_get_shared_course_info | Get information about an course being shared |
| [**coreMoodlenetSendActivity()**](MoodleApi.md#coreMoodlenetSendActivity) | **POST** /core_moodlenet_send_activity | Send activity to MoodleNet |
| [**coreMoodlenetSendCourse()**](MoodleApi.md#coreMoodlenetSendCourse) | **POST** /core_moodlenet_send_course | Send course to MoodleNet |
| [**coreMyViewPage()**](MoodleApi.md#coreMyViewPage) | **POST** /core_my_view_page | Trigger the My or Dashboard viewed event. |
| [**coreNotesCreateNotes()**](MoodleApi.md#coreNotesCreateNotes) | **POST** /core_notes_create_notes | Create notes |
| [**coreNotesDeleteNotes()**](MoodleApi.md#coreNotesDeleteNotes) | **POST** /core_notes_delete_notes | Delete notes |
| [**coreNotesGetCourseNotes()**](MoodleApi.md#coreNotesGetCourseNotes) | **POST** /core_notes_get_course_notes | Returns all notes in specified course (or site), for the specified user. |
| [**coreNotesGetNotes()**](MoodleApi.md#coreNotesGetNotes) | **POST** /core_notes_get_notes | Get notes |
| [**coreNotesUpdateNotes()**](MoodleApi.md#coreNotesUpdateNotes) | **POST** /core_notes_update_notes | Update notes |
| [**coreNotesViewNotes()**](MoodleApi.md#coreNotesViewNotes) | **POST** /core_notes_view_notes | Simulates the web interface view of notes/index.php: trigger events. |
| [**coreOutputLoadFontawesomeIconMap()**](MoodleApi.md#coreOutputLoadFontawesomeIconMap) | **POST** /core_output_load_fontawesome_icon_map | Load the mapping of names to icons |
| [**coreOutputLoadFontawesomeIconSystemMap()**](MoodleApi.md#coreOutputLoadFontawesomeIconSystemMap) | **POST** /core_output_load_fontawesome_icon_system_map | Load the mapping of moodle pix names to fontawesome icon names |
| [**coreOutputLoadTemplate()**](MoodleApi.md#coreOutputLoadTemplate) | **POST** /core_output_load_template | Load a template for a renderable |
| [**coreOutputLoadTemplateWithDependencies()**](MoodleApi.md#coreOutputLoadTemplateWithDependencies) | **POST** /core_output_load_template_with_dependencies | Load a template and its dependencies for a renderable |
| [**corePaymentGetAvailableGateways()**](MoodleApi.md#corePaymentGetAvailableGateways) | **POST** /core_payment_get_available_gateways | Get the list of payment gateways that support the given component/area |
| [**coreQuestionGetRandomQuestionSummaries()**](MoodleApi.md#coreQuestionGetRandomQuestionSummaries) | **POST** /core_question_get_random_question_summaries | Get the random question set for a criteria |
| [**coreQuestionSubmitTagsForm()**](MoodleApi.md#coreQuestionSubmitTagsForm) | **POST** /core_question_submit_tags_form | Update the question tags. |
| [**coreQuestionUpdateFlag()**](MoodleApi.md#coreQuestionUpdateFlag) | **POST** /core_question_update_flag | Update the flag state of a question attempt. |
| [**coreRatingAddRating()**](MoodleApi.md#coreRatingAddRating) | **POST** /core_rating_add_rating | Rates an item. |
| [**coreRatingGetItemRatings()**](MoodleApi.md#coreRatingGetItemRatings) | **POST** /core_rating_get_item_ratings | Retrieve all the ratings for an item. |
| [**coreReportbuilderAudiencesDelete()**](MoodleApi.md#coreReportbuilderAudiencesDelete) | **POST** /core_reportbuilder_audiences_delete | Delete audience from report |
| [**coreReportbuilderCanViewSystemReport()**](MoodleApi.md#coreReportbuilderCanViewSystemReport) | **POST** /core_reportbuilder_can_view_system_report | Determine access to a system report |
| [**coreReportbuilderColumnsAdd()**](MoodleApi.md#coreReportbuilderColumnsAdd) | **POST** /core_reportbuilder_columns_add | Add column to report |
| [**coreReportbuilderColumnsDelete()**](MoodleApi.md#coreReportbuilderColumnsDelete) | **POST** /core_reportbuilder_columns_delete | Delete column from report |
| [**coreReportbuilderColumnsReorder()**](MoodleApi.md#coreReportbuilderColumnsReorder) | **POST** /core_reportbuilder_columns_reorder | Re-order column within report |
| [**coreReportbuilderColumnsSortGet()**](MoodleApi.md#coreReportbuilderColumnsSortGet) | **POST** /core_reportbuilder_columns_sort_get | Retrieve column sorting for report |
| [**coreReportbuilderColumnsSortReorder()**](MoodleApi.md#coreReportbuilderColumnsSortReorder) | **POST** /core_reportbuilder_columns_sort_reorder | Re-order column sorting within report |
| [**coreReportbuilderColumnsSortToggle()**](MoodleApi.md#coreReportbuilderColumnsSortToggle) | **POST** /core_reportbuilder_columns_sort_toggle | Toggle sorting of column within report |
| [**coreReportbuilderConditionsAdd()**](MoodleApi.md#coreReportbuilderConditionsAdd) | **POST** /core_reportbuilder_conditions_add | Add condition to report |
| [**coreReportbuilderConditionsDelete()**](MoodleApi.md#coreReportbuilderConditionsDelete) | **POST** /core_reportbuilder_conditions_delete | Delete condition from report |
| [**coreReportbuilderConditionsReorder()**](MoodleApi.md#coreReportbuilderConditionsReorder) | **POST** /core_reportbuilder_conditions_reorder | Re-order condition within report |
| [**coreReportbuilderConditionsReset()**](MoodleApi.md#coreReportbuilderConditionsReset) | **POST** /core_reportbuilder_conditions_reset | Reset conditions for given report |
| [**coreReportbuilderFiltersAdd()**](MoodleApi.md#coreReportbuilderFiltersAdd) | **POST** /core_reportbuilder_filters_add | Add filter to report |
| [**coreReportbuilderFiltersDelete()**](MoodleApi.md#coreReportbuilderFiltersDelete) | **POST** /core_reportbuilder_filters_delete | Delete filter from report |
| [**coreReportbuilderFiltersReorder()**](MoodleApi.md#coreReportbuilderFiltersReorder) | **POST** /core_reportbuilder_filters_reorder | Re-order filter within report |
| [**coreReportbuilderFiltersReset()**](MoodleApi.md#coreReportbuilderFiltersReset) | **POST** /core_reportbuilder_filters_reset | Reset filters for given report |
| [**coreReportbuilderListReports()**](MoodleApi.md#coreReportbuilderListReports) | **POST** /core_reportbuilder_list_reports | List custom reports for current user |
| [**coreReportbuilderReportsDelete()**](MoodleApi.md#coreReportbuilderReportsDelete) | **POST** /core_reportbuilder_reports_delete | Delete report |
| [**coreReportbuilderReportsGet()**](MoodleApi.md#coreReportbuilderReportsGet) | **POST** /core_reportbuilder_reports_get | Get custom report |
| [**coreReportbuilderRetrieveReport()**](MoodleApi.md#coreReportbuilderRetrieveReport) | **POST** /core_reportbuilder_retrieve_report | Retrieve custom report content |
| [**coreReportbuilderRetrieveSystemReport()**](MoodleApi.md#coreReportbuilderRetrieveSystemReport) | **POST** /core_reportbuilder_retrieve_system_report | Retrieve system report content |
| [**coreReportbuilderSchedulesDelete()**](MoodleApi.md#coreReportbuilderSchedulesDelete) | **POST** /core_reportbuilder_schedules_delete | Delete schedule from report |
| [**coreReportbuilderSchedulesSend()**](MoodleApi.md#coreReportbuilderSchedulesSend) | **POST** /core_reportbuilder_schedules_send | Send report schedule |
| [**coreReportbuilderSchedulesToggle()**](MoodleApi.md#coreReportbuilderSchedulesToggle) | **POST** /core_reportbuilder_schedules_toggle | Toggle state of report schedule |
| [**coreReportbuilderSetFilters()**](MoodleApi.md#coreReportbuilderSetFilters) | **POST** /core_reportbuilder_set_filters | Set filter values for given report |
| [**coreReportbuilderViewReport()**](MoodleApi.md#coreReportbuilderViewReport) | **POST** /core_reportbuilder_view_report | Trigger custom report viewed |
| [**coreRoleAssignRoles()**](MoodleApi.md#coreRoleAssignRoles) | **POST** /core_role_assign_roles | Manual role assignments. |
| [**coreRoleUnassignRoles()**](MoodleApi.md#coreRoleUnassignRoles) | **POST** /core_role_unassign_roles | Manual role unassignments. |
| [**coreSearchGetRelevantUsers()**](MoodleApi.md#coreSearchGetRelevantUsers) | **POST** /core_search_get_relevant_users | Gets relevant users for a search request. |
| [**coreSearchGetResults()**](MoodleApi.md#coreSearchGetResults) | **POST** /core_search_get_results | Get search results. |
| [**coreSearchGetSearchAreasList()**](MoodleApi.md#coreSearchGetSearchAreasList) | **POST** /core_search_get_search_areas_list | Get search areas. |
| [**coreSearchGetTopResults()**](MoodleApi.md#coreSearchGetTopResults) | **POST** /core_search_get_top_results | Get top search results. |
| [**coreSearchViewResults()**](MoodleApi.md#coreSearchViewResults) | **POST** /core_search_view_results | Trigger view search results event. |
| [**coreSessionTimeRemaining()**](MoodleApi.md#coreSessionTimeRemaining) | **POST** /core_session_time_remaining | Count the seconds remaining in this session |
| [**coreSessionTouch()**](MoodleApi.md#coreSessionTouch) | **POST** /core_session_touch | Keep the users session alive |
| [**coreTableGetDynamicTableContent()**](MoodleApi.md#coreTableGetDynamicTableContent) | **POST** /core_table_get_dynamic_table_content | Get the dynamic table content raw html |
| [**coreTagGetTagAreas()**](MoodleApi.md#coreTagGetTagAreas) | **POST** /core_tag_get_tag_areas | Retrieves existing tag areas. |
| [**coreTagGetTagCloud()**](MoodleApi.md#coreTagGetTagCloud) | **POST** /core_tag_get_tag_cloud | Retrieves a tag cloud for the given collection and/or query search. |
| [**coreTagGetTagCollections()**](MoodleApi.md#coreTagGetTagCollections) | **POST** /core_tag_get_tag_collections | Retrieves existing tag collections. |
| [**coreTagGetTagindex()**](MoodleApi.md#coreTagGetTagindex) | **POST** /core_tag_get_tagindex | Gets tag index page for one tag and one tag area |
| [**coreTagGetTagindexPerArea()**](MoodleApi.md#coreTagGetTagindexPerArea) | **POST** /core_tag_get_tagindex_per_area | Gets tag index page per different areas. |
| [**coreTagGetTags()**](MoodleApi.md#coreTagGetTags) | **POST** /core_tag_get_tags | Gets tags by their ids |
| [**coreTagUpdateTags()**](MoodleApi.md#coreTagUpdateTags) | **POST** /core_tag_update_tags | Updates tags |
| [**coreUpdateInplaceEditable()**](MoodleApi.md#coreUpdateInplaceEditable) | **POST** /core_update_inplace_editable | Generic service to update title |
| [**coreUserAddUserDevice()**](MoodleApi.md#coreUserAddUserDevice) | **POST** /core_user_add_user_device | Store mobile user devices information for PUSH Notifications. |
| [**coreUserAddUserPrivateFiles()**](MoodleApi.md#coreUserAddUserPrivateFiles) | **POST** /core_user_add_user_private_files | Copy files from a draft area to users private files area. |
| [**coreUserAgreeSitePolicy()**](MoodleApi.md#coreUserAgreeSitePolicy) | **POST** /core_user_agree_site_policy | Agree the site policy for the current user. |
| [**coreUserCreateUsers()**](MoodleApi.md#coreUserCreateUsers) | **POST** /core_user_create_users | Create users. |
| [**coreUserDeleteUsers()**](MoodleApi.md#coreUserDeleteUsers) | **POST** /core_user_delete_users | Delete users. |
| [**coreUserGetCourseUserProfiles()**](MoodleApi.md#coreUserGetCourseUserProfiles) | **POST** /core_user_get_course_user_profiles | Get course user profiles (each of the profils matching a course id and a user id),. |
| [**coreUserGetPrivateFilesInfo()**](MoodleApi.md#coreUserGetPrivateFilesInfo) | **POST** /core_user_get_private_files_info | Returns general information about files in the user private files area. |
| [**coreUserGetUserPreferences()**](MoodleApi.md#coreUserGetUserPreferences) | **POST** /core_user_get_user_preferences | Return user preferences. |
| [**coreUserGetUsers()**](MoodleApi.md#coreUserGetUsers) | **POST** /core_user_get_users | search for users matching the parameters |
| [**coreUserGetUsersByField()**](MoodleApi.md#coreUserGetUsersByField) | **POST** /core_user_get_users_by_field | Retrieve users&#39; information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity(). |
| [**coreUserRemoveUserDevice()**](MoodleApi.md#coreUserRemoveUserDevice) | **POST** /core_user_remove_user_device | Remove a user device from the Moodle database. |
| [**coreUserSearchIdentity()**](MoodleApi.md#coreUserSearchIdentity) | **POST** /core_user_search_identity | Return list of users identities matching the given criteria in their name or other identity fields. |
| [**coreUserSetUserPreferences()**](MoodleApi.md#coreUserSetUserPreferences) | **POST** /core_user_set_user_preferences | Set user preferences. |
| [**coreUserUpdatePicture()**](MoodleApi.md#coreUserUpdatePicture) | **POST** /core_user_update_picture | Update or delete the user picture in the site |
| [**coreUserUpdateUserDevicePublicKey()**](MoodleApi.md#coreUserUpdateUserDevicePublicKey) | **POST** /core_user_update_user_device_public_key | Store mobile user public key. |
| [**coreUserUpdateUserPreferences()**](MoodleApi.md#coreUserUpdateUserPreferences) | **POST** /core_user_update_user_preferences | Update a user&#39;s preferences |
| [**coreUserUpdateUsers()**](MoodleApi.md#coreUserUpdateUsers) | **POST** /core_user_update_users | Update users. |
| [**coreUserViewUserList()**](MoodleApi.md#coreUserViewUserList) | **POST** /core_user_view_user_list | Simulates the web-interface view of user/index.php (triggering events),. |
| [**coreUserViewUserProfile()**](MoodleApi.md#coreUserViewUserProfile) | **POST** /core_user_view_user_profile | Simulates the web-interface view of user/view.php and user/profile.php (triggering events),. |
| [**coreWebserviceGetSiteInfo()**](MoodleApi.md#coreWebserviceGetSiteInfo) | **POST** /core_webservice_get_site_info | Return some site info / user info / list web service functions |
| [**coreXapiDeleteState()**](MoodleApi.md#coreXapiDeleteState) | **POST** /core_xapi_delete_state | Delete an xAPI state data from an activityId. |
| [**coreXapiDeleteStates()**](MoodleApi.md#coreXapiDeleteStates) | **POST** /core_xapi_delete_states | Delete all xAPI state data from an activityId. |
| [**coreXapiGetState()**](MoodleApi.md#coreXapiGetState) | **POST** /core_xapi_get_state | Get an xAPI state data from an activityId. |
| [**coreXapiGetStates()**](MoodleApi.md#coreXapiGetStates) | **POST** /core_xapi_get_states | Get all state ID from an activityId. |
| [**coreXapiPostState()**](MoodleApi.md#coreXapiPostState) | **POST** /core_xapi_post_state | Post an xAPI state into an activityId. |
| [**coreXapiStatementPost()**](MoodleApi.md#coreXapiStatementPost) | **POST** /core_xapi_statement_post | Post an xAPI statement. |


## `coreAdminSetBlockProtection()`

```php
coreAdminSetBlockProtection($core_admin_set_block_protection_request): object
```

Set the protection state for a block plugin

Set the protection state for a block plugin

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_admin_set_block_protection_request = new \OpenAPI\Client\Model\CoreAdminSetBlockProtectionRequest(); // \OpenAPI\Client\Model\CoreAdminSetBlockProtectionRequest

try {
    $result = $apiInstance->coreAdminSetBlockProtection($core_admin_set_block_protection_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAdminSetBlockProtection: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_admin_set_block_protection_request** | [**\OpenAPI\Client\Model\CoreAdminSetBlockProtectionRequest**](../Model/CoreAdminSetBlockProtectionRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAdminSetPluginOrder()`

```php
coreAdminSetPluginOrder($core_admin_set_plugin_order_request): object
```

Set the order of a plugin

Set the order of a plugin

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_admin_set_plugin_order_request = new \OpenAPI\Client\Model\CoreAdminSetPluginOrderRequest(); // \OpenAPI\Client\Model\CoreAdminSetPluginOrderRequest

try {
    $result = $apiInstance->coreAdminSetPluginOrder($core_admin_set_plugin_order_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAdminSetPluginOrder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_admin_set_plugin_order_request** | [**\OpenAPI\Client\Model\CoreAdminSetPluginOrderRequest**](../Model/CoreAdminSetPluginOrderRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAdminSetPluginState()`

```php
coreAdminSetPluginState($core_admin_set_plugin_state_request): object
```

Set the state of a plugin

Set the state of a plugin

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_admin_set_plugin_state_request = new \OpenAPI\Client\Model\CoreAdminSetPluginStateRequest(); // \OpenAPI\Client\Model\CoreAdminSetPluginStateRequest

try {
    $result = $apiInstance->coreAdminSetPluginState($core_admin_set_plugin_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAdminSetPluginState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_admin_set_plugin_state_request** | [**\OpenAPI\Client\Model\CoreAdminSetPluginStateRequest**](../Model/CoreAdminSetPluginStateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAuthConfirmUser()`

```php
coreAuthConfirmUser($core_auth_confirm_user_request): \OpenAPI\Client\Model\CoreAuthConfirmUser200Response
```

Confirm a user account.

Confirm a user account.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_auth_confirm_user_request = new \OpenAPI\Client\Model\CoreAuthConfirmUserRequest(); // \OpenAPI\Client\Model\CoreAuthConfirmUserRequest

try {
    $result = $apiInstance->coreAuthConfirmUser($core_auth_confirm_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAuthConfirmUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_auth_confirm_user_request** | [**\OpenAPI\Client\Model\CoreAuthConfirmUserRequest**](../Model/CoreAuthConfirmUserRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreAuthConfirmUser200Response**](../Model/CoreAuthConfirmUser200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAuthIsAgeDigitalConsentVerificationEnabled()`

```php
coreAuthIsAgeDigitalConsentVerificationEnabled(): \OpenAPI\Client\Model\CoreAuthIsAgeDigitalConsentVerificationEnabled200Response
```

Checks if age digital consent verification is enabled.

Checks if age digital consent verification is enabled.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreAuthIsAgeDigitalConsentVerificationEnabled();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAuthIsAgeDigitalConsentVerificationEnabled: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreAuthIsAgeDigitalConsentVerificationEnabled200Response**](../Model/CoreAuthIsAgeDigitalConsentVerificationEnabled200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAuthIsMinor()`

```php
coreAuthIsMinor($core_auth_is_minor_request): \OpenAPI\Client\Model\CoreAuthIsMinor200Response
```

Requests a check if a user is a digital minor.

Requests a check if a user is a digital minor.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_auth_is_minor_request = new \OpenAPI\Client\Model\CoreAuthIsMinorRequest(); // \OpenAPI\Client\Model\CoreAuthIsMinorRequest

try {
    $result = $apiInstance->coreAuthIsMinor($core_auth_is_minor_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAuthIsMinor: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_auth_is_minor_request** | [**\OpenAPI\Client\Model\CoreAuthIsMinorRequest**](../Model/CoreAuthIsMinorRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreAuthIsMinor200Response**](../Model/CoreAuthIsMinor200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAuthRequestPasswordReset()`

```php
coreAuthRequestPasswordReset($core_auth_request_password_reset_request): \OpenAPI\Client\Model\CoreAuthRequestPasswordReset200Response
```

Requests a password reset.

Requests a password reset.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_auth_request_password_reset_request = new \OpenAPI\Client\Model\CoreAuthRequestPasswordResetRequest(); // \OpenAPI\Client\Model\CoreAuthRequestPasswordResetRequest

try {
    $result = $apiInstance->coreAuthRequestPasswordReset($core_auth_request_password_reset_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAuthRequestPasswordReset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_auth_request_password_reset_request** | [**\OpenAPI\Client\Model\CoreAuthRequestPasswordResetRequest**](../Model/CoreAuthRequestPasswordResetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreAuthRequestPasswordReset200Response**](../Model/CoreAuthRequestPasswordReset200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreAuthResendConfirmationEmail()`

```php
coreAuthResendConfirmationEmail($core_auth_resend_confirmation_email_request): \OpenAPI\Client\Model\CoreAuthResendConfirmationEmail200Response
```

Resend confirmation email.

Resend confirmation email.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_auth_resend_confirmation_email_request = new \OpenAPI\Client\Model\CoreAuthResendConfirmationEmailRequest(); // \OpenAPI\Client\Model\CoreAuthResendConfirmationEmailRequest

try {
    $result = $apiInstance->coreAuthResendConfirmationEmail($core_auth_resend_confirmation_email_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreAuthResendConfirmationEmail: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_auth_resend_confirmation_email_request** | [**\OpenAPI\Client\Model\CoreAuthResendConfirmationEmailRequest**](../Model/CoreAuthResendConfirmationEmailRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreAuthResendConfirmationEmail200Response**](../Model/CoreAuthResendConfirmationEmail200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBackupGetAsyncBackupLinksBackup()`

```php
coreBackupGetAsyncBackupLinksBackup($core_backup_get_async_backup_links_backup_request): \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksBackup200Response
```

Gets the data to use when updating the status table row in the UI for when an async backup completes.

Gets the data to use when updating the status table row in the UI for when an async backup completes.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_backup_get_async_backup_links_backup_request = new \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksBackupRequest(); // \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksBackupRequest

try {
    $result = $apiInstance->coreBackupGetAsyncBackupLinksBackup($core_backup_get_async_backup_links_backup_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBackupGetAsyncBackupLinksBackup: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_backup_get_async_backup_links_backup_request** | [**\OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksBackupRequest**](../Model/CoreBackupGetAsyncBackupLinksBackupRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksBackup200Response**](../Model/CoreBackupGetAsyncBackupLinksBackup200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBackupGetAsyncBackupLinksRestore()`

```php
coreBackupGetAsyncBackupLinksRestore($core_backup_get_async_backup_links_restore_request): \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksRestore200Response
```

Gets the data to use when updating the status table row in the UI for when an async restore completes.

Gets the data to use when updating the status table row in the UI for when an async restore completes.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_backup_get_async_backup_links_restore_request = new \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksRestoreRequest(); // \OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksRestoreRequest

try {
    $result = $apiInstance->coreBackupGetAsyncBackupLinksRestore($core_backup_get_async_backup_links_restore_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBackupGetAsyncBackupLinksRestore: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_backup_get_async_backup_links_restore_request** | [**\OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksRestoreRequest**](../Model/CoreBackupGetAsyncBackupLinksRestoreRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBackupGetAsyncBackupLinksRestore200Response**](../Model/CoreBackupGetAsyncBackupLinksRestore200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBackupGetAsyncBackupProgress()`

```php
coreBackupGetAsyncBackupProgress($core_backup_get_async_backup_progress_request): object
```

Get the progress of an Asyncronhous backup.

Get the progress of an Asyncronhous backup.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_backup_get_async_backup_progress_request = new \OpenAPI\Client\Model\CoreBackupGetAsyncBackupProgressRequest(); // \OpenAPI\Client\Model\CoreBackupGetAsyncBackupProgressRequest

try {
    $result = $apiInstance->coreBackupGetAsyncBackupProgress($core_backup_get_async_backup_progress_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBackupGetAsyncBackupProgress: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_backup_get_async_backup_progress_request** | [**\OpenAPI\Client\Model\CoreBackupGetAsyncBackupProgressRequest**](../Model/CoreBackupGetAsyncBackupProgressRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBackupGetCopyProgress()`

```php
coreBackupGetCopyProgress($core_backup_get_copy_progress_request): object
```

Gets the progress of course copy operations.

Gets the progress of course copy operations.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_backup_get_copy_progress_request = new \OpenAPI\Client\Model\CoreBackupGetCopyProgressRequest(); // \OpenAPI\Client\Model\CoreBackupGetCopyProgressRequest

try {
    $result = $apiInstance->coreBackupGetCopyProgress($core_backup_get_copy_progress_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBackupGetCopyProgress: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_backup_get_copy_progress_request** | [**\OpenAPI\Client\Model\CoreBackupGetCopyProgressRequest**](../Model/CoreBackupGetCopyProgressRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBackupSubmitCopyForm()`

```php
coreBackupSubmitCopyForm($core_backup_submit_copy_form_request): object
```

Handles ajax submission of course copy form.

Handles ajax submission of course copy form.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_backup_submit_copy_form_request = new \OpenAPI\Client\Model\CoreBackupSubmitCopyFormRequest(); // \OpenAPI\Client\Model\CoreBackupSubmitCopyFormRequest

try {
    $result = $apiInstance->coreBackupSubmitCopyForm($core_backup_submit_copy_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBackupSubmitCopyForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_backup_submit_copy_form_request** | [**\OpenAPI\Client\Model\CoreBackupSubmitCopyFormRequest**](../Model/CoreBackupSubmitCopyFormRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBadgesGetUserBadgeByHash()`

```php
coreBadgesGetUserBadgeByHash($core_badges_get_user_badge_by_hash_request): \OpenAPI\Client\Model\CoreBadgesGetUserBadgeByHash200Response
```

Returns the badge awarded to a user by hash.

Returns the badge awarded to a user by hash.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_badges_get_user_badge_by_hash_request = new \OpenAPI\Client\Model\CoreBadgesGetUserBadgeByHashRequest(); // \OpenAPI\Client\Model\CoreBadgesGetUserBadgeByHashRequest

try {
    $result = $apiInstance->coreBadgesGetUserBadgeByHash($core_badges_get_user_badge_by_hash_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBadgesGetUserBadgeByHash: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_badges_get_user_badge_by_hash_request** | [**\OpenAPI\Client\Model\CoreBadgesGetUserBadgeByHashRequest**](../Model/CoreBadgesGetUserBadgeByHashRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBadgesGetUserBadgeByHash200Response**](../Model/CoreBadgesGetUserBadgeByHash200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBadgesGetUserBadges()`

```php
coreBadgesGetUserBadges($core_badges_get_user_badges_request): \OpenAPI\Client\Model\CoreBadgesGetUserBadges200Response
```

Returns the list of badges awarded to a user.

Returns the list of badges awarded to a user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_badges_get_user_badges_request = new \OpenAPI\Client\Model\CoreBadgesGetUserBadgesRequest(); // \OpenAPI\Client\Model\CoreBadgesGetUserBadgesRequest

try {
    $result = $apiInstance->coreBadgesGetUserBadges($core_badges_get_user_badges_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBadgesGetUserBadges: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_badges_get_user_badges_request** | [**\OpenAPI\Client\Model\CoreBadgesGetUserBadgesRequest**](../Model/CoreBadgesGetUserBadgesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBadgesGetUserBadges200Response**](../Model/CoreBadgesGetUserBadges200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBlockFetchAddableBlocks()`

```php
coreBlockFetchAddableBlocks($core_block_fetch_addable_blocks_request): object
```

Returns all addable blocks in a given page.

Returns all addable blocks in a given page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_block_fetch_addable_blocks_request = new \OpenAPI\Client\Model\CoreBlockFetchAddableBlocksRequest(); // \OpenAPI\Client\Model\CoreBlockFetchAddableBlocksRequest

try {
    $result = $apiInstance->coreBlockFetchAddableBlocks($core_block_fetch_addable_blocks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBlockFetchAddableBlocks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_block_fetch_addable_blocks_request** | [**\OpenAPI\Client\Model\CoreBlockFetchAddableBlocksRequest**](../Model/CoreBlockFetchAddableBlocksRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBlockGetCourseBlocks()`

```php
coreBlockGetCourseBlocks($core_block_get_course_blocks_request): \OpenAPI\Client\Model\CoreBlockGetCourseBlocks200Response
```

Returns blocks information for a course.

Returns blocks information for a course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_block_get_course_blocks_request = new \OpenAPI\Client\Model\CoreBlockGetCourseBlocksRequest(); // \OpenAPI\Client\Model\CoreBlockGetCourseBlocksRequest

try {
    $result = $apiInstance->coreBlockGetCourseBlocks($core_block_get_course_blocks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBlockGetCourseBlocks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_block_get_course_blocks_request** | [**\OpenAPI\Client\Model\CoreBlockGetCourseBlocksRequest**](../Model/CoreBlockGetCourseBlocksRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBlockGetCourseBlocks200Response**](../Model/CoreBlockGetCourseBlocks200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBlockGetDashboardBlocks()`

```php
coreBlockGetDashboardBlocks($core_block_get_dashboard_blocks_request): \OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200Response
```

Returns blocks information for the given user dashboard.

Returns blocks information for the given user dashboard.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_block_get_dashboard_blocks_request = new \OpenAPI\Client\Model\CoreBlockGetDashboardBlocksRequest(); // \OpenAPI\Client\Model\CoreBlockGetDashboardBlocksRequest

try {
    $result = $apiInstance->coreBlockGetDashboardBlocks($core_block_get_dashboard_blocks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBlockGetDashboardBlocks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_block_get_dashboard_blocks_request** | [**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocksRequest**](../Model/CoreBlockGetDashboardBlocksRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBlockGetDashboardBlocks200Response**](../Model/CoreBlockGetDashboardBlocks200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBlogGetEntries()`

```php
coreBlogGetEntries($core_blog_get_entries_request): \OpenAPI\Client\Model\CoreBlogGetEntries200Response
```

Returns blog entries.

Returns blog entries.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_blog_get_entries_request = new \OpenAPI\Client\Model\CoreBlogGetEntriesRequest(); // \OpenAPI\Client\Model\CoreBlogGetEntriesRequest

try {
    $result = $apiInstance->coreBlogGetEntries($core_blog_get_entries_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBlogGetEntries: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_blog_get_entries_request** | [**\OpenAPI\Client\Model\CoreBlogGetEntriesRequest**](../Model/CoreBlogGetEntriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBlogGetEntries200Response**](../Model/CoreBlogGetEntries200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreBlogViewEntries()`

```php
coreBlogViewEntries($core_blog_view_entries_request): \OpenAPI\Client\Model\CoreBlogViewEntries200Response
```

Trigger the blog_entries_viewed event.

Trigger the blog_entries_viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_blog_view_entries_request = new \OpenAPI\Client\Model\CoreBlogViewEntriesRequest(); // \OpenAPI\Client\Model\CoreBlogViewEntriesRequest

try {
    $result = $apiInstance->coreBlogViewEntries($core_blog_view_entries_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreBlogViewEntries: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_blog_view_entries_request** | [**\OpenAPI\Client\Model\CoreBlogViewEntriesRequest**](../Model/CoreBlogViewEntriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreBlogViewEntries200Response**](../Model/CoreBlogViewEntries200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarCreateCalendarEvents()`

```php
coreCalendarCreateCalendarEvents($core_calendar_create_calendar_events_request): \OpenAPI\Client\Model\CoreCalendarCreateCalendarEvents200Response
```

Create calendar events

Create calendar events

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_create_calendar_events_request = new \OpenAPI\Client\Model\CoreCalendarCreateCalendarEventsRequest(); // \OpenAPI\Client\Model\CoreCalendarCreateCalendarEventsRequest

try {
    $result = $apiInstance->coreCalendarCreateCalendarEvents($core_calendar_create_calendar_events_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarCreateCalendarEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_create_calendar_events_request** | [**\OpenAPI\Client\Model\CoreCalendarCreateCalendarEventsRequest**](../Model/CoreCalendarCreateCalendarEventsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarCreateCalendarEvents200Response**](../Model/CoreCalendarCreateCalendarEvents200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarDeleteCalendarEvents()`

```php
coreCalendarDeleteCalendarEvents($core_calendar_delete_calendar_events_request): object
```

Delete calendar events

Delete calendar events

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_delete_calendar_events_request = new \OpenAPI\Client\Model\CoreCalendarDeleteCalendarEventsRequest(); // \OpenAPI\Client\Model\CoreCalendarDeleteCalendarEventsRequest

try {
    $result = $apiInstance->coreCalendarDeleteCalendarEvents($core_calendar_delete_calendar_events_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarDeleteCalendarEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_delete_calendar_events_request** | [**\OpenAPI\Client\Model\CoreCalendarDeleteCalendarEventsRequest**](../Model/CoreCalendarDeleteCalendarEventsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarDeleteSubscription()`

```php
coreCalendarDeleteSubscription($core_calendar_delete_subscription_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Delete the calendar subscription

Delete the calendar subscription

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_delete_subscription_request = new \OpenAPI\Client\Model\CoreCalendarDeleteSubscriptionRequest(); // \OpenAPI\Client\Model\CoreCalendarDeleteSubscriptionRequest

try {
    $result = $apiInstance->coreCalendarDeleteSubscription($core_calendar_delete_subscription_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarDeleteSubscription: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_delete_subscription_request** | [**\OpenAPI\Client\Model\CoreCalendarDeleteSubscriptionRequest**](../Model/CoreCalendarDeleteSubscriptionRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetActionEventsByCourse()`

```php
coreCalendarGetActionEventsByCourse($core_calendar_get_action_events_by_course_request): \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourse200Response
```

Get calendar action events by course

Get calendar action events by course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_action_events_by_course_request = new \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourseRequest(); // \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourseRequest

try {
    $result = $apiInstance->coreCalendarGetActionEventsByCourse($core_calendar_get_action_events_by_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetActionEventsByCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_action_events_by_course_request** | [**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourseRequest**](../Model/CoreCalendarGetActionEventsByCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourse200Response**](../Model/CoreCalendarGetActionEventsByCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetActionEventsByCourses()`

```php
coreCalendarGetActionEventsByCourses($core_calendar_get_action_events_by_courses_request): \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourses200Response
```

Get calendar action events by courses

Get calendar action events by courses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_action_events_by_courses_request = new \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCoursesRequest(); // \OpenAPI\Client\Model\CoreCalendarGetActionEventsByCoursesRequest

try {
    $result = $apiInstance->coreCalendarGetActionEventsByCourses($core_calendar_get_action_events_by_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetActionEventsByCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_action_events_by_courses_request** | [**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByCoursesRequest**](../Model/CoreCalendarGetActionEventsByCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByCourses200Response**](../Model/CoreCalendarGetActionEventsByCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetActionEventsByTimesort()`

```php
coreCalendarGetActionEventsByTimesort($core_calendar_get_action_events_by_timesort_request): \OpenAPI\Client\Model\CoreCalendarGetActionEventsByTimesort200Response
```

Get calendar action events by tiemsort

Get calendar action events by tiemsort

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_action_events_by_timesort_request = new \OpenAPI\Client\Model\CoreCalendarGetActionEventsByTimesortRequest(); // \OpenAPI\Client\Model\CoreCalendarGetActionEventsByTimesortRequest

try {
    $result = $apiInstance->coreCalendarGetActionEventsByTimesort($core_calendar_get_action_events_by_timesort_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetActionEventsByTimesort: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_action_events_by_timesort_request** | [**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByTimesortRequest**](../Model/CoreCalendarGetActionEventsByTimesortRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetActionEventsByTimesort200Response**](../Model/CoreCalendarGetActionEventsByTimesort200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetAllowedEventTypes()`

```php
coreCalendarGetAllowedEventTypes($core_calendar_get_allowed_event_types_request): \OpenAPI\Client\Model\CoreCalendarGetAllowedEventTypes200Response
```

Get the type of events a user can create in the given course.

Get the type of events a user can create in the given course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_allowed_event_types_request = new \OpenAPI\Client\Model\CoreCalendarGetAllowedEventTypesRequest(); // \OpenAPI\Client\Model\CoreCalendarGetAllowedEventTypesRequest

try {
    $result = $apiInstance->coreCalendarGetAllowedEventTypes($core_calendar_get_allowed_event_types_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetAllowedEventTypes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_allowed_event_types_request** | [**\OpenAPI\Client\Model\CoreCalendarGetAllowedEventTypesRequest**](../Model/CoreCalendarGetAllowedEventTypesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetAllowedEventTypes200Response**](../Model/CoreCalendarGetAllowedEventTypes200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarAccessInformation()`

```php
coreCalendarGetCalendarAccessInformation($core_calendar_get_calendar_access_information_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarAccessInformation200Response
```

Convenience function to retrieve some permissions/access information for the given course calendar.

Convenience function to retrieve some permissions/access information for the given course calendar.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_access_information_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarAccessInformationRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarAccessInformationRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarAccessInformation($core_calendar_get_calendar_access_information_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarAccessInformation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_access_information_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarAccessInformationRequest**](../Model/CoreCalendarGetCalendarAccessInformationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarAccessInformation200Response**](../Model/CoreCalendarGetCalendarAccessInformation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarDayView()`

```php
coreCalendarGetCalendarDayView($core_calendar_get_calendar_day_view_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200Response
```

Fetch the day view data for a calendar

Fetch the day view data for a calendar

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_day_view_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarDayViewRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarDayViewRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarDayView($core_calendar_get_calendar_day_view_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarDayView: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_day_view_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarDayViewRequest**](../Model/CoreCalendarGetCalendarDayViewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarDayView200Response**](../Model/CoreCalendarGetCalendarDayView200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarEventById()`

```php
coreCalendarGetCalendarEventById($core_calendar_get_calendar_event_by_id_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarEventById200Response
```

Get calendar event by id

Get calendar event by id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_event_by_id_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarEventByIdRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarEventByIdRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarEventById($core_calendar_get_calendar_event_by_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarEventById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_event_by_id_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarEventByIdRequest**](../Model/CoreCalendarGetCalendarEventByIdRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarEventById200Response**](../Model/CoreCalendarGetCalendarEventById200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarEvents()`

```php
coreCalendarGetCalendarEvents($core_calendar_get_calendar_events_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarEvents200Response
```

Get calendar events

Get calendar events

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_events_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarEventsRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarEventsRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarEvents($core_calendar_get_calendar_events_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarEvents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_events_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarEventsRequest**](../Model/CoreCalendarGetCalendarEventsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarEvents200Response**](../Model/CoreCalendarGetCalendarEvents200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarExportToken()`

```php
coreCalendarGetCalendarExportToken(): \OpenAPI\Client\Model\CoreCalendarGetCalendarExportToken200Response
```

Return the auth token required for exporting a calendar.

Return the auth token required for exporting a calendar.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreCalendarGetCalendarExportToken();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarExportToken: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarExportToken200Response**](../Model/CoreCalendarGetCalendarExportToken200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarMonthlyView()`

```php
coreCalendarGetCalendarMonthlyView($core_calendar_get_calendar_monthly_view_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200Response
```

Fetch the monthly view data for a calendar

Fetch the monthly view data for a calendar

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_monthly_view_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyViewRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyViewRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarMonthlyView($core_calendar_get_calendar_monthly_view_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarMonthlyView: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_monthly_view_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyViewRequest**](../Model/CoreCalendarGetCalendarMonthlyViewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarMonthlyView200Response**](../Model/CoreCalendarGetCalendarMonthlyView200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetCalendarUpcomingView()`

```php
coreCalendarGetCalendarUpcomingView($core_calendar_get_calendar_upcoming_view_request): \OpenAPI\Client\Model\CoreCalendarGetCalendarUpcomingView200Response
```

Fetch the upcoming view data for a calendar

Fetch the upcoming view data for a calendar

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_calendar_upcoming_view_request = new \OpenAPI\Client\Model\CoreCalendarGetCalendarUpcomingViewRequest(); // \OpenAPI\Client\Model\CoreCalendarGetCalendarUpcomingViewRequest

try {
    $result = $apiInstance->coreCalendarGetCalendarUpcomingView($core_calendar_get_calendar_upcoming_view_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetCalendarUpcomingView: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_calendar_upcoming_view_request** | [**\OpenAPI\Client\Model\CoreCalendarGetCalendarUpcomingViewRequest**](../Model/CoreCalendarGetCalendarUpcomingViewRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetCalendarUpcomingView200Response**](../Model/CoreCalendarGetCalendarUpcomingView200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarGetTimestamps()`

```php
coreCalendarGetTimestamps($core_calendar_get_timestamps_request): \OpenAPI\Client\Model\CoreCalendarGetTimestamps200Response
```

Fetch unix timestamps for given date times.

Fetch unix timestamps for given date times.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_get_timestamps_request = new \OpenAPI\Client\Model\CoreCalendarGetTimestampsRequest(); // \OpenAPI\Client\Model\CoreCalendarGetTimestampsRequest

try {
    $result = $apiInstance->coreCalendarGetTimestamps($core_calendar_get_timestamps_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarGetTimestamps: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_get_timestamps_request** | [**\OpenAPI\Client\Model\CoreCalendarGetTimestampsRequest**](../Model/CoreCalendarGetTimestampsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarGetTimestamps200Response**](../Model/CoreCalendarGetTimestamps200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarSubmitCreateUpdateForm()`

```php
coreCalendarSubmitCreateUpdateForm($core_calendar_submit_create_update_form_request): \OpenAPI\Client\Model\CoreCalendarSubmitCreateUpdateForm200Response
```

Submit form data for event form

Submit form data for event form

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_submit_create_update_form_request = new \OpenAPI\Client\Model\CoreCalendarSubmitCreateUpdateFormRequest(); // \OpenAPI\Client\Model\CoreCalendarSubmitCreateUpdateFormRequest

try {
    $result = $apiInstance->coreCalendarSubmitCreateUpdateForm($core_calendar_submit_create_update_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarSubmitCreateUpdateForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_submit_create_update_form_request** | [**\OpenAPI\Client\Model\CoreCalendarSubmitCreateUpdateFormRequest**](../Model/CoreCalendarSubmitCreateUpdateFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarSubmitCreateUpdateForm200Response**](../Model/CoreCalendarSubmitCreateUpdateForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCalendarUpdateEventStartDay()`

```php
coreCalendarUpdateEventStartDay($core_calendar_update_event_start_day_request): \OpenAPI\Client\Model\CoreCalendarUpdateEventStartDay200Response
```

Update the start day (but not time) for an event.

Update the start day (but not time) for an event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_calendar_update_event_start_day_request = new \OpenAPI\Client\Model\CoreCalendarUpdateEventStartDayRequest(); // \OpenAPI\Client\Model\CoreCalendarUpdateEventStartDayRequest

try {
    $result = $apiInstance->coreCalendarUpdateEventStartDay($core_calendar_update_event_start_day_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCalendarUpdateEventStartDay: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_calendar_update_event_start_day_request** | [**\OpenAPI\Client\Model\CoreCalendarUpdateEventStartDayRequest**](../Model/CoreCalendarUpdateEventStartDayRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarUpdateEventStartDay200Response**](../Model/CoreCalendarUpdateEventStartDay200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreChangeEditmode()`

```php
coreChangeEditmode($core_change_editmode_request): \OpenAPI\Client\Model\CoreChangeEditmode200Response
```

Change the editing mode

Change the editing mode

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_change_editmode_request = new \OpenAPI\Client\Model\CoreChangeEditmodeRequest(); // \OpenAPI\Client\Model\CoreChangeEditmodeRequest

try {
    $result = $apiInstance->coreChangeEditmode($core_change_editmode_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreChangeEditmode: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_change_editmode_request** | [**\OpenAPI\Client\Model\CoreChangeEditmodeRequest**](../Model/CoreChangeEditmodeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreChangeEditmode200Response**](../Model/CoreChangeEditmode200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortAddCohortMembers()`

```php
coreCohortAddCohortMembers($core_cohort_add_cohort_members_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Adds cohort members.

Adds cohort members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_add_cohort_members_request = new \OpenAPI\Client\Model\CoreCohortAddCohortMembersRequest(); // \OpenAPI\Client\Model\CoreCohortAddCohortMembersRequest

try {
    $result = $apiInstance->coreCohortAddCohortMembers($core_cohort_add_cohort_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortAddCohortMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_add_cohort_members_request** | [**\OpenAPI\Client\Model\CoreCohortAddCohortMembersRequest**](../Model/CoreCohortAddCohortMembersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortCreateCohorts()`

```php
coreCohortCreateCohorts($core_cohort_create_cohorts_request): object
```

Creates new cohorts.

Creates new cohorts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_create_cohorts_request = new \OpenAPI\Client\Model\CoreCohortCreateCohortsRequest(); // \OpenAPI\Client\Model\CoreCohortCreateCohortsRequest

try {
    $result = $apiInstance->coreCohortCreateCohorts($core_cohort_create_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortCreateCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_create_cohorts_request** | [**\OpenAPI\Client\Model\CoreCohortCreateCohortsRequest**](../Model/CoreCohortCreateCohortsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortDeleteCohortMembers()`

```php
coreCohortDeleteCohortMembers($core_cohort_delete_cohort_members_request): object
```

Deletes cohort members.

Deletes cohort members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_delete_cohort_members_request = new \OpenAPI\Client\Model\CoreCohortDeleteCohortMembersRequest(); // \OpenAPI\Client\Model\CoreCohortDeleteCohortMembersRequest

try {
    $result = $apiInstance->coreCohortDeleteCohortMembers($core_cohort_delete_cohort_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortDeleteCohortMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_delete_cohort_members_request** | [**\OpenAPI\Client\Model\CoreCohortDeleteCohortMembersRequest**](../Model/CoreCohortDeleteCohortMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortDeleteCohorts()`

```php
coreCohortDeleteCohorts($core_cohort_delete_cohorts_request): object
```

Deletes all specified cohorts.

Deletes all specified cohorts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_delete_cohorts_request = new \OpenAPI\Client\Model\CoreCohortDeleteCohortsRequest(); // \OpenAPI\Client\Model\CoreCohortDeleteCohortsRequest

try {
    $result = $apiInstance->coreCohortDeleteCohorts($core_cohort_delete_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortDeleteCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_delete_cohorts_request** | [**\OpenAPI\Client\Model\CoreCohortDeleteCohortsRequest**](../Model/CoreCohortDeleteCohortsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortGetCohortMembers()`

```php
coreCohortGetCohortMembers($core_cohort_get_cohort_members_request): object
```

Returns cohort members.

Returns cohort members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_get_cohort_members_request = new \OpenAPI\Client\Model\CoreCohortGetCohortMembersRequest(); // \OpenAPI\Client\Model\CoreCohortGetCohortMembersRequest

try {
    $result = $apiInstance->coreCohortGetCohortMembers($core_cohort_get_cohort_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortGetCohortMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_get_cohort_members_request** | [**\OpenAPI\Client\Model\CoreCohortGetCohortMembersRequest**](../Model/CoreCohortGetCohortMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortGetCohorts()`

```php
coreCohortGetCohorts($core_cohort_get_cohorts_request): object
```

Returns cohort details.

Returns cohort details.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_get_cohorts_request = new \OpenAPI\Client\Model\CoreCohortGetCohortsRequest(); // \OpenAPI\Client\Model\CoreCohortGetCohortsRequest

try {
    $result = $apiInstance->coreCohortGetCohorts($core_cohort_get_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortGetCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_get_cohorts_request** | [**\OpenAPI\Client\Model\CoreCohortGetCohortsRequest**](../Model/CoreCohortGetCohortsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortSearchCohorts()`

```php
coreCohortSearchCohorts($core_cohort_search_cohorts_request): \OpenAPI\Client\Model\CoreCohortSearchCohorts200Response
```

Search for cohorts.

Search for cohorts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_search_cohorts_request = new \OpenAPI\Client\Model\CoreCohortSearchCohortsRequest(); // \OpenAPI\Client\Model\CoreCohortSearchCohortsRequest

try {
    $result = $apiInstance->coreCohortSearchCohorts($core_cohort_search_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortSearchCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_search_cohorts_request** | [**\OpenAPI\Client\Model\CoreCohortSearchCohortsRequest**](../Model/CoreCohortSearchCohortsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortSearchCohorts200Response**](../Model/CoreCohortSearchCohorts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCohortUpdateCohorts()`

```php
coreCohortUpdateCohorts($core_cohort_update_cohorts_request): object
```

Updates existing cohorts.

Updates existing cohorts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_cohort_update_cohorts_request = new \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequest(); // \OpenAPI\Client\Model\CoreCohortUpdateCohortsRequest

try {
    $result = $apiInstance->coreCohortUpdateCohorts($core_cohort_update_cohorts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCohortUpdateCohorts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_cohort_update_cohorts_request** | [**\OpenAPI\Client\Model\CoreCohortUpdateCohortsRequest**](../Model/CoreCohortUpdateCohortsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCommentAddComments()`

```php
coreCommentAddComments($core_comment_add_comments_request): object
```

Adds a comment or comments.

Adds a comment or comments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_comment_add_comments_request = new \OpenAPI\Client\Model\CoreCommentAddCommentsRequest(); // \OpenAPI\Client\Model\CoreCommentAddCommentsRequest

try {
    $result = $apiInstance->coreCommentAddComments($core_comment_add_comments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCommentAddComments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_comment_add_comments_request** | [**\OpenAPI\Client\Model\CoreCommentAddCommentsRequest**](../Model/CoreCommentAddCommentsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCommentDeleteComments()`

```php
coreCommentDeleteComments($core_comment_delete_comments_request): object
```

Deletes a comment or comments.

Deletes a comment or comments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_comment_delete_comments_request = new \OpenAPI\Client\Model\CoreCommentDeleteCommentsRequest(); // \OpenAPI\Client\Model\CoreCommentDeleteCommentsRequest

try {
    $result = $apiInstance->coreCommentDeleteComments($core_comment_delete_comments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCommentDeleteComments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_comment_delete_comments_request** | [**\OpenAPI\Client\Model\CoreCommentDeleteCommentsRequest**](../Model/CoreCommentDeleteCommentsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCommentGetComments()`

```php
coreCommentGetComments($core_comment_get_comments_request): \OpenAPI\Client\Model\CoreCommentGetComments200Response
```

Returns comments.

Returns comments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_comment_get_comments_request = new \OpenAPI\Client\Model\CoreCommentGetCommentsRequest(); // \OpenAPI\Client\Model\CoreCommentGetCommentsRequest

try {
    $result = $apiInstance->coreCommentGetComments($core_comment_get_comments_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCommentGetComments: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_comment_get_comments_request** | [**\OpenAPI\Client\Model\CoreCommentGetCommentsRequest**](../Model/CoreCommentGetCommentsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCommentGetComments200Response**](../Model/CoreCommentGetComments200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyAddCompetencyToCourse()`

```php
coreCompetencyAddCompetencyToCourse($core_competency_add_competency_to_course_request): object
```

Add the competency to a course

Add the competency to a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_add_competency_to_course_request = new \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToCourseRequest

try {
    $result = $apiInstance->coreCompetencyAddCompetencyToCourse($core_competency_add_competency_to_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyAddCompetencyToCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_add_competency_to_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyAddCompetencyToCourseRequest**](../Model/CoreCompetencyAddCompetencyToCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyAddCompetencyToPlan()`

```php
coreCompetencyAddCompetencyToPlan($core_competency_add_competency_to_plan_request): object
```

Add the competency to a learning plan

Add the competency to a learning plan

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_add_competency_to_plan_request = new \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToPlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToPlanRequest

try {
    $result = $apiInstance->coreCompetencyAddCompetencyToPlan($core_competency_add_competency_to_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyAddCompetencyToPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_add_competency_to_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyAddCompetencyToPlanRequest**](../Model/CoreCompetencyAddCompetencyToPlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyAddCompetencyToTemplate()`

```php
coreCompetencyAddCompetencyToTemplate($core_competency_add_competency_to_template_request): object
```

Add the competency to a template

Add the competency to a template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_add_competency_to_template_request = new \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyAddCompetencyToTemplateRequest

try {
    $result = $apiInstance->coreCompetencyAddCompetencyToTemplate($core_competency_add_competency_to_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyAddCompetencyToTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_add_competency_to_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyAddCompetencyToTemplateRequest**](../Model/CoreCompetencyAddCompetencyToTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyAddRelatedCompetency()`

```php
coreCompetencyAddRelatedCompetency($core_competency_add_related_competency_request): object
```

Adds a related competency

Adds a related competency

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_add_related_competency_request = new \OpenAPI\Client\Model\CoreCompetencyAddRelatedCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyAddRelatedCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyAddRelatedCompetency($core_competency_add_related_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyAddRelatedCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_add_related_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyAddRelatedCompetencyRequest**](../Model/CoreCompetencyAddRelatedCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyApprovePlan()`

```php
coreCompetencyApprovePlan($core_competency_approve_plan_request): object
```

Approve a plan.

Approve a plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_approve_plan_request = new \OpenAPI\Client\Model\CoreCompetencyApprovePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyApprovePlanRequest

try {
    $result = $apiInstance->coreCompetencyApprovePlan($core_competency_approve_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyApprovePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_approve_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyApprovePlanRequest**](../Model/CoreCompetencyApprovePlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCompetencyFrameworkViewed()`

```php
coreCompetencyCompetencyFrameworkViewed($core_competency_competency_framework_viewed_request): object
```

Log event competency framework viewed

Log event competency framework viewed

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_framework_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyFrameworkViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyFrameworkViewedRequest

try {
    $result = $apiInstance->coreCompetencyCompetencyFrameworkViewed($core_competency_competency_framework_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCompetencyFrameworkViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_framework_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyFrameworkViewedRequest**](../Model/CoreCompetencyCompetencyFrameworkViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCompetencyViewed()`

```php
coreCompetencyCompetencyViewed($core_competency_competency_viewed_request): object
```

Log event competency viewed

Log event competency viewed

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyCompetencyViewed($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCompetencyViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCompletePlan()`

```php
coreCompetencyCompletePlan($core_competency_complete_plan_request): object
```

Complete learning plan.

Complete learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_complete_plan_request = new \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest

try {
    $result = $apiInstance->coreCompetencyCompletePlan($core_competency_complete_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCompletePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_complete_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest**](../Model/CoreCompetencyCompletePlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCompetencies()`

```php
coreCompetencyCountCompetencies($core_competency_count_competencies_request): object
```

Count a list of a competencies.

Count a list of a competencies.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencyCountCompetencies($core_competency_count_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesRequest**](../Model/CoreCompetencyCountCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCompetenciesInCourse()`

```php
coreCompetencyCountCompetenciesInCourse($core_competency_count_competencies_in_course_request): object
```

List the competencies in a course

List the competencies in a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_course_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest

try {
    $result = $apiInstance->coreCompetencyCountCompetenciesInCourse($core_competency_count_competencies_in_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCompetenciesInCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest**](../Model/CoreCompetencyCountCompetenciesInCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCompetenciesInTemplate()`

```php
coreCompetencyCountCompetenciesInTemplate($core_competency_count_competencies_in_template_request): object
```

Count a list of a competencies for a given template.

Count a list of a competencies for a given template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_template_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest

try {
    $result = $apiInstance->coreCompetencyCountCompetenciesInTemplate($core_competency_count_competencies_in_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCompetenciesInTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest**](../Model/CoreCompetencyCountCompetenciesInTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCompetencyFrameworks()`

```php
coreCompetencyCountCompetencyFrameworks($core_competency_count_competency_frameworks_request): object
```

Count a list of a competency frameworks.

Count a list of a competency frameworks.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competency_frameworks_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest

try {
    $result = $apiInstance->coreCompetencyCountCompetencyFrameworks($core_competency_count_competency_frameworks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCompetencyFrameworks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competency_frameworks_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest**](../Model/CoreCompetencyCountCompetencyFrameworksRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCourseModuleCompetencies()`

```php
coreCompetencyCountCourseModuleCompetencies($core_competency_count_course_module_competencies_request): object
```

Count the competencies in a course module

Count the competencies in a course module

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_course_module_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyCountCourseModuleCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCourseModuleCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencyCountCourseModuleCompetencies($core_competency_count_course_module_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCourseModuleCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_course_module_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCourseModuleCompetenciesRequest**](../Model/CoreCompetencyCountCourseModuleCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountCoursesUsingCompetency()`

```php
coreCompetencyCountCoursesUsingCompetency($core_competency_competency_viewed_request): object
```

List the courses using a competency

List the courses using a competency

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyCountCoursesUsingCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountCoursesUsingCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountTemplates()`

```php
coreCompetencyCountTemplates($core_competency_count_competency_frameworks_request): object
```

Count a list of a learning plan templates.

Count a list of a learning plan templates.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competency_frameworks_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest

try {
    $result = $apiInstance->coreCompetencyCountTemplates($core_competency_count_competency_frameworks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountTemplates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competency_frameworks_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetencyFrameworksRequest**](../Model/CoreCompetencyCountCompetencyFrameworksRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCountTemplatesUsingCompetency()`

```php
coreCompetencyCountTemplatesUsingCompetency($core_competency_competency_viewed_request): object
```

Count a list of a learning plan templates for a given competency.

Count a list of a learning plan templates for a given competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyCountTemplatesUsingCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCountTemplatesUsingCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCreateCompetency()`

```php
coreCompetencyCreateCompetency($core_competency_create_competency_request): \OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response
```

Creates new competencies.

Creates new competencies.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_create_competency_request = new \OpenAPI\Client\Model\CoreCompetencyCreateCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyCreateCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyCreateCompetency($core_competency_create_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCreateCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_create_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyCreateCompetencyRequest**](../Model/CoreCompetencyCreateCompetencyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response**](../Model/CoreCompetencyCreateCompetency200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCreateCompetencyFramework()`

```php
coreCompetencyCreateCompetencyFramework($core_competency_create_competency_framework_request): \OpenAPI\Client\Model\CoreCompetencyCreateCompetencyFramework200Response
```

Creates new competency frameworks.

Creates new competency frameworks.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_create_competency_framework_request = new \OpenAPI\Client\Model\CoreCompetencyCreateCompetencyFrameworkRequest(); // \OpenAPI\Client\Model\CoreCompetencyCreateCompetencyFrameworkRequest

try {
    $result = $apiInstance->coreCompetencyCreateCompetencyFramework($core_competency_create_competency_framework_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCreateCompetencyFramework: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_create_competency_framework_request** | [**\OpenAPI\Client\Model\CoreCompetencyCreateCompetencyFrameworkRequest**](../Model/CoreCompetencyCreateCompetencyFrameworkRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateCompetencyFramework200Response**](../Model/CoreCompetencyCreateCompetencyFramework200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCreatePlan()`

```php
coreCompetencyCreatePlan($core_competency_create_plan_request): \OpenAPI\Client\Model\CoreCompetencyCreatePlan200Response
```

Creates a learning plan.

Creates a learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_create_plan_request = new \OpenAPI\Client\Model\CoreCompetencyCreatePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyCreatePlanRequest

try {
    $result = $apiInstance->coreCompetencyCreatePlan($core_competency_create_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCreatePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_create_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyCreatePlanRequest**](../Model/CoreCompetencyCreatePlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreatePlan200Response**](../Model/CoreCompetencyCreatePlan200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCreateTemplate()`

```php
coreCompetencyCreateTemplate($core_competency_create_template_request): \OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response
```

Creates new learning plan templates.

Creates new learning plan templates.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_create_template_request = new \OpenAPI\Client\Model\CoreCompetencyCreateTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyCreateTemplateRequest

try {
    $result = $apiInstance->coreCompetencyCreateTemplate($core_competency_create_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCreateTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_create_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyCreateTemplateRequest**](../Model/CoreCompetencyCreateTemplateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response**](../Model/CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyCreateUserEvidenceCompetency()`

```php
coreCompetencyCreateUserEvidenceCompetency($core_competency_create_user_evidence_competency_request): \OpenAPI\Client\Model\CoreCompetencyCreateUserEvidenceCompetency200Response
```

Create an evidence of prior learning relationship with a competency.

Create an evidence of prior learning relationship with a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_create_user_evidence_competency_request = new \OpenAPI\Client\Model\CoreCompetencyCreateUserEvidenceCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyCreateUserEvidenceCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyCreateUserEvidenceCompetency($core_competency_create_user_evidence_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyCreateUserEvidenceCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_create_user_evidence_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyCreateUserEvidenceCompetencyRequest**](../Model/CoreCompetencyCreateUserEvidenceCompetencyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateUserEvidenceCompetency200Response**](../Model/CoreCompetencyCreateUserEvidenceCompetency200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteCompetency()`

```php
coreCompetencyDeleteCompetency($core_competency_delete_competency_request): object
```

Delete a competency.

Delete a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_competency_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyDeleteCompetency($core_competency_delete_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyRequest**](../Model/CoreCompetencyDeleteCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteCompetencyFramework()`

```php
coreCompetencyDeleteCompetencyFramework($core_competency_delete_competency_framework_request): object
```

Delete a competency framework.

Delete a competency framework.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_competency_framework_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyFrameworkRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyFrameworkRequest

try {
    $result = $apiInstance->coreCompetencyDeleteCompetencyFramework($core_competency_delete_competency_framework_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteCompetencyFramework: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_competency_framework_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteCompetencyFrameworkRequest**](../Model/CoreCompetencyDeleteCompetencyFrameworkRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteEvidence()`

```php
coreCompetencyDeleteEvidence($core_competency_delete_evidence_request): object
```

Delete an evidence

Delete an evidence

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_evidence_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteEvidenceRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteEvidenceRequest

try {
    $result = $apiInstance->coreCompetencyDeleteEvidence($core_competency_delete_evidence_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteEvidence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_evidence_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteEvidenceRequest**](../Model/CoreCompetencyDeleteEvidenceRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeletePlan()`

```php
coreCompetencyDeletePlan($core_competency_delete_plan_request): object
```

Delete a learning plan.

Delete a learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_plan_request = new \OpenAPI\Client\Model\CoreCompetencyDeletePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeletePlanRequest

try {
    $result = $apiInstance->coreCompetencyDeletePlan($core_competency_delete_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeletePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeletePlanRequest**](../Model/CoreCompetencyDeletePlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteTemplate()`

```php
coreCompetencyDeleteTemplate($core_competency_delete_template_request): object
```

Delete a learning plan template.

Delete a learning plan template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_template_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteTemplateRequest

try {
    $result = $apiInstance->coreCompetencyDeleteTemplate($core_competency_delete_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteTemplateRequest**](../Model/CoreCompetencyDeleteTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteUserEvidence()`

```php
coreCompetencyDeleteUserEvidence($core_competency_delete_user_evidence_request): object
```

Delete an evidence of prior learning.

Delete an evidence of prior learning.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_user_evidence_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest

try {
    $result = $apiInstance->coreCompetencyDeleteUserEvidence($core_competency_delete_user_evidence_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteUserEvidence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_user_evidence_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest**](../Model/CoreCompetencyDeleteUserEvidenceRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDeleteUserEvidenceCompetency()`

```php
coreCompetencyDeleteUserEvidenceCompetency($core_competency_delete_user_evidence_competency_request): object
```

Delete an evidence of prior learning relationship with a competency.

Delete an evidence of prior learning relationship with a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_user_evidence_competency_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyDeleteUserEvidenceCompetency($core_competency_delete_user_evidence_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDeleteUserEvidenceCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_user_evidence_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceCompetencyRequest**](../Model/CoreCompetencyDeleteUserEvidenceCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDuplicateCompetencyFramework()`

```php
coreCompetencyDuplicateCompetencyFramework($core_competency_duplicate_competency_framework_request): \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response
```

Duplicate a competency framework.

Duplicate a competency framework.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_duplicate_competency_framework_request = new \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest(); // \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest

try {
    $result = $apiInstance->coreCompetencyDuplicateCompetencyFramework($core_competency_duplicate_competency_framework_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDuplicateCompetencyFramework: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_duplicate_competency_framework_request** | [**\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest**](../Model/CoreCompetencyDuplicateCompetencyFrameworkRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response**](../Model/CoreCompetencyDuplicateCompetencyFramework200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyDuplicateTemplate()`

```php
coreCompetencyDuplicateTemplate($core_competency_count_competencies_in_template_request): \OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response
```

Duplicate learning plan template.

Duplicate learning plan template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_template_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest

try {
    $result = $apiInstance->coreCompetencyDuplicateTemplate($core_competency_count_competencies_in_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyDuplicateTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest**](../Model/CoreCompetencyCountCompetenciesInTemplateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response**](../Model/CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyGetScaleValues()`

```php
coreCompetencyGetScaleValues($core_competency_get_scale_values_request): object
```

Fetch the values for a specific scale

Fetch the values for a specific scale

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_get_scale_values_request = new \OpenAPI\Client\Model\CoreCompetencyGetScaleValuesRequest(); // \OpenAPI\Client\Model\CoreCompetencyGetScaleValuesRequest

try {
    $result = $apiInstance->coreCompetencyGetScaleValues($core_competency_get_scale_values_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyGetScaleValues: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_get_scale_values_request** | [**\OpenAPI\Client\Model\CoreCompetencyGetScaleValuesRequest**](../Model/CoreCompetencyGetScaleValuesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyGradeCompetency()`

```php
coreCompetencyGradeCompetency($core_competency_grade_competency_request): \OpenAPI\Client\Model\CoreCompetencyGradeCompetency200Response
```

Grade a competency.

Grade a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_grade_competency_request = new \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyGradeCompetency($core_competency_grade_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyGradeCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_grade_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyGradeCompetencyRequest**](../Model/CoreCompetencyGradeCompetencyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyGradeCompetency200Response**](../Model/CoreCompetencyGradeCompetency200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyGradeCompetencyInCourse()`

```php
coreCompetencyGradeCompetencyInCourse($core_competency_grade_competency_in_course_request): \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourse200Response
```

Grade a competency from the course page.

Grade a competency from the course page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_grade_competency_in_course_request = new \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourseRequest

try {
    $result = $apiInstance->coreCompetencyGradeCompetencyInCourse($core_competency_grade_competency_in_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyGradeCompetencyInCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_grade_competency_in_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourseRequest**](../Model/CoreCompetencyGradeCompetencyInCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourse200Response**](../Model/CoreCompetencyGradeCompetencyInCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyGradeCompetencyInPlan()`

```php
coreCompetencyGradeCompetencyInPlan($core_competency_grade_competency_in_plan_request): \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourse200Response
```

Grade a competency from the user plan page.

Grade a competency from the user plan page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_grade_competency_in_plan_request = new \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInPlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInPlanRequest

try {
    $result = $apiInstance->coreCompetencyGradeCompetencyInPlan($core_competency_grade_competency_in_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyGradeCompetencyInPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_grade_competency_in_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInPlanRequest**](../Model/CoreCompetencyGradeCompetencyInPlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyGradeCompetencyInCourse200Response**](../Model/CoreCompetencyGradeCompetencyInCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListCompetencies()`

```php
coreCompetencyListCompetencies($core_competency_list_competencies_request): object
```

Load a list of a competencies.

Load a list of a competencies.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyListCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyListCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencyListCompetencies($core_competency_list_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyListCompetenciesRequest**](../Model/CoreCompetencyListCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListCompetenciesInTemplate()`

```php
coreCompetencyListCompetenciesInTemplate($core_competency_count_competencies_in_template_request): object
```

Load a list of a competencies for a given template.

Load a list of a competencies for a given template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_template_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest

try {
    $result = $apiInstance->coreCompetencyListCompetenciesInTemplate($core_competency_count_competencies_in_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListCompetenciesInTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest**](../Model/CoreCompetencyCountCompetenciesInTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListCompetencyFrameworks()`

```php
coreCompetencyListCompetencyFrameworks($core_competency_list_competency_frameworks_request): object
```

Load a list of a competency frameworks.

Load a list of a competency frameworks.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_competency_frameworks_request = new \OpenAPI\Client\Model\CoreCompetencyListCompetencyFrameworksRequest(); // \OpenAPI\Client\Model\CoreCompetencyListCompetencyFrameworksRequest

try {
    $result = $apiInstance->coreCompetencyListCompetencyFrameworks($core_competency_list_competency_frameworks_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListCompetencyFrameworks: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_competency_frameworks_request** | [**\OpenAPI\Client\Model\CoreCompetencyListCompetencyFrameworksRequest**](../Model/CoreCompetencyListCompetencyFrameworksRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListCourseCompetencies()`

```php
coreCompetencyListCourseCompetencies($core_competency_count_competencies_in_course_request): object
```

List the competencies in a course

List the competencies in a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_course_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest

try {
    $result = $apiInstance->coreCompetencyListCourseCompetencies($core_competency_count_competencies_in_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListCourseCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInCourseRequest**](../Model/CoreCompetencyCountCompetenciesInCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListCourseModuleCompetencies()`

```php
coreCompetencyListCourseModuleCompetencies($core_competency_list_course_module_competencies_request): object
```

List the competencies in a course module

List the competencies in a course module

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_course_module_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencyListCourseModuleCompetencies($core_competency_list_course_module_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListCourseModuleCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_course_module_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest**](../Model/CoreCompetencyListCourseModuleCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListPlanCompetencies()`

```php
coreCompetencyListPlanCompetencies($core_competency_list_plan_competencies_request): object
```

List the competencies in a plan

List the competencies in a plan

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_plan_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyListPlanCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyListPlanCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencyListPlanCompetencies($core_competency_list_plan_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListPlanCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_plan_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyListPlanCompetenciesRequest**](../Model/CoreCompetencyListPlanCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListTemplates()`

```php
coreCompetencyListTemplates($core_competency_list_templates_request): object
```

Load a list of a learning plan templates.

Load a list of a learning plan templates.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_templates_request = new \OpenAPI\Client\Model\CoreCompetencyListTemplatesRequest(); // \OpenAPI\Client\Model\CoreCompetencyListTemplatesRequest

try {
    $result = $apiInstance->coreCompetencyListTemplates($core_competency_list_templates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListTemplates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_templates_request** | [**\OpenAPI\Client\Model\CoreCompetencyListTemplatesRequest**](../Model/CoreCompetencyListTemplatesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListTemplatesUsingCompetency()`

```php
coreCompetencyListTemplatesUsingCompetency($core_competency_competency_viewed_request): object
```

Load a list of a learning plan templates for a given competency.

Load a list of a learning plan templates for a given competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyListTemplatesUsingCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListTemplatesUsingCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyListUserPlans()`

```php
coreCompetencyListUserPlans($core_competency_list_user_plans_request): object
```

List a user's learning plans.

List a user's learning plans.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_user_plans_request = new \OpenAPI\Client\Model\CoreCompetencyListUserPlansRequest(); // \OpenAPI\Client\Model\CoreCompetencyListUserPlansRequest

try {
    $result = $apiInstance->coreCompetencyListUserPlans($core_competency_list_user_plans_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyListUserPlans: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_user_plans_request** | [**\OpenAPI\Client\Model\CoreCompetencyListUserPlansRequest**](../Model/CoreCompetencyListUserPlansRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyMoveDownCompetency()`

```php
coreCompetencyMoveDownCompetency($core_competency_competency_viewed_request): object
```

Re-order a competency.

Re-order a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyMoveDownCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyMoveDownCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyMoveUpCompetency()`

```php
coreCompetencyMoveUpCompetency($core_competency_competency_viewed_request): object
```

Re-order a competency.

Re-order a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyMoveUpCompetency($core_competency_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyMoveUpCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompetencyViewedRequest**](../Model/CoreCompetencyCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyPlanCancelReviewRequest()`

```php
coreCompetencyPlanCancelReviewRequest($core_competency_plan_cancel_review_request_request): object
```

Cancel the review of a plan.

Cancel the review of a plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_plan_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyPlanCancelReviewRequest($core_competency_plan_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyPlanCancelReviewRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_plan_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest**](../Model/CoreCompetencyPlanCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyPlanRequestReview()`

```php
coreCompetencyPlanRequestReview($core_competency_plan_cancel_review_request_request): object
```

Request for a plan to be reviewed.

Request for a plan to be reviewed.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_plan_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyPlanRequestReview($core_competency_plan_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyPlanRequestReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_plan_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest**](../Model/CoreCompetencyPlanCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyPlanStartReview()`

```php
coreCompetencyPlanStartReview($core_competency_plan_cancel_review_request_request): object
```

Start the review of a plan.

Start the review of a plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_plan_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyPlanStartReview($core_competency_plan_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyPlanStartReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_plan_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest**](../Model/CoreCompetencyPlanCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyPlanStopReview()`

```php
coreCompetencyPlanStopReview($core_competency_plan_cancel_review_request_request): object
```

Stop the review of a plan.

Stop the review of a plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_plan_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyPlanStopReview($core_competency_plan_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyPlanStopReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_plan_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest**](../Model/CoreCompetencyPlanCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReadCompetency()`

```php
coreCompetencyReadCompetency($core_competency_read_competency_request): \OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response
```

Load a summary of a competency.

Load a summary of a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_read_competency_request = new \OpenAPI\Client\Model\CoreCompetencyReadCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyReadCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyReadCompetency($core_competency_read_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReadCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_read_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyReadCompetencyRequest**](../Model/CoreCompetencyReadCompetencyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateCompetency200Response**](../Model/CoreCompetencyCreateCompetency200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReadCompetencyFramework()`

```php
coreCompetencyReadCompetencyFramework($core_competency_duplicate_competency_framework_request): \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response
```

Load a summary of a competency framework.

Load a summary of a competency framework.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_duplicate_competency_framework_request = new \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest(); // \OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest

try {
    $result = $apiInstance->coreCompetencyReadCompetencyFramework($core_competency_duplicate_competency_framework_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReadCompetencyFramework: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_duplicate_competency_framework_request** | [**\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFrameworkRequest**](../Model/CoreCompetencyDuplicateCompetencyFrameworkRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyDuplicateCompetencyFramework200Response**](../Model/CoreCompetencyDuplicateCompetencyFramework200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReadPlan()`

```php
coreCompetencyReadPlan($core_competency_read_plan_request): \OpenAPI\Client\Model\CoreCompetencyReadPlan200Response
```

Load a learning plan.

Load a learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_read_plan_request = new \OpenAPI\Client\Model\CoreCompetencyReadPlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyReadPlanRequest

try {
    $result = $apiInstance->coreCompetencyReadPlan($core_competency_read_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReadPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_read_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyReadPlanRequest**](../Model/CoreCompetencyReadPlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyReadPlan200Response**](../Model/CoreCompetencyReadPlan200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReadTemplate()`

```php
coreCompetencyReadTemplate($core_competency_read_template_request): \OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response
```

Load a summary of a learning plan template.

Load a summary of a learning plan template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_read_template_request = new \OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest

try {
    $result = $apiInstance->coreCompetencyReadTemplate($core_competency_read_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReadTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_read_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest**](../Model/CoreCompetencyReadTemplateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyCreateTemplate200Response**](../Model/CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReadUserEvidence()`

```php
coreCompetencyReadUserEvidence($core_competency_delete_user_evidence_request): \OpenAPI\Client\Model\CoreCompetencyReadUserEvidence200Response
```

Read an evidence of prior learning.

Read an evidence of prior learning.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_user_evidence_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest

try {
    $result = $apiInstance->coreCompetencyReadUserEvidence($core_competency_delete_user_evidence_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReadUserEvidence: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_user_evidence_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest**](../Model/CoreCompetencyDeleteUserEvidenceRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyReadUserEvidence200Response**](../Model/CoreCompetencyReadUserEvidence200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyRemoveCompetencyFromCourse()`

```php
coreCompetencyRemoveCompetencyFromCourse($core_competency_remove_competency_from_course_request): object
```

Remove a competency from a course

Remove a competency from a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_remove_competency_from_course_request = new \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromCourseRequest

try {
    $result = $apiInstance->coreCompetencyRemoveCompetencyFromCourse($core_competency_remove_competency_from_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyRemoveCompetencyFromCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_remove_competency_from_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromCourseRequest**](../Model/CoreCompetencyRemoveCompetencyFromCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyRemoveCompetencyFromPlan()`

```php
coreCompetencyRemoveCompetencyFromPlan($core_competency_remove_competency_from_plan_request): object
```

Remove the competency from a learning plan

Remove the competency from a learning plan

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_remove_competency_from_plan_request = new \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromPlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromPlanRequest

try {
    $result = $apiInstance->coreCompetencyRemoveCompetencyFromPlan($core_competency_remove_competency_from_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyRemoveCompetencyFromPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_remove_competency_from_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromPlanRequest**](../Model/CoreCompetencyRemoveCompetencyFromPlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyRemoveCompetencyFromTemplate()`

```php
coreCompetencyRemoveCompetencyFromTemplate($core_competency_remove_competency_from_template_request): object
```

Remove a competency from a template

Remove a competency from a template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_remove_competency_from_template_request = new \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromTemplateRequest

try {
    $result = $apiInstance->coreCompetencyRemoveCompetencyFromTemplate($core_competency_remove_competency_from_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyRemoveCompetencyFromTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_remove_competency_from_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyRemoveCompetencyFromTemplateRequest**](../Model/CoreCompetencyRemoveCompetencyFromTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyRemoveRelatedCompetency()`

```php
coreCompetencyRemoveRelatedCompetency($core_competency_remove_related_competency_request): object
```

Remove a related competency

Remove a related competency

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_remove_related_competency_request = new \OpenAPI\Client\Model\CoreCompetencyRemoveRelatedCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyRemoveRelatedCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyRemoveRelatedCompetency($core_competency_remove_related_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyRemoveRelatedCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_remove_related_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyRemoveRelatedCompetencyRequest**](../Model/CoreCompetencyRemoveRelatedCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReopenPlan()`

```php
coreCompetencyReopenPlan($core_competency_complete_plan_request): object
```

Reopen learning plan.

Reopen learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_complete_plan_request = new \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest

try {
    $result = $apiInstance->coreCompetencyReopenPlan($core_competency_complete_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReopenPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_complete_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyCompletePlanRequest**](../Model/CoreCompetencyCompletePlanRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReorderCourseCompetency()`

```php
coreCompetencyReorderCourseCompetency($core_competency_reorder_course_competency_request): object
```

Move a course competency to a new relative sort order.

Move a course competency to a new relative sort order.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_reorder_course_competency_request = new \OpenAPI\Client\Model\CoreCompetencyReorderCourseCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyReorderCourseCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyReorderCourseCompetency($core_competency_reorder_course_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReorderCourseCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_reorder_course_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyReorderCourseCompetencyRequest**](../Model/CoreCompetencyReorderCourseCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReorderPlanCompetency()`

```php
coreCompetencyReorderPlanCompetency($core_competency_reorder_plan_competency_request): object
```

Move a plan competency to a new relative sort order.

Move a plan competency to a new relative sort order.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_reorder_plan_competency_request = new \OpenAPI\Client\Model\CoreCompetencyReorderPlanCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyReorderPlanCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyReorderPlanCompetency($core_competency_reorder_plan_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReorderPlanCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_reorder_plan_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyReorderPlanCompetencyRequest**](../Model/CoreCompetencyReorderPlanCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyReorderTemplateCompetency()`

```php
coreCompetencyReorderTemplateCompetency($core_competency_reorder_template_competency_request): object
```

Move a template competency to a new relative sort order.

Move a template competency to a new relative sort order.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_reorder_template_competency_request = new \OpenAPI\Client\Model\CoreCompetencyReorderTemplateCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyReorderTemplateCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyReorderTemplateCompetency($core_competency_reorder_template_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyReorderTemplateCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_reorder_template_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyReorderTemplateCompetencyRequest**](../Model/CoreCompetencyReorderTemplateCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies()`

```php
coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies($core_competency_delete_user_evidence_request): object
```

Send user evidence competencies in review

Send user evidence competencies in review

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_delete_user_evidence_request = new \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest(); // \OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest

try {
    $result = $apiInstance->coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies($core_competency_delete_user_evidence_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_delete_user_evidence_request** | [**\OpenAPI\Client\Model\CoreCompetencyDeleteUserEvidenceRequest**](../Model/CoreCompetencyDeleteUserEvidenceRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencySearchCompetencies()`

```php
coreCompetencySearchCompetencies($core_competency_search_competencies_request): object
```

Search a list of a competencies.

Search a list of a competencies.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_search_competencies_request = new \OpenAPI\Client\Model\CoreCompetencySearchCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencySearchCompetenciesRequest

try {
    $result = $apiInstance->coreCompetencySearchCompetencies($core_competency_search_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencySearchCompetencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_search_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencySearchCompetenciesRequest**](../Model/CoreCompetencySearchCompetenciesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencySetCourseCompetencyRuleoutcome()`

```php
coreCompetencySetCourseCompetencyRuleoutcome($core_competency_set_course_competency_ruleoutcome_request): object
```

Modify the ruleoutcome value for course competency

Modify the ruleoutcome value for course competency

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_set_course_competency_ruleoutcome_request = new \OpenAPI\Client\Model\CoreCompetencySetCourseCompetencyRuleoutcomeRequest(); // \OpenAPI\Client\Model\CoreCompetencySetCourseCompetencyRuleoutcomeRequest

try {
    $result = $apiInstance->coreCompetencySetCourseCompetencyRuleoutcome($core_competency_set_course_competency_ruleoutcome_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencySetCourseCompetencyRuleoutcome: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_set_course_competency_ruleoutcome_request** | [**\OpenAPI\Client\Model\CoreCompetencySetCourseCompetencyRuleoutcomeRequest**](../Model/CoreCompetencySetCourseCompetencyRuleoutcomeRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencySetParentCompetency()`

```php
coreCompetencySetParentCompetency($core_competency_set_parent_competency_request): object
```

Set a new parent for a competency.

Set a new parent for a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_set_parent_competency_request = new \OpenAPI\Client\Model\CoreCompetencySetParentCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencySetParentCompetencyRequest

try {
    $result = $apiInstance->coreCompetencySetParentCompetency($core_competency_set_parent_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencySetParentCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_set_parent_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencySetParentCompetencyRequest**](../Model/CoreCompetencySetParentCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyTemplateHasRelatedData()`

```php
coreCompetencyTemplateHasRelatedData($core_competency_count_competencies_in_template_request): object
```

Check if a template has related data

Check if a template has related data

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_count_competencies_in_template_request = new \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest

try {
    $result = $apiInstance->coreCompetencyTemplateHasRelatedData($core_competency_count_competencies_in_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyTemplateHasRelatedData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_count_competencies_in_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyCountCompetenciesInTemplateRequest**](../Model/CoreCompetencyCountCompetenciesInTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyTemplateViewed()`

```php
coreCompetencyTemplateViewed($core_competency_read_template_request): object
```

Log event template viewed

Log event template viewed

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_read_template_request = new \OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest

try {
    $result = $apiInstance->coreCompetencyTemplateViewed($core_competency_read_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyTemplateViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_read_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyReadTemplateRequest**](../Model/CoreCompetencyReadTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUnapprovePlan()`

```php
coreCompetencyUnapprovePlan($core_competency_plan_cancel_review_request_request): object
```

Unapprove a plan.

Unapprove a plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_plan_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyUnapprovePlan($core_competency_plan_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUnapprovePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_plan_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyPlanCancelReviewRequestRequest**](../Model/CoreCompetencyPlanCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUnlinkPlanFromTemplate()`

```php
coreCompetencyUnlinkPlanFromTemplate($core_competency_unlink_plan_from_template_request): object
```

Unlink a plan form it template.

Unlink a plan form it template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_unlink_plan_from_template_request = new \OpenAPI\Client\Model\CoreCompetencyUnlinkPlanFromTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyUnlinkPlanFromTemplateRequest

try {
    $result = $apiInstance->coreCompetencyUnlinkPlanFromTemplate($core_competency_unlink_plan_from_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUnlinkPlanFromTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_unlink_plan_from_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyUnlinkPlanFromTemplateRequest**](../Model/CoreCompetencyUnlinkPlanFromTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUpdateCompetency()`

```php
coreCompetencyUpdateCompetency($core_competency_update_competency_request): object
```

Update a competency.

Update a competency.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_update_competency_request = new \OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyRequest(); // \OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyRequest

try {
    $result = $apiInstance->coreCompetencyUpdateCompetency($core_competency_update_competency_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUpdateCompetency: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_update_competency_request** | [**\OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyRequest**](../Model/CoreCompetencyUpdateCompetencyRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUpdateCompetencyFramework()`

```php
coreCompetencyUpdateCompetencyFramework($core_competency_update_competency_framework_request): object
```

Update a competency framework.

Update a competency framework.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_update_competency_framework_request = new \OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyFrameworkRequest(); // \OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyFrameworkRequest

try {
    $result = $apiInstance->coreCompetencyUpdateCompetencyFramework($core_competency_update_competency_framework_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUpdateCompetencyFramework: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_update_competency_framework_request** | [**\OpenAPI\Client\Model\CoreCompetencyUpdateCompetencyFrameworkRequest**](../Model/CoreCompetencyUpdateCompetencyFrameworkRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUpdateCourseCompetencySettings()`

```php
coreCompetencyUpdateCourseCompetencySettings($core_competency_update_course_competency_settings_request): object
```

Update the course competency settings

Update the course competency settings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_update_course_competency_settings_request = new \OpenAPI\Client\Model\CoreCompetencyUpdateCourseCompetencySettingsRequest(); // \OpenAPI\Client\Model\CoreCompetencyUpdateCourseCompetencySettingsRequest

try {
    $result = $apiInstance->coreCompetencyUpdateCourseCompetencySettings($core_competency_update_course_competency_settings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUpdateCourseCompetencySettings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_update_course_competency_settings_request** | [**\OpenAPI\Client\Model\CoreCompetencyUpdateCourseCompetencySettingsRequest**](../Model/CoreCompetencyUpdateCourseCompetencySettingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUpdatePlan()`

```php
coreCompetencyUpdatePlan($core_competency_update_plan_request): \OpenAPI\Client\Model\CoreCompetencyReadPlan200Response
```

Updates a learning plan.

Updates a learning plan.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_update_plan_request = new \OpenAPI\Client\Model\CoreCompetencyUpdatePlanRequest(); // \OpenAPI\Client\Model\CoreCompetencyUpdatePlanRequest

try {
    $result = $apiInstance->coreCompetencyUpdatePlan($core_competency_update_plan_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUpdatePlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_update_plan_request** | [**\OpenAPI\Client\Model\CoreCompetencyUpdatePlanRequest**](../Model/CoreCompetencyUpdatePlanRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompetencyReadPlan200Response**](../Model/CoreCompetencyReadPlan200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUpdateTemplate()`

```php
coreCompetencyUpdateTemplate($core_competency_update_template_request): object
```

Update a learning plan template.

Update a learning plan template.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_update_template_request = new \OpenAPI\Client\Model\CoreCompetencyUpdateTemplateRequest(); // \OpenAPI\Client\Model\CoreCompetencyUpdateTemplateRequest

try {
    $result = $apiInstance->coreCompetencyUpdateTemplate($core_competency_update_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUpdateTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_update_template_request** | [**\OpenAPI\Client\Model\CoreCompetencyUpdateTemplateRequest**](../Model/CoreCompetencyUpdateTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyCancelReviewRequest()`

```php
coreCompetencyUserCompetencyCancelReviewRequest($core_competency_user_competency_cancel_review_request_request): object
```

Cancel a review request.

Cancel a review request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_cancel_review_request_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyCancelReviewRequestRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyCancelReviewRequestRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyCancelReviewRequest($core_competency_user_competency_cancel_review_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyCancelReviewRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_cancel_review_request_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyCancelReviewRequestRequest**](../Model/CoreCompetencyUserCompetencyCancelReviewRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyPlanViewed()`

```php
coreCompetencyUserCompetencyPlanViewed($core_competency_user_competency_plan_viewed_request): object
```

Log the user competency plan viewed event.

Log the user competency plan viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_plan_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyPlanViewed($core_competency_user_competency_plan_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyPlanViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_plan_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest**](../Model/CoreCompetencyUserCompetencyPlanViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyRequestReview()`

```php
coreCompetencyUserCompetencyRequestReview($core_competency_user_competency_request_review_request): object
```

Request a review.

Request a review.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_request_review_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyRequestReview($core_competency_user_competency_request_review_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyRequestReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_request_review_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest**](../Model/CoreCompetencyUserCompetencyRequestReviewRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyStartReview()`

```php
coreCompetencyUserCompetencyStartReview($core_competency_user_competency_request_review_request): object
```

Start a review.

Start a review.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_request_review_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyStartReview($core_competency_user_competency_request_review_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyStartReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_request_review_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest**](../Model/CoreCompetencyUserCompetencyRequestReviewRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyStopReview()`

```php
coreCompetencyUserCompetencyStopReview($core_competency_user_competency_request_review_request): object
```

Stop a review.

Stop a review.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_request_review_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyStopReview($core_competency_user_competency_request_review_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyStopReview: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_request_review_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyRequestReviewRequest**](../Model/CoreCompetencyUserCompetencyRequestReviewRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyViewed()`

```php
coreCompetencyUserCompetencyViewed($core_competency_user_competency_viewed_request): object
```

Log the user competency viewed event.

Log the user competency viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyViewed($core_competency_user_competency_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyViewed: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedRequest**](../Model/CoreCompetencyUserCompetencyViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyViewedInCourse()`

```php
coreCompetencyUserCompetencyViewedInCourse($core_competency_user_competency_viewed_in_course_request): object
```

Log the user competency viewed in course event

Log the user competency viewed in course event

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_viewed_in_course_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedInCourseRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedInCourseRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyViewedInCourse($core_competency_user_competency_viewed_in_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyViewedInCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_viewed_in_course_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyViewedInCourseRequest**](../Model/CoreCompetencyUserCompetencyViewedInCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompetencyUserCompetencyViewedInPlan()`

```php
coreCompetencyUserCompetencyViewedInPlan($core_competency_user_competency_plan_viewed_request): object
```

Log the user competency viewed in plan event.

Log the user competency viewed in plan event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_user_competency_plan_viewed_request = new \OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest(); // \OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest

try {
    $result = $apiInstance->coreCompetencyUserCompetencyViewedInPlan($core_competency_user_competency_plan_viewed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompetencyUserCompetencyViewedInPlan: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_user_competency_plan_viewed_request** | [**\OpenAPI\Client\Model\CoreCompetencyUserCompetencyPlanViewedRequest**](../Model/CoreCompetencyUserCompetencyPlanViewedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompletionGetActivitiesCompletionStatus()`

```php
coreCompletionGetActivitiesCompletionStatus($core_completion_get_activities_completion_status_request): \OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatus200Response
```

Return the activities completion status for a user in a course.

Return the activities completion status for a user in a course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_get_activities_completion_status_request = new \OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest(); // \OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest

try {
    $result = $apiInstance->coreCompletionGetActivitiesCompletionStatus($core_completion_get_activities_completion_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompletionGetActivitiesCompletionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_get_activities_completion_status_request** | [**\OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest**](../Model/CoreCompletionGetActivitiesCompletionStatusRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatus200Response**](../Model/CoreCompletionGetActivitiesCompletionStatus200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompletionGetCourseCompletionStatus()`

```php
coreCompletionGetCourseCompletionStatus($core_completion_get_activities_completion_status_request): \OpenAPI\Client\Model\CoreCompletionGetCourseCompletionStatus200Response
```

Returns course completion status.

Returns course completion status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_get_activities_completion_status_request = new \OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest(); // \OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest

try {
    $result = $apiInstance->coreCompletionGetCourseCompletionStatus($core_completion_get_activities_completion_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompletionGetCourseCompletionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_get_activities_completion_status_request** | [**\OpenAPI\Client\Model\CoreCompletionGetActivitiesCompletionStatusRequest**](../Model/CoreCompletionGetActivitiesCompletionStatusRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompletionGetCourseCompletionStatus200Response**](../Model/CoreCompletionGetCourseCompletionStatus200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompletionMarkCourseSelfCompleted()`

```php
coreCompletionMarkCourseSelfCompleted($core_completion_mark_course_self_completed_request): \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompleted200Response
```

Update the course completion status for the current user (if course self-completion is enabled).

Update the course completion status for the current user (if course self-completion is enabled).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_mark_course_self_completed_request = new \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest(); // \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest

try {
    $result = $apiInstance->coreCompletionMarkCourseSelfCompleted($core_completion_mark_course_self_completed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompletionMarkCourseSelfCompleted: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_mark_course_self_completed_request** | [**\OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest**](../Model/CoreCompletionMarkCourseSelfCompletedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompleted200Response**](../Model/CoreCompletionMarkCourseSelfCompleted200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompletionOverrideActivityCompletionStatus()`

```php
coreCompletionOverrideActivityCompletionStatus($core_completion_override_activity_completion_status_request): \OpenAPI\Client\Model\CoreCompletionOverrideActivityCompletionStatus200Response
```

Update completion status for a user in an activity by overriding it.

Update completion status for a user in an activity by overriding it.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_override_activity_completion_status_request = new \OpenAPI\Client\Model\CoreCompletionOverrideActivityCompletionStatusRequest(); // \OpenAPI\Client\Model\CoreCompletionOverrideActivityCompletionStatusRequest

try {
    $result = $apiInstance->coreCompletionOverrideActivityCompletionStatus($core_completion_override_activity_completion_status_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompletionOverrideActivityCompletionStatus: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_override_activity_completion_status_request** | [**\OpenAPI\Client\Model\CoreCompletionOverrideActivityCompletionStatusRequest**](../Model/CoreCompletionOverrideActivityCompletionStatusRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompletionOverrideActivityCompletionStatus200Response**](../Model/CoreCompletionOverrideActivityCompletionStatus200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCompletionUpdateActivityCompletionStatusManually()`

```php
coreCompletionUpdateActivityCompletionStatusManually($core_completion_update_activity_completion_status_manually_request): \OpenAPI\Client\Model\CoreCompletionUpdateActivityCompletionStatusManually200Response
```

Update completion status for the current user in an activity, only for activities with manual tracking.

Update completion status for the current user in an activity, only for activities with manual tracking.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_update_activity_completion_status_manually_request = new \OpenAPI\Client\Model\CoreCompletionUpdateActivityCompletionStatusManuallyRequest(); // \OpenAPI\Client\Model\CoreCompletionUpdateActivityCompletionStatusManuallyRequest

try {
    $result = $apiInstance->coreCompletionUpdateActivityCompletionStatusManually($core_completion_update_activity_completion_status_manually_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCompletionUpdateActivityCompletionStatusManually: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_update_activity_completion_status_manually_request** | [**\OpenAPI\Client\Model\CoreCompletionUpdateActivityCompletionStatusManuallyRequest**](../Model/CoreCompletionUpdateActivityCompletionStatusManuallyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCompletionUpdateActivityCompletionStatusManually200Response**](../Model/CoreCompletionUpdateActivityCompletionStatusManually200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreContentbankCopyContent()`

```php
coreContentbankCopyContent($core_contentbank_copy_content_request): \OpenAPI\Client\Model\CoreContentbankCopyContent200Response
```

Copy a content in the content bank.

Copy a content in the content bank.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_contentbank_copy_content_request = new \OpenAPI\Client\Model\CoreContentbankCopyContentRequest(); // \OpenAPI\Client\Model\CoreContentbankCopyContentRequest

try {
    $result = $apiInstance->coreContentbankCopyContent($core_contentbank_copy_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreContentbankCopyContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_contentbank_copy_content_request** | [**\OpenAPI\Client\Model\CoreContentbankCopyContentRequest**](../Model/CoreContentbankCopyContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreContentbankCopyContent200Response**](../Model/CoreContentbankCopyContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreContentbankDeleteContent()`

```php
coreContentbankDeleteContent($core_contentbank_delete_content_request): \OpenAPI\Client\Model\CoreContentbankDeleteContent200Response
```

Delete a content from the content bank.

Delete a content from the content bank.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_contentbank_delete_content_request = new \OpenAPI\Client\Model\CoreContentbankDeleteContentRequest(); // \OpenAPI\Client\Model\CoreContentbankDeleteContentRequest

try {
    $result = $apiInstance->coreContentbankDeleteContent($core_contentbank_delete_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreContentbankDeleteContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_contentbank_delete_content_request** | [**\OpenAPI\Client\Model\CoreContentbankDeleteContentRequest**](../Model/CoreContentbankDeleteContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreContentbankDeleteContent200Response**](../Model/CoreContentbankDeleteContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreContentbankRenameContent()`

```php
coreContentbankRenameContent($core_contentbank_rename_content_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Rename a content in the content bank.

Rename a content in the content bank.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_contentbank_rename_content_request = new \OpenAPI\Client\Model\CoreContentbankRenameContentRequest(); // \OpenAPI\Client\Model\CoreContentbankRenameContentRequest

try {
    $result = $apiInstance->coreContentbankRenameContent($core_contentbank_rename_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreContentbankRenameContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_contentbank_rename_content_request** | [**\OpenAPI\Client\Model\CoreContentbankRenameContentRequest**](../Model/CoreContentbankRenameContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreContentbankRenameContent200Response**](../Model/CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreContentbankSetContentVisibility()`

```php
coreContentbankSetContentVisibility($core_contentbank_set_content_visibility_request): \OpenAPI\Client\Model\CoreContentbankRenameContent200Response
```

Set the visibility of a content in the content bank.

Set the visibility of a content in the content bank.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_contentbank_set_content_visibility_request = new \OpenAPI\Client\Model\CoreContentbankSetContentVisibilityRequest(); // \OpenAPI\Client\Model\CoreContentbankSetContentVisibilityRequest

try {
    $result = $apiInstance->coreContentbankSetContentVisibility($core_contentbank_set_content_visibility_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreContentbankSetContentVisibility: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_contentbank_set_content_visibility_request** | [**\OpenAPI\Client\Model\CoreContentbankSetContentVisibilityRequest**](../Model/CoreContentbankSetContentVisibilityRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreContentbankRenameContent200Response**](../Model/CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseAddContentItemToUserFavourites()`

```php
coreCourseAddContentItemToUserFavourites($core_course_add_content_item_to_user_favourites_request): \OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavourites200Response
```

Adds a content item (activity, resource or their subtypes) to the favourites for the user.

Adds a content item (activity, resource or their subtypes) to the favourites for the user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_add_content_item_to_user_favourites_request = new \OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavouritesRequest(); // \OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavouritesRequest

try {
    $result = $apiInstance->coreCourseAddContentItemToUserFavourites($core_course_add_content_item_to_user_favourites_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseAddContentItemToUserFavourites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_add_content_item_to_user_favourites_request** | [**\OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavouritesRequest**](../Model/CoreCourseAddContentItemToUserFavouritesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavourites200Response**](../Model/CoreCourseAddContentItemToUserFavourites200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseCheckUpdates()`

```php
coreCourseCheckUpdates($core_course_check_updates_request): \OpenAPI\Client\Model\CoreCourseCheckUpdates200Response
```

Check if there is updates affecting the user for the given course and contexts.

Check if there is updates affecting the user for the given course and contexts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_check_updates_request = new \OpenAPI\Client\Model\CoreCourseCheckUpdatesRequest(); // \OpenAPI\Client\Model\CoreCourseCheckUpdatesRequest

try {
    $result = $apiInstance->coreCourseCheckUpdates($core_course_check_updates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseCheckUpdates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_check_updates_request** | [**\OpenAPI\Client\Model\CoreCourseCheckUpdatesRequest**](../Model/CoreCourseCheckUpdatesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseCheckUpdates200Response**](../Model/CoreCourseCheckUpdates200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseCreateCategories()`

```php
coreCourseCreateCategories($core_course_create_categories_request): object
```

Create course categories

Create course categories

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_create_categories_request = new \OpenAPI\Client\Model\CoreCourseCreateCategoriesRequest(); // \OpenAPI\Client\Model\CoreCourseCreateCategoriesRequest

try {
    $result = $apiInstance->coreCourseCreateCategories($core_course_create_categories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseCreateCategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_create_categories_request** | [**\OpenAPI\Client\Model\CoreCourseCreateCategoriesRequest**](../Model/CoreCourseCreateCategoriesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseCreateCourses()`

```php
coreCourseCreateCourses($core_course_create_courses_request): object
```

Create new courses

Create new courses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_create_courses_request = new \OpenAPI\Client\Model\CoreCourseCreateCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseCreateCoursesRequest

try {
    $result = $apiInstance->coreCourseCreateCourses($core_course_create_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseCreateCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_create_courses_request** | [**\OpenAPI\Client\Model\CoreCourseCreateCoursesRequest**](../Model/CoreCourseCreateCoursesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseDeleteCategories()`

```php
coreCourseDeleteCategories($core_course_delete_categories_request): object
```

Delete course categories

Delete course categories

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_delete_categories_request = new \OpenAPI\Client\Model\CoreCourseDeleteCategoriesRequest(); // \OpenAPI\Client\Model\CoreCourseDeleteCategoriesRequest

try {
    $result = $apiInstance->coreCourseDeleteCategories($core_course_delete_categories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseDeleteCategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_delete_categories_request** | [**\OpenAPI\Client\Model\CoreCourseDeleteCategoriesRequest**](../Model/CoreCourseDeleteCategoriesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseDeleteCourses()`

```php
coreCourseDeleteCourses($core_course_delete_courses_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Deletes all specified courses

Deletes all specified courses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_delete_courses_request = new \OpenAPI\Client\Model\CoreCourseDeleteCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseDeleteCoursesRequest

try {
    $result = $apiInstance->coreCourseDeleteCourses($core_course_delete_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseDeleteCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_delete_courses_request** | [**\OpenAPI\Client\Model\CoreCourseDeleteCoursesRequest**](../Model/CoreCourseDeleteCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseDeleteModules()`

```php
coreCourseDeleteModules($core_course_delete_modules_request): object
```

Deletes all specified module instances

Deletes all specified module instances

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_delete_modules_request = new \OpenAPI\Client\Model\CoreCourseDeleteModulesRequest(); // \OpenAPI\Client\Model\CoreCourseDeleteModulesRequest

try {
    $result = $apiInstance->coreCourseDeleteModules($core_course_delete_modules_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseDeleteModules: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_delete_modules_request** | [**\OpenAPI\Client\Model\CoreCourseDeleteModulesRequest**](../Model/CoreCourseDeleteModulesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseDuplicateCourse()`

```php
coreCourseDuplicateCourse($core_course_duplicate_course_request): \OpenAPI\Client\Model\CoreCourseDuplicateCourse200Response
```

Duplicate an existing course (creating a new one).

Duplicate an existing course (creating a new one).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_duplicate_course_request = new \OpenAPI\Client\Model\CoreCourseDuplicateCourseRequest(); // \OpenAPI\Client\Model\CoreCourseDuplicateCourseRequest

try {
    $result = $apiInstance->coreCourseDuplicateCourse($core_course_duplicate_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseDuplicateCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_duplicate_course_request** | [**\OpenAPI\Client\Model\CoreCourseDuplicateCourseRequest**](../Model/CoreCourseDuplicateCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseDuplicateCourse200Response**](../Model/CoreCourseDuplicateCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseEditModule()`

```php
coreCourseEditModule($core_course_edit_module_request): object
```

Performs an action on course module (change visibility, duplicate, delete, etc.)

Performs an action on course module (change visibility, duplicate, delete, etc.)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_edit_module_request = new \OpenAPI\Client\Model\CoreCourseEditModuleRequest(); // \OpenAPI\Client\Model\CoreCourseEditModuleRequest

try {
    $result = $apiInstance->coreCourseEditModule($core_course_edit_module_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseEditModule: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_edit_module_request** | [**\OpenAPI\Client\Model\CoreCourseEditModuleRequest**](../Model/CoreCourseEditModuleRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseEditSection()`

```php
coreCourseEditSection($core_course_edit_section_request): object
```

Performs an action on course section (change visibility, set marker, delete)

Performs an action on course section (change visibility, set marker, delete)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_edit_section_request = new \OpenAPI\Client\Model\CoreCourseEditSectionRequest(); // \OpenAPI\Client\Model\CoreCourseEditSectionRequest

try {
    $result = $apiInstance->coreCourseEditSection($core_course_edit_section_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseEditSection: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_edit_section_request** | [**\OpenAPI\Client\Model\CoreCourseEditSectionRequest**](../Model/CoreCourseEditSectionRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetActivityChooserFooter()`

```php
coreCourseGetActivityChooserFooter($core_course_get_activity_chooser_footer_request): \OpenAPI\Client\Model\CoreCourseGetActivityChooserFooter200Response
```

Fetch the data for the activity chooser footer.

Fetch the data for the activity chooser footer.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_activity_chooser_footer_request = new \OpenAPI\Client\Model\CoreCourseGetActivityChooserFooterRequest(); // \OpenAPI\Client\Model\CoreCourseGetActivityChooserFooterRequest

try {
    $result = $apiInstance->coreCourseGetActivityChooserFooter($core_course_get_activity_chooser_footer_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetActivityChooserFooter: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_activity_chooser_footer_request** | [**\OpenAPI\Client\Model\CoreCourseGetActivityChooserFooterRequest**](../Model/CoreCourseGetActivityChooserFooterRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetActivityChooserFooter200Response**](../Model/CoreCourseGetActivityChooserFooter200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCategories()`

```php
coreCourseGetCategories($core_course_get_categories_request): object
```

Return category details

Return category details

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_categories_request = new \OpenAPI\Client\Model\CoreCourseGetCategoriesRequest(); // \OpenAPI\Client\Model\CoreCourseGetCategoriesRequest

try {
    $result = $apiInstance->coreCourseGetCategories($core_course_get_categories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_categories_request** | [**\OpenAPI\Client\Model\CoreCourseGetCategoriesRequest**](../Model/CoreCourseGetCategoriesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetContents()`

```php
coreCourseGetContents($core_course_get_contents_request): object
```

Get course contents

Get course contents

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_contents_request = new \OpenAPI\Client\Model\CoreCourseGetContentsRequest(); // \OpenAPI\Client\Model\CoreCourseGetContentsRequest

try {
    $result = $apiInstance->coreCourseGetContents($core_course_get_contents_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetContents: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_contents_request** | [**\OpenAPI\Client\Model\CoreCourseGetContentsRequest**](../Model/CoreCourseGetContentsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCourseContentItems()`

```php
coreCourseGetCourseContentItems($core_course_get_course_content_items_request): \OpenAPI\Client\Model\CoreCourseGetCourseContentItems200Response
```

Fetch all the content items (activities, resources and their subtypes) for the activity picker

Fetch all the content items (activities, resources and their subtypes) for the activity picker

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_course_content_items_request = new \OpenAPI\Client\Model\CoreCourseGetCourseContentItemsRequest(); // \OpenAPI\Client\Model\CoreCourseGetCourseContentItemsRequest

try {
    $result = $apiInstance->coreCourseGetCourseContentItems($core_course_get_course_content_items_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCourseContentItems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_course_content_items_request** | [**\OpenAPI\Client\Model\CoreCourseGetCourseContentItemsRequest**](../Model/CoreCourseGetCourseContentItemsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetCourseContentItems200Response**](../Model/CoreCourseGetCourseContentItems200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCourseModule()`

```php
coreCourseGetCourseModule($core_competency_list_course_module_competencies_request): \OpenAPI\Client\Model\CoreCourseGetCourseModule200Response
```

Return information about a course module

Return information about a course module

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_competency_list_course_module_competencies_request = new \OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest(); // \OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest

try {
    $result = $apiInstance->coreCourseGetCourseModule($core_competency_list_course_module_competencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCourseModule: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_competency_list_course_module_competencies_request** | [**\OpenAPI\Client\Model\CoreCompetencyListCourseModuleCompetenciesRequest**](../Model/CoreCompetencyListCourseModuleCompetenciesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetCourseModule200Response**](../Model/CoreCourseGetCourseModule200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCourseModuleByInstance()`

```php
coreCourseGetCourseModuleByInstance($core_course_get_course_module_by_instance_request): \OpenAPI\Client\Model\CoreCourseGetCourseModuleByInstance200Response
```

Return information about a given module name and instance id

Return information about a given module name and instance id

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_course_module_by_instance_request = new \OpenAPI\Client\Model\CoreCourseGetCourseModuleByInstanceRequest(); // \OpenAPI\Client\Model\CoreCourseGetCourseModuleByInstanceRequest

try {
    $result = $apiInstance->coreCourseGetCourseModuleByInstance($core_course_get_course_module_by_instance_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCourseModuleByInstance: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_course_module_by_instance_request** | [**\OpenAPI\Client\Model\CoreCourseGetCourseModuleByInstanceRequest**](../Model/CoreCourseGetCourseModuleByInstanceRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetCourseModuleByInstance200Response**](../Model/CoreCourseGetCourseModuleByInstance200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCourses()`

```php
coreCourseGetCourses($core_course_get_courses_request): object
```

Return course details

Return course details

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_courses_request = new \OpenAPI\Client\Model\CoreCourseGetCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseGetCoursesRequest

try {
    $result = $apiInstance->coreCourseGetCourses($core_course_get_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_courses_request** | [**\OpenAPI\Client\Model\CoreCourseGetCoursesRequest**](../Model/CoreCourseGetCoursesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetCoursesByField()`

```php
coreCourseGetCoursesByField($core_course_get_courses_by_field_request): \OpenAPI\Client\Model\CoreCourseGetCoursesByField200Response
```

Get courses matching a specific field (id/s, shortname, idnumber, category)

Get courses matching a specific field (id/s, shortname, idnumber, category)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_courses_by_field_request = new \OpenAPI\Client\Model\CoreCourseGetCoursesByFieldRequest(); // \OpenAPI\Client\Model\CoreCourseGetCoursesByFieldRequest

try {
    $result = $apiInstance->coreCourseGetCoursesByField($core_course_get_courses_by_field_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetCoursesByField: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_courses_by_field_request** | [**\OpenAPI\Client\Model\CoreCourseGetCoursesByFieldRequest**](../Model/CoreCourseGetCoursesByFieldRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetCoursesByField200Response**](../Model/CoreCourseGetCoursesByField200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetEnrolledCoursesByTimelineClassification()`

```php
coreCourseGetEnrolledCoursesByTimelineClassification($core_course_get_enrolled_courses_by_timeline_classification_request): \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassification200Response
```

List of enrolled courses for the given timeline classification (past, inprogress, or future).

List of enrolled courses for the given timeline classification (past, inprogress, or future).

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_enrolled_courses_by_timeline_classification_request = new \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassificationRequest(); // \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassificationRequest

try {
    $result = $apiInstance->coreCourseGetEnrolledCoursesByTimelineClassification($core_course_get_enrolled_courses_by_timeline_classification_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetEnrolledCoursesByTimelineClassification: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_enrolled_courses_by_timeline_classification_request** | [**\OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassificationRequest**](../Model/CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesByTimelineClassification200Response**](../Model/CoreCourseGetEnrolledCoursesByTimelineClassification200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification()`

```php
coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification($core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request): \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response
```

List of enrolled courses with action events in a given timeframe, for the given timeline classification.

List of enrolled courses with action events in a given timeframe, for the given timeline classification.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request = new \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(); // \OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest

try {
    $result = $apiInstance->coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification($core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_enrolled_courses_with_action_events_by_timeline_classification_request** | [**\OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest**](../Model/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response**](../Model/CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetEnrolledUsersByCmid()`

```php
coreCourseGetEnrolledUsersByCmid($core_course_get_enrolled_users_by_cmid_request): \OpenAPI\Client\Model\CoreCourseGetEnrolledUsersByCmid200Response
```

List users by course module id, filter by group and active enrolment status.

List users by course module id, filter by group and active enrolment status.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_enrolled_users_by_cmid_request = new \OpenAPI\Client\Model\CoreCourseGetEnrolledUsersByCmidRequest(); // \OpenAPI\Client\Model\CoreCourseGetEnrolledUsersByCmidRequest

try {
    $result = $apiInstance->coreCourseGetEnrolledUsersByCmid($core_course_get_enrolled_users_by_cmid_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetEnrolledUsersByCmid: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_enrolled_users_by_cmid_request** | [**\OpenAPI\Client\Model\CoreCourseGetEnrolledUsersByCmidRequest**](../Model/CoreCourseGetEnrolledUsersByCmidRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetEnrolledUsersByCmid200Response**](../Model/CoreCourseGetEnrolledUsersByCmid200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetModule()`

```php
coreCourseGetModule($core_course_get_module_request): object
```

Returns html with one activity module on course page

Returns html with one activity module on course page

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_module_request = new \OpenAPI\Client\Model\CoreCourseGetModuleRequest(); // \OpenAPI\Client\Model\CoreCourseGetModuleRequest

try {
    $result = $apiInstance->coreCourseGetModule($core_course_get_module_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetModule: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_module_request** | [**\OpenAPI\Client\Model\CoreCourseGetModuleRequest**](../Model/CoreCourseGetModuleRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetRecentCourses()`

```php
coreCourseGetRecentCourses($core_course_get_recent_courses_request): object
```

List of courses a user has accessed most recently.

List of courses a user has accessed most recently.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_recent_courses_request = new \OpenAPI\Client\Model\CoreCourseGetRecentCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseGetRecentCoursesRequest

try {
    $result = $apiInstance->coreCourseGetRecentCourses($core_course_get_recent_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetRecentCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_recent_courses_request** | [**\OpenAPI\Client\Model\CoreCourseGetRecentCoursesRequest**](../Model/CoreCourseGetRecentCoursesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetUpdatesSince()`

```php
coreCourseGetUpdatesSince($core_course_get_updates_since_request): \OpenAPI\Client\Model\CoreCourseGetUpdatesSince200Response
```

Check if there are updates affecting the user for the given course since the given time stamp.

Check if there are updates affecting the user for the given course since the given time stamp.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_updates_since_request = new \OpenAPI\Client\Model\CoreCourseGetUpdatesSinceRequest(); // \OpenAPI\Client\Model\CoreCourseGetUpdatesSinceRequest

try {
    $result = $apiInstance->coreCourseGetUpdatesSince($core_course_get_updates_since_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetUpdatesSince: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_updates_since_request** | [**\OpenAPI\Client\Model\CoreCourseGetUpdatesSinceRequest**](../Model/CoreCourseGetUpdatesSinceRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetUpdatesSince200Response**](../Model/CoreCourseGetUpdatesSince200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetUserAdministrationOptions()`

```php
coreCourseGetUserAdministrationOptions($core_course_get_user_administration_options_request): \OpenAPI\Client\Model\CoreCourseGetUserAdministrationOptions200Response
```

Return a list of administration options in a set of courses that are avaialable or not for the current                             user.

Return a list of administration options in a set of courses that are avaialable or not for the current                             user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_user_administration_options_request = new \OpenAPI\Client\Model\CoreCourseGetUserAdministrationOptionsRequest(); // \OpenAPI\Client\Model\CoreCourseGetUserAdministrationOptionsRequest

try {
    $result = $apiInstance->coreCourseGetUserAdministrationOptions($core_course_get_user_administration_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetUserAdministrationOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_user_administration_options_request** | [**\OpenAPI\Client\Model\CoreCourseGetUserAdministrationOptionsRequest**](../Model/CoreCourseGetUserAdministrationOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetUserAdministrationOptions200Response**](../Model/CoreCourseGetUserAdministrationOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseGetUserNavigationOptions()`

```php
coreCourseGetUserNavigationOptions($core_course_get_user_navigation_options_request): \OpenAPI\Client\Model\CoreCourseGetUserNavigationOptions200Response
```

Return a list of navigation options in a set of courses that are avaialable or not for the current user.

Return a list of navigation options in a set of courses that are avaialable or not for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_get_user_navigation_options_request = new \OpenAPI\Client\Model\CoreCourseGetUserNavigationOptionsRequest(); // \OpenAPI\Client\Model\CoreCourseGetUserNavigationOptionsRequest

try {
    $result = $apiInstance->coreCourseGetUserNavigationOptions($core_course_get_user_navigation_options_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseGetUserNavigationOptions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_get_user_navigation_options_request** | [**\OpenAPI\Client\Model\CoreCourseGetUserNavigationOptionsRequest**](../Model/CoreCourseGetUserNavigationOptionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseGetUserNavigationOptions200Response**](../Model/CoreCourseGetUserNavigationOptions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseImportCourse()`

```php
coreCourseImportCourse($core_course_import_course_request): object
```

Import course data from a course into another course. Does not include any user data.

Import course data from a course into another course. Does not include any user data.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_import_course_request = new \OpenAPI\Client\Model\CoreCourseImportCourseRequest(); // \OpenAPI\Client\Model\CoreCourseImportCourseRequest

try {
    $result = $apiInstance->coreCourseImportCourse($core_course_import_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseImportCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_import_course_request** | [**\OpenAPI\Client\Model\CoreCourseImportCourseRequest**](../Model/CoreCourseImportCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseRemoveContentItemFromUserFavourites()`

```php
coreCourseRemoveContentItemFromUserFavourites($core_course_remove_content_item_from_user_favourites_request): \OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavourites200Response
```

Removes a content item (activity, resource or their subtypes) from the favourites for the user.

Removes a content item (activity, resource or their subtypes) from the favourites for the user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_remove_content_item_from_user_favourites_request = new \OpenAPI\Client\Model\CoreCourseRemoveContentItemFromUserFavouritesRequest(); // \OpenAPI\Client\Model\CoreCourseRemoveContentItemFromUserFavouritesRequest

try {
    $result = $apiInstance->coreCourseRemoveContentItemFromUserFavourites($core_course_remove_content_item_from_user_favourites_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseRemoveContentItemFromUserFavourites: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_remove_content_item_from_user_favourites_request** | [**\OpenAPI\Client\Model\CoreCourseRemoveContentItemFromUserFavouritesRequest**](../Model/CoreCourseRemoveContentItemFromUserFavouritesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseAddContentItemToUserFavourites200Response**](../Model/CoreCourseAddContentItemToUserFavourites200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseSearchCourses()`

```php
coreCourseSearchCourses($core_course_search_courses_request): \OpenAPI\Client\Model\CoreCourseSearchCourses200Response
```

Search courses by (name, module, block, tag)

Search courses by (name, module, block, tag)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_search_courses_request = new \OpenAPI\Client\Model\CoreCourseSearchCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseSearchCoursesRequest

try {
    $result = $apiInstance->coreCourseSearchCourses($core_course_search_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseSearchCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_search_courses_request** | [**\OpenAPI\Client\Model\CoreCourseSearchCoursesRequest**](../Model/CoreCourseSearchCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseSearchCourses200Response**](../Model/CoreCourseSearchCourses200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseSetFavouriteCourses()`

```php
coreCourseSetFavouriteCourses($core_course_set_favourite_courses_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Add a list of courses to the list of favourite courses.

Add a list of courses to the list of favourite courses.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_set_favourite_courses_request = new \OpenAPI\Client\Model\CoreCourseSetFavouriteCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseSetFavouriteCoursesRequest

try {
    $result = $apiInstance->coreCourseSetFavouriteCourses($core_course_set_favourite_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseSetFavouriteCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_set_favourite_courses_request** | [**\OpenAPI\Client\Model\CoreCourseSetFavouriteCoursesRequest**](../Model/CoreCourseSetFavouriteCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseToggleActivityRecommendation()`

```php
coreCourseToggleActivityRecommendation($core_course_toggle_activity_recommendation_request): \OpenAPI\Client\Model\CoreCourseToggleActivityRecommendation200Response
```

Adds or removes an activity as a recommendation in the activity chooser.

Adds or removes an activity as a recommendation in the activity chooser.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_toggle_activity_recommendation_request = new \OpenAPI\Client\Model\CoreCourseToggleActivityRecommendationRequest(); // \OpenAPI\Client\Model\CoreCourseToggleActivityRecommendationRequest

try {
    $result = $apiInstance->coreCourseToggleActivityRecommendation($core_course_toggle_activity_recommendation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseToggleActivityRecommendation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_toggle_activity_recommendation_request** | [**\OpenAPI\Client\Model\CoreCourseToggleActivityRecommendationRequest**](../Model/CoreCourseToggleActivityRecommendationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCourseToggleActivityRecommendation200Response**](../Model/CoreCourseToggleActivityRecommendation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseUpdateCategories()`

```php
coreCourseUpdateCategories($core_course_update_categories_request): object
```

Update categories

Update categories

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_update_categories_request = new \OpenAPI\Client\Model\CoreCourseUpdateCategoriesRequest(); // \OpenAPI\Client\Model\CoreCourseUpdateCategoriesRequest

try {
    $result = $apiInstance->coreCourseUpdateCategories($core_course_update_categories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseUpdateCategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_update_categories_request** | [**\OpenAPI\Client\Model\CoreCourseUpdateCategoriesRequest**](../Model/CoreCourseUpdateCategoriesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseUpdateCourses()`

```php
coreCourseUpdateCourses($core_course_update_courses_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Update courses

Update courses

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_update_courses_request = new \OpenAPI\Client\Model\CoreCourseUpdateCoursesRequest(); // \OpenAPI\Client\Model\CoreCourseUpdateCoursesRequest

try {
    $result = $apiInstance->coreCourseUpdateCourses($core_course_update_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseUpdateCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_update_courses_request** | [**\OpenAPI\Client\Model\CoreCourseUpdateCoursesRequest**](../Model/CoreCourseUpdateCoursesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseViewCourse()`

```php
coreCourseViewCourse($core_course_view_course_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Log that the course was viewed

Log that the course was viewed

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_course_view_course_request = new \OpenAPI\Client\Model\CoreCourseViewCourseRequest(); // \OpenAPI\Client\Model\CoreCourseViewCourseRequest

try {
    $result = $apiInstance->coreCourseViewCourse($core_course_view_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseViewCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_course_view_course_request** | [**\OpenAPI\Client\Model\CoreCourseViewCourseRequest**](../Model/CoreCourseViewCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseformatFileHandlers()`

```php
coreCourseformatFileHandlers($core_courseformat_file_handlers_request): object
```

Get the current course file hanlders.

Get the current course file hanlders.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_courseformat_file_handlers_request = new \OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest(); // \OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest

try {
    $result = $apiInstance->coreCourseformatFileHandlers($core_courseformat_file_handlers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseformatFileHandlers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_courseformat_file_handlers_request** | [**\OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest**](../Model/CoreCourseformatFileHandlersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseformatGetState()`

```php
coreCourseformatGetState($core_courseformat_file_handlers_request): object
```

Get the current course state.

Get the current course state.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_courseformat_file_handlers_request = new \OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest(); // \OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest

try {
    $result = $apiInstance->coreCourseformatGetState($core_courseformat_file_handlers_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseformatGetState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_courseformat_file_handlers_request** | [**\OpenAPI\Client\Model\CoreCourseformatFileHandlersRequest**](../Model/CoreCourseformatFileHandlersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCourseformatUpdateCourse()`

```php
coreCourseformatUpdateCourse($core_courseformat_update_course_request): object
```

Update course contents.

Update course contents.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_courseformat_update_course_request = new \OpenAPI\Client\Model\CoreCourseformatUpdateCourseRequest(); // \OpenAPI\Client\Model\CoreCourseformatUpdateCourseRequest

try {
    $result = $apiInstance->coreCourseformatUpdateCourse($core_courseformat_update_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCourseformatUpdateCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_courseformat_update_course_request** | [**\OpenAPI\Client\Model\CoreCourseformatUpdateCourseRequest**](../Model/CoreCourseformatUpdateCourseRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCreateUserfeedbackActionRecord()`

```php
coreCreateUserfeedbackActionRecord($core_create_userfeedback_action_record_request): object
```

Record the action that the user takes in the user feedback notification for future use.

Record the action that the user takes in the user feedback notification for future use.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_create_userfeedback_action_record_request = new \OpenAPI\Client\Model\CoreCreateUserfeedbackActionRecordRequest(); // \OpenAPI\Client\Model\CoreCreateUserfeedbackActionRecordRequest

try {
    $result = $apiInstance->coreCreateUserfeedbackActionRecord($core_create_userfeedback_action_record_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCreateUserfeedbackActionRecord: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_create_userfeedback_action_record_request** | [**\OpenAPI\Client\Model\CoreCreateUserfeedbackActionRecordRequest**](../Model/CoreCreateUserfeedbackActionRecordRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldCreateCategory()`

```php
coreCustomfieldCreateCategory($core_customfield_create_category_request): object
```

Creates a new category

Creates a new category

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_create_category_request = new \OpenAPI\Client\Model\CoreCustomfieldCreateCategoryRequest(); // \OpenAPI\Client\Model\CoreCustomfieldCreateCategoryRequest

try {
    $result = $apiInstance->coreCustomfieldCreateCategory($core_customfield_create_category_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldCreateCategory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_create_category_request** | [**\OpenAPI\Client\Model\CoreCustomfieldCreateCategoryRequest**](../Model/CoreCustomfieldCreateCategoryRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldDeleteCategory()`

```php
coreCustomfieldDeleteCategory($core_customfield_delete_category_request): object
```

Deletes a category

Deletes a category

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_delete_category_request = new \OpenAPI\Client\Model\CoreCustomfieldDeleteCategoryRequest(); // \OpenAPI\Client\Model\CoreCustomfieldDeleteCategoryRequest

try {
    $result = $apiInstance->coreCustomfieldDeleteCategory($core_customfield_delete_category_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldDeleteCategory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_delete_category_request** | [**\OpenAPI\Client\Model\CoreCustomfieldDeleteCategoryRequest**](../Model/CoreCustomfieldDeleteCategoryRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldDeleteField()`

```php
coreCustomfieldDeleteField($core_customfield_delete_field_request): object
```

Deletes an entry

Deletes an entry

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_delete_field_request = new \OpenAPI\Client\Model\CoreCustomfieldDeleteFieldRequest(); // \OpenAPI\Client\Model\CoreCustomfieldDeleteFieldRequest

try {
    $result = $apiInstance->coreCustomfieldDeleteField($core_customfield_delete_field_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldDeleteField: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_delete_field_request** | [**\OpenAPI\Client\Model\CoreCustomfieldDeleteFieldRequest**](../Model/CoreCustomfieldDeleteFieldRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldMoveCategory()`

```php
coreCustomfieldMoveCategory($core_customfield_move_category_request): object
```

Drag and drop categories

Drag and drop categories

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_move_category_request = new \OpenAPI\Client\Model\CoreCustomfieldMoveCategoryRequest(); // \OpenAPI\Client\Model\CoreCustomfieldMoveCategoryRequest

try {
    $result = $apiInstance->coreCustomfieldMoveCategory($core_customfield_move_category_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldMoveCategory: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_move_category_request** | [**\OpenAPI\Client\Model\CoreCustomfieldMoveCategoryRequest**](../Model/CoreCustomfieldMoveCategoryRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldMoveField()`

```php
coreCustomfieldMoveField($core_customfield_move_field_request): object
```

Drag and drop

Drag and drop

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_move_field_request = new \OpenAPI\Client\Model\CoreCustomfieldMoveFieldRequest(); // \OpenAPI\Client\Model\CoreCustomfieldMoveFieldRequest

try {
    $result = $apiInstance->coreCustomfieldMoveField($core_customfield_move_field_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldMoveField: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_move_field_request** | [**\OpenAPI\Client\Model\CoreCustomfieldMoveFieldRequest**](../Model/CoreCustomfieldMoveFieldRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreCustomfieldReloadTemplate()`

```php
coreCustomfieldReloadTemplate($core_customfield_reload_template_request): \OpenAPI\Client\Model\CoreCustomfieldReloadTemplate200Response
```

Reloads template

Reloads template

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_customfield_reload_template_request = new \OpenAPI\Client\Model\CoreCustomfieldReloadTemplateRequest(); // \OpenAPI\Client\Model\CoreCustomfieldReloadTemplateRequest

try {
    $result = $apiInstance->coreCustomfieldReloadTemplate($core_customfield_reload_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreCustomfieldReloadTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_customfield_reload_template_request** | [**\OpenAPI\Client\Model\CoreCustomfieldReloadTemplateRequest**](../Model/CoreCustomfieldReloadTemplateRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCustomfieldReloadTemplate200Response**](../Model/CoreCustomfieldReloadTemplate200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreDynamicTabsGetContent()`

```php
coreDynamicTabsGetContent($core_dynamic_tabs_get_content_request): \OpenAPI\Client\Model\CoreDynamicTabsGetContent200Response
```

Returns the content for a dynamic tab

Returns the content for a dynamic tab

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_dynamic_tabs_get_content_request = new \OpenAPI\Client\Model\CoreDynamicTabsGetContentRequest(); // \OpenAPI\Client\Model\CoreDynamicTabsGetContentRequest

try {
    $result = $apiInstance->coreDynamicTabsGetContent($core_dynamic_tabs_get_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreDynamicTabsGetContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_dynamic_tabs_get_content_request** | [**\OpenAPI\Client\Model\CoreDynamicTabsGetContentRequest**](../Model/CoreDynamicTabsGetContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreDynamicTabsGetContent200Response**](../Model/CoreDynamicTabsGetContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolGetCourseEnrolmentMethods()`

```php
coreEnrolGetCourseEnrolmentMethods($core_enrol_get_course_enrolment_methods_request): object
```

Get the list of course enrolment methods

Get the list of course enrolment methods

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_get_course_enrolment_methods_request = new \OpenAPI\Client\Model\CoreEnrolGetCourseEnrolmentMethodsRequest(); // \OpenAPI\Client\Model\CoreEnrolGetCourseEnrolmentMethodsRequest

try {
    $result = $apiInstance->coreEnrolGetCourseEnrolmentMethods($core_enrol_get_course_enrolment_methods_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolGetCourseEnrolmentMethods: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_get_course_enrolment_methods_request** | [**\OpenAPI\Client\Model\CoreEnrolGetCourseEnrolmentMethodsRequest**](../Model/CoreEnrolGetCourseEnrolmentMethodsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolGetEnrolledUsers()`

```php
coreEnrolGetEnrolledUsers($core_enrol_get_enrolled_users_request): object
```

Get enrolled users by course id.

Get enrolled users by course id.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_get_enrolled_users_request = new \OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersRequest(); // \OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersRequest

try {
    $result = $apiInstance->coreEnrolGetEnrolledUsers($core_enrol_get_enrolled_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolGetEnrolledUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_get_enrolled_users_request** | [**\OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersRequest**](../Model/CoreEnrolGetEnrolledUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolGetEnrolledUsersWithCapability()`

```php
coreEnrolGetEnrolledUsersWithCapability($core_enrol_get_enrolled_users_with_capability_request): object
```

For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability

For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_get_enrolled_users_with_capability_request = new \OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersWithCapabilityRequest(); // \OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersWithCapabilityRequest

try {
    $result = $apiInstance->coreEnrolGetEnrolledUsersWithCapability($core_enrol_get_enrolled_users_with_capability_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolGetEnrolledUsersWithCapability: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_get_enrolled_users_with_capability_request** | [**\OpenAPI\Client\Model\CoreEnrolGetEnrolledUsersWithCapabilityRequest**](../Model/CoreEnrolGetEnrolledUsersWithCapabilityRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolGetPotentialUsers()`

```php
coreEnrolGetPotentialUsers($core_enrol_get_potential_users_request): object
```

Get the list of potential users to enrol

Get the list of potential users to enrol

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_get_potential_users_request = new \OpenAPI\Client\Model\CoreEnrolGetPotentialUsersRequest(); // \OpenAPI\Client\Model\CoreEnrolGetPotentialUsersRequest

try {
    $result = $apiInstance->coreEnrolGetPotentialUsers($core_enrol_get_potential_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolGetPotentialUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_get_potential_users_request** | [**\OpenAPI\Client\Model\CoreEnrolGetPotentialUsersRequest**](../Model/CoreEnrolGetPotentialUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolGetUsersCourses()`

```php
coreEnrolGetUsersCourses($core_enrol_get_users_courses_request): object
```

Get the list of courses where a user is enrolled in

Get the list of courses where a user is enrolled in

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_get_users_courses_request = new \OpenAPI\Client\Model\CoreEnrolGetUsersCoursesRequest(); // \OpenAPI\Client\Model\CoreEnrolGetUsersCoursesRequest

try {
    $result = $apiInstance->coreEnrolGetUsersCourses($core_enrol_get_users_courses_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolGetUsersCourses: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_get_users_courses_request** | [**\OpenAPI\Client\Model\CoreEnrolGetUsersCoursesRequest**](../Model/CoreEnrolGetUsersCoursesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolSearchUsers()`

```php
coreEnrolSearchUsers($core_enrol_search_users_request): object
```

Search within the list of course participants

Search within the list of course participants

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_search_users_request = new \OpenAPI\Client\Model\CoreEnrolSearchUsersRequest(); // \OpenAPI\Client\Model\CoreEnrolSearchUsersRequest

try {
    $result = $apiInstance->coreEnrolSearchUsers($core_enrol_search_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolSearchUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_search_users_request** | [**\OpenAPI\Client\Model\CoreEnrolSearchUsersRequest**](../Model/CoreEnrolSearchUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolSubmitUserEnrolmentForm()`

```php
coreEnrolSubmitUserEnrolmentForm($core_enrol_submit_user_enrolment_form_request): \OpenAPI\Client\Model\CoreEnrolSubmitUserEnrolmentForm200Response
```

Submit form data for enrolment form

Submit form data for enrolment form

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_submit_user_enrolment_form_request = new \OpenAPI\Client\Model\CoreEnrolSubmitUserEnrolmentFormRequest(); // \OpenAPI\Client\Model\CoreEnrolSubmitUserEnrolmentFormRequest

try {
    $result = $apiInstance->coreEnrolSubmitUserEnrolmentForm($core_enrol_submit_user_enrolment_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolSubmitUserEnrolmentForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_submit_user_enrolment_form_request** | [**\OpenAPI\Client\Model\CoreEnrolSubmitUserEnrolmentFormRequest**](../Model/CoreEnrolSubmitUserEnrolmentFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreEnrolSubmitUserEnrolmentForm200Response**](../Model/CoreEnrolSubmitUserEnrolmentForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreEnrolUnenrolUserEnrolment()`

```php
coreEnrolUnenrolUserEnrolment($core_enrol_unenrol_user_enrolment_request): \OpenAPI\Client\Model\CoreEnrolUnenrolUserEnrolment200Response
```

External function that unenrols a given user enrolment

External function that unenrols a given user enrolment

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_enrol_unenrol_user_enrolment_request = new \OpenAPI\Client\Model\CoreEnrolUnenrolUserEnrolmentRequest(); // \OpenAPI\Client\Model\CoreEnrolUnenrolUserEnrolmentRequest

try {
    $result = $apiInstance->coreEnrolUnenrolUserEnrolment($core_enrol_unenrol_user_enrolment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreEnrolUnenrolUserEnrolment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_enrol_unenrol_user_enrolment_request** | [**\OpenAPI\Client\Model\CoreEnrolUnenrolUserEnrolmentRequest**](../Model/CoreEnrolUnenrolUserEnrolmentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreEnrolUnenrolUserEnrolment200Response**](../Model/CoreEnrolUnenrolUserEnrolment200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFetchNotifications()`

```php
coreFetchNotifications($core_fetch_notifications_request): object
```

Return a list of notifications for the current session

Return a list of notifications for the current session

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_fetch_notifications_request = new \OpenAPI\Client\Model\CoreFetchNotificationsRequest(); // \OpenAPI\Client\Model\CoreFetchNotificationsRequest

try {
    $result = $apiInstance->coreFetchNotifications($core_fetch_notifications_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFetchNotifications: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_fetch_notifications_request** | [**\OpenAPI\Client\Model\CoreFetchNotificationsRequest**](../Model/CoreFetchNotificationsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFilesDeleteDraftFiles()`

```php
coreFilesDeleteDraftFiles($core_files_delete_draft_files_request): \OpenAPI\Client\Model\CoreFilesDeleteDraftFiles200Response
```

Delete the indicated files (or directories) from a user draft file area.

Delete the indicated files (or directories) from a user draft file area.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_files_delete_draft_files_request = new \OpenAPI\Client\Model\CoreFilesDeleteDraftFilesRequest(); // \OpenAPI\Client\Model\CoreFilesDeleteDraftFilesRequest

try {
    $result = $apiInstance->coreFilesDeleteDraftFiles($core_files_delete_draft_files_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFilesDeleteDraftFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_files_delete_draft_files_request** | [**\OpenAPI\Client\Model\CoreFilesDeleteDraftFilesRequest**](../Model/CoreFilesDeleteDraftFilesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFilesDeleteDraftFiles200Response**](../Model/CoreFilesDeleteDraftFiles200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFilesGetFiles()`

```php
coreFilesGetFiles($core_files_get_files_request): \OpenAPI\Client\Model\CoreFilesGetFiles200Response
```

browse moodle files

browse moodle files

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_files_get_files_request = new \OpenAPI\Client\Model\CoreFilesGetFilesRequest(); // \OpenAPI\Client\Model\CoreFilesGetFilesRequest

try {
    $result = $apiInstance->coreFilesGetFiles($core_files_get_files_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFilesGetFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_files_get_files_request** | [**\OpenAPI\Client\Model\CoreFilesGetFilesRequest**](../Model/CoreFilesGetFilesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFilesGetFiles200Response**](../Model/CoreFilesGetFiles200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFilesGetUnusedDraftItemid()`

```php
coreFilesGetUnusedDraftItemid(): \OpenAPI\Client\Model\CoreFilesGetUnusedDraftItemid200Response
```

Generate a new draft itemid for the current user.

Generate a new draft itemid for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreFilesGetUnusedDraftItemid();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFilesGetUnusedDraftItemid: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreFilesGetUnusedDraftItemid200Response**](../Model/CoreFilesGetUnusedDraftItemid200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFilesUpload()`

```php
coreFilesUpload($core_files_upload_request): \OpenAPI\Client\Model\CoreFilesUpload200Response
```

upload a file to moodle

upload a file to moodle

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_files_upload_request = new \OpenAPI\Client\Model\CoreFilesUploadRequest(); // \OpenAPI\Client\Model\CoreFilesUploadRequest

try {
    $result = $apiInstance->coreFilesUpload($core_files_upload_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFilesUpload: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_files_upload_request** | [**\OpenAPI\Client\Model\CoreFilesUploadRequest**](../Model/CoreFilesUploadRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFilesUpload200Response**](../Model/CoreFilesUpload200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFiltersGetAvailableInContext()`

```php
coreFiltersGetAvailableInContext($core_filters_get_available_in_context_request): \OpenAPI\Client\Model\CoreFiltersGetAvailableInContext200Response
```

Returns the filters available in the given contexts.

Returns the filters available in the given contexts.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_filters_get_available_in_context_request = new \OpenAPI\Client\Model\CoreFiltersGetAvailableInContextRequest(); // \OpenAPI\Client\Model\CoreFiltersGetAvailableInContextRequest

try {
    $result = $apiInstance->coreFiltersGetAvailableInContext($core_filters_get_available_in_context_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFiltersGetAvailableInContext: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_filters_get_available_in_context_request** | [**\OpenAPI\Client\Model\CoreFiltersGetAvailableInContextRequest**](../Model/CoreFiltersGetAvailableInContextRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFiltersGetAvailableInContext200Response**](../Model/CoreFiltersGetAvailableInContext200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFormDynamicForm()`

```php
coreFormDynamicForm($core_form_dynamic_form_request): \OpenAPI\Client\Model\CoreFormDynamicForm200Response
```

Process submission of a dynamic (modal) form

Process submission of a dynamic (modal) form

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_form_dynamic_form_request = new \OpenAPI\Client\Model\CoreFormDynamicFormRequest(); // \OpenAPI\Client\Model\CoreFormDynamicFormRequest

try {
    $result = $apiInstance->coreFormDynamicForm($core_form_dynamic_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFormDynamicForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_form_dynamic_form_request** | [**\OpenAPI\Client\Model\CoreFormDynamicFormRequest**](../Model/CoreFormDynamicFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFormDynamicForm200Response**](../Model/CoreFormDynamicForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreFormGetFiletypesBrowserData()`

```php
coreFormGetFiletypesBrowserData($core_form_get_filetypes_browser_data_request): \OpenAPI\Client\Model\CoreFormGetFiletypesBrowserData200Response
```

Provides data for the filetypes element browser.

Provides data for the filetypes element browser.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_form_get_filetypes_browser_data_request = new \OpenAPI\Client\Model\CoreFormGetFiletypesBrowserDataRequest(); // \OpenAPI\Client\Model\CoreFormGetFiletypesBrowserDataRequest

try {
    $result = $apiInstance->coreFormGetFiletypesBrowserData($core_form_get_filetypes_browser_data_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreFormGetFiletypesBrowserData: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_form_get_filetypes_browser_data_request** | [**\OpenAPI\Client\Model\CoreFormGetFiletypesBrowserDataRequest**](../Model/CoreFormGetFiletypesBrowserDataRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreFormGetFiletypesBrowserData200Response**](../Model/CoreFormGetFiletypesBrowserData200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGetComponentStrings()`

```php
coreGetComponentStrings($core_get_component_strings_request): object
```

Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call

Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_get_component_strings_request = new \OpenAPI\Client\Model\CoreGetComponentStringsRequest(); // \OpenAPI\Client\Model\CoreGetComponentStringsRequest

try {
    $result = $apiInstance->coreGetComponentStrings($core_get_component_strings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGetComponentStrings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_get_component_strings_request** | [**\OpenAPI\Client\Model\CoreGetComponentStringsRequest**](../Model/CoreGetComponentStringsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGetFragment()`

```php
coreGetFragment($core_get_fragment_request): \OpenAPI\Client\Model\CoreGetFragment200Response
```

Return a fragment for inclusion, such as a JavaScript page.

Return a fragment for inclusion, such as a JavaScript page.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_get_fragment_request = new \OpenAPI\Client\Model\CoreGetFragmentRequest(); // \OpenAPI\Client\Model\CoreGetFragmentRequest

try {
    $result = $apiInstance->coreGetFragment($core_get_fragment_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGetFragment: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_get_fragment_request** | [**\OpenAPI\Client\Model\CoreGetFragmentRequest**](../Model/CoreGetFragmentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGetFragment200Response**](../Model/CoreGetFragment200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGetString()`

```php
coreGetString($core_get_string_request): object
```

Return a translated string - similar to core get_string(), call

Return a translated string - similar to core get_string(), call

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_get_string_request = new \OpenAPI\Client\Model\CoreGetStringRequest(); // \OpenAPI\Client\Model\CoreGetStringRequest

try {
    $result = $apiInstance->coreGetString($core_get_string_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGetString: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_get_string_request** | [**\OpenAPI\Client\Model\CoreGetStringRequest**](../Model/CoreGetStringRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGetStrings()`

```php
coreGetStrings($core_get_strings_request): object
```

Return some translated strings - like several core get_string(), calls

Return some translated strings - like several core get_string(), calls

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_get_strings_request = new \OpenAPI\Client\Model\CoreGetStringsRequest(); // \OpenAPI\Client\Model\CoreGetStringsRequest

try {
    $result = $apiInstance->coreGetStrings($core_get_strings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGetStrings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_get_strings_request** | [**\OpenAPI\Client\Model\CoreGetStringsRequest**](../Model/CoreGetStringsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGetUserDates()`

```php
coreGetUserDates($core_get_user_dates_request): \OpenAPI\Client\Model\CoreGetUserDates200Response
```

Return formatted timestamps

Return formatted timestamps

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_get_user_dates_request = new \OpenAPI\Client\Model\CoreGetUserDatesRequest(); // \OpenAPI\Client\Model\CoreGetUserDatesRequest

try {
    $result = $apiInstance->coreGetUserDates($core_get_user_dates_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGetUserDates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_get_user_dates_request** | [**\OpenAPI\Client\Model\CoreGetUserDatesRequest**](../Model/CoreGetUserDatesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGetUserDates200Response**](../Model/CoreGetUserDates200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesCreateGradecategories()`

```php
coreGradesCreateGradecategories($core_grades_create_gradecategories_request): \OpenAPI\Client\Model\CoreGradesCreateGradecategories200Response
```

Create grade categories inside a course gradebook.

Create grade categories inside a course gradebook.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_create_gradecategories_request = new \OpenAPI\Client\Model\CoreGradesCreateGradecategoriesRequest(); // \OpenAPI\Client\Model\CoreGradesCreateGradecategoriesRequest

try {
    $result = $apiInstance->coreGradesCreateGradecategories($core_grades_create_gradecategories_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesCreateGradecategories: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_create_gradecategories_request** | [**\OpenAPI\Client\Model\CoreGradesCreateGradecategoriesRequest**](../Model/CoreGradesCreateGradecategoriesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesCreateGradecategories200Response**](../Model/CoreGradesCreateGradecategories200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetEnrolledUsersForSearchWidget()`

```php
coreGradesGetEnrolledUsersForSearchWidget($core_grades_get_enrolled_users_for_search_widget_request): \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSearchWidget200Response
```

** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.

** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_enrolled_users_for_search_widget_request = new \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSearchWidgetRequest(); // \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSearchWidgetRequest

try {
    $result = $apiInstance->coreGradesGetEnrolledUsersForSearchWidget($core_grades_get_enrolled_users_for_search_widget_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetEnrolledUsersForSearchWidget: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_enrolled_users_for_search_widget_request** | [**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSearchWidgetRequest**](../Model/CoreGradesGetEnrolledUsersForSearchWidgetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSearchWidget200Response**](../Model/CoreGradesGetEnrolledUsersForSearchWidget200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetEnrolledUsersForSelector()`

```php
coreGradesGetEnrolledUsersForSelector($core_grades_get_enrolled_users_for_selector_request): \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200Response
```

Returns the enrolled users within and map some fields to the returned array of user objects.

Returns the enrolled users within and map some fields to the returned array of user objects.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_enrolled_users_for_selector_request = new \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelectorRequest(); // \OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelectorRequest

try {
    $result = $apiInstance->coreGradesGetEnrolledUsersForSelector($core_grades_get_enrolled_users_for_selector_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetEnrolledUsersForSelector: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_enrolled_users_for_selector_request** | [**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelectorRequest**](../Model/CoreGradesGetEnrolledUsersForSelectorRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetEnrolledUsersForSelector200Response**](../Model/CoreGradesGetEnrolledUsersForSelector200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetFeedback()`

```php
coreGradesGetFeedback($core_grades_get_feedback_request): \OpenAPI\Client\Model\CoreGradesGetFeedback200Response
```

Get the feedback data for a grade item

Get the feedback data for a grade item

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_feedback_request = new \OpenAPI\Client\Model\CoreGradesGetFeedbackRequest(); // \OpenAPI\Client\Model\CoreGradesGetFeedbackRequest

try {
    $result = $apiInstance->coreGradesGetFeedback($core_grades_get_feedback_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetFeedback: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_feedback_request** | [**\OpenAPI\Client\Model\CoreGradesGetFeedbackRequest**](../Model/CoreGradesGetFeedbackRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetFeedback200Response**](../Model/CoreGradesGetFeedback200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetGradableUsers()`

```php
coreGradesGetGradableUsers($core_grades_get_gradable_users_request): \OpenAPI\Client\Model\CoreGradesGetGradableUsers200Response
```

Returns the gradable users in a course

Returns the gradable users in a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_gradable_users_request = new \OpenAPI\Client\Model\CoreGradesGetGradableUsersRequest(); // \OpenAPI\Client\Model\CoreGradesGetGradableUsersRequest

try {
    $result = $apiInstance->coreGradesGetGradableUsers($core_grades_get_gradable_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetGradableUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_gradable_users_request** | [**\OpenAPI\Client\Model\CoreGradesGetGradableUsersRequest**](../Model/CoreGradesGetGradableUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGradableUsers200Response**](../Model/CoreGradesGetGradableUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetGradeTree()`

```php
coreGradesGetGradeTree($core_completion_mark_course_self_completed_request): object
```

Get the grade tree structure for a course

Get the grade tree structure for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_mark_course_self_completed_request = new \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest(); // \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest

try {
    $result = $apiInstance->coreGradesGetGradeTree($core_completion_mark_course_self_completed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetGradeTree: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_mark_course_self_completed_request** | [**\OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest**](../Model/CoreCompletionMarkCourseSelfCompletedRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetGradeitems()`

```php
coreGradesGetGradeitems($core_completion_mark_course_self_completed_request): \OpenAPI\Client\Model\CoreGradesGetGradeitems200Response
```

Get the gradeitems for a course

Get the gradeitems for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_completion_mark_course_self_completed_request = new \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest(); // \OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest

try {
    $result = $apiInstance->coreGradesGetGradeitems($core_completion_mark_course_self_completed_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetGradeitems: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_completion_mark_course_self_completed_request** | [**\OpenAPI\Client\Model\CoreCompletionMarkCourseSelfCompletedRequest**](../Model/CoreCompletionMarkCourseSelfCompletedRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGradeitems200Response**](../Model/CoreGradesGetGradeitems200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetGroupsForSearchWidget()`

```php
coreGradesGetGroupsForSearchWidget($core_grades_get_groups_for_search_widget_request): \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidget200Response
```

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_groups_for_search_widget_request = new \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest(); // \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest

try {
    $result = $apiInstance->coreGradesGetGroupsForSearchWidget($core_grades_get_groups_for_search_widget_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetGroupsForSearchWidget: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_groups_for_search_widget_request** | [**\OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest**](../Model/CoreGradesGetGroupsForSearchWidgetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidget200Response**](../Model/CoreGradesGetGroupsForSearchWidget200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGetGroupsForSelector()`

```php
coreGradesGetGroupsForSelector($core_grades_get_groups_for_search_widget_request): \OpenAPI\Client\Model\CoreGradesGetGroupsForSelector200Response
```

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_groups_for_search_widget_request = new \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest(); // \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest

try {
    $result = $apiInstance->coreGradesGetGroupsForSelector($core_grades_get_groups_for_search_widget_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGetGroupsForSelector: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_groups_for_search_widget_request** | [**\OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest**](../Model/CoreGradesGetGroupsForSearchWidgetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGroupsForSelector200Response**](../Model/CoreGradesGetGroupsForSelector200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGraderGradingpanelPointFetch()`

```php
coreGradesGraderGradingpanelPointFetch($core_grades_grader_gradingpanel_point_fetch_request): \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointFetch200Response
```

Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required

Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_point_fetch_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointFetchRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointFetchRequest

try {
    $result = $apiInstance->coreGradesGraderGradingpanelPointFetch($core_grades_grader_gradingpanel_point_fetch_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGraderGradingpanelPointFetch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_point_fetch_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointFetchRequest**](../Model/CoreGradesGraderGradingpanelPointFetchRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointFetch200Response**](../Model/CoreGradesGraderGradingpanelPointFetch200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGraderGradingpanelPointStore()`

```php
coreGradesGraderGradingpanelPointStore($core_grades_grader_gradingpanel_point_store_request): \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointStore200Response
```

Store the data required to display the grader grading panel for simple grading

Store the data required to display the grader grading panel for simple grading

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_point_store_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointStoreRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointStoreRequest

try {
    $result = $apiInstance->coreGradesGraderGradingpanelPointStore($core_grades_grader_gradingpanel_point_store_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGraderGradingpanelPointStore: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_point_store_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointStoreRequest**](../Model/CoreGradesGraderGradingpanelPointStoreRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelPointStore200Response**](../Model/CoreGradesGraderGradingpanelPointStore200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGraderGradingpanelScaleFetch()`

```php
coreGradesGraderGradingpanelScaleFetch($core_grades_grader_gradingpanel_scale_fetch_request): \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetch200Response
```

Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required

Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_scale_fetch_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest

try {
    $result = $apiInstance->coreGradesGraderGradingpanelScaleFetch($core_grades_grader_gradingpanel_scale_fetch_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGraderGradingpanelScaleFetch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_scale_fetch_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetchRequest**](../Model/CoreGradesGraderGradingpanelScaleFetchRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleFetch200Response**](../Model/CoreGradesGraderGradingpanelScaleFetch200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesGraderGradingpanelScaleStore()`

```php
coreGradesGraderGradingpanelScaleStore($core_grades_grader_gradingpanel_scale_store_request): \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStore200Response
```

Store the data required to display the grader grading panel for scale-based grading

Store the data required to display the grader grading panel for scale-based grading

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_grader_gradingpanel_scale_store_request = new \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest(); // \OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest

try {
    $result = $apiInstance->coreGradesGraderGradingpanelScaleStore($core_grades_grader_gradingpanel_scale_store_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesGraderGradingpanelScaleStore: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_grader_gradingpanel_scale_store_request** | [**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStoreRequest**](../Model/CoreGradesGraderGradingpanelScaleStoreRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGraderGradingpanelScaleStore200Response**](../Model/CoreGradesGraderGradingpanelScaleStore200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradesUpdateGrades()`

```php
coreGradesUpdateGrades($core_grades_update_grades_request): object
```

Update a grade item and associated student grades.

Update a grade item and associated student grades.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_update_grades_request = new \OpenAPI\Client\Model\CoreGradesUpdateGradesRequest(); // \OpenAPI\Client\Model\CoreGradesUpdateGradesRequest

try {
    $result = $apiInstance->coreGradesUpdateGrades($core_grades_update_grades_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradesUpdateGrades: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_update_grades_request** | [**\OpenAPI\Client\Model\CoreGradesUpdateGradesRequest**](../Model/CoreGradesUpdateGradesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradingGetDefinitions()`

```php
coreGradingGetDefinitions($core_grading_get_definitions_request): \OpenAPI\Client\Model\CoreGradingGetDefinitions200Response
```

Get grading definitions

Get grading definitions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grading_get_definitions_request = new \OpenAPI\Client\Model\CoreGradingGetDefinitionsRequest(); // \OpenAPI\Client\Model\CoreGradingGetDefinitionsRequest

try {
    $result = $apiInstance->coreGradingGetDefinitions($core_grading_get_definitions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradingGetDefinitions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grading_get_definitions_request** | [**\OpenAPI\Client\Model\CoreGradingGetDefinitionsRequest**](../Model/CoreGradingGetDefinitionsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradingGetDefinitions200Response**](../Model/CoreGradingGetDefinitions200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradingGetGradingformInstances()`

```php
coreGradingGetGradingformInstances($core_grading_get_gradingform_instances_request): \OpenAPI\Client\Model\CoreGradingGetGradingformInstances200Response
```

Get grading form instances

Get grading form instances

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grading_get_gradingform_instances_request = new \OpenAPI\Client\Model\CoreGradingGetGradingformInstancesRequest(); // \OpenAPI\Client\Model\CoreGradingGetGradingformInstancesRequest

try {
    $result = $apiInstance->coreGradingGetGradingformInstances($core_grading_get_gradingform_instances_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradingGetGradingformInstances: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grading_get_gradingform_instances_request** | [**\OpenAPI\Client\Model\CoreGradingGetGradingformInstancesRequest**](../Model/CoreGradingGetGradingformInstancesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradingGetGradingformInstances200Response**](../Model/CoreGradingGetGradingformInstances200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGradingSaveDefinitions()`

```php
coreGradingSaveDefinitions($core_grading_save_definitions_request): object
```

Save grading definitions

Save grading definitions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grading_save_definitions_request = new \OpenAPI\Client\Model\CoreGradingSaveDefinitionsRequest(); // \OpenAPI\Client\Model\CoreGradingSaveDefinitionsRequest

try {
    $result = $apiInstance->coreGradingSaveDefinitions($core_grading_save_definitions_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGradingSaveDefinitions: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grading_save_definitions_request** | [**\OpenAPI\Client\Model\CoreGradingSaveDefinitionsRequest**](../Model/CoreGradingSaveDefinitionsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupAddGroupMembers()`

```php
coreGroupAddGroupMembers($core_group_add_group_members_request): object
```

Adds group members.

Adds group members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_add_group_members_request = new \OpenAPI\Client\Model\CoreGroupAddGroupMembersRequest(); // \OpenAPI\Client\Model\CoreGroupAddGroupMembersRequest

try {
    $result = $apiInstance->coreGroupAddGroupMembers($core_group_add_group_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupAddGroupMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_add_group_members_request** | [**\OpenAPI\Client\Model\CoreGroupAddGroupMembersRequest**](../Model/CoreGroupAddGroupMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupAssignGrouping()`

```php
coreGroupAssignGrouping($core_group_assign_grouping_request): object
```

Assing groups from groupings

Assing groups from groupings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_assign_grouping_request = new \OpenAPI\Client\Model\CoreGroupAssignGroupingRequest(); // \OpenAPI\Client\Model\CoreGroupAssignGroupingRequest

try {
    $result = $apiInstance->coreGroupAssignGrouping($core_group_assign_grouping_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupAssignGrouping: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_assign_grouping_request** | [**\OpenAPI\Client\Model\CoreGroupAssignGroupingRequest**](../Model/CoreGroupAssignGroupingRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupCreateGroupings()`

```php
coreGroupCreateGroupings($core_group_create_groupings_request): object
```

Creates new groupings

Creates new groupings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_create_groupings_request = new \OpenAPI\Client\Model\CoreGroupCreateGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupCreateGroupingsRequest

try {
    $result = $apiInstance->coreGroupCreateGroupings($core_group_create_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupCreateGroupings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_create_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupCreateGroupingsRequest**](../Model/CoreGroupCreateGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupCreateGroups()`

```php
coreGroupCreateGroups($core_group_create_groups_request): object
```

Creates new groups.

Creates new groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_create_groups_request = new \OpenAPI\Client\Model\CoreGroupCreateGroupsRequest(); // \OpenAPI\Client\Model\CoreGroupCreateGroupsRequest

try {
    $result = $apiInstance->coreGroupCreateGroups($core_group_create_groups_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupCreateGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_create_groups_request** | [**\OpenAPI\Client\Model\CoreGroupCreateGroupsRequest**](../Model/CoreGroupCreateGroupsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupDeleteGroupMembers()`

```php
coreGroupDeleteGroupMembers($core_group_delete_group_members_request): object
```

Deletes group members.

Deletes group members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_delete_group_members_request = new \OpenAPI\Client\Model\CoreGroupDeleteGroupMembersRequest(); // \OpenAPI\Client\Model\CoreGroupDeleteGroupMembersRequest

try {
    $result = $apiInstance->coreGroupDeleteGroupMembers($core_group_delete_group_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupDeleteGroupMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_delete_group_members_request** | [**\OpenAPI\Client\Model\CoreGroupDeleteGroupMembersRequest**](../Model/CoreGroupDeleteGroupMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupDeleteGroupings()`

```php
coreGroupDeleteGroupings($core_group_delete_groupings_request): object
```

Deletes all specified groupings.

Deletes all specified groupings.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_delete_groupings_request = new \OpenAPI\Client\Model\CoreGroupDeleteGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupDeleteGroupingsRequest

try {
    $result = $apiInstance->coreGroupDeleteGroupings($core_group_delete_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupDeleteGroupings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_delete_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupDeleteGroupingsRequest**](../Model/CoreGroupDeleteGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupDeleteGroups()`

```php
coreGroupDeleteGroups($core_group_delete_groups_request): object
```

Deletes all specified groups.

Deletes all specified groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_delete_groups_request = new \OpenAPI\Client\Model\CoreGroupDeleteGroupsRequest(); // \OpenAPI\Client\Model\CoreGroupDeleteGroupsRequest

try {
    $result = $apiInstance->coreGroupDeleteGroups($core_group_delete_groups_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupDeleteGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_delete_groups_request** | [**\OpenAPI\Client\Model\CoreGroupDeleteGroupsRequest**](../Model/CoreGroupDeleteGroupsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetActivityAllowedGroups()`

```php
coreGroupGetActivityAllowedGroups($core_group_get_activity_allowed_groups_request): \OpenAPI\Client\Model\CoreGroupGetActivityAllowedGroups200Response
```

Gets a list of groups that the user is allowed to access within the specified activity.

Gets a list of groups that the user is allowed to access within the specified activity.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_activity_allowed_groups_request = new \OpenAPI\Client\Model\CoreGroupGetActivityAllowedGroupsRequest(); // \OpenAPI\Client\Model\CoreGroupGetActivityAllowedGroupsRequest

try {
    $result = $apiInstance->coreGroupGetActivityAllowedGroups($core_group_get_activity_allowed_groups_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetActivityAllowedGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_activity_allowed_groups_request** | [**\OpenAPI\Client\Model\CoreGroupGetActivityAllowedGroupsRequest**](../Model/CoreGroupGetActivityAllowedGroupsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGroupGetActivityAllowedGroups200Response**](../Model/CoreGroupGetActivityAllowedGroups200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetActivityGroupmode()`

```php
coreGroupGetActivityGroupmode($core_group_get_activity_groupmode_request): \OpenAPI\Client\Model\CoreGroupGetActivityGroupmode200Response
```

Returns effective groupmode used in a given activity.

Returns effective groupmode used in a given activity.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_activity_groupmode_request = new \OpenAPI\Client\Model\CoreGroupGetActivityGroupmodeRequest(); // \OpenAPI\Client\Model\CoreGroupGetActivityGroupmodeRequest

try {
    $result = $apiInstance->coreGroupGetActivityGroupmode($core_group_get_activity_groupmode_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetActivityGroupmode: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_activity_groupmode_request** | [**\OpenAPI\Client\Model\CoreGroupGetActivityGroupmodeRequest**](../Model/CoreGroupGetActivityGroupmodeRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGroupGetActivityGroupmode200Response**](../Model/CoreGroupGetActivityGroupmode200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetCourseGroupings()`

```php
coreGroupGetCourseGroupings($core_group_get_course_groupings_request): object
```

Returns all groupings in specified course.

Returns all groupings in specified course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_course_groupings_request = new \OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest

try {
    $result = $apiInstance->coreGroupGetCourseGroupings($core_group_get_course_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetCourseGroupings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_course_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest**](../Model/CoreGroupGetCourseGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetCourseGroups()`

```php
coreGroupGetCourseGroups($core_group_get_course_groupings_request): object
```

Returns all groups in specified course.

Returns all groups in specified course.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_course_groupings_request = new \OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest

try {
    $result = $apiInstance->coreGroupGetCourseGroups($core_group_get_course_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetCourseGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_course_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupGetCourseGroupingsRequest**](../Model/CoreGroupGetCourseGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetCourseUserGroups()`

```php
coreGroupGetCourseUserGroups($core_group_get_course_user_groups_request): \OpenAPI\Client\Model\CoreGroupGetCourseUserGroups200Response
```

Returns all groups in specified course for the specified user.

Returns all groups in specified course for the specified user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_course_user_groups_request = new \OpenAPI\Client\Model\CoreGroupGetCourseUserGroupsRequest(); // \OpenAPI\Client\Model\CoreGroupGetCourseUserGroupsRequest

try {
    $result = $apiInstance->coreGroupGetCourseUserGroups($core_group_get_course_user_groups_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetCourseUserGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_course_user_groups_request** | [**\OpenAPI\Client\Model\CoreGroupGetCourseUserGroupsRequest**](../Model/CoreGroupGetCourseUserGroupsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGroupGetCourseUserGroups200Response**](../Model/CoreGroupGetCourseUserGroups200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetGroupMembers()`

```php
coreGroupGetGroupMembers($core_group_get_group_members_request): object
```

Returns group members.

Returns group members.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_group_members_request = new \OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest(); // \OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest

try {
    $result = $apiInstance->coreGroupGetGroupMembers($core_group_get_group_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetGroupMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_group_members_request** | [**\OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest**](../Model/CoreGroupGetGroupMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetGroupings()`

```php
coreGroupGetGroupings($core_group_get_groupings_request): object
```

Returns groupings details.

Returns groupings details.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_groupings_request = new \OpenAPI\Client\Model\CoreGroupGetGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupGetGroupingsRequest

try {
    $result = $apiInstance->coreGroupGetGroupings($core_group_get_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetGroupings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupGetGroupingsRequest**](../Model/CoreGroupGetGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetGroups()`

```php
coreGroupGetGroups($core_group_get_group_members_request): object
```

Returns group details.

Returns group details.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_get_group_members_request = new \OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest(); // \OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest

try {
    $result = $apiInstance->coreGroupGetGroups($core_group_get_group_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_get_group_members_request** | [**\OpenAPI\Client\Model\CoreGroupGetGroupMembersRequest**](../Model/CoreGroupGetGroupMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupGetGroupsForSelector()`

```php
coreGroupGetGroupsForSelector($core_grades_get_groups_for_search_widget_request): \OpenAPI\Client\Model\CoreGradesGetGroupsForSelector200Response
```

Get the group/(s) for a course

Get the group/(s) for a course

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_grades_get_groups_for_search_widget_request = new \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest(); // \OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest

try {
    $result = $apiInstance->coreGroupGetGroupsForSelector($core_grades_get_groups_for_search_widget_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupGetGroupsForSelector: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_grades_get_groups_for_search_widget_request** | [**\OpenAPI\Client\Model\CoreGradesGetGroupsForSearchWidgetRequest**](../Model/CoreGradesGetGroupsForSearchWidgetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreGradesGetGroupsForSelector200Response**](../Model/CoreGradesGetGroupsForSelector200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupUnassignGrouping()`

```php
coreGroupUnassignGrouping($core_group_unassign_grouping_request): object
```

Unassing groups from groupings

Unassing groups from groupings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_unassign_grouping_request = new \OpenAPI\Client\Model\CoreGroupUnassignGroupingRequest(); // \OpenAPI\Client\Model\CoreGroupUnassignGroupingRequest

try {
    $result = $apiInstance->coreGroupUnassignGrouping($core_group_unassign_grouping_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupUnassignGrouping: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_unassign_grouping_request** | [**\OpenAPI\Client\Model\CoreGroupUnassignGroupingRequest**](../Model/CoreGroupUnassignGroupingRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupUpdateGroupings()`

```php
coreGroupUpdateGroupings($core_group_update_groupings_request): object
```

Updates existing groupings

Updates existing groupings

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_update_groupings_request = new \OpenAPI\Client\Model\CoreGroupUpdateGroupingsRequest(); // \OpenAPI\Client\Model\CoreGroupUpdateGroupingsRequest

try {
    $result = $apiInstance->coreGroupUpdateGroupings($core_group_update_groupings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupUpdateGroupings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_update_groupings_request** | [**\OpenAPI\Client\Model\CoreGroupUpdateGroupingsRequest**](../Model/CoreGroupUpdateGroupingsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreGroupUpdateGroups()`

```php
coreGroupUpdateGroups($core_group_update_groups_request): object
```

Updates existing groups.

Updates existing groups.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_group_update_groups_request = new \OpenAPI\Client\Model\CoreGroupUpdateGroupsRequest(); // \OpenAPI\Client\Model\CoreGroupUpdateGroupsRequest

try {
    $result = $apiInstance->coreGroupUpdateGroups($core_group_update_groups_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreGroupUpdateGroups: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_group_update_groups_request** | [**\OpenAPI\Client\Model\CoreGroupUpdateGroupsRequest**](../Model/CoreGroupUpdateGroupsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreH5pGetTrustedH5pFile()`

```php
coreH5pGetTrustedH5pFile($core_h5p_get_trusted_h5p_file_request): \OpenAPI\Client\Model\CoreH5pGetTrustedH5pFile200Response
```

Get the H5P file cleaned for Mobile App.

Get the H5P file cleaned for Mobile App.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_h5p_get_trusted_h5p_file_request = new \OpenAPI\Client\Model\CoreH5pGetTrustedH5pFileRequest(); // \OpenAPI\Client\Model\CoreH5pGetTrustedH5pFileRequest

try {
    $result = $apiInstance->coreH5pGetTrustedH5pFile($core_h5p_get_trusted_h5p_file_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreH5pGetTrustedH5pFile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_h5p_get_trusted_h5p_file_request** | [**\OpenAPI\Client\Model\CoreH5pGetTrustedH5pFileRequest**](../Model/CoreH5pGetTrustedH5pFileRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreH5pGetTrustedH5pFile200Response**](../Model/CoreH5pGetTrustedH5pFile200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageBlockUser()`

```php
coreMessageBlockUser($core_message_block_user_request): object
```

Blocks a user

Blocks a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_block_user_request = new \OpenAPI\Client\Model\CoreMessageBlockUserRequest(); // \OpenAPI\Client\Model\CoreMessageBlockUserRequest

try {
    $result = $apiInstance->coreMessageBlockUser($core_message_block_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageBlockUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_block_user_request** | [**\OpenAPI\Client\Model\CoreMessageBlockUserRequest**](../Model/CoreMessageBlockUserRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageConfirmContactRequest()`

```php
coreMessageConfirmContactRequest($core_message_confirm_contact_request_request): object
```

Confirms a contact request

Confirms a contact request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_confirm_contact_request_request = new \OpenAPI\Client\Model\CoreMessageConfirmContactRequestRequest(); // \OpenAPI\Client\Model\CoreMessageConfirmContactRequestRequest

try {
    $result = $apiInstance->coreMessageConfirmContactRequest($core_message_confirm_contact_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageConfirmContactRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_confirm_contact_request_request** | [**\OpenAPI\Client\Model\CoreMessageConfirmContactRequestRequest**](../Model/CoreMessageConfirmContactRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageCreateContactRequest()`

```php
coreMessageCreateContactRequest($core_message_create_contact_request_request): \OpenAPI\Client\Model\CoreMessageCreateContactRequest200Response
```

Creates a contact request

Creates a contact request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_create_contact_request_request = new \OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest(); // \OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest

try {
    $result = $apiInstance->coreMessageCreateContactRequest($core_message_create_contact_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageCreateContactRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_create_contact_request_request** | [**\OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest**](../Model/CoreMessageCreateContactRequestRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageCreateContactRequest200Response**](../Model/CoreMessageCreateContactRequest200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDataForMessageareaSearchMessages()`

```php
coreMessageDataForMessageareaSearchMessages($core_message_data_for_messagearea_search_messages_request): \OpenAPI\Client\Model\CoreMessageDataForMessageareaSearchMessages200Response
```

Retrieve the template data for searching for messages

Retrieve the template data for searching for messages

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_data_for_messagearea_search_messages_request = new \OpenAPI\Client\Model\CoreMessageDataForMessageareaSearchMessagesRequest(); // \OpenAPI\Client\Model\CoreMessageDataForMessageareaSearchMessagesRequest

try {
    $result = $apiInstance->coreMessageDataForMessageareaSearchMessages($core_message_data_for_messagearea_search_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDataForMessageareaSearchMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_data_for_messagearea_search_messages_request** | [**\OpenAPI\Client\Model\CoreMessageDataForMessageareaSearchMessagesRequest**](../Model/CoreMessageDataForMessageareaSearchMessagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageDataForMessageareaSearchMessages200Response**](../Model/CoreMessageDataForMessageareaSearchMessages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDeclineContactRequest()`

```php
coreMessageDeclineContactRequest($core_message_create_contact_request_request): object
```

Declines a contact request

Declines a contact request

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_create_contact_request_request = new \OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest(); // \OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest

try {
    $result = $apiInstance->coreMessageDeclineContactRequest($core_message_create_contact_request_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDeclineContactRequest: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_create_contact_request_request** | [**\OpenAPI\Client\Model\CoreMessageCreateContactRequestRequest**](../Model/CoreMessageCreateContactRequestRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDeleteContacts()`

```php
coreMessageDeleteContacts($core_message_delete_contacts_request): object
```

Remove contacts from the contact list

Remove contacts from the contact list

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_delete_contacts_request = new \OpenAPI\Client\Model\CoreMessageDeleteContactsRequest(); // \OpenAPI\Client\Model\CoreMessageDeleteContactsRequest

try {
    $result = $apiInstance->coreMessageDeleteContacts($core_message_delete_contacts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDeleteContacts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_delete_contacts_request** | [**\OpenAPI\Client\Model\CoreMessageDeleteContactsRequest**](../Model/CoreMessageDeleteContactsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDeleteConversationsById()`

```php
coreMessageDeleteConversationsById($core_message_delete_conversations_by_id_request): object
```

Deletes a list of conversations.

Deletes a list of conversations.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_delete_conversations_by_id_request = new \OpenAPI\Client\Model\CoreMessageDeleteConversationsByIdRequest(); // \OpenAPI\Client\Model\CoreMessageDeleteConversationsByIdRequest

try {
    $result = $apiInstance->coreMessageDeleteConversationsById($core_message_delete_conversations_by_id_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDeleteConversationsById: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_delete_conversations_by_id_request** | [**\OpenAPI\Client\Model\CoreMessageDeleteConversationsByIdRequest**](../Model/CoreMessageDeleteConversationsByIdRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDeleteMessage()`

```php
coreMessageDeleteMessage($core_message_delete_message_request): \OpenAPI\Client\Model\CoreMessageDeleteMessage200Response
```

Deletes a message.

Deletes a message.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_delete_message_request = new \OpenAPI\Client\Model\CoreMessageDeleteMessageRequest(); // \OpenAPI\Client\Model\CoreMessageDeleteMessageRequest

try {
    $result = $apiInstance->coreMessageDeleteMessage($core_message_delete_message_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDeleteMessage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_delete_message_request** | [**\OpenAPI\Client\Model\CoreMessageDeleteMessageRequest**](../Model/CoreMessageDeleteMessageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageDeleteMessage200Response**](../Model/CoreMessageDeleteMessage200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageDeleteMessageForAllUsers()`

```php
coreMessageDeleteMessageForAllUsers($core_message_delete_message_for_all_users_request): object
```

Deletes a message for all users.

Deletes a message for all users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_delete_message_for_all_users_request = new \OpenAPI\Client\Model\CoreMessageDeleteMessageForAllUsersRequest(); // \OpenAPI\Client\Model\CoreMessageDeleteMessageForAllUsersRequest

try {
    $result = $apiInstance->coreMessageDeleteMessageForAllUsers($core_message_delete_message_for_all_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageDeleteMessageForAllUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_delete_message_for_all_users_request** | [**\OpenAPI\Client\Model\CoreMessageDeleteMessageForAllUsersRequest**](../Model/CoreMessageDeleteMessageForAllUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetBlockedUsers()`

```php
coreMessageGetBlockedUsers($core_message_get_blocked_users_request): \OpenAPI\Client\Model\CoreMessageGetBlockedUsers200Response
```

Retrieve a list of users blocked

Retrieve a list of users blocked

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_blocked_users_request = new \OpenAPI\Client\Model\CoreMessageGetBlockedUsersRequest(); // \OpenAPI\Client\Model\CoreMessageGetBlockedUsersRequest

try {
    $result = $apiInstance->coreMessageGetBlockedUsers($core_message_get_blocked_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetBlockedUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_blocked_users_request** | [**\OpenAPI\Client\Model\CoreMessageGetBlockedUsersRequest**](../Model/CoreMessageGetBlockedUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetBlockedUsers200Response**](../Model/CoreMessageGetBlockedUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetContactRequests()`

```php
coreMessageGetContactRequests($core_message_get_contact_requests_request): object
```

Returns contact requests for a user

Returns contact requests for a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_contact_requests_request = new \OpenAPI\Client\Model\CoreMessageGetContactRequestsRequest(); // \OpenAPI\Client\Model\CoreMessageGetContactRequestsRequest

try {
    $result = $apiInstance->coreMessageGetContactRequests($core_message_get_contact_requests_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetContactRequests: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_contact_requests_request** | [**\OpenAPI\Client\Model\CoreMessageGetContactRequestsRequest**](../Model/CoreMessageGetContactRequestsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversation()`

```php
coreMessageGetConversation($core_message_get_conversation_request): \OpenAPI\Client\Model\CoreMessageGetConversation200Response
```

Retrieve a conversation for a user

Retrieve a conversation for a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_request = new \OpenAPI\Client\Model\CoreMessageGetConversationRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationRequest

try {
    $result = $apiInstance->coreMessageGetConversation($core_message_get_conversation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationRequest**](../Model/CoreMessageGetConversationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversation200Response**](../Model/CoreMessageGetConversation200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversationBetweenUsers()`

```php
coreMessageGetConversationBetweenUsers($core_message_get_conversation_between_users_request): \OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200Response
```

Retrieve a conversation for a user between another user

Retrieve a conversation for a user between another user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_between_users_request = new \OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsersRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsersRequest

try {
    $result = $apiInstance->coreMessageGetConversationBetweenUsers($core_message_get_conversation_between_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversationBetweenUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_between_users_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsersRequest**](../Model/CoreMessageGetConversationBetweenUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200Response**](../Model/CoreMessageGetConversationBetweenUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversationCounts()`

```php
coreMessageGetConversationCounts($core_message_get_conversation_counts_request): \OpenAPI\Client\Model\CoreMessageGetConversationCounts200Response
```

Retrieve a list of conversation counts, indexed by type.

Retrieve a list of conversation counts, indexed by type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_counts_request = new \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest

try {
    $result = $apiInstance->coreMessageGetConversationCounts($core_message_get_conversation_counts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversationCounts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_counts_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest**](../Model/CoreMessageGetConversationCountsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversationCounts200Response**](../Model/CoreMessageGetConversationCounts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversationMembers()`

```php
coreMessageGetConversationMembers($core_message_get_conversation_members_request): object
```

Retrieve a list of members in a conversation

Retrieve a list of members in a conversation

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_members_request = new \OpenAPI\Client\Model\CoreMessageGetConversationMembersRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationMembersRequest

try {
    $result = $apiInstance->coreMessageGetConversationMembers($core_message_get_conversation_members_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversationMembers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_members_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationMembersRequest**](../Model/CoreMessageGetConversationMembersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversationMessages()`

```php
coreMessageGetConversationMessages($core_message_get_conversation_messages_request): \OpenAPI\Client\Model\CoreMessageGetConversationMessages200Response
```

Retrieve the conversation messages and relevant member information

Retrieve the conversation messages and relevant member information

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_messages_request = new \OpenAPI\Client\Model\CoreMessageGetConversationMessagesRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationMessagesRequest

try {
    $result = $apiInstance->coreMessageGetConversationMessages($core_message_get_conversation_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversationMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_messages_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationMessagesRequest**](../Model/CoreMessageGetConversationMessagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversationMessages200Response**](../Model/CoreMessageGetConversationMessages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetConversations()`

```php
coreMessageGetConversations($core_message_get_conversations_request): \OpenAPI\Client\Model\CoreMessageGetConversations200Response
```

Retrieve a list of conversations for a user

Retrieve a list of conversations for a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversations_request = new \OpenAPI\Client\Model\CoreMessageGetConversationsRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationsRequest

try {
    $result = $apiInstance->coreMessageGetConversations($core_message_get_conversations_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversations_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationsRequest**](../Model/CoreMessageGetConversationsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversations200Response**](../Model/CoreMessageGetConversations200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetMemberInfo()`

```php
coreMessageGetMemberInfo($core_message_get_member_info_request): object
```

Retrieve a user message profiles

Retrieve a user message profiles

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_member_info_request = new \OpenAPI\Client\Model\CoreMessageGetMemberInfoRequest(); // \OpenAPI\Client\Model\CoreMessageGetMemberInfoRequest

try {
    $result = $apiInstance->coreMessageGetMemberInfo($core_message_get_member_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetMemberInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_member_info_request** | [**\OpenAPI\Client\Model\CoreMessageGetMemberInfoRequest**](../Model/CoreMessageGetMemberInfoRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetMessageProcessor()`

```php
coreMessageGetMessageProcessor($core_message_get_message_processor_request): \OpenAPI\Client\Model\CoreMessageGetMessageProcessor200Response
```

Get a message processor

Get a message processor

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_message_processor_request = new \OpenAPI\Client\Model\CoreMessageGetMessageProcessorRequest(); // \OpenAPI\Client\Model\CoreMessageGetMessageProcessorRequest

try {
    $result = $apiInstance->coreMessageGetMessageProcessor($core_message_get_message_processor_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetMessageProcessor: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_message_processor_request** | [**\OpenAPI\Client\Model\CoreMessageGetMessageProcessorRequest**](../Model/CoreMessageGetMessageProcessorRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetMessageProcessor200Response**](../Model/CoreMessageGetMessageProcessor200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetMessages()`

```php
coreMessageGetMessages($core_message_get_messages_request): \OpenAPI\Client\Model\CoreMessageGetMessages200Response
```

Retrieve a list of messages sent and received by a user (conversations, notifications or both)

Retrieve a list of messages sent and received by a user (conversations, notifications or both)

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_messages_request = new \OpenAPI\Client\Model\CoreMessageGetMessagesRequest(); // \OpenAPI\Client\Model\CoreMessageGetMessagesRequest

try {
    $result = $apiInstance->coreMessageGetMessages($core_message_get_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_messages_request** | [**\OpenAPI\Client\Model\CoreMessageGetMessagesRequest**](../Model/CoreMessageGetMessagesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetMessages200Response**](../Model/CoreMessageGetMessages200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetReceivedContactRequestsCount()`

```php
coreMessageGetReceivedContactRequestsCount($core_message_get_received_contact_requests_count_request): object
```

Gets the number of received contact requests

Gets the number of received contact requests

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_received_contact_requests_count_request = new \OpenAPI\Client\Model\CoreMessageGetReceivedContactRequestsCountRequest(); // \OpenAPI\Client\Model\CoreMessageGetReceivedContactRequestsCountRequest

try {
    $result = $apiInstance->coreMessageGetReceivedContactRequestsCount($core_message_get_received_contact_requests_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetReceivedContactRequestsCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_received_contact_requests_count_request** | [**\OpenAPI\Client\Model\CoreMessageGetReceivedContactRequestsCountRequest**](../Model/CoreMessageGetReceivedContactRequestsCountRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetSelfConversation()`

```php
coreMessageGetSelfConversation($core_message_get_self_conversation_request): \OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200Response
```

Retrieve a self-conversation for a user

Retrieve a self-conversation for a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_self_conversation_request = new \OpenAPI\Client\Model\CoreMessageGetSelfConversationRequest(); // \OpenAPI\Client\Model\CoreMessageGetSelfConversationRequest

try {
    $result = $apiInstance->coreMessageGetSelfConversation($core_message_get_self_conversation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetSelfConversation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_self_conversation_request** | [**\OpenAPI\Client\Model\CoreMessageGetSelfConversationRequest**](../Model/CoreMessageGetSelfConversationRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetConversationBetweenUsers200Response**](../Model/CoreMessageGetConversationBetweenUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUnreadConversationCounts()`

```php
coreMessageGetUnreadConversationCounts($core_message_get_conversation_counts_request): \OpenAPI\Client\Model\CoreMessageGetUnreadConversationCounts200Response
```

Retrieve a list of unread conversation counts, indexed by type.

Retrieve a list of unread conversation counts, indexed by type.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_counts_request = new \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest

try {
    $result = $apiInstance->coreMessageGetUnreadConversationCounts($core_message_get_conversation_counts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUnreadConversationCounts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_counts_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest**](../Model/CoreMessageGetConversationCountsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetUnreadConversationCounts200Response**](../Model/CoreMessageGetUnreadConversationCounts200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUnreadConversationsCount()`

```php
coreMessageGetUnreadConversationsCount($core_message_get_unread_conversations_count_request): object
```

Retrieve the count of unread conversations for a given user

Retrieve the count of unread conversations for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_unread_conversations_count_request = new \OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest(); // \OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest

try {
    $result = $apiInstance->coreMessageGetUnreadConversationsCount($core_message_get_unread_conversations_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUnreadConversationsCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_unread_conversations_count_request** | [**\OpenAPI\Client\Model\CoreMessageGetUnreadConversationsCountRequest**](../Model/CoreMessageGetUnreadConversationsCountRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUnreadNotificationCount()`

```php
coreMessageGetUnreadNotificationCount($core_message_get_unread_notification_count_request): object
```

Get number of unread notifications.

Get number of unread notifications.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_unread_notification_count_request = new \OpenAPI\Client\Model\CoreMessageGetUnreadNotificationCountRequest(); // \OpenAPI\Client\Model\CoreMessageGetUnreadNotificationCountRequest

try {
    $result = $apiInstance->coreMessageGetUnreadNotificationCount($core_message_get_unread_notification_count_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUnreadNotificationCount: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_unread_notification_count_request** | [**\OpenAPI\Client\Model\CoreMessageGetUnreadNotificationCountRequest**](../Model/CoreMessageGetUnreadNotificationCountRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUserContacts()`

```php
coreMessageGetUserContacts($core_message_get_user_contacts_request): object
```

Retrieve the contact list

Retrieve the contact list

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_user_contacts_request = new \OpenAPI\Client\Model\CoreMessageGetUserContactsRequest(); // \OpenAPI\Client\Model\CoreMessageGetUserContactsRequest

try {
    $result = $apiInstance->coreMessageGetUserContacts($core_message_get_user_contacts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUserContacts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_user_contacts_request** | [**\OpenAPI\Client\Model\CoreMessageGetUserContactsRequest**](../Model/CoreMessageGetUserContactsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUserMessagePreferences()`

```php
coreMessageGetUserMessagePreferences($core_message_get_conversation_counts_request): \OpenAPI\Client\Model\CoreMessageGetUserMessagePreferences200Response
```

Get the message preferences for a given user.

Get the message preferences for a given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_counts_request = new \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest

try {
    $result = $apiInstance->coreMessageGetUserMessagePreferences($core_message_get_conversation_counts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUserMessagePreferences: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_counts_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest**](../Model/CoreMessageGetConversationCountsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetUserMessagePreferences200Response**](../Model/CoreMessageGetUserMessagePreferences200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageGetUserNotificationPreferences()`

```php
coreMessageGetUserNotificationPreferences($core_message_get_conversation_counts_request): \OpenAPI\Client\Model\CoreMessageGetUserNotificationPreferences200Response
```

Get the notification preferences for a given user.

Get the notification preferences for a given user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_get_conversation_counts_request = new \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest(); // \OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest

try {
    $result = $apiInstance->coreMessageGetUserNotificationPreferences($core_message_get_conversation_counts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageGetUserNotificationPreferences: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_get_conversation_counts_request** | [**\OpenAPI\Client\Model\CoreMessageGetConversationCountsRequest**](../Model/CoreMessageGetConversationCountsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageGetUserNotificationPreferences200Response**](../Model/CoreMessageGetUserNotificationPreferences200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMarkAllConversationMessagesAsRead()`

```php
coreMessageMarkAllConversationMessagesAsRead($core_message_mark_all_conversation_messages_as_read_request): object
```

Mark all conversation messages as read for a given user

Mark all conversation messages as read for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_mark_all_conversation_messages_as_read_request = new \OpenAPI\Client\Model\CoreMessageMarkAllConversationMessagesAsReadRequest(); // \OpenAPI\Client\Model\CoreMessageMarkAllConversationMessagesAsReadRequest

try {
    $result = $apiInstance->coreMessageMarkAllConversationMessagesAsRead($core_message_mark_all_conversation_messages_as_read_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMarkAllConversationMessagesAsRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_mark_all_conversation_messages_as_read_request** | [**\OpenAPI\Client\Model\CoreMessageMarkAllConversationMessagesAsReadRequest**](../Model/CoreMessageMarkAllConversationMessagesAsReadRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMarkAllNotificationsAsRead()`

```php
coreMessageMarkAllNotificationsAsRead($core_message_mark_all_notifications_as_read_request): object
```

Mark all notifications as read for a given user

Mark all notifications as read for a given user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_mark_all_notifications_as_read_request = new \OpenAPI\Client\Model\CoreMessageMarkAllNotificationsAsReadRequest(); // \OpenAPI\Client\Model\CoreMessageMarkAllNotificationsAsReadRequest

try {
    $result = $apiInstance->coreMessageMarkAllNotificationsAsRead($core_message_mark_all_notifications_as_read_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMarkAllNotificationsAsRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_mark_all_notifications_as_read_request** | [**\OpenAPI\Client\Model\CoreMessageMarkAllNotificationsAsReadRequest**](../Model/CoreMessageMarkAllNotificationsAsReadRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMarkMessageRead()`

```php
coreMessageMarkMessageRead($core_message_mark_message_read_request): \OpenAPI\Client\Model\CoreMessageMarkMessageRead200Response
```

Mark a single message as read, trigger message_viewed event.

Mark a single message as read, trigger message_viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_mark_message_read_request = new \OpenAPI\Client\Model\CoreMessageMarkMessageReadRequest(); // \OpenAPI\Client\Model\CoreMessageMarkMessageReadRequest

try {
    $result = $apiInstance->coreMessageMarkMessageRead($core_message_mark_message_read_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMarkMessageRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_mark_message_read_request** | [**\OpenAPI\Client\Model\CoreMessageMarkMessageReadRequest**](../Model/CoreMessageMarkMessageReadRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageMarkMessageRead200Response**](../Model/CoreMessageMarkMessageRead200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMarkNotificationRead()`

```php
coreMessageMarkNotificationRead($core_message_mark_notification_read_request): \OpenAPI\Client\Model\CoreMessageMarkNotificationRead200Response
```

Mark a single notification as read, trigger notification_viewed event.

Mark a single notification as read, trigger notification_viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_mark_notification_read_request = new \OpenAPI\Client\Model\CoreMessageMarkNotificationReadRequest(); // \OpenAPI\Client\Model\CoreMessageMarkNotificationReadRequest

try {
    $result = $apiInstance->coreMessageMarkNotificationRead($core_message_mark_notification_read_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMarkNotificationRead: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_mark_notification_read_request** | [**\OpenAPI\Client\Model\CoreMessageMarkNotificationReadRequest**](../Model/CoreMessageMarkNotificationReadRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageMarkNotificationRead200Response**](../Model/CoreMessageMarkNotificationRead200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMessageProcessorConfigForm()`

```php
coreMessageMessageProcessorConfigForm($core_message_message_processor_config_form_request): object
```

Process the message processor config form

Process the message processor config form

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_message_processor_config_form_request = new \OpenAPI\Client\Model\CoreMessageMessageProcessorConfigFormRequest(); // \OpenAPI\Client\Model\CoreMessageMessageProcessorConfigFormRequest

try {
    $result = $apiInstance->coreMessageMessageProcessorConfigForm($core_message_message_processor_config_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMessageProcessorConfigForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_message_processor_config_form_request** | [**\OpenAPI\Client\Model\CoreMessageMessageProcessorConfigFormRequest**](../Model/CoreMessageMessageProcessorConfigFormRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMessageSearchUsers()`

```php
coreMessageMessageSearchUsers($core_message_message_search_users_request): \OpenAPI\Client\Model\CoreMessageMessageSearchUsers200Response
```

Retrieve the data for searching for people

Retrieve the data for searching for people

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_message_search_users_request = new \OpenAPI\Client\Model\CoreMessageMessageSearchUsersRequest(); // \OpenAPI\Client\Model\CoreMessageMessageSearchUsersRequest

try {
    $result = $apiInstance->coreMessageMessageSearchUsers($core_message_message_search_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMessageSearchUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_message_search_users_request** | [**\OpenAPI\Client\Model\CoreMessageMessageSearchUsersRequest**](../Model/CoreMessageMessageSearchUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMessageMessageSearchUsers200Response**](../Model/CoreMessageMessageSearchUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageMuteConversations()`

```php
coreMessageMuteConversations($core_message_mute_conversations_request): object
```

Mutes a list of conversations

Mutes a list of conversations

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_mute_conversations_request = new \OpenAPI\Client\Model\CoreMessageMuteConversationsRequest(); // \OpenAPI\Client\Model\CoreMessageMuteConversationsRequest

try {
    $result = $apiInstance->coreMessageMuteConversations($core_message_mute_conversations_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageMuteConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_mute_conversations_request** | [**\OpenAPI\Client\Model\CoreMessageMuteConversationsRequest**](../Model/CoreMessageMuteConversationsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageSearchContacts()`

```php
coreMessageSearchContacts($core_message_search_contacts_request): object
```

Search for contacts

Search for contacts

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_search_contacts_request = new \OpenAPI\Client\Model\CoreMessageSearchContactsRequest(); // \OpenAPI\Client\Model\CoreMessageSearchContactsRequest

try {
    $result = $apiInstance->coreMessageSearchContacts($core_message_search_contacts_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageSearchContacts: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_search_contacts_request** | [**\OpenAPI\Client\Model\CoreMessageSearchContactsRequest**](../Model/CoreMessageSearchContactsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageSendInstantMessages()`

```php
coreMessageSendInstantMessages($core_message_send_instant_messages_request): object
```

Send instant messages

Send instant messages

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_send_instant_messages_request = new \OpenAPI\Client\Model\CoreMessageSendInstantMessagesRequest(); // \OpenAPI\Client\Model\CoreMessageSendInstantMessagesRequest

try {
    $result = $apiInstance->coreMessageSendInstantMessages($core_message_send_instant_messages_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageSendInstantMessages: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_send_instant_messages_request** | [**\OpenAPI\Client\Model\CoreMessageSendInstantMessagesRequest**](../Model/CoreMessageSendInstantMessagesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageSendMessagesToConversation()`

```php
coreMessageSendMessagesToConversation($core_message_send_messages_to_conversation_request): object
```

Send messages to an existing conversation between users

Send messages to an existing conversation between users

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_send_messages_to_conversation_request = new \OpenAPI\Client\Model\CoreMessageSendMessagesToConversationRequest(); // \OpenAPI\Client\Model\CoreMessageSendMessagesToConversationRequest

try {
    $result = $apiInstance->coreMessageSendMessagesToConversation($core_message_send_messages_to_conversation_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageSendMessagesToConversation: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_send_messages_to_conversation_request** | [**\OpenAPI\Client\Model\CoreMessageSendMessagesToConversationRequest**](../Model/CoreMessageSendMessagesToConversationRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageSetFavouriteConversations()`

```php
coreMessageSetFavouriteConversations($core_message_set_favourite_conversations_request): object
```

Mark a conversation or group of conversations as favourites/starred conversations.

Mark a conversation or group of conversations as favourites/starred conversations.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_set_favourite_conversations_request = new \OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest(); // \OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest

try {
    $result = $apiInstance->coreMessageSetFavouriteConversations($core_message_set_favourite_conversations_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageSetFavouriteConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_set_favourite_conversations_request** | [**\OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest**](../Model/CoreMessageSetFavouriteConversationsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageUnblockUser()`

```php
coreMessageUnblockUser($core_message_unblock_user_request): object
```

Unblocks a user

Unblocks a user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_unblock_user_request = new \OpenAPI\Client\Model\CoreMessageUnblockUserRequest(); // \OpenAPI\Client\Model\CoreMessageUnblockUserRequest

try {
    $result = $apiInstance->coreMessageUnblockUser($core_message_unblock_user_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageUnblockUser: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_unblock_user_request** | [**\OpenAPI\Client\Model\CoreMessageUnblockUserRequest**](../Model/CoreMessageUnblockUserRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageUnmuteConversations()`

```php
coreMessageUnmuteConversations($core_message_unmute_conversations_request): object
```

Unmutes a list of conversations

Unmutes a list of conversations

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_unmute_conversations_request = new \OpenAPI\Client\Model\CoreMessageUnmuteConversationsRequest(); // \OpenAPI\Client\Model\CoreMessageUnmuteConversationsRequest

try {
    $result = $apiInstance->coreMessageUnmuteConversations($core_message_unmute_conversations_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageUnmuteConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_unmute_conversations_request** | [**\OpenAPI\Client\Model\CoreMessageUnmuteConversationsRequest**](../Model/CoreMessageUnmuteConversationsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMessageUnsetFavouriteConversations()`

```php
coreMessageUnsetFavouriteConversations($core_message_set_favourite_conversations_request): object
```

Unset a conversation or group of conversations as favourites/starred conversations.

Unset a conversation or group of conversations as favourites/starred conversations.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_message_set_favourite_conversations_request = new \OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest(); // \OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest

try {
    $result = $apiInstance->coreMessageUnsetFavouriteConversations($core_message_set_favourite_conversations_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMessageUnsetFavouriteConversations: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_message_set_favourite_conversations_request** | [**\OpenAPI\Client\Model\CoreMessageSetFavouriteConversationsRequest**](../Model/CoreMessageSetFavouriteConversationsRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMoodlenetAuthCheck()`

```php
coreMoodlenetAuthCheck($core_moodlenet_auth_check_request): \OpenAPI\Client\Model\CoreMoodlenetAuthCheck200Response
```

Check a user has authorized for a given MoodleNet site

Check a user has authorized for a given MoodleNet site

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_moodlenet_auth_check_request = new \OpenAPI\Client\Model\CoreMoodlenetAuthCheckRequest(); // \OpenAPI\Client\Model\CoreMoodlenetAuthCheckRequest

try {
    $result = $apiInstance->coreMoodlenetAuthCheck($core_moodlenet_auth_check_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMoodlenetAuthCheck: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_moodlenet_auth_check_request** | [**\OpenAPI\Client\Model\CoreMoodlenetAuthCheckRequest**](../Model/CoreMoodlenetAuthCheckRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMoodlenetAuthCheck200Response**](../Model/CoreMoodlenetAuthCheck200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMoodlenetGetShareInfoActivity()`

```php
coreMoodlenetGetShareInfoActivity($core_moodlenet_get_share_info_activity_request): \OpenAPI\Client\Model\CoreMoodlenetGetShareInfoActivity200Response
```

Get information about an activity being shared

Get information about an activity being shared

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_moodlenet_get_share_info_activity_request = new \OpenAPI\Client\Model\CoreMoodlenetGetShareInfoActivityRequest(); // \OpenAPI\Client\Model\CoreMoodlenetGetShareInfoActivityRequest

try {
    $result = $apiInstance->coreMoodlenetGetShareInfoActivity($core_moodlenet_get_share_info_activity_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMoodlenetGetShareInfoActivity: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_moodlenet_get_share_info_activity_request** | [**\OpenAPI\Client\Model\CoreMoodlenetGetShareInfoActivityRequest**](../Model/CoreMoodlenetGetShareInfoActivityRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMoodlenetGetShareInfoActivity200Response**](../Model/CoreMoodlenetGetShareInfoActivity200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMoodlenetGetSharedCourseInfo()`

```php
coreMoodlenetGetSharedCourseInfo($core_moodlenet_get_shared_course_info_request): \OpenAPI\Client\Model\CoreMoodlenetGetSharedCourseInfo200Response
```

Get information about an course being shared

Get information about an course being shared

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_moodlenet_get_shared_course_info_request = new \OpenAPI\Client\Model\CoreMoodlenetGetSharedCourseInfoRequest(); // \OpenAPI\Client\Model\CoreMoodlenetGetSharedCourseInfoRequest

try {
    $result = $apiInstance->coreMoodlenetGetSharedCourseInfo($core_moodlenet_get_shared_course_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMoodlenetGetSharedCourseInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_moodlenet_get_shared_course_info_request** | [**\OpenAPI\Client\Model\CoreMoodlenetGetSharedCourseInfoRequest**](../Model/CoreMoodlenetGetSharedCourseInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMoodlenetGetSharedCourseInfo200Response**](../Model/CoreMoodlenetGetSharedCourseInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMoodlenetSendActivity()`

```php
coreMoodlenetSendActivity($core_moodlenet_send_activity_request): \OpenAPI\Client\Model\CoreMoodlenetSendActivity200Response
```

Send activity to MoodleNet

Send activity to MoodleNet

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_moodlenet_send_activity_request = new \OpenAPI\Client\Model\CoreMoodlenetSendActivityRequest(); // \OpenAPI\Client\Model\CoreMoodlenetSendActivityRequest

try {
    $result = $apiInstance->coreMoodlenetSendActivity($core_moodlenet_send_activity_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMoodlenetSendActivity: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_moodlenet_send_activity_request** | [**\OpenAPI\Client\Model\CoreMoodlenetSendActivityRequest**](../Model/CoreMoodlenetSendActivityRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMoodlenetSendActivity200Response**](../Model/CoreMoodlenetSendActivity200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMoodlenetSendCourse()`

```php
coreMoodlenetSendCourse($core_moodlenet_send_course_request): \OpenAPI\Client\Model\CoreMoodlenetSendCourse200Response
```

Send course to MoodleNet

Send course to MoodleNet

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_moodlenet_send_course_request = new \OpenAPI\Client\Model\CoreMoodlenetSendCourseRequest(); // \OpenAPI\Client\Model\CoreMoodlenetSendCourseRequest

try {
    $result = $apiInstance->coreMoodlenetSendCourse($core_moodlenet_send_course_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMoodlenetSendCourse: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_moodlenet_send_course_request** | [**\OpenAPI\Client\Model\CoreMoodlenetSendCourseRequest**](../Model/CoreMoodlenetSendCourseRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreMoodlenetSendCourse200Response**](../Model/CoreMoodlenetSendCourse200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreMyViewPage()`

```php
coreMyViewPage($core_my_view_page_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger the My or Dashboard viewed event.

Trigger the My or Dashboard viewed event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_my_view_page_request = new \OpenAPI\Client\Model\CoreMyViewPageRequest(); // \OpenAPI\Client\Model\CoreMyViewPageRequest

try {
    $result = $apiInstance->coreMyViewPage($core_my_view_page_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreMyViewPage: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_my_view_page_request** | [**\OpenAPI\Client\Model\CoreMyViewPageRequest**](../Model/CoreMyViewPageRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesCreateNotes()`

```php
coreNotesCreateNotes($core_notes_create_notes_request): object
```

Create notes

Create notes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_create_notes_request = new \OpenAPI\Client\Model\CoreNotesCreateNotesRequest(); // \OpenAPI\Client\Model\CoreNotesCreateNotesRequest

try {
    $result = $apiInstance->coreNotesCreateNotes($core_notes_create_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesCreateNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_create_notes_request** | [**\OpenAPI\Client\Model\CoreNotesCreateNotesRequest**](../Model/CoreNotesCreateNotesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesDeleteNotes()`

```php
coreNotesDeleteNotes($core_notes_delete_notes_request): object
```

Delete notes

Delete notes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_delete_notes_request = new \OpenAPI\Client\Model\CoreNotesDeleteNotesRequest(); // \OpenAPI\Client\Model\CoreNotesDeleteNotesRequest

try {
    $result = $apiInstance->coreNotesDeleteNotes($core_notes_delete_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesDeleteNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_delete_notes_request** | [**\OpenAPI\Client\Model\CoreNotesDeleteNotesRequest**](../Model/CoreNotesDeleteNotesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesGetCourseNotes()`

```php
coreNotesGetCourseNotes($core_notes_get_course_notes_request): \OpenAPI\Client\Model\CoreNotesGetCourseNotes200Response
```

Returns all notes in specified course (or site), for the specified user.

Returns all notes in specified course (or site), for the specified user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_get_course_notes_request = new \OpenAPI\Client\Model\CoreNotesGetCourseNotesRequest(); // \OpenAPI\Client\Model\CoreNotesGetCourseNotesRequest

try {
    $result = $apiInstance->coreNotesGetCourseNotes($core_notes_get_course_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesGetCourseNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_get_course_notes_request** | [**\OpenAPI\Client\Model\CoreNotesGetCourseNotesRequest**](../Model/CoreNotesGetCourseNotesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreNotesGetCourseNotes200Response**](../Model/CoreNotesGetCourseNotes200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesGetNotes()`

```php
coreNotesGetNotes($core_notes_get_notes_request): \OpenAPI\Client\Model\CoreNotesGetNotes200Response
```

Get notes

Get notes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_get_notes_request = new \OpenAPI\Client\Model\CoreNotesGetNotesRequest(); // \OpenAPI\Client\Model\CoreNotesGetNotesRequest

try {
    $result = $apiInstance->coreNotesGetNotes($core_notes_get_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesGetNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_get_notes_request** | [**\OpenAPI\Client\Model\CoreNotesGetNotesRequest**](../Model/CoreNotesGetNotesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreNotesGetNotes200Response**](../Model/CoreNotesGetNotes200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesUpdateNotes()`

```php
coreNotesUpdateNotes($core_notes_update_notes_request): object
```

Update notes

Update notes

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_update_notes_request = new \OpenAPI\Client\Model\CoreNotesUpdateNotesRequest(); // \OpenAPI\Client\Model\CoreNotesUpdateNotesRequest

try {
    $result = $apiInstance->coreNotesUpdateNotes($core_notes_update_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesUpdateNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_update_notes_request** | [**\OpenAPI\Client\Model\CoreNotesUpdateNotesRequest**](../Model/CoreNotesUpdateNotesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreNotesViewNotes()`

```php
coreNotesViewNotes($core_notes_view_notes_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulates the web interface view of notes/index.php: trigger events.

Simulates the web interface view of notes/index.php: trigger events.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_notes_view_notes_request = new \OpenAPI\Client\Model\CoreNotesViewNotesRequest(); // \OpenAPI\Client\Model\CoreNotesViewNotesRequest

try {
    $result = $apiInstance->coreNotesViewNotes($core_notes_view_notes_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreNotesViewNotes: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_notes_view_notes_request** | [**\OpenAPI\Client\Model\CoreNotesViewNotesRequest**](../Model/CoreNotesViewNotesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreOutputLoadFontawesomeIconMap()`

```php
coreOutputLoadFontawesomeIconMap(): object
```

Load the mapping of names to icons

Load the mapping of names to icons

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreOutputLoadFontawesomeIconMap();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreOutputLoadFontawesomeIconMap: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreOutputLoadFontawesomeIconSystemMap()`

```php
coreOutputLoadFontawesomeIconSystemMap($core_output_load_fontawesome_icon_system_map_request): object
```

Load the mapping of moodle pix names to fontawesome icon names

Load the mapping of moodle pix names to fontawesome icon names

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_output_load_fontawesome_icon_system_map_request = new \OpenAPI\Client\Model\CoreOutputLoadFontawesomeIconSystemMapRequest(); // \OpenAPI\Client\Model\CoreOutputLoadFontawesomeIconSystemMapRequest

try {
    $result = $apiInstance->coreOutputLoadFontawesomeIconSystemMap($core_output_load_fontawesome_icon_system_map_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreOutputLoadFontawesomeIconSystemMap: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_output_load_fontawesome_icon_system_map_request** | [**\OpenAPI\Client\Model\CoreOutputLoadFontawesomeIconSystemMapRequest**](../Model/CoreOutputLoadFontawesomeIconSystemMapRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreOutputLoadTemplate()`

```php
coreOutputLoadTemplate($core_output_load_template_request): object
```

Load a template for a renderable

Load a template for a renderable

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_output_load_template_request = new \OpenAPI\Client\Model\CoreOutputLoadTemplateRequest(); // \OpenAPI\Client\Model\CoreOutputLoadTemplateRequest

try {
    $result = $apiInstance->coreOutputLoadTemplate($core_output_load_template_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreOutputLoadTemplate: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_output_load_template_request** | [**\OpenAPI\Client\Model\CoreOutputLoadTemplateRequest**](../Model/CoreOutputLoadTemplateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreOutputLoadTemplateWithDependencies()`

```php
coreOutputLoadTemplateWithDependencies($core_output_load_template_with_dependencies_request): \OpenAPI\Client\Model\CoreOutputLoadTemplateWithDependencies200Response
```

Load a template and its dependencies for a renderable

Load a template and its dependencies for a renderable

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_output_load_template_with_dependencies_request = new \OpenAPI\Client\Model\CoreOutputLoadTemplateWithDependenciesRequest(); // \OpenAPI\Client\Model\CoreOutputLoadTemplateWithDependenciesRequest

try {
    $result = $apiInstance->coreOutputLoadTemplateWithDependencies($core_output_load_template_with_dependencies_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreOutputLoadTemplateWithDependencies: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_output_load_template_with_dependencies_request** | [**\OpenAPI\Client\Model\CoreOutputLoadTemplateWithDependenciesRequest**](../Model/CoreOutputLoadTemplateWithDependenciesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreOutputLoadTemplateWithDependencies200Response**](../Model/CoreOutputLoadTemplateWithDependencies200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `corePaymentGetAvailableGateways()`

```php
corePaymentGetAvailableGateways($core_payment_get_available_gateways_request): object
```

Get the list of payment gateways that support the given component/area

Get the list of payment gateways that support the given component/area

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_payment_get_available_gateways_request = new \OpenAPI\Client\Model\CorePaymentGetAvailableGatewaysRequest(); // \OpenAPI\Client\Model\CorePaymentGetAvailableGatewaysRequest

try {
    $result = $apiInstance->corePaymentGetAvailableGateways($core_payment_get_available_gateways_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->corePaymentGetAvailableGateways: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_payment_get_available_gateways_request** | [**\OpenAPI\Client\Model\CorePaymentGetAvailableGatewaysRequest**](../Model/CorePaymentGetAvailableGatewaysRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreQuestionGetRandomQuestionSummaries()`

```php
coreQuestionGetRandomQuestionSummaries($core_question_get_random_question_summaries_request): \OpenAPI\Client\Model\CoreQuestionGetRandomQuestionSummaries200Response
```

Get the random question set for a criteria

Get the random question set for a criteria

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_question_get_random_question_summaries_request = new \OpenAPI\Client\Model\CoreQuestionGetRandomQuestionSummariesRequest(); // \OpenAPI\Client\Model\CoreQuestionGetRandomQuestionSummariesRequest

try {
    $result = $apiInstance->coreQuestionGetRandomQuestionSummaries($core_question_get_random_question_summaries_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreQuestionGetRandomQuestionSummaries: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_question_get_random_question_summaries_request** | [**\OpenAPI\Client\Model\CoreQuestionGetRandomQuestionSummariesRequest**](../Model/CoreQuestionGetRandomQuestionSummariesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreQuestionGetRandomQuestionSummaries200Response**](../Model/CoreQuestionGetRandomQuestionSummaries200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreQuestionSubmitTagsForm()`

```php
coreQuestionSubmitTagsForm($core_question_submit_tags_form_request): \OpenAPI\Client\Model\CoreQuestionSubmitTagsForm200Response
```

Update the question tags.

Update the question tags.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_question_submit_tags_form_request = new \OpenAPI\Client\Model\CoreQuestionSubmitTagsFormRequest(); // \OpenAPI\Client\Model\CoreQuestionSubmitTagsFormRequest

try {
    $result = $apiInstance->coreQuestionSubmitTagsForm($core_question_submit_tags_form_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreQuestionSubmitTagsForm: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_question_submit_tags_form_request** | [**\OpenAPI\Client\Model\CoreQuestionSubmitTagsFormRequest**](../Model/CoreQuestionSubmitTagsFormRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreQuestionSubmitTagsForm200Response**](../Model/CoreQuestionSubmitTagsForm200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreQuestionUpdateFlag()`

```php
coreQuestionUpdateFlag($core_question_update_flag_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Update the flag state of a question attempt.

Update the flag state of a question attempt.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_question_update_flag_request = new \OpenAPI\Client\Model\CoreQuestionUpdateFlagRequest(); // \OpenAPI\Client\Model\CoreQuestionUpdateFlagRequest

try {
    $result = $apiInstance->coreQuestionUpdateFlag($core_question_update_flag_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreQuestionUpdateFlag: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_question_update_flag_request** | [**\OpenAPI\Client\Model\CoreQuestionUpdateFlagRequest**](../Model/CoreQuestionUpdateFlagRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreRatingAddRating()`

```php
coreRatingAddRating($core_rating_add_rating_request): \OpenAPI\Client\Model\CoreRatingAddRating200Response
```

Rates an item.

Rates an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_rating_add_rating_request = new \OpenAPI\Client\Model\CoreRatingAddRatingRequest(); // \OpenAPI\Client\Model\CoreRatingAddRatingRequest

try {
    $result = $apiInstance->coreRatingAddRating($core_rating_add_rating_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreRatingAddRating: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_rating_add_rating_request** | [**\OpenAPI\Client\Model\CoreRatingAddRatingRequest**](../Model/CoreRatingAddRatingRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreRatingAddRating200Response**](../Model/CoreRatingAddRating200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreRatingGetItemRatings()`

```php
coreRatingGetItemRatings($core_rating_get_item_ratings_request): \OpenAPI\Client\Model\CoreRatingGetItemRatings200Response
```

Retrieve all the ratings for an item.

Retrieve all the ratings for an item.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_rating_get_item_ratings_request = new \OpenAPI\Client\Model\CoreRatingGetItemRatingsRequest(); // \OpenAPI\Client\Model\CoreRatingGetItemRatingsRequest

try {
    $result = $apiInstance->coreRatingGetItemRatings($core_rating_get_item_ratings_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreRatingGetItemRatings: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_rating_get_item_ratings_request** | [**\OpenAPI\Client\Model\CoreRatingGetItemRatingsRequest**](../Model/CoreRatingGetItemRatingsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreRatingGetItemRatings200Response**](../Model/CoreRatingGetItemRatings200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderAudiencesDelete()`

```php
coreReportbuilderAudiencesDelete($core_reportbuilder_audiences_delete_request): object
```

Delete audience from report

Delete audience from report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_audiences_delete_request = new \OpenAPI\Client\Model\CoreReportbuilderAudiencesDeleteRequest(); // \OpenAPI\Client\Model\CoreReportbuilderAudiencesDeleteRequest

try {
    $result = $apiInstance->coreReportbuilderAudiencesDelete($core_reportbuilder_audiences_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderAudiencesDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_audiences_delete_request** | [**\OpenAPI\Client\Model\CoreReportbuilderAudiencesDeleteRequest**](../Model/CoreReportbuilderAudiencesDeleteRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderCanViewSystemReport()`

```php
coreReportbuilderCanViewSystemReport($core_reportbuilder_can_view_system_report_request): object
```

Determine access to a system report

Determine access to a system report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_can_view_system_report_request = new \OpenAPI\Client\Model\CoreReportbuilderCanViewSystemReportRequest(); // \OpenAPI\Client\Model\CoreReportbuilderCanViewSystemReportRequest

try {
    $result = $apiInstance->coreReportbuilderCanViewSystemReport($core_reportbuilder_can_view_system_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderCanViewSystemReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_can_view_system_report_request** | [**\OpenAPI\Client\Model\CoreReportbuilderCanViewSystemReportRequest**](../Model/CoreReportbuilderCanViewSystemReportRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsAdd()`

```php
coreReportbuilderColumnsAdd($core_reportbuilder_columns_add_request): \OpenAPI\Client\Model\CoreReportbuilderColumnsAdd200Response
```

Add column to report

Add column to report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_add_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsAddRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsAddRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsAdd($core_reportbuilder_columns_add_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_add_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsAddRequest**](../Model/CoreReportbuilderColumnsAddRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderColumnsAdd200Response**](../Model/CoreReportbuilderColumnsAdd200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsDelete()`

```php
coreReportbuilderColumnsDelete($core_reportbuilder_columns_delete_request): \OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response
```

Delete column from report

Delete column from report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_delete_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsDeleteRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsDeleteRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsDelete($core_reportbuilder_columns_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_delete_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsDeleteRequest**](../Model/CoreReportbuilderColumnsDeleteRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response**](../Model/CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsReorder()`

```php
coreReportbuilderColumnsReorder($core_reportbuilder_columns_reorder_request): object
```

Re-order column within report

Re-order column within report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_reorder_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsReorderRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsReorderRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsReorder($core_reportbuilder_columns_reorder_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsReorder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_reorder_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsReorderRequest**](../Model/CoreReportbuilderColumnsReorderRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsSortGet()`

```php
coreReportbuilderColumnsSortGet($core_reportbuilder_columns_sort_get_request): \OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response
```

Retrieve column sorting for report

Retrieve column sorting for report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_get_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsSortGet($core_reportbuilder_columns_sort_get_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsSortGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_get_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest**](../Model/CoreReportbuilderColumnsSortGetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response**](../Model/CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsSortReorder()`

```php
coreReportbuilderColumnsSortReorder($core_reportbuilder_columns_sort_reorder_request): \OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response
```

Re-order column sorting within report

Re-order column sorting within report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_reorder_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortReorderRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortReorderRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsSortReorder($core_reportbuilder_columns_sort_reorder_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsSortReorder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_reorder_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortReorderRequest**](../Model/CoreReportbuilderColumnsSortReorderRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response**](../Model/CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderColumnsSortToggle()`

```php
coreReportbuilderColumnsSortToggle($core_reportbuilder_columns_sort_toggle_request): \OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response
```

Toggle sorting of column within report

Toggle sorting of column within report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_toggle_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortToggleRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortToggleRequest

try {
    $result = $apiInstance->coreReportbuilderColumnsSortToggle($core_reportbuilder_columns_sort_toggle_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderColumnsSortToggle: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_toggle_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortToggleRequest**](../Model/CoreReportbuilderColumnsSortToggleRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderColumnsDelete200Response**](../Model/CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderConditionsAdd()`

```php
coreReportbuilderConditionsAdd($core_reportbuilder_conditions_add_request): \OpenAPI\Client\Model\CoreReportbuilderConditionsAdd200Response
```

Add condition to report

Add condition to report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_conditions_add_request = new \OpenAPI\Client\Model\CoreReportbuilderConditionsAddRequest(); // \OpenAPI\Client\Model\CoreReportbuilderConditionsAddRequest

try {
    $result = $apiInstance->coreReportbuilderConditionsAdd($core_reportbuilder_conditions_add_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderConditionsAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_conditions_add_request** | [**\OpenAPI\Client\Model\CoreReportbuilderConditionsAddRequest**](../Model/CoreReportbuilderConditionsAddRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderConditionsAdd200Response**](../Model/CoreReportbuilderConditionsAdd200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderConditionsDelete()`

```php
coreReportbuilderConditionsDelete($core_reportbuilder_conditions_delete_request): \OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response
```

Delete condition from report

Delete condition from report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_conditions_delete_request = new \OpenAPI\Client\Model\CoreReportbuilderConditionsDeleteRequest(); // \OpenAPI\Client\Model\CoreReportbuilderConditionsDeleteRequest

try {
    $result = $apiInstance->coreReportbuilderConditionsDelete($core_reportbuilder_conditions_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderConditionsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_conditions_delete_request** | [**\OpenAPI\Client\Model\CoreReportbuilderConditionsDeleteRequest**](../Model/CoreReportbuilderConditionsDeleteRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response**](../Model/CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderConditionsReorder()`

```php
coreReportbuilderConditionsReorder($core_reportbuilder_conditions_reorder_request): \OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response
```

Re-order condition within report

Re-order condition within report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_conditions_reorder_request = new \OpenAPI\Client\Model\CoreReportbuilderConditionsReorderRequest(); // \OpenAPI\Client\Model\CoreReportbuilderConditionsReorderRequest

try {
    $result = $apiInstance->coreReportbuilderConditionsReorder($core_reportbuilder_conditions_reorder_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderConditionsReorder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_conditions_reorder_request** | [**\OpenAPI\Client\Model\CoreReportbuilderConditionsReorderRequest**](../Model/CoreReportbuilderConditionsReorderRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response**](../Model/CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderConditionsReset()`

```php
coreReportbuilderConditionsReset($core_reportbuilder_columns_sort_get_request): \OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response
```

Reset conditions for given report

Reset conditions for given report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_get_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest

try {
    $result = $apiInstance->coreReportbuilderConditionsReset($core_reportbuilder_columns_sort_get_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderConditionsReset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_get_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest**](../Model/CoreReportbuilderColumnsSortGetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderConditionsDelete200Response**](../Model/CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderFiltersAdd()`

```php
coreReportbuilderFiltersAdd($core_reportbuilder_filters_add_request): \OpenAPI\Client\Model\CoreReportbuilderFiltersAdd200Response
```

Add filter to report

Add filter to report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_filters_add_request = new \OpenAPI\Client\Model\CoreReportbuilderFiltersAddRequest(); // \OpenAPI\Client\Model\CoreReportbuilderFiltersAddRequest

try {
    $result = $apiInstance->coreReportbuilderFiltersAdd($core_reportbuilder_filters_add_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderFiltersAdd: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_filters_add_request** | [**\OpenAPI\Client\Model\CoreReportbuilderFiltersAddRequest**](../Model/CoreReportbuilderFiltersAddRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderFiltersAdd200Response**](../Model/CoreReportbuilderFiltersAdd200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderFiltersDelete()`

```php
coreReportbuilderFiltersDelete($core_reportbuilder_filters_delete_request): \OpenAPI\Client\Model\CoreReportbuilderFiltersDelete200Response
```

Delete filter from report

Delete filter from report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_filters_delete_request = new \OpenAPI\Client\Model\CoreReportbuilderFiltersDeleteRequest(); // \OpenAPI\Client\Model\CoreReportbuilderFiltersDeleteRequest

try {
    $result = $apiInstance->coreReportbuilderFiltersDelete($core_reportbuilder_filters_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderFiltersDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_filters_delete_request** | [**\OpenAPI\Client\Model\CoreReportbuilderFiltersDeleteRequest**](../Model/CoreReportbuilderFiltersDeleteRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderFiltersDelete200Response**](../Model/CoreReportbuilderFiltersDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderFiltersReorder()`

```php
coreReportbuilderFiltersReorder($core_reportbuilder_filters_reorder_request): \OpenAPI\Client\Model\CoreReportbuilderFiltersDelete200Response
```

Re-order filter within report

Re-order filter within report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_filters_reorder_request = new \OpenAPI\Client\Model\CoreReportbuilderFiltersReorderRequest(); // \OpenAPI\Client\Model\CoreReportbuilderFiltersReorderRequest

try {
    $result = $apiInstance->coreReportbuilderFiltersReorder($core_reportbuilder_filters_reorder_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderFiltersReorder: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_filters_reorder_request** | [**\OpenAPI\Client\Model\CoreReportbuilderFiltersReorderRequest**](../Model/CoreReportbuilderFiltersReorderRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderFiltersDelete200Response**](../Model/CoreReportbuilderFiltersDelete200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderFiltersReset()`

```php
coreReportbuilderFiltersReset($core_reportbuilder_filters_reset_request): object
```

Reset filters for given report

Reset filters for given report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_filters_reset_request = new \OpenAPI\Client\Model\CoreReportbuilderFiltersResetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderFiltersResetRequest

try {
    $result = $apiInstance->coreReportbuilderFiltersReset($core_reportbuilder_filters_reset_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderFiltersReset: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_filters_reset_request** | [**\OpenAPI\Client\Model\CoreReportbuilderFiltersResetRequest**](../Model/CoreReportbuilderFiltersResetRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderListReports()`

```php
coreReportbuilderListReports($core_reportbuilder_list_reports_request): \OpenAPI\Client\Model\CoreReportbuilderListReports200Response
```

List custom reports for current user

List custom reports for current user

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_list_reports_request = new \OpenAPI\Client\Model\CoreReportbuilderListReportsRequest(); // \OpenAPI\Client\Model\CoreReportbuilderListReportsRequest

try {
    $result = $apiInstance->coreReportbuilderListReports($core_reportbuilder_list_reports_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderListReports: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_list_reports_request** | [**\OpenAPI\Client\Model\CoreReportbuilderListReportsRequest**](../Model/CoreReportbuilderListReportsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderListReports200Response**](../Model/CoreReportbuilderListReports200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderReportsDelete()`

```php
coreReportbuilderReportsDelete($core_reportbuilder_columns_sort_get_request): object
```

Delete report

Delete report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_get_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest

try {
    $result = $apiInstance->coreReportbuilderReportsDelete($core_reportbuilder_columns_sort_get_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderReportsDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_get_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest**](../Model/CoreReportbuilderColumnsSortGetRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderReportsGet()`

```php
coreReportbuilderReportsGet($core_reportbuilder_reports_get_request): \OpenAPI\Client\Model\CoreReportbuilderReportsGet200Response
```

Get custom report

Get custom report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_reports_get_request = new \OpenAPI\Client\Model\CoreReportbuilderReportsGetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderReportsGetRequest

try {
    $result = $apiInstance->coreReportbuilderReportsGet($core_reportbuilder_reports_get_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderReportsGet: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_reports_get_request** | [**\OpenAPI\Client\Model\CoreReportbuilderReportsGetRequest**](../Model/CoreReportbuilderReportsGetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderReportsGet200Response**](../Model/CoreReportbuilderReportsGet200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderRetrieveReport()`

```php
coreReportbuilderRetrieveReport($core_reportbuilder_retrieve_report_request): \OpenAPI\Client\Model\CoreReportbuilderRetrieveReport200Response
```

Retrieve custom report content

Retrieve custom report content

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_retrieve_report_request = new \OpenAPI\Client\Model\CoreReportbuilderRetrieveReportRequest(); // \OpenAPI\Client\Model\CoreReportbuilderRetrieveReportRequest

try {
    $result = $apiInstance->coreReportbuilderRetrieveReport($core_reportbuilder_retrieve_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderRetrieveReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_retrieve_report_request** | [**\OpenAPI\Client\Model\CoreReportbuilderRetrieveReportRequest**](../Model/CoreReportbuilderRetrieveReportRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderRetrieveReport200Response**](../Model/CoreReportbuilderRetrieveReport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderRetrieveSystemReport()`

```php
coreReportbuilderRetrieveSystemReport($core_reportbuilder_retrieve_system_report_request): \OpenAPI\Client\Model\CoreReportbuilderRetrieveSystemReport200Response
```

Retrieve system report content

Retrieve system report content

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_retrieve_system_report_request = new \OpenAPI\Client\Model\CoreReportbuilderRetrieveSystemReportRequest(); // \OpenAPI\Client\Model\CoreReportbuilderRetrieveSystemReportRequest

try {
    $result = $apiInstance->coreReportbuilderRetrieveSystemReport($core_reportbuilder_retrieve_system_report_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderRetrieveSystemReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_retrieve_system_report_request** | [**\OpenAPI\Client\Model\CoreReportbuilderRetrieveSystemReportRequest**](../Model/CoreReportbuilderRetrieveSystemReportRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderRetrieveSystemReport200Response**](../Model/CoreReportbuilderRetrieveSystemReport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderSchedulesDelete()`

```php
coreReportbuilderSchedulesDelete($core_reportbuilder_schedules_delete_request): object
```

Delete schedule from report

Delete schedule from report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_schedules_delete_request = new \OpenAPI\Client\Model\CoreReportbuilderSchedulesDeleteRequest(); // \OpenAPI\Client\Model\CoreReportbuilderSchedulesDeleteRequest

try {
    $result = $apiInstance->coreReportbuilderSchedulesDelete($core_reportbuilder_schedules_delete_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderSchedulesDelete: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_schedules_delete_request** | [**\OpenAPI\Client\Model\CoreReportbuilderSchedulesDeleteRequest**](../Model/CoreReportbuilderSchedulesDeleteRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderSchedulesSend()`

```php
coreReportbuilderSchedulesSend($core_reportbuilder_schedules_send_request): object
```

Send report schedule

Send report schedule

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_schedules_send_request = new \OpenAPI\Client\Model\CoreReportbuilderSchedulesSendRequest(); // \OpenAPI\Client\Model\CoreReportbuilderSchedulesSendRequest

try {
    $result = $apiInstance->coreReportbuilderSchedulesSend($core_reportbuilder_schedules_send_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderSchedulesSend: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_schedules_send_request** | [**\OpenAPI\Client\Model\CoreReportbuilderSchedulesSendRequest**](../Model/CoreReportbuilderSchedulesSendRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderSchedulesToggle()`

```php
coreReportbuilderSchedulesToggle($core_reportbuilder_schedules_toggle_request): object
```

Toggle state of report schedule

Toggle state of report schedule

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_schedules_toggle_request = new \OpenAPI\Client\Model\CoreReportbuilderSchedulesToggleRequest(); // \OpenAPI\Client\Model\CoreReportbuilderSchedulesToggleRequest

try {
    $result = $apiInstance->coreReportbuilderSchedulesToggle($core_reportbuilder_schedules_toggle_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderSchedulesToggle: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_schedules_toggle_request** | [**\OpenAPI\Client\Model\CoreReportbuilderSchedulesToggleRequest**](../Model/CoreReportbuilderSchedulesToggleRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderSetFilters()`

```php
coreReportbuilderSetFilters($core_reportbuilder_set_filters_request): object
```

Set filter values for given report

Set filter values for given report

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_set_filters_request = new \OpenAPI\Client\Model\CoreReportbuilderSetFiltersRequest(); // \OpenAPI\Client\Model\CoreReportbuilderSetFiltersRequest

try {
    $result = $apiInstance->coreReportbuilderSetFilters($core_reportbuilder_set_filters_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderSetFilters: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_set_filters_request** | [**\OpenAPI\Client\Model\CoreReportbuilderSetFiltersRequest**](../Model/CoreReportbuilderSetFiltersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreReportbuilderViewReport()`

```php
coreReportbuilderViewReport($core_reportbuilder_columns_sort_get_request): \OpenAPI\Client\Model\CoreReportbuilderViewReport200Response
```

Trigger custom report viewed

Trigger custom report viewed

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_reportbuilder_columns_sort_get_request = new \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest(); // \OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest

try {
    $result = $apiInstance->coreReportbuilderViewReport($core_reportbuilder_columns_sort_get_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreReportbuilderViewReport: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_reportbuilder_columns_sort_get_request** | [**\OpenAPI\Client\Model\CoreReportbuilderColumnsSortGetRequest**](../Model/CoreReportbuilderColumnsSortGetRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreReportbuilderViewReport200Response**](../Model/CoreReportbuilderViewReport200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreRoleAssignRoles()`

```php
coreRoleAssignRoles($core_role_assign_roles_request): object
```

Manual role assignments.

Manual role assignments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_role_assign_roles_request = new \OpenAPI\Client\Model\CoreRoleAssignRolesRequest(); // \OpenAPI\Client\Model\CoreRoleAssignRolesRequest

try {
    $result = $apiInstance->coreRoleAssignRoles($core_role_assign_roles_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreRoleAssignRoles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_role_assign_roles_request** | [**\OpenAPI\Client\Model\CoreRoleAssignRolesRequest**](../Model/CoreRoleAssignRolesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreRoleUnassignRoles()`

```php
coreRoleUnassignRoles($core_role_unassign_roles_request): object
```

Manual role unassignments.

Manual role unassignments.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_role_unassign_roles_request = new \OpenAPI\Client\Model\CoreRoleUnassignRolesRequest(); // \OpenAPI\Client\Model\CoreRoleUnassignRolesRequest

try {
    $result = $apiInstance->coreRoleUnassignRoles($core_role_unassign_roles_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreRoleUnassignRoles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_role_unassign_roles_request** | [**\OpenAPI\Client\Model\CoreRoleUnassignRolesRequest**](../Model/CoreRoleUnassignRolesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSearchGetRelevantUsers()`

```php
coreSearchGetRelevantUsers($core_search_get_relevant_users_request): object
```

Gets relevant users for a search request.

Gets relevant users for a search request.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_search_get_relevant_users_request = new \OpenAPI\Client\Model\CoreSearchGetRelevantUsersRequest(); // \OpenAPI\Client\Model\CoreSearchGetRelevantUsersRequest

try {
    $result = $apiInstance->coreSearchGetRelevantUsers($core_search_get_relevant_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSearchGetRelevantUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_search_get_relevant_users_request** | [**\OpenAPI\Client\Model\CoreSearchGetRelevantUsersRequest**](../Model/CoreSearchGetRelevantUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSearchGetResults()`

```php
coreSearchGetResults($core_search_get_results_request): \OpenAPI\Client\Model\CoreSearchGetResults200Response
```

Get search results.

Get search results.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_search_get_results_request = new \OpenAPI\Client\Model\CoreSearchGetResultsRequest(); // \OpenAPI\Client\Model\CoreSearchGetResultsRequest

try {
    $result = $apiInstance->coreSearchGetResults($core_search_get_results_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSearchGetResults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_search_get_results_request** | [**\OpenAPI\Client\Model\CoreSearchGetResultsRequest**](../Model/CoreSearchGetResultsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreSearchGetResults200Response**](../Model/CoreSearchGetResults200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSearchGetSearchAreasList()`

```php
coreSearchGetSearchAreasList($core_search_get_search_areas_list_request): \OpenAPI\Client\Model\CoreSearchGetSearchAreasList200Response
```

Get search areas.

Get search areas.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_search_get_search_areas_list_request = new \OpenAPI\Client\Model\CoreSearchGetSearchAreasListRequest(); // \OpenAPI\Client\Model\CoreSearchGetSearchAreasListRequest

try {
    $result = $apiInstance->coreSearchGetSearchAreasList($core_search_get_search_areas_list_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSearchGetSearchAreasList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_search_get_search_areas_list_request** | [**\OpenAPI\Client\Model\CoreSearchGetSearchAreasListRequest**](../Model/CoreSearchGetSearchAreasListRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreSearchGetSearchAreasList200Response**](../Model/CoreSearchGetSearchAreasList200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSearchGetTopResults()`

```php
coreSearchGetTopResults($core_search_get_top_results_request): \OpenAPI\Client\Model\CoreSearchGetTopResults200Response
```

Get top search results.

Get top search results.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_search_get_top_results_request = new \OpenAPI\Client\Model\CoreSearchGetTopResultsRequest(); // \OpenAPI\Client\Model\CoreSearchGetTopResultsRequest

try {
    $result = $apiInstance->coreSearchGetTopResults($core_search_get_top_results_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSearchGetTopResults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_search_get_top_results_request** | [**\OpenAPI\Client\Model\CoreSearchGetTopResultsRequest**](../Model/CoreSearchGetTopResultsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreSearchGetTopResults200Response**](../Model/CoreSearchGetTopResults200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSearchViewResults()`

```php
coreSearchViewResults($core_search_view_results_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Trigger view search results event.

Trigger view search results event.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_search_view_results_request = new \OpenAPI\Client\Model\CoreSearchViewResultsRequest(); // \OpenAPI\Client\Model\CoreSearchViewResultsRequest

try {
    $result = $apiInstance->coreSearchViewResults($core_search_view_results_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSearchViewResults: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_search_view_results_request** | [**\OpenAPI\Client\Model\CoreSearchViewResultsRequest**](../Model/CoreSearchViewResultsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSessionTimeRemaining()`

```php
coreSessionTimeRemaining(): \OpenAPI\Client\Model\CoreSessionTimeRemaining200Response
```

Count the seconds remaining in this session

Count the seconds remaining in this session

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreSessionTimeRemaining();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSessionTimeRemaining: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreSessionTimeRemaining200Response**](../Model/CoreSessionTimeRemaining200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreSessionTouch()`

```php
coreSessionTouch(): object
```

Keep the users session alive

Keep the users session alive

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreSessionTouch();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreSessionTouch: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTableGetDynamicTableContent()`

```php
coreTableGetDynamicTableContent($core_table_get_dynamic_table_content_request): \OpenAPI\Client\Model\CoreTableGetDynamicTableContent200Response
```

Get the dynamic table content raw html

Get the dynamic table content raw html

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_table_get_dynamic_table_content_request = new \OpenAPI\Client\Model\CoreTableGetDynamicTableContentRequest(); // \OpenAPI\Client\Model\CoreTableGetDynamicTableContentRequest

try {
    $result = $apiInstance->coreTableGetDynamicTableContent($core_table_get_dynamic_table_content_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTableGetDynamicTableContent: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_table_get_dynamic_table_content_request** | [**\OpenAPI\Client\Model\CoreTableGetDynamicTableContentRequest**](../Model/CoreTableGetDynamicTableContentRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreTableGetDynamicTableContent200Response**](../Model/CoreTableGetDynamicTableContent200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTagAreas()`

```php
coreTagGetTagAreas(): \OpenAPI\Client\Model\CoreTagGetTagAreas200Response
```

Retrieves existing tag areas.

Retrieves existing tag areas.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreTagGetTagAreas();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTagAreas: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreTagGetTagAreas200Response**](../Model/CoreTagGetTagAreas200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTagCloud()`

```php
coreTagGetTagCloud($core_tag_get_tag_cloud_request): \OpenAPI\Client\Model\CoreTagGetTagCloud200Response
```

Retrieves a tag cloud for the given collection and/or query search.

Retrieves a tag cloud for the given collection and/or query search.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_tag_get_tag_cloud_request = new \OpenAPI\Client\Model\CoreTagGetTagCloudRequest(); // \OpenAPI\Client\Model\CoreTagGetTagCloudRequest

try {
    $result = $apiInstance->coreTagGetTagCloud($core_tag_get_tag_cloud_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTagCloud: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_tag_get_tag_cloud_request** | [**\OpenAPI\Client\Model\CoreTagGetTagCloudRequest**](../Model/CoreTagGetTagCloudRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreTagGetTagCloud200Response**](../Model/CoreTagGetTagCloud200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTagCollections()`

```php
coreTagGetTagCollections(): \OpenAPI\Client\Model\CoreTagGetTagCollections200Response
```

Retrieves existing tag collections.

Retrieves existing tag collections.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreTagGetTagCollections();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTagCollections: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreTagGetTagCollections200Response**](../Model/CoreTagGetTagCollections200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTagindex()`

```php
coreTagGetTagindex($core_tag_get_tagindex_request): \OpenAPI\Client\Model\CoreTagGetTagindex200Response
```

Gets tag index page for one tag and one tag area

Gets tag index page for one tag and one tag area

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_tag_get_tagindex_request = new \OpenAPI\Client\Model\CoreTagGetTagindexRequest(); // \OpenAPI\Client\Model\CoreTagGetTagindexRequest

try {
    $result = $apiInstance->coreTagGetTagindex($core_tag_get_tagindex_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTagindex: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_tag_get_tagindex_request** | [**\OpenAPI\Client\Model\CoreTagGetTagindexRequest**](../Model/CoreTagGetTagindexRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreTagGetTagindex200Response**](../Model/CoreTagGetTagindex200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTagindexPerArea()`

```php
coreTagGetTagindexPerArea($core_tag_get_tagindex_per_area_request): object
```

Gets tag index page per different areas.

Gets tag index page per different areas.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_tag_get_tagindex_per_area_request = new \OpenAPI\Client\Model\CoreTagGetTagindexPerAreaRequest(); // \OpenAPI\Client\Model\CoreTagGetTagindexPerAreaRequest

try {
    $result = $apiInstance->coreTagGetTagindexPerArea($core_tag_get_tagindex_per_area_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTagindexPerArea: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_tag_get_tagindex_per_area_request** | [**\OpenAPI\Client\Model\CoreTagGetTagindexPerAreaRequest**](../Model/CoreTagGetTagindexPerAreaRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagGetTags()`

```php
coreTagGetTags($core_tag_get_tags_request): \OpenAPI\Client\Model\CoreTagGetTags200Response
```

Gets tags by their ids

Gets tags by their ids

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_tag_get_tags_request = new \OpenAPI\Client\Model\CoreTagGetTagsRequest(); // \OpenAPI\Client\Model\CoreTagGetTagsRequest

try {
    $result = $apiInstance->coreTagGetTags($core_tag_get_tags_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagGetTags: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_tag_get_tags_request** | [**\OpenAPI\Client\Model\CoreTagGetTagsRequest**](../Model/CoreTagGetTagsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreTagGetTags200Response**](../Model/CoreTagGetTags200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreTagUpdateTags()`

```php
coreTagUpdateTags($core_tag_update_tags_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Updates tags

Updates tags

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_tag_update_tags_request = new \OpenAPI\Client\Model\CoreTagUpdateTagsRequest(); // \OpenAPI\Client\Model\CoreTagUpdateTagsRequest

try {
    $result = $apiInstance->coreTagUpdateTags($core_tag_update_tags_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreTagUpdateTags: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_tag_update_tags_request** | [**\OpenAPI\Client\Model\CoreTagUpdateTagsRequest**](../Model/CoreTagUpdateTagsRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUpdateInplaceEditable()`

```php
coreUpdateInplaceEditable($core_update_inplace_editable_request): \OpenAPI\Client\Model\CoreUpdateInplaceEditable200Response
```

Generic service to update title

Generic service to update title

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_update_inplace_editable_request = new \OpenAPI\Client\Model\CoreUpdateInplaceEditableRequest(); // \OpenAPI\Client\Model\CoreUpdateInplaceEditableRequest

try {
    $result = $apiInstance->coreUpdateInplaceEditable($core_update_inplace_editable_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUpdateInplaceEditable: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_update_inplace_editable_request** | [**\OpenAPI\Client\Model\CoreUpdateInplaceEditableRequest**](../Model/CoreUpdateInplaceEditableRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUpdateInplaceEditable200Response**](../Model/CoreUpdateInplaceEditable200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserAddUserDevice()`

```php
coreUserAddUserDevice($core_user_add_user_device_request): object
```

Store mobile user devices information for PUSH Notifications.

Store mobile user devices information for PUSH Notifications.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_add_user_device_request = new \OpenAPI\Client\Model\CoreUserAddUserDeviceRequest(); // \OpenAPI\Client\Model\CoreUserAddUserDeviceRequest

try {
    $result = $apiInstance->coreUserAddUserDevice($core_user_add_user_device_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserAddUserDevice: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_add_user_device_request** | [**\OpenAPI\Client\Model\CoreUserAddUserDeviceRequest**](../Model/CoreUserAddUserDeviceRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserAddUserPrivateFiles()`

```php
coreUserAddUserPrivateFiles($core_user_add_user_private_files_request): object
```

Copy files from a draft area to users private files area.

Copy files from a draft area to users private files area.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_add_user_private_files_request = new \OpenAPI\Client\Model\CoreUserAddUserPrivateFilesRequest(); // \OpenAPI\Client\Model\CoreUserAddUserPrivateFilesRequest

try {
    $result = $apiInstance->coreUserAddUserPrivateFiles($core_user_add_user_private_files_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserAddUserPrivateFiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_add_user_private_files_request** | [**\OpenAPI\Client\Model\CoreUserAddUserPrivateFilesRequest**](../Model/CoreUserAddUserPrivateFilesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserAgreeSitePolicy()`

```php
coreUserAgreeSitePolicy(): \OpenAPI\Client\Model\CoreUserAgreeSitePolicy200Response
```

Agree the site policy for the current user.

Agree the site policy for the current user.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);

try {
    $result = $apiInstance->coreUserAgreeSitePolicy();
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserAgreeSitePolicy: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**\OpenAPI\Client\Model\CoreUserAgreeSitePolicy200Response**](../Model/CoreUserAgreeSitePolicy200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserCreateUsers()`

```php
coreUserCreateUsers($core_user_create_users_request): object
```

Create users.

Create users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_create_users_request = new \OpenAPI\Client\Model\CoreUserCreateUsersRequest(); // \OpenAPI\Client\Model\CoreUserCreateUsersRequest

try {
    $result = $apiInstance->coreUserCreateUsers($core_user_create_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserCreateUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_create_users_request** | [**\OpenAPI\Client\Model\CoreUserCreateUsersRequest**](../Model/CoreUserCreateUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserDeleteUsers()`

```php
coreUserDeleteUsers($core_user_delete_users_request): object
```

Delete users.

Delete users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_delete_users_request = new \OpenAPI\Client\Model\CoreUserDeleteUsersRequest(); // \OpenAPI\Client\Model\CoreUserDeleteUsersRequest

try {
    $result = $apiInstance->coreUserDeleteUsers($core_user_delete_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserDeleteUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_delete_users_request** | [**\OpenAPI\Client\Model\CoreUserDeleteUsersRequest**](../Model/CoreUserDeleteUsersRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserGetCourseUserProfiles()`

```php
coreUserGetCourseUserProfiles($core_user_get_course_user_profiles_request): object
```

Get course user profiles (each of the profils matching a course id and a user id),.

Get course user profiles (each of the profils matching a course id and a user id),.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_get_course_user_profiles_request = new \OpenAPI\Client\Model\CoreUserGetCourseUserProfilesRequest(); // \OpenAPI\Client\Model\CoreUserGetCourseUserProfilesRequest

try {
    $result = $apiInstance->coreUserGetCourseUserProfiles($core_user_get_course_user_profiles_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserGetCourseUserProfiles: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_get_course_user_profiles_request** | [**\OpenAPI\Client\Model\CoreUserGetCourseUserProfilesRequest**](../Model/CoreUserGetCourseUserProfilesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserGetPrivateFilesInfo()`

```php
coreUserGetPrivateFilesInfo($core_user_get_private_files_info_request): \OpenAPI\Client\Model\CoreUserGetPrivateFilesInfo200Response
```

Returns general information about files in the user private files area.

Returns general information about files in the user private files area.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_get_private_files_info_request = new \OpenAPI\Client\Model\CoreUserGetPrivateFilesInfoRequest(); // \OpenAPI\Client\Model\CoreUserGetPrivateFilesInfoRequest

try {
    $result = $apiInstance->coreUserGetPrivateFilesInfo($core_user_get_private_files_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserGetPrivateFilesInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_get_private_files_info_request** | [**\OpenAPI\Client\Model\CoreUserGetPrivateFilesInfoRequest**](../Model/CoreUserGetPrivateFilesInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserGetPrivateFilesInfo200Response**](../Model/CoreUserGetPrivateFilesInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserGetUserPreferences()`

```php
coreUserGetUserPreferences($core_user_get_user_preferences_request): \OpenAPI\Client\Model\CoreUserGetUserPreferences200Response
```

Return user preferences.

Return user preferences.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_get_user_preferences_request = new \OpenAPI\Client\Model\CoreUserGetUserPreferencesRequest(); // \OpenAPI\Client\Model\CoreUserGetUserPreferencesRequest

try {
    $result = $apiInstance->coreUserGetUserPreferences($core_user_get_user_preferences_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserGetUserPreferences: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_get_user_preferences_request** | [**\OpenAPI\Client\Model\CoreUserGetUserPreferencesRequest**](../Model/CoreUserGetUserPreferencesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserGetUserPreferences200Response**](../Model/CoreUserGetUserPreferences200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserGetUsers()`

```php
coreUserGetUsers($core_user_get_users_request): \OpenAPI\Client\Model\CoreUserGetUsers200Response
```

search for users matching the parameters

search for users matching the parameters

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_get_users_request = new \OpenAPI\Client\Model\CoreUserGetUsersRequest(); // \OpenAPI\Client\Model\CoreUserGetUsersRequest

try {
    $result = $apiInstance->coreUserGetUsers($core_user_get_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserGetUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_get_users_request** | [**\OpenAPI\Client\Model\CoreUserGetUsersRequest**](../Model/CoreUserGetUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserGetUsers200Response**](../Model/CoreUserGetUsers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserGetUsersByField()`

```php
coreUserGetUsersByField($core_user_get_users_by_field_request): object
```

Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().

Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_get_users_by_field_request = new \OpenAPI\Client\Model\CoreUserGetUsersByFieldRequest(); // \OpenAPI\Client\Model\CoreUserGetUsersByFieldRequest

try {
    $result = $apiInstance->coreUserGetUsersByField($core_user_get_users_by_field_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserGetUsersByField: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_get_users_by_field_request** | [**\OpenAPI\Client\Model\CoreUserGetUsersByFieldRequest**](../Model/CoreUserGetUsersByFieldRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserRemoveUserDevice()`

```php
coreUserRemoveUserDevice($core_user_remove_user_device_request): \OpenAPI\Client\Model\CoreUserRemoveUserDevice200Response
```

Remove a user device from the Moodle database.

Remove a user device from the Moodle database.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_remove_user_device_request = new \OpenAPI\Client\Model\CoreUserRemoveUserDeviceRequest(); // \OpenAPI\Client\Model\CoreUserRemoveUserDeviceRequest

try {
    $result = $apiInstance->coreUserRemoveUserDevice($core_user_remove_user_device_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserRemoveUserDevice: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_remove_user_device_request** | [**\OpenAPI\Client\Model\CoreUserRemoveUserDeviceRequest**](../Model/CoreUserRemoveUserDeviceRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserRemoveUserDevice200Response**](../Model/CoreUserRemoveUserDevice200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserSearchIdentity()`

```php
coreUserSearchIdentity($core_user_search_identity_request): \OpenAPI\Client\Model\CoreUserSearchIdentity200Response
```

Return list of users identities matching the given criteria in their name or other identity fields.

Return list of users identities matching the given criteria in their name or other identity fields.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_search_identity_request = new \OpenAPI\Client\Model\CoreUserSearchIdentityRequest(); // \OpenAPI\Client\Model\CoreUserSearchIdentityRequest

try {
    $result = $apiInstance->coreUserSearchIdentity($core_user_search_identity_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserSearchIdentity: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_search_identity_request** | [**\OpenAPI\Client\Model\CoreUserSearchIdentityRequest**](../Model/CoreUserSearchIdentityRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserSearchIdentity200Response**](../Model/CoreUserSearchIdentity200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserSetUserPreferences()`

```php
coreUserSetUserPreferences($core_user_set_user_preferences_request): \OpenAPI\Client\Model\CoreUserSetUserPreferences200Response
```

Set user preferences.

Set user preferences.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_set_user_preferences_request = new \OpenAPI\Client\Model\CoreUserSetUserPreferencesRequest(); // \OpenAPI\Client\Model\CoreUserSetUserPreferencesRequest

try {
    $result = $apiInstance->coreUserSetUserPreferences($core_user_set_user_preferences_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserSetUserPreferences: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_set_user_preferences_request** | [**\OpenAPI\Client\Model\CoreUserSetUserPreferencesRequest**](../Model/CoreUserSetUserPreferencesRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserSetUserPreferences200Response**](../Model/CoreUserSetUserPreferences200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserUpdatePicture()`

```php
coreUserUpdatePicture($core_user_update_picture_request): \OpenAPI\Client\Model\CoreUserUpdatePicture200Response
```

Update or delete the user picture in the site

Update or delete the user picture in the site

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_update_picture_request = new \OpenAPI\Client\Model\CoreUserUpdatePictureRequest(); // \OpenAPI\Client\Model\CoreUserUpdatePictureRequest

try {
    $result = $apiInstance->coreUserUpdatePicture($core_user_update_picture_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserUpdatePicture: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_update_picture_request** | [**\OpenAPI\Client\Model\CoreUserUpdatePictureRequest**](../Model/CoreUserUpdatePictureRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserUpdatePicture200Response**](../Model/CoreUserUpdatePicture200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserUpdateUserDevicePublicKey()`

```php
coreUserUpdateUserDevicePublicKey($core_user_update_user_device_public_key_request): \OpenAPI\Client\Model\CoreUserUpdateUserDevicePublicKey200Response
```

Store mobile user public key.

Store mobile user public key.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_update_user_device_public_key_request = new \OpenAPI\Client\Model\CoreUserUpdateUserDevicePublicKeyRequest(); // \OpenAPI\Client\Model\CoreUserUpdateUserDevicePublicKeyRequest

try {
    $result = $apiInstance->coreUserUpdateUserDevicePublicKey($core_user_update_user_device_public_key_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserUpdateUserDevicePublicKey: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_update_user_device_public_key_request** | [**\OpenAPI\Client\Model\CoreUserUpdateUserDevicePublicKeyRequest**](../Model/CoreUserUpdateUserDevicePublicKeyRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreUserUpdateUserDevicePublicKey200Response**](../Model/CoreUserUpdateUserDevicePublicKey200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserUpdateUserPreferences()`

```php
coreUserUpdateUserPreferences($core_user_update_user_preferences_request): object
```

Update a user's preferences

Update a user's preferences

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_update_user_preferences_request = new \OpenAPI\Client\Model\CoreUserUpdateUserPreferencesRequest(); // \OpenAPI\Client\Model\CoreUserUpdateUserPreferencesRequest

try {
    $result = $apiInstance->coreUserUpdateUserPreferences($core_user_update_user_preferences_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserUpdateUserPreferences: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_update_user_preferences_request** | [**\OpenAPI\Client\Model\CoreUserUpdateUserPreferencesRequest**](../Model/CoreUserUpdateUserPreferencesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserUpdateUsers()`

```php
coreUserUpdateUsers($core_user_update_users_request): \OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response
```

Update users.

Update users.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_update_users_request = new \OpenAPI\Client\Model\CoreUserUpdateUsersRequest(); // \OpenAPI\Client\Model\CoreUserUpdateUsersRequest

try {
    $result = $apiInstance->coreUserUpdateUsers($core_user_update_users_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserUpdateUsers: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_update_users_request** | [**\OpenAPI\Client\Model\CoreUserUpdateUsersRequest**](../Model/CoreUserUpdateUsersRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCohortAddCohortMembers200Response**](../Model/CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserViewUserList()`

```php
coreUserViewUserList($core_user_view_user_list_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulates the web-interface view of user/index.php (triggering events),.

Simulates the web-interface view of user/index.php (triggering events),.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_view_user_list_request = new \OpenAPI\Client\Model\CoreUserViewUserListRequest(); // \OpenAPI\Client\Model\CoreUserViewUserListRequest

try {
    $result = $apiInstance->coreUserViewUserList($core_user_view_user_list_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserViewUserList: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_view_user_list_request** | [**\OpenAPI\Client\Model\CoreUserViewUserListRequest**](../Model/CoreUserViewUserListRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreUserViewUserProfile()`

```php
coreUserViewUserProfile($core_user_view_user_profile_request): \OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response
```

Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.

Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_user_view_user_profile_request = new \OpenAPI\Client\Model\CoreUserViewUserProfileRequest(); // \OpenAPI\Client\Model\CoreUserViewUserProfileRequest

try {
    $result = $apiInstance->coreUserViewUserProfile($core_user_view_user_profile_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreUserViewUserProfile: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_user_view_user_profile_request** | [**\OpenAPI\Client\Model\CoreUserViewUserProfileRequest**](../Model/CoreUserViewUserProfileRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreCalendarDeleteSubscription200Response**](../Model/CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreWebserviceGetSiteInfo()`

```php
coreWebserviceGetSiteInfo($core_webservice_get_site_info_request): \OpenAPI\Client\Model\CoreWebserviceGetSiteInfo200Response
```

Return some site info / user info / list web service functions

Return some site info / user info / list web service functions

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_webservice_get_site_info_request = new \OpenAPI\Client\Model\CoreWebserviceGetSiteInfoRequest(); // \OpenAPI\Client\Model\CoreWebserviceGetSiteInfoRequest

try {
    $result = $apiInstance->coreWebserviceGetSiteInfo($core_webservice_get_site_info_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreWebserviceGetSiteInfo: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_webservice_get_site_info_request** | [**\OpenAPI\Client\Model\CoreWebserviceGetSiteInfoRequest**](../Model/CoreWebserviceGetSiteInfoRequest.md)|  | |

### Return type

[**\OpenAPI\Client\Model\CoreWebserviceGetSiteInfo200Response**](../Model/CoreWebserviceGetSiteInfo200Response.md)

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiDeleteState()`

```php
coreXapiDeleteState($core_xapi_delete_state_request): object
```

Delete an xAPI state data from an activityId.

Delete an xAPI state data from an activityId.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_delete_state_request = new \OpenAPI\Client\Model\CoreXapiDeleteStateRequest(); // \OpenAPI\Client\Model\CoreXapiDeleteStateRequest

try {
    $result = $apiInstance->coreXapiDeleteState($core_xapi_delete_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiDeleteState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_delete_state_request** | [**\OpenAPI\Client\Model\CoreXapiDeleteStateRequest**](../Model/CoreXapiDeleteStateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiDeleteStates()`

```php
coreXapiDeleteStates($core_xapi_delete_states_request): object
```

Delete all xAPI state data from an activityId.

Delete all xAPI state data from an activityId.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_delete_states_request = new \OpenAPI\Client\Model\CoreXapiDeleteStatesRequest(); // \OpenAPI\Client\Model\CoreXapiDeleteStatesRequest

try {
    $result = $apiInstance->coreXapiDeleteStates($core_xapi_delete_states_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiDeleteStates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_delete_states_request** | [**\OpenAPI\Client\Model\CoreXapiDeleteStatesRequest**](../Model/CoreXapiDeleteStatesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiGetState()`

```php
coreXapiGetState($core_xapi_get_state_request): object
```

Get an xAPI state data from an activityId.

Get an xAPI state data from an activityId.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_get_state_request = new \OpenAPI\Client\Model\CoreXapiGetStateRequest(); // \OpenAPI\Client\Model\CoreXapiGetStateRequest

try {
    $result = $apiInstance->coreXapiGetState($core_xapi_get_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiGetState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_get_state_request** | [**\OpenAPI\Client\Model\CoreXapiGetStateRequest**](../Model/CoreXapiGetStateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiGetStates()`

```php
coreXapiGetStates($core_xapi_get_states_request): object
```

Get all state ID from an activityId.

Get all state ID from an activityId.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_get_states_request = new \OpenAPI\Client\Model\CoreXapiGetStatesRequest(); // \OpenAPI\Client\Model\CoreXapiGetStatesRequest

try {
    $result = $apiInstance->coreXapiGetStates($core_xapi_get_states_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiGetStates: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_get_states_request** | [**\OpenAPI\Client\Model\CoreXapiGetStatesRequest**](../Model/CoreXapiGetStatesRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiPostState()`

```php
coreXapiPostState($core_xapi_post_state_request): object
```

Post an xAPI state into an activityId.

Post an xAPI state into an activityId.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_post_state_request = new \OpenAPI\Client\Model\CoreXapiPostStateRequest(); // \OpenAPI\Client\Model\CoreXapiPostStateRequest

try {
    $result = $apiInstance->coreXapiPostState($core_xapi_post_state_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiPostState: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_post_state_request** | [**\OpenAPI\Client\Model\CoreXapiPostStateRequest**](../Model/CoreXapiPostStateRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)

## `coreXapiStatementPost()`

```php
coreXapiStatementPost($core_xapi_statement_post_request): object
```

Post an xAPI statement.

Post an xAPI statement.

### Example

```php
<?php
require_once(__DIR__ . '/vendor/autoload.php');


// Configure API key authorization: apiKey
$config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKey('Authorization', 'YOUR_API_KEY');
// Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
// $config = OpenAPI\Client\Configuration::getDefaultConfiguration()->setApiKeyPrefix('Authorization', 'Bearer');


$apiInstance = new OpenAPI\Client\Api\MoodleApi(
    // If you want use custom http client, pass your client which implements `GuzzleHttp\ClientInterface`.
    // This is optional, `GuzzleHttp\Client` will be used as default.
    new GuzzleHttp\Client(),
    $config
);
$core_xapi_statement_post_request = new \OpenAPI\Client\Model\CoreXapiStatementPostRequest(); // \OpenAPI\Client\Model\CoreXapiStatementPostRequest

try {
    $result = $apiInstance->coreXapiStatementPost($core_xapi_statement_post_request);
    print_r($result);
} catch (Exception $e) {
    echo 'Exception when calling MoodleApi->coreXapiStatementPost: ', $e->getMessage(), PHP_EOL;
}
```

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **core_xapi_statement_post_request** | [**\OpenAPI\Client\Model\CoreXapiStatementPostRequest**](../Model/CoreXapiStatementPostRequest.md)|  | |

### Return type

**object**

### Authorization

[apiKey](../../README.md#apiKey)

### HTTP request headers

- **Content-Type**: `application/json`
- **Accept**: `application/json`

[[Back to top]](#) [[Back to API list]](../../README.md#endpoints)
[[Back to Model list]](../../README.md#models)
[[Back to README]](../../README.md)
