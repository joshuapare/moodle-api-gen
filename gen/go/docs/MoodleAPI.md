# \MoodleAPI

All URIs are relative to *https://localhost/webservice/restful/server.php*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CoreAdminSetBlockProtection**](MoodleAPI.md#CoreAdminSetBlockProtection) | **Post** /core_admin_set_block_protection | Set the protection state for a block plugin
[**CoreAdminSetPluginOrder**](MoodleAPI.md#CoreAdminSetPluginOrder) | **Post** /core_admin_set_plugin_order | Set the order of a plugin
[**CoreAdminSetPluginState**](MoodleAPI.md#CoreAdminSetPluginState) | **Post** /core_admin_set_plugin_state | Set the state of a plugin
[**CoreAuthConfirmUser**](MoodleAPI.md#CoreAuthConfirmUser) | **Post** /core_auth_confirm_user | Confirm a user account.
[**CoreAuthIsAgeDigitalConsentVerificationEnabled**](MoodleAPI.md#CoreAuthIsAgeDigitalConsentVerificationEnabled) | **Post** /core_auth_is_age_digital_consent_verification_enabled | Checks if age digital consent verification is enabled.
[**CoreAuthIsMinor**](MoodleAPI.md#CoreAuthIsMinor) | **Post** /core_auth_is_minor | Requests a check if a user is a digital minor.
[**CoreAuthRequestPasswordReset**](MoodleAPI.md#CoreAuthRequestPasswordReset) | **Post** /core_auth_request_password_reset | Requests a password reset.
[**CoreAuthResendConfirmationEmail**](MoodleAPI.md#CoreAuthResendConfirmationEmail) | **Post** /core_auth_resend_confirmation_email | Resend confirmation email.
[**CoreBackupGetAsyncBackupLinksBackup**](MoodleAPI.md#CoreBackupGetAsyncBackupLinksBackup) | **Post** /core_backup_get_async_backup_links_backup | Gets the data to use when updating the status table row in the UI for when an async backup completes.
[**CoreBackupGetAsyncBackupLinksRestore**](MoodleAPI.md#CoreBackupGetAsyncBackupLinksRestore) | **Post** /core_backup_get_async_backup_links_restore | Gets the data to use when updating the status table row in the UI for when an async restore completes.
[**CoreBackupGetAsyncBackupProgress**](MoodleAPI.md#CoreBackupGetAsyncBackupProgress) | **Post** /core_backup_get_async_backup_progress | Get the progress of an Asyncronhous backup.
[**CoreBackupGetCopyProgress**](MoodleAPI.md#CoreBackupGetCopyProgress) | **Post** /core_backup_get_copy_progress | Gets the progress of course copy operations.
[**CoreBackupSubmitCopyForm**](MoodleAPI.md#CoreBackupSubmitCopyForm) | **Post** /core_backup_submit_copy_form | Handles ajax submission of course copy form.
[**CoreBadgesGetUserBadgeByHash**](MoodleAPI.md#CoreBadgesGetUserBadgeByHash) | **Post** /core_badges_get_user_badge_by_hash | Returns the badge awarded to a user by hash.
[**CoreBadgesGetUserBadges**](MoodleAPI.md#CoreBadgesGetUserBadges) | **Post** /core_badges_get_user_badges | Returns the list of badges awarded to a user.
[**CoreBlockFetchAddableBlocks**](MoodleAPI.md#CoreBlockFetchAddableBlocks) | **Post** /core_block_fetch_addable_blocks | Returns all addable blocks in a given page.
[**CoreBlockGetCourseBlocks**](MoodleAPI.md#CoreBlockGetCourseBlocks) | **Post** /core_block_get_course_blocks | Returns blocks information for a course.
[**CoreBlockGetDashboardBlocks**](MoodleAPI.md#CoreBlockGetDashboardBlocks) | **Post** /core_block_get_dashboard_blocks | Returns blocks information for the given user dashboard.
[**CoreBlogGetEntries**](MoodleAPI.md#CoreBlogGetEntries) | **Post** /core_blog_get_entries | Returns blog entries.
[**CoreBlogViewEntries**](MoodleAPI.md#CoreBlogViewEntries) | **Post** /core_blog_view_entries | Trigger the blog_entries_viewed event.
[**CoreCalendarCreateCalendarEvents**](MoodleAPI.md#CoreCalendarCreateCalendarEvents) | **Post** /core_calendar_create_calendar_events | Create calendar events
[**CoreCalendarDeleteCalendarEvents**](MoodleAPI.md#CoreCalendarDeleteCalendarEvents) | **Post** /core_calendar_delete_calendar_events | Delete calendar events
[**CoreCalendarDeleteSubscription**](MoodleAPI.md#CoreCalendarDeleteSubscription) | **Post** /core_calendar_delete_subscription | Delete the calendar subscription
[**CoreCalendarGetActionEventsByCourse**](MoodleAPI.md#CoreCalendarGetActionEventsByCourse) | **Post** /core_calendar_get_action_events_by_course | Get calendar action events by course
[**CoreCalendarGetActionEventsByCourses**](MoodleAPI.md#CoreCalendarGetActionEventsByCourses) | **Post** /core_calendar_get_action_events_by_courses | Get calendar action events by courses
[**CoreCalendarGetActionEventsByTimesort**](MoodleAPI.md#CoreCalendarGetActionEventsByTimesort) | **Post** /core_calendar_get_action_events_by_timesort | Get calendar action events by tiemsort
[**CoreCalendarGetAllowedEventTypes**](MoodleAPI.md#CoreCalendarGetAllowedEventTypes) | **Post** /core_calendar_get_allowed_event_types | Get the type of events a user can create in the given course.
[**CoreCalendarGetCalendarAccessInformation**](MoodleAPI.md#CoreCalendarGetCalendarAccessInformation) | **Post** /core_calendar_get_calendar_access_information | Convenience function to retrieve some permissions/access information for the given course calendar.
[**CoreCalendarGetCalendarDayView**](MoodleAPI.md#CoreCalendarGetCalendarDayView) | **Post** /core_calendar_get_calendar_day_view | Fetch the day view data for a calendar
[**CoreCalendarGetCalendarEventById**](MoodleAPI.md#CoreCalendarGetCalendarEventById) | **Post** /core_calendar_get_calendar_event_by_id | Get calendar event by id
[**CoreCalendarGetCalendarEvents**](MoodleAPI.md#CoreCalendarGetCalendarEvents) | **Post** /core_calendar_get_calendar_events | Get calendar events
[**CoreCalendarGetCalendarExportToken**](MoodleAPI.md#CoreCalendarGetCalendarExportToken) | **Post** /core_calendar_get_calendar_export_token | Return the auth token required for exporting a calendar.
[**CoreCalendarGetCalendarMonthlyView**](MoodleAPI.md#CoreCalendarGetCalendarMonthlyView) | **Post** /core_calendar_get_calendar_monthly_view | Fetch the monthly view data for a calendar
[**CoreCalendarGetCalendarUpcomingView**](MoodleAPI.md#CoreCalendarGetCalendarUpcomingView) | **Post** /core_calendar_get_calendar_upcoming_view | Fetch the upcoming view data for a calendar
[**CoreCalendarGetTimestamps**](MoodleAPI.md#CoreCalendarGetTimestamps) | **Post** /core_calendar_get_timestamps | Fetch unix timestamps for given date times.
[**CoreCalendarSubmitCreateUpdateForm**](MoodleAPI.md#CoreCalendarSubmitCreateUpdateForm) | **Post** /core_calendar_submit_create_update_form | Submit form data for event form
[**CoreCalendarUpdateEventStartDay**](MoodleAPI.md#CoreCalendarUpdateEventStartDay) | **Post** /core_calendar_update_event_start_day | Update the start day (but not time) for an event.
[**CoreChangeEditmode**](MoodleAPI.md#CoreChangeEditmode) | **Post** /core_change_editmode | Change the editing mode
[**CoreCohortAddCohortMembers**](MoodleAPI.md#CoreCohortAddCohortMembers) | **Post** /core_cohort_add_cohort_members | Adds cohort members.
[**CoreCohortCreateCohorts**](MoodleAPI.md#CoreCohortCreateCohorts) | **Post** /core_cohort_create_cohorts | Creates new cohorts.
[**CoreCohortDeleteCohortMembers**](MoodleAPI.md#CoreCohortDeleteCohortMembers) | **Post** /core_cohort_delete_cohort_members | Deletes cohort members.
[**CoreCohortDeleteCohorts**](MoodleAPI.md#CoreCohortDeleteCohorts) | **Post** /core_cohort_delete_cohorts | Deletes all specified cohorts.
[**CoreCohortGetCohortMembers**](MoodleAPI.md#CoreCohortGetCohortMembers) | **Post** /core_cohort_get_cohort_members | Returns cohort members.
[**CoreCohortGetCohorts**](MoodleAPI.md#CoreCohortGetCohorts) | **Post** /core_cohort_get_cohorts | Returns cohort details.
[**CoreCohortSearchCohorts**](MoodleAPI.md#CoreCohortSearchCohorts) | **Post** /core_cohort_search_cohorts | Search for cohorts.
[**CoreCohortUpdateCohorts**](MoodleAPI.md#CoreCohortUpdateCohorts) | **Post** /core_cohort_update_cohorts | Updates existing cohorts.
[**CoreCommentAddComments**](MoodleAPI.md#CoreCommentAddComments) | **Post** /core_comment_add_comments | Adds a comment or comments.
[**CoreCommentDeleteComments**](MoodleAPI.md#CoreCommentDeleteComments) | **Post** /core_comment_delete_comments | Deletes a comment or comments.
[**CoreCommentGetComments**](MoodleAPI.md#CoreCommentGetComments) | **Post** /core_comment_get_comments | Returns comments.
[**CoreCompetencyAddCompetencyToCourse**](MoodleAPI.md#CoreCompetencyAddCompetencyToCourse) | **Post** /core_competency_add_competency_to_course | Add the competency to a course
[**CoreCompetencyAddCompetencyToPlan**](MoodleAPI.md#CoreCompetencyAddCompetencyToPlan) | **Post** /core_competency_add_competency_to_plan | Add the competency to a learning plan
[**CoreCompetencyAddCompetencyToTemplate**](MoodleAPI.md#CoreCompetencyAddCompetencyToTemplate) | **Post** /core_competency_add_competency_to_template | Add the competency to a template
[**CoreCompetencyAddRelatedCompetency**](MoodleAPI.md#CoreCompetencyAddRelatedCompetency) | **Post** /core_competency_add_related_competency | Adds a related competency
[**CoreCompetencyApprovePlan**](MoodleAPI.md#CoreCompetencyApprovePlan) | **Post** /core_competency_approve_plan | Approve a plan.
[**CoreCompetencyCompetencyFrameworkViewed**](MoodleAPI.md#CoreCompetencyCompetencyFrameworkViewed) | **Post** /core_competency_competency_framework_viewed | Log event competency framework viewed
[**CoreCompetencyCompetencyViewed**](MoodleAPI.md#CoreCompetencyCompetencyViewed) | **Post** /core_competency_competency_viewed | Log event competency viewed
[**CoreCompetencyCompletePlan**](MoodleAPI.md#CoreCompetencyCompletePlan) | **Post** /core_competency_complete_plan | Complete learning plan.
[**CoreCompetencyCountCompetencies**](MoodleAPI.md#CoreCompetencyCountCompetencies) | **Post** /core_competency_count_competencies | Count a list of a competencies.
[**CoreCompetencyCountCompetenciesInCourse**](MoodleAPI.md#CoreCompetencyCountCompetenciesInCourse) | **Post** /core_competency_count_competencies_in_course | List the competencies in a course
[**CoreCompetencyCountCompetenciesInTemplate**](MoodleAPI.md#CoreCompetencyCountCompetenciesInTemplate) | **Post** /core_competency_count_competencies_in_template | Count a list of a competencies for a given template.
[**CoreCompetencyCountCompetencyFrameworks**](MoodleAPI.md#CoreCompetencyCountCompetencyFrameworks) | **Post** /core_competency_count_competency_frameworks | Count a list of a competency frameworks.
[**CoreCompetencyCountCourseModuleCompetencies**](MoodleAPI.md#CoreCompetencyCountCourseModuleCompetencies) | **Post** /core_competency_count_course_module_competencies | Count the competencies in a course module
[**CoreCompetencyCountCoursesUsingCompetency**](MoodleAPI.md#CoreCompetencyCountCoursesUsingCompetency) | **Post** /core_competency_count_courses_using_competency | List the courses using a competency
[**CoreCompetencyCountTemplates**](MoodleAPI.md#CoreCompetencyCountTemplates) | **Post** /core_competency_count_templates | Count a list of a learning plan templates.
[**CoreCompetencyCountTemplatesUsingCompetency**](MoodleAPI.md#CoreCompetencyCountTemplatesUsingCompetency) | **Post** /core_competency_count_templates_using_competency | Count a list of a learning plan templates for a given competency.
[**CoreCompetencyCreateCompetency**](MoodleAPI.md#CoreCompetencyCreateCompetency) | **Post** /core_competency_create_competency | Creates new competencies.
[**CoreCompetencyCreateCompetencyFramework**](MoodleAPI.md#CoreCompetencyCreateCompetencyFramework) | **Post** /core_competency_create_competency_framework | Creates new competency frameworks.
[**CoreCompetencyCreatePlan**](MoodleAPI.md#CoreCompetencyCreatePlan) | **Post** /core_competency_create_plan | Creates a learning plan.
[**CoreCompetencyCreateTemplate**](MoodleAPI.md#CoreCompetencyCreateTemplate) | **Post** /core_competency_create_template | Creates new learning plan templates.
[**CoreCompetencyCreateUserEvidenceCompetency**](MoodleAPI.md#CoreCompetencyCreateUserEvidenceCompetency) | **Post** /core_competency_create_user_evidence_competency | Create an evidence of prior learning relationship with a competency.
[**CoreCompetencyDeleteCompetency**](MoodleAPI.md#CoreCompetencyDeleteCompetency) | **Post** /core_competency_delete_competency | Delete a competency.
[**CoreCompetencyDeleteCompetencyFramework**](MoodleAPI.md#CoreCompetencyDeleteCompetencyFramework) | **Post** /core_competency_delete_competency_framework | Delete a competency framework.
[**CoreCompetencyDeleteEvidence**](MoodleAPI.md#CoreCompetencyDeleteEvidence) | **Post** /core_competency_delete_evidence | Delete an evidence
[**CoreCompetencyDeletePlan**](MoodleAPI.md#CoreCompetencyDeletePlan) | **Post** /core_competency_delete_plan | Delete a learning plan.
[**CoreCompetencyDeleteTemplate**](MoodleAPI.md#CoreCompetencyDeleteTemplate) | **Post** /core_competency_delete_template | Delete a learning plan template.
[**CoreCompetencyDeleteUserEvidence**](MoodleAPI.md#CoreCompetencyDeleteUserEvidence) | **Post** /core_competency_delete_user_evidence | Delete an evidence of prior learning.
[**CoreCompetencyDeleteUserEvidenceCompetency**](MoodleAPI.md#CoreCompetencyDeleteUserEvidenceCompetency) | **Post** /core_competency_delete_user_evidence_competency | Delete an evidence of prior learning relationship with a competency.
[**CoreCompetencyDuplicateCompetencyFramework**](MoodleAPI.md#CoreCompetencyDuplicateCompetencyFramework) | **Post** /core_competency_duplicate_competency_framework | Duplicate a competency framework.
[**CoreCompetencyDuplicateTemplate**](MoodleAPI.md#CoreCompetencyDuplicateTemplate) | **Post** /core_competency_duplicate_template | Duplicate learning plan template.
[**CoreCompetencyGetScaleValues**](MoodleAPI.md#CoreCompetencyGetScaleValues) | **Post** /core_competency_get_scale_values | Fetch the values for a specific scale
[**CoreCompetencyGradeCompetency**](MoodleAPI.md#CoreCompetencyGradeCompetency) | **Post** /core_competency_grade_competency | Grade a competency.
[**CoreCompetencyGradeCompetencyInCourse**](MoodleAPI.md#CoreCompetencyGradeCompetencyInCourse) | **Post** /core_competency_grade_competency_in_course | Grade a competency from the course page.
[**CoreCompetencyGradeCompetencyInPlan**](MoodleAPI.md#CoreCompetencyGradeCompetencyInPlan) | **Post** /core_competency_grade_competency_in_plan | Grade a competency from the user plan page.
[**CoreCompetencyListCompetencies**](MoodleAPI.md#CoreCompetencyListCompetencies) | **Post** /core_competency_list_competencies | Load a list of a competencies.
[**CoreCompetencyListCompetenciesInTemplate**](MoodleAPI.md#CoreCompetencyListCompetenciesInTemplate) | **Post** /core_competency_list_competencies_in_template | Load a list of a competencies for a given template.
[**CoreCompetencyListCompetencyFrameworks**](MoodleAPI.md#CoreCompetencyListCompetencyFrameworks) | **Post** /core_competency_list_competency_frameworks | Load a list of a competency frameworks.
[**CoreCompetencyListCourseCompetencies**](MoodleAPI.md#CoreCompetencyListCourseCompetencies) | **Post** /core_competency_list_course_competencies | List the competencies in a course
[**CoreCompetencyListCourseModuleCompetencies**](MoodleAPI.md#CoreCompetencyListCourseModuleCompetencies) | **Post** /core_competency_list_course_module_competencies | List the competencies in a course module
[**CoreCompetencyListPlanCompetencies**](MoodleAPI.md#CoreCompetencyListPlanCompetencies) | **Post** /core_competency_list_plan_competencies | List the competencies in a plan
[**CoreCompetencyListTemplates**](MoodleAPI.md#CoreCompetencyListTemplates) | **Post** /core_competency_list_templates | Load a list of a learning plan templates.
[**CoreCompetencyListTemplatesUsingCompetency**](MoodleAPI.md#CoreCompetencyListTemplatesUsingCompetency) | **Post** /core_competency_list_templates_using_competency | Load a list of a learning plan templates for a given competency.
[**CoreCompetencyListUserPlans**](MoodleAPI.md#CoreCompetencyListUserPlans) | **Post** /core_competency_list_user_plans | List a user&#39;s learning plans.
[**CoreCompetencyMoveDownCompetency**](MoodleAPI.md#CoreCompetencyMoveDownCompetency) | **Post** /core_competency_move_down_competency | Re-order a competency.
[**CoreCompetencyMoveUpCompetency**](MoodleAPI.md#CoreCompetencyMoveUpCompetency) | **Post** /core_competency_move_up_competency | Re-order a competency.
[**CoreCompetencyPlanCancelReviewRequest**](MoodleAPI.md#CoreCompetencyPlanCancelReviewRequest) | **Post** /core_competency_plan_cancel_review_request | Cancel the review of a plan.
[**CoreCompetencyPlanRequestReview**](MoodleAPI.md#CoreCompetencyPlanRequestReview) | **Post** /core_competency_plan_request_review | Request for a plan to be reviewed.
[**CoreCompetencyPlanStartReview**](MoodleAPI.md#CoreCompetencyPlanStartReview) | **Post** /core_competency_plan_start_review | Start the review of a plan.
[**CoreCompetencyPlanStopReview**](MoodleAPI.md#CoreCompetencyPlanStopReview) | **Post** /core_competency_plan_stop_review | Stop the review of a plan.
[**CoreCompetencyReadCompetency**](MoodleAPI.md#CoreCompetencyReadCompetency) | **Post** /core_competency_read_competency | Load a summary of a competency.
[**CoreCompetencyReadCompetencyFramework**](MoodleAPI.md#CoreCompetencyReadCompetencyFramework) | **Post** /core_competency_read_competency_framework | Load a summary of a competency framework.
[**CoreCompetencyReadPlan**](MoodleAPI.md#CoreCompetencyReadPlan) | **Post** /core_competency_read_plan | Load a learning plan.
[**CoreCompetencyReadTemplate**](MoodleAPI.md#CoreCompetencyReadTemplate) | **Post** /core_competency_read_template | Load a summary of a learning plan template.
[**CoreCompetencyReadUserEvidence**](MoodleAPI.md#CoreCompetencyReadUserEvidence) | **Post** /core_competency_read_user_evidence | Read an evidence of prior learning.
[**CoreCompetencyRemoveCompetencyFromCourse**](MoodleAPI.md#CoreCompetencyRemoveCompetencyFromCourse) | **Post** /core_competency_remove_competency_from_course | Remove a competency from a course
[**CoreCompetencyRemoveCompetencyFromPlan**](MoodleAPI.md#CoreCompetencyRemoveCompetencyFromPlan) | **Post** /core_competency_remove_competency_from_plan | Remove the competency from a learning plan
[**CoreCompetencyRemoveCompetencyFromTemplate**](MoodleAPI.md#CoreCompetencyRemoveCompetencyFromTemplate) | **Post** /core_competency_remove_competency_from_template | Remove a competency from a template
[**CoreCompetencyRemoveRelatedCompetency**](MoodleAPI.md#CoreCompetencyRemoveRelatedCompetency) | **Post** /core_competency_remove_related_competency | Remove a related competency
[**CoreCompetencyReopenPlan**](MoodleAPI.md#CoreCompetencyReopenPlan) | **Post** /core_competency_reopen_plan | Reopen learning plan.
[**CoreCompetencyReorderCourseCompetency**](MoodleAPI.md#CoreCompetencyReorderCourseCompetency) | **Post** /core_competency_reorder_course_competency | Move a course competency to a new relative sort order.
[**CoreCompetencyReorderPlanCompetency**](MoodleAPI.md#CoreCompetencyReorderPlanCompetency) | **Post** /core_competency_reorder_plan_competency | Move a plan competency to a new relative sort order.
[**CoreCompetencyReorderTemplateCompetency**](MoodleAPI.md#CoreCompetencyReorderTemplateCompetency) | **Post** /core_competency_reorder_template_competency | Move a template competency to a new relative sort order.
[**CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies**](MoodleAPI.md#CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies) | **Post** /core_competency_request_review_of_user_evidence_linked_competencies | Send user evidence competencies in review
[**CoreCompetencySearchCompetencies**](MoodleAPI.md#CoreCompetencySearchCompetencies) | **Post** /core_competency_search_competencies | Search a list of a competencies.
[**CoreCompetencySetCourseCompetencyRuleoutcome**](MoodleAPI.md#CoreCompetencySetCourseCompetencyRuleoutcome) | **Post** /core_competency_set_course_competency_ruleoutcome | Modify the ruleoutcome value for course competency
[**CoreCompetencySetParentCompetency**](MoodleAPI.md#CoreCompetencySetParentCompetency) | **Post** /core_competency_set_parent_competency | Set a new parent for a competency.
[**CoreCompetencyTemplateHasRelatedData**](MoodleAPI.md#CoreCompetencyTemplateHasRelatedData) | **Post** /core_competency_template_has_related_data | Check if a template has related data
[**CoreCompetencyTemplateViewed**](MoodleAPI.md#CoreCompetencyTemplateViewed) | **Post** /core_competency_template_viewed | Log event template viewed
[**CoreCompetencyUnapprovePlan**](MoodleAPI.md#CoreCompetencyUnapprovePlan) | **Post** /core_competency_unapprove_plan | Unapprove a plan.
[**CoreCompetencyUnlinkPlanFromTemplate**](MoodleAPI.md#CoreCompetencyUnlinkPlanFromTemplate) | **Post** /core_competency_unlink_plan_from_template | Unlink a plan form it template.
[**CoreCompetencyUpdateCompetency**](MoodleAPI.md#CoreCompetencyUpdateCompetency) | **Post** /core_competency_update_competency | Update a competency.
[**CoreCompetencyUpdateCompetencyFramework**](MoodleAPI.md#CoreCompetencyUpdateCompetencyFramework) | **Post** /core_competency_update_competency_framework | Update a competency framework.
[**CoreCompetencyUpdateCourseCompetencySettings**](MoodleAPI.md#CoreCompetencyUpdateCourseCompetencySettings) | **Post** /core_competency_update_course_competency_settings | Update the course competency settings
[**CoreCompetencyUpdatePlan**](MoodleAPI.md#CoreCompetencyUpdatePlan) | **Post** /core_competency_update_plan | Updates a learning plan.
[**CoreCompetencyUpdateTemplate**](MoodleAPI.md#CoreCompetencyUpdateTemplate) | **Post** /core_competency_update_template | Update a learning plan template.
[**CoreCompetencyUserCompetencyCancelReviewRequest**](MoodleAPI.md#CoreCompetencyUserCompetencyCancelReviewRequest) | **Post** /core_competency_user_competency_cancel_review_request | Cancel a review request.
[**CoreCompetencyUserCompetencyPlanViewed**](MoodleAPI.md#CoreCompetencyUserCompetencyPlanViewed) | **Post** /core_competency_user_competency_plan_viewed | Log the user competency plan viewed event.
[**CoreCompetencyUserCompetencyRequestReview**](MoodleAPI.md#CoreCompetencyUserCompetencyRequestReview) | **Post** /core_competency_user_competency_request_review | Request a review.
[**CoreCompetencyUserCompetencyStartReview**](MoodleAPI.md#CoreCompetencyUserCompetencyStartReview) | **Post** /core_competency_user_competency_start_review | Start a review.
[**CoreCompetencyUserCompetencyStopReview**](MoodleAPI.md#CoreCompetencyUserCompetencyStopReview) | **Post** /core_competency_user_competency_stop_review | Stop a review.
[**CoreCompetencyUserCompetencyViewed**](MoodleAPI.md#CoreCompetencyUserCompetencyViewed) | **Post** /core_competency_user_competency_viewed | Log the user competency viewed event.
[**CoreCompetencyUserCompetencyViewedInCourse**](MoodleAPI.md#CoreCompetencyUserCompetencyViewedInCourse) | **Post** /core_competency_user_competency_viewed_in_course | Log the user competency viewed in course event
[**CoreCompetencyUserCompetencyViewedInPlan**](MoodleAPI.md#CoreCompetencyUserCompetencyViewedInPlan) | **Post** /core_competency_user_competency_viewed_in_plan | Log the user competency viewed in plan event.
[**CoreCompletionGetActivitiesCompletionStatus**](MoodleAPI.md#CoreCompletionGetActivitiesCompletionStatus) | **Post** /core_completion_get_activities_completion_status | Return the activities completion status for a user in a course.
[**CoreCompletionGetCourseCompletionStatus**](MoodleAPI.md#CoreCompletionGetCourseCompletionStatus) | **Post** /core_completion_get_course_completion_status | Returns course completion status.
[**CoreCompletionMarkCourseSelfCompleted**](MoodleAPI.md#CoreCompletionMarkCourseSelfCompleted) | **Post** /core_completion_mark_course_self_completed | Update the course completion status for the current user (if course self-completion is enabled).
[**CoreCompletionOverrideActivityCompletionStatus**](MoodleAPI.md#CoreCompletionOverrideActivityCompletionStatus) | **Post** /core_completion_override_activity_completion_status | Update completion status for a user in an activity by overriding it.
[**CoreCompletionUpdateActivityCompletionStatusManually**](MoodleAPI.md#CoreCompletionUpdateActivityCompletionStatusManually) | **Post** /core_completion_update_activity_completion_status_manually | Update completion status for the current user in an activity, only for activities with manual tracking.
[**CoreContentbankCopyContent**](MoodleAPI.md#CoreContentbankCopyContent) | **Post** /core_contentbank_copy_content | Copy a content in the content bank.
[**CoreContentbankDeleteContent**](MoodleAPI.md#CoreContentbankDeleteContent) | **Post** /core_contentbank_delete_content | Delete a content from the content bank.
[**CoreContentbankRenameContent**](MoodleAPI.md#CoreContentbankRenameContent) | **Post** /core_contentbank_rename_content | Rename a content in the content bank.
[**CoreContentbankSetContentVisibility**](MoodleAPI.md#CoreContentbankSetContentVisibility) | **Post** /core_contentbank_set_content_visibility | Set the visibility of a content in the content bank.
[**CoreCourseAddContentItemToUserFavourites**](MoodleAPI.md#CoreCourseAddContentItemToUserFavourites) | **Post** /core_course_add_content_item_to_user_favourites | Adds a content item (activity, resource or their subtypes) to the favourites for the user.
[**CoreCourseCheckUpdates**](MoodleAPI.md#CoreCourseCheckUpdates) | **Post** /core_course_check_updates | Check if there is updates affecting the user for the given course and contexts.
[**CoreCourseCreateCategories**](MoodleAPI.md#CoreCourseCreateCategories) | **Post** /core_course_create_categories | Create course categories
[**CoreCourseCreateCourses**](MoodleAPI.md#CoreCourseCreateCourses) | **Post** /core_course_create_courses | Create new courses
[**CoreCourseDeleteCategories**](MoodleAPI.md#CoreCourseDeleteCategories) | **Post** /core_course_delete_categories | Delete course categories
[**CoreCourseDeleteCourses**](MoodleAPI.md#CoreCourseDeleteCourses) | **Post** /core_course_delete_courses | Deletes all specified courses
[**CoreCourseDeleteModules**](MoodleAPI.md#CoreCourseDeleteModules) | **Post** /core_course_delete_modules | Deletes all specified module instances
[**CoreCourseDuplicateCourse**](MoodleAPI.md#CoreCourseDuplicateCourse) | **Post** /core_course_duplicate_course | Duplicate an existing course (creating a new one).
[**CoreCourseEditModule**](MoodleAPI.md#CoreCourseEditModule) | **Post** /core_course_edit_module | Performs an action on course module (change visibility, duplicate, delete, etc.)
[**CoreCourseEditSection**](MoodleAPI.md#CoreCourseEditSection) | **Post** /core_course_edit_section | Performs an action on course section (change visibility, set marker, delete)
[**CoreCourseGetActivityChooserFooter**](MoodleAPI.md#CoreCourseGetActivityChooserFooter) | **Post** /core_course_get_activity_chooser_footer | Fetch the data for the activity chooser footer.
[**CoreCourseGetCategories**](MoodleAPI.md#CoreCourseGetCategories) | **Post** /core_course_get_categories | Return category details
[**CoreCourseGetContents**](MoodleAPI.md#CoreCourseGetContents) | **Post** /core_course_get_contents | Get course contents
[**CoreCourseGetCourseContentItems**](MoodleAPI.md#CoreCourseGetCourseContentItems) | **Post** /core_course_get_course_content_items | Fetch all the content items (activities, resources and their subtypes) for the activity picker
[**CoreCourseGetCourseModule**](MoodleAPI.md#CoreCourseGetCourseModule) | **Post** /core_course_get_course_module | Return information about a course module
[**CoreCourseGetCourseModuleByInstance**](MoodleAPI.md#CoreCourseGetCourseModuleByInstance) | **Post** /core_course_get_course_module_by_instance | Return information about a given module name and instance id
[**CoreCourseGetCourses**](MoodleAPI.md#CoreCourseGetCourses) | **Post** /core_course_get_courses | Return course details
[**CoreCourseGetCoursesByField**](MoodleAPI.md#CoreCourseGetCoursesByField) | **Post** /core_course_get_courses_by_field | Get courses matching a specific field (id/s, shortname, idnumber, category)
[**CoreCourseGetEnrolledCoursesByTimelineClassification**](MoodleAPI.md#CoreCourseGetEnrolledCoursesByTimelineClassification) | **Post** /core_course_get_enrolled_courses_by_timeline_classification | List of enrolled courses for the given timeline classification (past, inprogress, or future).
[**CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification**](MoodleAPI.md#CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification) | **Post** /core_course_get_enrolled_courses_with_action_events_by_timeline_classification | List of enrolled courses with action events in a given timeframe, for the given timeline classification.
[**CoreCourseGetEnrolledUsersByCmid**](MoodleAPI.md#CoreCourseGetEnrolledUsersByCmid) | **Post** /core_course_get_enrolled_users_by_cmid | List users by course module id, filter by group and active enrolment status.
[**CoreCourseGetModule**](MoodleAPI.md#CoreCourseGetModule) | **Post** /core_course_get_module | Returns html with one activity module on course page
[**CoreCourseGetRecentCourses**](MoodleAPI.md#CoreCourseGetRecentCourses) | **Post** /core_course_get_recent_courses | List of courses a user has accessed most recently.
[**CoreCourseGetUpdatesSince**](MoodleAPI.md#CoreCourseGetUpdatesSince) | **Post** /core_course_get_updates_since | Check if there are updates affecting the user for the given course since the given time stamp.
[**CoreCourseGetUserAdministrationOptions**](MoodleAPI.md#CoreCourseGetUserAdministrationOptions) | **Post** /core_course_get_user_administration_options | Return a list of administration options in a set of courses that are avaialable or not for the current                             user.
[**CoreCourseGetUserNavigationOptions**](MoodleAPI.md#CoreCourseGetUserNavigationOptions) | **Post** /core_course_get_user_navigation_options | Return a list of navigation options in a set of courses that are avaialable or not for the current user.
[**CoreCourseImportCourse**](MoodleAPI.md#CoreCourseImportCourse) | **Post** /core_course_import_course | Import course data from a course into another course. Does not include any user data.
[**CoreCourseRemoveContentItemFromUserFavourites**](MoodleAPI.md#CoreCourseRemoveContentItemFromUserFavourites) | **Post** /core_course_remove_content_item_from_user_favourites | Removes a content item (activity, resource or their subtypes) from the favourites for the user.
[**CoreCourseSearchCourses**](MoodleAPI.md#CoreCourseSearchCourses) | **Post** /core_course_search_courses | Search courses by (name, module, block, tag)
[**CoreCourseSetFavouriteCourses**](MoodleAPI.md#CoreCourseSetFavouriteCourses) | **Post** /core_course_set_favourite_courses | Add a list of courses to the list of favourite courses.
[**CoreCourseToggleActivityRecommendation**](MoodleAPI.md#CoreCourseToggleActivityRecommendation) | **Post** /core_course_toggle_activity_recommendation | Adds or removes an activity as a recommendation in the activity chooser.
[**CoreCourseUpdateCategories**](MoodleAPI.md#CoreCourseUpdateCategories) | **Post** /core_course_update_categories | Update categories
[**CoreCourseUpdateCourses**](MoodleAPI.md#CoreCourseUpdateCourses) | **Post** /core_course_update_courses | Update courses
[**CoreCourseViewCourse**](MoodleAPI.md#CoreCourseViewCourse) | **Post** /core_course_view_course | Log that the course was viewed
[**CoreCourseformatFileHandlers**](MoodleAPI.md#CoreCourseformatFileHandlers) | **Post** /core_courseformat_file_handlers | Get the current course file hanlders.
[**CoreCourseformatGetState**](MoodleAPI.md#CoreCourseformatGetState) | **Post** /core_courseformat_get_state | Get the current course state.
[**CoreCourseformatUpdateCourse**](MoodleAPI.md#CoreCourseformatUpdateCourse) | **Post** /core_courseformat_update_course | Update course contents.
[**CoreCreateUserfeedbackActionRecord**](MoodleAPI.md#CoreCreateUserfeedbackActionRecord) | **Post** /core_create_userfeedback_action_record | Record the action that the user takes in the user feedback notification for future use.
[**CoreCustomfieldCreateCategory**](MoodleAPI.md#CoreCustomfieldCreateCategory) | **Post** /core_customfield_create_category | Creates a new category
[**CoreCustomfieldDeleteCategory**](MoodleAPI.md#CoreCustomfieldDeleteCategory) | **Post** /core_customfield_delete_category | Deletes a category
[**CoreCustomfieldDeleteField**](MoodleAPI.md#CoreCustomfieldDeleteField) | **Post** /core_customfield_delete_field | Deletes an entry
[**CoreCustomfieldMoveCategory**](MoodleAPI.md#CoreCustomfieldMoveCategory) | **Post** /core_customfield_move_category | Drag and drop categories
[**CoreCustomfieldMoveField**](MoodleAPI.md#CoreCustomfieldMoveField) | **Post** /core_customfield_move_field | Drag and drop
[**CoreCustomfieldReloadTemplate**](MoodleAPI.md#CoreCustomfieldReloadTemplate) | **Post** /core_customfield_reload_template | Reloads template
[**CoreDynamicTabsGetContent**](MoodleAPI.md#CoreDynamicTabsGetContent) | **Post** /core_dynamic_tabs_get_content | Returns the content for a dynamic tab
[**CoreEnrolGetCourseEnrolmentMethods**](MoodleAPI.md#CoreEnrolGetCourseEnrolmentMethods) | **Post** /core_enrol_get_course_enrolment_methods | Get the list of course enrolment methods
[**CoreEnrolGetEnrolledUsers**](MoodleAPI.md#CoreEnrolGetEnrolledUsers) | **Post** /core_enrol_get_enrolled_users | Get enrolled users by course id.
[**CoreEnrolGetEnrolledUsersWithCapability**](MoodleAPI.md#CoreEnrolGetEnrolledUsersWithCapability) | **Post** /core_enrol_get_enrolled_users_with_capability | For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability
[**CoreEnrolGetPotentialUsers**](MoodleAPI.md#CoreEnrolGetPotentialUsers) | **Post** /core_enrol_get_potential_users | Get the list of potential users to enrol
[**CoreEnrolGetUsersCourses**](MoodleAPI.md#CoreEnrolGetUsersCourses) | **Post** /core_enrol_get_users_courses | Get the list of courses where a user is enrolled in
[**CoreEnrolSearchUsers**](MoodleAPI.md#CoreEnrolSearchUsers) | **Post** /core_enrol_search_users | Search within the list of course participants
[**CoreEnrolSubmitUserEnrolmentForm**](MoodleAPI.md#CoreEnrolSubmitUserEnrolmentForm) | **Post** /core_enrol_submit_user_enrolment_form | Submit form data for enrolment form
[**CoreEnrolUnenrolUserEnrolment**](MoodleAPI.md#CoreEnrolUnenrolUserEnrolment) | **Post** /core_enrol_unenrol_user_enrolment | External function that unenrols a given user enrolment
[**CoreFetchNotifications**](MoodleAPI.md#CoreFetchNotifications) | **Post** /core_fetch_notifications | Return a list of notifications for the current session
[**CoreFilesDeleteDraftFiles**](MoodleAPI.md#CoreFilesDeleteDraftFiles) | **Post** /core_files_delete_draft_files | Delete the indicated files (or directories) from a user draft file area.
[**CoreFilesGetFiles**](MoodleAPI.md#CoreFilesGetFiles) | **Post** /core_files_get_files | browse moodle files
[**CoreFilesGetUnusedDraftItemid**](MoodleAPI.md#CoreFilesGetUnusedDraftItemid) | **Post** /core_files_get_unused_draft_itemid | Generate a new draft itemid for the current user.
[**CoreFilesUpload**](MoodleAPI.md#CoreFilesUpload) | **Post** /core_files_upload | upload a file to moodle
[**CoreFiltersGetAvailableInContext**](MoodleAPI.md#CoreFiltersGetAvailableInContext) | **Post** /core_filters_get_available_in_context | Returns the filters available in the given contexts.
[**CoreFormDynamicForm**](MoodleAPI.md#CoreFormDynamicForm) | **Post** /core_form_dynamic_form | Process submission of a dynamic (modal) form
[**CoreFormGetFiletypesBrowserData**](MoodleAPI.md#CoreFormGetFiletypesBrowserData) | **Post** /core_form_get_filetypes_browser_data | Provides data for the filetypes element browser.
[**CoreGetComponentStrings**](MoodleAPI.md#CoreGetComponentStrings) | **Post** /core_get_component_strings | Return all raw strings (with {$a-&gt;xxx}), for a specific component - similar to core get_component_strings(), call
[**CoreGetFragment**](MoodleAPI.md#CoreGetFragment) | **Post** /core_get_fragment | Return a fragment for inclusion, such as a JavaScript page.
[**CoreGetString**](MoodleAPI.md#CoreGetString) | **Post** /core_get_string | Return a translated string - similar to core get_string(), call
[**CoreGetStrings**](MoodleAPI.md#CoreGetStrings) | **Post** /core_get_strings | Return some translated strings - like several core get_string(), calls
[**CoreGetUserDates**](MoodleAPI.md#CoreGetUserDates) | **Post** /core_get_user_dates | Return formatted timestamps
[**CoreGradesCreateGradecategories**](MoodleAPI.md#CoreGradesCreateGradecategories) | **Post** /core_grades_create_gradecategories | Create grade categories inside a course gradebook.
[**CoreGradesGetEnrolledUsersForSearchWidget**](MoodleAPI.md#CoreGradesGetEnrolledUsersForSearchWidget) | **Post** /core_grades_get_enrolled_users_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.
[**CoreGradesGetEnrolledUsersForSelector**](MoodleAPI.md#CoreGradesGetEnrolledUsersForSelector) | **Post** /core_grades_get_enrolled_users_for_selector | Returns the enrolled users within and map some fields to the returned array of user objects.
[**CoreGradesGetFeedback**](MoodleAPI.md#CoreGradesGetFeedback) | **Post** /core_grades_get_feedback | Get the feedback data for a grade item
[**CoreGradesGetGradableUsers**](MoodleAPI.md#CoreGradesGetGradableUsers) | **Post** /core_grades_get_gradable_users | Returns the gradable users in a course
[**CoreGradesGetGradeTree**](MoodleAPI.md#CoreGradesGetGradeTree) | **Post** /core_grades_get_grade_tree | Get the grade tree structure for a course
[**CoreGradesGetGradeitems**](MoodleAPI.md#CoreGradesGetGradeitems) | **Post** /core_grades_get_gradeitems | Get the gradeitems for a course
[**CoreGradesGetGroupsForSearchWidget**](MoodleAPI.md#CoreGradesGetGroupsForSearchWidget) | **Post** /core_grades_get_groups_for_search_widget | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
[**CoreGradesGetGroupsForSelector**](MoodleAPI.md#CoreGradesGetGroupsForSelector) | **Post** /core_grades_get_groups_for_selector | ** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course
[**CoreGradesGraderGradingpanelPointFetch**](MoodleAPI.md#CoreGradesGraderGradingpanelPointFetch) | **Post** /core_grades_grader_gradingpanel_point_fetch | Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required
[**CoreGradesGraderGradingpanelPointStore**](MoodleAPI.md#CoreGradesGraderGradingpanelPointStore) | **Post** /core_grades_grader_gradingpanel_point_store | Store the data required to display the grader grading panel for simple grading
[**CoreGradesGraderGradingpanelScaleFetch**](MoodleAPI.md#CoreGradesGraderGradingpanelScaleFetch) | **Post** /core_grades_grader_gradingpanel_scale_fetch | Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required
[**CoreGradesGraderGradingpanelScaleStore**](MoodleAPI.md#CoreGradesGraderGradingpanelScaleStore) | **Post** /core_grades_grader_gradingpanel_scale_store | Store the data required to display the grader grading panel for scale-based grading
[**CoreGradesUpdateGrades**](MoodleAPI.md#CoreGradesUpdateGrades) | **Post** /core_grades_update_grades | Update a grade item and associated student grades.
[**CoreGradingGetDefinitions**](MoodleAPI.md#CoreGradingGetDefinitions) | **Post** /core_grading_get_definitions | Get grading definitions
[**CoreGradingGetGradingformInstances**](MoodleAPI.md#CoreGradingGetGradingformInstances) | **Post** /core_grading_get_gradingform_instances | Get grading form instances
[**CoreGradingSaveDefinitions**](MoodleAPI.md#CoreGradingSaveDefinitions) | **Post** /core_grading_save_definitions | Save grading definitions
[**CoreGroupAddGroupMembers**](MoodleAPI.md#CoreGroupAddGroupMembers) | **Post** /core_group_add_group_members | Adds group members.
[**CoreGroupAssignGrouping**](MoodleAPI.md#CoreGroupAssignGrouping) | **Post** /core_group_assign_grouping | Assing groups from groupings
[**CoreGroupCreateGroupings**](MoodleAPI.md#CoreGroupCreateGroupings) | **Post** /core_group_create_groupings | Creates new groupings
[**CoreGroupCreateGroups**](MoodleAPI.md#CoreGroupCreateGroups) | **Post** /core_group_create_groups | Creates new groups.
[**CoreGroupDeleteGroupMembers**](MoodleAPI.md#CoreGroupDeleteGroupMembers) | **Post** /core_group_delete_group_members | Deletes group members.
[**CoreGroupDeleteGroupings**](MoodleAPI.md#CoreGroupDeleteGroupings) | **Post** /core_group_delete_groupings | Deletes all specified groupings.
[**CoreGroupDeleteGroups**](MoodleAPI.md#CoreGroupDeleteGroups) | **Post** /core_group_delete_groups | Deletes all specified groups.
[**CoreGroupGetActivityAllowedGroups**](MoodleAPI.md#CoreGroupGetActivityAllowedGroups) | **Post** /core_group_get_activity_allowed_groups | Gets a list of groups that the user is allowed to access within the specified activity.
[**CoreGroupGetActivityGroupmode**](MoodleAPI.md#CoreGroupGetActivityGroupmode) | **Post** /core_group_get_activity_groupmode | Returns effective groupmode used in a given activity.
[**CoreGroupGetCourseGroupings**](MoodleAPI.md#CoreGroupGetCourseGroupings) | **Post** /core_group_get_course_groupings | Returns all groupings in specified course.
[**CoreGroupGetCourseGroups**](MoodleAPI.md#CoreGroupGetCourseGroups) | **Post** /core_group_get_course_groups | Returns all groups in specified course.
[**CoreGroupGetCourseUserGroups**](MoodleAPI.md#CoreGroupGetCourseUserGroups) | **Post** /core_group_get_course_user_groups | Returns all groups in specified course for the specified user.
[**CoreGroupGetGroupMembers**](MoodleAPI.md#CoreGroupGetGroupMembers) | **Post** /core_group_get_group_members | Returns group members.
[**CoreGroupGetGroupings**](MoodleAPI.md#CoreGroupGetGroupings) | **Post** /core_group_get_groupings | Returns groupings details.
[**CoreGroupGetGroups**](MoodleAPI.md#CoreGroupGetGroups) | **Post** /core_group_get_groups | Returns group details.
[**CoreGroupGetGroupsForSelector**](MoodleAPI.md#CoreGroupGetGroupsForSelector) | **Post** /core_group_get_groups_for_selector | Get the group/(s) for a course
[**CoreGroupUnassignGrouping**](MoodleAPI.md#CoreGroupUnassignGrouping) | **Post** /core_group_unassign_grouping | Unassing groups from groupings
[**CoreGroupUpdateGroupings**](MoodleAPI.md#CoreGroupUpdateGroupings) | **Post** /core_group_update_groupings | Updates existing groupings
[**CoreGroupUpdateGroups**](MoodleAPI.md#CoreGroupUpdateGroups) | **Post** /core_group_update_groups | Updates existing groups.
[**CoreH5pGetTrustedH5pFile**](MoodleAPI.md#CoreH5pGetTrustedH5pFile) | **Post** /core_h5p_get_trusted_h5p_file | Get the H5P file cleaned for Mobile App.
[**CoreMessageBlockUser**](MoodleAPI.md#CoreMessageBlockUser) | **Post** /core_message_block_user | Blocks a user
[**CoreMessageConfirmContactRequest**](MoodleAPI.md#CoreMessageConfirmContactRequest) | **Post** /core_message_confirm_contact_request | Confirms a contact request
[**CoreMessageCreateContactRequest**](MoodleAPI.md#CoreMessageCreateContactRequest) | **Post** /core_message_create_contact_request | Creates a contact request
[**CoreMessageDataForMessageareaSearchMessages**](MoodleAPI.md#CoreMessageDataForMessageareaSearchMessages) | **Post** /core_message_data_for_messagearea_search_messages | Retrieve the template data for searching for messages
[**CoreMessageDeclineContactRequest**](MoodleAPI.md#CoreMessageDeclineContactRequest) | **Post** /core_message_decline_contact_request | Declines a contact request
[**CoreMessageDeleteContacts**](MoodleAPI.md#CoreMessageDeleteContacts) | **Post** /core_message_delete_contacts | Remove contacts from the contact list
[**CoreMessageDeleteConversationsById**](MoodleAPI.md#CoreMessageDeleteConversationsById) | **Post** /core_message_delete_conversations_by_id | Deletes a list of conversations.
[**CoreMessageDeleteMessage**](MoodleAPI.md#CoreMessageDeleteMessage) | **Post** /core_message_delete_message | Deletes a message.
[**CoreMessageDeleteMessageForAllUsers**](MoodleAPI.md#CoreMessageDeleteMessageForAllUsers) | **Post** /core_message_delete_message_for_all_users | Deletes a message for all users.
[**CoreMessageGetBlockedUsers**](MoodleAPI.md#CoreMessageGetBlockedUsers) | **Post** /core_message_get_blocked_users | Retrieve a list of users blocked
[**CoreMessageGetContactRequests**](MoodleAPI.md#CoreMessageGetContactRequests) | **Post** /core_message_get_contact_requests | Returns contact requests for a user
[**CoreMessageGetConversation**](MoodleAPI.md#CoreMessageGetConversation) | **Post** /core_message_get_conversation | Retrieve a conversation for a user
[**CoreMessageGetConversationBetweenUsers**](MoodleAPI.md#CoreMessageGetConversationBetweenUsers) | **Post** /core_message_get_conversation_between_users | Retrieve a conversation for a user between another user
[**CoreMessageGetConversationCounts**](MoodleAPI.md#CoreMessageGetConversationCounts) | **Post** /core_message_get_conversation_counts | Retrieve a list of conversation counts, indexed by type.
[**CoreMessageGetConversationMembers**](MoodleAPI.md#CoreMessageGetConversationMembers) | **Post** /core_message_get_conversation_members | Retrieve a list of members in a conversation
[**CoreMessageGetConversationMessages**](MoodleAPI.md#CoreMessageGetConversationMessages) | **Post** /core_message_get_conversation_messages | Retrieve the conversation messages and relevant member information
[**CoreMessageGetConversations**](MoodleAPI.md#CoreMessageGetConversations) | **Post** /core_message_get_conversations | Retrieve a list of conversations for a user
[**CoreMessageGetMemberInfo**](MoodleAPI.md#CoreMessageGetMemberInfo) | **Post** /core_message_get_member_info | Retrieve a user message profiles
[**CoreMessageGetMessageProcessor**](MoodleAPI.md#CoreMessageGetMessageProcessor) | **Post** /core_message_get_message_processor | Get a message processor
[**CoreMessageGetMessages**](MoodleAPI.md#CoreMessageGetMessages) | **Post** /core_message_get_messages | Retrieve a list of messages sent and received by a user (conversations, notifications or both)
[**CoreMessageGetReceivedContactRequestsCount**](MoodleAPI.md#CoreMessageGetReceivedContactRequestsCount) | **Post** /core_message_get_received_contact_requests_count | Gets the number of received contact requests
[**CoreMessageGetSelfConversation**](MoodleAPI.md#CoreMessageGetSelfConversation) | **Post** /core_message_get_self_conversation | Retrieve a self-conversation for a user
[**CoreMessageGetUnreadConversationCounts**](MoodleAPI.md#CoreMessageGetUnreadConversationCounts) | **Post** /core_message_get_unread_conversation_counts | Retrieve a list of unread conversation counts, indexed by type.
[**CoreMessageGetUnreadConversationsCount**](MoodleAPI.md#CoreMessageGetUnreadConversationsCount) | **Post** /core_message_get_unread_conversations_count | Retrieve the count of unread conversations for a given user
[**CoreMessageGetUnreadNotificationCount**](MoodleAPI.md#CoreMessageGetUnreadNotificationCount) | **Post** /core_message_get_unread_notification_count | Get number of unread notifications.
[**CoreMessageGetUserContacts**](MoodleAPI.md#CoreMessageGetUserContacts) | **Post** /core_message_get_user_contacts | Retrieve the contact list
[**CoreMessageGetUserMessagePreferences**](MoodleAPI.md#CoreMessageGetUserMessagePreferences) | **Post** /core_message_get_user_message_preferences | Get the message preferences for a given user.
[**CoreMessageGetUserNotificationPreferences**](MoodleAPI.md#CoreMessageGetUserNotificationPreferences) | **Post** /core_message_get_user_notification_preferences | Get the notification preferences for a given user.
[**CoreMessageMarkAllConversationMessagesAsRead**](MoodleAPI.md#CoreMessageMarkAllConversationMessagesAsRead) | **Post** /core_message_mark_all_conversation_messages_as_read | Mark all conversation messages as read for a given user
[**CoreMessageMarkAllNotificationsAsRead**](MoodleAPI.md#CoreMessageMarkAllNotificationsAsRead) | **Post** /core_message_mark_all_notifications_as_read | Mark all notifications as read for a given user
[**CoreMessageMarkMessageRead**](MoodleAPI.md#CoreMessageMarkMessageRead) | **Post** /core_message_mark_message_read | Mark a single message as read, trigger message_viewed event.
[**CoreMessageMarkNotificationRead**](MoodleAPI.md#CoreMessageMarkNotificationRead) | **Post** /core_message_mark_notification_read | Mark a single notification as read, trigger notification_viewed event.
[**CoreMessageMessageProcessorConfigForm**](MoodleAPI.md#CoreMessageMessageProcessorConfigForm) | **Post** /core_message_message_processor_config_form | Process the message processor config form
[**CoreMessageMessageSearchUsers**](MoodleAPI.md#CoreMessageMessageSearchUsers) | **Post** /core_message_message_search_users | Retrieve the data for searching for people
[**CoreMessageMuteConversations**](MoodleAPI.md#CoreMessageMuteConversations) | **Post** /core_message_mute_conversations | Mutes a list of conversations
[**CoreMessageSearchContacts**](MoodleAPI.md#CoreMessageSearchContacts) | **Post** /core_message_search_contacts | Search for contacts
[**CoreMessageSendInstantMessages**](MoodleAPI.md#CoreMessageSendInstantMessages) | **Post** /core_message_send_instant_messages | Send instant messages
[**CoreMessageSendMessagesToConversation**](MoodleAPI.md#CoreMessageSendMessagesToConversation) | **Post** /core_message_send_messages_to_conversation | Send messages to an existing conversation between users
[**CoreMessageSetFavouriteConversations**](MoodleAPI.md#CoreMessageSetFavouriteConversations) | **Post** /core_message_set_favourite_conversations | Mark a conversation or group of conversations as favourites/starred conversations.
[**CoreMessageUnblockUser**](MoodleAPI.md#CoreMessageUnblockUser) | **Post** /core_message_unblock_user | Unblocks a user
[**CoreMessageUnmuteConversations**](MoodleAPI.md#CoreMessageUnmuteConversations) | **Post** /core_message_unmute_conversations | Unmutes a list of conversations
[**CoreMessageUnsetFavouriteConversations**](MoodleAPI.md#CoreMessageUnsetFavouriteConversations) | **Post** /core_message_unset_favourite_conversations | Unset a conversation or group of conversations as favourites/starred conversations.
[**CoreMoodlenetAuthCheck**](MoodleAPI.md#CoreMoodlenetAuthCheck) | **Post** /core_moodlenet_auth_check | Check a user has authorized for a given MoodleNet site
[**CoreMoodlenetGetShareInfoActivity**](MoodleAPI.md#CoreMoodlenetGetShareInfoActivity) | **Post** /core_moodlenet_get_share_info_activity | Get information about an activity being shared
[**CoreMoodlenetGetSharedCourseInfo**](MoodleAPI.md#CoreMoodlenetGetSharedCourseInfo) | **Post** /core_moodlenet_get_shared_course_info | Get information about an course being shared
[**CoreMoodlenetSendActivity**](MoodleAPI.md#CoreMoodlenetSendActivity) | **Post** /core_moodlenet_send_activity | Send activity to MoodleNet
[**CoreMoodlenetSendCourse**](MoodleAPI.md#CoreMoodlenetSendCourse) | **Post** /core_moodlenet_send_course | Send course to MoodleNet
[**CoreMyViewPage**](MoodleAPI.md#CoreMyViewPage) | **Post** /core_my_view_page | Trigger the My or Dashboard viewed event.
[**CoreNotesCreateNotes**](MoodleAPI.md#CoreNotesCreateNotes) | **Post** /core_notes_create_notes | Create notes
[**CoreNotesDeleteNotes**](MoodleAPI.md#CoreNotesDeleteNotes) | **Post** /core_notes_delete_notes | Delete notes
[**CoreNotesGetCourseNotes**](MoodleAPI.md#CoreNotesGetCourseNotes) | **Post** /core_notes_get_course_notes | Returns all notes in specified course (or site), for the specified user.
[**CoreNotesGetNotes**](MoodleAPI.md#CoreNotesGetNotes) | **Post** /core_notes_get_notes | Get notes
[**CoreNotesUpdateNotes**](MoodleAPI.md#CoreNotesUpdateNotes) | **Post** /core_notes_update_notes | Update notes
[**CoreNotesViewNotes**](MoodleAPI.md#CoreNotesViewNotes) | **Post** /core_notes_view_notes | Simulates the web interface view of notes/index.php: trigger events.
[**CoreOutputLoadFontawesomeIconMap**](MoodleAPI.md#CoreOutputLoadFontawesomeIconMap) | **Post** /core_output_load_fontawesome_icon_map | Load the mapping of names to icons
[**CoreOutputLoadFontawesomeIconSystemMap**](MoodleAPI.md#CoreOutputLoadFontawesomeIconSystemMap) | **Post** /core_output_load_fontawesome_icon_system_map | Load the mapping of moodle pix names to fontawesome icon names
[**CoreOutputLoadTemplate**](MoodleAPI.md#CoreOutputLoadTemplate) | **Post** /core_output_load_template | Load a template for a renderable
[**CoreOutputLoadTemplateWithDependencies**](MoodleAPI.md#CoreOutputLoadTemplateWithDependencies) | **Post** /core_output_load_template_with_dependencies | Load a template and its dependencies for a renderable
[**CorePaymentGetAvailableGateways**](MoodleAPI.md#CorePaymentGetAvailableGateways) | **Post** /core_payment_get_available_gateways | Get the list of payment gateways that support the given component/area
[**CoreQuestionGetRandomQuestionSummaries**](MoodleAPI.md#CoreQuestionGetRandomQuestionSummaries) | **Post** /core_question_get_random_question_summaries | Get the random question set for a criteria
[**CoreQuestionSubmitTagsForm**](MoodleAPI.md#CoreQuestionSubmitTagsForm) | **Post** /core_question_submit_tags_form | Update the question tags.
[**CoreQuestionUpdateFlag**](MoodleAPI.md#CoreQuestionUpdateFlag) | **Post** /core_question_update_flag | Update the flag state of a question attempt.
[**CoreRatingAddRating**](MoodleAPI.md#CoreRatingAddRating) | **Post** /core_rating_add_rating | Rates an item.
[**CoreRatingGetItemRatings**](MoodleAPI.md#CoreRatingGetItemRatings) | **Post** /core_rating_get_item_ratings | Retrieve all the ratings for an item.
[**CoreReportbuilderAudiencesDelete**](MoodleAPI.md#CoreReportbuilderAudiencesDelete) | **Post** /core_reportbuilder_audiences_delete | Delete audience from report
[**CoreReportbuilderCanViewSystemReport**](MoodleAPI.md#CoreReportbuilderCanViewSystemReport) | **Post** /core_reportbuilder_can_view_system_report | Determine access to a system report
[**CoreReportbuilderColumnsAdd**](MoodleAPI.md#CoreReportbuilderColumnsAdd) | **Post** /core_reportbuilder_columns_add | Add column to report
[**CoreReportbuilderColumnsDelete**](MoodleAPI.md#CoreReportbuilderColumnsDelete) | **Post** /core_reportbuilder_columns_delete | Delete column from report
[**CoreReportbuilderColumnsReorder**](MoodleAPI.md#CoreReportbuilderColumnsReorder) | **Post** /core_reportbuilder_columns_reorder | Re-order column within report
[**CoreReportbuilderColumnsSortGet**](MoodleAPI.md#CoreReportbuilderColumnsSortGet) | **Post** /core_reportbuilder_columns_sort_get | Retrieve column sorting for report
[**CoreReportbuilderColumnsSortReorder**](MoodleAPI.md#CoreReportbuilderColumnsSortReorder) | **Post** /core_reportbuilder_columns_sort_reorder | Re-order column sorting within report
[**CoreReportbuilderColumnsSortToggle**](MoodleAPI.md#CoreReportbuilderColumnsSortToggle) | **Post** /core_reportbuilder_columns_sort_toggle | Toggle sorting of column within report
[**CoreReportbuilderConditionsAdd**](MoodleAPI.md#CoreReportbuilderConditionsAdd) | **Post** /core_reportbuilder_conditions_add | Add condition to report
[**CoreReportbuilderConditionsDelete**](MoodleAPI.md#CoreReportbuilderConditionsDelete) | **Post** /core_reportbuilder_conditions_delete | Delete condition from report
[**CoreReportbuilderConditionsReorder**](MoodleAPI.md#CoreReportbuilderConditionsReorder) | **Post** /core_reportbuilder_conditions_reorder | Re-order condition within report
[**CoreReportbuilderConditionsReset**](MoodleAPI.md#CoreReportbuilderConditionsReset) | **Post** /core_reportbuilder_conditions_reset | Reset conditions for given report
[**CoreReportbuilderFiltersAdd**](MoodleAPI.md#CoreReportbuilderFiltersAdd) | **Post** /core_reportbuilder_filters_add | Add filter to report
[**CoreReportbuilderFiltersDelete**](MoodleAPI.md#CoreReportbuilderFiltersDelete) | **Post** /core_reportbuilder_filters_delete | Delete filter from report
[**CoreReportbuilderFiltersReorder**](MoodleAPI.md#CoreReportbuilderFiltersReorder) | **Post** /core_reportbuilder_filters_reorder | Re-order filter within report
[**CoreReportbuilderFiltersReset**](MoodleAPI.md#CoreReportbuilderFiltersReset) | **Post** /core_reportbuilder_filters_reset | Reset filters for given report
[**CoreReportbuilderListReports**](MoodleAPI.md#CoreReportbuilderListReports) | **Post** /core_reportbuilder_list_reports | List custom reports for current user
[**CoreReportbuilderReportsDelete**](MoodleAPI.md#CoreReportbuilderReportsDelete) | **Post** /core_reportbuilder_reports_delete | Delete report
[**CoreReportbuilderReportsGet**](MoodleAPI.md#CoreReportbuilderReportsGet) | **Post** /core_reportbuilder_reports_get | Get custom report
[**CoreReportbuilderRetrieveReport**](MoodleAPI.md#CoreReportbuilderRetrieveReport) | **Post** /core_reportbuilder_retrieve_report | Retrieve custom report content
[**CoreReportbuilderRetrieveSystemReport**](MoodleAPI.md#CoreReportbuilderRetrieveSystemReport) | **Post** /core_reportbuilder_retrieve_system_report | Retrieve system report content
[**CoreReportbuilderSchedulesDelete**](MoodleAPI.md#CoreReportbuilderSchedulesDelete) | **Post** /core_reportbuilder_schedules_delete | Delete schedule from report
[**CoreReportbuilderSchedulesSend**](MoodleAPI.md#CoreReportbuilderSchedulesSend) | **Post** /core_reportbuilder_schedules_send | Send report schedule
[**CoreReportbuilderSchedulesToggle**](MoodleAPI.md#CoreReportbuilderSchedulesToggle) | **Post** /core_reportbuilder_schedules_toggle | Toggle state of report schedule
[**CoreReportbuilderSetFilters**](MoodleAPI.md#CoreReportbuilderSetFilters) | **Post** /core_reportbuilder_set_filters | Set filter values for given report
[**CoreReportbuilderViewReport**](MoodleAPI.md#CoreReportbuilderViewReport) | **Post** /core_reportbuilder_view_report | Trigger custom report viewed
[**CoreRoleAssignRoles**](MoodleAPI.md#CoreRoleAssignRoles) | **Post** /core_role_assign_roles | Manual role assignments.
[**CoreRoleUnassignRoles**](MoodleAPI.md#CoreRoleUnassignRoles) | **Post** /core_role_unassign_roles | Manual role unassignments.
[**CoreSearchGetRelevantUsers**](MoodleAPI.md#CoreSearchGetRelevantUsers) | **Post** /core_search_get_relevant_users | Gets relevant users for a search request.
[**CoreSearchGetResults**](MoodleAPI.md#CoreSearchGetResults) | **Post** /core_search_get_results | Get search results.
[**CoreSearchGetSearchAreasList**](MoodleAPI.md#CoreSearchGetSearchAreasList) | **Post** /core_search_get_search_areas_list | Get search areas.
[**CoreSearchGetTopResults**](MoodleAPI.md#CoreSearchGetTopResults) | **Post** /core_search_get_top_results | Get top search results.
[**CoreSearchViewResults**](MoodleAPI.md#CoreSearchViewResults) | **Post** /core_search_view_results | Trigger view search results event.
[**CoreSessionTimeRemaining**](MoodleAPI.md#CoreSessionTimeRemaining) | **Post** /core_session_time_remaining | Count the seconds remaining in this session
[**CoreSessionTouch**](MoodleAPI.md#CoreSessionTouch) | **Post** /core_session_touch | Keep the users session alive
[**CoreTableGetDynamicTableContent**](MoodleAPI.md#CoreTableGetDynamicTableContent) | **Post** /core_table_get_dynamic_table_content | Get the dynamic table content raw html
[**CoreTagGetTagAreas**](MoodleAPI.md#CoreTagGetTagAreas) | **Post** /core_tag_get_tag_areas | Retrieves existing tag areas.
[**CoreTagGetTagCloud**](MoodleAPI.md#CoreTagGetTagCloud) | **Post** /core_tag_get_tag_cloud | Retrieves a tag cloud for the given collection and/or query search.
[**CoreTagGetTagCollections**](MoodleAPI.md#CoreTagGetTagCollections) | **Post** /core_tag_get_tag_collections | Retrieves existing tag collections.
[**CoreTagGetTagindex**](MoodleAPI.md#CoreTagGetTagindex) | **Post** /core_tag_get_tagindex | Gets tag index page for one tag and one tag area
[**CoreTagGetTagindexPerArea**](MoodleAPI.md#CoreTagGetTagindexPerArea) | **Post** /core_tag_get_tagindex_per_area | Gets tag index page per different areas.
[**CoreTagGetTags**](MoodleAPI.md#CoreTagGetTags) | **Post** /core_tag_get_tags | Gets tags by their ids
[**CoreTagUpdateTags**](MoodleAPI.md#CoreTagUpdateTags) | **Post** /core_tag_update_tags | Updates tags
[**CoreUpdateInplaceEditable**](MoodleAPI.md#CoreUpdateInplaceEditable) | **Post** /core_update_inplace_editable | Generic service to update title
[**CoreUserAddUserDevice**](MoodleAPI.md#CoreUserAddUserDevice) | **Post** /core_user_add_user_device | Store mobile user devices information for PUSH Notifications.
[**CoreUserAddUserPrivateFiles**](MoodleAPI.md#CoreUserAddUserPrivateFiles) | **Post** /core_user_add_user_private_files | Copy files from a draft area to users private files area.
[**CoreUserAgreeSitePolicy**](MoodleAPI.md#CoreUserAgreeSitePolicy) | **Post** /core_user_agree_site_policy | Agree the site policy for the current user.
[**CoreUserCreateUsers**](MoodleAPI.md#CoreUserCreateUsers) | **Post** /core_user_create_users | Create users.
[**CoreUserDeleteUsers**](MoodleAPI.md#CoreUserDeleteUsers) | **Post** /core_user_delete_users | Delete users.
[**CoreUserGetCourseUserProfiles**](MoodleAPI.md#CoreUserGetCourseUserProfiles) | **Post** /core_user_get_course_user_profiles | Get course user profiles (each of the profils matching a course id and a user id),.
[**CoreUserGetPrivateFilesInfo**](MoodleAPI.md#CoreUserGetPrivateFilesInfo) | **Post** /core_user_get_private_files_info | Returns general information about files in the user private files area.
[**CoreUserGetUserPreferences**](MoodleAPI.md#CoreUserGetUserPreferences) | **Post** /core_user_get_user_preferences | Return user preferences.
[**CoreUserGetUsers**](MoodleAPI.md#CoreUserGetUsers) | **Post** /core_user_get_users | search for users matching the parameters
[**CoreUserGetUsersByField**](MoodleAPI.md#CoreUserGetUsersByField) | **Post** /core_user_get_users_by_field | Retrieve users&#39; information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().
[**CoreUserRemoveUserDevice**](MoodleAPI.md#CoreUserRemoveUserDevice) | **Post** /core_user_remove_user_device | Remove a user device from the Moodle database.
[**CoreUserSearchIdentity**](MoodleAPI.md#CoreUserSearchIdentity) | **Post** /core_user_search_identity | Return list of users identities matching the given criteria in their name or other identity fields.
[**CoreUserSetUserPreferences**](MoodleAPI.md#CoreUserSetUserPreferences) | **Post** /core_user_set_user_preferences | Set user preferences.
[**CoreUserUpdatePicture**](MoodleAPI.md#CoreUserUpdatePicture) | **Post** /core_user_update_picture | Update or delete the user picture in the site
[**CoreUserUpdateUserDevicePublicKey**](MoodleAPI.md#CoreUserUpdateUserDevicePublicKey) | **Post** /core_user_update_user_device_public_key | Store mobile user public key.
[**CoreUserUpdateUserPreferences**](MoodleAPI.md#CoreUserUpdateUserPreferences) | **Post** /core_user_update_user_preferences | Update a user&#39;s preferences
[**CoreUserUpdateUsers**](MoodleAPI.md#CoreUserUpdateUsers) | **Post** /core_user_update_users | Update users.
[**CoreUserViewUserList**](MoodleAPI.md#CoreUserViewUserList) | **Post** /core_user_view_user_list | Simulates the web-interface view of user/index.php (triggering events),.
[**CoreUserViewUserProfile**](MoodleAPI.md#CoreUserViewUserProfile) | **Post** /core_user_view_user_profile | Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.
[**CoreWebserviceGetSiteInfo**](MoodleAPI.md#CoreWebserviceGetSiteInfo) | **Post** /core_webservice_get_site_info | Return some site info / user info / list web service functions
[**CoreXapiDeleteState**](MoodleAPI.md#CoreXapiDeleteState) | **Post** /core_xapi_delete_state | Delete an xAPI state data from an activityId.
[**CoreXapiDeleteStates**](MoodleAPI.md#CoreXapiDeleteStates) | **Post** /core_xapi_delete_states | Delete all xAPI state data from an activityId.
[**CoreXapiGetState**](MoodleAPI.md#CoreXapiGetState) | **Post** /core_xapi_get_state | Get an xAPI state data from an activityId.
[**CoreXapiGetStates**](MoodleAPI.md#CoreXapiGetStates) | **Post** /core_xapi_get_states | Get all state ID from an activityId.
[**CoreXapiPostState**](MoodleAPI.md#CoreXapiPostState) | **Post** /core_xapi_post_state | Post an xAPI state into an activityId.
[**CoreXapiStatementPost**](MoodleAPI.md#CoreXapiStatementPost) | **Post** /core_xapi_statement_post | Post an xAPI statement.



## CoreAdminSetBlockProtection

> map[string]interface{} CoreAdminSetBlockProtection(ctx).CoreAdminSetBlockProtectionRequest(coreAdminSetBlockProtectionRequest).Execute()

Set the protection state for a block plugin



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAdminSetBlockProtectionRequest := *openapiclient.NewCoreAdminSetBlockProtectionRequest("Plugin_example", int32(123)) // CoreAdminSetBlockProtectionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAdminSetBlockProtection(context.Background()).CoreAdminSetBlockProtectionRequest(coreAdminSetBlockProtectionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAdminSetBlockProtection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAdminSetBlockProtection`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAdminSetBlockProtection`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAdminSetBlockProtectionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAdminSetBlockProtectionRequest** | [**CoreAdminSetBlockProtectionRequest**](CoreAdminSetBlockProtectionRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAdminSetPluginOrder

> map[string]interface{} CoreAdminSetPluginOrder(ctx).CoreAdminSetPluginOrderRequest(coreAdminSetPluginOrderRequest).Execute()

Set the order of a plugin



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAdminSetPluginOrderRequest := *openapiclient.NewCoreAdminSetPluginOrderRequest(int32(123), "Plugin_example") // CoreAdminSetPluginOrderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAdminSetPluginOrder(context.Background()).CoreAdminSetPluginOrderRequest(coreAdminSetPluginOrderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAdminSetPluginOrder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAdminSetPluginOrder`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAdminSetPluginOrder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAdminSetPluginOrderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAdminSetPluginOrderRequest** | [**CoreAdminSetPluginOrderRequest**](CoreAdminSetPluginOrderRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAdminSetPluginState

> map[string]interface{} CoreAdminSetPluginState(ctx).CoreAdminSetPluginStateRequest(coreAdminSetPluginStateRequest).Execute()

Set the state of a plugin



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAdminSetPluginStateRequest := *openapiclient.NewCoreAdminSetPluginStateRequest("Plugin_example", int32(123)) // CoreAdminSetPluginStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAdminSetPluginState(context.Background()).CoreAdminSetPluginStateRequest(coreAdminSetPluginStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAdminSetPluginState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAdminSetPluginState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAdminSetPluginState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAdminSetPluginStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAdminSetPluginStateRequest** | [**CoreAdminSetPluginStateRequest**](CoreAdminSetPluginStateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAuthConfirmUser

> CoreAuthConfirmUser200Response CoreAuthConfirmUser(ctx).CoreAuthConfirmUserRequest(coreAuthConfirmUserRequest).Execute()

Confirm a user account.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAuthConfirmUserRequest := *openapiclient.NewCoreAuthConfirmUserRequest("Secret_example", "Username_example") // CoreAuthConfirmUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAuthConfirmUser(context.Background()).CoreAuthConfirmUserRequest(coreAuthConfirmUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAuthConfirmUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAuthConfirmUser`: CoreAuthConfirmUser200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAuthConfirmUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAuthConfirmUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAuthConfirmUserRequest** | [**CoreAuthConfirmUserRequest**](CoreAuthConfirmUserRequest.md) |  | 

### Return type

[**CoreAuthConfirmUser200Response**](CoreAuthConfirmUser200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAuthIsAgeDigitalConsentVerificationEnabled

> CoreAuthIsAgeDigitalConsentVerificationEnabled200Response CoreAuthIsAgeDigitalConsentVerificationEnabled(ctx).Execute()

Checks if age digital consent verification is enabled.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAuthIsAgeDigitalConsentVerificationEnabled(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAuthIsAgeDigitalConsentVerificationEnabled``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAuthIsAgeDigitalConsentVerificationEnabled`: CoreAuthIsAgeDigitalConsentVerificationEnabled200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAuthIsAgeDigitalConsentVerificationEnabled`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreAuthIsAgeDigitalConsentVerificationEnabledRequest struct via the builder pattern


### Return type

[**CoreAuthIsAgeDigitalConsentVerificationEnabled200Response**](CoreAuthIsAgeDigitalConsentVerificationEnabled200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAuthIsMinor

> CoreAuthIsMinor200Response CoreAuthIsMinor(ctx).CoreAuthIsMinorRequest(coreAuthIsMinorRequest).Execute()

Requests a check if a user is a digital minor.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAuthIsMinorRequest := *openapiclient.NewCoreAuthIsMinorRequest(int32(123), "Country_example") // CoreAuthIsMinorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAuthIsMinor(context.Background()).CoreAuthIsMinorRequest(coreAuthIsMinorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAuthIsMinor``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAuthIsMinor`: CoreAuthIsMinor200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAuthIsMinor`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAuthIsMinorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAuthIsMinorRequest** | [**CoreAuthIsMinorRequest**](CoreAuthIsMinorRequest.md) |  | 

### Return type

[**CoreAuthIsMinor200Response**](CoreAuthIsMinor200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAuthRequestPasswordReset

> CoreAuthRequestPasswordReset200Response CoreAuthRequestPasswordReset(ctx).CoreAuthRequestPasswordResetRequest(coreAuthRequestPasswordResetRequest).Execute()

Requests a password reset.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAuthRequestPasswordResetRequest := *openapiclient.NewCoreAuthRequestPasswordResetRequest() // CoreAuthRequestPasswordResetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAuthRequestPasswordReset(context.Background()).CoreAuthRequestPasswordResetRequest(coreAuthRequestPasswordResetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAuthRequestPasswordReset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAuthRequestPasswordReset`: CoreAuthRequestPasswordReset200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAuthRequestPasswordReset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAuthRequestPasswordResetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAuthRequestPasswordResetRequest** | [**CoreAuthRequestPasswordResetRequest**](CoreAuthRequestPasswordResetRequest.md) |  | 

### Return type

[**CoreAuthRequestPasswordReset200Response**](CoreAuthRequestPasswordReset200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreAuthResendConfirmationEmail

> CoreAuthResendConfirmationEmail200Response CoreAuthResendConfirmationEmail(ctx).CoreAuthResendConfirmationEmailRequest(coreAuthResendConfirmationEmailRequest).Execute()

Resend confirmation email.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreAuthResendConfirmationEmailRequest := *openapiclient.NewCoreAuthResendConfirmationEmailRequest("Password_example", "Username_example") // CoreAuthResendConfirmationEmailRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreAuthResendConfirmationEmail(context.Background()).CoreAuthResendConfirmationEmailRequest(coreAuthResendConfirmationEmailRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreAuthResendConfirmationEmail``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreAuthResendConfirmationEmail`: CoreAuthResendConfirmationEmail200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreAuthResendConfirmationEmail`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreAuthResendConfirmationEmailRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreAuthResendConfirmationEmailRequest** | [**CoreAuthResendConfirmationEmailRequest**](CoreAuthResendConfirmationEmailRequest.md) |  | 

### Return type

[**CoreAuthResendConfirmationEmail200Response**](CoreAuthResendConfirmationEmail200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBackupGetAsyncBackupLinksBackup

> CoreBackupGetAsyncBackupLinksBackup200Response CoreBackupGetAsyncBackupLinksBackup(ctx).CoreBackupGetAsyncBackupLinksBackupRequest(coreBackupGetAsyncBackupLinksBackupRequest).Execute()

Gets the data to use when updating the status table row in the UI for when an async backup completes.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBackupGetAsyncBackupLinksBackupRequest := *openapiclient.NewCoreBackupGetAsyncBackupLinksBackupRequest("Backupid_example", int32(123), "Filename_example") // CoreBackupGetAsyncBackupLinksBackupRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBackupGetAsyncBackupLinksBackup(context.Background()).CoreBackupGetAsyncBackupLinksBackupRequest(coreBackupGetAsyncBackupLinksBackupRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBackupGetAsyncBackupLinksBackup``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBackupGetAsyncBackupLinksBackup`: CoreBackupGetAsyncBackupLinksBackup200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBackupGetAsyncBackupLinksBackup`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBackupGetAsyncBackupLinksBackupRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBackupGetAsyncBackupLinksBackupRequest** | [**CoreBackupGetAsyncBackupLinksBackupRequest**](CoreBackupGetAsyncBackupLinksBackupRequest.md) |  | 

### Return type

[**CoreBackupGetAsyncBackupLinksBackup200Response**](CoreBackupGetAsyncBackupLinksBackup200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBackupGetAsyncBackupLinksRestore

> CoreBackupGetAsyncBackupLinksRestore200Response CoreBackupGetAsyncBackupLinksRestore(ctx).CoreBackupGetAsyncBackupLinksRestoreRequest(coreBackupGetAsyncBackupLinksRestoreRequest).Execute()

Gets the data to use when updating the status table row in the UI for when an async restore completes.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBackupGetAsyncBackupLinksRestoreRequest := *openapiclient.NewCoreBackupGetAsyncBackupLinksRestoreRequest("Backupid_example", int32(123)) // CoreBackupGetAsyncBackupLinksRestoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBackupGetAsyncBackupLinksRestore(context.Background()).CoreBackupGetAsyncBackupLinksRestoreRequest(coreBackupGetAsyncBackupLinksRestoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBackupGetAsyncBackupLinksRestore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBackupGetAsyncBackupLinksRestore`: CoreBackupGetAsyncBackupLinksRestore200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBackupGetAsyncBackupLinksRestore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBackupGetAsyncBackupLinksRestoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBackupGetAsyncBackupLinksRestoreRequest** | [**CoreBackupGetAsyncBackupLinksRestoreRequest**](CoreBackupGetAsyncBackupLinksRestoreRequest.md) |  | 

### Return type

[**CoreBackupGetAsyncBackupLinksRestore200Response**](CoreBackupGetAsyncBackupLinksRestore200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBackupGetAsyncBackupProgress

> map[string]interface{} CoreBackupGetAsyncBackupProgress(ctx).CoreBackupGetAsyncBackupProgressRequest(coreBackupGetAsyncBackupProgressRequest).Execute()

Get the progress of an Asyncronhous backup.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBackupGetAsyncBackupProgressRequest := *openapiclient.NewCoreBackupGetAsyncBackupProgressRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // CoreBackupGetAsyncBackupProgressRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBackupGetAsyncBackupProgress(context.Background()).CoreBackupGetAsyncBackupProgressRequest(coreBackupGetAsyncBackupProgressRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBackupGetAsyncBackupProgress``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBackupGetAsyncBackupProgress`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBackupGetAsyncBackupProgress`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBackupGetAsyncBackupProgressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBackupGetAsyncBackupProgressRequest** | [**CoreBackupGetAsyncBackupProgressRequest**](CoreBackupGetAsyncBackupProgressRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBackupGetCopyProgress

> map[string]interface{} CoreBackupGetCopyProgress(ctx).CoreBackupGetCopyProgressRequest(coreBackupGetCopyProgressRequest).Execute()

Gets the progress of course copy operations.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBackupGetCopyProgressRequest := *openapiclient.NewCoreBackupGetCopyProgressRequest([]openapiclient.CoreBackupGetCopyProgressRequestCopiesInner{*openapiclient.NewCoreBackupGetCopyProgressRequestCopiesInner()}) // CoreBackupGetCopyProgressRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBackupGetCopyProgress(context.Background()).CoreBackupGetCopyProgressRequest(coreBackupGetCopyProgressRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBackupGetCopyProgress``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBackupGetCopyProgress`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBackupGetCopyProgress`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBackupGetCopyProgressRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBackupGetCopyProgressRequest** | [**CoreBackupGetCopyProgressRequest**](CoreBackupGetCopyProgressRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBackupSubmitCopyForm

> map[string]interface{} CoreBackupSubmitCopyForm(ctx).CoreBackupSubmitCopyFormRequest(coreBackupSubmitCopyFormRequest).Execute()

Handles ajax submission of course copy form.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBackupSubmitCopyFormRequest := *openapiclient.NewCoreBackupSubmitCopyFormRequest("Jsonformdata_example") // CoreBackupSubmitCopyFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBackupSubmitCopyForm(context.Background()).CoreBackupSubmitCopyFormRequest(coreBackupSubmitCopyFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBackupSubmitCopyForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBackupSubmitCopyForm`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBackupSubmitCopyForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBackupSubmitCopyFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBackupSubmitCopyFormRequest** | [**CoreBackupSubmitCopyFormRequest**](CoreBackupSubmitCopyFormRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBadgesGetUserBadgeByHash

> CoreBadgesGetUserBadgeByHash200Response CoreBadgesGetUserBadgeByHash(ctx).CoreBadgesGetUserBadgeByHashRequest(coreBadgesGetUserBadgeByHashRequest).Execute()

Returns the badge awarded to a user by hash.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBadgesGetUserBadgeByHashRequest := *openapiclient.NewCoreBadgesGetUserBadgeByHashRequest("Hash_example") // CoreBadgesGetUserBadgeByHashRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBadgesGetUserBadgeByHash(context.Background()).CoreBadgesGetUserBadgeByHashRequest(coreBadgesGetUserBadgeByHashRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBadgesGetUserBadgeByHash``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBadgesGetUserBadgeByHash`: CoreBadgesGetUserBadgeByHash200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBadgesGetUserBadgeByHash`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBadgesGetUserBadgeByHashRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBadgesGetUserBadgeByHashRequest** | [**CoreBadgesGetUserBadgeByHashRequest**](CoreBadgesGetUserBadgeByHashRequest.md) |  | 

### Return type

[**CoreBadgesGetUserBadgeByHash200Response**](CoreBadgesGetUserBadgeByHash200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBadgesGetUserBadges

> CoreBadgesGetUserBadges200Response CoreBadgesGetUserBadges(ctx).CoreBadgesGetUserBadgesRequest(coreBadgesGetUserBadgesRequest).Execute()

Returns the list of badges awarded to a user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBadgesGetUserBadgesRequest := *openapiclient.NewCoreBadgesGetUserBadgesRequest() // CoreBadgesGetUserBadgesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBadgesGetUserBadges(context.Background()).CoreBadgesGetUserBadgesRequest(coreBadgesGetUserBadgesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBadgesGetUserBadges``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBadgesGetUserBadges`: CoreBadgesGetUserBadges200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBadgesGetUserBadges`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBadgesGetUserBadgesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBadgesGetUserBadgesRequest** | [**CoreBadgesGetUserBadgesRequest**](CoreBadgesGetUserBadgesRequest.md) |  | 

### Return type

[**CoreBadgesGetUserBadges200Response**](CoreBadgesGetUserBadges200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBlockFetchAddableBlocks

> map[string]interface{} CoreBlockFetchAddableBlocks(ctx).CoreBlockFetchAddableBlocksRequest(coreBlockFetchAddableBlocksRequest).Execute()

Returns all addable blocks in a given page.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBlockFetchAddableBlocksRequest := *openapiclient.NewCoreBlockFetchAddableBlocksRequest(int32(123), "Pagelayout_example", "Pagetype_example") // CoreBlockFetchAddableBlocksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBlockFetchAddableBlocks(context.Background()).CoreBlockFetchAddableBlocksRequest(coreBlockFetchAddableBlocksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBlockFetchAddableBlocks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBlockFetchAddableBlocks`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBlockFetchAddableBlocks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBlockFetchAddableBlocksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBlockFetchAddableBlocksRequest** | [**CoreBlockFetchAddableBlocksRequest**](CoreBlockFetchAddableBlocksRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBlockGetCourseBlocks

> CoreBlockGetCourseBlocks200Response CoreBlockGetCourseBlocks(ctx).CoreBlockGetCourseBlocksRequest(coreBlockGetCourseBlocksRequest).Execute()

Returns blocks information for a course.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBlockGetCourseBlocksRequest := *openapiclient.NewCoreBlockGetCourseBlocksRequest(int32(123)) // CoreBlockGetCourseBlocksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBlockGetCourseBlocks(context.Background()).CoreBlockGetCourseBlocksRequest(coreBlockGetCourseBlocksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBlockGetCourseBlocks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBlockGetCourseBlocks`: CoreBlockGetCourseBlocks200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBlockGetCourseBlocks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBlockGetCourseBlocksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBlockGetCourseBlocksRequest** | [**CoreBlockGetCourseBlocksRequest**](CoreBlockGetCourseBlocksRequest.md) |  | 

### Return type

[**CoreBlockGetCourseBlocks200Response**](CoreBlockGetCourseBlocks200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBlockGetDashboardBlocks

> CoreBlockGetDashboardBlocks200Response CoreBlockGetDashboardBlocks(ctx).CoreBlockGetDashboardBlocksRequest(coreBlockGetDashboardBlocksRequest).Execute()

Returns blocks information for the given user dashboard.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBlockGetDashboardBlocksRequest := *openapiclient.NewCoreBlockGetDashboardBlocksRequest() // CoreBlockGetDashboardBlocksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBlockGetDashboardBlocks(context.Background()).CoreBlockGetDashboardBlocksRequest(coreBlockGetDashboardBlocksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBlockGetDashboardBlocks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBlockGetDashboardBlocks`: CoreBlockGetDashboardBlocks200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBlockGetDashboardBlocks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBlockGetDashboardBlocksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBlockGetDashboardBlocksRequest** | [**CoreBlockGetDashboardBlocksRequest**](CoreBlockGetDashboardBlocksRequest.md) |  | 

### Return type

[**CoreBlockGetDashboardBlocks200Response**](CoreBlockGetDashboardBlocks200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBlogGetEntries

> CoreBlogGetEntries200Response CoreBlogGetEntries(ctx).CoreBlogGetEntriesRequest(coreBlogGetEntriesRequest).Execute()

Returns blog entries.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBlogGetEntriesRequest := *openapiclient.NewCoreBlogGetEntriesRequest() // CoreBlogGetEntriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBlogGetEntries(context.Background()).CoreBlogGetEntriesRequest(coreBlogGetEntriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBlogGetEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBlogGetEntries`: CoreBlogGetEntries200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBlogGetEntries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBlogGetEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBlogGetEntriesRequest** | [**CoreBlogGetEntriesRequest**](CoreBlogGetEntriesRequest.md) |  | 

### Return type

[**CoreBlogGetEntries200Response**](CoreBlogGetEntries200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreBlogViewEntries

> CoreBlogViewEntries200Response CoreBlogViewEntries(ctx).CoreBlogViewEntriesRequest(coreBlogViewEntriesRequest).Execute()

Trigger the blog_entries_viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreBlogViewEntriesRequest := *openapiclient.NewCoreBlogViewEntriesRequest() // CoreBlogViewEntriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreBlogViewEntries(context.Background()).CoreBlogViewEntriesRequest(coreBlogViewEntriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreBlogViewEntries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreBlogViewEntries`: CoreBlogViewEntries200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreBlogViewEntries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreBlogViewEntriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreBlogViewEntriesRequest** | [**CoreBlogViewEntriesRequest**](CoreBlogViewEntriesRequest.md) |  | 

### Return type

[**CoreBlogViewEntries200Response**](CoreBlogViewEntries200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarCreateCalendarEvents

> CoreCalendarCreateCalendarEvents200Response CoreCalendarCreateCalendarEvents(ctx).CoreCalendarCreateCalendarEventsRequest(coreCalendarCreateCalendarEventsRequest).Execute()

Create calendar events



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarCreateCalendarEventsRequest := *openapiclient.NewCoreCalendarCreateCalendarEventsRequest([]openapiclient.CoreCalendarCreateCalendarEventsRequestEventsInner{*openapiclient.NewCoreCalendarCreateCalendarEventsRequestEventsInner()}) // CoreCalendarCreateCalendarEventsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarCreateCalendarEvents(context.Background()).CoreCalendarCreateCalendarEventsRequest(coreCalendarCreateCalendarEventsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarCreateCalendarEvents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarCreateCalendarEvents`: CoreCalendarCreateCalendarEvents200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarCreateCalendarEvents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarCreateCalendarEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarCreateCalendarEventsRequest** | [**CoreCalendarCreateCalendarEventsRequest**](CoreCalendarCreateCalendarEventsRequest.md) |  | 

### Return type

[**CoreCalendarCreateCalendarEvents200Response**](CoreCalendarCreateCalendarEvents200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarDeleteCalendarEvents

> map[string]interface{} CoreCalendarDeleteCalendarEvents(ctx).CoreCalendarDeleteCalendarEventsRequest(coreCalendarDeleteCalendarEventsRequest).Execute()

Delete calendar events



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarDeleteCalendarEventsRequest := *openapiclient.NewCoreCalendarDeleteCalendarEventsRequest([]openapiclient.CoreCalendarDeleteCalendarEventsRequestEventsInner{*openapiclient.NewCoreCalendarDeleteCalendarEventsRequestEventsInner()}) // CoreCalendarDeleteCalendarEventsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarDeleteCalendarEvents(context.Background()).CoreCalendarDeleteCalendarEventsRequest(coreCalendarDeleteCalendarEventsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarDeleteCalendarEvents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarDeleteCalendarEvents`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarDeleteCalendarEvents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarDeleteCalendarEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarDeleteCalendarEventsRequest** | [**CoreCalendarDeleteCalendarEventsRequest**](CoreCalendarDeleteCalendarEventsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarDeleteSubscription

> CoreCalendarDeleteSubscription200Response CoreCalendarDeleteSubscription(ctx).CoreCalendarDeleteSubscriptionRequest(coreCalendarDeleteSubscriptionRequest).Execute()

Delete the calendar subscription



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarDeleteSubscriptionRequest := *openapiclient.NewCoreCalendarDeleteSubscriptionRequest(int32(123)) // CoreCalendarDeleteSubscriptionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarDeleteSubscription(context.Background()).CoreCalendarDeleteSubscriptionRequest(coreCalendarDeleteSubscriptionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarDeleteSubscription``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarDeleteSubscription`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarDeleteSubscription`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarDeleteSubscriptionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarDeleteSubscriptionRequest** | [**CoreCalendarDeleteSubscriptionRequest**](CoreCalendarDeleteSubscriptionRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetActionEventsByCourse

> CoreCalendarGetActionEventsByCourse200Response CoreCalendarGetActionEventsByCourse(ctx).CoreCalendarGetActionEventsByCourseRequest(coreCalendarGetActionEventsByCourseRequest).Execute()

Get calendar action events by course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetActionEventsByCourseRequest := *openapiclient.NewCoreCalendarGetActionEventsByCourseRequest(int32(123)) // CoreCalendarGetActionEventsByCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetActionEventsByCourse(context.Background()).CoreCalendarGetActionEventsByCourseRequest(coreCalendarGetActionEventsByCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetActionEventsByCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetActionEventsByCourse`: CoreCalendarGetActionEventsByCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetActionEventsByCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetActionEventsByCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetActionEventsByCourseRequest** | [**CoreCalendarGetActionEventsByCourseRequest**](CoreCalendarGetActionEventsByCourseRequest.md) |  | 

### Return type

[**CoreCalendarGetActionEventsByCourse200Response**](CoreCalendarGetActionEventsByCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetActionEventsByCourses

> CoreCalendarGetActionEventsByCourses200Response CoreCalendarGetActionEventsByCourses(ctx).CoreCalendarGetActionEventsByCoursesRequest(coreCalendarGetActionEventsByCoursesRequest).Execute()

Get calendar action events by courses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetActionEventsByCoursesRequest := *openapiclient.NewCoreCalendarGetActionEventsByCoursesRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCalendarGetActionEventsByCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetActionEventsByCourses(context.Background()).CoreCalendarGetActionEventsByCoursesRequest(coreCalendarGetActionEventsByCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetActionEventsByCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetActionEventsByCourses`: CoreCalendarGetActionEventsByCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetActionEventsByCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetActionEventsByCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetActionEventsByCoursesRequest** | [**CoreCalendarGetActionEventsByCoursesRequest**](CoreCalendarGetActionEventsByCoursesRequest.md) |  | 

### Return type

[**CoreCalendarGetActionEventsByCourses200Response**](CoreCalendarGetActionEventsByCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetActionEventsByTimesort

> CoreCalendarGetActionEventsByTimesort200Response CoreCalendarGetActionEventsByTimesort(ctx).CoreCalendarGetActionEventsByTimesortRequest(coreCalendarGetActionEventsByTimesortRequest).Execute()

Get calendar action events by tiemsort



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetActionEventsByTimesortRequest := *openapiclient.NewCoreCalendarGetActionEventsByTimesortRequest() // CoreCalendarGetActionEventsByTimesortRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetActionEventsByTimesort(context.Background()).CoreCalendarGetActionEventsByTimesortRequest(coreCalendarGetActionEventsByTimesortRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetActionEventsByTimesort``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetActionEventsByTimesort`: CoreCalendarGetActionEventsByTimesort200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetActionEventsByTimesort`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetActionEventsByTimesortRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetActionEventsByTimesortRequest** | [**CoreCalendarGetActionEventsByTimesortRequest**](CoreCalendarGetActionEventsByTimesortRequest.md) |  | 

### Return type

[**CoreCalendarGetActionEventsByTimesort200Response**](CoreCalendarGetActionEventsByTimesort200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetAllowedEventTypes

> CoreCalendarGetAllowedEventTypes200Response CoreCalendarGetAllowedEventTypes(ctx).CoreCalendarGetAllowedEventTypesRequest(coreCalendarGetAllowedEventTypesRequest).Execute()

Get the type of events a user can create in the given course.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetAllowedEventTypesRequest := *openapiclient.NewCoreCalendarGetAllowedEventTypesRequest() // CoreCalendarGetAllowedEventTypesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetAllowedEventTypes(context.Background()).CoreCalendarGetAllowedEventTypesRequest(coreCalendarGetAllowedEventTypesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetAllowedEventTypes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetAllowedEventTypes`: CoreCalendarGetAllowedEventTypes200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetAllowedEventTypes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetAllowedEventTypesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetAllowedEventTypesRequest** | [**CoreCalendarGetAllowedEventTypesRequest**](CoreCalendarGetAllowedEventTypesRequest.md) |  | 

### Return type

[**CoreCalendarGetAllowedEventTypes200Response**](CoreCalendarGetAllowedEventTypes200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarAccessInformation

> CoreCalendarGetCalendarAccessInformation200Response CoreCalendarGetCalendarAccessInformation(ctx).CoreCalendarGetCalendarAccessInformationRequest(coreCalendarGetCalendarAccessInformationRequest).Execute()

Convenience function to retrieve some permissions/access information for the given course calendar.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarAccessInformationRequest := *openapiclient.NewCoreCalendarGetCalendarAccessInformationRequest() // CoreCalendarGetCalendarAccessInformationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarAccessInformation(context.Background()).CoreCalendarGetCalendarAccessInformationRequest(coreCalendarGetCalendarAccessInformationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarAccessInformation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarAccessInformation`: CoreCalendarGetCalendarAccessInformation200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarAccessInformation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarAccessInformationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarAccessInformationRequest** | [**CoreCalendarGetCalendarAccessInformationRequest**](CoreCalendarGetCalendarAccessInformationRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarAccessInformation200Response**](CoreCalendarGetCalendarAccessInformation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarDayView

> CoreCalendarGetCalendarDayView200Response CoreCalendarGetCalendarDayView(ctx).CoreCalendarGetCalendarDayViewRequest(coreCalendarGetCalendarDayViewRequest).Execute()

Fetch the day view data for a calendar



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarDayViewRequest := *openapiclient.NewCoreCalendarGetCalendarDayViewRequest(int32(123), int32(123), int32(123)) // CoreCalendarGetCalendarDayViewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarDayView(context.Background()).CoreCalendarGetCalendarDayViewRequest(coreCalendarGetCalendarDayViewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarDayView``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarDayView`: CoreCalendarGetCalendarDayView200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarDayView`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarDayViewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarDayViewRequest** | [**CoreCalendarGetCalendarDayViewRequest**](CoreCalendarGetCalendarDayViewRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarDayView200Response**](CoreCalendarGetCalendarDayView200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarEventById

> CoreCalendarGetCalendarEventById200Response CoreCalendarGetCalendarEventById(ctx).CoreCalendarGetCalendarEventByIdRequest(coreCalendarGetCalendarEventByIdRequest).Execute()

Get calendar event by id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarEventByIdRequest := *openapiclient.NewCoreCalendarGetCalendarEventByIdRequest(int32(123)) // CoreCalendarGetCalendarEventByIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarEventById(context.Background()).CoreCalendarGetCalendarEventByIdRequest(coreCalendarGetCalendarEventByIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarEventById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarEventById`: CoreCalendarGetCalendarEventById200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarEventById`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarEventByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarEventByIdRequest** | [**CoreCalendarGetCalendarEventByIdRequest**](CoreCalendarGetCalendarEventByIdRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarEventById200Response**](CoreCalendarGetCalendarEventById200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarEvents

> CoreCalendarGetCalendarEvents200Response CoreCalendarGetCalendarEvents(ctx).CoreCalendarGetCalendarEventsRequest(coreCalendarGetCalendarEventsRequest).Execute()

Get calendar events



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarEventsRequest := *openapiclient.NewCoreCalendarGetCalendarEventsRequest() // CoreCalendarGetCalendarEventsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarEvents(context.Background()).CoreCalendarGetCalendarEventsRequest(coreCalendarGetCalendarEventsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarEvents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarEvents`: CoreCalendarGetCalendarEvents200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarEvents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarEventsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarEventsRequest** | [**CoreCalendarGetCalendarEventsRequest**](CoreCalendarGetCalendarEventsRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarEvents200Response**](CoreCalendarGetCalendarEvents200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarExportToken

> CoreCalendarGetCalendarExportToken200Response CoreCalendarGetCalendarExportToken(ctx).Execute()

Return the auth token required for exporting a calendar.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarExportToken(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarExportToken``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarExportToken`: CoreCalendarGetCalendarExportToken200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarExportToken`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarExportTokenRequest struct via the builder pattern


### Return type

[**CoreCalendarGetCalendarExportToken200Response**](CoreCalendarGetCalendarExportToken200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarMonthlyView

> CoreCalendarGetCalendarMonthlyView200Response CoreCalendarGetCalendarMonthlyView(ctx).CoreCalendarGetCalendarMonthlyViewRequest(coreCalendarGetCalendarMonthlyViewRequest).Execute()

Fetch the monthly view data for a calendar



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarMonthlyViewRequest := *openapiclient.NewCoreCalendarGetCalendarMonthlyViewRequest(int32(123), int32(123)) // CoreCalendarGetCalendarMonthlyViewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarMonthlyView(context.Background()).CoreCalendarGetCalendarMonthlyViewRequest(coreCalendarGetCalendarMonthlyViewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarMonthlyView``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarMonthlyView`: CoreCalendarGetCalendarMonthlyView200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarMonthlyView`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarMonthlyViewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarMonthlyViewRequest** | [**CoreCalendarGetCalendarMonthlyViewRequest**](CoreCalendarGetCalendarMonthlyViewRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarMonthlyView200Response**](CoreCalendarGetCalendarMonthlyView200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetCalendarUpcomingView

> CoreCalendarGetCalendarUpcomingView200Response CoreCalendarGetCalendarUpcomingView(ctx).CoreCalendarGetCalendarUpcomingViewRequest(coreCalendarGetCalendarUpcomingViewRequest).Execute()

Fetch the upcoming view data for a calendar



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetCalendarUpcomingViewRequest := *openapiclient.NewCoreCalendarGetCalendarUpcomingViewRequest() // CoreCalendarGetCalendarUpcomingViewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetCalendarUpcomingView(context.Background()).CoreCalendarGetCalendarUpcomingViewRequest(coreCalendarGetCalendarUpcomingViewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetCalendarUpcomingView``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetCalendarUpcomingView`: CoreCalendarGetCalendarUpcomingView200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetCalendarUpcomingView`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetCalendarUpcomingViewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetCalendarUpcomingViewRequest** | [**CoreCalendarGetCalendarUpcomingViewRequest**](CoreCalendarGetCalendarUpcomingViewRequest.md) |  | 

### Return type

[**CoreCalendarGetCalendarUpcomingView200Response**](CoreCalendarGetCalendarUpcomingView200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarGetTimestamps

> CoreCalendarGetTimestamps200Response CoreCalendarGetTimestamps(ctx).CoreCalendarGetTimestampsRequest(coreCalendarGetTimestampsRequest).Execute()

Fetch unix timestamps for given date times.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarGetTimestampsRequest := *openapiclient.NewCoreCalendarGetTimestampsRequest([]openapiclient.CoreCalendarGetTimestampsRequestDataInner{*openapiclient.NewCoreCalendarGetTimestampsRequestDataInner()}) // CoreCalendarGetTimestampsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarGetTimestamps(context.Background()).CoreCalendarGetTimestampsRequest(coreCalendarGetTimestampsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarGetTimestamps``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarGetTimestamps`: CoreCalendarGetTimestamps200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarGetTimestamps`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarGetTimestampsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarGetTimestampsRequest** | [**CoreCalendarGetTimestampsRequest**](CoreCalendarGetTimestampsRequest.md) |  | 

### Return type

[**CoreCalendarGetTimestamps200Response**](CoreCalendarGetTimestamps200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarSubmitCreateUpdateForm

> CoreCalendarSubmitCreateUpdateForm200Response CoreCalendarSubmitCreateUpdateForm(ctx).CoreCalendarSubmitCreateUpdateFormRequest(coreCalendarSubmitCreateUpdateFormRequest).Execute()

Submit form data for event form



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarSubmitCreateUpdateFormRequest := *openapiclient.NewCoreCalendarSubmitCreateUpdateFormRequest("Formdata_example") // CoreCalendarSubmitCreateUpdateFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarSubmitCreateUpdateForm(context.Background()).CoreCalendarSubmitCreateUpdateFormRequest(coreCalendarSubmitCreateUpdateFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarSubmitCreateUpdateForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarSubmitCreateUpdateForm`: CoreCalendarSubmitCreateUpdateForm200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarSubmitCreateUpdateForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarSubmitCreateUpdateFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarSubmitCreateUpdateFormRequest** | [**CoreCalendarSubmitCreateUpdateFormRequest**](CoreCalendarSubmitCreateUpdateFormRequest.md) |  | 

### Return type

[**CoreCalendarSubmitCreateUpdateForm200Response**](CoreCalendarSubmitCreateUpdateForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCalendarUpdateEventStartDay

> CoreCalendarUpdateEventStartDay200Response CoreCalendarUpdateEventStartDay(ctx).CoreCalendarUpdateEventStartDayRequest(coreCalendarUpdateEventStartDayRequest).Execute()

Update the start day (but not time) for an event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCalendarUpdateEventStartDayRequest := *openapiclient.NewCoreCalendarUpdateEventStartDayRequest(int32(123), int32(123)) // CoreCalendarUpdateEventStartDayRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCalendarUpdateEventStartDay(context.Background()).CoreCalendarUpdateEventStartDayRequest(coreCalendarUpdateEventStartDayRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCalendarUpdateEventStartDay``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCalendarUpdateEventStartDay`: CoreCalendarUpdateEventStartDay200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCalendarUpdateEventStartDay`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCalendarUpdateEventStartDayRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCalendarUpdateEventStartDayRequest** | [**CoreCalendarUpdateEventStartDayRequest**](CoreCalendarUpdateEventStartDayRequest.md) |  | 

### Return type

[**CoreCalendarUpdateEventStartDay200Response**](CoreCalendarUpdateEventStartDay200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreChangeEditmode

> CoreChangeEditmode200Response CoreChangeEditmode(ctx).CoreChangeEditmodeRequest(coreChangeEditmodeRequest).Execute()

Change the editing mode



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreChangeEditmodeRequest := *openapiclient.NewCoreChangeEditmodeRequest(int32(123), false) // CoreChangeEditmodeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreChangeEditmode(context.Background()).CoreChangeEditmodeRequest(coreChangeEditmodeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreChangeEditmode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreChangeEditmode`: CoreChangeEditmode200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreChangeEditmode`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreChangeEditmodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreChangeEditmodeRequest** | [**CoreChangeEditmodeRequest**](CoreChangeEditmodeRequest.md) |  | 

### Return type

[**CoreChangeEditmode200Response**](CoreChangeEditmode200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortAddCohortMembers

> CoreCohortAddCohortMembers200Response CoreCohortAddCohortMembers(ctx).CoreCohortAddCohortMembersRequest(coreCohortAddCohortMembersRequest).Execute()

Adds cohort members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortAddCohortMembersRequest := *openapiclient.NewCoreCohortAddCohortMembersRequest([]openapiclient.CoreCohortAddCohortMembersRequestMembersInner{*openapiclient.NewCoreCohortAddCohortMembersRequestMembersInner()}) // CoreCohortAddCohortMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortAddCohortMembers(context.Background()).CoreCohortAddCohortMembersRequest(coreCohortAddCohortMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortAddCohortMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortAddCohortMembers`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortAddCohortMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortAddCohortMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortAddCohortMembersRequest** | [**CoreCohortAddCohortMembersRequest**](CoreCohortAddCohortMembersRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortCreateCohorts

> map[string]interface{} CoreCohortCreateCohorts(ctx).CoreCohortCreateCohortsRequest(coreCohortCreateCohortsRequest).Execute()

Creates new cohorts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortCreateCohortsRequest := *openapiclient.NewCoreCohortCreateCohortsRequest([]openapiclient.CoreCohortCreateCohortsRequestCohortsInner{*openapiclient.NewCoreCohortCreateCohortsRequestCohortsInner()}) // CoreCohortCreateCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortCreateCohorts(context.Background()).CoreCohortCreateCohortsRequest(coreCohortCreateCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortCreateCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortCreateCohorts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortCreateCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortCreateCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortCreateCohortsRequest** | [**CoreCohortCreateCohortsRequest**](CoreCohortCreateCohortsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortDeleteCohortMembers

> map[string]interface{} CoreCohortDeleteCohortMembers(ctx).CoreCohortDeleteCohortMembersRequest(coreCohortDeleteCohortMembersRequest).Execute()

Deletes cohort members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortDeleteCohortMembersRequest := *openapiclient.NewCoreCohortDeleteCohortMembersRequest([]openapiclient.CoreCohortDeleteCohortMembersRequestMembersInner{*openapiclient.NewCoreCohortDeleteCohortMembersRequestMembersInner()}) // CoreCohortDeleteCohortMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortDeleteCohortMembers(context.Background()).CoreCohortDeleteCohortMembersRequest(coreCohortDeleteCohortMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortDeleteCohortMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortDeleteCohortMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortDeleteCohortMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortDeleteCohortMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortDeleteCohortMembersRequest** | [**CoreCohortDeleteCohortMembersRequest**](CoreCohortDeleteCohortMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortDeleteCohorts

> map[string]interface{} CoreCohortDeleteCohorts(ctx).CoreCohortDeleteCohortsRequest(coreCohortDeleteCohortsRequest).Execute()

Deletes all specified cohorts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortDeleteCohortsRequest := *openapiclient.NewCoreCohortDeleteCohortsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCohortDeleteCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortDeleteCohorts(context.Background()).CoreCohortDeleteCohortsRequest(coreCohortDeleteCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortDeleteCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortDeleteCohorts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortDeleteCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortDeleteCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortDeleteCohortsRequest** | [**CoreCohortDeleteCohortsRequest**](CoreCohortDeleteCohortsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortGetCohortMembers

> map[string]interface{} CoreCohortGetCohortMembers(ctx).CoreCohortGetCohortMembersRequest(coreCohortGetCohortMembersRequest).Execute()

Returns cohort members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortGetCohortMembersRequest := *openapiclient.NewCoreCohortGetCohortMembersRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCohortGetCohortMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortGetCohortMembers(context.Background()).CoreCohortGetCohortMembersRequest(coreCohortGetCohortMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortGetCohortMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortGetCohortMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortGetCohortMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortGetCohortMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortGetCohortMembersRequest** | [**CoreCohortGetCohortMembersRequest**](CoreCohortGetCohortMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortGetCohorts

> map[string]interface{} CoreCohortGetCohorts(ctx).CoreCohortGetCohortsRequest(coreCohortGetCohortsRequest).Execute()

Returns cohort details.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortGetCohortsRequest := *openapiclient.NewCoreCohortGetCohortsRequest() // CoreCohortGetCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortGetCohorts(context.Background()).CoreCohortGetCohortsRequest(coreCohortGetCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortGetCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortGetCohorts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortGetCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortGetCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortGetCohortsRequest** | [**CoreCohortGetCohortsRequest**](CoreCohortGetCohortsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortSearchCohorts

> CoreCohortSearchCohorts200Response CoreCohortSearchCohorts(ctx).CoreCohortSearchCohortsRequest(coreCohortSearchCohortsRequest).Execute()

Search for cohorts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortSearchCohortsRequest := *openapiclient.NewCoreCohortSearchCohortsRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext(), "Query_example") // CoreCohortSearchCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortSearchCohorts(context.Background()).CoreCohortSearchCohortsRequest(coreCohortSearchCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortSearchCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortSearchCohorts`: CoreCohortSearchCohorts200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortSearchCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortSearchCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortSearchCohortsRequest** | [**CoreCohortSearchCohortsRequest**](CoreCohortSearchCohortsRequest.md) |  | 

### Return type

[**CoreCohortSearchCohorts200Response**](CoreCohortSearchCohorts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCohortUpdateCohorts

> map[string]interface{} CoreCohortUpdateCohorts(ctx).CoreCohortUpdateCohortsRequest(coreCohortUpdateCohortsRequest).Execute()

Updates existing cohorts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCohortUpdateCohortsRequest := *openapiclient.NewCoreCohortUpdateCohortsRequest([]openapiclient.CoreCohortUpdateCohortsRequestCohortsInner{*openapiclient.NewCoreCohortUpdateCohortsRequestCohortsInner()}) // CoreCohortUpdateCohortsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCohortUpdateCohorts(context.Background()).CoreCohortUpdateCohortsRequest(coreCohortUpdateCohortsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCohortUpdateCohorts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCohortUpdateCohorts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCohortUpdateCohorts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCohortUpdateCohortsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCohortUpdateCohortsRequest** | [**CoreCohortUpdateCohortsRequest**](CoreCohortUpdateCohortsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCommentAddComments

> map[string]interface{} CoreCommentAddComments(ctx).CoreCommentAddCommentsRequest(coreCommentAddCommentsRequest).Execute()

Adds a comment or comments.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCommentAddCommentsRequest := *openapiclient.NewCoreCommentAddCommentsRequest([]openapiclient.CoreCommentAddCommentsRequestCommentsInner{*openapiclient.NewCoreCommentAddCommentsRequestCommentsInner()}) // CoreCommentAddCommentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCommentAddComments(context.Background()).CoreCommentAddCommentsRequest(coreCommentAddCommentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCommentAddComments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCommentAddComments`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCommentAddComments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCommentAddCommentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCommentAddCommentsRequest** | [**CoreCommentAddCommentsRequest**](CoreCommentAddCommentsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCommentDeleteComments

> map[string]interface{} CoreCommentDeleteComments(ctx).CoreCommentDeleteCommentsRequest(coreCommentDeleteCommentsRequest).Execute()

Deletes a comment or comments.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCommentDeleteCommentsRequest := *openapiclient.NewCoreCommentDeleteCommentsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCommentDeleteCommentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCommentDeleteComments(context.Background()).CoreCommentDeleteCommentsRequest(coreCommentDeleteCommentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCommentDeleteComments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCommentDeleteComments`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCommentDeleteComments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCommentDeleteCommentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCommentDeleteCommentsRequest** | [**CoreCommentDeleteCommentsRequest**](CoreCommentDeleteCommentsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCommentGetComments

> CoreCommentGetComments200Response CoreCommentGetComments(ctx).CoreCommentGetCommentsRequest(coreCommentGetCommentsRequest).Execute()

Returns comments.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCommentGetCommentsRequest := *openapiclient.NewCoreCommentGetCommentsRequest("Component_example", "Contextlevel_example", int32(123), int32(123)) // CoreCommentGetCommentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCommentGetComments(context.Background()).CoreCommentGetCommentsRequest(coreCommentGetCommentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCommentGetComments``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCommentGetComments`: CoreCommentGetComments200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCommentGetComments`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCommentGetCommentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCommentGetCommentsRequest** | [**CoreCommentGetCommentsRequest**](CoreCommentGetCommentsRequest.md) |  | 

### Return type

[**CoreCommentGetComments200Response**](CoreCommentGetComments200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyAddCompetencyToCourse

> map[string]interface{} CoreCompetencyAddCompetencyToCourse(ctx).CoreCompetencyAddCompetencyToCourseRequest(coreCompetencyAddCompetencyToCourseRequest).Execute()

Add the competency to a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyAddCompetencyToCourseRequest := *openapiclient.NewCoreCompetencyAddCompetencyToCourseRequest(int32(123), int32(123)) // CoreCompetencyAddCompetencyToCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyAddCompetencyToCourse(context.Background()).CoreCompetencyAddCompetencyToCourseRequest(coreCompetencyAddCompetencyToCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyAddCompetencyToCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyAddCompetencyToCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyAddCompetencyToCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyAddCompetencyToCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyAddCompetencyToCourseRequest** | [**CoreCompetencyAddCompetencyToCourseRequest**](CoreCompetencyAddCompetencyToCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyAddCompetencyToPlan

> map[string]interface{} CoreCompetencyAddCompetencyToPlan(ctx).CoreCompetencyAddCompetencyToPlanRequest(coreCompetencyAddCompetencyToPlanRequest).Execute()

Add the competency to a learning plan



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyAddCompetencyToPlanRequest := *openapiclient.NewCoreCompetencyAddCompetencyToPlanRequest(int32(123), int32(123)) // CoreCompetencyAddCompetencyToPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyAddCompetencyToPlan(context.Background()).CoreCompetencyAddCompetencyToPlanRequest(coreCompetencyAddCompetencyToPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyAddCompetencyToPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyAddCompetencyToPlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyAddCompetencyToPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyAddCompetencyToPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyAddCompetencyToPlanRequest** | [**CoreCompetencyAddCompetencyToPlanRequest**](CoreCompetencyAddCompetencyToPlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyAddCompetencyToTemplate

> map[string]interface{} CoreCompetencyAddCompetencyToTemplate(ctx).CoreCompetencyAddCompetencyToTemplateRequest(coreCompetencyAddCompetencyToTemplateRequest).Execute()

Add the competency to a template



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyAddCompetencyToTemplateRequest := *openapiclient.NewCoreCompetencyAddCompetencyToTemplateRequest(int32(123), int32(123)) // CoreCompetencyAddCompetencyToTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyAddCompetencyToTemplate(context.Background()).CoreCompetencyAddCompetencyToTemplateRequest(coreCompetencyAddCompetencyToTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyAddCompetencyToTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyAddCompetencyToTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyAddCompetencyToTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyAddCompetencyToTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyAddCompetencyToTemplateRequest** | [**CoreCompetencyAddCompetencyToTemplateRequest**](CoreCompetencyAddCompetencyToTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyAddRelatedCompetency

> map[string]interface{} CoreCompetencyAddRelatedCompetency(ctx).CoreCompetencyAddRelatedCompetencyRequest(coreCompetencyAddRelatedCompetencyRequest).Execute()

Adds a related competency



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyAddRelatedCompetencyRequest := *openapiclient.NewCoreCompetencyAddRelatedCompetencyRequest(int32(123), int32(123)) // CoreCompetencyAddRelatedCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyAddRelatedCompetency(context.Background()).CoreCompetencyAddRelatedCompetencyRequest(coreCompetencyAddRelatedCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyAddRelatedCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyAddRelatedCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyAddRelatedCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyAddRelatedCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyAddRelatedCompetencyRequest** | [**CoreCompetencyAddRelatedCompetencyRequest**](CoreCompetencyAddRelatedCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyApprovePlan

> map[string]interface{} CoreCompetencyApprovePlan(ctx).CoreCompetencyApprovePlanRequest(coreCompetencyApprovePlanRequest).Execute()

Approve a plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyApprovePlanRequest := *openapiclient.NewCoreCompetencyApprovePlanRequest(int32(123)) // CoreCompetencyApprovePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyApprovePlan(context.Background()).CoreCompetencyApprovePlanRequest(coreCompetencyApprovePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyApprovePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyApprovePlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyApprovePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyApprovePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyApprovePlanRequest** | [**CoreCompetencyApprovePlanRequest**](CoreCompetencyApprovePlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCompetencyFrameworkViewed

> map[string]interface{} CoreCompetencyCompetencyFrameworkViewed(ctx).CoreCompetencyCompetencyFrameworkViewedRequest(coreCompetencyCompetencyFrameworkViewedRequest).Execute()

Log event competency framework viewed



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyFrameworkViewedRequest := *openapiclient.NewCoreCompetencyCompetencyFrameworkViewedRequest(int32(123)) // CoreCompetencyCompetencyFrameworkViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCompetencyFrameworkViewed(context.Background()).CoreCompetencyCompetencyFrameworkViewedRequest(coreCompetencyCompetencyFrameworkViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCompetencyFrameworkViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCompetencyFrameworkViewed`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCompetencyFrameworkViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCompetencyFrameworkViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyFrameworkViewedRequest** | [**CoreCompetencyCompetencyFrameworkViewedRequest**](CoreCompetencyCompetencyFrameworkViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCompetencyViewed

> map[string]interface{} CoreCompetencyCompetencyViewed(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

Log event competency viewed



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCompetencyViewed(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCompetencyViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCompetencyViewed`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCompetencyViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCompetencyViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCompletePlan

> map[string]interface{} CoreCompetencyCompletePlan(ctx).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()

Complete learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompletePlanRequest := *openapiclient.NewCoreCompetencyCompletePlanRequest(int32(123)) // CoreCompetencyCompletePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCompletePlan(context.Background()).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCompletePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCompletePlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCompletePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCompletePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompletePlanRequest** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCompetencies

> map[string]interface{} CoreCompetencyCountCompetencies(ctx).CoreCompetencyCountCompetenciesRequest(coreCompetencyCountCompetenciesRequest).Execute()

Count a list of a competencies.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesRequest := *openapiclient.NewCoreCompetencyCountCompetenciesRequest([]openapiclient.CoreCompetencyCountCompetenciesRequestFiltersInner{*openapiclient.NewCoreCompetencyCountCompetenciesRequestFiltersInner()}) // CoreCompetencyCountCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCompetencies(context.Background()).CoreCompetencyCountCompetenciesRequest(coreCompetencyCountCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesRequest** | [**CoreCompetencyCountCompetenciesRequest**](CoreCompetencyCountCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCompetenciesInCourse

> map[string]interface{} CoreCompetencyCountCompetenciesInCourse(ctx).CoreCompetencyCountCompetenciesInCourseRequest(coreCompetencyCountCompetenciesInCourseRequest).Execute()

List the competencies in a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInCourseRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInCourseRequest(int32(123)) // CoreCompetencyCountCompetenciesInCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCompetenciesInCourse(context.Background()).CoreCompetencyCountCompetenciesInCourseRequest(coreCompetencyCountCompetenciesInCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCompetenciesInCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCompetenciesInCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCompetenciesInCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCompetenciesInCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInCourseRequest** | [**CoreCompetencyCountCompetenciesInCourseRequest**](CoreCompetencyCountCompetenciesInCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCompetenciesInTemplate

> map[string]interface{} CoreCompetencyCountCompetenciesInTemplate(ctx).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()

Count a list of a competencies for a given template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInTemplateRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInTemplateRequest(int32(123)) // CoreCompetencyCountCompetenciesInTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCompetenciesInTemplate(context.Background()).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCompetenciesInTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCompetenciesInTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCompetenciesInTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCompetenciesInTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInTemplateRequest** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCompetencyFrameworks

> map[string]interface{} CoreCompetencyCountCompetencyFrameworks(ctx).CoreCompetencyCountCompetencyFrameworksRequest(coreCompetencyCountCompetencyFrameworksRequest).Execute()

Count a list of a competency frameworks.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetencyFrameworksRequest := *openapiclient.NewCoreCompetencyCountCompetencyFrameworksRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // CoreCompetencyCountCompetencyFrameworksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCompetencyFrameworks(context.Background()).CoreCompetencyCountCompetencyFrameworksRequest(coreCompetencyCountCompetencyFrameworksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCompetencyFrameworks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCompetencyFrameworks`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCompetencyFrameworks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCompetencyFrameworksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetencyFrameworksRequest** | [**CoreCompetencyCountCompetencyFrameworksRequest**](CoreCompetencyCountCompetencyFrameworksRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCourseModuleCompetencies

> map[string]interface{} CoreCompetencyCountCourseModuleCompetencies(ctx).CoreCompetencyCountCourseModuleCompetenciesRequest(coreCompetencyCountCourseModuleCompetenciesRequest).Execute()

Count the competencies in a course module



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCourseModuleCompetenciesRequest := *openapiclient.NewCoreCompetencyCountCourseModuleCompetenciesRequest(int32(123)) // CoreCompetencyCountCourseModuleCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCourseModuleCompetencies(context.Background()).CoreCompetencyCountCourseModuleCompetenciesRequest(coreCompetencyCountCourseModuleCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCourseModuleCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCourseModuleCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCourseModuleCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCourseModuleCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCourseModuleCompetenciesRequest** | [**CoreCompetencyCountCourseModuleCompetenciesRequest**](CoreCompetencyCountCourseModuleCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountCoursesUsingCompetency

> map[string]interface{} CoreCompetencyCountCoursesUsingCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

List the courses using a competency



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountCoursesUsingCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountCoursesUsingCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountCoursesUsingCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountCoursesUsingCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountCoursesUsingCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountTemplates

> map[string]interface{} CoreCompetencyCountTemplates(ctx).CoreCompetencyCountCompetencyFrameworksRequest(coreCompetencyCountCompetencyFrameworksRequest).Execute()

Count a list of a learning plan templates.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetencyFrameworksRequest := *openapiclient.NewCoreCompetencyCountCompetencyFrameworksRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // CoreCompetencyCountCompetencyFrameworksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountTemplates(context.Background()).CoreCompetencyCountCompetencyFrameworksRequest(coreCompetencyCountCompetencyFrameworksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountTemplates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountTemplates`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountTemplates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountTemplatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetencyFrameworksRequest** | [**CoreCompetencyCountCompetencyFrameworksRequest**](CoreCompetencyCountCompetencyFrameworksRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCountTemplatesUsingCompetency

> map[string]interface{} CoreCompetencyCountTemplatesUsingCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

Count a list of a learning plan templates for a given competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCountTemplatesUsingCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCountTemplatesUsingCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCountTemplatesUsingCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCountTemplatesUsingCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCountTemplatesUsingCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCreateCompetency

> CoreCompetencyCreateCompetency200Response CoreCompetencyCreateCompetency(ctx).CoreCompetencyCreateCompetencyRequest(coreCompetencyCreateCompetencyRequest).Execute()

Creates new competencies.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCreateCompetencyRequest := *openapiclient.NewCoreCompetencyCreateCompetencyRequest(*openapiclient.NewCoreCompetencyCreateCompetencyRequestCompetency("Idnumber_example", "Shortname_example")) // CoreCompetencyCreateCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCreateCompetency(context.Background()).CoreCompetencyCreateCompetencyRequest(coreCompetencyCreateCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCreateCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCreateCompetency`: CoreCompetencyCreateCompetency200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCreateCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCreateCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCreateCompetencyRequest** | [**CoreCompetencyCreateCompetencyRequest**](CoreCompetencyCreateCompetencyRequest.md) |  | 

### Return type

[**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCreateCompetencyFramework

> CoreCompetencyCreateCompetencyFramework200Response CoreCompetencyCreateCompetencyFramework(ctx).CoreCompetencyCreateCompetencyFrameworkRequest(coreCompetencyCreateCompetencyFrameworkRequest).Execute()

Creates new competency frameworks.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCreateCompetencyFrameworkRequest := *openapiclient.NewCoreCompetencyCreateCompetencyFrameworkRequest(*openapiclient.NewCoreCompetencyCreateCompetencyFrameworkRequestCompetencyframework("Idnumber_example", "Scaleconfiguration_example", int32(123), "Shortname_example")) // CoreCompetencyCreateCompetencyFrameworkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCreateCompetencyFramework(context.Background()).CoreCompetencyCreateCompetencyFrameworkRequest(coreCompetencyCreateCompetencyFrameworkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCreateCompetencyFramework``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCreateCompetencyFramework`: CoreCompetencyCreateCompetencyFramework200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCreateCompetencyFramework`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCreateCompetencyFrameworkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCreateCompetencyFrameworkRequest** | [**CoreCompetencyCreateCompetencyFrameworkRequest**](CoreCompetencyCreateCompetencyFrameworkRequest.md) |  | 

### Return type

[**CoreCompetencyCreateCompetencyFramework200Response**](CoreCompetencyCreateCompetencyFramework200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCreatePlan

> CoreCompetencyCreatePlan200Response CoreCompetencyCreatePlan(ctx).CoreCompetencyCreatePlanRequest(coreCompetencyCreatePlanRequest).Execute()

Creates a learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCreatePlanRequest := *openapiclient.NewCoreCompetencyCreatePlanRequest(*openapiclient.NewCoreCompetencyCreatePlanRequestPlan("Name_example", int32(123))) // CoreCompetencyCreatePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCreatePlan(context.Background()).CoreCompetencyCreatePlanRequest(coreCompetencyCreatePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCreatePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCreatePlan`: CoreCompetencyCreatePlan200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCreatePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCreatePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCreatePlanRequest** | [**CoreCompetencyCreatePlanRequest**](CoreCompetencyCreatePlanRequest.md) |  | 

### Return type

[**CoreCompetencyCreatePlan200Response**](CoreCompetencyCreatePlan200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCreateTemplate

> CoreCompetencyCreateTemplate200Response CoreCompetencyCreateTemplate(ctx).CoreCompetencyCreateTemplateRequest(coreCompetencyCreateTemplateRequest).Execute()

Creates new learning plan templates.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCreateTemplateRequest := *openapiclient.NewCoreCompetencyCreateTemplateRequest(*openapiclient.NewCoreCompetencyCreateTemplateRequestTemplate("Shortname_example")) // CoreCompetencyCreateTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCreateTemplate(context.Background()).CoreCompetencyCreateTemplateRequest(coreCompetencyCreateTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCreateTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCreateTemplate`: CoreCompetencyCreateTemplate200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCreateTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCreateTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCreateTemplateRequest** | [**CoreCompetencyCreateTemplateRequest**](CoreCompetencyCreateTemplateRequest.md) |  | 

### Return type

[**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyCreateUserEvidenceCompetency

> CoreCompetencyCreateUserEvidenceCompetency200Response CoreCompetencyCreateUserEvidenceCompetency(ctx).CoreCompetencyCreateUserEvidenceCompetencyRequest(coreCompetencyCreateUserEvidenceCompetencyRequest).Execute()

Create an evidence of prior learning relationship with a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCreateUserEvidenceCompetencyRequest := *openapiclient.NewCoreCompetencyCreateUserEvidenceCompetencyRequest(int32(123), int32(123)) // CoreCompetencyCreateUserEvidenceCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyCreateUserEvidenceCompetency(context.Background()).CoreCompetencyCreateUserEvidenceCompetencyRequest(coreCompetencyCreateUserEvidenceCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyCreateUserEvidenceCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyCreateUserEvidenceCompetency`: CoreCompetencyCreateUserEvidenceCompetency200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyCreateUserEvidenceCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyCreateUserEvidenceCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCreateUserEvidenceCompetencyRequest** | [**CoreCompetencyCreateUserEvidenceCompetencyRequest**](CoreCompetencyCreateUserEvidenceCompetencyRequest.md) |  | 

### Return type

[**CoreCompetencyCreateUserEvidenceCompetency200Response**](CoreCompetencyCreateUserEvidenceCompetency200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteCompetency

> map[string]interface{} CoreCompetencyDeleteCompetency(ctx).CoreCompetencyDeleteCompetencyRequest(coreCompetencyDeleteCompetencyRequest).Execute()

Delete a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteCompetencyRequest := *openapiclient.NewCoreCompetencyDeleteCompetencyRequest(int32(123)) // CoreCompetencyDeleteCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteCompetency(context.Background()).CoreCompetencyDeleteCompetencyRequest(coreCompetencyDeleteCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteCompetencyRequest** | [**CoreCompetencyDeleteCompetencyRequest**](CoreCompetencyDeleteCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteCompetencyFramework

> map[string]interface{} CoreCompetencyDeleteCompetencyFramework(ctx).CoreCompetencyDeleteCompetencyFrameworkRequest(coreCompetencyDeleteCompetencyFrameworkRequest).Execute()

Delete a competency framework.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteCompetencyFrameworkRequest := *openapiclient.NewCoreCompetencyDeleteCompetencyFrameworkRequest(int32(123)) // CoreCompetencyDeleteCompetencyFrameworkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteCompetencyFramework(context.Background()).CoreCompetencyDeleteCompetencyFrameworkRequest(coreCompetencyDeleteCompetencyFrameworkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteCompetencyFramework``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteCompetencyFramework`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteCompetencyFramework`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteCompetencyFrameworkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteCompetencyFrameworkRequest** | [**CoreCompetencyDeleteCompetencyFrameworkRequest**](CoreCompetencyDeleteCompetencyFrameworkRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteEvidence

> map[string]interface{} CoreCompetencyDeleteEvidence(ctx).CoreCompetencyDeleteEvidenceRequest(coreCompetencyDeleteEvidenceRequest).Execute()

Delete an evidence



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteEvidenceRequest := *openapiclient.NewCoreCompetencyDeleteEvidenceRequest(int32(123)) // CoreCompetencyDeleteEvidenceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteEvidence(context.Background()).CoreCompetencyDeleteEvidenceRequest(coreCompetencyDeleteEvidenceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteEvidence``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteEvidence`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteEvidence`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteEvidenceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteEvidenceRequest** | [**CoreCompetencyDeleteEvidenceRequest**](CoreCompetencyDeleteEvidenceRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeletePlan

> map[string]interface{} CoreCompetencyDeletePlan(ctx).CoreCompetencyDeletePlanRequest(coreCompetencyDeletePlanRequest).Execute()

Delete a learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeletePlanRequest := *openapiclient.NewCoreCompetencyDeletePlanRequest(int32(123)) // CoreCompetencyDeletePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeletePlan(context.Background()).CoreCompetencyDeletePlanRequest(coreCompetencyDeletePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeletePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeletePlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeletePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeletePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeletePlanRequest** | [**CoreCompetencyDeletePlanRequest**](CoreCompetencyDeletePlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteTemplate

> map[string]interface{} CoreCompetencyDeleteTemplate(ctx).CoreCompetencyDeleteTemplateRequest(coreCompetencyDeleteTemplateRequest).Execute()

Delete a learning plan template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteTemplateRequest := *openapiclient.NewCoreCompetencyDeleteTemplateRequest(false, int32(123)) // CoreCompetencyDeleteTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteTemplate(context.Background()).CoreCompetencyDeleteTemplateRequest(coreCompetencyDeleteTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteTemplateRequest** | [**CoreCompetencyDeleteTemplateRequest**](CoreCompetencyDeleteTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteUserEvidence

> map[string]interface{} CoreCompetencyDeleteUserEvidence(ctx).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()

Delete an evidence of prior learning.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteUserEvidenceRequest := *openapiclient.NewCoreCompetencyDeleteUserEvidenceRequest(int32(123)) // CoreCompetencyDeleteUserEvidenceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteUserEvidence(context.Background()).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteUserEvidence``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteUserEvidence`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteUserEvidence`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteUserEvidenceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteUserEvidenceRequest** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDeleteUserEvidenceCompetency

> map[string]interface{} CoreCompetencyDeleteUserEvidenceCompetency(ctx).CoreCompetencyDeleteUserEvidenceCompetencyRequest(coreCompetencyDeleteUserEvidenceCompetencyRequest).Execute()

Delete an evidence of prior learning relationship with a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteUserEvidenceCompetencyRequest := *openapiclient.NewCoreCompetencyDeleteUserEvidenceCompetencyRequest(int32(123), int32(123)) // CoreCompetencyDeleteUserEvidenceCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDeleteUserEvidenceCompetency(context.Background()).CoreCompetencyDeleteUserEvidenceCompetencyRequest(coreCompetencyDeleteUserEvidenceCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDeleteUserEvidenceCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDeleteUserEvidenceCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDeleteUserEvidenceCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDeleteUserEvidenceCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteUserEvidenceCompetencyRequest** | [**CoreCompetencyDeleteUserEvidenceCompetencyRequest**](CoreCompetencyDeleteUserEvidenceCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDuplicateCompetencyFramework

> CoreCompetencyDuplicateCompetencyFramework200Response CoreCompetencyDuplicateCompetencyFramework(ctx).CoreCompetencyDuplicateCompetencyFrameworkRequest(coreCompetencyDuplicateCompetencyFrameworkRequest).Execute()

Duplicate a competency framework.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDuplicateCompetencyFrameworkRequest := *openapiclient.NewCoreCompetencyDuplicateCompetencyFrameworkRequest(int32(123)) // CoreCompetencyDuplicateCompetencyFrameworkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDuplicateCompetencyFramework(context.Background()).CoreCompetencyDuplicateCompetencyFrameworkRequest(coreCompetencyDuplicateCompetencyFrameworkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDuplicateCompetencyFramework``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDuplicateCompetencyFramework`: CoreCompetencyDuplicateCompetencyFramework200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDuplicateCompetencyFramework`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDuplicateCompetencyFrameworkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDuplicateCompetencyFrameworkRequest** | [**CoreCompetencyDuplicateCompetencyFrameworkRequest**](CoreCompetencyDuplicateCompetencyFrameworkRequest.md) |  | 

### Return type

[**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyDuplicateTemplate

> CoreCompetencyCreateTemplate200Response CoreCompetencyDuplicateTemplate(ctx).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()

Duplicate learning plan template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInTemplateRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInTemplateRequest(int32(123)) // CoreCompetencyCountCompetenciesInTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyDuplicateTemplate(context.Background()).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyDuplicateTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyDuplicateTemplate`: CoreCompetencyCreateTemplate200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyDuplicateTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyDuplicateTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInTemplateRequest** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | 

### Return type

[**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyGetScaleValues

> map[string]interface{} CoreCompetencyGetScaleValues(ctx).CoreCompetencyGetScaleValuesRequest(coreCompetencyGetScaleValuesRequest).Execute()

Fetch the values for a specific scale



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyGetScaleValuesRequest := *openapiclient.NewCoreCompetencyGetScaleValuesRequest(int32(123)) // CoreCompetencyGetScaleValuesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyGetScaleValues(context.Background()).CoreCompetencyGetScaleValuesRequest(coreCompetencyGetScaleValuesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyGetScaleValues``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyGetScaleValues`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyGetScaleValues`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyGetScaleValuesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyGetScaleValuesRequest** | [**CoreCompetencyGetScaleValuesRequest**](CoreCompetencyGetScaleValuesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyGradeCompetency

> CoreCompetencyGradeCompetency200Response CoreCompetencyGradeCompetency(ctx).CoreCompetencyGradeCompetencyRequest(coreCompetencyGradeCompetencyRequest).Execute()

Grade a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyGradeCompetencyRequest := *openapiclient.NewCoreCompetencyGradeCompetencyRequest(int32(123), int32(123), int32(123)) // CoreCompetencyGradeCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyGradeCompetency(context.Background()).CoreCompetencyGradeCompetencyRequest(coreCompetencyGradeCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyGradeCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyGradeCompetency`: CoreCompetencyGradeCompetency200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyGradeCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyGradeCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyGradeCompetencyRequest** | [**CoreCompetencyGradeCompetencyRequest**](CoreCompetencyGradeCompetencyRequest.md) |  | 

### Return type

[**CoreCompetencyGradeCompetency200Response**](CoreCompetencyGradeCompetency200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyGradeCompetencyInCourse

> CoreCompetencyGradeCompetencyInCourse200Response CoreCompetencyGradeCompetencyInCourse(ctx).CoreCompetencyGradeCompetencyInCourseRequest(coreCompetencyGradeCompetencyInCourseRequest).Execute()

Grade a competency from the course page.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyGradeCompetencyInCourseRequest := *openapiclient.NewCoreCompetencyGradeCompetencyInCourseRequest(int32(123), int32(123), int32(123), int32(123)) // CoreCompetencyGradeCompetencyInCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyGradeCompetencyInCourse(context.Background()).CoreCompetencyGradeCompetencyInCourseRequest(coreCompetencyGradeCompetencyInCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyGradeCompetencyInCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyGradeCompetencyInCourse`: CoreCompetencyGradeCompetencyInCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyGradeCompetencyInCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyGradeCompetencyInCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyGradeCompetencyInCourseRequest** | [**CoreCompetencyGradeCompetencyInCourseRequest**](CoreCompetencyGradeCompetencyInCourseRequest.md) |  | 

### Return type

[**CoreCompetencyGradeCompetencyInCourse200Response**](CoreCompetencyGradeCompetencyInCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyGradeCompetencyInPlan

> CoreCompetencyGradeCompetencyInCourse200Response CoreCompetencyGradeCompetencyInPlan(ctx).CoreCompetencyGradeCompetencyInPlanRequest(coreCompetencyGradeCompetencyInPlanRequest).Execute()

Grade a competency from the user plan page.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyGradeCompetencyInPlanRequest := *openapiclient.NewCoreCompetencyGradeCompetencyInPlanRequest(int32(123), int32(123), int32(123)) // CoreCompetencyGradeCompetencyInPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyGradeCompetencyInPlan(context.Background()).CoreCompetencyGradeCompetencyInPlanRequest(coreCompetencyGradeCompetencyInPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyGradeCompetencyInPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyGradeCompetencyInPlan`: CoreCompetencyGradeCompetencyInCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyGradeCompetencyInPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyGradeCompetencyInPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyGradeCompetencyInPlanRequest** | [**CoreCompetencyGradeCompetencyInPlanRequest**](CoreCompetencyGradeCompetencyInPlanRequest.md) |  | 

### Return type

[**CoreCompetencyGradeCompetencyInCourse200Response**](CoreCompetencyGradeCompetencyInCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListCompetencies

> map[string]interface{} CoreCompetencyListCompetencies(ctx).CoreCompetencyListCompetenciesRequest(coreCompetencyListCompetenciesRequest).Execute()

Load a list of a competencies.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListCompetenciesRequest := *openapiclient.NewCoreCompetencyListCompetenciesRequest([]openapiclient.CoreCompetencyListCompetenciesRequestFiltersInner{*openapiclient.NewCoreCompetencyListCompetenciesRequestFiltersInner()}) // CoreCompetencyListCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListCompetencies(context.Background()).CoreCompetencyListCompetenciesRequest(coreCompetencyListCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListCompetenciesRequest** | [**CoreCompetencyListCompetenciesRequest**](CoreCompetencyListCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListCompetenciesInTemplate

> map[string]interface{} CoreCompetencyListCompetenciesInTemplate(ctx).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()

Load a list of a competencies for a given template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInTemplateRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInTemplateRequest(int32(123)) // CoreCompetencyCountCompetenciesInTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListCompetenciesInTemplate(context.Background()).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListCompetenciesInTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListCompetenciesInTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListCompetenciesInTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListCompetenciesInTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInTemplateRequest** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListCompetencyFrameworks

> map[string]interface{} CoreCompetencyListCompetencyFrameworks(ctx).CoreCompetencyListCompetencyFrameworksRequest(coreCompetencyListCompetencyFrameworksRequest).Execute()

Load a list of a competency frameworks.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListCompetencyFrameworksRequest := *openapiclient.NewCoreCompetencyListCompetencyFrameworksRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // CoreCompetencyListCompetencyFrameworksRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListCompetencyFrameworks(context.Background()).CoreCompetencyListCompetencyFrameworksRequest(coreCompetencyListCompetencyFrameworksRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListCompetencyFrameworks``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListCompetencyFrameworks`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListCompetencyFrameworks`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListCompetencyFrameworksRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListCompetencyFrameworksRequest** | [**CoreCompetencyListCompetencyFrameworksRequest**](CoreCompetencyListCompetencyFrameworksRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListCourseCompetencies

> map[string]interface{} CoreCompetencyListCourseCompetencies(ctx).CoreCompetencyCountCompetenciesInCourseRequest(coreCompetencyCountCompetenciesInCourseRequest).Execute()

List the competencies in a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInCourseRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInCourseRequest(int32(123)) // CoreCompetencyCountCompetenciesInCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListCourseCompetencies(context.Background()).CoreCompetencyCountCompetenciesInCourseRequest(coreCompetencyCountCompetenciesInCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListCourseCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListCourseCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListCourseCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListCourseCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInCourseRequest** | [**CoreCompetencyCountCompetenciesInCourseRequest**](CoreCompetencyCountCompetenciesInCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListCourseModuleCompetencies

> map[string]interface{} CoreCompetencyListCourseModuleCompetencies(ctx).CoreCompetencyListCourseModuleCompetenciesRequest(coreCompetencyListCourseModuleCompetenciesRequest).Execute()

List the competencies in a course module



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListCourseModuleCompetenciesRequest := *openapiclient.NewCoreCompetencyListCourseModuleCompetenciesRequest(int32(123)) // CoreCompetencyListCourseModuleCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListCourseModuleCompetencies(context.Background()).CoreCompetencyListCourseModuleCompetenciesRequest(coreCompetencyListCourseModuleCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListCourseModuleCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListCourseModuleCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListCourseModuleCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListCourseModuleCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListCourseModuleCompetenciesRequest** | [**CoreCompetencyListCourseModuleCompetenciesRequest**](CoreCompetencyListCourseModuleCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListPlanCompetencies

> map[string]interface{} CoreCompetencyListPlanCompetencies(ctx).CoreCompetencyListPlanCompetenciesRequest(coreCompetencyListPlanCompetenciesRequest).Execute()

List the competencies in a plan



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListPlanCompetenciesRequest := *openapiclient.NewCoreCompetencyListPlanCompetenciesRequest(int32(123)) // CoreCompetencyListPlanCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListPlanCompetencies(context.Background()).CoreCompetencyListPlanCompetenciesRequest(coreCompetencyListPlanCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListPlanCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListPlanCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListPlanCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListPlanCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListPlanCompetenciesRequest** | [**CoreCompetencyListPlanCompetenciesRequest**](CoreCompetencyListPlanCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListTemplates

> map[string]interface{} CoreCompetencyListTemplates(ctx).CoreCompetencyListTemplatesRequest(coreCompetencyListTemplatesRequest).Execute()

Load a list of a learning plan templates.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListTemplatesRequest := *openapiclient.NewCoreCompetencyListTemplatesRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext()) // CoreCompetencyListTemplatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListTemplates(context.Background()).CoreCompetencyListTemplatesRequest(coreCompetencyListTemplatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListTemplates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListTemplates`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListTemplates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListTemplatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListTemplatesRequest** | [**CoreCompetencyListTemplatesRequest**](CoreCompetencyListTemplatesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListTemplatesUsingCompetency

> map[string]interface{} CoreCompetencyListTemplatesUsingCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

Load a list of a learning plan templates for a given competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListTemplatesUsingCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListTemplatesUsingCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListTemplatesUsingCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListTemplatesUsingCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListTemplatesUsingCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyListUserPlans

> map[string]interface{} CoreCompetencyListUserPlans(ctx).CoreCompetencyListUserPlansRequest(coreCompetencyListUserPlansRequest).Execute()

List a user's learning plans.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListUserPlansRequest := *openapiclient.NewCoreCompetencyListUserPlansRequest(int32(123)) // CoreCompetencyListUserPlansRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyListUserPlans(context.Background()).CoreCompetencyListUserPlansRequest(coreCompetencyListUserPlansRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyListUserPlans``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyListUserPlans`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyListUserPlans`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyListUserPlansRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListUserPlansRequest** | [**CoreCompetencyListUserPlansRequest**](CoreCompetencyListUserPlansRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyMoveDownCompetency

> map[string]interface{} CoreCompetencyMoveDownCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

Re-order a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyMoveDownCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyMoveDownCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyMoveDownCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyMoveDownCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyMoveDownCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyMoveUpCompetency

> map[string]interface{} CoreCompetencyMoveUpCompetency(ctx).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()

Re-order a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompetencyViewedRequest := *openapiclient.NewCoreCompetencyCompetencyViewedRequest(int32(123)) // CoreCompetencyCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyMoveUpCompetency(context.Background()).CoreCompetencyCompetencyViewedRequest(coreCompetencyCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyMoveUpCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyMoveUpCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyMoveUpCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyMoveUpCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompetencyViewedRequest** | [**CoreCompetencyCompetencyViewedRequest**](CoreCompetencyCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyPlanCancelReviewRequest

> map[string]interface{} CoreCompetencyPlanCancelReviewRequest(ctx).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()

Cancel the review of a plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyPlanCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyPlanCancelReviewRequestRequest(int32(123)) // CoreCompetencyPlanCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyPlanCancelReviewRequest(context.Background()).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyPlanCancelReviewRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyPlanCancelReviewRequest`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyPlanCancelReviewRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyPlanCancelReviewRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyPlanCancelReviewRequestRequest** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyPlanRequestReview

> map[string]interface{} CoreCompetencyPlanRequestReview(ctx).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()

Request for a plan to be reviewed.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyPlanCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyPlanCancelReviewRequestRequest(int32(123)) // CoreCompetencyPlanCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyPlanRequestReview(context.Background()).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyPlanRequestReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyPlanRequestReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyPlanRequestReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyPlanRequestReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyPlanCancelReviewRequestRequest** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyPlanStartReview

> map[string]interface{} CoreCompetencyPlanStartReview(ctx).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()

Start the review of a plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyPlanCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyPlanCancelReviewRequestRequest(int32(123)) // CoreCompetencyPlanCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyPlanStartReview(context.Background()).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyPlanStartReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyPlanStartReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyPlanStartReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyPlanStartReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyPlanCancelReviewRequestRequest** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyPlanStopReview

> map[string]interface{} CoreCompetencyPlanStopReview(ctx).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()

Stop the review of a plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyPlanCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyPlanCancelReviewRequestRequest(int32(123)) // CoreCompetencyPlanCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyPlanStopReview(context.Background()).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyPlanStopReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyPlanStopReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyPlanStopReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyPlanStopReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyPlanCancelReviewRequestRequest** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReadCompetency

> CoreCompetencyCreateCompetency200Response CoreCompetencyReadCompetency(ctx).CoreCompetencyReadCompetencyRequest(coreCompetencyReadCompetencyRequest).Execute()

Load a summary of a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReadCompetencyRequest := *openapiclient.NewCoreCompetencyReadCompetencyRequest(int32(123)) // CoreCompetencyReadCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReadCompetency(context.Background()).CoreCompetencyReadCompetencyRequest(coreCompetencyReadCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReadCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReadCompetency`: CoreCompetencyCreateCompetency200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReadCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReadCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReadCompetencyRequest** | [**CoreCompetencyReadCompetencyRequest**](CoreCompetencyReadCompetencyRequest.md) |  | 

### Return type

[**CoreCompetencyCreateCompetency200Response**](CoreCompetencyCreateCompetency200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReadCompetencyFramework

> CoreCompetencyDuplicateCompetencyFramework200Response CoreCompetencyReadCompetencyFramework(ctx).CoreCompetencyDuplicateCompetencyFrameworkRequest(coreCompetencyDuplicateCompetencyFrameworkRequest).Execute()

Load a summary of a competency framework.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDuplicateCompetencyFrameworkRequest := *openapiclient.NewCoreCompetencyDuplicateCompetencyFrameworkRequest(int32(123)) // CoreCompetencyDuplicateCompetencyFrameworkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReadCompetencyFramework(context.Background()).CoreCompetencyDuplicateCompetencyFrameworkRequest(coreCompetencyDuplicateCompetencyFrameworkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReadCompetencyFramework``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReadCompetencyFramework`: CoreCompetencyDuplicateCompetencyFramework200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReadCompetencyFramework`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReadCompetencyFrameworkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDuplicateCompetencyFrameworkRequest** | [**CoreCompetencyDuplicateCompetencyFrameworkRequest**](CoreCompetencyDuplicateCompetencyFrameworkRequest.md) |  | 

### Return type

[**CoreCompetencyDuplicateCompetencyFramework200Response**](CoreCompetencyDuplicateCompetencyFramework200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReadPlan

> CoreCompetencyReadPlan200Response CoreCompetencyReadPlan(ctx).CoreCompetencyReadPlanRequest(coreCompetencyReadPlanRequest).Execute()

Load a learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReadPlanRequest := *openapiclient.NewCoreCompetencyReadPlanRequest(int32(123)) // CoreCompetencyReadPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReadPlan(context.Background()).CoreCompetencyReadPlanRequest(coreCompetencyReadPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReadPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReadPlan`: CoreCompetencyReadPlan200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReadPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReadPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReadPlanRequest** | [**CoreCompetencyReadPlanRequest**](CoreCompetencyReadPlanRequest.md) |  | 

### Return type

[**CoreCompetencyReadPlan200Response**](CoreCompetencyReadPlan200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReadTemplate

> CoreCompetencyCreateTemplate200Response CoreCompetencyReadTemplate(ctx).CoreCompetencyReadTemplateRequest(coreCompetencyReadTemplateRequest).Execute()

Load a summary of a learning plan template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReadTemplateRequest := *openapiclient.NewCoreCompetencyReadTemplateRequest(int32(123)) // CoreCompetencyReadTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReadTemplate(context.Background()).CoreCompetencyReadTemplateRequest(coreCompetencyReadTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReadTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReadTemplate`: CoreCompetencyCreateTemplate200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReadTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReadTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReadTemplateRequest** | [**CoreCompetencyReadTemplateRequest**](CoreCompetencyReadTemplateRequest.md) |  | 

### Return type

[**CoreCompetencyCreateTemplate200Response**](CoreCompetencyCreateTemplate200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReadUserEvidence

> CoreCompetencyReadUserEvidence200Response CoreCompetencyReadUserEvidence(ctx).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()

Read an evidence of prior learning.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteUserEvidenceRequest := *openapiclient.NewCoreCompetencyDeleteUserEvidenceRequest(int32(123)) // CoreCompetencyDeleteUserEvidenceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReadUserEvidence(context.Background()).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReadUserEvidence``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReadUserEvidence`: CoreCompetencyReadUserEvidence200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReadUserEvidence`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReadUserEvidenceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteUserEvidenceRequest** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | 

### Return type

[**CoreCompetencyReadUserEvidence200Response**](CoreCompetencyReadUserEvidence200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyRemoveCompetencyFromCourse

> map[string]interface{} CoreCompetencyRemoveCompetencyFromCourse(ctx).CoreCompetencyRemoveCompetencyFromCourseRequest(coreCompetencyRemoveCompetencyFromCourseRequest).Execute()

Remove a competency from a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyRemoveCompetencyFromCourseRequest := *openapiclient.NewCoreCompetencyRemoveCompetencyFromCourseRequest(int32(123), int32(123)) // CoreCompetencyRemoveCompetencyFromCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyRemoveCompetencyFromCourse(context.Background()).CoreCompetencyRemoveCompetencyFromCourseRequest(coreCompetencyRemoveCompetencyFromCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyRemoveCompetencyFromCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyRemoveCompetencyFromCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyRemoveCompetencyFromCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyRemoveCompetencyFromCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyRemoveCompetencyFromCourseRequest** | [**CoreCompetencyRemoveCompetencyFromCourseRequest**](CoreCompetencyRemoveCompetencyFromCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyRemoveCompetencyFromPlan

> map[string]interface{} CoreCompetencyRemoveCompetencyFromPlan(ctx).CoreCompetencyRemoveCompetencyFromPlanRequest(coreCompetencyRemoveCompetencyFromPlanRequest).Execute()

Remove the competency from a learning plan



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyRemoveCompetencyFromPlanRequest := *openapiclient.NewCoreCompetencyRemoveCompetencyFromPlanRequest(int32(123), int32(123)) // CoreCompetencyRemoveCompetencyFromPlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyRemoveCompetencyFromPlan(context.Background()).CoreCompetencyRemoveCompetencyFromPlanRequest(coreCompetencyRemoveCompetencyFromPlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyRemoveCompetencyFromPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyRemoveCompetencyFromPlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyRemoveCompetencyFromPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyRemoveCompetencyFromPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyRemoveCompetencyFromPlanRequest** | [**CoreCompetencyRemoveCompetencyFromPlanRequest**](CoreCompetencyRemoveCompetencyFromPlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyRemoveCompetencyFromTemplate

> map[string]interface{} CoreCompetencyRemoveCompetencyFromTemplate(ctx).CoreCompetencyRemoveCompetencyFromTemplateRequest(coreCompetencyRemoveCompetencyFromTemplateRequest).Execute()

Remove a competency from a template



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyRemoveCompetencyFromTemplateRequest := *openapiclient.NewCoreCompetencyRemoveCompetencyFromTemplateRequest(int32(123), int32(123)) // CoreCompetencyRemoveCompetencyFromTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyRemoveCompetencyFromTemplate(context.Background()).CoreCompetencyRemoveCompetencyFromTemplateRequest(coreCompetencyRemoveCompetencyFromTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyRemoveCompetencyFromTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyRemoveCompetencyFromTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyRemoveCompetencyFromTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyRemoveCompetencyFromTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyRemoveCompetencyFromTemplateRequest** | [**CoreCompetencyRemoveCompetencyFromTemplateRequest**](CoreCompetencyRemoveCompetencyFromTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyRemoveRelatedCompetency

> map[string]interface{} CoreCompetencyRemoveRelatedCompetency(ctx).CoreCompetencyRemoveRelatedCompetencyRequest(coreCompetencyRemoveRelatedCompetencyRequest).Execute()

Remove a related competency



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyRemoveRelatedCompetencyRequest := *openapiclient.NewCoreCompetencyRemoveRelatedCompetencyRequest(int32(123), int32(123)) // CoreCompetencyRemoveRelatedCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyRemoveRelatedCompetency(context.Background()).CoreCompetencyRemoveRelatedCompetencyRequest(coreCompetencyRemoveRelatedCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyRemoveRelatedCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyRemoveRelatedCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyRemoveRelatedCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyRemoveRelatedCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyRemoveRelatedCompetencyRequest** | [**CoreCompetencyRemoveRelatedCompetencyRequest**](CoreCompetencyRemoveRelatedCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReopenPlan

> map[string]interface{} CoreCompetencyReopenPlan(ctx).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()

Reopen learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCompletePlanRequest := *openapiclient.NewCoreCompetencyCompletePlanRequest(int32(123)) // CoreCompetencyCompletePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReopenPlan(context.Background()).CoreCompetencyCompletePlanRequest(coreCompetencyCompletePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReopenPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReopenPlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReopenPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReopenPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCompletePlanRequest** | [**CoreCompetencyCompletePlanRequest**](CoreCompetencyCompletePlanRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReorderCourseCompetency

> map[string]interface{} CoreCompetencyReorderCourseCompetency(ctx).CoreCompetencyReorderCourseCompetencyRequest(coreCompetencyReorderCourseCompetencyRequest).Execute()

Move a course competency to a new relative sort order.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReorderCourseCompetencyRequest := *openapiclient.NewCoreCompetencyReorderCourseCompetencyRequest(int32(123), int32(123), int32(123)) // CoreCompetencyReorderCourseCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReorderCourseCompetency(context.Background()).CoreCompetencyReorderCourseCompetencyRequest(coreCompetencyReorderCourseCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReorderCourseCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReorderCourseCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReorderCourseCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReorderCourseCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReorderCourseCompetencyRequest** | [**CoreCompetencyReorderCourseCompetencyRequest**](CoreCompetencyReorderCourseCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReorderPlanCompetency

> map[string]interface{} CoreCompetencyReorderPlanCompetency(ctx).CoreCompetencyReorderPlanCompetencyRequest(coreCompetencyReorderPlanCompetencyRequest).Execute()

Move a plan competency to a new relative sort order.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReorderPlanCompetencyRequest := *openapiclient.NewCoreCompetencyReorderPlanCompetencyRequest(int32(123), int32(123), int32(123)) // CoreCompetencyReorderPlanCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReorderPlanCompetency(context.Background()).CoreCompetencyReorderPlanCompetencyRequest(coreCompetencyReorderPlanCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReorderPlanCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReorderPlanCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReorderPlanCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReorderPlanCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReorderPlanCompetencyRequest** | [**CoreCompetencyReorderPlanCompetencyRequest**](CoreCompetencyReorderPlanCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyReorderTemplateCompetency

> map[string]interface{} CoreCompetencyReorderTemplateCompetency(ctx).CoreCompetencyReorderTemplateCompetencyRequest(coreCompetencyReorderTemplateCompetencyRequest).Execute()

Move a template competency to a new relative sort order.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReorderTemplateCompetencyRequest := *openapiclient.NewCoreCompetencyReorderTemplateCompetencyRequest(int32(123), int32(123), int32(123)) // CoreCompetencyReorderTemplateCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyReorderTemplateCompetency(context.Background()).CoreCompetencyReorderTemplateCompetencyRequest(coreCompetencyReorderTemplateCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyReorderTemplateCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyReorderTemplateCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyReorderTemplateCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyReorderTemplateCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReorderTemplateCompetencyRequest** | [**CoreCompetencyReorderTemplateCompetencyRequest**](CoreCompetencyReorderTemplateCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies

> map[string]interface{} CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies(ctx).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()

Send user evidence competencies in review



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyDeleteUserEvidenceRequest := *openapiclient.NewCoreCompetencyDeleteUserEvidenceRequest(int32(123)) // CoreCompetencyDeleteUserEvidenceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies(context.Background()).CoreCompetencyDeleteUserEvidenceRequest(coreCompetencyDeleteUserEvidenceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyRequestReviewOfUserEvidenceLinkedCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyRequestReviewOfUserEvidenceLinkedCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyDeleteUserEvidenceRequest** | [**CoreCompetencyDeleteUserEvidenceRequest**](CoreCompetencyDeleteUserEvidenceRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencySearchCompetencies

> map[string]interface{} CoreCompetencySearchCompetencies(ctx).CoreCompetencySearchCompetenciesRequest(coreCompetencySearchCompetenciesRequest).Execute()

Search a list of a competencies.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencySearchCompetenciesRequest := *openapiclient.NewCoreCompetencySearchCompetenciesRequest(int32(123), "Searchtext_example") // CoreCompetencySearchCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencySearchCompetencies(context.Background()).CoreCompetencySearchCompetenciesRequest(coreCompetencySearchCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencySearchCompetencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencySearchCompetencies`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencySearchCompetencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencySearchCompetenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencySearchCompetenciesRequest** | [**CoreCompetencySearchCompetenciesRequest**](CoreCompetencySearchCompetenciesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencySetCourseCompetencyRuleoutcome

> map[string]interface{} CoreCompetencySetCourseCompetencyRuleoutcome(ctx).CoreCompetencySetCourseCompetencyRuleoutcomeRequest(coreCompetencySetCourseCompetencyRuleoutcomeRequest).Execute()

Modify the ruleoutcome value for course competency



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencySetCourseCompetencyRuleoutcomeRequest := *openapiclient.NewCoreCompetencySetCourseCompetencyRuleoutcomeRequest(int32(123), int32(123)) // CoreCompetencySetCourseCompetencyRuleoutcomeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencySetCourseCompetencyRuleoutcome(context.Background()).CoreCompetencySetCourseCompetencyRuleoutcomeRequest(coreCompetencySetCourseCompetencyRuleoutcomeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencySetCourseCompetencyRuleoutcome``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencySetCourseCompetencyRuleoutcome`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencySetCourseCompetencyRuleoutcome`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencySetCourseCompetencyRuleoutcomeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencySetCourseCompetencyRuleoutcomeRequest** | [**CoreCompetencySetCourseCompetencyRuleoutcomeRequest**](CoreCompetencySetCourseCompetencyRuleoutcomeRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencySetParentCompetency

> map[string]interface{} CoreCompetencySetParentCompetency(ctx).CoreCompetencySetParentCompetencyRequest(coreCompetencySetParentCompetencyRequest).Execute()

Set a new parent for a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencySetParentCompetencyRequest := *openapiclient.NewCoreCompetencySetParentCompetencyRequest(int32(123), int32(123)) // CoreCompetencySetParentCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencySetParentCompetency(context.Background()).CoreCompetencySetParentCompetencyRequest(coreCompetencySetParentCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencySetParentCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencySetParentCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencySetParentCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencySetParentCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencySetParentCompetencyRequest** | [**CoreCompetencySetParentCompetencyRequest**](CoreCompetencySetParentCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyTemplateHasRelatedData

> map[string]interface{} CoreCompetencyTemplateHasRelatedData(ctx).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()

Check if a template has related data



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyCountCompetenciesInTemplateRequest := *openapiclient.NewCoreCompetencyCountCompetenciesInTemplateRequest(int32(123)) // CoreCompetencyCountCompetenciesInTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyTemplateHasRelatedData(context.Background()).CoreCompetencyCountCompetenciesInTemplateRequest(coreCompetencyCountCompetenciesInTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyTemplateHasRelatedData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyTemplateHasRelatedData`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyTemplateHasRelatedData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyTemplateHasRelatedDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyCountCompetenciesInTemplateRequest** | [**CoreCompetencyCountCompetenciesInTemplateRequest**](CoreCompetencyCountCompetenciesInTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyTemplateViewed

> map[string]interface{} CoreCompetencyTemplateViewed(ctx).CoreCompetencyReadTemplateRequest(coreCompetencyReadTemplateRequest).Execute()

Log event template viewed



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyReadTemplateRequest := *openapiclient.NewCoreCompetencyReadTemplateRequest(int32(123)) // CoreCompetencyReadTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyTemplateViewed(context.Background()).CoreCompetencyReadTemplateRequest(coreCompetencyReadTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyTemplateViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyTemplateViewed`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyTemplateViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyTemplateViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyReadTemplateRequest** | [**CoreCompetencyReadTemplateRequest**](CoreCompetencyReadTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUnapprovePlan

> map[string]interface{} CoreCompetencyUnapprovePlan(ctx).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()

Unapprove a plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyPlanCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyPlanCancelReviewRequestRequest(int32(123)) // CoreCompetencyPlanCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUnapprovePlan(context.Background()).CoreCompetencyPlanCancelReviewRequestRequest(coreCompetencyPlanCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUnapprovePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUnapprovePlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUnapprovePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUnapprovePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyPlanCancelReviewRequestRequest** | [**CoreCompetencyPlanCancelReviewRequestRequest**](CoreCompetencyPlanCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUnlinkPlanFromTemplate

> map[string]interface{} CoreCompetencyUnlinkPlanFromTemplate(ctx).CoreCompetencyUnlinkPlanFromTemplateRequest(coreCompetencyUnlinkPlanFromTemplateRequest).Execute()

Unlink a plan form it template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUnlinkPlanFromTemplateRequest := *openapiclient.NewCoreCompetencyUnlinkPlanFromTemplateRequest(int32(123)) // CoreCompetencyUnlinkPlanFromTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUnlinkPlanFromTemplate(context.Background()).CoreCompetencyUnlinkPlanFromTemplateRequest(coreCompetencyUnlinkPlanFromTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUnlinkPlanFromTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUnlinkPlanFromTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUnlinkPlanFromTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUnlinkPlanFromTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUnlinkPlanFromTemplateRequest** | [**CoreCompetencyUnlinkPlanFromTemplateRequest**](CoreCompetencyUnlinkPlanFromTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUpdateCompetency

> map[string]interface{} CoreCompetencyUpdateCompetency(ctx).CoreCompetencyUpdateCompetencyRequest(coreCompetencyUpdateCompetencyRequest).Execute()

Update a competency.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUpdateCompetencyRequest := *openapiclient.NewCoreCompetencyUpdateCompetencyRequest(*openapiclient.NewCoreCompetencyUpdateCompetencyRequestCompetency(int32(123))) // CoreCompetencyUpdateCompetencyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUpdateCompetency(context.Background()).CoreCompetencyUpdateCompetencyRequest(coreCompetencyUpdateCompetencyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUpdateCompetency``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUpdateCompetency`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUpdateCompetency`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUpdateCompetencyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUpdateCompetencyRequest** | [**CoreCompetencyUpdateCompetencyRequest**](CoreCompetencyUpdateCompetencyRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUpdateCompetencyFramework

> map[string]interface{} CoreCompetencyUpdateCompetencyFramework(ctx).CoreCompetencyUpdateCompetencyFrameworkRequest(coreCompetencyUpdateCompetencyFrameworkRequest).Execute()

Update a competency framework.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUpdateCompetencyFrameworkRequest := *openapiclient.NewCoreCompetencyUpdateCompetencyFrameworkRequest(*openapiclient.NewCoreCompetencyUpdateCompetencyFrameworkRequestCompetencyframework(int32(123))) // CoreCompetencyUpdateCompetencyFrameworkRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUpdateCompetencyFramework(context.Background()).CoreCompetencyUpdateCompetencyFrameworkRequest(coreCompetencyUpdateCompetencyFrameworkRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUpdateCompetencyFramework``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUpdateCompetencyFramework`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUpdateCompetencyFramework`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUpdateCompetencyFrameworkRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUpdateCompetencyFrameworkRequest** | [**CoreCompetencyUpdateCompetencyFrameworkRequest**](CoreCompetencyUpdateCompetencyFrameworkRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUpdateCourseCompetencySettings

> map[string]interface{} CoreCompetencyUpdateCourseCompetencySettings(ctx).CoreCompetencyUpdateCourseCompetencySettingsRequest(coreCompetencyUpdateCourseCompetencySettingsRequest).Execute()

Update the course competency settings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUpdateCourseCompetencySettingsRequest := *openapiclient.NewCoreCompetencyUpdateCourseCompetencySettingsRequest(int32(123), *openapiclient.NewCoreCompetencyUpdateCourseCompetencySettingsRequestSettings(false)) // CoreCompetencyUpdateCourseCompetencySettingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUpdateCourseCompetencySettings(context.Background()).CoreCompetencyUpdateCourseCompetencySettingsRequest(coreCompetencyUpdateCourseCompetencySettingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUpdateCourseCompetencySettings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUpdateCourseCompetencySettings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUpdateCourseCompetencySettings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUpdateCourseCompetencySettingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUpdateCourseCompetencySettingsRequest** | [**CoreCompetencyUpdateCourseCompetencySettingsRequest**](CoreCompetencyUpdateCourseCompetencySettingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUpdatePlan

> CoreCompetencyReadPlan200Response CoreCompetencyUpdatePlan(ctx).CoreCompetencyUpdatePlanRequest(coreCompetencyUpdatePlanRequest).Execute()

Updates a learning plan.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUpdatePlanRequest := *openapiclient.NewCoreCompetencyUpdatePlanRequest(*openapiclient.NewCoreCompetencyUpdatePlanRequestPlan(int32(123))) // CoreCompetencyUpdatePlanRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUpdatePlan(context.Background()).CoreCompetencyUpdatePlanRequest(coreCompetencyUpdatePlanRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUpdatePlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUpdatePlan`: CoreCompetencyReadPlan200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUpdatePlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUpdatePlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUpdatePlanRequest** | [**CoreCompetencyUpdatePlanRequest**](CoreCompetencyUpdatePlanRequest.md) |  | 

### Return type

[**CoreCompetencyReadPlan200Response**](CoreCompetencyReadPlan200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUpdateTemplate

> map[string]interface{} CoreCompetencyUpdateTemplate(ctx).CoreCompetencyUpdateTemplateRequest(coreCompetencyUpdateTemplateRequest).Execute()

Update a learning plan template.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUpdateTemplateRequest := *openapiclient.NewCoreCompetencyUpdateTemplateRequest(*openapiclient.NewCoreCompetencyUpdateTemplateRequestTemplate(int32(123))) // CoreCompetencyUpdateTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUpdateTemplate(context.Background()).CoreCompetencyUpdateTemplateRequest(coreCompetencyUpdateTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUpdateTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUpdateTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUpdateTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUpdateTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUpdateTemplateRequest** | [**CoreCompetencyUpdateTemplateRequest**](CoreCompetencyUpdateTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyCancelReviewRequest

> map[string]interface{} CoreCompetencyUserCompetencyCancelReviewRequest(ctx).CoreCompetencyUserCompetencyCancelReviewRequestRequest(coreCompetencyUserCompetencyCancelReviewRequestRequest).Execute()

Cancel a review request.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyCancelReviewRequestRequest := *openapiclient.NewCoreCompetencyUserCompetencyCancelReviewRequestRequest(int32(123), int32(123)) // CoreCompetencyUserCompetencyCancelReviewRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyCancelReviewRequest(context.Background()).CoreCompetencyUserCompetencyCancelReviewRequestRequest(coreCompetencyUserCompetencyCancelReviewRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyCancelReviewRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyCancelReviewRequest`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyCancelReviewRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyCancelReviewRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyCancelReviewRequestRequest** | [**CoreCompetencyUserCompetencyCancelReviewRequestRequest**](CoreCompetencyUserCompetencyCancelReviewRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyPlanViewed

> map[string]interface{} CoreCompetencyUserCompetencyPlanViewed(ctx).CoreCompetencyUserCompetencyPlanViewedRequest(coreCompetencyUserCompetencyPlanViewedRequest).Execute()

Log the user competency plan viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyPlanViewedRequest := *openapiclient.NewCoreCompetencyUserCompetencyPlanViewedRequest(int32(123), int32(123), int32(123)) // CoreCompetencyUserCompetencyPlanViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyPlanViewed(context.Background()).CoreCompetencyUserCompetencyPlanViewedRequest(coreCompetencyUserCompetencyPlanViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyPlanViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyPlanViewed`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyPlanViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyPlanViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyPlanViewedRequest** | [**CoreCompetencyUserCompetencyPlanViewedRequest**](CoreCompetencyUserCompetencyPlanViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyRequestReview

> map[string]interface{} CoreCompetencyUserCompetencyRequestReview(ctx).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()

Request a review.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyRequestReviewRequest := *openapiclient.NewCoreCompetencyUserCompetencyRequestReviewRequest(int32(123), int32(123)) // CoreCompetencyUserCompetencyRequestReviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyRequestReview(context.Background()).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyRequestReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyRequestReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyRequestReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyRequestReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyRequestReviewRequest** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyStartReview

> map[string]interface{} CoreCompetencyUserCompetencyStartReview(ctx).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()

Start a review.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyRequestReviewRequest := *openapiclient.NewCoreCompetencyUserCompetencyRequestReviewRequest(int32(123), int32(123)) // CoreCompetencyUserCompetencyRequestReviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyStartReview(context.Background()).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyStartReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyStartReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyStartReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyStartReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyRequestReviewRequest** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyStopReview

> map[string]interface{} CoreCompetencyUserCompetencyStopReview(ctx).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()

Stop a review.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyRequestReviewRequest := *openapiclient.NewCoreCompetencyUserCompetencyRequestReviewRequest(int32(123), int32(123)) // CoreCompetencyUserCompetencyRequestReviewRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyStopReview(context.Background()).CoreCompetencyUserCompetencyRequestReviewRequest(coreCompetencyUserCompetencyRequestReviewRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyStopReview``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyStopReview`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyStopReview`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyStopReviewRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyRequestReviewRequest** | [**CoreCompetencyUserCompetencyRequestReviewRequest**](CoreCompetencyUserCompetencyRequestReviewRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyViewed

> map[string]interface{} CoreCompetencyUserCompetencyViewed(ctx).CoreCompetencyUserCompetencyViewedRequest(coreCompetencyUserCompetencyViewedRequest).Execute()

Log the user competency viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyViewedRequest := *openapiclient.NewCoreCompetencyUserCompetencyViewedRequest(int32(123)) // CoreCompetencyUserCompetencyViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyViewed(context.Background()).CoreCompetencyUserCompetencyViewedRequest(coreCompetencyUserCompetencyViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyViewed``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyViewed`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyViewed`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyViewedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyViewedRequest** | [**CoreCompetencyUserCompetencyViewedRequest**](CoreCompetencyUserCompetencyViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyViewedInCourse

> map[string]interface{} CoreCompetencyUserCompetencyViewedInCourse(ctx).CoreCompetencyUserCompetencyViewedInCourseRequest(coreCompetencyUserCompetencyViewedInCourseRequest).Execute()

Log the user competency viewed in course event



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyViewedInCourseRequest := *openapiclient.NewCoreCompetencyUserCompetencyViewedInCourseRequest(int32(123), int32(123), int32(123)) // CoreCompetencyUserCompetencyViewedInCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyViewedInCourse(context.Background()).CoreCompetencyUserCompetencyViewedInCourseRequest(coreCompetencyUserCompetencyViewedInCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyViewedInCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyViewedInCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyViewedInCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyViewedInCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyViewedInCourseRequest** | [**CoreCompetencyUserCompetencyViewedInCourseRequest**](CoreCompetencyUserCompetencyViewedInCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompetencyUserCompetencyViewedInPlan

> map[string]interface{} CoreCompetencyUserCompetencyViewedInPlan(ctx).CoreCompetencyUserCompetencyPlanViewedRequest(coreCompetencyUserCompetencyPlanViewedRequest).Execute()

Log the user competency viewed in plan event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyUserCompetencyPlanViewedRequest := *openapiclient.NewCoreCompetencyUserCompetencyPlanViewedRequest(int32(123), int32(123), int32(123)) // CoreCompetencyUserCompetencyPlanViewedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompetencyUserCompetencyViewedInPlan(context.Background()).CoreCompetencyUserCompetencyPlanViewedRequest(coreCompetencyUserCompetencyPlanViewedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompetencyUserCompetencyViewedInPlan``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompetencyUserCompetencyViewedInPlan`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompetencyUserCompetencyViewedInPlan`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompetencyUserCompetencyViewedInPlanRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyUserCompetencyPlanViewedRequest** | [**CoreCompetencyUserCompetencyPlanViewedRequest**](CoreCompetencyUserCompetencyPlanViewedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompletionGetActivitiesCompletionStatus

> CoreCompletionGetActivitiesCompletionStatus200Response CoreCompletionGetActivitiesCompletionStatus(ctx).CoreCompletionGetActivitiesCompletionStatusRequest(coreCompletionGetActivitiesCompletionStatusRequest).Execute()

Return the activities completion status for a user in a course.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionGetActivitiesCompletionStatusRequest := *openapiclient.NewCoreCompletionGetActivitiesCompletionStatusRequest(int32(123), int32(123)) // CoreCompletionGetActivitiesCompletionStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompletionGetActivitiesCompletionStatus(context.Background()).CoreCompletionGetActivitiesCompletionStatusRequest(coreCompletionGetActivitiesCompletionStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompletionGetActivitiesCompletionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompletionGetActivitiesCompletionStatus`: CoreCompletionGetActivitiesCompletionStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompletionGetActivitiesCompletionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompletionGetActivitiesCompletionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionGetActivitiesCompletionStatusRequest** | [**CoreCompletionGetActivitiesCompletionStatusRequest**](CoreCompletionGetActivitiesCompletionStatusRequest.md) |  | 

### Return type

[**CoreCompletionGetActivitiesCompletionStatus200Response**](CoreCompletionGetActivitiesCompletionStatus200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompletionGetCourseCompletionStatus

> CoreCompletionGetCourseCompletionStatus200Response CoreCompletionGetCourseCompletionStatus(ctx).CoreCompletionGetActivitiesCompletionStatusRequest(coreCompletionGetActivitiesCompletionStatusRequest).Execute()

Returns course completion status.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionGetActivitiesCompletionStatusRequest := *openapiclient.NewCoreCompletionGetActivitiesCompletionStatusRequest(int32(123), int32(123)) // CoreCompletionGetActivitiesCompletionStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompletionGetCourseCompletionStatus(context.Background()).CoreCompletionGetActivitiesCompletionStatusRequest(coreCompletionGetActivitiesCompletionStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompletionGetCourseCompletionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompletionGetCourseCompletionStatus`: CoreCompletionGetCourseCompletionStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompletionGetCourseCompletionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompletionGetCourseCompletionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionGetActivitiesCompletionStatusRequest** | [**CoreCompletionGetActivitiesCompletionStatusRequest**](CoreCompletionGetActivitiesCompletionStatusRequest.md) |  | 

### Return type

[**CoreCompletionGetCourseCompletionStatus200Response**](CoreCompletionGetCourseCompletionStatus200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompletionMarkCourseSelfCompleted

> CoreCompletionMarkCourseSelfCompleted200Response CoreCompletionMarkCourseSelfCompleted(ctx).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()

Update the course completion status for the current user (if course self-completion is enabled).



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionMarkCourseSelfCompletedRequest := *openapiclient.NewCoreCompletionMarkCourseSelfCompletedRequest(int32(123)) // CoreCompletionMarkCourseSelfCompletedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompletionMarkCourseSelfCompleted(context.Background()).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompletionMarkCourseSelfCompleted``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompletionMarkCourseSelfCompleted`: CoreCompletionMarkCourseSelfCompleted200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompletionMarkCourseSelfCompleted`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompletionMarkCourseSelfCompletedRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | 

### Return type

[**CoreCompletionMarkCourseSelfCompleted200Response**](CoreCompletionMarkCourseSelfCompleted200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompletionOverrideActivityCompletionStatus

> CoreCompletionOverrideActivityCompletionStatus200Response CoreCompletionOverrideActivityCompletionStatus(ctx).CoreCompletionOverrideActivityCompletionStatusRequest(coreCompletionOverrideActivityCompletionStatusRequest).Execute()

Update completion status for a user in an activity by overriding it.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionOverrideActivityCompletionStatusRequest := *openapiclient.NewCoreCompletionOverrideActivityCompletionStatusRequest(int32(123), int32(123), int32(123)) // CoreCompletionOverrideActivityCompletionStatusRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompletionOverrideActivityCompletionStatus(context.Background()).CoreCompletionOverrideActivityCompletionStatusRequest(coreCompletionOverrideActivityCompletionStatusRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompletionOverrideActivityCompletionStatus``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompletionOverrideActivityCompletionStatus`: CoreCompletionOverrideActivityCompletionStatus200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompletionOverrideActivityCompletionStatus`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompletionOverrideActivityCompletionStatusRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionOverrideActivityCompletionStatusRequest** | [**CoreCompletionOverrideActivityCompletionStatusRequest**](CoreCompletionOverrideActivityCompletionStatusRequest.md) |  | 

### Return type

[**CoreCompletionOverrideActivityCompletionStatus200Response**](CoreCompletionOverrideActivityCompletionStatus200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCompletionUpdateActivityCompletionStatusManually

> CoreCompletionUpdateActivityCompletionStatusManually200Response CoreCompletionUpdateActivityCompletionStatusManually(ctx).CoreCompletionUpdateActivityCompletionStatusManuallyRequest(coreCompletionUpdateActivityCompletionStatusManuallyRequest).Execute()

Update completion status for the current user in an activity, only for activities with manual tracking.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionUpdateActivityCompletionStatusManuallyRequest := *openapiclient.NewCoreCompletionUpdateActivityCompletionStatusManuallyRequest(int32(123), false) // CoreCompletionUpdateActivityCompletionStatusManuallyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCompletionUpdateActivityCompletionStatusManually(context.Background()).CoreCompletionUpdateActivityCompletionStatusManuallyRequest(coreCompletionUpdateActivityCompletionStatusManuallyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCompletionUpdateActivityCompletionStatusManually``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCompletionUpdateActivityCompletionStatusManually`: CoreCompletionUpdateActivityCompletionStatusManually200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCompletionUpdateActivityCompletionStatusManually`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCompletionUpdateActivityCompletionStatusManuallyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionUpdateActivityCompletionStatusManuallyRequest** | [**CoreCompletionUpdateActivityCompletionStatusManuallyRequest**](CoreCompletionUpdateActivityCompletionStatusManuallyRequest.md) |  | 

### Return type

[**CoreCompletionUpdateActivityCompletionStatusManually200Response**](CoreCompletionUpdateActivityCompletionStatusManually200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreContentbankCopyContent

> CoreContentbankCopyContent200Response CoreContentbankCopyContent(ctx).CoreContentbankCopyContentRequest(coreContentbankCopyContentRequest).Execute()

Copy a content in the content bank.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreContentbankCopyContentRequest := *openapiclient.NewCoreContentbankCopyContentRequest(int32(123), "Name_example") // CoreContentbankCopyContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreContentbankCopyContent(context.Background()).CoreContentbankCopyContentRequest(coreContentbankCopyContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreContentbankCopyContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreContentbankCopyContent`: CoreContentbankCopyContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreContentbankCopyContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreContentbankCopyContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreContentbankCopyContentRequest** | [**CoreContentbankCopyContentRequest**](CoreContentbankCopyContentRequest.md) |  | 

### Return type

[**CoreContentbankCopyContent200Response**](CoreContentbankCopyContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreContentbankDeleteContent

> CoreContentbankDeleteContent200Response CoreContentbankDeleteContent(ctx).CoreContentbankDeleteContentRequest(coreContentbankDeleteContentRequest).Execute()

Delete a content from the content bank.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreContentbankDeleteContentRequest := *openapiclient.NewCoreContentbankDeleteContentRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreContentbankDeleteContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreContentbankDeleteContent(context.Background()).CoreContentbankDeleteContentRequest(coreContentbankDeleteContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreContentbankDeleteContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreContentbankDeleteContent`: CoreContentbankDeleteContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreContentbankDeleteContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreContentbankDeleteContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreContentbankDeleteContentRequest** | [**CoreContentbankDeleteContentRequest**](CoreContentbankDeleteContentRequest.md) |  | 

### Return type

[**CoreContentbankDeleteContent200Response**](CoreContentbankDeleteContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreContentbankRenameContent

> CoreContentbankRenameContent200Response CoreContentbankRenameContent(ctx).CoreContentbankRenameContentRequest(coreContentbankRenameContentRequest).Execute()

Rename a content in the content bank.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreContentbankRenameContentRequest := *openapiclient.NewCoreContentbankRenameContentRequest(int32(123), "Name_example") // CoreContentbankRenameContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreContentbankRenameContent(context.Background()).CoreContentbankRenameContentRequest(coreContentbankRenameContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreContentbankRenameContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreContentbankRenameContent`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreContentbankRenameContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreContentbankRenameContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreContentbankRenameContentRequest** | [**CoreContentbankRenameContentRequest**](CoreContentbankRenameContentRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreContentbankSetContentVisibility

> CoreContentbankRenameContent200Response CoreContentbankSetContentVisibility(ctx).CoreContentbankSetContentVisibilityRequest(coreContentbankSetContentVisibilityRequest).Execute()

Set the visibility of a content in the content bank.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreContentbankSetContentVisibilityRequest := *openapiclient.NewCoreContentbankSetContentVisibilityRequest(int32(123), int32(123)) // CoreContentbankSetContentVisibilityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreContentbankSetContentVisibility(context.Background()).CoreContentbankSetContentVisibilityRequest(coreContentbankSetContentVisibilityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreContentbankSetContentVisibility``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreContentbankSetContentVisibility`: CoreContentbankRenameContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreContentbankSetContentVisibility`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreContentbankSetContentVisibilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreContentbankSetContentVisibilityRequest** | [**CoreContentbankSetContentVisibilityRequest**](CoreContentbankSetContentVisibilityRequest.md) |  | 

### Return type

[**CoreContentbankRenameContent200Response**](CoreContentbankRenameContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseAddContentItemToUserFavourites

> CoreCourseAddContentItemToUserFavourites200Response CoreCourseAddContentItemToUserFavourites(ctx).CoreCourseAddContentItemToUserFavouritesRequest(coreCourseAddContentItemToUserFavouritesRequest).Execute()

Adds a content item (activity, resource or their subtypes) to the favourites for the user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseAddContentItemToUserFavouritesRequest := *openapiclient.NewCoreCourseAddContentItemToUserFavouritesRequest("Componentname_example", int32(123)) // CoreCourseAddContentItemToUserFavouritesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseAddContentItemToUserFavourites(context.Background()).CoreCourseAddContentItemToUserFavouritesRequest(coreCourseAddContentItemToUserFavouritesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseAddContentItemToUserFavourites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseAddContentItemToUserFavourites`: CoreCourseAddContentItemToUserFavourites200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseAddContentItemToUserFavourites`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseAddContentItemToUserFavouritesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseAddContentItemToUserFavouritesRequest** | [**CoreCourseAddContentItemToUserFavouritesRequest**](CoreCourseAddContentItemToUserFavouritesRequest.md) |  | 

### Return type

[**CoreCourseAddContentItemToUserFavourites200Response**](CoreCourseAddContentItemToUserFavourites200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseCheckUpdates

> CoreCourseCheckUpdates200Response CoreCourseCheckUpdates(ctx).CoreCourseCheckUpdatesRequest(coreCourseCheckUpdatesRequest).Execute()

Check if there is updates affecting the user for the given course and contexts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseCheckUpdatesRequest := *openapiclient.NewCoreCourseCheckUpdatesRequest(int32(123), []openapiclient.CoreCourseCheckUpdatesRequestTocheckInner{*openapiclient.NewCoreCourseCheckUpdatesRequestTocheckInner()}) // CoreCourseCheckUpdatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseCheckUpdates(context.Background()).CoreCourseCheckUpdatesRequest(coreCourseCheckUpdatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseCheckUpdates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseCheckUpdates`: CoreCourseCheckUpdates200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseCheckUpdates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseCheckUpdatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseCheckUpdatesRequest** | [**CoreCourseCheckUpdatesRequest**](CoreCourseCheckUpdatesRequest.md) |  | 

### Return type

[**CoreCourseCheckUpdates200Response**](CoreCourseCheckUpdates200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseCreateCategories

> map[string]interface{} CoreCourseCreateCategories(ctx).CoreCourseCreateCategoriesRequest(coreCourseCreateCategoriesRequest).Execute()

Create course categories



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseCreateCategoriesRequest := *openapiclient.NewCoreCourseCreateCategoriesRequest([]openapiclient.CoreCourseCreateCategoriesRequestCategoriesInner{*openapiclient.NewCoreCourseCreateCategoriesRequestCategoriesInner()}) // CoreCourseCreateCategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseCreateCategories(context.Background()).CoreCourseCreateCategoriesRequest(coreCourseCreateCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseCreateCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseCreateCategories`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseCreateCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseCreateCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseCreateCategoriesRequest** | [**CoreCourseCreateCategoriesRequest**](CoreCourseCreateCategoriesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseCreateCourses

> map[string]interface{} CoreCourseCreateCourses(ctx).CoreCourseCreateCoursesRequest(coreCourseCreateCoursesRequest).Execute()

Create new courses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseCreateCoursesRequest := *openapiclient.NewCoreCourseCreateCoursesRequest([]openapiclient.CoreCourseCreateCoursesRequestCoursesInner{*openapiclient.NewCoreCourseCreateCoursesRequestCoursesInner()}) // CoreCourseCreateCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseCreateCourses(context.Background()).CoreCourseCreateCoursesRequest(coreCourseCreateCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseCreateCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseCreateCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseCreateCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseCreateCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseCreateCoursesRequest** | [**CoreCourseCreateCoursesRequest**](CoreCourseCreateCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseDeleteCategories

> map[string]interface{} CoreCourseDeleteCategories(ctx).CoreCourseDeleteCategoriesRequest(coreCourseDeleteCategoriesRequest).Execute()

Delete course categories



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseDeleteCategoriesRequest := *openapiclient.NewCoreCourseDeleteCategoriesRequest([]openapiclient.CoreCourseDeleteCategoriesRequestCategoriesInner{*openapiclient.NewCoreCourseDeleteCategoriesRequestCategoriesInner()}) // CoreCourseDeleteCategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseDeleteCategories(context.Background()).CoreCourseDeleteCategoriesRequest(coreCourseDeleteCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseDeleteCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseDeleteCategories`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseDeleteCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseDeleteCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseDeleteCategoriesRequest** | [**CoreCourseDeleteCategoriesRequest**](CoreCourseDeleteCategoriesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseDeleteCourses

> CoreCohortAddCohortMembers200Response CoreCourseDeleteCourses(ctx).CoreCourseDeleteCoursesRequest(coreCourseDeleteCoursesRequest).Execute()

Deletes all specified courses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseDeleteCoursesRequest := *openapiclient.NewCoreCourseDeleteCoursesRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCourseDeleteCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseDeleteCourses(context.Background()).CoreCourseDeleteCoursesRequest(coreCourseDeleteCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseDeleteCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseDeleteCourses`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseDeleteCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseDeleteCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseDeleteCoursesRequest** | [**CoreCourseDeleteCoursesRequest**](CoreCourseDeleteCoursesRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseDeleteModules

> map[string]interface{} CoreCourseDeleteModules(ctx).CoreCourseDeleteModulesRequest(coreCourseDeleteModulesRequest).Execute()

Deletes all specified module instances



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseDeleteModulesRequest := *openapiclient.NewCoreCourseDeleteModulesRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCourseDeleteModulesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseDeleteModules(context.Background()).CoreCourseDeleteModulesRequest(coreCourseDeleteModulesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseDeleteModules``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseDeleteModules`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseDeleteModules`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseDeleteModulesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseDeleteModulesRequest** | [**CoreCourseDeleteModulesRequest**](CoreCourseDeleteModulesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseDuplicateCourse

> CoreCourseDuplicateCourse200Response CoreCourseDuplicateCourse(ctx).CoreCourseDuplicateCourseRequest(coreCourseDuplicateCourseRequest).Execute()

Duplicate an existing course (creating a new one).



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseDuplicateCourseRequest := *openapiclient.NewCoreCourseDuplicateCourseRequest(int32(123), int32(123), "Fullname_example", "Shortname_example") // CoreCourseDuplicateCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseDuplicateCourse(context.Background()).CoreCourseDuplicateCourseRequest(coreCourseDuplicateCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseDuplicateCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseDuplicateCourse`: CoreCourseDuplicateCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseDuplicateCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseDuplicateCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseDuplicateCourseRequest** | [**CoreCourseDuplicateCourseRequest**](CoreCourseDuplicateCourseRequest.md) |  | 

### Return type

[**CoreCourseDuplicateCourse200Response**](CoreCourseDuplicateCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseEditModule

> map[string]interface{} CoreCourseEditModule(ctx).CoreCourseEditModuleRequest(coreCourseEditModuleRequest).Execute()

Performs an action on course module (change visibility, duplicate, delete, etc.)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseEditModuleRequest := *openapiclient.NewCoreCourseEditModuleRequest("Action_example", int32(123)) // CoreCourseEditModuleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseEditModule(context.Background()).CoreCourseEditModuleRequest(coreCourseEditModuleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseEditModule``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseEditModule`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseEditModule`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseEditModuleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseEditModuleRequest** | [**CoreCourseEditModuleRequest**](CoreCourseEditModuleRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseEditSection

> map[string]interface{} CoreCourseEditSection(ctx).CoreCourseEditSectionRequest(coreCourseEditSectionRequest).Execute()

Performs an action on course section (change visibility, set marker, delete)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseEditSectionRequest := *openapiclient.NewCoreCourseEditSectionRequest("Action_example", int32(123)) // CoreCourseEditSectionRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseEditSection(context.Background()).CoreCourseEditSectionRequest(coreCourseEditSectionRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseEditSection``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseEditSection`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseEditSection`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseEditSectionRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseEditSectionRequest** | [**CoreCourseEditSectionRequest**](CoreCourseEditSectionRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetActivityChooserFooter

> CoreCourseGetActivityChooserFooter200Response CoreCourseGetActivityChooserFooter(ctx).CoreCourseGetActivityChooserFooterRequest(coreCourseGetActivityChooserFooterRequest).Execute()

Fetch the data for the activity chooser footer.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetActivityChooserFooterRequest := *openapiclient.NewCoreCourseGetActivityChooserFooterRequest(int32(123), int32(123)) // CoreCourseGetActivityChooserFooterRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetActivityChooserFooter(context.Background()).CoreCourseGetActivityChooserFooterRequest(coreCourseGetActivityChooserFooterRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetActivityChooserFooter``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetActivityChooserFooter`: CoreCourseGetActivityChooserFooter200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetActivityChooserFooter`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetActivityChooserFooterRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetActivityChooserFooterRequest** | [**CoreCourseGetActivityChooserFooterRequest**](CoreCourseGetActivityChooserFooterRequest.md) |  | 

### Return type

[**CoreCourseGetActivityChooserFooter200Response**](CoreCourseGetActivityChooserFooter200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCategories

> map[string]interface{} CoreCourseGetCategories(ctx).CoreCourseGetCategoriesRequest(coreCourseGetCategoriesRequest).Execute()

Return category details



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetCategoriesRequest := *openapiclient.NewCoreCourseGetCategoriesRequest() // CoreCourseGetCategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCategories(context.Background()).CoreCourseGetCategoriesRequest(coreCourseGetCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCategories`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetCategoriesRequest** | [**CoreCourseGetCategoriesRequest**](CoreCourseGetCategoriesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetContents

> map[string]interface{} CoreCourseGetContents(ctx).CoreCourseGetContentsRequest(coreCourseGetContentsRequest).Execute()

Get course contents



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetContentsRequest := *openapiclient.NewCoreCourseGetContentsRequest(int32(123)) // CoreCourseGetContentsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetContents(context.Background()).CoreCourseGetContentsRequest(coreCourseGetContentsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetContents``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetContents`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetContents`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetContentsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetContentsRequest** | [**CoreCourseGetContentsRequest**](CoreCourseGetContentsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCourseContentItems

> CoreCourseGetCourseContentItems200Response CoreCourseGetCourseContentItems(ctx).CoreCourseGetCourseContentItemsRequest(coreCourseGetCourseContentItemsRequest).Execute()

Fetch all the content items (activities, resources and their subtypes) for the activity picker



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetCourseContentItemsRequest := *openapiclient.NewCoreCourseGetCourseContentItemsRequest(int32(123)) // CoreCourseGetCourseContentItemsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCourseContentItems(context.Background()).CoreCourseGetCourseContentItemsRequest(coreCourseGetCourseContentItemsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCourseContentItems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCourseContentItems`: CoreCourseGetCourseContentItems200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCourseContentItems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCourseContentItemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetCourseContentItemsRequest** | [**CoreCourseGetCourseContentItemsRequest**](CoreCourseGetCourseContentItemsRequest.md) |  | 

### Return type

[**CoreCourseGetCourseContentItems200Response**](CoreCourseGetCourseContentItems200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCourseModule

> CoreCourseGetCourseModule200Response CoreCourseGetCourseModule(ctx).CoreCompetencyListCourseModuleCompetenciesRequest(coreCompetencyListCourseModuleCompetenciesRequest).Execute()

Return information about a course module



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompetencyListCourseModuleCompetenciesRequest := *openapiclient.NewCoreCompetencyListCourseModuleCompetenciesRequest(int32(123)) // CoreCompetencyListCourseModuleCompetenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCourseModule(context.Background()).CoreCompetencyListCourseModuleCompetenciesRequest(coreCompetencyListCourseModuleCompetenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCourseModule``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCourseModule`: CoreCourseGetCourseModule200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCourseModule`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCourseModuleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompetencyListCourseModuleCompetenciesRequest** | [**CoreCompetencyListCourseModuleCompetenciesRequest**](CoreCompetencyListCourseModuleCompetenciesRequest.md) |  | 

### Return type

[**CoreCourseGetCourseModule200Response**](CoreCourseGetCourseModule200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCourseModuleByInstance

> CoreCourseGetCourseModuleByInstance200Response CoreCourseGetCourseModuleByInstance(ctx).CoreCourseGetCourseModuleByInstanceRequest(coreCourseGetCourseModuleByInstanceRequest).Execute()

Return information about a given module name and instance id



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetCourseModuleByInstanceRequest := *openapiclient.NewCoreCourseGetCourseModuleByInstanceRequest(int32(123), "Module_example") // CoreCourseGetCourseModuleByInstanceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCourseModuleByInstance(context.Background()).CoreCourseGetCourseModuleByInstanceRequest(coreCourseGetCourseModuleByInstanceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCourseModuleByInstance``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCourseModuleByInstance`: CoreCourseGetCourseModuleByInstance200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCourseModuleByInstance`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCourseModuleByInstanceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetCourseModuleByInstanceRequest** | [**CoreCourseGetCourseModuleByInstanceRequest**](CoreCourseGetCourseModuleByInstanceRequest.md) |  | 

### Return type

[**CoreCourseGetCourseModuleByInstance200Response**](CoreCourseGetCourseModuleByInstance200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCourses

> map[string]interface{} CoreCourseGetCourses(ctx).CoreCourseGetCoursesRequest(coreCourseGetCoursesRequest).Execute()

Return course details



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetCoursesRequest := *openapiclient.NewCoreCourseGetCoursesRequest() // CoreCourseGetCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCourses(context.Background()).CoreCourseGetCoursesRequest(coreCourseGetCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetCoursesRequest** | [**CoreCourseGetCoursesRequest**](CoreCourseGetCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetCoursesByField

> CoreCourseGetCoursesByField200Response CoreCourseGetCoursesByField(ctx).CoreCourseGetCoursesByFieldRequest(coreCourseGetCoursesByFieldRequest).Execute()

Get courses matching a specific field (id/s, shortname, idnumber, category)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetCoursesByFieldRequest := *openapiclient.NewCoreCourseGetCoursesByFieldRequest() // CoreCourseGetCoursesByFieldRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetCoursesByField(context.Background()).CoreCourseGetCoursesByFieldRequest(coreCourseGetCoursesByFieldRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetCoursesByField``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetCoursesByField`: CoreCourseGetCoursesByField200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetCoursesByField`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetCoursesByFieldRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetCoursesByFieldRequest** | [**CoreCourseGetCoursesByFieldRequest**](CoreCourseGetCoursesByFieldRequest.md) |  | 

### Return type

[**CoreCourseGetCoursesByField200Response**](CoreCourseGetCoursesByField200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetEnrolledCoursesByTimelineClassification

> CoreCourseGetEnrolledCoursesByTimelineClassification200Response CoreCourseGetEnrolledCoursesByTimelineClassification(ctx).CoreCourseGetEnrolledCoursesByTimelineClassificationRequest(coreCourseGetEnrolledCoursesByTimelineClassificationRequest).Execute()

List of enrolled courses for the given timeline classification (past, inprogress, or future).



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetEnrolledCoursesByTimelineClassificationRequest := *openapiclient.NewCoreCourseGetEnrolledCoursesByTimelineClassificationRequest("Classification_example") // CoreCourseGetEnrolledCoursesByTimelineClassificationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetEnrolledCoursesByTimelineClassification(context.Background()).CoreCourseGetEnrolledCoursesByTimelineClassificationRequest(coreCourseGetEnrolledCoursesByTimelineClassificationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetEnrolledCoursesByTimelineClassification``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetEnrolledCoursesByTimelineClassification`: CoreCourseGetEnrolledCoursesByTimelineClassification200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetEnrolledCoursesByTimelineClassification`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetEnrolledCoursesByTimelineClassificationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetEnrolledCoursesByTimelineClassificationRequest** | [**CoreCourseGetEnrolledCoursesByTimelineClassificationRequest**](CoreCourseGetEnrolledCoursesByTimelineClassificationRequest.md) |  | 

### Return type

[**CoreCourseGetEnrolledCoursesByTimelineClassification200Response**](CoreCourseGetEnrolledCoursesByTimelineClassification200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification

> CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification(ctx).CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest).Execute()

List of enrolled courses with action events in a given timeframe, for the given timeline classification.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest := *openapiclient.NewCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest("Classification_example") // CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification(context.Background()).CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest(coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification`: CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest** | [**CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest**](CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassificationRequest.md) |  | 

### Return type

[**CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response**](CoreCourseGetEnrolledCoursesWithActionEventsByTimelineClassification200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetEnrolledUsersByCmid

> CoreCourseGetEnrolledUsersByCmid200Response CoreCourseGetEnrolledUsersByCmid(ctx).CoreCourseGetEnrolledUsersByCmidRequest(coreCourseGetEnrolledUsersByCmidRequest).Execute()

List users by course module id, filter by group and active enrolment status.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetEnrolledUsersByCmidRequest := *openapiclient.NewCoreCourseGetEnrolledUsersByCmidRequest(int32(123)) // CoreCourseGetEnrolledUsersByCmidRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetEnrolledUsersByCmid(context.Background()).CoreCourseGetEnrolledUsersByCmidRequest(coreCourseGetEnrolledUsersByCmidRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetEnrolledUsersByCmid``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetEnrolledUsersByCmid`: CoreCourseGetEnrolledUsersByCmid200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetEnrolledUsersByCmid`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetEnrolledUsersByCmidRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetEnrolledUsersByCmidRequest** | [**CoreCourseGetEnrolledUsersByCmidRequest**](CoreCourseGetEnrolledUsersByCmidRequest.md) |  | 

### Return type

[**CoreCourseGetEnrolledUsersByCmid200Response**](CoreCourseGetEnrolledUsersByCmid200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetModule

> map[string]interface{} CoreCourseGetModule(ctx).CoreCourseGetModuleRequest(coreCourseGetModuleRequest).Execute()

Returns html with one activity module on course page



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetModuleRequest := *openapiclient.NewCoreCourseGetModuleRequest(int32(123)) // CoreCourseGetModuleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetModule(context.Background()).CoreCourseGetModuleRequest(coreCourseGetModuleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetModule``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetModule`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetModule`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetModuleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetModuleRequest** | [**CoreCourseGetModuleRequest**](CoreCourseGetModuleRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetRecentCourses

> map[string]interface{} CoreCourseGetRecentCourses(ctx).CoreCourseGetRecentCoursesRequest(coreCourseGetRecentCoursesRequest).Execute()

List of courses a user has accessed most recently.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetRecentCoursesRequest := *openapiclient.NewCoreCourseGetRecentCoursesRequest() // CoreCourseGetRecentCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetRecentCourses(context.Background()).CoreCourseGetRecentCoursesRequest(coreCourseGetRecentCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetRecentCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetRecentCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetRecentCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetRecentCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetRecentCoursesRequest** | [**CoreCourseGetRecentCoursesRequest**](CoreCourseGetRecentCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetUpdatesSince

> CoreCourseGetUpdatesSince200Response CoreCourseGetUpdatesSince(ctx).CoreCourseGetUpdatesSinceRequest(coreCourseGetUpdatesSinceRequest).Execute()

Check if there are updates affecting the user for the given course since the given time stamp.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetUpdatesSinceRequest := *openapiclient.NewCoreCourseGetUpdatesSinceRequest(int32(123), int32(123)) // CoreCourseGetUpdatesSinceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetUpdatesSince(context.Background()).CoreCourseGetUpdatesSinceRequest(coreCourseGetUpdatesSinceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetUpdatesSince``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetUpdatesSince`: CoreCourseGetUpdatesSince200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetUpdatesSince`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetUpdatesSinceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetUpdatesSinceRequest** | [**CoreCourseGetUpdatesSinceRequest**](CoreCourseGetUpdatesSinceRequest.md) |  | 

### Return type

[**CoreCourseGetUpdatesSince200Response**](CoreCourseGetUpdatesSince200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetUserAdministrationOptions

> CoreCourseGetUserAdministrationOptions200Response CoreCourseGetUserAdministrationOptions(ctx).CoreCourseGetUserAdministrationOptionsRequest(coreCourseGetUserAdministrationOptionsRequest).Execute()

Return a list of administration options in a set of courses that are avaialable or not for the current                             user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetUserAdministrationOptionsRequest := *openapiclient.NewCoreCourseGetUserAdministrationOptionsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCourseGetUserAdministrationOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetUserAdministrationOptions(context.Background()).CoreCourseGetUserAdministrationOptionsRequest(coreCourseGetUserAdministrationOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetUserAdministrationOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetUserAdministrationOptions`: CoreCourseGetUserAdministrationOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetUserAdministrationOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetUserAdministrationOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetUserAdministrationOptionsRequest** | [**CoreCourseGetUserAdministrationOptionsRequest**](CoreCourseGetUserAdministrationOptionsRequest.md) |  | 

### Return type

[**CoreCourseGetUserAdministrationOptions200Response**](CoreCourseGetUserAdministrationOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseGetUserNavigationOptions

> CoreCourseGetUserNavigationOptions200Response CoreCourseGetUserNavigationOptions(ctx).CoreCourseGetUserNavigationOptionsRequest(coreCourseGetUserNavigationOptionsRequest).Execute()

Return a list of navigation options in a set of courses that are avaialable or not for the current user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseGetUserNavigationOptionsRequest := *openapiclient.NewCoreCourseGetUserNavigationOptionsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreCourseGetUserNavigationOptionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseGetUserNavigationOptions(context.Background()).CoreCourseGetUserNavigationOptionsRequest(coreCourseGetUserNavigationOptionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseGetUserNavigationOptions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseGetUserNavigationOptions`: CoreCourseGetUserNavigationOptions200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseGetUserNavigationOptions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseGetUserNavigationOptionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseGetUserNavigationOptionsRequest** | [**CoreCourseGetUserNavigationOptionsRequest**](CoreCourseGetUserNavigationOptionsRequest.md) |  | 

### Return type

[**CoreCourseGetUserNavigationOptions200Response**](CoreCourseGetUserNavigationOptions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseImportCourse

> map[string]interface{} CoreCourseImportCourse(ctx).CoreCourseImportCourseRequest(coreCourseImportCourseRequest).Execute()

Import course data from a course into another course. Does not include any user data.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseImportCourseRequest := *openapiclient.NewCoreCourseImportCourseRequest(int32(123), int32(123)) // CoreCourseImportCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseImportCourse(context.Background()).CoreCourseImportCourseRequest(coreCourseImportCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseImportCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseImportCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseImportCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseImportCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseImportCourseRequest** | [**CoreCourseImportCourseRequest**](CoreCourseImportCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseRemoveContentItemFromUserFavourites

> CoreCourseAddContentItemToUserFavourites200Response CoreCourseRemoveContentItemFromUserFavourites(ctx).CoreCourseRemoveContentItemFromUserFavouritesRequest(coreCourseRemoveContentItemFromUserFavouritesRequest).Execute()

Removes a content item (activity, resource or their subtypes) from the favourites for the user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseRemoveContentItemFromUserFavouritesRequest := *openapiclient.NewCoreCourseRemoveContentItemFromUserFavouritesRequest("Componentname_example", int32(123)) // CoreCourseRemoveContentItemFromUserFavouritesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseRemoveContentItemFromUserFavourites(context.Background()).CoreCourseRemoveContentItemFromUserFavouritesRequest(coreCourseRemoveContentItemFromUserFavouritesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseRemoveContentItemFromUserFavourites``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseRemoveContentItemFromUserFavourites`: CoreCourseAddContentItemToUserFavourites200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseRemoveContentItemFromUserFavourites`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseRemoveContentItemFromUserFavouritesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseRemoveContentItemFromUserFavouritesRequest** | [**CoreCourseRemoveContentItemFromUserFavouritesRequest**](CoreCourseRemoveContentItemFromUserFavouritesRequest.md) |  | 

### Return type

[**CoreCourseAddContentItemToUserFavourites200Response**](CoreCourseAddContentItemToUserFavourites200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseSearchCourses

> CoreCourseSearchCourses200Response CoreCourseSearchCourses(ctx).CoreCourseSearchCoursesRequest(coreCourseSearchCoursesRequest).Execute()

Search courses by (name, module, block, tag)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseSearchCoursesRequest := *openapiclient.NewCoreCourseSearchCoursesRequest("Criterianame_example", "Criteriavalue_example") // CoreCourseSearchCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseSearchCourses(context.Background()).CoreCourseSearchCoursesRequest(coreCourseSearchCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseSearchCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseSearchCourses`: CoreCourseSearchCourses200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseSearchCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseSearchCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseSearchCoursesRequest** | [**CoreCourseSearchCoursesRequest**](CoreCourseSearchCoursesRequest.md) |  | 

### Return type

[**CoreCourseSearchCourses200Response**](CoreCourseSearchCourses200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseSetFavouriteCourses

> CoreCohortAddCohortMembers200Response CoreCourseSetFavouriteCourses(ctx).CoreCourseSetFavouriteCoursesRequest(coreCourseSetFavouriteCoursesRequest).Execute()

Add a list of courses to the list of favourite courses.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseSetFavouriteCoursesRequest := *openapiclient.NewCoreCourseSetFavouriteCoursesRequest([]openapiclient.CoreCourseSetFavouriteCoursesRequestCoursesInner{*openapiclient.NewCoreCourseSetFavouriteCoursesRequestCoursesInner()}) // CoreCourseSetFavouriteCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseSetFavouriteCourses(context.Background()).CoreCourseSetFavouriteCoursesRequest(coreCourseSetFavouriteCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseSetFavouriteCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseSetFavouriteCourses`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseSetFavouriteCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseSetFavouriteCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseSetFavouriteCoursesRequest** | [**CoreCourseSetFavouriteCoursesRequest**](CoreCourseSetFavouriteCoursesRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseToggleActivityRecommendation

> CoreCourseToggleActivityRecommendation200Response CoreCourseToggleActivityRecommendation(ctx).CoreCourseToggleActivityRecommendationRequest(coreCourseToggleActivityRecommendationRequest).Execute()

Adds or removes an activity as a recommendation in the activity chooser.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseToggleActivityRecommendationRequest := *openapiclient.NewCoreCourseToggleActivityRecommendationRequest("Area_example", int32(123)) // CoreCourseToggleActivityRecommendationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseToggleActivityRecommendation(context.Background()).CoreCourseToggleActivityRecommendationRequest(coreCourseToggleActivityRecommendationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseToggleActivityRecommendation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseToggleActivityRecommendation`: CoreCourseToggleActivityRecommendation200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseToggleActivityRecommendation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseToggleActivityRecommendationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseToggleActivityRecommendationRequest** | [**CoreCourseToggleActivityRecommendationRequest**](CoreCourseToggleActivityRecommendationRequest.md) |  | 

### Return type

[**CoreCourseToggleActivityRecommendation200Response**](CoreCourseToggleActivityRecommendation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseUpdateCategories

> map[string]interface{} CoreCourseUpdateCategories(ctx).CoreCourseUpdateCategoriesRequest(coreCourseUpdateCategoriesRequest).Execute()

Update categories



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseUpdateCategoriesRequest := *openapiclient.NewCoreCourseUpdateCategoriesRequest([]openapiclient.CoreCourseUpdateCategoriesRequestCategoriesInner{*openapiclient.NewCoreCourseUpdateCategoriesRequestCategoriesInner()}) // CoreCourseUpdateCategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseUpdateCategories(context.Background()).CoreCourseUpdateCategoriesRequest(coreCourseUpdateCategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseUpdateCategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseUpdateCategories`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseUpdateCategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseUpdateCategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseUpdateCategoriesRequest** | [**CoreCourseUpdateCategoriesRequest**](CoreCourseUpdateCategoriesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseUpdateCourses

> CoreCohortAddCohortMembers200Response CoreCourseUpdateCourses(ctx).CoreCourseUpdateCoursesRequest(coreCourseUpdateCoursesRequest).Execute()

Update courses



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseUpdateCoursesRequest := *openapiclient.NewCoreCourseUpdateCoursesRequest([]openapiclient.CoreCourseUpdateCoursesRequestCoursesInner{*openapiclient.NewCoreCourseUpdateCoursesRequestCoursesInner()}) // CoreCourseUpdateCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseUpdateCourses(context.Background()).CoreCourseUpdateCoursesRequest(coreCourseUpdateCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseUpdateCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseUpdateCourses`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseUpdateCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseUpdateCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseUpdateCoursesRequest** | [**CoreCourseUpdateCoursesRequest**](CoreCourseUpdateCoursesRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseViewCourse

> CoreCalendarDeleteSubscription200Response CoreCourseViewCourse(ctx).CoreCourseViewCourseRequest(coreCourseViewCourseRequest).Execute()

Log that the course was viewed



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseViewCourseRequest := *openapiclient.NewCoreCourseViewCourseRequest(int32(123)) // CoreCourseViewCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseViewCourse(context.Background()).CoreCourseViewCourseRequest(coreCourseViewCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseViewCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseViewCourse`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseViewCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseViewCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseViewCourseRequest** | [**CoreCourseViewCourseRequest**](CoreCourseViewCourseRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseformatFileHandlers

> map[string]interface{} CoreCourseformatFileHandlers(ctx).CoreCourseformatFileHandlersRequest(coreCourseformatFileHandlersRequest).Execute()

Get the current course file hanlders.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseformatFileHandlersRequest := *openapiclient.NewCoreCourseformatFileHandlersRequest(int32(123)) // CoreCourseformatFileHandlersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseformatFileHandlers(context.Background()).CoreCourseformatFileHandlersRequest(coreCourseformatFileHandlersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseformatFileHandlers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseformatFileHandlers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseformatFileHandlers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseformatFileHandlersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseformatFileHandlersRequest** | [**CoreCourseformatFileHandlersRequest**](CoreCourseformatFileHandlersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseformatGetState

> map[string]interface{} CoreCourseformatGetState(ctx).CoreCourseformatFileHandlersRequest(coreCourseformatFileHandlersRequest).Execute()

Get the current course state.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseformatFileHandlersRequest := *openapiclient.NewCoreCourseformatFileHandlersRequest(int32(123)) // CoreCourseformatFileHandlersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseformatGetState(context.Background()).CoreCourseformatFileHandlersRequest(coreCourseformatFileHandlersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseformatGetState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseformatGetState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseformatGetState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseformatGetStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseformatFileHandlersRequest** | [**CoreCourseformatFileHandlersRequest**](CoreCourseformatFileHandlersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCourseformatUpdateCourse

> map[string]interface{} CoreCourseformatUpdateCourse(ctx).CoreCourseformatUpdateCourseRequest(coreCourseformatUpdateCourseRequest).Execute()

Update course contents.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCourseformatUpdateCourseRequest := *openapiclient.NewCoreCourseformatUpdateCourseRequest("Action_example", int32(123)) // CoreCourseformatUpdateCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCourseformatUpdateCourse(context.Background()).CoreCourseformatUpdateCourseRequest(coreCourseformatUpdateCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCourseformatUpdateCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCourseformatUpdateCourse`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCourseformatUpdateCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCourseformatUpdateCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCourseformatUpdateCourseRequest** | [**CoreCourseformatUpdateCourseRequest**](CoreCourseformatUpdateCourseRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCreateUserfeedbackActionRecord

> map[string]interface{} CoreCreateUserfeedbackActionRecord(ctx).CoreCreateUserfeedbackActionRecordRequest(coreCreateUserfeedbackActionRecordRequest).Execute()

Record the action that the user takes in the user feedback notification for future use.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCreateUserfeedbackActionRecordRequest := *openapiclient.NewCoreCreateUserfeedbackActionRecordRequest("Action_example", int32(123)) // CoreCreateUserfeedbackActionRecordRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCreateUserfeedbackActionRecord(context.Background()).CoreCreateUserfeedbackActionRecordRequest(coreCreateUserfeedbackActionRecordRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCreateUserfeedbackActionRecord``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCreateUserfeedbackActionRecord`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCreateUserfeedbackActionRecord`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCreateUserfeedbackActionRecordRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCreateUserfeedbackActionRecordRequest** | [**CoreCreateUserfeedbackActionRecordRequest**](CoreCreateUserfeedbackActionRecordRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldCreateCategory

> map[string]interface{} CoreCustomfieldCreateCategory(ctx).CoreCustomfieldCreateCategoryRequest(coreCustomfieldCreateCategoryRequest).Execute()

Creates a new category



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldCreateCategoryRequest := *openapiclient.NewCoreCustomfieldCreateCategoryRequest("Area_example", "Component_example", int32(123)) // CoreCustomfieldCreateCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldCreateCategory(context.Background()).CoreCustomfieldCreateCategoryRequest(coreCustomfieldCreateCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldCreateCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldCreateCategory`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldCreateCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldCreateCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldCreateCategoryRequest** | [**CoreCustomfieldCreateCategoryRequest**](CoreCustomfieldCreateCategoryRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldDeleteCategory

> map[string]interface{} CoreCustomfieldDeleteCategory(ctx).CoreCustomfieldDeleteCategoryRequest(coreCustomfieldDeleteCategoryRequest).Execute()

Deletes a category



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldDeleteCategoryRequest := *openapiclient.NewCoreCustomfieldDeleteCategoryRequest(int32(123)) // CoreCustomfieldDeleteCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldDeleteCategory(context.Background()).CoreCustomfieldDeleteCategoryRequest(coreCustomfieldDeleteCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldDeleteCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldDeleteCategory`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldDeleteCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldDeleteCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldDeleteCategoryRequest** | [**CoreCustomfieldDeleteCategoryRequest**](CoreCustomfieldDeleteCategoryRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldDeleteField

> map[string]interface{} CoreCustomfieldDeleteField(ctx).CoreCustomfieldDeleteFieldRequest(coreCustomfieldDeleteFieldRequest).Execute()

Deletes an entry



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldDeleteFieldRequest := *openapiclient.NewCoreCustomfieldDeleteFieldRequest(int32(123)) // CoreCustomfieldDeleteFieldRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldDeleteField(context.Background()).CoreCustomfieldDeleteFieldRequest(coreCustomfieldDeleteFieldRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldDeleteField``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldDeleteField`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldDeleteField`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldDeleteFieldRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldDeleteFieldRequest** | [**CoreCustomfieldDeleteFieldRequest**](CoreCustomfieldDeleteFieldRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldMoveCategory

> map[string]interface{} CoreCustomfieldMoveCategory(ctx).CoreCustomfieldMoveCategoryRequest(coreCustomfieldMoveCategoryRequest).Execute()

Drag and drop categories



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldMoveCategoryRequest := *openapiclient.NewCoreCustomfieldMoveCategoryRequest(int32(123)) // CoreCustomfieldMoveCategoryRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldMoveCategory(context.Background()).CoreCustomfieldMoveCategoryRequest(coreCustomfieldMoveCategoryRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldMoveCategory``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldMoveCategory`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldMoveCategory`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldMoveCategoryRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldMoveCategoryRequest** | [**CoreCustomfieldMoveCategoryRequest**](CoreCustomfieldMoveCategoryRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldMoveField

> map[string]interface{} CoreCustomfieldMoveField(ctx).CoreCustomfieldMoveFieldRequest(coreCustomfieldMoveFieldRequest).Execute()

Drag and drop



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldMoveFieldRequest := *openapiclient.NewCoreCustomfieldMoveFieldRequest(int32(123), int32(123)) // CoreCustomfieldMoveFieldRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldMoveField(context.Background()).CoreCustomfieldMoveFieldRequest(coreCustomfieldMoveFieldRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldMoveField``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldMoveField`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldMoveField`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldMoveFieldRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldMoveFieldRequest** | [**CoreCustomfieldMoveFieldRequest**](CoreCustomfieldMoveFieldRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreCustomfieldReloadTemplate

> CoreCustomfieldReloadTemplate200Response CoreCustomfieldReloadTemplate(ctx).CoreCustomfieldReloadTemplateRequest(coreCustomfieldReloadTemplateRequest).Execute()

Reloads template



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCustomfieldReloadTemplateRequest := *openapiclient.NewCoreCustomfieldReloadTemplateRequest("Area_example", "Component_example", int32(123)) // CoreCustomfieldReloadTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreCustomfieldReloadTemplate(context.Background()).CoreCustomfieldReloadTemplateRequest(coreCustomfieldReloadTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreCustomfieldReloadTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreCustomfieldReloadTemplate`: CoreCustomfieldReloadTemplate200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreCustomfieldReloadTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreCustomfieldReloadTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCustomfieldReloadTemplateRequest** | [**CoreCustomfieldReloadTemplateRequest**](CoreCustomfieldReloadTemplateRequest.md) |  | 

### Return type

[**CoreCustomfieldReloadTemplate200Response**](CoreCustomfieldReloadTemplate200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreDynamicTabsGetContent

> CoreDynamicTabsGetContent200Response CoreDynamicTabsGetContent(ctx).CoreDynamicTabsGetContentRequest(coreDynamicTabsGetContentRequest).Execute()

Returns the content for a dynamic tab



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreDynamicTabsGetContentRequest := *openapiclient.NewCoreDynamicTabsGetContentRequest("Jsondata_example", "Tab_example") // CoreDynamicTabsGetContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreDynamicTabsGetContent(context.Background()).CoreDynamicTabsGetContentRequest(coreDynamicTabsGetContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreDynamicTabsGetContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreDynamicTabsGetContent`: CoreDynamicTabsGetContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreDynamicTabsGetContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreDynamicTabsGetContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreDynamicTabsGetContentRequest** | [**CoreDynamicTabsGetContentRequest**](CoreDynamicTabsGetContentRequest.md) |  | 

### Return type

[**CoreDynamicTabsGetContent200Response**](CoreDynamicTabsGetContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolGetCourseEnrolmentMethods

> map[string]interface{} CoreEnrolGetCourseEnrolmentMethods(ctx).CoreEnrolGetCourseEnrolmentMethodsRequest(coreEnrolGetCourseEnrolmentMethodsRequest).Execute()

Get the list of course enrolment methods



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolGetCourseEnrolmentMethodsRequest := *openapiclient.NewCoreEnrolGetCourseEnrolmentMethodsRequest(int32(123)) // CoreEnrolGetCourseEnrolmentMethodsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolGetCourseEnrolmentMethods(context.Background()).CoreEnrolGetCourseEnrolmentMethodsRequest(coreEnrolGetCourseEnrolmentMethodsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolGetCourseEnrolmentMethods``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolGetCourseEnrolmentMethods`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolGetCourseEnrolmentMethods`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolGetCourseEnrolmentMethodsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolGetCourseEnrolmentMethodsRequest** | [**CoreEnrolGetCourseEnrolmentMethodsRequest**](CoreEnrolGetCourseEnrolmentMethodsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolGetEnrolledUsers

> map[string]interface{} CoreEnrolGetEnrolledUsers(ctx).CoreEnrolGetEnrolledUsersRequest(coreEnrolGetEnrolledUsersRequest).Execute()

Get enrolled users by course id.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolGetEnrolledUsersRequest := *openapiclient.NewCoreEnrolGetEnrolledUsersRequest(int32(123)) // CoreEnrolGetEnrolledUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolGetEnrolledUsers(context.Background()).CoreEnrolGetEnrolledUsersRequest(coreEnrolGetEnrolledUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolGetEnrolledUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolGetEnrolledUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolGetEnrolledUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolGetEnrolledUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolGetEnrolledUsersRequest** | [**CoreEnrolGetEnrolledUsersRequest**](CoreEnrolGetEnrolledUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolGetEnrolledUsersWithCapability

> map[string]interface{} CoreEnrolGetEnrolledUsersWithCapability(ctx).CoreEnrolGetEnrolledUsersWithCapabilityRequest(coreEnrolGetEnrolledUsersWithCapabilityRequest).Execute()

For each course and capability specified, return a list of the users that are enrolled in the course                                   and have that capability



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolGetEnrolledUsersWithCapabilityRequest := *openapiclient.NewCoreEnrolGetEnrolledUsersWithCapabilityRequest([]openapiclient.CoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner{*openapiclient.NewCoreEnrolGetEnrolledUsersWithCapabilityRequestCoursecapabilitiesInner()}) // CoreEnrolGetEnrolledUsersWithCapabilityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolGetEnrolledUsersWithCapability(context.Background()).CoreEnrolGetEnrolledUsersWithCapabilityRequest(coreEnrolGetEnrolledUsersWithCapabilityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolGetEnrolledUsersWithCapability``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolGetEnrolledUsersWithCapability`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolGetEnrolledUsersWithCapability`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolGetEnrolledUsersWithCapabilityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolGetEnrolledUsersWithCapabilityRequest** | [**CoreEnrolGetEnrolledUsersWithCapabilityRequest**](CoreEnrolGetEnrolledUsersWithCapabilityRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolGetPotentialUsers

> map[string]interface{} CoreEnrolGetPotentialUsers(ctx).CoreEnrolGetPotentialUsersRequest(coreEnrolGetPotentialUsersRequest).Execute()

Get the list of potential users to enrol



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolGetPotentialUsersRequest := *openapiclient.NewCoreEnrolGetPotentialUsersRequest(int32(123), int32(123), int32(123), int32(123), "Search_example", false) // CoreEnrolGetPotentialUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolGetPotentialUsers(context.Background()).CoreEnrolGetPotentialUsersRequest(coreEnrolGetPotentialUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolGetPotentialUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolGetPotentialUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolGetPotentialUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolGetPotentialUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolGetPotentialUsersRequest** | [**CoreEnrolGetPotentialUsersRequest**](CoreEnrolGetPotentialUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolGetUsersCourses

> map[string]interface{} CoreEnrolGetUsersCourses(ctx).CoreEnrolGetUsersCoursesRequest(coreEnrolGetUsersCoursesRequest).Execute()

Get the list of courses where a user is enrolled in



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolGetUsersCoursesRequest := *openapiclient.NewCoreEnrolGetUsersCoursesRequest(int32(123)) // CoreEnrolGetUsersCoursesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolGetUsersCourses(context.Background()).CoreEnrolGetUsersCoursesRequest(coreEnrolGetUsersCoursesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolGetUsersCourses``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolGetUsersCourses`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolGetUsersCourses`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolGetUsersCoursesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolGetUsersCoursesRequest** | [**CoreEnrolGetUsersCoursesRequest**](CoreEnrolGetUsersCoursesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolSearchUsers

> map[string]interface{} CoreEnrolSearchUsers(ctx).CoreEnrolSearchUsersRequest(coreEnrolSearchUsersRequest).Execute()

Search within the list of course participants



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolSearchUsersRequest := *openapiclient.NewCoreEnrolSearchUsersRequest(int32(123), int32(123), int32(123), "Search_example", false) // CoreEnrolSearchUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolSearchUsers(context.Background()).CoreEnrolSearchUsersRequest(coreEnrolSearchUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolSearchUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolSearchUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolSearchUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolSearchUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolSearchUsersRequest** | [**CoreEnrolSearchUsersRequest**](CoreEnrolSearchUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolSubmitUserEnrolmentForm

> CoreEnrolSubmitUserEnrolmentForm200Response CoreEnrolSubmitUserEnrolmentForm(ctx).CoreEnrolSubmitUserEnrolmentFormRequest(coreEnrolSubmitUserEnrolmentFormRequest).Execute()

Submit form data for enrolment form



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolSubmitUserEnrolmentFormRequest := *openapiclient.NewCoreEnrolSubmitUserEnrolmentFormRequest("Formdata_example") // CoreEnrolSubmitUserEnrolmentFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolSubmitUserEnrolmentForm(context.Background()).CoreEnrolSubmitUserEnrolmentFormRequest(coreEnrolSubmitUserEnrolmentFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolSubmitUserEnrolmentForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolSubmitUserEnrolmentForm`: CoreEnrolSubmitUserEnrolmentForm200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolSubmitUserEnrolmentForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolSubmitUserEnrolmentFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolSubmitUserEnrolmentFormRequest** | [**CoreEnrolSubmitUserEnrolmentFormRequest**](CoreEnrolSubmitUserEnrolmentFormRequest.md) |  | 

### Return type

[**CoreEnrolSubmitUserEnrolmentForm200Response**](CoreEnrolSubmitUserEnrolmentForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreEnrolUnenrolUserEnrolment

> CoreEnrolUnenrolUserEnrolment200Response CoreEnrolUnenrolUserEnrolment(ctx).CoreEnrolUnenrolUserEnrolmentRequest(coreEnrolUnenrolUserEnrolmentRequest).Execute()

External function that unenrols a given user enrolment



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreEnrolUnenrolUserEnrolmentRequest := *openapiclient.NewCoreEnrolUnenrolUserEnrolmentRequest(int32(123)) // CoreEnrolUnenrolUserEnrolmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreEnrolUnenrolUserEnrolment(context.Background()).CoreEnrolUnenrolUserEnrolmentRequest(coreEnrolUnenrolUserEnrolmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreEnrolUnenrolUserEnrolment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreEnrolUnenrolUserEnrolment`: CoreEnrolUnenrolUserEnrolment200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreEnrolUnenrolUserEnrolment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreEnrolUnenrolUserEnrolmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreEnrolUnenrolUserEnrolmentRequest** | [**CoreEnrolUnenrolUserEnrolmentRequest**](CoreEnrolUnenrolUserEnrolmentRequest.md) |  | 

### Return type

[**CoreEnrolUnenrolUserEnrolment200Response**](CoreEnrolUnenrolUserEnrolment200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFetchNotifications

> map[string]interface{} CoreFetchNotifications(ctx).CoreFetchNotificationsRequest(coreFetchNotificationsRequest).Execute()

Return a list of notifications for the current session



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFetchNotificationsRequest := *openapiclient.NewCoreFetchNotificationsRequest(int32(123)) // CoreFetchNotificationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFetchNotifications(context.Background()).CoreFetchNotificationsRequest(coreFetchNotificationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFetchNotifications``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFetchNotifications`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFetchNotifications`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFetchNotificationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFetchNotificationsRequest** | [**CoreFetchNotificationsRequest**](CoreFetchNotificationsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFilesDeleteDraftFiles

> CoreFilesDeleteDraftFiles200Response CoreFilesDeleteDraftFiles(ctx).CoreFilesDeleteDraftFilesRequest(coreFilesDeleteDraftFilesRequest).Execute()

Delete the indicated files (or directories) from a user draft file area.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFilesDeleteDraftFilesRequest := *openapiclient.NewCoreFilesDeleteDraftFilesRequest(int32(123), []openapiclient.CoreFilesDeleteDraftFilesRequestFilesInner{*openapiclient.NewCoreFilesDeleteDraftFilesRequestFilesInner()}) // CoreFilesDeleteDraftFilesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFilesDeleteDraftFiles(context.Background()).CoreFilesDeleteDraftFilesRequest(coreFilesDeleteDraftFilesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFilesDeleteDraftFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFilesDeleteDraftFiles`: CoreFilesDeleteDraftFiles200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFilesDeleteDraftFiles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFilesDeleteDraftFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFilesDeleteDraftFilesRequest** | [**CoreFilesDeleteDraftFilesRequest**](CoreFilesDeleteDraftFilesRequest.md) |  | 

### Return type

[**CoreFilesDeleteDraftFiles200Response**](CoreFilesDeleteDraftFiles200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFilesGetFiles

> CoreFilesGetFiles200Response CoreFilesGetFiles(ctx).CoreFilesGetFilesRequest(coreFilesGetFilesRequest).Execute()

browse moodle files



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFilesGetFilesRequest := *openapiclient.NewCoreFilesGetFilesRequest("Component_example", int32(123), "Filearea_example", "Filename_example", "Filepath_example", int32(123)) // CoreFilesGetFilesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFilesGetFiles(context.Background()).CoreFilesGetFilesRequest(coreFilesGetFilesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFilesGetFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFilesGetFiles`: CoreFilesGetFiles200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFilesGetFiles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFilesGetFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFilesGetFilesRequest** | [**CoreFilesGetFilesRequest**](CoreFilesGetFilesRequest.md) |  | 

### Return type

[**CoreFilesGetFiles200Response**](CoreFilesGetFiles200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFilesGetUnusedDraftItemid

> CoreFilesGetUnusedDraftItemid200Response CoreFilesGetUnusedDraftItemid(ctx).Execute()

Generate a new draft itemid for the current user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFilesGetUnusedDraftItemid(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFilesGetUnusedDraftItemid``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFilesGetUnusedDraftItemid`: CoreFilesGetUnusedDraftItemid200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFilesGetUnusedDraftItemid`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreFilesGetUnusedDraftItemidRequest struct via the builder pattern


### Return type

[**CoreFilesGetUnusedDraftItemid200Response**](CoreFilesGetUnusedDraftItemid200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFilesUpload

> CoreFilesUpload200Response CoreFilesUpload(ctx).CoreFilesUploadRequest(coreFilesUploadRequest).Execute()

upload a file to moodle



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFilesUploadRequest := *openapiclient.NewCoreFilesUploadRequest("Component_example", "Filearea_example", "Filecontent_example", "Filename_example", "Filepath_example", int32(123)) // CoreFilesUploadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFilesUpload(context.Background()).CoreFilesUploadRequest(coreFilesUploadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFilesUpload``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFilesUpload`: CoreFilesUpload200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFilesUpload`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFilesUploadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFilesUploadRequest** | [**CoreFilesUploadRequest**](CoreFilesUploadRequest.md) |  | 

### Return type

[**CoreFilesUpload200Response**](CoreFilesUpload200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFiltersGetAvailableInContext

> CoreFiltersGetAvailableInContext200Response CoreFiltersGetAvailableInContext(ctx).CoreFiltersGetAvailableInContextRequest(coreFiltersGetAvailableInContextRequest).Execute()

Returns the filters available in the given contexts.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFiltersGetAvailableInContextRequest := *openapiclient.NewCoreFiltersGetAvailableInContextRequest([]openapiclient.CoreFiltersGetAvailableInContextRequestContextsInner{*openapiclient.NewCoreFiltersGetAvailableInContextRequestContextsInner()}) // CoreFiltersGetAvailableInContextRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFiltersGetAvailableInContext(context.Background()).CoreFiltersGetAvailableInContextRequest(coreFiltersGetAvailableInContextRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFiltersGetAvailableInContext``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFiltersGetAvailableInContext`: CoreFiltersGetAvailableInContext200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFiltersGetAvailableInContext`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFiltersGetAvailableInContextRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFiltersGetAvailableInContextRequest** | [**CoreFiltersGetAvailableInContextRequest**](CoreFiltersGetAvailableInContextRequest.md) |  | 

### Return type

[**CoreFiltersGetAvailableInContext200Response**](CoreFiltersGetAvailableInContext200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFormDynamicForm

> CoreFormDynamicForm200Response CoreFormDynamicForm(ctx).CoreFormDynamicFormRequest(coreFormDynamicFormRequest).Execute()

Process submission of a dynamic (modal) form



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFormDynamicFormRequest := *openapiclient.NewCoreFormDynamicFormRequest("Form_example", "Formdata_example") // CoreFormDynamicFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFormDynamicForm(context.Background()).CoreFormDynamicFormRequest(coreFormDynamicFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFormDynamicForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFormDynamicForm`: CoreFormDynamicForm200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFormDynamicForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFormDynamicFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFormDynamicFormRequest** | [**CoreFormDynamicFormRequest**](CoreFormDynamicFormRequest.md) |  | 

### Return type

[**CoreFormDynamicForm200Response**](CoreFormDynamicForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreFormGetFiletypesBrowserData

> CoreFormGetFiletypesBrowserData200Response CoreFormGetFiletypesBrowserData(ctx).CoreFormGetFiletypesBrowserDataRequest(coreFormGetFiletypesBrowserDataRequest).Execute()

Provides data for the filetypes element browser.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreFormGetFiletypesBrowserDataRequest := *openapiclient.NewCoreFormGetFiletypesBrowserDataRequest() // CoreFormGetFiletypesBrowserDataRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreFormGetFiletypesBrowserData(context.Background()).CoreFormGetFiletypesBrowserDataRequest(coreFormGetFiletypesBrowserDataRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreFormGetFiletypesBrowserData``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreFormGetFiletypesBrowserData`: CoreFormGetFiletypesBrowserData200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreFormGetFiletypesBrowserData`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreFormGetFiletypesBrowserDataRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreFormGetFiletypesBrowserDataRequest** | [**CoreFormGetFiletypesBrowserDataRequest**](CoreFormGetFiletypesBrowserDataRequest.md) |  | 

### Return type

[**CoreFormGetFiletypesBrowserData200Response**](CoreFormGetFiletypesBrowserData200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGetComponentStrings

> map[string]interface{} CoreGetComponentStrings(ctx).CoreGetComponentStringsRequest(coreGetComponentStringsRequest).Execute()

Return all raw strings (with {$a->xxx}), for a specific component - similar to core get_component_strings(), call



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGetComponentStringsRequest := *openapiclient.NewCoreGetComponentStringsRequest("Component_example") // CoreGetComponentStringsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGetComponentStrings(context.Background()).CoreGetComponentStringsRequest(coreGetComponentStringsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGetComponentStrings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGetComponentStrings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGetComponentStrings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGetComponentStringsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGetComponentStringsRequest** | [**CoreGetComponentStringsRequest**](CoreGetComponentStringsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGetFragment

> CoreGetFragment200Response CoreGetFragment(ctx).CoreGetFragmentRequest(coreGetFragmentRequest).Execute()

Return a fragment for inclusion, such as a JavaScript page.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGetFragmentRequest := *openapiclient.NewCoreGetFragmentRequest("Callback_example", "Component_example", int32(123)) // CoreGetFragmentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGetFragment(context.Background()).CoreGetFragmentRequest(coreGetFragmentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGetFragment``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGetFragment`: CoreGetFragment200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGetFragment`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGetFragmentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGetFragmentRequest** | [**CoreGetFragmentRequest**](CoreGetFragmentRequest.md) |  | 

### Return type

[**CoreGetFragment200Response**](CoreGetFragment200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGetString

> map[string]interface{} CoreGetString(ctx).CoreGetStringRequest(coreGetStringRequest).Execute()

Return a translated string - similar to core get_string(), call



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGetStringRequest := *openapiclient.NewCoreGetStringRequest("Stringid_example") // CoreGetStringRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGetString(context.Background()).CoreGetStringRequest(coreGetStringRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGetString``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGetString`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGetString`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGetStringRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGetStringRequest** | [**CoreGetStringRequest**](CoreGetStringRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGetStrings

> map[string]interface{} CoreGetStrings(ctx).CoreGetStringsRequest(coreGetStringsRequest).Execute()

Return some translated strings - like several core get_string(), calls



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGetStringsRequest := *openapiclient.NewCoreGetStringsRequest([]openapiclient.CoreGetStringsRequestStringsInner{*openapiclient.NewCoreGetStringsRequestStringsInner()}) // CoreGetStringsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGetStrings(context.Background()).CoreGetStringsRequest(coreGetStringsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGetStrings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGetStrings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGetStrings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGetStringsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGetStringsRequest** | [**CoreGetStringsRequest**](CoreGetStringsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGetUserDates

> CoreGetUserDates200Response CoreGetUserDates(ctx).CoreGetUserDatesRequest(coreGetUserDatesRequest).Execute()

Return formatted timestamps



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGetUserDatesRequest := *openapiclient.NewCoreGetUserDatesRequest([]openapiclient.CoreGetUserDatesRequestTimestampsInner{*openapiclient.NewCoreGetUserDatesRequestTimestampsInner()}) // CoreGetUserDatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGetUserDates(context.Background()).CoreGetUserDatesRequest(coreGetUserDatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGetUserDates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGetUserDates`: CoreGetUserDates200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGetUserDates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGetUserDatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGetUserDatesRequest** | [**CoreGetUserDatesRequest**](CoreGetUserDatesRequest.md) |  | 

### Return type

[**CoreGetUserDates200Response**](CoreGetUserDates200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesCreateGradecategories

> CoreGradesCreateGradecategories200Response CoreGradesCreateGradecategories(ctx).CoreGradesCreateGradecategoriesRequest(coreGradesCreateGradecategoriesRequest).Execute()

Create grade categories inside a course gradebook.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesCreateGradecategoriesRequest := *openapiclient.NewCoreGradesCreateGradecategoriesRequest([]openapiclient.CoreGradesCreateGradecategoriesRequestCategoriesInner{*openapiclient.NewCoreGradesCreateGradecategoriesRequestCategoriesInner()}, int32(123)) // CoreGradesCreateGradecategoriesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesCreateGradecategories(context.Background()).CoreGradesCreateGradecategoriesRequest(coreGradesCreateGradecategoriesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesCreateGradecategories``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesCreateGradecategories`: CoreGradesCreateGradecategories200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesCreateGradecategories`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesCreateGradecategoriesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesCreateGradecategoriesRequest** | [**CoreGradesCreateGradecategoriesRequest**](CoreGradesCreateGradecategoriesRequest.md) |  | 

### Return type

[**CoreGradesCreateGradecategories200Response**](CoreGradesCreateGradecategories200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetEnrolledUsersForSearchWidget

> CoreGradesGetEnrolledUsersForSearchWidget200Response CoreGradesGetEnrolledUsersForSearchWidget(ctx).CoreGradesGetEnrolledUsersForSearchWidgetRequest(coreGradesGetEnrolledUsersForSearchWidgetRequest).Execute()

** DEPRECATED ** Please do not call this function any more. Use core_grades_get_enrolled_users_for_selector instead. Returns the enrolled users within and map some fields to the returned array of user objects.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetEnrolledUsersForSearchWidgetRequest := *openapiclient.NewCoreGradesGetEnrolledUsersForSearchWidgetRequest("Actionbaseurl_example", int32(123)) // CoreGradesGetEnrolledUsersForSearchWidgetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetEnrolledUsersForSearchWidget(context.Background()).CoreGradesGetEnrolledUsersForSearchWidgetRequest(coreGradesGetEnrolledUsersForSearchWidgetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetEnrolledUsersForSearchWidget``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetEnrolledUsersForSearchWidget`: CoreGradesGetEnrolledUsersForSearchWidget200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetEnrolledUsersForSearchWidget`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetEnrolledUsersForSearchWidgetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetEnrolledUsersForSearchWidgetRequest** | [**CoreGradesGetEnrolledUsersForSearchWidgetRequest**](CoreGradesGetEnrolledUsersForSearchWidgetRequest.md) |  | 

### Return type

[**CoreGradesGetEnrolledUsersForSearchWidget200Response**](CoreGradesGetEnrolledUsersForSearchWidget200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetEnrolledUsersForSelector

> CoreGradesGetEnrolledUsersForSelector200Response CoreGradesGetEnrolledUsersForSelector(ctx).CoreGradesGetEnrolledUsersForSelectorRequest(coreGradesGetEnrolledUsersForSelectorRequest).Execute()

Returns the enrolled users within and map some fields to the returned array of user objects.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetEnrolledUsersForSelectorRequest := *openapiclient.NewCoreGradesGetEnrolledUsersForSelectorRequest(int32(123)) // CoreGradesGetEnrolledUsersForSelectorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetEnrolledUsersForSelector(context.Background()).CoreGradesGetEnrolledUsersForSelectorRequest(coreGradesGetEnrolledUsersForSelectorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetEnrolledUsersForSelector``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetEnrolledUsersForSelector`: CoreGradesGetEnrolledUsersForSelector200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetEnrolledUsersForSelector`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetEnrolledUsersForSelectorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetEnrolledUsersForSelectorRequest** | [**CoreGradesGetEnrolledUsersForSelectorRequest**](CoreGradesGetEnrolledUsersForSelectorRequest.md) |  | 

### Return type

[**CoreGradesGetEnrolledUsersForSelector200Response**](CoreGradesGetEnrolledUsersForSelector200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetFeedback

> CoreGradesGetFeedback200Response CoreGradesGetFeedback(ctx).CoreGradesGetFeedbackRequest(coreGradesGetFeedbackRequest).Execute()

Get the feedback data for a grade item



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetFeedbackRequest := *openapiclient.NewCoreGradesGetFeedbackRequest(int32(123), int32(123), int32(123)) // CoreGradesGetFeedbackRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetFeedback(context.Background()).CoreGradesGetFeedbackRequest(coreGradesGetFeedbackRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetFeedback``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetFeedback`: CoreGradesGetFeedback200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetFeedback`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetFeedbackRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetFeedbackRequest** | [**CoreGradesGetFeedbackRequest**](CoreGradesGetFeedbackRequest.md) |  | 

### Return type

[**CoreGradesGetFeedback200Response**](CoreGradesGetFeedback200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetGradableUsers

> CoreGradesGetGradableUsers200Response CoreGradesGetGradableUsers(ctx).CoreGradesGetGradableUsersRequest(coreGradesGetGradableUsersRequest).Execute()

Returns the gradable users in a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetGradableUsersRequest := *openapiclient.NewCoreGradesGetGradableUsersRequest(int32(123)) // CoreGradesGetGradableUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetGradableUsers(context.Background()).CoreGradesGetGradableUsersRequest(coreGradesGetGradableUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetGradableUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetGradableUsers`: CoreGradesGetGradableUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetGradableUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetGradableUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetGradableUsersRequest** | [**CoreGradesGetGradableUsersRequest**](CoreGradesGetGradableUsersRequest.md) |  | 

### Return type

[**CoreGradesGetGradableUsers200Response**](CoreGradesGetGradableUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetGradeTree

> map[string]interface{} CoreGradesGetGradeTree(ctx).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()

Get the grade tree structure for a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionMarkCourseSelfCompletedRequest := *openapiclient.NewCoreCompletionMarkCourseSelfCompletedRequest(int32(123)) // CoreCompletionMarkCourseSelfCompletedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetGradeTree(context.Background()).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetGradeTree``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetGradeTree`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetGradeTree`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetGradeTreeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetGradeitems

> CoreGradesGetGradeitems200Response CoreGradesGetGradeitems(ctx).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()

Get the gradeitems for a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreCompletionMarkCourseSelfCompletedRequest := *openapiclient.NewCoreCompletionMarkCourseSelfCompletedRequest(int32(123)) // CoreCompletionMarkCourseSelfCompletedRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetGradeitems(context.Background()).CoreCompletionMarkCourseSelfCompletedRequest(coreCompletionMarkCourseSelfCompletedRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetGradeitems``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetGradeitems`: CoreGradesGetGradeitems200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetGradeitems`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetGradeitemsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreCompletionMarkCourseSelfCompletedRequest** | [**CoreCompletionMarkCourseSelfCompletedRequest**](CoreCompletionMarkCourseSelfCompletedRequest.md) |  | 

### Return type

[**CoreGradesGetGradeitems200Response**](CoreGradesGetGradeitems200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetGroupsForSearchWidget

> CoreGradesGetGroupsForSearchWidget200Response CoreGradesGetGroupsForSearchWidget(ctx).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetGroupsForSearchWidgetRequest := *openapiclient.NewCoreGradesGetGroupsForSearchWidgetRequest(int32(123)) // CoreGradesGetGroupsForSearchWidgetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetGroupsForSearchWidget(context.Background()).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetGroupsForSearchWidget``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetGroupsForSearchWidget`: CoreGradesGetGroupsForSearchWidget200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetGroupsForSearchWidget`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetGroupsForSearchWidgetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | 

### Return type

[**CoreGradesGetGroupsForSearchWidget200Response**](CoreGradesGetGroupsForSearchWidget200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGetGroupsForSelector

> CoreGradesGetGroupsForSelector200Response CoreGradesGetGroupsForSelector(ctx).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()

** DEPRECATED ** Please do not call this function any more. Use core_group_get_groups_for_selector instead. Get the group/(s) for a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetGroupsForSearchWidgetRequest := *openapiclient.NewCoreGradesGetGroupsForSearchWidgetRequest(int32(123)) // CoreGradesGetGroupsForSearchWidgetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGetGroupsForSelector(context.Background()).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGetGroupsForSelector``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGetGroupsForSelector`: CoreGradesGetGroupsForSelector200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGetGroupsForSelector`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGetGroupsForSelectorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | 

### Return type

[**CoreGradesGetGroupsForSelector200Response**](CoreGradesGetGroupsForSelector200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGraderGradingpanelPointFetch

> CoreGradesGraderGradingpanelPointFetch200Response CoreGradesGraderGradingpanelPointFetch(ctx).CoreGradesGraderGradingpanelPointFetchRequest(coreGradesGraderGradingpanelPointFetchRequest).Execute()

Fetch the data required to display the grader grading panel for simple grading, creating the grade item if required



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGraderGradingpanelPointFetchRequest := *openapiclient.NewCoreGradesGraderGradingpanelPointFetchRequest("Component_example", int32(123), int32(123), "Itemname_example") // CoreGradesGraderGradingpanelPointFetchRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGraderGradingpanelPointFetch(context.Background()).CoreGradesGraderGradingpanelPointFetchRequest(coreGradesGraderGradingpanelPointFetchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGraderGradingpanelPointFetch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGraderGradingpanelPointFetch`: CoreGradesGraderGradingpanelPointFetch200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGraderGradingpanelPointFetch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGraderGradingpanelPointFetchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelPointFetchRequest** | [**CoreGradesGraderGradingpanelPointFetchRequest**](CoreGradesGraderGradingpanelPointFetchRequest.md) |  | 

### Return type

[**CoreGradesGraderGradingpanelPointFetch200Response**](CoreGradesGraderGradingpanelPointFetch200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGraderGradingpanelPointStore

> CoreGradesGraderGradingpanelPointStore200Response CoreGradesGraderGradingpanelPointStore(ctx).CoreGradesGraderGradingpanelPointStoreRequest(coreGradesGraderGradingpanelPointStoreRequest).Execute()

Store the data required to display the grader grading panel for simple grading



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGraderGradingpanelPointStoreRequest := *openapiclient.NewCoreGradesGraderGradingpanelPointStoreRequest("Component_example", int32(123), "Formdata_example", int32(123), "Itemname_example") // CoreGradesGraderGradingpanelPointStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGraderGradingpanelPointStore(context.Background()).CoreGradesGraderGradingpanelPointStoreRequest(coreGradesGraderGradingpanelPointStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGraderGradingpanelPointStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGraderGradingpanelPointStore`: CoreGradesGraderGradingpanelPointStore200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGraderGradingpanelPointStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGraderGradingpanelPointStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelPointStoreRequest** | [**CoreGradesGraderGradingpanelPointStoreRequest**](CoreGradesGraderGradingpanelPointStoreRequest.md) |  | 

### Return type

[**CoreGradesGraderGradingpanelPointStore200Response**](CoreGradesGraderGradingpanelPointStore200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGraderGradingpanelScaleFetch

> CoreGradesGraderGradingpanelScaleFetch200Response CoreGradesGraderGradingpanelScaleFetch(ctx).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()

Fetch the data required to display the grader grading panel for scale-based grading, creating the grade item if required



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGraderGradingpanelScaleFetchRequest := *openapiclient.NewCoreGradesGraderGradingpanelScaleFetchRequest("Component_example", int32(123), int32(123), "Itemname_example") // CoreGradesGraderGradingpanelScaleFetchRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGraderGradingpanelScaleFetch(context.Background()).CoreGradesGraderGradingpanelScaleFetchRequest(coreGradesGraderGradingpanelScaleFetchRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGraderGradingpanelScaleFetch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGraderGradingpanelScaleFetch`: CoreGradesGraderGradingpanelScaleFetch200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGraderGradingpanelScaleFetch`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGraderGradingpanelScaleFetchRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleFetchRequest** | [**CoreGradesGraderGradingpanelScaleFetchRequest**](CoreGradesGraderGradingpanelScaleFetchRequest.md) |  | 

### Return type

[**CoreGradesGraderGradingpanelScaleFetch200Response**](CoreGradesGraderGradingpanelScaleFetch200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesGraderGradingpanelScaleStore

> CoreGradesGraderGradingpanelScaleStore200Response CoreGradesGraderGradingpanelScaleStore(ctx).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()

Store the data required to display the grader grading panel for scale-based grading



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGraderGradingpanelScaleStoreRequest := *openapiclient.NewCoreGradesGraderGradingpanelScaleStoreRequest("Component_example", int32(123), "Formdata_example", int32(123), "Itemname_example") // CoreGradesGraderGradingpanelScaleStoreRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesGraderGradingpanelScaleStore(context.Background()).CoreGradesGraderGradingpanelScaleStoreRequest(coreGradesGraderGradingpanelScaleStoreRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesGraderGradingpanelScaleStore``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesGraderGradingpanelScaleStore`: CoreGradesGraderGradingpanelScaleStore200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesGraderGradingpanelScaleStore`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesGraderGradingpanelScaleStoreRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGraderGradingpanelScaleStoreRequest** | [**CoreGradesGraderGradingpanelScaleStoreRequest**](CoreGradesGraderGradingpanelScaleStoreRequest.md) |  | 

### Return type

[**CoreGradesGraderGradingpanelScaleStore200Response**](CoreGradesGraderGradingpanelScaleStore200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradesUpdateGrades

> map[string]interface{} CoreGradesUpdateGrades(ctx).CoreGradesUpdateGradesRequest(coreGradesUpdateGradesRequest).Execute()

Update a grade item and associated student grades.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesUpdateGradesRequest := *openapiclient.NewCoreGradesUpdateGradesRequest(int32(123), "Component_example", int32(123), int32(123), "Source_example") // CoreGradesUpdateGradesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradesUpdateGrades(context.Background()).CoreGradesUpdateGradesRequest(coreGradesUpdateGradesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradesUpdateGrades``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradesUpdateGrades`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradesUpdateGrades`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradesUpdateGradesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesUpdateGradesRequest** | [**CoreGradesUpdateGradesRequest**](CoreGradesUpdateGradesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradingGetDefinitions

> CoreGradingGetDefinitions200Response CoreGradingGetDefinitions(ctx).CoreGradingGetDefinitionsRequest(coreGradingGetDefinitionsRequest).Execute()

Get grading definitions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradingGetDefinitionsRequest := *openapiclient.NewCoreGradingGetDefinitionsRequest("Areaname_example", []map[string]interface{}{map[string]interface{}(123)}) // CoreGradingGetDefinitionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradingGetDefinitions(context.Background()).CoreGradingGetDefinitionsRequest(coreGradingGetDefinitionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradingGetDefinitions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradingGetDefinitions`: CoreGradingGetDefinitions200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradingGetDefinitions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradingGetDefinitionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradingGetDefinitionsRequest** | [**CoreGradingGetDefinitionsRequest**](CoreGradingGetDefinitionsRequest.md) |  | 

### Return type

[**CoreGradingGetDefinitions200Response**](CoreGradingGetDefinitions200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradingGetGradingformInstances

> CoreGradingGetGradingformInstances200Response CoreGradingGetGradingformInstances(ctx).CoreGradingGetGradingformInstancesRequest(coreGradingGetGradingformInstancesRequest).Execute()

Get grading form instances



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradingGetGradingformInstancesRequest := *openapiclient.NewCoreGradingGetGradingformInstancesRequest(int32(123)) // CoreGradingGetGradingformInstancesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradingGetGradingformInstances(context.Background()).CoreGradingGetGradingformInstancesRequest(coreGradingGetGradingformInstancesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradingGetGradingformInstances``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradingGetGradingformInstances`: CoreGradingGetGradingformInstances200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradingGetGradingformInstances`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradingGetGradingformInstancesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradingGetGradingformInstancesRequest** | [**CoreGradingGetGradingformInstancesRequest**](CoreGradingGetGradingformInstancesRequest.md) |  | 

### Return type

[**CoreGradingGetGradingformInstances200Response**](CoreGradingGetGradingformInstances200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGradingSaveDefinitions

> map[string]interface{} CoreGradingSaveDefinitions(ctx).CoreGradingSaveDefinitionsRequest(coreGradingSaveDefinitionsRequest).Execute()

Save grading definitions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradingSaveDefinitionsRequest := *openapiclient.NewCoreGradingSaveDefinitionsRequest([]openapiclient.CoreGradingSaveDefinitionsRequestAreasInner{*openapiclient.NewCoreGradingSaveDefinitionsRequestAreasInner()}) // CoreGradingSaveDefinitionsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGradingSaveDefinitions(context.Background()).CoreGradingSaveDefinitionsRequest(coreGradingSaveDefinitionsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGradingSaveDefinitions``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGradingSaveDefinitions`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGradingSaveDefinitions`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGradingSaveDefinitionsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradingSaveDefinitionsRequest** | [**CoreGradingSaveDefinitionsRequest**](CoreGradingSaveDefinitionsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupAddGroupMembers

> map[string]interface{} CoreGroupAddGroupMembers(ctx).CoreGroupAddGroupMembersRequest(coreGroupAddGroupMembersRequest).Execute()

Adds group members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupAddGroupMembersRequest := *openapiclient.NewCoreGroupAddGroupMembersRequest([]openapiclient.CoreGroupAddGroupMembersRequestMembersInner{*openapiclient.NewCoreGroupAddGroupMembersRequestMembersInner()}) // CoreGroupAddGroupMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupAddGroupMembers(context.Background()).CoreGroupAddGroupMembersRequest(coreGroupAddGroupMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupAddGroupMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupAddGroupMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupAddGroupMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupAddGroupMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupAddGroupMembersRequest** | [**CoreGroupAddGroupMembersRequest**](CoreGroupAddGroupMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupAssignGrouping

> map[string]interface{} CoreGroupAssignGrouping(ctx).CoreGroupAssignGroupingRequest(coreGroupAssignGroupingRequest).Execute()

Assing groups from groupings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupAssignGroupingRequest := *openapiclient.NewCoreGroupAssignGroupingRequest([]openapiclient.CoreGroupAssignGroupingRequestAssignmentsInner{*openapiclient.NewCoreGroupAssignGroupingRequestAssignmentsInner()}) // CoreGroupAssignGroupingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupAssignGrouping(context.Background()).CoreGroupAssignGroupingRequest(coreGroupAssignGroupingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupAssignGrouping``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupAssignGrouping`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupAssignGrouping`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupAssignGroupingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupAssignGroupingRequest** | [**CoreGroupAssignGroupingRequest**](CoreGroupAssignGroupingRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupCreateGroupings

> map[string]interface{} CoreGroupCreateGroupings(ctx).CoreGroupCreateGroupingsRequest(coreGroupCreateGroupingsRequest).Execute()

Creates new groupings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupCreateGroupingsRequest := *openapiclient.NewCoreGroupCreateGroupingsRequest([]openapiclient.CoreGroupCreateGroupingsRequestGroupingsInner{*openapiclient.NewCoreGroupCreateGroupingsRequestGroupingsInner()}) // CoreGroupCreateGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupCreateGroupings(context.Background()).CoreGroupCreateGroupingsRequest(coreGroupCreateGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupCreateGroupings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupCreateGroupings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupCreateGroupings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupCreateGroupingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupCreateGroupingsRequest** | [**CoreGroupCreateGroupingsRequest**](CoreGroupCreateGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupCreateGroups

> map[string]interface{} CoreGroupCreateGroups(ctx).CoreGroupCreateGroupsRequest(coreGroupCreateGroupsRequest).Execute()

Creates new groups.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupCreateGroupsRequest := *openapiclient.NewCoreGroupCreateGroupsRequest([]openapiclient.CoreGroupCreateGroupsRequestGroupsInner{*openapiclient.NewCoreGroupCreateGroupsRequestGroupsInner()}) // CoreGroupCreateGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupCreateGroups(context.Background()).CoreGroupCreateGroupsRequest(coreGroupCreateGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupCreateGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupCreateGroups`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupCreateGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupCreateGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupCreateGroupsRequest** | [**CoreGroupCreateGroupsRequest**](CoreGroupCreateGroupsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupDeleteGroupMembers

> map[string]interface{} CoreGroupDeleteGroupMembers(ctx).CoreGroupDeleteGroupMembersRequest(coreGroupDeleteGroupMembersRequest).Execute()

Deletes group members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupDeleteGroupMembersRequest := *openapiclient.NewCoreGroupDeleteGroupMembersRequest([]openapiclient.CoreGroupDeleteGroupMembersRequestMembersInner{*openapiclient.NewCoreGroupDeleteGroupMembersRequestMembersInner()}) // CoreGroupDeleteGroupMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupDeleteGroupMembers(context.Background()).CoreGroupDeleteGroupMembersRequest(coreGroupDeleteGroupMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupDeleteGroupMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupDeleteGroupMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupDeleteGroupMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupDeleteGroupMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupDeleteGroupMembersRequest** | [**CoreGroupDeleteGroupMembersRequest**](CoreGroupDeleteGroupMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupDeleteGroupings

> map[string]interface{} CoreGroupDeleteGroupings(ctx).CoreGroupDeleteGroupingsRequest(coreGroupDeleteGroupingsRequest).Execute()

Deletes all specified groupings.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupDeleteGroupingsRequest := *openapiclient.NewCoreGroupDeleteGroupingsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreGroupDeleteGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupDeleteGroupings(context.Background()).CoreGroupDeleteGroupingsRequest(coreGroupDeleteGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupDeleteGroupings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupDeleteGroupings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupDeleteGroupings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupDeleteGroupingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupDeleteGroupingsRequest** | [**CoreGroupDeleteGroupingsRequest**](CoreGroupDeleteGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupDeleteGroups

> map[string]interface{} CoreGroupDeleteGroups(ctx).CoreGroupDeleteGroupsRequest(coreGroupDeleteGroupsRequest).Execute()

Deletes all specified groups.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupDeleteGroupsRequest := *openapiclient.NewCoreGroupDeleteGroupsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreGroupDeleteGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupDeleteGroups(context.Background()).CoreGroupDeleteGroupsRequest(coreGroupDeleteGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupDeleteGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupDeleteGroups`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupDeleteGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupDeleteGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupDeleteGroupsRequest** | [**CoreGroupDeleteGroupsRequest**](CoreGroupDeleteGroupsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetActivityAllowedGroups

> CoreGroupGetActivityAllowedGroups200Response CoreGroupGetActivityAllowedGroups(ctx).CoreGroupGetActivityAllowedGroupsRequest(coreGroupGetActivityAllowedGroupsRequest).Execute()

Gets a list of groups that the user is allowed to access within the specified activity.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetActivityAllowedGroupsRequest := *openapiclient.NewCoreGroupGetActivityAllowedGroupsRequest(int32(123)) // CoreGroupGetActivityAllowedGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetActivityAllowedGroups(context.Background()).CoreGroupGetActivityAllowedGroupsRequest(coreGroupGetActivityAllowedGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetActivityAllowedGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetActivityAllowedGroups`: CoreGroupGetActivityAllowedGroups200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetActivityAllowedGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetActivityAllowedGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetActivityAllowedGroupsRequest** | [**CoreGroupGetActivityAllowedGroupsRequest**](CoreGroupGetActivityAllowedGroupsRequest.md) |  | 

### Return type

[**CoreGroupGetActivityAllowedGroups200Response**](CoreGroupGetActivityAllowedGroups200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetActivityGroupmode

> CoreGroupGetActivityGroupmode200Response CoreGroupGetActivityGroupmode(ctx).CoreGroupGetActivityGroupmodeRequest(coreGroupGetActivityGroupmodeRequest).Execute()

Returns effective groupmode used in a given activity.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetActivityGroupmodeRequest := *openapiclient.NewCoreGroupGetActivityGroupmodeRequest(int32(123)) // CoreGroupGetActivityGroupmodeRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetActivityGroupmode(context.Background()).CoreGroupGetActivityGroupmodeRequest(coreGroupGetActivityGroupmodeRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetActivityGroupmode``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetActivityGroupmode`: CoreGroupGetActivityGroupmode200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetActivityGroupmode`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetActivityGroupmodeRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetActivityGroupmodeRequest** | [**CoreGroupGetActivityGroupmodeRequest**](CoreGroupGetActivityGroupmodeRequest.md) |  | 

### Return type

[**CoreGroupGetActivityGroupmode200Response**](CoreGroupGetActivityGroupmode200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetCourseGroupings

> map[string]interface{} CoreGroupGetCourseGroupings(ctx).CoreGroupGetCourseGroupingsRequest(coreGroupGetCourseGroupingsRequest).Execute()

Returns all groupings in specified course.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetCourseGroupingsRequest := *openapiclient.NewCoreGroupGetCourseGroupingsRequest(int32(123)) // CoreGroupGetCourseGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetCourseGroupings(context.Background()).CoreGroupGetCourseGroupingsRequest(coreGroupGetCourseGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetCourseGroupings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetCourseGroupings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetCourseGroupings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetCourseGroupingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetCourseGroupingsRequest** | [**CoreGroupGetCourseGroupingsRequest**](CoreGroupGetCourseGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetCourseGroups

> map[string]interface{} CoreGroupGetCourseGroups(ctx).CoreGroupGetCourseGroupingsRequest(coreGroupGetCourseGroupingsRequest).Execute()

Returns all groups in specified course.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetCourseGroupingsRequest := *openapiclient.NewCoreGroupGetCourseGroupingsRequest(int32(123)) // CoreGroupGetCourseGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetCourseGroups(context.Background()).CoreGroupGetCourseGroupingsRequest(coreGroupGetCourseGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetCourseGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetCourseGroups`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetCourseGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetCourseGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetCourseGroupingsRequest** | [**CoreGroupGetCourseGroupingsRequest**](CoreGroupGetCourseGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetCourseUserGroups

> CoreGroupGetCourseUserGroups200Response CoreGroupGetCourseUserGroups(ctx).CoreGroupGetCourseUserGroupsRequest(coreGroupGetCourseUserGroupsRequest).Execute()

Returns all groups in specified course for the specified user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetCourseUserGroupsRequest := *openapiclient.NewCoreGroupGetCourseUserGroupsRequest() // CoreGroupGetCourseUserGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetCourseUserGroups(context.Background()).CoreGroupGetCourseUserGroupsRequest(coreGroupGetCourseUserGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetCourseUserGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetCourseUserGroups`: CoreGroupGetCourseUserGroups200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetCourseUserGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetCourseUserGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetCourseUserGroupsRequest** | [**CoreGroupGetCourseUserGroupsRequest**](CoreGroupGetCourseUserGroupsRequest.md) |  | 

### Return type

[**CoreGroupGetCourseUserGroups200Response**](CoreGroupGetCourseUserGroups200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetGroupMembers

> map[string]interface{} CoreGroupGetGroupMembers(ctx).CoreGroupGetGroupMembersRequest(coreGroupGetGroupMembersRequest).Execute()

Returns group members.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetGroupMembersRequest := *openapiclient.NewCoreGroupGetGroupMembersRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreGroupGetGroupMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetGroupMembers(context.Background()).CoreGroupGetGroupMembersRequest(coreGroupGetGroupMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetGroupMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetGroupMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetGroupMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetGroupMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetGroupMembersRequest** | [**CoreGroupGetGroupMembersRequest**](CoreGroupGetGroupMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetGroupings

> map[string]interface{} CoreGroupGetGroupings(ctx).CoreGroupGetGroupingsRequest(coreGroupGetGroupingsRequest).Execute()

Returns groupings details.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetGroupingsRequest := *openapiclient.NewCoreGroupGetGroupingsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreGroupGetGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetGroupings(context.Background()).CoreGroupGetGroupingsRequest(coreGroupGetGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetGroupings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetGroupings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetGroupings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetGroupingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetGroupingsRequest** | [**CoreGroupGetGroupingsRequest**](CoreGroupGetGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetGroups

> map[string]interface{} CoreGroupGetGroups(ctx).CoreGroupGetGroupMembersRequest(coreGroupGetGroupMembersRequest).Execute()

Returns group details.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupGetGroupMembersRequest := *openapiclient.NewCoreGroupGetGroupMembersRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreGroupGetGroupMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetGroups(context.Background()).CoreGroupGetGroupMembersRequest(coreGroupGetGroupMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetGroups`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupGetGroupMembersRequest** | [**CoreGroupGetGroupMembersRequest**](CoreGroupGetGroupMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupGetGroupsForSelector

> CoreGradesGetGroupsForSelector200Response CoreGroupGetGroupsForSelector(ctx).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()

Get the group/(s) for a course



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGradesGetGroupsForSearchWidgetRequest := *openapiclient.NewCoreGradesGetGroupsForSearchWidgetRequest(int32(123)) // CoreGradesGetGroupsForSearchWidgetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupGetGroupsForSelector(context.Background()).CoreGradesGetGroupsForSearchWidgetRequest(coreGradesGetGroupsForSearchWidgetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupGetGroupsForSelector``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupGetGroupsForSelector`: CoreGradesGetGroupsForSelector200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupGetGroupsForSelector`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupGetGroupsForSelectorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGradesGetGroupsForSearchWidgetRequest** | [**CoreGradesGetGroupsForSearchWidgetRequest**](CoreGradesGetGroupsForSearchWidgetRequest.md) |  | 

### Return type

[**CoreGradesGetGroupsForSelector200Response**](CoreGradesGetGroupsForSelector200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupUnassignGrouping

> map[string]interface{} CoreGroupUnassignGrouping(ctx).CoreGroupUnassignGroupingRequest(coreGroupUnassignGroupingRequest).Execute()

Unassing groups from groupings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupUnassignGroupingRequest := *openapiclient.NewCoreGroupUnassignGroupingRequest([]openapiclient.CoreGroupUnassignGroupingRequestUnassignmentsInner{*openapiclient.NewCoreGroupUnassignGroupingRequestUnassignmentsInner()}) // CoreGroupUnassignGroupingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupUnassignGrouping(context.Background()).CoreGroupUnassignGroupingRequest(coreGroupUnassignGroupingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupUnassignGrouping``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupUnassignGrouping`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupUnassignGrouping`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupUnassignGroupingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupUnassignGroupingRequest** | [**CoreGroupUnassignGroupingRequest**](CoreGroupUnassignGroupingRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupUpdateGroupings

> map[string]interface{} CoreGroupUpdateGroupings(ctx).CoreGroupUpdateGroupingsRequest(coreGroupUpdateGroupingsRequest).Execute()

Updates existing groupings



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupUpdateGroupingsRequest := *openapiclient.NewCoreGroupUpdateGroupingsRequest([]openapiclient.CoreGroupUpdateGroupingsRequestGroupingsInner{*openapiclient.NewCoreGroupUpdateGroupingsRequestGroupingsInner()}) // CoreGroupUpdateGroupingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupUpdateGroupings(context.Background()).CoreGroupUpdateGroupingsRequest(coreGroupUpdateGroupingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupUpdateGroupings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupUpdateGroupings`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupUpdateGroupings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupUpdateGroupingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupUpdateGroupingsRequest** | [**CoreGroupUpdateGroupingsRequest**](CoreGroupUpdateGroupingsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreGroupUpdateGroups

> map[string]interface{} CoreGroupUpdateGroups(ctx).CoreGroupUpdateGroupsRequest(coreGroupUpdateGroupsRequest).Execute()

Updates existing groups.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreGroupUpdateGroupsRequest := *openapiclient.NewCoreGroupUpdateGroupsRequest([]openapiclient.CoreGroupUpdateGroupsRequestGroupsInner{*openapiclient.NewCoreGroupUpdateGroupsRequestGroupsInner()}) // CoreGroupUpdateGroupsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreGroupUpdateGroups(context.Background()).CoreGroupUpdateGroupsRequest(coreGroupUpdateGroupsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreGroupUpdateGroups``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreGroupUpdateGroups`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreGroupUpdateGroups`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreGroupUpdateGroupsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreGroupUpdateGroupsRequest** | [**CoreGroupUpdateGroupsRequest**](CoreGroupUpdateGroupsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreH5pGetTrustedH5pFile

> CoreH5pGetTrustedH5pFile200Response CoreH5pGetTrustedH5pFile(ctx).CoreH5pGetTrustedH5pFileRequest(coreH5pGetTrustedH5pFileRequest).Execute()

Get the H5P file cleaned for Mobile App.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreH5pGetTrustedH5pFileRequest := *openapiclient.NewCoreH5pGetTrustedH5pFileRequest("Url_example") // CoreH5pGetTrustedH5pFileRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreH5pGetTrustedH5pFile(context.Background()).CoreH5pGetTrustedH5pFileRequest(coreH5pGetTrustedH5pFileRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreH5pGetTrustedH5pFile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreH5pGetTrustedH5pFile`: CoreH5pGetTrustedH5pFile200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreH5pGetTrustedH5pFile`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreH5pGetTrustedH5pFileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreH5pGetTrustedH5pFileRequest** | [**CoreH5pGetTrustedH5pFileRequest**](CoreH5pGetTrustedH5pFileRequest.md) |  | 

### Return type

[**CoreH5pGetTrustedH5pFile200Response**](CoreH5pGetTrustedH5pFile200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageBlockUser

> map[string]interface{} CoreMessageBlockUser(ctx).CoreMessageBlockUserRequest(coreMessageBlockUserRequest).Execute()

Blocks a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageBlockUserRequest := *openapiclient.NewCoreMessageBlockUserRequest(int32(123), int32(123)) // CoreMessageBlockUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageBlockUser(context.Background()).CoreMessageBlockUserRequest(coreMessageBlockUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageBlockUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageBlockUser`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageBlockUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageBlockUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageBlockUserRequest** | [**CoreMessageBlockUserRequest**](CoreMessageBlockUserRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageConfirmContactRequest

> map[string]interface{} CoreMessageConfirmContactRequest(ctx).CoreMessageConfirmContactRequestRequest(coreMessageConfirmContactRequestRequest).Execute()

Confirms a contact request



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageConfirmContactRequestRequest := *openapiclient.NewCoreMessageConfirmContactRequestRequest(int32(123), int32(123)) // CoreMessageConfirmContactRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageConfirmContactRequest(context.Background()).CoreMessageConfirmContactRequestRequest(coreMessageConfirmContactRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageConfirmContactRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageConfirmContactRequest`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageConfirmContactRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageConfirmContactRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageConfirmContactRequestRequest** | [**CoreMessageConfirmContactRequestRequest**](CoreMessageConfirmContactRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageCreateContactRequest

> CoreMessageCreateContactRequest200Response CoreMessageCreateContactRequest(ctx).CoreMessageCreateContactRequestRequest(coreMessageCreateContactRequestRequest).Execute()

Creates a contact request



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageCreateContactRequestRequest := *openapiclient.NewCoreMessageCreateContactRequestRequest(int32(123), int32(123)) // CoreMessageCreateContactRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageCreateContactRequest(context.Background()).CoreMessageCreateContactRequestRequest(coreMessageCreateContactRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageCreateContactRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageCreateContactRequest`: CoreMessageCreateContactRequest200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageCreateContactRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageCreateContactRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageCreateContactRequestRequest** | [**CoreMessageCreateContactRequestRequest**](CoreMessageCreateContactRequestRequest.md) |  | 

### Return type

[**CoreMessageCreateContactRequest200Response**](CoreMessageCreateContactRequest200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDataForMessageareaSearchMessages

> CoreMessageDataForMessageareaSearchMessages200Response CoreMessageDataForMessageareaSearchMessages(ctx).CoreMessageDataForMessageareaSearchMessagesRequest(coreMessageDataForMessageareaSearchMessagesRequest).Execute()

Retrieve the template data for searching for messages



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageDataForMessageareaSearchMessagesRequest := *openapiclient.NewCoreMessageDataForMessageareaSearchMessagesRequest("Search_example", int32(123)) // CoreMessageDataForMessageareaSearchMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDataForMessageareaSearchMessages(context.Background()).CoreMessageDataForMessageareaSearchMessagesRequest(coreMessageDataForMessageareaSearchMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDataForMessageareaSearchMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDataForMessageareaSearchMessages`: CoreMessageDataForMessageareaSearchMessages200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDataForMessageareaSearchMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDataForMessageareaSearchMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageDataForMessageareaSearchMessagesRequest** | [**CoreMessageDataForMessageareaSearchMessagesRequest**](CoreMessageDataForMessageareaSearchMessagesRequest.md) |  | 

### Return type

[**CoreMessageDataForMessageareaSearchMessages200Response**](CoreMessageDataForMessageareaSearchMessages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDeclineContactRequest

> map[string]interface{} CoreMessageDeclineContactRequest(ctx).CoreMessageCreateContactRequestRequest(coreMessageCreateContactRequestRequest).Execute()

Declines a contact request



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageCreateContactRequestRequest := *openapiclient.NewCoreMessageCreateContactRequestRequest(int32(123), int32(123)) // CoreMessageCreateContactRequestRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDeclineContactRequest(context.Background()).CoreMessageCreateContactRequestRequest(coreMessageCreateContactRequestRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDeclineContactRequest``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDeclineContactRequest`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDeclineContactRequest`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDeclineContactRequestRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageCreateContactRequestRequest** | [**CoreMessageCreateContactRequestRequest**](CoreMessageCreateContactRequestRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDeleteContacts

> map[string]interface{} CoreMessageDeleteContacts(ctx).CoreMessageDeleteContactsRequest(coreMessageDeleteContactsRequest).Execute()

Remove contacts from the contact list



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageDeleteContactsRequest := *openapiclient.NewCoreMessageDeleteContactsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreMessageDeleteContactsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDeleteContacts(context.Background()).CoreMessageDeleteContactsRequest(coreMessageDeleteContactsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDeleteContacts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDeleteContacts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDeleteContacts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDeleteContactsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageDeleteContactsRequest** | [**CoreMessageDeleteContactsRequest**](CoreMessageDeleteContactsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDeleteConversationsById

> map[string]interface{} CoreMessageDeleteConversationsById(ctx).CoreMessageDeleteConversationsByIdRequest(coreMessageDeleteConversationsByIdRequest).Execute()

Deletes a list of conversations.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageDeleteConversationsByIdRequest := *openapiclient.NewCoreMessageDeleteConversationsByIdRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // CoreMessageDeleteConversationsByIdRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDeleteConversationsById(context.Background()).CoreMessageDeleteConversationsByIdRequest(coreMessageDeleteConversationsByIdRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDeleteConversationsById``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDeleteConversationsById`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDeleteConversationsById`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDeleteConversationsByIdRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageDeleteConversationsByIdRequest** | [**CoreMessageDeleteConversationsByIdRequest**](CoreMessageDeleteConversationsByIdRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDeleteMessage

> CoreMessageDeleteMessage200Response CoreMessageDeleteMessage(ctx).CoreMessageDeleteMessageRequest(coreMessageDeleteMessageRequest).Execute()

Deletes a message.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageDeleteMessageRequest := *openapiclient.NewCoreMessageDeleteMessageRequest(int32(123), int32(123)) // CoreMessageDeleteMessageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDeleteMessage(context.Background()).CoreMessageDeleteMessageRequest(coreMessageDeleteMessageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDeleteMessage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDeleteMessage`: CoreMessageDeleteMessage200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDeleteMessage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDeleteMessageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageDeleteMessageRequest** | [**CoreMessageDeleteMessageRequest**](CoreMessageDeleteMessageRequest.md) |  | 

### Return type

[**CoreMessageDeleteMessage200Response**](CoreMessageDeleteMessage200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageDeleteMessageForAllUsers

> map[string]interface{} CoreMessageDeleteMessageForAllUsers(ctx).CoreMessageDeleteMessageForAllUsersRequest(coreMessageDeleteMessageForAllUsersRequest).Execute()

Deletes a message for all users.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageDeleteMessageForAllUsersRequest := *openapiclient.NewCoreMessageDeleteMessageForAllUsersRequest(int32(123), int32(123)) // CoreMessageDeleteMessageForAllUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageDeleteMessageForAllUsers(context.Background()).CoreMessageDeleteMessageForAllUsersRequest(coreMessageDeleteMessageForAllUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageDeleteMessageForAllUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageDeleteMessageForAllUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageDeleteMessageForAllUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageDeleteMessageForAllUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageDeleteMessageForAllUsersRequest** | [**CoreMessageDeleteMessageForAllUsersRequest**](CoreMessageDeleteMessageForAllUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetBlockedUsers

> CoreMessageGetBlockedUsers200Response CoreMessageGetBlockedUsers(ctx).CoreMessageGetBlockedUsersRequest(coreMessageGetBlockedUsersRequest).Execute()

Retrieve a list of users blocked



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetBlockedUsersRequest := *openapiclient.NewCoreMessageGetBlockedUsersRequest(int32(123)) // CoreMessageGetBlockedUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetBlockedUsers(context.Background()).CoreMessageGetBlockedUsersRequest(coreMessageGetBlockedUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetBlockedUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetBlockedUsers`: CoreMessageGetBlockedUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetBlockedUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetBlockedUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetBlockedUsersRequest** | [**CoreMessageGetBlockedUsersRequest**](CoreMessageGetBlockedUsersRequest.md) |  | 

### Return type

[**CoreMessageGetBlockedUsers200Response**](CoreMessageGetBlockedUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetContactRequests

> map[string]interface{} CoreMessageGetContactRequests(ctx).CoreMessageGetContactRequestsRequest(coreMessageGetContactRequestsRequest).Execute()

Returns contact requests for a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetContactRequestsRequest := *openapiclient.NewCoreMessageGetContactRequestsRequest(int32(123)) // CoreMessageGetContactRequestsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetContactRequests(context.Background()).CoreMessageGetContactRequestsRequest(coreMessageGetContactRequestsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetContactRequests``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetContactRequests`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetContactRequests`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetContactRequestsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetContactRequestsRequest** | [**CoreMessageGetContactRequestsRequest**](CoreMessageGetContactRequestsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversation

> CoreMessageGetConversation200Response CoreMessageGetConversation(ctx).CoreMessageGetConversationRequest(coreMessageGetConversationRequest).Execute()

Retrieve a conversation for a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationRequest := *openapiclient.NewCoreMessageGetConversationRequest(int32(123), false, false, int32(123)) // CoreMessageGetConversationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversation(context.Background()).CoreMessageGetConversationRequest(coreMessageGetConversationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversation`: CoreMessageGetConversation200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationRequest** | [**CoreMessageGetConversationRequest**](CoreMessageGetConversationRequest.md) |  | 

### Return type

[**CoreMessageGetConversation200Response**](CoreMessageGetConversation200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversationBetweenUsers

> CoreMessageGetConversationBetweenUsers200Response CoreMessageGetConversationBetweenUsers(ctx).CoreMessageGetConversationBetweenUsersRequest(coreMessageGetConversationBetweenUsersRequest).Execute()

Retrieve a conversation for a user between another user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationBetweenUsersRequest := *openapiclient.NewCoreMessageGetConversationBetweenUsersRequest(false, false, int32(123), int32(123)) // CoreMessageGetConversationBetweenUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversationBetweenUsers(context.Background()).CoreMessageGetConversationBetweenUsersRequest(coreMessageGetConversationBetweenUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversationBetweenUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversationBetweenUsers`: CoreMessageGetConversationBetweenUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversationBetweenUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationBetweenUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationBetweenUsersRequest** | [**CoreMessageGetConversationBetweenUsersRequest**](CoreMessageGetConversationBetweenUsersRequest.md) |  | 

### Return type

[**CoreMessageGetConversationBetweenUsers200Response**](CoreMessageGetConversationBetweenUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversationCounts

> CoreMessageGetConversationCounts200Response CoreMessageGetConversationCounts(ctx).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()

Retrieve a list of conversation counts, indexed by type.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationCountsRequest := *openapiclient.NewCoreMessageGetConversationCountsRequest() // CoreMessageGetConversationCountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversationCounts(context.Background()).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversationCounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversationCounts`: CoreMessageGetConversationCounts200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversationCounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationCountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationCountsRequest** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | 

### Return type

[**CoreMessageGetConversationCounts200Response**](CoreMessageGetConversationCounts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversationMembers

> map[string]interface{} CoreMessageGetConversationMembers(ctx).CoreMessageGetConversationMembersRequest(coreMessageGetConversationMembersRequest).Execute()

Retrieve a list of members in a conversation



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationMembersRequest := *openapiclient.NewCoreMessageGetConversationMembersRequest(int32(123), int32(123)) // CoreMessageGetConversationMembersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversationMembers(context.Background()).CoreMessageGetConversationMembersRequest(coreMessageGetConversationMembersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversationMembers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversationMembers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversationMembers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationMembersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationMembersRequest** | [**CoreMessageGetConversationMembersRequest**](CoreMessageGetConversationMembersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversationMessages

> CoreMessageGetConversationMessages200Response CoreMessageGetConversationMessages(ctx).CoreMessageGetConversationMessagesRequest(coreMessageGetConversationMessagesRequest).Execute()

Retrieve the conversation messages and relevant member information



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationMessagesRequest := *openapiclient.NewCoreMessageGetConversationMessagesRequest(int32(123), int32(123)) // CoreMessageGetConversationMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversationMessages(context.Background()).CoreMessageGetConversationMessagesRequest(coreMessageGetConversationMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversationMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversationMessages`: CoreMessageGetConversationMessages200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversationMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationMessagesRequest** | [**CoreMessageGetConversationMessagesRequest**](CoreMessageGetConversationMessagesRequest.md) |  | 

### Return type

[**CoreMessageGetConversationMessages200Response**](CoreMessageGetConversationMessages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetConversations

> CoreMessageGetConversations200Response CoreMessageGetConversations(ctx).CoreMessageGetConversationsRequest(coreMessageGetConversationsRequest).Execute()

Retrieve a list of conversations for a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationsRequest := *openapiclient.NewCoreMessageGetConversationsRequest(int32(123)) // CoreMessageGetConversationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetConversations(context.Background()).CoreMessageGetConversationsRequest(coreMessageGetConversationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetConversations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetConversations`: CoreMessageGetConversations200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationsRequest** | [**CoreMessageGetConversationsRequest**](CoreMessageGetConversationsRequest.md) |  | 

### Return type

[**CoreMessageGetConversations200Response**](CoreMessageGetConversations200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetMemberInfo

> map[string]interface{} CoreMessageGetMemberInfo(ctx).CoreMessageGetMemberInfoRequest(coreMessageGetMemberInfoRequest).Execute()

Retrieve a user message profiles



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetMemberInfoRequest := *openapiclient.NewCoreMessageGetMemberInfoRequest(int32(123), []map[string]interface{}{map[string]interface{}(123)}) // CoreMessageGetMemberInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetMemberInfo(context.Background()).CoreMessageGetMemberInfoRequest(coreMessageGetMemberInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetMemberInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetMemberInfo`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetMemberInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetMemberInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetMemberInfoRequest** | [**CoreMessageGetMemberInfoRequest**](CoreMessageGetMemberInfoRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetMessageProcessor

> CoreMessageGetMessageProcessor200Response CoreMessageGetMessageProcessor(ctx).CoreMessageGetMessageProcessorRequest(coreMessageGetMessageProcessorRequest).Execute()

Get a message processor



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetMessageProcessorRequest := *openapiclient.NewCoreMessageGetMessageProcessorRequest("Name_example", int32(123)) // CoreMessageGetMessageProcessorRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetMessageProcessor(context.Background()).CoreMessageGetMessageProcessorRequest(coreMessageGetMessageProcessorRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetMessageProcessor``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetMessageProcessor`: CoreMessageGetMessageProcessor200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetMessageProcessor`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetMessageProcessorRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetMessageProcessorRequest** | [**CoreMessageGetMessageProcessorRequest**](CoreMessageGetMessageProcessorRequest.md) |  | 

### Return type

[**CoreMessageGetMessageProcessor200Response**](CoreMessageGetMessageProcessor200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetMessages

> CoreMessageGetMessages200Response CoreMessageGetMessages(ctx).CoreMessageGetMessagesRequest(coreMessageGetMessagesRequest).Execute()

Retrieve a list of messages sent and received by a user (conversations, notifications or both)



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetMessagesRequest := *openapiclient.NewCoreMessageGetMessagesRequest(int32(123)) // CoreMessageGetMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetMessages(context.Background()).CoreMessageGetMessagesRequest(coreMessageGetMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetMessages`: CoreMessageGetMessages200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetMessagesRequest** | [**CoreMessageGetMessagesRequest**](CoreMessageGetMessagesRequest.md) |  | 

### Return type

[**CoreMessageGetMessages200Response**](CoreMessageGetMessages200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetReceivedContactRequestsCount

> map[string]interface{} CoreMessageGetReceivedContactRequestsCount(ctx).CoreMessageGetReceivedContactRequestsCountRequest(coreMessageGetReceivedContactRequestsCountRequest).Execute()

Gets the number of received contact requests



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetReceivedContactRequestsCountRequest := *openapiclient.NewCoreMessageGetReceivedContactRequestsCountRequest(int32(123)) // CoreMessageGetReceivedContactRequestsCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetReceivedContactRequestsCount(context.Background()).CoreMessageGetReceivedContactRequestsCountRequest(coreMessageGetReceivedContactRequestsCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetReceivedContactRequestsCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetReceivedContactRequestsCount`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetReceivedContactRequestsCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetReceivedContactRequestsCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetReceivedContactRequestsCountRequest** | [**CoreMessageGetReceivedContactRequestsCountRequest**](CoreMessageGetReceivedContactRequestsCountRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetSelfConversation

> CoreMessageGetConversationBetweenUsers200Response CoreMessageGetSelfConversation(ctx).CoreMessageGetSelfConversationRequest(coreMessageGetSelfConversationRequest).Execute()

Retrieve a self-conversation for a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetSelfConversationRequest := *openapiclient.NewCoreMessageGetSelfConversationRequest(int32(123)) // CoreMessageGetSelfConversationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetSelfConversation(context.Background()).CoreMessageGetSelfConversationRequest(coreMessageGetSelfConversationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetSelfConversation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetSelfConversation`: CoreMessageGetConversationBetweenUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetSelfConversation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetSelfConversationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetSelfConversationRequest** | [**CoreMessageGetSelfConversationRequest**](CoreMessageGetSelfConversationRequest.md) |  | 

### Return type

[**CoreMessageGetConversationBetweenUsers200Response**](CoreMessageGetConversationBetweenUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUnreadConversationCounts

> CoreMessageGetUnreadConversationCounts200Response CoreMessageGetUnreadConversationCounts(ctx).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()

Retrieve a list of unread conversation counts, indexed by type.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationCountsRequest := *openapiclient.NewCoreMessageGetConversationCountsRequest() // CoreMessageGetConversationCountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUnreadConversationCounts(context.Background()).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUnreadConversationCounts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUnreadConversationCounts`: CoreMessageGetUnreadConversationCounts200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUnreadConversationCounts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUnreadConversationCountsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationCountsRequest** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | 

### Return type

[**CoreMessageGetUnreadConversationCounts200Response**](CoreMessageGetUnreadConversationCounts200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUnreadConversationsCount

> map[string]interface{} CoreMessageGetUnreadConversationsCount(ctx).CoreMessageGetUnreadConversationsCountRequest(coreMessageGetUnreadConversationsCountRequest).Execute()

Retrieve the count of unread conversations for a given user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetUnreadConversationsCountRequest := *openapiclient.NewCoreMessageGetUnreadConversationsCountRequest(int32(123)) // CoreMessageGetUnreadConversationsCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUnreadConversationsCount(context.Background()).CoreMessageGetUnreadConversationsCountRequest(coreMessageGetUnreadConversationsCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUnreadConversationsCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUnreadConversationsCount`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUnreadConversationsCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUnreadConversationsCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetUnreadConversationsCountRequest** | [**CoreMessageGetUnreadConversationsCountRequest**](CoreMessageGetUnreadConversationsCountRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUnreadNotificationCount

> map[string]interface{} CoreMessageGetUnreadNotificationCount(ctx).CoreMessageGetUnreadNotificationCountRequest(coreMessageGetUnreadNotificationCountRequest).Execute()

Get number of unread notifications.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetUnreadNotificationCountRequest := *openapiclient.NewCoreMessageGetUnreadNotificationCountRequest(int32(123)) // CoreMessageGetUnreadNotificationCountRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUnreadNotificationCount(context.Background()).CoreMessageGetUnreadNotificationCountRequest(coreMessageGetUnreadNotificationCountRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUnreadNotificationCount``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUnreadNotificationCount`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUnreadNotificationCount`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUnreadNotificationCountRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetUnreadNotificationCountRequest** | [**CoreMessageGetUnreadNotificationCountRequest**](CoreMessageGetUnreadNotificationCountRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUserContacts

> map[string]interface{} CoreMessageGetUserContacts(ctx).CoreMessageGetUserContactsRequest(coreMessageGetUserContactsRequest).Execute()

Retrieve the contact list



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetUserContactsRequest := *openapiclient.NewCoreMessageGetUserContactsRequest(int32(123)) // CoreMessageGetUserContactsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUserContacts(context.Background()).CoreMessageGetUserContactsRequest(coreMessageGetUserContactsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUserContacts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUserContacts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUserContacts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUserContactsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetUserContactsRequest** | [**CoreMessageGetUserContactsRequest**](CoreMessageGetUserContactsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUserMessagePreferences

> CoreMessageGetUserMessagePreferences200Response CoreMessageGetUserMessagePreferences(ctx).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()

Get the message preferences for a given user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationCountsRequest := *openapiclient.NewCoreMessageGetConversationCountsRequest() // CoreMessageGetConversationCountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUserMessagePreferences(context.Background()).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUserMessagePreferences``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUserMessagePreferences`: CoreMessageGetUserMessagePreferences200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUserMessagePreferences`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUserMessagePreferencesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationCountsRequest** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | 

### Return type

[**CoreMessageGetUserMessagePreferences200Response**](CoreMessageGetUserMessagePreferences200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageGetUserNotificationPreferences

> CoreMessageGetUserNotificationPreferences200Response CoreMessageGetUserNotificationPreferences(ctx).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()

Get the notification preferences for a given user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageGetConversationCountsRequest := *openapiclient.NewCoreMessageGetConversationCountsRequest() // CoreMessageGetConversationCountsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageGetUserNotificationPreferences(context.Background()).CoreMessageGetConversationCountsRequest(coreMessageGetConversationCountsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageGetUserNotificationPreferences``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageGetUserNotificationPreferences`: CoreMessageGetUserNotificationPreferences200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageGetUserNotificationPreferences`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageGetUserNotificationPreferencesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageGetConversationCountsRequest** | [**CoreMessageGetConversationCountsRequest**](CoreMessageGetConversationCountsRequest.md) |  | 

### Return type

[**CoreMessageGetUserNotificationPreferences200Response**](CoreMessageGetUserNotificationPreferences200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMarkAllConversationMessagesAsRead

> map[string]interface{} CoreMessageMarkAllConversationMessagesAsRead(ctx).CoreMessageMarkAllConversationMessagesAsReadRequest(coreMessageMarkAllConversationMessagesAsReadRequest).Execute()

Mark all conversation messages as read for a given user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMarkAllConversationMessagesAsReadRequest := *openapiclient.NewCoreMessageMarkAllConversationMessagesAsReadRequest(int32(123), int32(123)) // CoreMessageMarkAllConversationMessagesAsReadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMarkAllConversationMessagesAsRead(context.Background()).CoreMessageMarkAllConversationMessagesAsReadRequest(coreMessageMarkAllConversationMessagesAsReadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMarkAllConversationMessagesAsRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMarkAllConversationMessagesAsRead`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMarkAllConversationMessagesAsRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMarkAllConversationMessagesAsReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMarkAllConversationMessagesAsReadRequest** | [**CoreMessageMarkAllConversationMessagesAsReadRequest**](CoreMessageMarkAllConversationMessagesAsReadRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMarkAllNotificationsAsRead

> map[string]interface{} CoreMessageMarkAllNotificationsAsRead(ctx).CoreMessageMarkAllNotificationsAsReadRequest(coreMessageMarkAllNotificationsAsReadRequest).Execute()

Mark all notifications as read for a given user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMarkAllNotificationsAsReadRequest := *openapiclient.NewCoreMessageMarkAllNotificationsAsReadRequest(int32(123)) // CoreMessageMarkAllNotificationsAsReadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMarkAllNotificationsAsRead(context.Background()).CoreMessageMarkAllNotificationsAsReadRequest(coreMessageMarkAllNotificationsAsReadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMarkAllNotificationsAsRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMarkAllNotificationsAsRead`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMarkAllNotificationsAsRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMarkAllNotificationsAsReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMarkAllNotificationsAsReadRequest** | [**CoreMessageMarkAllNotificationsAsReadRequest**](CoreMessageMarkAllNotificationsAsReadRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMarkMessageRead

> CoreMessageMarkMessageRead200Response CoreMessageMarkMessageRead(ctx).CoreMessageMarkMessageReadRequest(coreMessageMarkMessageReadRequest).Execute()

Mark a single message as read, trigger message_viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMarkMessageReadRequest := *openapiclient.NewCoreMessageMarkMessageReadRequest(int32(123)) // CoreMessageMarkMessageReadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMarkMessageRead(context.Background()).CoreMessageMarkMessageReadRequest(coreMessageMarkMessageReadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMarkMessageRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMarkMessageRead`: CoreMessageMarkMessageRead200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMarkMessageRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMarkMessageReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMarkMessageReadRequest** | [**CoreMessageMarkMessageReadRequest**](CoreMessageMarkMessageReadRequest.md) |  | 

### Return type

[**CoreMessageMarkMessageRead200Response**](CoreMessageMarkMessageRead200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMarkNotificationRead

> CoreMessageMarkNotificationRead200Response CoreMessageMarkNotificationRead(ctx).CoreMessageMarkNotificationReadRequest(coreMessageMarkNotificationReadRequest).Execute()

Mark a single notification as read, trigger notification_viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMarkNotificationReadRequest := *openapiclient.NewCoreMessageMarkNotificationReadRequest(int32(123)) // CoreMessageMarkNotificationReadRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMarkNotificationRead(context.Background()).CoreMessageMarkNotificationReadRequest(coreMessageMarkNotificationReadRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMarkNotificationRead``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMarkNotificationRead`: CoreMessageMarkNotificationRead200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMarkNotificationRead`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMarkNotificationReadRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMarkNotificationReadRequest** | [**CoreMessageMarkNotificationReadRequest**](CoreMessageMarkNotificationReadRequest.md) |  | 

### Return type

[**CoreMessageMarkNotificationRead200Response**](CoreMessageMarkNotificationRead200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMessageProcessorConfigForm

> map[string]interface{} CoreMessageMessageProcessorConfigForm(ctx).CoreMessageMessageProcessorConfigFormRequest(coreMessageMessageProcessorConfigFormRequest).Execute()

Process the message processor config form



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMessageProcessorConfigFormRequest := *openapiclient.NewCoreMessageMessageProcessorConfigFormRequest([]openapiclient.CoreMessageMessageProcessorConfigFormRequestFormvaluesInner{*openapiclient.NewCoreMessageMessageProcessorConfigFormRequestFormvaluesInner()}, "Name_example", int32(123)) // CoreMessageMessageProcessorConfigFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMessageProcessorConfigForm(context.Background()).CoreMessageMessageProcessorConfigFormRequest(coreMessageMessageProcessorConfigFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMessageProcessorConfigForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMessageProcessorConfigForm`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMessageProcessorConfigForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMessageProcessorConfigFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMessageProcessorConfigFormRequest** | [**CoreMessageMessageProcessorConfigFormRequest**](CoreMessageMessageProcessorConfigFormRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMessageSearchUsers

> CoreMessageMessageSearchUsers200Response CoreMessageMessageSearchUsers(ctx).CoreMessageMessageSearchUsersRequest(coreMessageMessageSearchUsersRequest).Execute()

Retrieve the data for searching for people



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMessageSearchUsersRequest := *openapiclient.NewCoreMessageMessageSearchUsersRequest("Search_example", int32(123)) // CoreMessageMessageSearchUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMessageSearchUsers(context.Background()).CoreMessageMessageSearchUsersRequest(coreMessageMessageSearchUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMessageSearchUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMessageSearchUsers`: CoreMessageMessageSearchUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMessageSearchUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMessageSearchUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMessageSearchUsersRequest** | [**CoreMessageMessageSearchUsersRequest**](CoreMessageMessageSearchUsersRequest.md) |  | 

### Return type

[**CoreMessageMessageSearchUsers200Response**](CoreMessageMessageSearchUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageMuteConversations

> map[string]interface{} CoreMessageMuteConversations(ctx).CoreMessageMuteConversationsRequest(coreMessageMuteConversationsRequest).Execute()

Mutes a list of conversations



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageMuteConversationsRequest := *openapiclient.NewCoreMessageMuteConversationsRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // CoreMessageMuteConversationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageMuteConversations(context.Background()).CoreMessageMuteConversationsRequest(coreMessageMuteConversationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageMuteConversations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageMuteConversations`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageMuteConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageMuteConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageMuteConversationsRequest** | [**CoreMessageMuteConversationsRequest**](CoreMessageMuteConversationsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageSearchContacts

> map[string]interface{} CoreMessageSearchContacts(ctx).CoreMessageSearchContactsRequest(coreMessageSearchContactsRequest).Execute()

Search for contacts



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageSearchContactsRequest := *openapiclient.NewCoreMessageSearchContactsRequest("Searchtext_example") // CoreMessageSearchContactsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageSearchContacts(context.Background()).CoreMessageSearchContactsRequest(coreMessageSearchContactsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageSearchContacts``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageSearchContacts`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageSearchContacts`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageSearchContactsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageSearchContactsRequest** | [**CoreMessageSearchContactsRequest**](CoreMessageSearchContactsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageSendInstantMessages

> map[string]interface{} CoreMessageSendInstantMessages(ctx).CoreMessageSendInstantMessagesRequest(coreMessageSendInstantMessagesRequest).Execute()

Send instant messages



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageSendInstantMessagesRequest := *openapiclient.NewCoreMessageSendInstantMessagesRequest([]openapiclient.CoreMessageSendInstantMessagesRequestMessagesInner{*openapiclient.NewCoreMessageSendInstantMessagesRequestMessagesInner()}) // CoreMessageSendInstantMessagesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageSendInstantMessages(context.Background()).CoreMessageSendInstantMessagesRequest(coreMessageSendInstantMessagesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageSendInstantMessages``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageSendInstantMessages`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageSendInstantMessages`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageSendInstantMessagesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageSendInstantMessagesRequest** | [**CoreMessageSendInstantMessagesRequest**](CoreMessageSendInstantMessagesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageSendMessagesToConversation

> map[string]interface{} CoreMessageSendMessagesToConversation(ctx).CoreMessageSendMessagesToConversationRequest(coreMessageSendMessagesToConversationRequest).Execute()

Send messages to an existing conversation between users



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageSendMessagesToConversationRequest := *openapiclient.NewCoreMessageSendMessagesToConversationRequest(int32(123), []openapiclient.CoreMessageSendMessagesToConversationRequestMessagesInner{*openapiclient.NewCoreMessageSendMessagesToConversationRequestMessagesInner()}) // CoreMessageSendMessagesToConversationRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageSendMessagesToConversation(context.Background()).CoreMessageSendMessagesToConversationRequest(coreMessageSendMessagesToConversationRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageSendMessagesToConversation``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageSendMessagesToConversation`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageSendMessagesToConversation`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageSendMessagesToConversationRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageSendMessagesToConversationRequest** | [**CoreMessageSendMessagesToConversationRequest**](CoreMessageSendMessagesToConversationRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageSetFavouriteConversations

> map[string]interface{} CoreMessageSetFavouriteConversations(ctx).CoreMessageSetFavouriteConversationsRequest(coreMessageSetFavouriteConversationsRequest).Execute()

Mark a conversation or group of conversations as favourites/starred conversations.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageSetFavouriteConversationsRequest := *openapiclient.NewCoreMessageSetFavouriteConversationsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreMessageSetFavouriteConversationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageSetFavouriteConversations(context.Background()).CoreMessageSetFavouriteConversationsRequest(coreMessageSetFavouriteConversationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageSetFavouriteConversations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageSetFavouriteConversations`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageSetFavouriteConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageSetFavouriteConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageSetFavouriteConversationsRequest** | [**CoreMessageSetFavouriteConversationsRequest**](CoreMessageSetFavouriteConversationsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageUnblockUser

> map[string]interface{} CoreMessageUnblockUser(ctx).CoreMessageUnblockUserRequest(coreMessageUnblockUserRequest).Execute()

Unblocks a user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageUnblockUserRequest := *openapiclient.NewCoreMessageUnblockUserRequest(int32(123), int32(123)) // CoreMessageUnblockUserRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageUnblockUser(context.Background()).CoreMessageUnblockUserRequest(coreMessageUnblockUserRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageUnblockUser``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageUnblockUser`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageUnblockUser`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageUnblockUserRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageUnblockUserRequest** | [**CoreMessageUnblockUserRequest**](CoreMessageUnblockUserRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageUnmuteConversations

> map[string]interface{} CoreMessageUnmuteConversations(ctx).CoreMessageUnmuteConversationsRequest(coreMessageUnmuteConversationsRequest).Execute()

Unmutes a list of conversations



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageUnmuteConversationsRequest := *openapiclient.NewCoreMessageUnmuteConversationsRequest([]map[string]interface{}{map[string]interface{}(123)}, int32(123)) // CoreMessageUnmuteConversationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageUnmuteConversations(context.Background()).CoreMessageUnmuteConversationsRequest(coreMessageUnmuteConversationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageUnmuteConversations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageUnmuteConversations`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageUnmuteConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageUnmuteConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageUnmuteConversationsRequest** | [**CoreMessageUnmuteConversationsRequest**](CoreMessageUnmuteConversationsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMessageUnsetFavouriteConversations

> map[string]interface{} CoreMessageUnsetFavouriteConversations(ctx).CoreMessageSetFavouriteConversationsRequest(coreMessageSetFavouriteConversationsRequest).Execute()

Unset a conversation or group of conversations as favourites/starred conversations.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMessageSetFavouriteConversationsRequest := *openapiclient.NewCoreMessageSetFavouriteConversationsRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreMessageSetFavouriteConversationsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMessageUnsetFavouriteConversations(context.Background()).CoreMessageSetFavouriteConversationsRequest(coreMessageSetFavouriteConversationsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMessageUnsetFavouriteConversations``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMessageUnsetFavouriteConversations`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMessageUnsetFavouriteConversations`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMessageUnsetFavouriteConversationsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMessageSetFavouriteConversationsRequest** | [**CoreMessageSetFavouriteConversationsRequest**](CoreMessageSetFavouriteConversationsRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMoodlenetAuthCheck

> CoreMoodlenetAuthCheck200Response CoreMoodlenetAuthCheck(ctx).CoreMoodlenetAuthCheckRequest(coreMoodlenetAuthCheckRequest).Execute()

Check a user has authorized for a given MoodleNet site



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMoodlenetAuthCheckRequest := *openapiclient.NewCoreMoodlenetAuthCheckRequest(int32(123), int32(123)) // CoreMoodlenetAuthCheckRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMoodlenetAuthCheck(context.Background()).CoreMoodlenetAuthCheckRequest(coreMoodlenetAuthCheckRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMoodlenetAuthCheck``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMoodlenetAuthCheck`: CoreMoodlenetAuthCheck200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMoodlenetAuthCheck`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMoodlenetAuthCheckRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMoodlenetAuthCheckRequest** | [**CoreMoodlenetAuthCheckRequest**](CoreMoodlenetAuthCheckRequest.md) |  | 

### Return type

[**CoreMoodlenetAuthCheck200Response**](CoreMoodlenetAuthCheck200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMoodlenetGetShareInfoActivity

> CoreMoodlenetGetShareInfoActivity200Response CoreMoodlenetGetShareInfoActivity(ctx).CoreMoodlenetGetShareInfoActivityRequest(coreMoodlenetGetShareInfoActivityRequest).Execute()

Get information about an activity being shared



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMoodlenetGetShareInfoActivityRequest := *openapiclient.NewCoreMoodlenetGetShareInfoActivityRequest(int32(123)) // CoreMoodlenetGetShareInfoActivityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMoodlenetGetShareInfoActivity(context.Background()).CoreMoodlenetGetShareInfoActivityRequest(coreMoodlenetGetShareInfoActivityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMoodlenetGetShareInfoActivity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMoodlenetGetShareInfoActivity`: CoreMoodlenetGetShareInfoActivity200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMoodlenetGetShareInfoActivity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMoodlenetGetShareInfoActivityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMoodlenetGetShareInfoActivityRequest** | [**CoreMoodlenetGetShareInfoActivityRequest**](CoreMoodlenetGetShareInfoActivityRequest.md) |  | 

### Return type

[**CoreMoodlenetGetShareInfoActivity200Response**](CoreMoodlenetGetShareInfoActivity200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMoodlenetGetSharedCourseInfo

> CoreMoodlenetGetSharedCourseInfo200Response CoreMoodlenetGetSharedCourseInfo(ctx).CoreMoodlenetGetSharedCourseInfoRequest(coreMoodlenetGetSharedCourseInfoRequest).Execute()

Get information about an course being shared



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMoodlenetGetSharedCourseInfoRequest := *openapiclient.NewCoreMoodlenetGetSharedCourseInfoRequest(int32(123)) // CoreMoodlenetGetSharedCourseInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMoodlenetGetSharedCourseInfo(context.Background()).CoreMoodlenetGetSharedCourseInfoRequest(coreMoodlenetGetSharedCourseInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMoodlenetGetSharedCourseInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMoodlenetGetSharedCourseInfo`: CoreMoodlenetGetSharedCourseInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMoodlenetGetSharedCourseInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMoodlenetGetSharedCourseInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMoodlenetGetSharedCourseInfoRequest** | [**CoreMoodlenetGetSharedCourseInfoRequest**](CoreMoodlenetGetSharedCourseInfoRequest.md) |  | 

### Return type

[**CoreMoodlenetGetSharedCourseInfo200Response**](CoreMoodlenetGetSharedCourseInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMoodlenetSendActivity

> CoreMoodlenetSendActivity200Response CoreMoodlenetSendActivity(ctx).CoreMoodlenetSendActivityRequest(coreMoodlenetSendActivityRequest).Execute()

Send activity to MoodleNet



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMoodlenetSendActivityRequest := *openapiclient.NewCoreMoodlenetSendActivityRequest(int32(123), int32(123), int32(123)) // CoreMoodlenetSendActivityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMoodlenetSendActivity(context.Background()).CoreMoodlenetSendActivityRequest(coreMoodlenetSendActivityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMoodlenetSendActivity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMoodlenetSendActivity`: CoreMoodlenetSendActivity200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMoodlenetSendActivity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMoodlenetSendActivityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMoodlenetSendActivityRequest** | [**CoreMoodlenetSendActivityRequest**](CoreMoodlenetSendActivityRequest.md) |  | 

### Return type

[**CoreMoodlenetSendActivity200Response**](CoreMoodlenetSendActivity200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMoodlenetSendCourse

> CoreMoodlenetSendCourse200Response CoreMoodlenetSendCourse(ctx).CoreMoodlenetSendCourseRequest(coreMoodlenetSendCourseRequest).Execute()

Send course to MoodleNet



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMoodlenetSendCourseRequest := *openapiclient.NewCoreMoodlenetSendCourseRequest(int32(123), int32(123), int32(123)) // CoreMoodlenetSendCourseRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMoodlenetSendCourse(context.Background()).CoreMoodlenetSendCourseRequest(coreMoodlenetSendCourseRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMoodlenetSendCourse``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMoodlenetSendCourse`: CoreMoodlenetSendCourse200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMoodlenetSendCourse`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMoodlenetSendCourseRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMoodlenetSendCourseRequest** | [**CoreMoodlenetSendCourseRequest**](CoreMoodlenetSendCourseRequest.md) |  | 

### Return type

[**CoreMoodlenetSendCourse200Response**](CoreMoodlenetSendCourse200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreMyViewPage

> CoreCalendarDeleteSubscription200Response CoreMyViewPage(ctx).CoreMyViewPageRequest(coreMyViewPageRequest).Execute()

Trigger the My or Dashboard viewed event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreMyViewPageRequest := *openapiclient.NewCoreMyViewPageRequest("Page_example") // CoreMyViewPageRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreMyViewPage(context.Background()).CoreMyViewPageRequest(coreMyViewPageRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreMyViewPage``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreMyViewPage`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreMyViewPage`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreMyViewPageRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreMyViewPageRequest** | [**CoreMyViewPageRequest**](CoreMyViewPageRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesCreateNotes

> map[string]interface{} CoreNotesCreateNotes(ctx).CoreNotesCreateNotesRequest(coreNotesCreateNotesRequest).Execute()

Create notes



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesCreateNotesRequest := *openapiclient.NewCoreNotesCreateNotesRequest([]openapiclient.CoreNotesCreateNotesRequestNotesInner{*openapiclient.NewCoreNotesCreateNotesRequestNotesInner()}) // CoreNotesCreateNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesCreateNotes(context.Background()).CoreNotesCreateNotesRequest(coreNotesCreateNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesCreateNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesCreateNotes`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesCreateNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesCreateNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesCreateNotesRequest** | [**CoreNotesCreateNotesRequest**](CoreNotesCreateNotesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesDeleteNotes

> map[string]interface{} CoreNotesDeleteNotes(ctx).CoreNotesDeleteNotesRequest(coreNotesDeleteNotesRequest).Execute()

Delete notes



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesDeleteNotesRequest := *openapiclient.NewCoreNotesDeleteNotesRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreNotesDeleteNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesDeleteNotes(context.Background()).CoreNotesDeleteNotesRequest(coreNotesDeleteNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesDeleteNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesDeleteNotes`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesDeleteNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesDeleteNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesDeleteNotesRequest** | [**CoreNotesDeleteNotesRequest**](CoreNotesDeleteNotesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesGetCourseNotes

> CoreNotesGetCourseNotes200Response CoreNotesGetCourseNotes(ctx).CoreNotesGetCourseNotesRequest(coreNotesGetCourseNotesRequest).Execute()

Returns all notes in specified course (or site), for the specified user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesGetCourseNotesRequest := *openapiclient.NewCoreNotesGetCourseNotesRequest(int32(123)) // CoreNotesGetCourseNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesGetCourseNotes(context.Background()).CoreNotesGetCourseNotesRequest(coreNotesGetCourseNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesGetCourseNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesGetCourseNotes`: CoreNotesGetCourseNotes200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesGetCourseNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesGetCourseNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesGetCourseNotesRequest** | [**CoreNotesGetCourseNotesRequest**](CoreNotesGetCourseNotesRequest.md) |  | 

### Return type

[**CoreNotesGetCourseNotes200Response**](CoreNotesGetCourseNotes200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesGetNotes

> CoreNotesGetNotes200Response CoreNotesGetNotes(ctx).CoreNotesGetNotesRequest(coreNotesGetNotesRequest).Execute()

Get notes



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesGetNotesRequest := *openapiclient.NewCoreNotesGetNotesRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreNotesGetNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesGetNotes(context.Background()).CoreNotesGetNotesRequest(coreNotesGetNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesGetNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesGetNotes`: CoreNotesGetNotes200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesGetNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesGetNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesGetNotesRequest** | [**CoreNotesGetNotesRequest**](CoreNotesGetNotesRequest.md) |  | 

### Return type

[**CoreNotesGetNotes200Response**](CoreNotesGetNotes200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesUpdateNotes

> map[string]interface{} CoreNotesUpdateNotes(ctx).CoreNotesUpdateNotesRequest(coreNotesUpdateNotesRequest).Execute()

Update notes



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesUpdateNotesRequest := *openapiclient.NewCoreNotesUpdateNotesRequest() // CoreNotesUpdateNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesUpdateNotes(context.Background()).CoreNotesUpdateNotesRequest(coreNotesUpdateNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesUpdateNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesUpdateNotes`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesUpdateNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesUpdateNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesUpdateNotesRequest** | [**CoreNotesUpdateNotesRequest**](CoreNotesUpdateNotesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreNotesViewNotes

> CoreCalendarDeleteSubscription200Response CoreNotesViewNotes(ctx).CoreNotesViewNotesRequest(coreNotesViewNotesRequest).Execute()

Simulates the web interface view of notes/index.php: trigger events.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreNotesViewNotesRequest := *openapiclient.NewCoreNotesViewNotesRequest(int32(123)) // CoreNotesViewNotesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreNotesViewNotes(context.Background()).CoreNotesViewNotesRequest(coreNotesViewNotesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreNotesViewNotes``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreNotesViewNotes`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreNotesViewNotes`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreNotesViewNotesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreNotesViewNotesRequest** | [**CoreNotesViewNotesRequest**](CoreNotesViewNotesRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreOutputLoadFontawesomeIconMap

> map[string]interface{} CoreOutputLoadFontawesomeIconMap(ctx).Execute()

Load the mapping of names to icons



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreOutputLoadFontawesomeIconMap(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreOutputLoadFontawesomeIconMap``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreOutputLoadFontawesomeIconMap`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreOutputLoadFontawesomeIconMap`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreOutputLoadFontawesomeIconMapRequest struct via the builder pattern


### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreOutputLoadFontawesomeIconSystemMap

> map[string]interface{} CoreOutputLoadFontawesomeIconSystemMap(ctx).CoreOutputLoadFontawesomeIconSystemMapRequest(coreOutputLoadFontawesomeIconSystemMapRequest).Execute()

Load the mapping of moodle pix names to fontawesome icon names



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreOutputLoadFontawesomeIconSystemMapRequest := *openapiclient.NewCoreOutputLoadFontawesomeIconSystemMapRequest("Themename_example") // CoreOutputLoadFontawesomeIconSystemMapRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreOutputLoadFontawesomeIconSystemMap(context.Background()).CoreOutputLoadFontawesomeIconSystemMapRequest(coreOutputLoadFontawesomeIconSystemMapRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreOutputLoadFontawesomeIconSystemMap``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreOutputLoadFontawesomeIconSystemMap`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreOutputLoadFontawesomeIconSystemMap`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreOutputLoadFontawesomeIconSystemMapRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreOutputLoadFontawesomeIconSystemMapRequest** | [**CoreOutputLoadFontawesomeIconSystemMapRequest**](CoreOutputLoadFontawesomeIconSystemMapRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreOutputLoadTemplate

> map[string]interface{} CoreOutputLoadTemplate(ctx).CoreOutputLoadTemplateRequest(coreOutputLoadTemplateRequest).Execute()

Load a template for a renderable



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreOutputLoadTemplateRequest := *openapiclient.NewCoreOutputLoadTemplateRequest("Component_example", "Template_example", "Themename_example") // CoreOutputLoadTemplateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreOutputLoadTemplate(context.Background()).CoreOutputLoadTemplateRequest(coreOutputLoadTemplateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreOutputLoadTemplate``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreOutputLoadTemplate`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreOutputLoadTemplate`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreOutputLoadTemplateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreOutputLoadTemplateRequest** | [**CoreOutputLoadTemplateRequest**](CoreOutputLoadTemplateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreOutputLoadTemplateWithDependencies

> CoreOutputLoadTemplateWithDependencies200Response CoreOutputLoadTemplateWithDependencies(ctx).CoreOutputLoadTemplateWithDependenciesRequest(coreOutputLoadTemplateWithDependenciesRequest).Execute()

Load a template and its dependencies for a renderable



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreOutputLoadTemplateWithDependenciesRequest := *openapiclient.NewCoreOutputLoadTemplateWithDependenciesRequest("Component_example", "Template_example", "Themename_example") // CoreOutputLoadTemplateWithDependenciesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreOutputLoadTemplateWithDependencies(context.Background()).CoreOutputLoadTemplateWithDependenciesRequest(coreOutputLoadTemplateWithDependenciesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreOutputLoadTemplateWithDependencies``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreOutputLoadTemplateWithDependencies`: CoreOutputLoadTemplateWithDependencies200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreOutputLoadTemplateWithDependencies`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreOutputLoadTemplateWithDependenciesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreOutputLoadTemplateWithDependenciesRequest** | [**CoreOutputLoadTemplateWithDependenciesRequest**](CoreOutputLoadTemplateWithDependenciesRequest.md) |  | 

### Return type

[**CoreOutputLoadTemplateWithDependencies200Response**](CoreOutputLoadTemplateWithDependencies200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CorePaymentGetAvailableGateways

> map[string]interface{} CorePaymentGetAvailableGateways(ctx).CorePaymentGetAvailableGatewaysRequest(corePaymentGetAvailableGatewaysRequest).Execute()

Get the list of payment gateways that support the given component/area



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	corePaymentGetAvailableGatewaysRequest := *openapiclient.NewCorePaymentGetAvailableGatewaysRequest("Component_example", int32(123), "Paymentarea_example") // CorePaymentGetAvailableGatewaysRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CorePaymentGetAvailableGateways(context.Background()).CorePaymentGetAvailableGatewaysRequest(corePaymentGetAvailableGatewaysRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CorePaymentGetAvailableGateways``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CorePaymentGetAvailableGateways`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CorePaymentGetAvailableGateways`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCorePaymentGetAvailableGatewaysRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **corePaymentGetAvailableGatewaysRequest** | [**CorePaymentGetAvailableGatewaysRequest**](CorePaymentGetAvailableGatewaysRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreQuestionGetRandomQuestionSummaries

> CoreQuestionGetRandomQuestionSummaries200Response CoreQuestionGetRandomQuestionSummaries(ctx).CoreQuestionGetRandomQuestionSummariesRequest(coreQuestionGetRandomQuestionSummariesRequest).Execute()

Get the random question set for a criteria



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreQuestionGetRandomQuestionSummariesRequest := *openapiclient.NewCoreQuestionGetRandomQuestionSummariesRequest(int32(123), int32(123), false, []map[string]interface{}{map[string]interface{}(123)}) // CoreQuestionGetRandomQuestionSummariesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreQuestionGetRandomQuestionSummaries(context.Background()).CoreQuestionGetRandomQuestionSummariesRequest(coreQuestionGetRandomQuestionSummariesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreQuestionGetRandomQuestionSummaries``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreQuestionGetRandomQuestionSummaries`: CoreQuestionGetRandomQuestionSummaries200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreQuestionGetRandomQuestionSummaries`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreQuestionGetRandomQuestionSummariesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreQuestionGetRandomQuestionSummariesRequest** | [**CoreQuestionGetRandomQuestionSummariesRequest**](CoreQuestionGetRandomQuestionSummariesRequest.md) |  | 

### Return type

[**CoreQuestionGetRandomQuestionSummaries200Response**](CoreQuestionGetRandomQuestionSummaries200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreQuestionSubmitTagsForm

> CoreQuestionSubmitTagsForm200Response CoreQuestionSubmitTagsForm(ctx).CoreQuestionSubmitTagsFormRequest(coreQuestionSubmitTagsFormRequest).Execute()

Update the question tags.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreQuestionSubmitTagsFormRequest := *openapiclient.NewCoreQuestionSubmitTagsFormRequest(int32(123), "Formdata_example", int32(123)) // CoreQuestionSubmitTagsFormRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreQuestionSubmitTagsForm(context.Background()).CoreQuestionSubmitTagsFormRequest(coreQuestionSubmitTagsFormRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreQuestionSubmitTagsForm``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreQuestionSubmitTagsForm`: CoreQuestionSubmitTagsForm200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreQuestionSubmitTagsForm`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreQuestionSubmitTagsFormRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreQuestionSubmitTagsFormRequest** | [**CoreQuestionSubmitTagsFormRequest**](CoreQuestionSubmitTagsFormRequest.md) |  | 

### Return type

[**CoreQuestionSubmitTagsForm200Response**](CoreQuestionSubmitTagsForm200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreQuestionUpdateFlag

> CoreCalendarDeleteSubscription200Response CoreQuestionUpdateFlag(ctx).CoreQuestionUpdateFlagRequest(coreQuestionUpdateFlagRequest).Execute()

Update the flag state of a question attempt.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreQuestionUpdateFlagRequest := *openapiclient.NewCoreQuestionUpdateFlagRequest("Checksum_example", false, int32(123), int32(123), int32(123), int32(123)) // CoreQuestionUpdateFlagRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreQuestionUpdateFlag(context.Background()).CoreQuestionUpdateFlagRequest(coreQuestionUpdateFlagRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreQuestionUpdateFlag``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreQuestionUpdateFlag`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreQuestionUpdateFlag`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreQuestionUpdateFlagRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreQuestionUpdateFlagRequest** | [**CoreQuestionUpdateFlagRequest**](CoreQuestionUpdateFlagRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreRatingAddRating

> CoreRatingAddRating200Response CoreRatingAddRating(ctx).CoreRatingAddRatingRequest(coreRatingAddRatingRequest).Execute()

Rates an item.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreRatingAddRatingRequest := *openapiclient.NewCoreRatingAddRatingRequest("Component_example", "Contextlevel_example", int32(123), int32(123), int32(123), int32(123), "Ratingarea_example", int32(123)) // CoreRatingAddRatingRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreRatingAddRating(context.Background()).CoreRatingAddRatingRequest(coreRatingAddRatingRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreRatingAddRating``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreRatingAddRating`: CoreRatingAddRating200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreRatingAddRating`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreRatingAddRatingRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreRatingAddRatingRequest** | [**CoreRatingAddRatingRequest**](CoreRatingAddRatingRequest.md) |  | 

### Return type

[**CoreRatingAddRating200Response**](CoreRatingAddRating200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreRatingGetItemRatings

> CoreRatingGetItemRatings200Response CoreRatingGetItemRatings(ctx).CoreRatingGetItemRatingsRequest(coreRatingGetItemRatingsRequest).Execute()

Retrieve all the ratings for an item.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreRatingGetItemRatingsRequest := *openapiclient.NewCoreRatingGetItemRatingsRequest("Component_example", "Contextlevel_example", int32(123), int32(123), "Ratingarea_example", int32(123), "Sort_example") // CoreRatingGetItemRatingsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreRatingGetItemRatings(context.Background()).CoreRatingGetItemRatingsRequest(coreRatingGetItemRatingsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreRatingGetItemRatings``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreRatingGetItemRatings`: CoreRatingGetItemRatings200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreRatingGetItemRatings`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreRatingGetItemRatingsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreRatingGetItemRatingsRequest** | [**CoreRatingGetItemRatingsRequest**](CoreRatingGetItemRatingsRequest.md) |  | 

### Return type

[**CoreRatingGetItemRatings200Response**](CoreRatingGetItemRatings200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderAudiencesDelete

> map[string]interface{} CoreReportbuilderAudiencesDelete(ctx).CoreReportbuilderAudiencesDeleteRequest(coreReportbuilderAudiencesDeleteRequest).Execute()

Delete audience from report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderAudiencesDeleteRequest := *openapiclient.NewCoreReportbuilderAudiencesDeleteRequest(int32(123), int32(123)) // CoreReportbuilderAudiencesDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderAudiencesDelete(context.Background()).CoreReportbuilderAudiencesDeleteRequest(coreReportbuilderAudiencesDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderAudiencesDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderAudiencesDelete`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderAudiencesDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderAudiencesDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderAudiencesDeleteRequest** | [**CoreReportbuilderAudiencesDeleteRequest**](CoreReportbuilderAudiencesDeleteRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderCanViewSystemReport

> map[string]interface{} CoreReportbuilderCanViewSystemReport(ctx).CoreReportbuilderCanViewSystemReportRequest(coreReportbuilderCanViewSystemReportRequest).Execute()

Determine access to a system report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderCanViewSystemReportRequest := *openapiclient.NewCoreReportbuilderCanViewSystemReportRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext(), "Source_example") // CoreReportbuilderCanViewSystemReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderCanViewSystemReport(context.Background()).CoreReportbuilderCanViewSystemReportRequest(coreReportbuilderCanViewSystemReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderCanViewSystemReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderCanViewSystemReport`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderCanViewSystemReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderCanViewSystemReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderCanViewSystemReportRequest** | [**CoreReportbuilderCanViewSystemReportRequest**](CoreReportbuilderCanViewSystemReportRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsAdd

> CoreReportbuilderColumnsAdd200Response CoreReportbuilderColumnsAdd(ctx).CoreReportbuilderColumnsAddRequest(coreReportbuilderColumnsAddRequest).Execute()

Add column to report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsAddRequest := *openapiclient.NewCoreReportbuilderColumnsAddRequest(int32(123), "Uniqueidentifier_example") // CoreReportbuilderColumnsAddRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsAdd(context.Background()).CoreReportbuilderColumnsAddRequest(coreReportbuilderColumnsAddRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsAdd``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsAdd`: CoreReportbuilderColumnsAdd200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsAddRequest** | [**CoreReportbuilderColumnsAddRequest**](CoreReportbuilderColumnsAddRequest.md) |  | 

### Return type

[**CoreReportbuilderColumnsAdd200Response**](CoreReportbuilderColumnsAdd200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsDelete

> CoreReportbuilderColumnsDelete200Response CoreReportbuilderColumnsDelete(ctx).CoreReportbuilderColumnsDeleteRequest(coreReportbuilderColumnsDeleteRequest).Execute()

Delete column from report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsDeleteRequest := *openapiclient.NewCoreReportbuilderColumnsDeleteRequest(int32(123), int32(123)) // CoreReportbuilderColumnsDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsDelete(context.Background()).CoreReportbuilderColumnsDeleteRequest(coreReportbuilderColumnsDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsDelete`: CoreReportbuilderColumnsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsDeleteRequest** | [**CoreReportbuilderColumnsDeleteRequest**](CoreReportbuilderColumnsDeleteRequest.md) |  | 

### Return type

[**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsReorder

> map[string]interface{} CoreReportbuilderColumnsReorder(ctx).CoreReportbuilderColumnsReorderRequest(coreReportbuilderColumnsReorderRequest).Execute()

Re-order column within report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsReorderRequest := *openapiclient.NewCoreReportbuilderColumnsReorderRequest(int32(123), int32(123), int32(123)) // CoreReportbuilderColumnsReorderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsReorder(context.Background()).CoreReportbuilderColumnsReorderRequest(coreReportbuilderColumnsReorderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsReorder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsReorder`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsReorder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsReorderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsReorderRequest** | [**CoreReportbuilderColumnsReorderRequest**](CoreReportbuilderColumnsReorderRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsSortGet

> CoreReportbuilderColumnsDelete200Response CoreReportbuilderColumnsSortGet(ctx).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()

Retrieve column sorting for report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortGetRequest := *openapiclient.NewCoreReportbuilderColumnsSortGetRequest(int32(123)) // CoreReportbuilderColumnsSortGetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsSortGet(context.Background()).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsSortGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsSortGet`: CoreReportbuilderColumnsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsSortGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsSortGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortGetRequest** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | 

### Return type

[**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsSortReorder

> CoreReportbuilderColumnsDelete200Response CoreReportbuilderColumnsSortReorder(ctx).CoreReportbuilderColumnsSortReorderRequest(coreReportbuilderColumnsSortReorderRequest).Execute()

Re-order column sorting within report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortReorderRequest := *openapiclient.NewCoreReportbuilderColumnsSortReorderRequest(int32(123), int32(123), int32(123)) // CoreReportbuilderColumnsSortReorderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsSortReorder(context.Background()).CoreReportbuilderColumnsSortReorderRequest(coreReportbuilderColumnsSortReorderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsSortReorder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsSortReorder`: CoreReportbuilderColumnsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsSortReorder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsSortReorderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortReorderRequest** | [**CoreReportbuilderColumnsSortReorderRequest**](CoreReportbuilderColumnsSortReorderRequest.md) |  | 

### Return type

[**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderColumnsSortToggle

> CoreReportbuilderColumnsDelete200Response CoreReportbuilderColumnsSortToggle(ctx).CoreReportbuilderColumnsSortToggleRequest(coreReportbuilderColumnsSortToggleRequest).Execute()

Toggle sorting of column within report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortToggleRequest := *openapiclient.NewCoreReportbuilderColumnsSortToggleRequest(int32(123), false, int32(123)) // CoreReportbuilderColumnsSortToggleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderColumnsSortToggle(context.Background()).CoreReportbuilderColumnsSortToggleRequest(coreReportbuilderColumnsSortToggleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderColumnsSortToggle``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderColumnsSortToggle`: CoreReportbuilderColumnsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderColumnsSortToggle`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderColumnsSortToggleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortToggleRequest** | [**CoreReportbuilderColumnsSortToggleRequest**](CoreReportbuilderColumnsSortToggleRequest.md) |  | 

### Return type

[**CoreReportbuilderColumnsDelete200Response**](CoreReportbuilderColumnsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderConditionsAdd

> CoreReportbuilderConditionsAdd200Response CoreReportbuilderConditionsAdd(ctx).CoreReportbuilderConditionsAddRequest(coreReportbuilderConditionsAddRequest).Execute()

Add condition to report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderConditionsAddRequest := *openapiclient.NewCoreReportbuilderConditionsAddRequest(int32(123), "Uniqueidentifier_example") // CoreReportbuilderConditionsAddRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderConditionsAdd(context.Background()).CoreReportbuilderConditionsAddRequest(coreReportbuilderConditionsAddRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderConditionsAdd``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderConditionsAdd`: CoreReportbuilderConditionsAdd200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderConditionsAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderConditionsAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderConditionsAddRequest** | [**CoreReportbuilderConditionsAddRequest**](CoreReportbuilderConditionsAddRequest.md) |  | 

### Return type

[**CoreReportbuilderConditionsAdd200Response**](CoreReportbuilderConditionsAdd200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderConditionsDelete

> CoreReportbuilderConditionsDelete200Response CoreReportbuilderConditionsDelete(ctx).CoreReportbuilderConditionsDeleteRequest(coreReportbuilderConditionsDeleteRequest).Execute()

Delete condition from report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderConditionsDeleteRequest := *openapiclient.NewCoreReportbuilderConditionsDeleteRequest(int32(123), int32(123)) // CoreReportbuilderConditionsDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderConditionsDelete(context.Background()).CoreReportbuilderConditionsDeleteRequest(coreReportbuilderConditionsDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderConditionsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderConditionsDelete`: CoreReportbuilderConditionsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderConditionsDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderConditionsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderConditionsDeleteRequest** | [**CoreReportbuilderConditionsDeleteRequest**](CoreReportbuilderConditionsDeleteRequest.md) |  | 

### Return type

[**CoreReportbuilderConditionsDelete200Response**](CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderConditionsReorder

> CoreReportbuilderConditionsDelete200Response CoreReportbuilderConditionsReorder(ctx).CoreReportbuilderConditionsReorderRequest(coreReportbuilderConditionsReorderRequest).Execute()

Re-order condition within report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderConditionsReorderRequest := *openapiclient.NewCoreReportbuilderConditionsReorderRequest(int32(123), int32(123), int32(123)) // CoreReportbuilderConditionsReorderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderConditionsReorder(context.Background()).CoreReportbuilderConditionsReorderRequest(coreReportbuilderConditionsReorderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderConditionsReorder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderConditionsReorder`: CoreReportbuilderConditionsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderConditionsReorder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderConditionsReorderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderConditionsReorderRequest** | [**CoreReportbuilderConditionsReorderRequest**](CoreReportbuilderConditionsReorderRequest.md) |  | 

### Return type

[**CoreReportbuilderConditionsDelete200Response**](CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderConditionsReset

> CoreReportbuilderConditionsDelete200Response CoreReportbuilderConditionsReset(ctx).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()

Reset conditions for given report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortGetRequest := *openapiclient.NewCoreReportbuilderColumnsSortGetRequest(int32(123)) // CoreReportbuilderColumnsSortGetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderConditionsReset(context.Background()).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderConditionsReset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderConditionsReset`: CoreReportbuilderConditionsDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderConditionsReset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderConditionsResetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortGetRequest** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | 

### Return type

[**CoreReportbuilderConditionsDelete200Response**](CoreReportbuilderConditionsDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderFiltersAdd

> CoreReportbuilderFiltersAdd200Response CoreReportbuilderFiltersAdd(ctx).CoreReportbuilderFiltersAddRequest(coreReportbuilderFiltersAddRequest).Execute()

Add filter to report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderFiltersAddRequest := *openapiclient.NewCoreReportbuilderFiltersAddRequest(int32(123), "Uniqueidentifier_example") // CoreReportbuilderFiltersAddRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderFiltersAdd(context.Background()).CoreReportbuilderFiltersAddRequest(coreReportbuilderFiltersAddRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderFiltersAdd``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderFiltersAdd`: CoreReportbuilderFiltersAdd200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderFiltersAdd`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderFiltersAddRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderFiltersAddRequest** | [**CoreReportbuilderFiltersAddRequest**](CoreReportbuilderFiltersAddRequest.md) |  | 

### Return type

[**CoreReportbuilderFiltersAdd200Response**](CoreReportbuilderFiltersAdd200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderFiltersDelete

> CoreReportbuilderFiltersDelete200Response CoreReportbuilderFiltersDelete(ctx).CoreReportbuilderFiltersDeleteRequest(coreReportbuilderFiltersDeleteRequest).Execute()

Delete filter from report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderFiltersDeleteRequest := *openapiclient.NewCoreReportbuilderFiltersDeleteRequest(int32(123), int32(123)) // CoreReportbuilderFiltersDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderFiltersDelete(context.Background()).CoreReportbuilderFiltersDeleteRequest(coreReportbuilderFiltersDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderFiltersDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderFiltersDelete`: CoreReportbuilderFiltersDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderFiltersDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderFiltersDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderFiltersDeleteRequest** | [**CoreReportbuilderFiltersDeleteRequest**](CoreReportbuilderFiltersDeleteRequest.md) |  | 

### Return type

[**CoreReportbuilderFiltersDelete200Response**](CoreReportbuilderFiltersDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderFiltersReorder

> CoreReportbuilderFiltersDelete200Response CoreReportbuilderFiltersReorder(ctx).CoreReportbuilderFiltersReorderRequest(coreReportbuilderFiltersReorderRequest).Execute()

Re-order filter within report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderFiltersReorderRequest := *openapiclient.NewCoreReportbuilderFiltersReorderRequest(int32(123), int32(123), int32(123)) // CoreReportbuilderFiltersReorderRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderFiltersReorder(context.Background()).CoreReportbuilderFiltersReorderRequest(coreReportbuilderFiltersReorderRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderFiltersReorder``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderFiltersReorder`: CoreReportbuilderFiltersDelete200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderFiltersReorder`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderFiltersReorderRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderFiltersReorderRequest** | [**CoreReportbuilderFiltersReorderRequest**](CoreReportbuilderFiltersReorderRequest.md) |  | 

### Return type

[**CoreReportbuilderFiltersDelete200Response**](CoreReportbuilderFiltersDelete200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderFiltersReset

> map[string]interface{} CoreReportbuilderFiltersReset(ctx).CoreReportbuilderFiltersResetRequest(coreReportbuilderFiltersResetRequest).Execute()

Reset filters for given report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderFiltersResetRequest := *openapiclient.NewCoreReportbuilderFiltersResetRequest(int32(123)) // CoreReportbuilderFiltersResetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderFiltersReset(context.Background()).CoreReportbuilderFiltersResetRequest(coreReportbuilderFiltersResetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderFiltersReset``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderFiltersReset`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderFiltersReset`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderFiltersResetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderFiltersResetRequest** | [**CoreReportbuilderFiltersResetRequest**](CoreReportbuilderFiltersResetRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderListReports

> CoreReportbuilderListReports200Response CoreReportbuilderListReports(ctx).CoreReportbuilderListReportsRequest(coreReportbuilderListReportsRequest).Execute()

List custom reports for current user



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderListReportsRequest := *openapiclient.NewCoreReportbuilderListReportsRequest() // CoreReportbuilderListReportsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderListReports(context.Background()).CoreReportbuilderListReportsRequest(coreReportbuilderListReportsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderListReports``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderListReports`: CoreReportbuilderListReports200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderListReports`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderListReportsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderListReportsRequest** | [**CoreReportbuilderListReportsRequest**](CoreReportbuilderListReportsRequest.md) |  | 

### Return type

[**CoreReportbuilderListReports200Response**](CoreReportbuilderListReports200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderReportsDelete

> map[string]interface{} CoreReportbuilderReportsDelete(ctx).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()

Delete report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortGetRequest := *openapiclient.NewCoreReportbuilderColumnsSortGetRequest(int32(123)) // CoreReportbuilderColumnsSortGetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderReportsDelete(context.Background()).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderReportsDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderReportsDelete`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderReportsDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderReportsDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortGetRequest** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderReportsGet

> CoreReportbuilderReportsGet200Response CoreReportbuilderReportsGet(ctx).CoreReportbuilderReportsGetRequest(coreReportbuilderReportsGetRequest).Execute()

Get custom report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderReportsGetRequest := *openapiclient.NewCoreReportbuilderReportsGetRequest(int32(123)) // CoreReportbuilderReportsGetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderReportsGet(context.Background()).CoreReportbuilderReportsGetRequest(coreReportbuilderReportsGetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderReportsGet``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderReportsGet`: CoreReportbuilderReportsGet200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderReportsGet`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderReportsGetRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderReportsGetRequest** | [**CoreReportbuilderReportsGetRequest**](CoreReportbuilderReportsGetRequest.md) |  | 

### Return type

[**CoreReportbuilderReportsGet200Response**](CoreReportbuilderReportsGet200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderRetrieveReport

> CoreReportbuilderRetrieveReport200Response CoreReportbuilderRetrieveReport(ctx).CoreReportbuilderRetrieveReportRequest(coreReportbuilderRetrieveReportRequest).Execute()

Retrieve custom report content



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderRetrieveReportRequest := *openapiclient.NewCoreReportbuilderRetrieveReportRequest(int32(123)) // CoreReportbuilderRetrieveReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderRetrieveReport(context.Background()).CoreReportbuilderRetrieveReportRequest(coreReportbuilderRetrieveReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderRetrieveReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderRetrieveReport`: CoreReportbuilderRetrieveReport200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderRetrieveReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderRetrieveReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderRetrieveReportRequest** | [**CoreReportbuilderRetrieveReportRequest**](CoreReportbuilderRetrieveReportRequest.md) |  | 

### Return type

[**CoreReportbuilderRetrieveReport200Response**](CoreReportbuilderRetrieveReport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderRetrieveSystemReport

> CoreReportbuilderRetrieveSystemReport200Response CoreReportbuilderRetrieveSystemReport(ctx).CoreReportbuilderRetrieveSystemReportRequest(coreReportbuilderRetrieveSystemReportRequest).Execute()

Retrieve system report content



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderRetrieveSystemReportRequest := *openapiclient.NewCoreReportbuilderRetrieveSystemReportRequest(*openapiclient.NewCoreCohortSearchCohortsRequestContext(), "Source_example") // CoreReportbuilderRetrieveSystemReportRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderRetrieveSystemReport(context.Background()).CoreReportbuilderRetrieveSystemReportRequest(coreReportbuilderRetrieveSystemReportRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderRetrieveSystemReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderRetrieveSystemReport`: CoreReportbuilderRetrieveSystemReport200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderRetrieveSystemReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderRetrieveSystemReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderRetrieveSystemReportRequest** | [**CoreReportbuilderRetrieveSystemReportRequest**](CoreReportbuilderRetrieveSystemReportRequest.md) |  | 

### Return type

[**CoreReportbuilderRetrieveSystemReport200Response**](CoreReportbuilderRetrieveSystemReport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderSchedulesDelete

> map[string]interface{} CoreReportbuilderSchedulesDelete(ctx).CoreReportbuilderSchedulesDeleteRequest(coreReportbuilderSchedulesDeleteRequest).Execute()

Delete schedule from report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderSchedulesDeleteRequest := *openapiclient.NewCoreReportbuilderSchedulesDeleteRequest(int32(123), int32(123)) // CoreReportbuilderSchedulesDeleteRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderSchedulesDelete(context.Background()).CoreReportbuilderSchedulesDeleteRequest(coreReportbuilderSchedulesDeleteRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderSchedulesDelete``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderSchedulesDelete`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderSchedulesDelete`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderSchedulesDeleteRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderSchedulesDeleteRequest** | [**CoreReportbuilderSchedulesDeleteRequest**](CoreReportbuilderSchedulesDeleteRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderSchedulesSend

> map[string]interface{} CoreReportbuilderSchedulesSend(ctx).CoreReportbuilderSchedulesSendRequest(coreReportbuilderSchedulesSendRequest).Execute()

Send report schedule



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderSchedulesSendRequest := *openapiclient.NewCoreReportbuilderSchedulesSendRequest(int32(123), int32(123)) // CoreReportbuilderSchedulesSendRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderSchedulesSend(context.Background()).CoreReportbuilderSchedulesSendRequest(coreReportbuilderSchedulesSendRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderSchedulesSend``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderSchedulesSend`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderSchedulesSend`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderSchedulesSendRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderSchedulesSendRequest** | [**CoreReportbuilderSchedulesSendRequest**](CoreReportbuilderSchedulesSendRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderSchedulesToggle

> map[string]interface{} CoreReportbuilderSchedulesToggle(ctx).CoreReportbuilderSchedulesToggleRequest(coreReportbuilderSchedulesToggleRequest).Execute()

Toggle state of report schedule



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderSchedulesToggleRequest := *openapiclient.NewCoreReportbuilderSchedulesToggleRequest(false, int32(123), int32(123)) // CoreReportbuilderSchedulesToggleRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderSchedulesToggle(context.Background()).CoreReportbuilderSchedulesToggleRequest(coreReportbuilderSchedulesToggleRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderSchedulesToggle``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderSchedulesToggle`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderSchedulesToggle`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderSchedulesToggleRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderSchedulesToggleRequest** | [**CoreReportbuilderSchedulesToggleRequest**](CoreReportbuilderSchedulesToggleRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderSetFilters

> map[string]interface{} CoreReportbuilderSetFilters(ctx).CoreReportbuilderSetFiltersRequest(coreReportbuilderSetFiltersRequest).Execute()

Set filter values for given report



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderSetFiltersRequest := *openapiclient.NewCoreReportbuilderSetFiltersRequest(int32(123), "Values_example") // CoreReportbuilderSetFiltersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderSetFilters(context.Background()).CoreReportbuilderSetFiltersRequest(coreReportbuilderSetFiltersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderSetFilters``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderSetFilters`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderSetFilters`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderSetFiltersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderSetFiltersRequest** | [**CoreReportbuilderSetFiltersRequest**](CoreReportbuilderSetFiltersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreReportbuilderViewReport

> CoreReportbuilderViewReport200Response CoreReportbuilderViewReport(ctx).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()

Trigger custom report viewed



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreReportbuilderColumnsSortGetRequest := *openapiclient.NewCoreReportbuilderColumnsSortGetRequest(int32(123)) // CoreReportbuilderColumnsSortGetRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreReportbuilderViewReport(context.Background()).CoreReportbuilderColumnsSortGetRequest(coreReportbuilderColumnsSortGetRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreReportbuilderViewReport``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreReportbuilderViewReport`: CoreReportbuilderViewReport200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreReportbuilderViewReport`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreReportbuilderViewReportRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreReportbuilderColumnsSortGetRequest** | [**CoreReportbuilderColumnsSortGetRequest**](CoreReportbuilderColumnsSortGetRequest.md) |  | 

### Return type

[**CoreReportbuilderViewReport200Response**](CoreReportbuilderViewReport200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreRoleAssignRoles

> map[string]interface{} CoreRoleAssignRoles(ctx).CoreRoleAssignRolesRequest(coreRoleAssignRolesRequest).Execute()

Manual role assignments.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreRoleAssignRolesRequest := *openapiclient.NewCoreRoleAssignRolesRequest([]openapiclient.CoreRoleAssignRolesRequestAssignmentsInner{*openapiclient.NewCoreRoleAssignRolesRequestAssignmentsInner()}) // CoreRoleAssignRolesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreRoleAssignRoles(context.Background()).CoreRoleAssignRolesRequest(coreRoleAssignRolesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreRoleAssignRoles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreRoleAssignRoles`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreRoleAssignRoles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreRoleAssignRolesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreRoleAssignRolesRequest** | [**CoreRoleAssignRolesRequest**](CoreRoleAssignRolesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreRoleUnassignRoles

> map[string]interface{} CoreRoleUnassignRoles(ctx).CoreRoleUnassignRolesRequest(coreRoleUnassignRolesRequest).Execute()

Manual role unassignments.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreRoleUnassignRolesRequest := *openapiclient.NewCoreRoleUnassignRolesRequest([]openapiclient.CoreRoleUnassignRolesRequestUnassignmentsInner{*openapiclient.NewCoreRoleUnassignRolesRequestUnassignmentsInner()}) // CoreRoleUnassignRolesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreRoleUnassignRoles(context.Background()).CoreRoleUnassignRolesRequest(coreRoleUnassignRolesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreRoleUnassignRoles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreRoleUnassignRoles`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreRoleUnassignRoles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreRoleUnassignRolesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreRoleUnassignRolesRequest** | [**CoreRoleUnassignRolesRequest**](CoreRoleUnassignRolesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSearchGetRelevantUsers

> map[string]interface{} CoreSearchGetRelevantUsers(ctx).CoreSearchGetRelevantUsersRequest(coreSearchGetRelevantUsersRequest).Execute()

Gets relevant users for a search request.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreSearchGetRelevantUsersRequest := *openapiclient.NewCoreSearchGetRelevantUsersRequest(int32(123), "Query_example") // CoreSearchGetRelevantUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSearchGetRelevantUsers(context.Background()).CoreSearchGetRelevantUsersRequest(coreSearchGetRelevantUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSearchGetRelevantUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSearchGetRelevantUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSearchGetRelevantUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreSearchGetRelevantUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreSearchGetRelevantUsersRequest** | [**CoreSearchGetRelevantUsersRequest**](CoreSearchGetRelevantUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSearchGetResults

> CoreSearchGetResults200Response CoreSearchGetResults(ctx).CoreSearchGetResultsRequest(coreSearchGetResultsRequest).Execute()

Get search results.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreSearchGetResultsRequest := *openapiclient.NewCoreSearchGetResultsRequest("Query_example") // CoreSearchGetResultsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSearchGetResults(context.Background()).CoreSearchGetResultsRequest(coreSearchGetResultsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSearchGetResults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSearchGetResults`: CoreSearchGetResults200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSearchGetResults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreSearchGetResultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreSearchGetResultsRequest** | [**CoreSearchGetResultsRequest**](CoreSearchGetResultsRequest.md) |  | 

### Return type

[**CoreSearchGetResults200Response**](CoreSearchGetResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSearchGetSearchAreasList

> CoreSearchGetSearchAreasList200Response CoreSearchGetSearchAreasList(ctx).CoreSearchGetSearchAreasListRequest(coreSearchGetSearchAreasListRequest).Execute()

Get search areas.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreSearchGetSearchAreasListRequest := *openapiclient.NewCoreSearchGetSearchAreasListRequest() // CoreSearchGetSearchAreasListRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSearchGetSearchAreasList(context.Background()).CoreSearchGetSearchAreasListRequest(coreSearchGetSearchAreasListRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSearchGetSearchAreasList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSearchGetSearchAreasList`: CoreSearchGetSearchAreasList200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSearchGetSearchAreasList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreSearchGetSearchAreasListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreSearchGetSearchAreasListRequest** | [**CoreSearchGetSearchAreasListRequest**](CoreSearchGetSearchAreasListRequest.md) |  | 

### Return type

[**CoreSearchGetSearchAreasList200Response**](CoreSearchGetSearchAreasList200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSearchGetTopResults

> CoreSearchGetTopResults200Response CoreSearchGetTopResults(ctx).CoreSearchGetTopResultsRequest(coreSearchGetTopResultsRequest).Execute()

Get top search results.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreSearchGetTopResultsRequest := *openapiclient.NewCoreSearchGetTopResultsRequest("Query_example") // CoreSearchGetTopResultsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSearchGetTopResults(context.Background()).CoreSearchGetTopResultsRequest(coreSearchGetTopResultsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSearchGetTopResults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSearchGetTopResults`: CoreSearchGetTopResults200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSearchGetTopResults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreSearchGetTopResultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreSearchGetTopResultsRequest** | [**CoreSearchGetTopResultsRequest**](CoreSearchGetTopResultsRequest.md) |  | 

### Return type

[**CoreSearchGetTopResults200Response**](CoreSearchGetTopResults200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSearchViewResults

> CoreCalendarDeleteSubscription200Response CoreSearchViewResults(ctx).CoreSearchViewResultsRequest(coreSearchViewResultsRequest).Execute()

Trigger view search results event.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreSearchViewResultsRequest := *openapiclient.NewCoreSearchViewResultsRequest("Query_example") // CoreSearchViewResultsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSearchViewResults(context.Background()).CoreSearchViewResultsRequest(coreSearchViewResultsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSearchViewResults``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSearchViewResults`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSearchViewResults`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreSearchViewResultsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreSearchViewResultsRequest** | [**CoreSearchViewResultsRequest**](CoreSearchViewResultsRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSessionTimeRemaining

> CoreSessionTimeRemaining200Response CoreSessionTimeRemaining(ctx).Execute()

Count the seconds remaining in this session



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSessionTimeRemaining(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSessionTimeRemaining``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSessionTimeRemaining`: CoreSessionTimeRemaining200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSessionTimeRemaining`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreSessionTimeRemainingRequest struct via the builder pattern


### Return type

[**CoreSessionTimeRemaining200Response**](CoreSessionTimeRemaining200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreSessionTouch

> map[string]interface{} CoreSessionTouch(ctx).Execute()

Keep the users session alive



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreSessionTouch(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreSessionTouch``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreSessionTouch`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreSessionTouch`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreSessionTouchRequest struct via the builder pattern


### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTableGetDynamicTableContent

> CoreTableGetDynamicTableContent200Response CoreTableGetDynamicTableContent(ctx).CoreTableGetDynamicTableContentRequest(coreTableGetDynamicTableContentRequest).Execute()

Get the dynamic table content raw html



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTableGetDynamicTableContentRequest := *openapiclient.NewCoreTableGetDynamicTableContentRequest("Component_example", "Firstinitial_example", "Handler_example", []map[string]interface{}{map[string]interface{}(123)}, int32(123), "Lastinitial_example", int32(123), int32(123), false, "Uniqueid_example") // CoreTableGetDynamicTableContentRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTableGetDynamicTableContent(context.Background()).CoreTableGetDynamicTableContentRequest(coreTableGetDynamicTableContentRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTableGetDynamicTableContent``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTableGetDynamicTableContent`: CoreTableGetDynamicTableContent200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTableGetDynamicTableContent`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTableGetDynamicTableContentRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTableGetDynamicTableContentRequest** | [**CoreTableGetDynamicTableContentRequest**](CoreTableGetDynamicTableContentRequest.md) |  | 

### Return type

[**CoreTableGetDynamicTableContent200Response**](CoreTableGetDynamicTableContent200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTagAreas

> CoreTagGetTagAreas200Response CoreTagGetTagAreas(ctx).Execute()

Retrieves existing tag areas.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTagAreas(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTagAreas``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTagAreas`: CoreTagGetTagAreas200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTagAreas`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagAreasRequest struct via the builder pattern


### Return type

[**CoreTagGetTagAreas200Response**](CoreTagGetTagAreas200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTagCloud

> CoreTagGetTagCloud200Response CoreTagGetTagCloud(ctx).CoreTagGetTagCloudRequest(coreTagGetTagCloudRequest).Execute()

Retrieves a tag cloud for the given collection and/or query search.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTagGetTagCloudRequest := *openapiclient.NewCoreTagGetTagCloudRequest() // CoreTagGetTagCloudRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTagCloud(context.Background()).CoreTagGetTagCloudRequest(coreTagGetTagCloudRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTagCloud``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTagCloud`: CoreTagGetTagCloud200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTagCloud`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagCloudRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTagGetTagCloudRequest** | [**CoreTagGetTagCloudRequest**](CoreTagGetTagCloudRequest.md) |  | 

### Return type

[**CoreTagGetTagCloud200Response**](CoreTagGetTagCloud200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTagCollections

> CoreTagGetTagCollections200Response CoreTagGetTagCollections(ctx).Execute()

Retrieves existing tag collections.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTagCollections(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTagCollections``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTagCollections`: CoreTagGetTagCollections200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTagCollections`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagCollectionsRequest struct via the builder pattern


### Return type

[**CoreTagGetTagCollections200Response**](CoreTagGetTagCollections200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTagindex

> CoreTagGetTagindex200Response CoreTagGetTagindex(ctx).CoreTagGetTagindexRequest(coreTagGetTagindexRequest).Execute()

Gets tag index page for one tag and one tag area



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTagGetTagindexRequest := *openapiclient.NewCoreTagGetTagindexRequest(*openapiclient.NewCoreTagGetTagindexRequestTagindex(int32(123), "Tag_example", int32(123))) // CoreTagGetTagindexRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTagindex(context.Background()).CoreTagGetTagindexRequest(coreTagGetTagindexRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTagindex``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTagindex`: CoreTagGetTagindex200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTagindex`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagindexRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTagGetTagindexRequest** | [**CoreTagGetTagindexRequest**](CoreTagGetTagindexRequest.md) |  | 

### Return type

[**CoreTagGetTagindex200Response**](CoreTagGetTagindex200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTagindexPerArea

> map[string]interface{} CoreTagGetTagindexPerArea(ctx).CoreTagGetTagindexPerAreaRequest(coreTagGetTagindexPerAreaRequest).Execute()

Gets tag index page per different areas.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTagGetTagindexPerAreaRequest := *openapiclient.NewCoreTagGetTagindexPerAreaRequest(*openapiclient.NewCoreTagGetTagindexPerAreaRequestTagindex()) // CoreTagGetTagindexPerAreaRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTagindexPerArea(context.Background()).CoreTagGetTagindexPerAreaRequest(coreTagGetTagindexPerAreaRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTagindexPerArea``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTagindexPerArea`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTagindexPerArea`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagindexPerAreaRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTagGetTagindexPerAreaRequest** | [**CoreTagGetTagindexPerAreaRequest**](CoreTagGetTagindexPerAreaRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagGetTags

> CoreTagGetTags200Response CoreTagGetTags(ctx).CoreTagGetTagsRequest(coreTagGetTagsRequest).Execute()

Gets tags by their ids



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTagGetTagsRequest := *openapiclient.NewCoreTagGetTagsRequest([]openapiclient.CoreTagGetTagsRequestTagsInner{*openapiclient.NewCoreTagGetTagsRequestTagsInner()}) // CoreTagGetTagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagGetTags(context.Background()).CoreTagGetTagsRequest(coreTagGetTagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagGetTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagGetTags`: CoreTagGetTags200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagGetTags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagGetTagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTagGetTagsRequest** | [**CoreTagGetTagsRequest**](CoreTagGetTagsRequest.md) |  | 

### Return type

[**CoreTagGetTags200Response**](CoreTagGetTags200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreTagUpdateTags

> CoreCohortAddCohortMembers200Response CoreTagUpdateTags(ctx).CoreTagUpdateTagsRequest(coreTagUpdateTagsRequest).Execute()

Updates tags



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreTagUpdateTagsRequest := *openapiclient.NewCoreTagUpdateTagsRequest([]openapiclient.CoreTagUpdateTagsRequestTagsInner{*openapiclient.NewCoreTagUpdateTagsRequestTagsInner()}) // CoreTagUpdateTagsRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreTagUpdateTags(context.Background()).CoreTagUpdateTagsRequest(coreTagUpdateTagsRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreTagUpdateTags``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreTagUpdateTags`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreTagUpdateTags`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreTagUpdateTagsRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreTagUpdateTagsRequest** | [**CoreTagUpdateTagsRequest**](CoreTagUpdateTagsRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUpdateInplaceEditable

> CoreUpdateInplaceEditable200Response CoreUpdateInplaceEditable(ctx).CoreUpdateInplaceEditableRequest(coreUpdateInplaceEditableRequest).Execute()

Generic service to update title



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUpdateInplaceEditableRequest := *openapiclient.NewCoreUpdateInplaceEditableRequest("Component_example", "Itemid_example", "Itemtype_example", "Value_example") // CoreUpdateInplaceEditableRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUpdateInplaceEditable(context.Background()).CoreUpdateInplaceEditableRequest(coreUpdateInplaceEditableRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUpdateInplaceEditable``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUpdateInplaceEditable`: CoreUpdateInplaceEditable200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUpdateInplaceEditable`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUpdateInplaceEditableRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUpdateInplaceEditableRequest** | [**CoreUpdateInplaceEditableRequest**](CoreUpdateInplaceEditableRequest.md) |  | 

### Return type

[**CoreUpdateInplaceEditable200Response**](CoreUpdateInplaceEditable200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserAddUserDevice

> map[string]interface{} CoreUserAddUserDevice(ctx).CoreUserAddUserDeviceRequest(coreUserAddUserDeviceRequest).Execute()

Store mobile user devices information for PUSH Notifications.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserAddUserDeviceRequest := *openapiclient.NewCoreUserAddUserDeviceRequest("Appid_example", "Model_example", "Name_example", "Platform_example", "Pushid_example", "Uuid_example", "Version_example") // CoreUserAddUserDeviceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserAddUserDevice(context.Background()).CoreUserAddUserDeviceRequest(coreUserAddUserDeviceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserAddUserDevice``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserAddUserDevice`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserAddUserDevice`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserAddUserDeviceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserAddUserDeviceRequest** | [**CoreUserAddUserDeviceRequest**](CoreUserAddUserDeviceRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserAddUserPrivateFiles

> map[string]interface{} CoreUserAddUserPrivateFiles(ctx).CoreUserAddUserPrivateFilesRequest(coreUserAddUserPrivateFilesRequest).Execute()

Copy files from a draft area to users private files area.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserAddUserPrivateFilesRequest := *openapiclient.NewCoreUserAddUserPrivateFilesRequest(int32(123)) // CoreUserAddUserPrivateFilesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserAddUserPrivateFiles(context.Background()).CoreUserAddUserPrivateFilesRequest(coreUserAddUserPrivateFilesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserAddUserPrivateFiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserAddUserPrivateFiles`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserAddUserPrivateFiles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserAddUserPrivateFilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserAddUserPrivateFilesRequest** | [**CoreUserAddUserPrivateFilesRequest**](CoreUserAddUserPrivateFilesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserAgreeSitePolicy

> CoreUserAgreeSitePolicy200Response CoreUserAgreeSitePolicy(ctx).Execute()

Agree the site policy for the current user.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserAgreeSitePolicy(context.Background()).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserAgreeSitePolicy``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserAgreeSitePolicy`: CoreUserAgreeSitePolicy200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserAgreeSitePolicy`: %v\n", resp)
}
```

### Path Parameters

This endpoint does not need any parameter.

### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserAgreeSitePolicyRequest struct via the builder pattern


### Return type

[**CoreUserAgreeSitePolicy200Response**](CoreUserAgreeSitePolicy200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserCreateUsers

> map[string]interface{} CoreUserCreateUsers(ctx).CoreUserCreateUsersRequest(coreUserCreateUsersRequest).Execute()

Create users.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserCreateUsersRequest := *openapiclient.NewCoreUserCreateUsersRequest([]openapiclient.CoreUserCreateUsersRequestUsersInner{*openapiclient.NewCoreUserCreateUsersRequestUsersInner()}) // CoreUserCreateUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserCreateUsers(context.Background()).CoreUserCreateUsersRequest(coreUserCreateUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserCreateUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserCreateUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserCreateUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserCreateUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserCreateUsersRequest** | [**CoreUserCreateUsersRequest**](CoreUserCreateUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserDeleteUsers

> map[string]interface{} CoreUserDeleteUsers(ctx).CoreUserDeleteUsersRequest(coreUserDeleteUsersRequest).Execute()

Delete users.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserDeleteUsersRequest := *openapiclient.NewCoreUserDeleteUsersRequest([]map[string]interface{}{map[string]interface{}(123)}) // CoreUserDeleteUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserDeleteUsers(context.Background()).CoreUserDeleteUsersRequest(coreUserDeleteUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserDeleteUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserDeleteUsers`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserDeleteUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserDeleteUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserDeleteUsersRequest** | [**CoreUserDeleteUsersRequest**](CoreUserDeleteUsersRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserGetCourseUserProfiles

> map[string]interface{} CoreUserGetCourseUserProfiles(ctx).CoreUserGetCourseUserProfilesRequest(coreUserGetCourseUserProfilesRequest).Execute()

Get course user profiles (each of the profils matching a course id and a user id),.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserGetCourseUserProfilesRequest := *openapiclient.NewCoreUserGetCourseUserProfilesRequest([]openapiclient.CoreUserGetCourseUserProfilesRequestUserlistInner{*openapiclient.NewCoreUserGetCourseUserProfilesRequestUserlistInner()}) // CoreUserGetCourseUserProfilesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserGetCourseUserProfiles(context.Background()).CoreUserGetCourseUserProfilesRequest(coreUserGetCourseUserProfilesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserGetCourseUserProfiles``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserGetCourseUserProfiles`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserGetCourseUserProfiles`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserGetCourseUserProfilesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserGetCourseUserProfilesRequest** | [**CoreUserGetCourseUserProfilesRequest**](CoreUserGetCourseUserProfilesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserGetPrivateFilesInfo

> CoreUserGetPrivateFilesInfo200Response CoreUserGetPrivateFilesInfo(ctx).CoreUserGetPrivateFilesInfoRequest(coreUserGetPrivateFilesInfoRequest).Execute()

Returns general information about files in the user private files area.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserGetPrivateFilesInfoRequest := *openapiclient.NewCoreUserGetPrivateFilesInfoRequest() // CoreUserGetPrivateFilesInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserGetPrivateFilesInfo(context.Background()).CoreUserGetPrivateFilesInfoRequest(coreUserGetPrivateFilesInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserGetPrivateFilesInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserGetPrivateFilesInfo`: CoreUserGetPrivateFilesInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserGetPrivateFilesInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserGetPrivateFilesInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserGetPrivateFilesInfoRequest** | [**CoreUserGetPrivateFilesInfoRequest**](CoreUserGetPrivateFilesInfoRequest.md) |  | 

### Return type

[**CoreUserGetPrivateFilesInfo200Response**](CoreUserGetPrivateFilesInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserGetUserPreferences

> CoreUserGetUserPreferences200Response CoreUserGetUserPreferences(ctx).CoreUserGetUserPreferencesRequest(coreUserGetUserPreferencesRequest).Execute()

Return user preferences.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserGetUserPreferencesRequest := *openapiclient.NewCoreUserGetUserPreferencesRequest() // CoreUserGetUserPreferencesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserGetUserPreferences(context.Background()).CoreUserGetUserPreferencesRequest(coreUserGetUserPreferencesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserGetUserPreferences``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserGetUserPreferences`: CoreUserGetUserPreferences200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserGetUserPreferences`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserGetUserPreferencesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserGetUserPreferencesRequest** | [**CoreUserGetUserPreferencesRequest**](CoreUserGetUserPreferencesRequest.md) |  | 

### Return type

[**CoreUserGetUserPreferences200Response**](CoreUserGetUserPreferences200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserGetUsers

> CoreUserGetUsers200Response CoreUserGetUsers(ctx).CoreUserGetUsersRequest(coreUserGetUsersRequest).Execute()

search for users matching the parameters



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserGetUsersRequest := *openapiclient.NewCoreUserGetUsersRequest([]openapiclient.CoreUserGetUsersRequestCriteriaInner{*openapiclient.NewCoreUserGetUsersRequestCriteriaInner()}) // CoreUserGetUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserGetUsers(context.Background()).CoreUserGetUsersRequest(coreUserGetUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserGetUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserGetUsers`: CoreUserGetUsers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserGetUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserGetUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserGetUsersRequest** | [**CoreUserGetUsersRequest**](CoreUserGetUsersRequest.md) |  | 

### Return type

[**CoreUserGetUsers200Response**](CoreUserGetUsers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserGetUsersByField

> map[string]interface{} CoreUserGetUsersByField(ctx).CoreUserGetUsersByFieldRequest(coreUserGetUsersByFieldRequest).Execute()

Retrieve users' information for a specified unique field - If you want to do a user search, use core_user_get_users() or core_user_search_identity().



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserGetUsersByFieldRequest := *openapiclient.NewCoreUserGetUsersByFieldRequest("Field_example", []map[string]interface{}{map[string]interface{}(123)}) // CoreUserGetUsersByFieldRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserGetUsersByField(context.Background()).CoreUserGetUsersByFieldRequest(coreUserGetUsersByFieldRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserGetUsersByField``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserGetUsersByField`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserGetUsersByField`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserGetUsersByFieldRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserGetUsersByFieldRequest** | [**CoreUserGetUsersByFieldRequest**](CoreUserGetUsersByFieldRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserRemoveUserDevice

> CoreUserRemoveUserDevice200Response CoreUserRemoveUserDevice(ctx).CoreUserRemoveUserDeviceRequest(coreUserRemoveUserDeviceRequest).Execute()

Remove a user device from the Moodle database.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserRemoveUserDeviceRequest := *openapiclient.NewCoreUserRemoveUserDeviceRequest("Uuid_example") // CoreUserRemoveUserDeviceRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserRemoveUserDevice(context.Background()).CoreUserRemoveUserDeviceRequest(coreUserRemoveUserDeviceRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserRemoveUserDevice``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserRemoveUserDevice`: CoreUserRemoveUserDevice200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserRemoveUserDevice`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserRemoveUserDeviceRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserRemoveUserDeviceRequest** | [**CoreUserRemoveUserDeviceRequest**](CoreUserRemoveUserDeviceRequest.md) |  | 

### Return type

[**CoreUserRemoveUserDevice200Response**](CoreUserRemoveUserDevice200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserSearchIdentity

> CoreUserSearchIdentity200Response CoreUserSearchIdentity(ctx).CoreUserSearchIdentityRequest(coreUserSearchIdentityRequest).Execute()

Return list of users identities matching the given criteria in their name or other identity fields.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserSearchIdentityRequest := *openapiclient.NewCoreUserSearchIdentityRequest("Query_example") // CoreUserSearchIdentityRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserSearchIdentity(context.Background()).CoreUserSearchIdentityRequest(coreUserSearchIdentityRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserSearchIdentity``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserSearchIdentity`: CoreUserSearchIdentity200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserSearchIdentity`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserSearchIdentityRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserSearchIdentityRequest** | [**CoreUserSearchIdentityRequest**](CoreUserSearchIdentityRequest.md) |  | 

### Return type

[**CoreUserSearchIdentity200Response**](CoreUserSearchIdentity200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserSetUserPreferences

> CoreUserSetUserPreferences200Response CoreUserSetUserPreferences(ctx).CoreUserSetUserPreferencesRequest(coreUserSetUserPreferencesRequest).Execute()

Set user preferences.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserSetUserPreferencesRequest := *openapiclient.NewCoreUserSetUserPreferencesRequest([]openapiclient.CoreUserSetUserPreferencesRequestPreferencesInner{*openapiclient.NewCoreUserSetUserPreferencesRequestPreferencesInner()}) // CoreUserSetUserPreferencesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserSetUserPreferences(context.Background()).CoreUserSetUserPreferencesRequest(coreUserSetUserPreferencesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserSetUserPreferences``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserSetUserPreferences`: CoreUserSetUserPreferences200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserSetUserPreferences`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserSetUserPreferencesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserSetUserPreferencesRequest** | [**CoreUserSetUserPreferencesRequest**](CoreUserSetUserPreferencesRequest.md) |  | 

### Return type

[**CoreUserSetUserPreferences200Response**](CoreUserSetUserPreferences200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserUpdatePicture

> CoreUserUpdatePicture200Response CoreUserUpdatePicture(ctx).CoreUserUpdatePictureRequest(coreUserUpdatePictureRequest).Execute()

Update or delete the user picture in the site



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserUpdatePictureRequest := *openapiclient.NewCoreUserUpdatePictureRequest(int32(123)) // CoreUserUpdatePictureRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserUpdatePicture(context.Background()).CoreUserUpdatePictureRequest(coreUserUpdatePictureRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserUpdatePicture``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserUpdatePicture`: CoreUserUpdatePicture200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserUpdatePicture`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserUpdatePictureRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserUpdatePictureRequest** | [**CoreUserUpdatePictureRequest**](CoreUserUpdatePictureRequest.md) |  | 

### Return type

[**CoreUserUpdatePicture200Response**](CoreUserUpdatePicture200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserUpdateUserDevicePublicKey

> CoreUserUpdateUserDevicePublicKey200Response CoreUserUpdateUserDevicePublicKey(ctx).CoreUserUpdateUserDevicePublicKeyRequest(coreUserUpdateUserDevicePublicKeyRequest).Execute()

Store mobile user public key.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserUpdateUserDevicePublicKeyRequest := *openapiclient.NewCoreUserUpdateUserDevicePublicKeyRequest("Appid_example", "Publickey_example", "Uuid_example") // CoreUserUpdateUserDevicePublicKeyRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserUpdateUserDevicePublicKey(context.Background()).CoreUserUpdateUserDevicePublicKeyRequest(coreUserUpdateUserDevicePublicKeyRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserUpdateUserDevicePublicKey``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserUpdateUserDevicePublicKey`: CoreUserUpdateUserDevicePublicKey200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserUpdateUserDevicePublicKey`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserUpdateUserDevicePublicKeyRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserUpdateUserDevicePublicKeyRequest** | [**CoreUserUpdateUserDevicePublicKeyRequest**](CoreUserUpdateUserDevicePublicKeyRequest.md) |  | 

### Return type

[**CoreUserUpdateUserDevicePublicKey200Response**](CoreUserUpdateUserDevicePublicKey200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserUpdateUserPreferences

> map[string]interface{} CoreUserUpdateUserPreferences(ctx).CoreUserUpdateUserPreferencesRequest(coreUserUpdateUserPreferencesRequest).Execute()

Update a user's preferences



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserUpdateUserPreferencesRequest := *openapiclient.NewCoreUserUpdateUserPreferencesRequest() // CoreUserUpdateUserPreferencesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserUpdateUserPreferences(context.Background()).CoreUserUpdateUserPreferencesRequest(coreUserUpdateUserPreferencesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserUpdateUserPreferences``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserUpdateUserPreferences`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserUpdateUserPreferences`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserUpdateUserPreferencesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserUpdateUserPreferencesRequest** | [**CoreUserUpdateUserPreferencesRequest**](CoreUserUpdateUserPreferencesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserUpdateUsers

> CoreCohortAddCohortMembers200Response CoreUserUpdateUsers(ctx).CoreUserUpdateUsersRequest(coreUserUpdateUsersRequest).Execute()

Update users.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserUpdateUsersRequest := *openapiclient.NewCoreUserUpdateUsersRequest([]openapiclient.CoreUserUpdateUsersRequestUsersInner{*openapiclient.NewCoreUserUpdateUsersRequestUsersInner()}) // CoreUserUpdateUsersRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserUpdateUsers(context.Background()).CoreUserUpdateUsersRequest(coreUserUpdateUsersRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserUpdateUsers``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserUpdateUsers`: CoreCohortAddCohortMembers200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserUpdateUsers`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserUpdateUsersRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserUpdateUsersRequest** | [**CoreUserUpdateUsersRequest**](CoreUserUpdateUsersRequest.md) |  | 

### Return type

[**CoreCohortAddCohortMembers200Response**](CoreCohortAddCohortMembers200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserViewUserList

> CoreCalendarDeleteSubscription200Response CoreUserViewUserList(ctx).CoreUserViewUserListRequest(coreUserViewUserListRequest).Execute()

Simulates the web-interface view of user/index.php (triggering events),.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserViewUserListRequest := *openapiclient.NewCoreUserViewUserListRequest(int32(123)) // CoreUserViewUserListRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserViewUserList(context.Background()).CoreUserViewUserListRequest(coreUserViewUserListRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserViewUserList``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserViewUserList`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserViewUserList`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserViewUserListRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserViewUserListRequest** | [**CoreUserViewUserListRequest**](CoreUserViewUserListRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreUserViewUserProfile

> CoreCalendarDeleteSubscription200Response CoreUserViewUserProfile(ctx).CoreUserViewUserProfileRequest(coreUserViewUserProfileRequest).Execute()

Simulates the web-interface view of user/view.php and user/profile.php (triggering events),.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreUserViewUserProfileRequest := *openapiclient.NewCoreUserViewUserProfileRequest(int32(123)) // CoreUserViewUserProfileRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreUserViewUserProfile(context.Background()).CoreUserViewUserProfileRequest(coreUserViewUserProfileRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreUserViewUserProfile``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreUserViewUserProfile`: CoreCalendarDeleteSubscription200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreUserViewUserProfile`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreUserViewUserProfileRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreUserViewUserProfileRequest** | [**CoreUserViewUserProfileRequest**](CoreUserViewUserProfileRequest.md) |  | 

### Return type

[**CoreCalendarDeleteSubscription200Response**](CoreCalendarDeleteSubscription200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreWebserviceGetSiteInfo

> CoreWebserviceGetSiteInfo200Response CoreWebserviceGetSiteInfo(ctx).CoreWebserviceGetSiteInfoRequest(coreWebserviceGetSiteInfoRequest).Execute()

Return some site info / user info / list web service functions



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreWebserviceGetSiteInfoRequest := *openapiclient.NewCoreWebserviceGetSiteInfoRequest() // CoreWebserviceGetSiteInfoRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreWebserviceGetSiteInfo(context.Background()).CoreWebserviceGetSiteInfoRequest(coreWebserviceGetSiteInfoRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreWebserviceGetSiteInfo``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreWebserviceGetSiteInfo`: CoreWebserviceGetSiteInfo200Response
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreWebserviceGetSiteInfo`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreWebserviceGetSiteInfoRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreWebserviceGetSiteInfoRequest** | [**CoreWebserviceGetSiteInfoRequest**](CoreWebserviceGetSiteInfoRequest.md) |  | 

### Return type

[**CoreWebserviceGetSiteInfo200Response**](CoreWebserviceGetSiteInfo200Response.md)

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiDeleteState

> map[string]interface{} CoreXapiDeleteState(ctx).CoreXapiDeleteStateRequest(coreXapiDeleteStateRequest).Execute()

Delete an xAPI state data from an activityId.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiDeleteStateRequest := *openapiclient.NewCoreXapiDeleteStateRequest("ActivityId_example", "Agent_example", "Component_example", "StateId_example") // CoreXapiDeleteStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiDeleteState(context.Background()).CoreXapiDeleteStateRequest(coreXapiDeleteStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiDeleteState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiDeleteState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiDeleteState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiDeleteStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiDeleteStateRequest** | [**CoreXapiDeleteStateRequest**](CoreXapiDeleteStateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiDeleteStates

> map[string]interface{} CoreXapiDeleteStates(ctx).CoreXapiDeleteStatesRequest(coreXapiDeleteStatesRequest).Execute()

Delete all xAPI state data from an activityId.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiDeleteStatesRequest := *openapiclient.NewCoreXapiDeleteStatesRequest("ActivityId_example", "Agent_example", "Component_example") // CoreXapiDeleteStatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiDeleteStates(context.Background()).CoreXapiDeleteStatesRequest(coreXapiDeleteStatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiDeleteStates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiDeleteStates`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiDeleteStates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiDeleteStatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiDeleteStatesRequest** | [**CoreXapiDeleteStatesRequest**](CoreXapiDeleteStatesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiGetState

> map[string]interface{} CoreXapiGetState(ctx).CoreXapiGetStateRequest(coreXapiGetStateRequest).Execute()

Get an xAPI state data from an activityId.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiGetStateRequest := *openapiclient.NewCoreXapiGetStateRequest("ActivityId_example", "Agent_example", "Component_example", "StateId_example") // CoreXapiGetStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiGetState(context.Background()).CoreXapiGetStateRequest(coreXapiGetStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiGetState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiGetState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiGetState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiGetStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiGetStateRequest** | [**CoreXapiGetStateRequest**](CoreXapiGetStateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiGetStates

> map[string]interface{} CoreXapiGetStates(ctx).CoreXapiGetStatesRequest(coreXapiGetStatesRequest).Execute()

Get all state ID from an activityId.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiGetStatesRequest := *openapiclient.NewCoreXapiGetStatesRequest("ActivityId_example", "Agent_example", "Component_example") // CoreXapiGetStatesRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiGetStates(context.Background()).CoreXapiGetStatesRequest(coreXapiGetStatesRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiGetStates``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiGetStates`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiGetStates`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiGetStatesRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiGetStatesRequest** | [**CoreXapiGetStatesRequest**](CoreXapiGetStatesRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiPostState

> map[string]interface{} CoreXapiPostState(ctx).CoreXapiPostStateRequest(coreXapiPostStateRequest).Execute()

Post an xAPI state into an activityId.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiPostStateRequest := *openapiclient.NewCoreXapiPostStateRequest("ActivityId_example", "Agent_example", "Component_example", "StateData_example", "StateId_example") // CoreXapiPostStateRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiPostState(context.Background()).CoreXapiPostStateRequest(coreXapiPostStateRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiPostState``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiPostState`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiPostState`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiPostStateRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiPostStateRequest** | [**CoreXapiPostStateRequest**](CoreXapiPostStateRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)


## CoreXapiStatementPost

> map[string]interface{} CoreXapiStatementPost(ctx).CoreXapiStatementPostRequest(coreXapiStatementPostRequest).Execute()

Post an xAPI statement.



### Example

```go
package main

import (
	"context"
	"fmt"
	"os"
	openapiclient "github.com/joshuapare/moodle-client-go"
)

func main() {
	coreXapiStatementPostRequest := *openapiclient.NewCoreXapiStatementPostRequest("Component_example", "Requestjson_example") // CoreXapiStatementPostRequest | 

	configuration := openapiclient.NewConfiguration()
	apiClient := openapiclient.NewAPIClient(configuration)
	resp, r, err := apiClient.MoodleAPI.CoreXapiStatementPost(context.Background()).CoreXapiStatementPostRequest(coreXapiStatementPostRequest).Execute()
	if err != nil {
		fmt.Fprintf(os.Stderr, "Error when calling `MoodleAPI.CoreXapiStatementPost``: %v\n", err)
		fmt.Fprintf(os.Stderr, "Full HTTP response: %v\n", r)
	}
	// response from `CoreXapiStatementPost`: map[string]interface{}
	fmt.Fprintf(os.Stdout, "Response from `MoodleAPI.CoreXapiStatementPost`: %v\n", resp)
}
```

### Path Parameters



### Other Parameters

Other parameters are passed through a pointer to a apiCoreXapiStatementPostRequest struct via the builder pattern


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **coreXapiStatementPostRequest** | [**CoreXapiStatementPostRequest**](CoreXapiStatementPostRequest.md) |  | 

### Return type

**map[string]interface{}**

### Authorization

[apiKey](../README.md#apiKey)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints)
[[Back to Model list]](../README.md#documentation-for-models)
[[Back to README]](../README.md)

